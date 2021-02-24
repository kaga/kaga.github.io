---
layout: post
title:  "\"Test Driven Development isn't About Testing\""
date:   2021-02-25 03:05:49 +1300
categories: TDD
tags: unit-test
---

This title is common used as a title in Test Driven Development articles. Such as [this one](https://blog.jbrains.ca/permalink/tdd-isnt-about-testing-revisited).

I have even said it many times in the past too, but it is important not to say it in a condescending way. 

i.e.
> ~~Test Driven Development isn't about Testing, you idiot!~~

This is a multi-part series on Test Driven Development.

* [Part 1 - Write Unit Test to Discover Mistakes]({% post_url 2021-02-21-Test-Driven-Development %})
* [Part 2 - Write Unit Test to Design (You are here)]({% post_url 2021-02-25-Test-Driven-Development-Part-2 %})
* Part 3 - Tools For Test Driven Development
* Part 4 - How Test Driven Development Drive Better Design

## Where Are We So Far

In the [1st part]({% post_url 2021-02-21-Test-Driven-Development %}), we talked about practicing TDD is simply **"writing a small function to help discovering mistakes earlier"**.

Programs that have been unit tested this way, usually became the stable part of the code base. If you start having few of them now. Congratulations, you have 1 less part that to be stressed!

The code base might even be easier to get tested as well. As the `println` output cannot be verified easily.

```kotlin
fun printLocation(location: String?) {
    if (location.isNullOrEmpty()) {
        println("Not Available")
    } else {
        println(location)
    }
}
```

```kotlin
fun printLocation(location: String?): String {
    return if (location.isNullOrEmpty()) {
        "Not Available"
    } else {
        location
    }
}
```

Some might even looking at mocking frameworks, like [Mockito](https://site.mockito.org/). It is very handy when you wanted to test the behavior the higher abstraction layer, or want to make sure exact number of calls being made ( i.e. spy ).

> Tip - Only mock types you own

Hopefully by now, writing unit test has becoming part of the development process.

There might be times you just couldn't or find it hard to write any test. May be because it is UI, network related or simply legacy code.

In general, all new development work should be easier to test and better tested.

## A Controlled Chaos

But a code base with many unit tests could still a pain to implement a new feature.

The reason for such difficulty could be

* Highly coupled code
* Writing unit test requires substantial amount of setup code
* Test that depends on timing or multiple components magically work together
* Untested code because it was deemed as part of **external systems** ( This is my personal favorite )

Many will stop at this point and think it is a limitation of TDD. Or is it ?

## Write Unit Test to Design

> \- Test Driven Development is writing small programs to record the desire behavior.
>
> \+ Test Driven Development is about writing unit test to document the expected inputs & outputs for a module

Or in other words, rather than focus writing new unit test when there is a mistakes, write unit test to record what is the expected inputs for that module ( function, class etc ), the usage of that module, and the output that module.

we will continues to use the example in part 1.

```kotlin
@Test
fun `should return Not Available on invalid location`() {
    assertWithMessage("Location should be a number")
        .that(printLocation("invalid"))
        .isEqualToNotAvailable()
    
    assertWithMessage("Location should not be empty")
        .that(printLocation(""))
        .isEqualToNotAvailable()
    
    assertWithMessage("Location should not be null")
        .that(printLocation(null))
        .isEqualToNotAvailable()
    
    assertWithMessage("Location should be a non-zero number")
        .that(printLocation("0000000000"))
        .isEqualToNotAvailable()
    
    assertWithMessage("Location should be a 10 digit number")
        .that(printLocation("12"))
        .isEqualToNotAvailable()
}

@Test
fun `should format the location in XX-XX-XX-XX-XX`() {
    assertWithMessage("Should handle unformatted location")
        .that(printLocation("1212121212"))
        .isEqualTo("12-12-12-12-12")
    
    assertWithMessage("Should handle formatted location")
        .that(printLocation("12-12-12-12-12"))
        .isEqualTo("12-12-12-12-12")
}
```

I previously mentioned it does not matter if you start writing test first or implementation first approach, but I think writing **test first** is getting advantageous.

> Test first programming - Thou Shell Not Write Code Without A Failing Test

```kotlin
fun printLocation(location: String?): String {
    throw NotImplementedError()
}
```

When in doubt on the exact behavior on certain inputs and outputs. It is a good opportunity here to involve customer and get clarification.

It is also a good opportunity to review the choice of method name, input and output types. I found myself less attached to the code and tend to make more modifications.

## Don't Forget About ~~Stage 1~~ **Write Test to Discover Mistakes**

Hopefully by now you understand the title - `Test Driven Development isn't About Testing`. It is because of large amount of time focusing on documenting how the code should work, rather than fixing it.

I think it is very important to choose which area to focus depending on the situation. If number of mistakes are high after the design, it is okay to focus back on discovering mistakes.

I think the interaction between focusing mistake discovery and design lead to higher quality work, because it created the opportunity to rewrite the solution for number of times without customer discover the mistakes the hard way.

> Tip - Practice Makes Perfect

## Reference

* [Some Underrated Elements Of Success For the Modern Programmer](https://www.youtube.com/watch?v=mbcV_Qdb7Ts)
