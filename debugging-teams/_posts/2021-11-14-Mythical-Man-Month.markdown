---
layout: post
title: "How Many ...... Mythical Man-Month ...... to Finish a Project"
date: 2021-11-14 23:35:49 +1300
categories: debugging-teams
tags: book
---

![Mythical Man Month](/assets/book/mythical-man-month.jpg)

*Long time no write. After I first draft this post on 17th July 2021, I took a 3 months break experimenting what I have learned.*

- [Amusing Ourselves to Death with Documentation]({% post_url debugging-teams/2021-06-27-Amusing-Ourselves-to-Death %})
- [Debugging Teams with Humility, Respect and Trust]({% post_url debugging-teams/2021-07-05-Debugging-Team %})
- [Mythical Man-Month]({% post_url debugging-teams/2021-11-14-Mythical-Man-Month %})
- [The Manager’s Path]({% post_url debugging-teams/2021-11-28-Managers-Path %})

> Why is programming fun? What delights may its practitioner expect as his reward?
>
> First is the sheer joy of making things......
> Second is the pleasure of making things that are useful to other people......
> Third is the fascination of fashioning complex puzzle-like objects of interlocking moving parts and watching them work in subtle cycles, playing out the consequences of principles built in from the beginning......
> Fourth is the joy of always learning, which springs from the non-repeating nature of the task...... Finally, there is the delight of working in such a tractable medium.

As a software engineer, one could be programming for oneself, or for someone. One could be the sole programmer in a company, working on integration different programs, or fortunate enough to be part of a team, crafting a product for consumer market. It is very exciting to lear new ideas and software development technique everyday, to solve a technical problem. Time can go by very fast, especially when one is in the zone, implement a sorting algorithm or experimenting with a new framework.

While it is all very good. However I found this is where myself and many developers end of doing. I thought I was making progress everyday, and believed writing beautiful efficient code was the only goal. Little did I cared the purpose of the software, and how customer use our creation. This mindset limited my effectiveness and how I solve a problem at work.

Understanding the following concept took my career to the next level.

## Software is a Product

> ..... a program. It is complete in itself, ready to be run by the author on the system on which it was developed.
>
> ..... a programming product. This is a program that can be run, tested, repaired and extended by anybody..... promotion of a program to a programming product requires its thorough documentation, so that any one may use it, fix it, and extend it. As a rule of thumb, I estimate that a programming product costs at least **three** times as much as a debugged program with the same function.
>
> ..... a programming system. This is a collection of interacting programs.
>
> The programming systems product. This differs from the simple program in all of the above ways. It costs **nine** times as much. But it is the truly useful object, the intended product of most system programming efforts.

Software is a product. It does not necessary equate to evil corporation maximizing profits in the expense of everything. As express in [earlier blog]({% post_url debugging-teams/2021-07-05-Debugging-Team %}), software development is a combination of art and science. It is the same as craftsman selling their hand-made cast iron pans. A compiled software and cast iron pans are products, and useful tools to other.

This "productization" turns the focus on designing the software, not for oneself satisfaction, but for the customer. This is similar to the goals of [Test-driven development]({% post_url 2021-03-02-Test-Driven-Development-Part-3 %}). It gives clarity of which part of the product is critical for the customer, hence should give more care, or bought existing modules to save development time.

So overall less time spent on foundational work, which I found boring after few iterations, and more time spent on solving real world customer problems. Some took this idea a step further, saying [~~Software as a Service~~ Software IS a Service](https://youtu.be/ZrBQmIDdls4?t=1159)[^1]

## Software Requires a Schedule

> The first step in controlling a big project on a tight schedule is to have a schedule, made up of milestones and dates for them. Milestones must be concrete, specific, measurable events defined with knife-edge sharpness. A programmer will rarely lie about milestone progress, if the milestone is so sharp he can't deceive himself.

Unlike hand crafting cast iron pan, a shipped software can easily be improved after first manufacturing. This is also the greatest strength and weakness of modern day software development. If a mistake was found in the software, it is relatively trivial task to fix the mistake and re-distribute the software. Customers and stakeholders could also request new features as well.

A schedule, while it might be different, is important for both existing and new projects. Producing a schedule is a hard task. It is even harder to report a schedule slippage early and reschedule, but a schedule gives the development team clarity of what matters the most at this moment, as task that is scheduled to do now because of its importance.

It also gives customer and stakeholders clear expectation of when requested features will be delivered. This builds positive relationship between different parties.

However, **A schedule IS NOT the same as estimate**.[^2]

Scheduling is a planning exercise. It involves how the product should look like in each milestones, and catering for hiring, acquiring resources, unexpected events and much more. It is a platform to discuss the product and allow pivoting to different objectives.

It is far too often to see inexperience managers, such as project manager, trying to fit estimated work within a time frame box. This kind of work estimation is not favorable among software engineers, and it does not work at all, simply because every individual contributor work at different pace.

A senior contributor worked on the project for few years will provide a wildly different estimates than a newly onboard graduate. Furthermore, this estimation assumed any development work can be rearranged without impacts and ignored any catering of daily activities, such as helping other teams or employee training day. Time should be explicitly allocated so team effectiveness is maximized.

## Ending Note

In my opinion, understanding the art of programming systems product is one of many steps taking a good software engineer to the next level. The Mythical Man-Month was first published many years ago and still the perfect book for this topic. It is a must-read classic that I wish I could read early enough. I thought it was no longer relevant in the age of Agile and Continuous Delivery[^3] at first, but I could not be more wrong.

## Reference

[^1]: [The Dehumanisation of Agile and Objects • James Coplien • GOTO 2017](https://youtu.be/ZrBQmIDdls4)
[^2]: [#NoEstimates - Allen Holub](https://youtu.be/QVBlnCTu9Ms)
[^3]: [A Path to Better Programming • Robert "Uncle Bob" Martin & Allen Holub • GOTO 2021](https://youtu.be/QnmRpHFoYLk)

- [Frankenbuilds; if Agile is so Good, why are our Products so Bad? • Gabrielle Benefield • GOTO 2012](https://youtu.be/2JNXx8VdbAE)
- [What went wrong with the IT-industry? - James Coplien](https://youtu.be/gPP7Bleg214)
- [Why Scaling Agile Doesn't Work • Jez Humble • GOTO 2015](https://youtu.be/2zYxWEZ0gYg)
