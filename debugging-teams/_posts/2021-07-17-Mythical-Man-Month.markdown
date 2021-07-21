---
layout: post
title: "Estimating Project Completion with ...... Mythical Man-Month"
date: 2021-07-17 00:45:49 +1300
categories: debugging-teams
tags: book
---

![Mythical Man Month](/assets/book/mythical-man-month.jpg)

- [Amusing Ourselves to Death with Documentation]({% post_url debugging-teams/2021-06-27-Amusing-Ourselves-to-Death %})
- [Debugging Teams with Humility, Respect and Trust]({% post_url debugging-teams/2021-07-05-Debugging-Team %})
- [Estimating Project Completion with ...... Mythical Man-Month ( You are here )]({% post_url debugging-teams/2021-07-17-Mythical-Man-Month %})

The first 2 parts of this series were a general view on how we work day to day, such as communicating a newly discovered issue with the product or writing a support note. This post will be focusing on the bigger picture, the software product itself.

## Programming System Product

> Finally, promotion of a program to a programming product requires its thorough documentation, so that any one may use it, fix it, and extend it. As a rule of thumb, I estimate that a programming product costs at least **three** times as much as a debugged program with the same function.  
> The programming systems product. This differs from the simple program in all of the above ways. It costs **nine** times as much. But it is the truly useful object, the intended product of most system programming efforts.

Starting a new project is an exciting opportunity and yet it is daunting as the same time. It is exciting because the software engineers could introduce new ideas that could change the company's culture, with [Agile software development](http://agilemanifesto.org) and [continous deployment](https://www.atlassian.com/continuous-delivery/principles/continuous-integration-vs-delivery-vs-deployment). It is also mildy terrifing beacuse a lot of software requirements are unknown or unclear. There are so much non-code related work has to be done before a single line of code is written, not to mention it takes years to finially see the product is starting to grow and be successful.

It is often to see young enginneers ( such as myself ) tring to write more code to solve a project problem. Such as writing code faster but without proper testing, or working longer hours to solve the problem where the team is overwhelmed with work and more software developer required. It is very obvious here to ask for more resources ( i.e. Phones, development machines etc. ) and recruiting more developers to join the team. It is easier said then done.

## The Surgical Team 

> each member cutting away on the problem, one does the cutting and the others give him every support that will enhance his effectiveness and productivity.

However, there are diminishing returns in throwing more developers or QA engineers into a team, because it will be increasingly difficult to keep a team of 40 up to date. It is simply not possible to use technology alone, such as the use of instance messaging application like Microsoft Teams or Slack, to solve the problem. It is a difficult balance between dividing a big team into smaller teams for better overall efficiency, but not so small to create [silo](https://en.wikipedia.org/wiki/Information_silo) and [in-groups and out-groups](https://en.wikipedia.org/wiki/In-group_and_out-group) culture.

The timing of which new developers joining the team are also important as well. The team overall productivity will be lower for a period of time, due to bringing new member up to speed. The onboarding period could variy from few weeks to servel months depending on how well the team is functioning, for example by measuring the quality and efficiency of communication mentioned earlier posts.

## Architects vs Implementors

> Setting of external specifications is not more creative work than the designing of implementations. It is just different creative work.

As a software engineer, I think the best code is the code that need not writing, by carefully balancing the act of building new software and purchasing off the shelf solution. It is espically a valuable skill to have when the team is small but a lot work has to be done. Focus all the effort in delivering the core value for the customer. It is as highly creative work as writing the most elegant efficent code, and I think it is better to rotate the roles of architects and implementors

### Schedule 

> when schedule slippage is recognized, the natural ( and traditional ) response is to add manpower. Like dousing a fire with gasoline, this makes matters worse, much worse. More fire requires more gasoline, and thus begins a regenerative cycle with ends in disaster.


In this post-agile world, 

I think it is safe to say, the industry is starting to head towards the post-agile world. 

where 



- Building the Team


  - To break down the delivery into small chunks
no esimation does not mean not having a scehdule

taking into account there are
- on going support issues
- sick day
- personal time off
- Training time
- Meeting
- New team member coming onboard

Monitoring the progress and updating the plan


Project
- A software product 

## Reference

- [A Path to Better Programming • Robert "Uncle Bob" Martin & Allen Holub • GOTO 2021](https://youtu.be/QnmRpHFoYLk)
- [Why Scaling Agile Doesn't Work • Jez Humble • GOTO 2015](https://youtu.be/2zYxWEZ0gYg)
- [Frankenbuilds; if Agile is so Good, why are our Products so Bad? • Gabrielle Benefield • GOTO 2012](https://youtu.be/2JNXx8VdbAE)
- [Surviving Your Inevitable Agile Transition](https://youtu.be/UQOmGiv7rUk)
- [#NoEstimates (Allen Holub)](https://youtu.be/QVBlnCTu9Ms)
