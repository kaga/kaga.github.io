---
layout: post
title: "Waterfall vs Agile"
date: 2021-03-22 00:45:49 +1300
categories: debugging-teams
tags: team
---

In my [first blog post in Github]({% post_url 2021-01-18-Waterfall %}), I have revisited the "original waterfall" paper by Winston Royce, where the methodology was misunderstood. This time I would like to look at **Agile Software Development**, which has been becoming a hot topic for the last decade.

For the last few years, I have seen a lot of teams misunderstood or mystified **Agile**. Companies adopting **Agile**, as a standard process in the fear of missing out. They think it is a way to maximize productivity and the solution to company hierarchical political culture.

The title is a clickbait. This is not a war against **Waterfall**. Here is my take to explain the concept in the simplest way possible, and it is oriented towards individuals and small teams.

There are many publications on **Agile** for the last 2 decades, so I will not and don't feel qualified to go in depth. This is more like a **Quick Start Guide on Agile**.

## We Want To Build The Right Product

A successful product should solves user's problem, while keeping it delightful to use. It should be reliable and ease to use. It should be evidence to user that the product is saving their time.

In "enterprisey" commercial world, a lot of software are regulatory type application. It makes sure user does not work extra long hours, or filing in the paperwork at the right time, so they don't violate relevant regulations. A product done right will transform a dreadful experience, into something more palatable.

Recently, I needed to apply for an extra license plate for my bike rack, which was a relatively new requirement in New Zealand[^1]. Failure to comply could result in $5000 infringement fines. To my surprise, the system to apply the supplementary plate was very easy to use and the whole process took less than 5 minutes. The cost of applying the plate is very inexpensive too, $22.38 to be precise ( as of March 2021 ).

Although I still see vehicles simply not displaying the plate or used a hand-written license plate, I believe with the information presented to the driver, it would be obvious which decision they will take.

The goal of **Agile** is delivering values to user, and we ( Software Developer ) do it through software.

## Agile is a Mindset

> You can't do Agile, you have to be Agile - [Surviving Your Inevitable Agile Transition - J.B. Rainsberger](https://www.youtube.com/watch?v=UQOmGiv7rUk)

The philosophy of **Agile software development** believes through quick feedback cycles, will help develop the right solution and deliver values sooner. This mindset of receiving **quick feedback cycles** and adjust plans accordingly **happens at everything we do, everyday**.

If unsure about the requirement, then get feedback from customer.

If unsure about a design or technical implementation, then get feedback from your peer developer.

This agility means ability to change the design or software implementation to realign with the newly learned information.

### Manifesto for Agile Software Development

> We are uncovering better ways of developing software by doing it and helping others do it.
>
> Through this work we have come to value:
>
> - Individuals and interactions over processes and tools
> - Working software over comprehensive documentation
> - Customer collaboration over contract negotiation
> - Responding to change over following a plan
>
> That is, while there is value in the items on the right, we value the items on the left more.
>
> | --- | --- | --- |
> |Kent Beck |James Grenning |Robert C. Martin |
> |Mike Beedle |Jim Highsmith |Steve Mellor |
> |Arie van Bennekum |Andrew Hunt |Ken Schwaber |
> |Alistair Cockburn |Ron Jeffries |Jeff Sutherland |
> |Ward Cunningham |Jon Kern |Dave Thomas |
> |Martin Fowler |Brian Marick | |

If Winston Royce's **Managing the Development Of Large Software System** presents **Waterfall**, then the **Manifesto for Agile Software Development** presents **Agile**.

Like most things with software development, the values of this manifesto are all evolves around humans and the feedback cycles from those interactions.

The only value that might be not self explanatory is **Working software over comprehensive documentation**, which according to [Rebert C. Martin](https://youtu.be/eisuQefYw_o?t=223) and I can relay with my personal experience, consistently deliver software is the key to build relationships and help build the other 3 values.

#### Value **X** Over **Y** Does Not Mean **Y** Should Be Ignored

It is good to have **Scrum**, but I don't think it is agile if the team refusing to make changes for the duration of a 2 weeks sprint, especially if the change of plan could bring greater benefit for the user. Such as fixing a critical bug.

Secondly, although documentation has becoming less and less effective way to communicate ( TODO see my review on Amusing Ourselves to Death ), some concise documentations are necessary, either for future reference or onboarding a new team member.

Being adaptive to change is one thing, and **Agile** also puts focus on building software that is easy to change. But it does not mean lack of upfront requirements all together, and only provide feedbacks based on working software. I think it will put the development team in a huge disproportionate responsibility that will eventually destroy the customer-developer relationship. It is also generally true to require more effort to change further down the development process, no matter how the skilled developer architected the solution.

### Both Agile and Waterfall Methodology Do Not Want **Chaos**

```bash
Agile --------------------------------------------------------- Waterfall
```

Since the goal is about delivering the right solution. There are many ways to achieve that goal, and **Agile** is just **ONE OF THEM**.

Demonize **Waterfall** will not help in achieving the goal, and it is a very "anti-agile" thing to do. Since **Agile** is about people and demonize the opposing side will create barriers. Futhermore, the finial **Waterfall** model is actually very close to **Agile**.

Rather, **Agile** and **Waterfall** can be considered as 2 opposing forces, where **Waterfall** is more rigid, more documentation oriented, more **"Big Design Upfront"**. where **Agile** is the opposite.

No one lives on either end of the extreme spectrums too. Some will be leaning against the **Agile** side, and some will be on the **Waterfall**. Over the years, I found myself drifting in betweens depending on situation and **both will help delivering the right product and values to the user**.

## How to Agile

![learn-this-power](/assets/waterfall-vs-agile/learn-this-power.gif)

So you are very interested in **Agile** and want to try it first thing tomorrow. But before unleashing **Agile** into your existing environment, one should measure the flow of existing system so you can start effectively.

### 1. Find Out Where You Are

A good experiment would be implementing a feature, which can be accomplished within few weeks, and observe from how requirements are gathered, to customer getting the correct solution. This will outline the requirement process, such as the requirement is delivered after first implementation.

Another good experiment would be fixing a small bug or just update a version number, and track how long it would take to go through varies systems. Such as code review, get a build, get paper based approval form signed, weekly change management meeting or critical staff on holiday. This will outline if the existing processes are slowing down the feedback cycle.

It might be very surprising to find even an established team can take 2 months or more to deliver a simple change to user. It does not mean the team is incapable, it just means there are room for improvements.

### 2. Take a Small Step Towards Your Goal

It is not a trivial task to change how your team interact with customer, or change the existing processes. So take small steps and change things that you can control first. Such as automating the build process, or sharing knowledge to increase [bus factor](https://en.wikipedia.org/wiki/Bus_factor) so thing can move on when critical members can have a holiday.

### 3. Adjust Your Understanding Based On What You Learned

In my opinion, this is the most important step of all steps. This is where the feedback loop finally comes back and have the opportunity to adjust and do the whole process again.

For example, you have found the user resist to your new change. It is very tempting to think your approach is in the right and the other party is in the wrong.

It is because every situation is different, everyone is different. Therefore your tried-and-true approach does not work in this time. It does take time for everyone to learn, may be few more detours, before settling in back to your original approach.

If this technique was repeated successfully, building software fast should just come naturally.

### The Fear of Not "Agile" Enough

> We are not really Agile

With the sea of Agile certification programs and Agile certified coaches, it could be uncomfortable for a self-learning team to claim they are delivering software in an agile way.

The easiest way to tell if you and your team is **"Agile"**, in my opinion, is by reviewing the manifesto again.

Some coaching program will introduce the rituals, such as Kanban or Daily Standup, as a way to start Agile adoption. I think this approach need to be very carefully execute and education to avoid mistaken the rituals as **"Agile"**.

**Agile** can be a philosophical subject. The mindset is easy to understand, but will take a long time to experiment, with series of trail and error to understand the philosophy.

## Reference

- [Surviving Your Inevitable Agile Transition - J.B. Rainsberger](https://www.youtube.com/watch?v=UQOmGiv7rUk)
- [Agile is Dead](https://youtu.be/a-BOSpxYJ9M)
- [From the "You call this agile?" department](https://www.joelonsoftware.com/2006/11/15/from-the-you-call-this-agile-department/)

[^1]: [https://www.nzta.govt.nz/vehicles/licensing-rego/number-plates/](https://www.nzta.govt.nz/vehicles/licensing-rego/number-plates/)
