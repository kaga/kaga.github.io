---
layout: post
title: "Amusing Ourselves to Death with ...... Documentation"
date: 2021-06-27 23:00:00 +1300
categories: debugging-teams
tags: book
---

![Amusing Ourselves to Death](/assets/book/amusing-ourselves-to-death.jpg)

Software development involves a lot of reading and writing. In order to write a simple program, one must read the API documentation, sample code and more, before a single line of code is written. To be a good software developer, one must write readable code that at least the future self could understand[^1].

Similar to [GOTO Book Club](https://www.youtube.com/playlist?list=PLEx5khR4g7PJbSLmADahf0LOpTLifiCra), I will be discussing different areas of software development which inspired by a book. However, this is not a book review.

- [Amusing Ourselves to Death with Documentation ( You are here )]({% post_url debugging-teams/2021-06-27-Amusing-Ourselves-to-Death %})
- [Debugging Teams with Humility, Respect and Trust]({% post_url debugging-teams/2021-07-02-Debugging-Team %})
- The Manager’s Path
- The Mythical Man-Month

## Receiving Information Everyday

> By itself, a photograph cannot deal with the unseen, the remote, the internal, the abstract. It does not speak of "man," only of a man; not of "tree," only of a tree. You cannot produce a photograph of "nature," any more than a photograph of "the sea."

The world that we are living in, is a very different world compared to 1980s, and definitely a very different world compared to 1850s. Books, telegraphy, newspaper and TV were the main source of information for the public. Today, it is Facebook, Instagram, YouTube and the like.

However, the modern day mediums are not equivalent to the medium of yesteryear. News on Facebook reported very differently than on newspaper. A Facebook post contains a catchy headline, an imagery and has very little description to better understand the context. It was crafted to try to grab your attention instead of being informative.

## Receiving Information at Work

A lot things has changed in the software industry since the end of World War II, but the "typographic minds" of a developer is similar to America back in 1800s remains.

It might sounds old school, but it is not surprised to see software companies still using emails and instant messaging to get things done.

There are issue tracking systems ( e.g. Jira ), which help software team to record issues to fix or features to implement. Internal Wiki ( e.g. Confluence ) record architecture decisions, guides and support notes. There are software development platforms ( e.g. Github ) to code collaboratively on a project with million lines of code.

There are numerous books written around software development, and many more blog posts on the internet to read and learn, from the very basic to advance topics. There are developer conferences every year, deep diving into a specific topic hours at a time.

Combining from the beginning on reading API documentation and sample code. This is a career that involves a lot of reading and writing, and majority of those are not programming code either.

## The Risk

> A technology, in other words, is merely a machine. A medium is the social and intellectual environment a machine creates.

Despite mobile phone and computer are getting bigger screen for ease of information consumption. Most people receive information by reading just few words and mostly pictures, and scroll to the next stimulating content. The original iPhone was just a machine, but its innovative Human-Machine interface, with smooth scrollable medium changed the world.

There is such a huge contrast on the use of medium between work place and life. It is not hard to imagine that habits from one place presents at the other. It is far too common to see someone scroll up and down a document, trying to search for certain keywords and jump to conclusion immediately.

In my opinion, this is one source of frustrations from working in this industry, where requirements are misunderstood and projects get delayed. There are fast-rising technologies, such as Adobe XD, to turn pages of written requirements into interactive prototypes. It is a great medium but we must be aware not to turn it into entertainment as well.

## ~~The Solution~~

> Can serious national issues really be explored in any coherent, meaningful way in such a fragmented, attention-challenged environment?

The book *Amusing Ourselves to Death* discussed **the medium is the metaphor**, the culture of **typographic mind** which used to be more common in the past, and how a medium could turn everything, even education, into entertainment.

I have **No Silver Bullets**[^2], but here is my thoughts on how we could cope with such difficult environment.

### Focus on **Individuals and Interactions**, **Working Software**, **Customer Collaboration** and **Responding to Change**[^3]

> There must be mutual trust between the military project organization and the contractor, the very close cooperation and liaison on a day-to-day basis. This cuts down misunderstanding and correspondence to an absolute minimum. - Kelly's 14 Rules & Practices[^4]

Sometimes a lot problems or misunderstandings could simply go away by having a conversation. For example, an issue with software discovered by QA engineers can be faster and easier to identify by involving the development team earlier, instead of creating a ticket for development team to reproduce the issue again and investigate.

Compare to talking to an developer ( not disruptively, at an appropriate time ), more time would be needed to describe the issue in writing. It is even harder and more time consuming to write a good report that every parties involved, such as the product owner, project manager and engineers, could easily understand the issue. It would take hours after first discovery to get the issue discussed, and the hours which could matter in diagnosing a critical system issue.

### **Processes and Tools**, **Documentation**, **Contract Negotiation** and **Following a Plan** Matters Too

> There must be a minimum number of reports required, but important work must be recorded thoroughly. - Kelly's 14 Rules & Practices[^4]

However, it is not saying abundant all documentations altogether.

On the contrary, it is best to have paper trail for the conversation took place. A summary of the conversation and any major decisions should be recorded instead, to help relevant parties that missed the initial conversation stay informed.

When the solution design was changed as a result, the documentation must kept up-to-date and be carefully, thoughtfully written.

Different writing style should be used depending on target audience too. When things do not work as expected, a report should be written in a way to maximize the [Information-action ratio](https://en.wikipedia.org/wiki/Information%E2%80%93action_ratio), so the team can action against. I found [_Three Bullets and a Call to Action_](https://therealfitz.medium.com/how-to-ask-a-busy-executive-for-anything-e40291ebf066) can help delivering the message effectively, even software architecture decisions.

> The specifications applying to the hardware must be agreed to well in advance of contracting. The Skunk Works practice of having a specification section stating clearly which important military specification items will not knowingly be complied with and reasons therefore is highly recommended. - Kelly's 14 Rules & Practices[^4]

A piece of software could be legally bound by a contract to ensure mission critical features are delivered, and having it in writing definitely help setting the right expectation for both parties. I think this exact contract set the foundation for future software iterations, because the iterations is now specified, not yet another overran failed software projects.

> A very simple drawing and drawing release system with great flexibility for making changes must be provided. - Kelly's 14 Rules & Practices[^4]

In the modern day software development, there are times everything has to stop and turn focus on addressing the immediate security threats or customer problems. In those times, it is more apparent the need to clearly communicate the change of directions. The development team also needs to structure[^5] the source code and program so that such rapid change of direction is possible.

## Conclusion

When I started this blog, it has been in my mind to keep every post short for the reasons mentioned above. However, I believe a modern day software developer should be reading so much more, to be well prepared in this fast changing industry.

This is also going to be a fun experiment for myself, to see if this few minutes of reading can convince you to spend few hours to read a book.

## Reference

[^1]: [Any fool can write code that a computer can understand. Good programmers write code that humans can understand. - Martin Fowler](https://en.wikiquote.org/wiki/Martin_Fowler)
[^2]: [No Silver Bullet](https://en.wikipedia.org/wiki/No_Silver_Bullet)
[^3]: [Manifesto for Agile Software Development](https://agilemanifesto.org/)
[^4]: [Kelly's 14 Rules & Practices](https://www.lockheedmartin.com/en-us/who-we-are/business-areas/aeronautics/skunkworks/kelly-14-rules.html)
[^5]: [Trunk Based Development](https://trunkbaseddevelopment.com/)

- [The Original Skunk Works – Nickolas Means](https://youtu.be/pL3Yzjk5R4M)
- [The Surrender of Culture to Technology - Neil Postman](https://www.youtube.com/watch?v=hlrv7DIHllE)
