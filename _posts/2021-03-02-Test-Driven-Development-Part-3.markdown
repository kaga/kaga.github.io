---
layout: post
title:  "How Test Driven Development Drives Better Design"
date:   2021-03-02 02:05:49 +1300
categories: TDD
tags: unit-test
---

This is a multi-part series on Test Driven Development.

* [Part 1 - Write Unit Test to Discover Mistakes]({% post_url 2021-02-21-Test-Driven-Development %})
* [Part 2 - Write Unit Test to Design]({% post_url 2021-02-25-Test-Driven-Development-Part-2 %})
* [Part 3 - How Test Driven Development Drive Better Design (You are here)]({% post_url 2021-03-02-Test-Driven-Development-Part-3 %})

## The Road So Far

For the first 2 parts I have been focusing on the mechanics of Test Driven Development. It is like learning to drive, where you keep practicing throttle and brake applications, so you can drive on the road.

It doesn't matter if the code base is new or existing, once getting comfortable writing unit tests to reduce making the mistakes in production environment and documenting behaviors. We can going one step further to explore more possibilities.

This time, we are going to explore using TDD to give a pleasant development experience. It is like learning to apply the pedals to start and stop so gently for passenger comfort.

As you have seen previously, I am once again redefining Test Driven Development.

> \+ Test Driven Development is writing small programs to record the desire behavior.
>
> \+ Test Driven Development is about writing unit test to document the expected inputs & outputs for a module.
>
> \+ Test Driven Development uses unit test as a technique to design software in a sustainable way.

## Test Driven Development to Drive Better Design

![Clean Code - WTF](/assets/test-driven-development/clean-code-wtf.png)

I personally liked the WTFs/Minute metric in [Robert C. Martin's Clean Code](https://www.oreilly.com/library/view/clean-code-a/9780136083238/) to measure a good software design. But let's use J.Brains's [4 elements of simple design](https://blog.jbrains.ca/permalink/the-four-elements-of-simple-design) as a concrete starting point.

> 1. ~~Passes its tests~~
> 1. Minimizes duplication
> 1. Maximizes clarity
> 1. ~~Has fewer elements~~

### Creating Modular Design

One way and a common way to achieve this goal of simple design is breaking a solution down into many modules.

One can use **Single-Responsibility Principle** to guide their decisions. With clear separation of between modules, this Top-down approach can work well in different situations, from creating an online shopping platform down to a single mobile application.

Here is an overview of how I design a typical mobile application, which connects to external service.

```bash
               +-------------------+
               |                   |
               |        UI         |
               |                   |
               +---------|---------+
                         |
                         |
               +---------|---------+
               |                   |
               |     Repository    |
               |     ( Repo )      |
               |                   |
               +------------\------+
              -------/       -------\
+------------/------+         +-------------------+
|                   |         |                   |
|    Mock Repo      |         |    Network Repo   |
|                   |         |                   |
+-------------------+         +---------|---------+
                                        |
                              +---------|---------+
                              |                   |
                              |   HTTP Library    |
                              |                   |
                              +-------------------+
```

The **UI module** is free to utilized any latest and greatest patterns, such as ~~Massive~~ Model View Controller, Model-view-viewmodel. The **Repository** can help ease UI development. It lets the UI layer focusing providing the best user experience and abstract away the complicated business logics.

**Mock Repo** is especially useful at early stages of a project, to test different possible states of an UI - Initial, Loading, Loaded, Error, and provide an opportunity to show case the user interface well before the whole solution is implemented. Once the solution is completed and delivered, this **Mock Repo** also serve as a safe place to explore.

The **HTTP Library** is interesting and important in this case. I could have simplify the diagram above by combining **Network Repo** and **HTTP Library**. Let's see why I didn't.

### Creating Stable Modules From the Ground Up

In this example, the **HTTP Library** handles all the complexity of making a request, such as URL request generation, CSRF token validation, authentication, request optimization etc. It helps abstract away the complexity of making HTTP requests. The **Network Repo** is simply piecing different REST APIs together.

By creating layers of abstraction so we can put more focus on the higher level of abstractions, and eventually free up our capacity to interact with customer.

### Test Driven Development Can Help

When using TDD to just focusing on discover mistakes earlier and documenting the module. I found it easy to miss out some elements, in terms of inputs and outputs, that connect modules together.

Let's review and update the location formatter example mentioned in Part 1 & 2.

```kotlin
//LocationFormatterTest.kt

@Test
fun `Format Valid Location in XX-XX-XX-XX-XX`() {
    lateinit var formatter: LocationFormatter
    val location = Location("1212121212")
    assertThat(formatter.format(location))
        .isEqualTo("12-12-12-12-12")
}

//LocationFormatter.kt

interface LocationFormatter {
    fun format(location: Location): String
}

data class Location(val value: String)

```

I have first started writing the test case above to documented the expected behavior as well as the intended usage, and only implemented the absolute minimum to review the newly created design.

The nature of minimum effort allow us to focus more on:

* The responsibility for that method / class / module
* The expected usage
* Select appropriate software design patterns
* Reviewing the choice of name for clarity
* Inspecting any leaky abstractions

I think it is the place where the [SOLID principles](https://en.wikipedia.org/wiki/SOLID) come to shine.

In this example, I have made a decision to separate the responsibilities of parsing and formatting the location. It was a good start, but when looking deeper into handling all different situations, such as invalid location, the design does not seems to be ideal anymore.

```kotlin
@Test
fun `should return 'Not Available' on invalid data`() {
    lateinit var formatter: LocationFormatter
    val text = "invalid-location".toLocationOrNull()?.let {
        formatter.format(it)
    } ?: "Not Available"
    assertThat(text).isEqualTo("Not Available")
}

fun String.toLocationOrNull(): Location?
```

The invalid location test case unveil the initial design that:

* It uses null to represent **Invalid Location**
* **Duplications** in handling invalid location when in use

This quick feedback cycles help improve the design in short amount of time. It is like compressing years of development in few key stokes.

### Top-Down vs Bottom-Up

When I first started using TDD to drive design, I used to prefer a top-down approach, and staring at the test for long period of time thinking really hard about the public interface design.

Later I started writing more tests to demonstrate different scenarios, just like this example. Sometimes it is faster and create enough examples to get a good design.

In other times, I would stop the top-down thinking and start building the module from the ground up. With enough unit test and continuous refactoring, I found this bottom-up approach embrace the idea of **evolutionary design**, and produce the same if not better results.

I am probably not the first one to say it, but I think TDD also short for **Test Driven Design**.

This is the revised test case and design after another iteration, which addressed both issues mentioned above. From this point, I am quite confident to revise the design according to new requirements.

```kotlin
@Test
fun `Format Valid Location in XX-XX-XX-XX-XX`() {
    lateinit var formatter: LocationFormatter
    val location = "1212121212".toLocation()
    assertThat(formatter.format(location))
        .isEqualTo("12-12-12-12-12")
}

@Test
fun `Print 'Not Available' for Invalid location`() {
    lateinit var formatter: LocationFormatter
    val location = "invalid-location".toLocation()
    assertThat(formatter.format(location))
        .isEqualTo("Not Available")
}

sealed class Location {
    class Valid(val location: String) : Location()
    object Invalid : Location()
}

fun String.toLocation(): Location {
    val locationRawFormat = replace("-", "")
    return when {
        locationRawFormat.toIntOrNull() != null ->
            Location.Valid(location = locationRawFormat)
        else -> Location.Invalid
    }
}
```

### ["Zero integrated test to show the correctness of your code"](https://youtu.be/VDfX44fZoMc?t=3837)

```bash
+----------------------------------------------------+
|  +----------------------------------------------+  |
|  |                                              |  |
|  |                                              |  |
|  |                                              |  |
|  |                                              |  |
|  |                                              |  |
|  |                                              |  |
|  |                  Unit Test                   |  |
|  |                                              |  |
|  |                                              |  |
|  |                                              |  |
|  |                                              |  |
|  |                                              |  |
|  |                                              |  |
|  |                                              |  |
|  +----------------------------------------------+  |
|                 Integration Test                   |
+----------------------------------------------------+
```

At last, going back to the first point of simple design. A good design for me is about putting even more emphasis in unit testing. Test should become easier to write and fast to run.

The quote was not about not writing a single integration test because it is a **"Scam"**. It is about using unit test to show the correctness of the program.

This ever thinner layer of integration test is very useful if not necessary to make sure external systems, such as a REST API service implemented by a contractor, honour the agreed contract.

## That's It

This is my integration on Test Driven Development with 3 areas of focus. This work is not original and heavily inspired by talks given by J. B. Rainsberger.

## Reference

* [Integrated Test Are a Scam](https://www.youtube.com/watch?v=VDfX44fZoMc)
* [Some Underrated Elements Of Success For the Modern Programmer](https://www.youtube.com/watch?v=mbcV_Qdb7Ts)
