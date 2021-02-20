---
layout: post
title:  "Test Driven Development - Write Unit Test To Discover Mistakes (Part 1)"
date:   2021-02-21 00:09:49 +1300
categories: TDD
tags: unit-test
---

As I am on my way to write a 6 part series on general git usage. I would like to give myself a break to start reviewing a blog series I made on Test Driven Development back in 2016.

* Part 1 - Write Unit Test to Discover Mistakes
* Part 2 - Write Unit Test to Design System

## Why Test Driven Development (TDD)

> Less stress at work

The tech industry is fast pacing. More and more features should be released to customer sooner.

This blog series record my thoughts on Test Driven Development, when I start a new project, or inherited an unstable for growth project.

Note, this is not the only way to develop software. Also, reading what is TDD is different from experiencing yourself first hand.

> The Dao ( Truth/Path ) that can be trodden is not the enduring and unchanging Dao. The name that can be named is not the enduring and unchanging name. [道可道 非常道 名可名 非常名](https://ctext.org/dao-de-jing/zh?en=on)

### Why Test Driven Development - 2016 Edition

* Writing unit test as a way to improve software quality
* Unit test helps discovering mistakes earlier
* Unit test as a way to design interface for communication between teams
* The myth about code coverage, and we shouldn't use it as the only metric for software quality
* Use in conjunction with Continuous Integration and use machine to determine the correctness and performance of a system

### Here is The Plan

* Part 1 - Write Unit Test to Discover Mistakes
* Part 2 - Write Unit Test to Design System

This is not game. This is not **The 3 Stages of TDD**. This is about main area of focus when solving technical problems, changing the code confidently, and as a way to organize code.

Ultimately deliver features, reduce work stress.

---

## Lets Start

There are many times in my career where I couldn't deliver a single feature for months. It is because implementing a simple feature or small framework upgrade could easily breaks existing features.

Sometimes rewriting the whole system *solved* the problem, other times rewriting 200,000+ lines of code simply is not an option. Therefore early in my career was involving a lot of staring at the code and mentally dry run the code with different scenarios.

Let's have an example:

> If a location (String) is empty or null, then display "Not Available", else display the location

```kotlin
fun printLocation(location: String?) {
    if (location.isNullOrEmpty()) {
        println("Not Available")
    } else {
        println(location)
    }
}

printLocation("12-12-12-12-12")
printLocation("0000000000")
printLocation("invalid")
printLocation("")
printLocation(null)

---
Actual
---
12-12-12-12-12
0000000000
invalid
Not Available
Not Available
```

You can quickly see the solution gets complicated really quickly once we have more requirements.

```kotlin
12-12-12-12-12
Not Available
Not Available
Not Available
Not Available
```

As a start, we can simply say the practice of Test Driven Development ( TDD ) is writing small programs to record the desire behaviors.

Some language comes with a **"playground"**, for python it is [Project Jupyter](https://jupyter.org/), for kotlin it is **Scratch File** in IntelliJ. They are good options for writing small program, but for the reason that we will explore in future blog posts, we will use unit test framework instead. For Kotlin, I will use JUnit and Google Truth.

### The Program

```kotlin
fun printLocation(location: String?): String {
    val locationRawFormat = location?.replace("-", "")?.toIntOrNull()
    return when {
        locationRawFormat != null && locationRawFormat > 0 -> location
        else -> "Not Available"
    }
}
```

### The Test Program ( [Full version here](./assets/test-driven-development/PrintLocationTest.part1.kt) )


```kotlin
class PrintLocationTest {

    @Test
    fun `should return valid location`() {
        assertThat(printLocation("12-12-12-12-12"))
            .isEqualTo("12-12-12-12-12")
    }

    @Test
    fun `should return 'Not Available' on location 0000000000`() {
        assertThat(printLocation("0000000000"))
            .isEqualTo("Not Available")
    }

}
```

![Unit Test Run Test](/assets/test-driven-development/Unit-Test-Run-Test.png)

![Unit Test Results](/assets/test-driven-development/Unit-Test-Run-Results.png)

You can run each time individually, or all at once. Some IDEs has built-in way to trigger those test, so you can keep writing code and get instant feedback. For Android Studio, it `ctrl-shift-F10`.

Once you start write a few tests, you will start to have few questions. 

### Write Test First or Program First?

It does not matter! you can start writing the code first or the test first.

At this stage we are...

* focusing on creating a quick feedback loops where mistakes can be discovered early
* documenting how the program works

We don't even worry about single assertion vs multiple assertions per test for now.

### What is a Good Test Looks Like?

* It should be small
* It should be testing 1 thing and 1 thing only
* It should be quick to execute
* It should not depend on timing or external systems

* [Integrated Test Are a Scam](https://www.youtube.com/watch?v=VDfX44fZoMc)
* [Some Underrated Elements Of Success For the Modern Programmer](https://www.youtube.com/watch?v=mbcV_Qdb7Ts)
