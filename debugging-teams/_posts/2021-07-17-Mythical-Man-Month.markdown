---
layout: post
title: "Adding Mythical Man to a Late Software Project Makes It Later"
date: 2021-11-11 00:45:49 +1300
categories: debugging-teams
tags: book
---

![Mythical Man Month](/assets/book/mythical-man-month.jpg)

- [Amusing Ourselves to Death with Documentation]({% post_url debugging-teams/2021-06-27-Amusing-Ourselves-to-Death %})
- [Debugging Teams with Humility, Respect and Trust]({% post_url debugging-teams/2021-07-05-Debugging-Team %})
- [Mythical Man-Month ( You are here )]({% post_url debugging-teams/2021-07-17-Mythical-Man-Month %})
- The Manager’s Path

*Long time no write. After I first draft this post on 17th July 2021, I took a 3 months break experimenting what I have learned*

> Why is programming fun? What delights may its practitioner expect as his reward? 
> First is the sheer joy of making things...... Second is the pleasure of making things that are useful to other people...... Third is the fascination of fashioning complex puzzle-like objects of interlocking moving parts and watching them work in subtle cycles, playing out the consequences of principles built in from the beginning...... Fourth is the joy of always learning, which springs from the nonrepeating nature of the task...... Finally, there is the delight of working in such a tractable medium.

As a software engineer, one could be programming for oneself, or for someone. One could be the sole programmer in a company, working on integration different programs, or fortunate enough to be part of a team, crafting a product for consumer market. It is very exciting to lear new ideas and software development technique everyday, to solve a technical problem. Time can go by very fast, espcially when one is in the zone, implement a sorting algorithm or experimenting with a new framework.

While it is all very good. However I found this is where myself and many developers end of doing. We thought we were making progress everyday, and believed the code is running as efficient as possible. Little did I cared the purpose of the software, and how customer use our creation.

## Software is a Product

> ..... a program. It is complete in itself, ready to be run by the author on the system on which it was developed. 
> ..... a programming product. This is a program that can be run, tested, reparied and extended by anybody..... promotion of a program to a programming product requires its thorough documentation, so that any one may use it, fix it, and extend it. As a rule of thumb, I estimate that a programming product costs at least **three** times as much as a debugged program with the same function.
> ..... a programming system. This is a collection of interacting programs.
> The programming systems product. This differs from the simple program in all of the above ways. It costs **nine** times as much. But it is the truly useful object, the intended product of most system programming efforts.

Software is a product. It does not necessary equate to evil cooperate maximizing profits in the expense of everything. As express earlier, software development is a combination of science and art. There are craftsmans who sell their hand-made cast iron pans. A compile software and cast iron pans are products, and useful tools to other.

This "productization" allow us to focus on designing the software, not for oneselve satisfaction, but for the customer, similar to Test-driven development. It gives us clarity of which part of the product is critical for the customer, hence should give more care, or bought existing modules to save development time. So overall less time spent on foundational work, which I found boring, and more on solving customer problems. Some took this idea a step further, and declared [Software IS a Service]()

## Software Requires a Schedule

> The first step in controlling a big project on a tight schedule is to have a scedule, made up of milestones and dates for them. Milestons must be concrete, specific, measureable events defined with knife-edge sharpness. A programmer will rarely lie about milestone progress, if the milestone is so sharp he can't deceive himself.

Unlike hand-crafted cast iron pan, software can easily be improved after first manufactouring. This is also the greatest strength and weakness of modern day software development. If a mistake was found in the program, it is relatively trival task to fix the mistake and re-distribute the software. Customers and stakeholders could also request new features as well. A schedule gives the development team clarity of what matters the most, it also gives customer and stakeholders clear expectation of when requested features deliver. It builds the relationship between different parties. Producing a scehdule is hard enough. It is even harder to accept and report a schedule slippage early.

A schedule is important for both existing and new projects.

### Schedule is not the Same as Estimating 

Scheduling is a planning exerise. It involves how the product should look like in each milestones, and catering for hiring, accuquring resources, unexpected events and much more. It is a platform to discuss the product and allow pivot to different objectives. 

It is far too often to see inexperience managers trying to fit work estimations within a time frame. Work estimation is not favourble at all because every indivual contributor work at different pace. A senior contributor worked on the project for few years will provide a wildly different esitmate than a newly onboard graduate. The estimation assumes work can be rearranged into different orders or any catering of daily activities, such as helping other teams or employee training day. It is worse when those gut-feel estimation was enforced upon as deadlines.

## Ending Note 

In my opinion, understanding software is a product will be first of many steps to distanish between a good software engineer and a great software engineers. The mythical man month was first publish many years ago and still a perfect book for understanding this topic better. It is a classic that I wish I could read early enough. I first thought it was no longer relevant in the age of Agile and Continous Delivery movement, espically when it discuss the need for asistocracy and I misunderstood it as old-fashioned command and concour management.

## Reference

- [Frankenbuilds; if Agile is so Good, why are our Products so Bad? • Gabrielle Benefield • GOTO 2012](https://youtu.be/2JNXx8VdbAE)
- [Why Scaling Agile Doesn't Work • Jez Humble • GOTO 2015](https://youtu.be/2zYxWEZ0gYg)
- [A Path to Better Programming • Robert "Uncle Bob" Martin & Allen Holub • GOTO 2021](https://youtu.be/QnmRpHFoYLk)
- [Surviving Your Inevitable Agile Transition](https://youtu.be/UQOmGiv7rUk)
- [#NoEstimates (Allen Holub)](https://youtu.be/QVBlnCTu9Ms)
