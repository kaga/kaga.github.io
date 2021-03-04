---
layout: post
title:  "Git - Github Pull Request - Part 4"
date:   2021-03-04 18:05:49 +1300
categories: Version control
---

This is the 4th part on source control introduction.

* [Part 1 - Get Started]({% post_url version-control/2021-02-08-Git-Part-1-Get-Started %})
* [Part 2 - Git With Github]({% post_url version-control/2021-02-13-Git-Part-2-Collaboration %})
* [Part 3 - Git Branching ]({% post_url version-control/2021-03-03-Git-Part-3-Git-Branching %})
* [Part 4 - Github Pull Request (You are here)]({% post_url version-control/2021-03-04-Git-Part-4-Pull-Request %})

Last time in Git branching, I have discussed about how to use **Pull Request** as a way to merge branches. However, I don't want to approach this topic like this.

> "Pull Request is good for you, you should do it. If you don't do it, you are a bad person"

## What is Pull Request

**Pull Request**, sometimes being used interchangeably with **Code Review**, is a process of getting a change reviewed by a second person. The change will be merged to **Main** branch once approved.

1. Changes made in a branch
1. Create a Pull Request
1. Add some reviewer
1. Once review approved, merge to **main**

I feel the review process could easily become do it just for the sake of doing it, and it could face strong resistant in a team environment where everyone feel unsafe.

For the last few years, I have been treat it as a way to knowledge sharing and team building expertise. The discussion that generated from Pull Request as important, if not more important than the change itself.

## Draft Pull Request For Reviewee To Proof Read

Having said that, a pull request can help before involving another person.

One advice I had in university on writing an assignment was changing to a different font to proofread. I think this advice works well in reviewing code.

You can take advantage of **Git Staged Changes** and **GitHub Pull Request** as a way to do that.

![Draft Pull Request](/assets/git/github-draft-pull-request.png)

### What to Proof Read

As general advice, things that can be automated should be automated. Such as code formatting, and running unit test.

we can focus on code organization, variable naming and customer requirement.

## Pull Request With Reviewers

### Small and Concise Change

### Add Comments

Add issue tracker link, screenshots if working on UI.

[Flameshot](https://github.com/flameshot-org/flameshot)
[Peek](https://github.com/phw/peek)

### Who Should Be In Your Review

Everyone
Senior / Junior 
Dogma
Outside Your Team

### When

During development
After development

### A platform

Face to Face Talk, Real life demo

### Use Comments To Communicate

## To Review

### Remember to Praise

### Review Promptly

## Anti Pattern

### Tactical Review

### Use Review To Blame

---

## Reference

[Code Review Best Practices - Trisha Gee](https://www.youtube.com/watch?v=a9_0UUUNt-Y)

https://kagadev.blogspot.com/2016/06/code-quality-code-review.html


