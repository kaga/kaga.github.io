---
layout: post
title: "Amusing Ourselves to Death with... Documentation"
date: 2021-06-20 18:01:00 +1300
categories: debugging-teams
tags: book
---

![Amusing Ourselves to Death](/assets/book/amusing-ourselves-to-death.jpg)

Software development involves a lot of reading and writing. In order to write a program, one must read the API documentation, sample code and more, before a single line of code is written. To be a good software developer, one must write readable code that at least the future self could understand[^1].

Similar to [GOTO Book Club](https://www.youtube.com/playlist?list=PLEx5khR4g7PJbSLmADahf0LOpTLifiCra), I will be discussing different areas of software development which inspired by a book. However, this is not a book review but hopefully spark your interest to join this book club.

- [Amusing Ourselves to Death with Documentation (You are here)](% post_url debugging-teams/2021-06-20-Amusing-Ourselves-to-Death %)
- The Manager’s Path
- Debugging Teams
- The Mythical Man-Month

## Receiving Information Everyday

> By itself, a photograph cannot deal with the unseen, the remote, the internal, the abstract. It does not speak of "man," only of a man; not of "tree," only of a tree. You cannot produce a photograph of "nature," any more than a photograph of "the sea."

The world that we are living in, is a very different world compared to 1980s, which was again very different world than the world in 1850s. Books, telegraphy, newspaper and TV were the main source of information for most people. Today, it is Facebook, Instagram, YouTube and the like.

However, the modern day medium is not equivalent to the medium of yesteryear. News delivered through Facebook, usually just the headline, does not delivered the same way on newspaper. An Instagram post is mostly imagery, and there is very little description to better understand the context.

Besides, most people do not read the description at all. Most people just keep scrolling. What was the last time you read an article ?

## Receiving Information at Work

On the other hand, companies still use email and instant messaging to get things done.

There are issue tracking systems ( e.g. Jira ), which help the team to record issues to fix or feature to implement. There are Wikis ( e.g. Confluence ) to record architecture decisions and support note. There are development platforms ( e.g. Github ) to code collaboratively on a project that is 100,000s if not million lines of code.

There are a lot of reading and writing, and majority of those are not code either. There are a lot things has changed in the software industry, but this "typographic minds" remains.

However, there is such a huge contrast on the use of medium between work place and life. It is not hard to imagine that habits from one place presents at the other. It is far too common to see someone scroll up and down a page, trying to search for certain keywords and jump to conclusion immediately.

## ~~The Solution~~

> Can serious national issues really be explored in any coherent, meaningful way in such a fragmented, attention-challenged environment?

I do not claim to have a solution, but I am certain there is **No Silver Bullet**[^2].

However, I thought [**Manifesto for Agile Software Development**](https://agilemanifesto.org/) was heading to the right direction.

### **Individuals and Interactions** Over Processes and Tools

Sometimes a lot problems or misunderstanding could simply go away by simply having a conversation.

For example, issues with a software discovered by QA engineers can be faster and easier to identify by involving the development team earlier.

A lot of time needed to write a description of the issue. It is even harder and more time required to write a good one that can ensure every parties involved, such as the product owner, project manager and engineers, share the same understanding. If the issue only get exposure from the issue tracking system hours after first discovery, it is already too late.

Having said that, it is very good have paper trail for the conversation took place. A summary of the conversation could be posted instead in the issue tracking system.

### **Working software** Over Comprehensive Documentation

> - A very simple drawing and drawing release system with great flexibility for making changes must be provided.
> - There must be a minimum number of reports required, but important work must be recorded thoroughly.
>
> [Kelly's 14 Rules & Practices](https://www.lockheedmartin.com/en-us/who-we-are/business-areas/aeronautics/skunkworks/kelly-14-rules.html)

It might not seems obvious at first. The focus on working software over comprehensive documentation lead to a better designed software, as it should be ease-to-use help the user understand the world.

However, it is not saying abundant all form of documentation altogether. On the contrary, the design of the software, and any major decisions should be documented. It must be every carefully, thoughtfully written and kept up-to-date as well.

Different style could be used depending on target audience too. When things do not work as expected, the report should be written in a way to maximize the [Information-action ratio](https://en.wikipedia.org/wiki/Information%E2%80%93action_ratio), and using [*Three Bullets and a Call to Action*](https://therealfitz.medium.com/how-to-ask-a-busy-executive-for-anything-e40291ebf066) as a template.

### **Customer Collaboration** Over Contract Negotiation

> A technology, in other words, is merely a machine. A medium is the social and intellectual environment a machine creates.

prototype 

risk of entertaining 
Resist the temptation to turn an environment for work and learning into entertainment.


## Reference

[^1]: [Any fool can write code that a computer can understand. Good programmers write code that humans can understand. - Martin Fowler](https://en.wikiquote.org/wiki/Martin_Fowler)

[The Original Skunk Works – Nickolas Means](https://youtu.be/pL3Yzjk5R4M)
