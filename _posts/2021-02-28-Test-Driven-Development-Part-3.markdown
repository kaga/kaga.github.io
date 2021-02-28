---
layout: post
title:  "How Test Driven Development Drive Better Design"
date:   2021-02-28 12:05:49 +1300
categories: TDD
tags: unit-test
---

This is a multi-part series on Test Driven Development.

* [Part 1 - Write Unit Test to Discover Mistakes]({% post_url 2021-02-21-Test-Driven-Development %})
* [Part 2 - Write Unit Test to Design (You are here)]({% post_url 2021-02-25-Test-Driven-Development-Part-2 %})
* [Part 3 - How Test Driven Development rive Better Design]({ post_url 2021-02-28-Test-Driven-Development-Part-3})

## The Road So Far

If you decided to give Test-Driven Development a try and completed few projects. Hopefully you have get pasted the hardest part of learning a new technique, and on going development has becoming a lot easier and faster than you started.

For the first 2 parts I was focusing on the mechanics of TDD. It is like to learn driving, where you keep practicing throttle and brake applications so you can drive on the road, but later you start apply the brakes to stop so gently to get a pleasant experience.

This time I am once again redefine Test Driven Development

> \- Test Driven Development is writing small programs to record the desire behavior.
>
> \- Test Driven Development is about writing unit test to document the expected inputs & outputs for a module.
>
> \+ Test Driven Development uses unit test as a technique to design software in a sustainable way.

## Test Driven Development to Drive Better Design

Let's just use J.Brains's [4 elements of simple design](https://blog.jbrains.ca/permalink/the-four-elements-of-simple-design) as a starting point.

> 1. ~~Passes its tests~~
> 1. Minimizes duplication
> 1. Maximizes clarity
> 1. ~~Has fewer elements~~

It is also about having as much as unit test as possible, and have a thin layer of integration test ( UI, Network, External Systems etc. ).

> [Zero integrated test to show the correctness of your code - J.B Rainsberger](https://youtu.be/VDfX44fZoMc?t=3837)

Note, it is not about not writing a single integration test because it is a **"Scam"**. It is about using unit test to show the correctness of your code. Integration test is useful to make sure external systems ( such as a rest api service ) honours the agreed contract.

It is also about pushing the ever higher of unit / integration test ratio.

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

## Creating Modular Design

One way to achieve the goal can be started from Top-down approach, by creating modules to separate different concerns ( Single-Responsibility Principle ).

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
                                        |          
                              +---------|---------+
                              |                   |
                              |   HTTP Library    |
                              |                   |
                              +-------------------+
```

UI module can utilized patterns of your choice, such as ~~Massive~~ Model View Controller, Model-view-viewmodel. Repository which ease UI development as well as enforcing Dependency Inversion Principle. Such as using **Mock Repo** to test different possible states of an UI - Initial, Loading, Loaded, Error.

The **HTTP Library** is interesting and important in this case. I could have simplify the diagram above by combining **Network Repo** and **HTTP Library**.

### Creating Stable Modules From the Ground Up

In this example, the **HTTP Library** handles all the complexity of making a request, such as OData request generation, CSRF Token validation, Authentication, Request Optimization etc. The **Network Repo** is simply piecing different REST APIs together.

To drive the point home, a barcode scanner module can created to abstract away the complexity of using the hardware. a printer module can be created to abstract away the complexity of connecting a printer and print.

The goal is creating layers of abstraction so we can put more focus on interact with customer.

## 

Use case
     - Missing Parameters
     - Leaking abstractions
    - naming

Pattern
    - DSL
    - Review Design Pattern
    - SOLId principles

Big Design Up Front
Bottom Up Design

