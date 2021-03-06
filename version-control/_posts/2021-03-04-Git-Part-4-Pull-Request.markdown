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

Last time in Git branching, **Pull Request** was mentioned as a way to merge branches.

This time I will be diving deeper into **Pull Request** or **Code Review** ( I use them interchangeably ). However, I don't want to approach this topic like this:

> "Pull Request is good for your code, you should do it. If you don't do it, you are not a good developer, you are a bad person!"

## What is Pull Request

> Pull requests are a mechanism for a developer to notify team members that they have completed a feature. Once their feature branch is ready, the developer files a pull request. This lets everybody involved know that they need to review the code and merge it into the main branch. - [Atlassian Git Tutorial](https://www.atlassian.com/git/tutorials/making-a-pull-request)

I feel the review process could easily become **"do it just for the sake of doing it"**, and it could face strong resistance in a team environment where everyone feel unsafe to be criticized or fear of someone else discovered a mistake.

For the last few years, I have been treating **Pull Request** as a medium to knowledge sharing and team building exercises. The discussion that generated from Pull Request often as important, if not more important than the change itself.

## Draft Pull Request As a Way To Proofread

Having said that, **Pull Request** can help without involving another person, especially when you are the sole developer in a company.

One advice I had in university on writing an assignment was changing to a different font to proofread. I think this advice works well in reviewing code.

Taking advantage of **GitHub Draft Pull Request** is a great way to do that.

> Tip You can use **Git Staged Changes** every time before each commit as a way to review too.

![Draft Pull Request](/assets/git/github-draft-pull-request.png)

### What to Look For

As a general advice, things that can be automated should be automated. Such as code formatting ( i.e tab vs spaces, space before {} etc. ), and checking all unit test are passing.

Once the [bikeshedding](https://en.wikipedia.org/wiki/Parkinson's_law_of_triviality) out of the way, we then can turn our focus on code readability & maintainability. If source files organized with folders, choice of naming in variables/functions/classes, and removing any **"test code"**/**dev logs** etc.

Last but not least, if the code will meet customer requirements.

> P.S. I have written a [Test Driven Development series]({% post_url 2021-02-21-Test-Driven-Development %}) to help this aspect.

I think taking a step back and objectively judge the work that just created is beneficial here. Remember it is the work that being reviewed, not you.

## Pull Request With Reviewers

> There's only so far you can go in this field by yourself. Seek out other smart programmers. Work with them. Endeavor to be the dumbest guy in the room, and you'll quickly discover that software development is a far more social activity than most people realize. There's a lot you can learn from your fellow introverts. - [In Programming, One Is The Loneliest Number](https://blog.codinghorror.com/in-programming-one-is-the-loneliest-number/)

Having pairs to work with is a blessing. You can bounce off ideas, a pair of eyes to look over in the Pull Request process. I just lost count how many mistakes I have made when I was working alone, and only to found out the problems few years down the road.

I also thought I was experienced enough to solo for a while too. How wrong I was.

Involving with another reviewers in Pull Request can be so much different process than reviewing your own code.  

### Draft Pull Request For Sharing Initial Ideas

I don't think there is any doubt that getting early feedback is very important to the success of a project. Once significant amount of time has been invested in interpreting scope of the task or customer requirements, it is an opportunity to see if we are on track and confirming expectations.

It is also a conversion starter. "Can you have a look if I am using [Kotlin Channel](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.channels/-channel/) correctly?"

**Hopefully at the end the review process, there should be NO SURPRISES.**

Review after development completion should be a [gateway review](https://blog.jetbrains.com/upsource/2017/01/18/code-review-as-a-gateway/). It is place to check if the code adhere to company standard. It is not a place to invent new requirements out of thin air.  

> "Have you consider the future of this product or consider other use cases that I did not mention earlier, I expected you to think harder than this"

In some cases those responses are valid, but the feedback is often too late and this kind of **passive aggressive** behavior actually signals a deeper problem in the team.

### Bring Reviewers In For Knowledge Sharing

Although it might sounds very disruptive to invite **everyone** to review every **Pull Request**, I found it is a good opportunity for gather senior & junior developers around to learn a particular part of the project. In a team of 30, it is of course insane, but I think it works well in small team ( 5~6 ).

For example, through fixing a string template issue, we can talk about implementing [mustache](https://mustache.github.io/), or importance of escaping strings, and how that part of the project works.

It is also a place for new or junior developer to give new insights and challenge existing dogma. Such as why a certain part was done in a certain way.

### For Team Building as Well

In a bigger project, where it requires multi-teams effort. Using **Pull Request** is a good way to start the collaboration. May be they are focusing on the api development, or may be they are already knowledgeable about the process but in a different environment. Having the draft version of the API design up early might accelerate the project development and certainly a good conversion starter.

Try to use **Pull Request** as a platform too. It is good for asynchronous conversation where everyone work remotely. Try using it as an anchor point and start face-to-face synchronous conversation, or a live demo.

## To Make This Process Smoother

It is much more complicated when a Pull Request to involve anyone other than yourself. Their time are limited and valuable, and I would like to make their experience a lot smoother.

### Small and Concise Change

> KISS
>
> * Keep It Small and Simple
> * ✔️ 200-300 lines
> * ⬇️ Barrier to start review
> * ⬆️ Quality of reviews
> * ⬇️ Blind spots
> * 🌳 Don't lose big picture
>
> [Amazing Code Reviews](https://youtu.be/ly86Wq_E18o?t=756)

It will be difficult to send a 1000 lines change in a **Draft Pull Request**, and expecting a constructive feedback. Breaking down the task smaller will help creating that feedback cycle even earlier.

### Add Description

![Pull Request Description](/assets/git/github-pull-request-desc.png)

The draft might be about experimenting a new language feature, but having no description give no context for the reviewer. "This new language feature is cool, what do you think ?" will help a lot.

If it is a module, add some sample usages, which could help setting examples in the **README.md** in the future.

If it is a UI related change, add some screenshots or GIFs as well.

![Github Pull Request with UI Demo](/assets/git/github-pull-request-ui-preview.gif)

Here are some tools that I use ( Linux ):

* [Flameshot](https://github.com/flameshot-org/flameshot)
* [Peek](https://github.com/phw/peek)

### Remember to Praise as Well

From the reviewer perspective, it is very easy to only criticizing the mistakes. But it knockdowns the reviewee's confidence and damage all the trust that we worked hard on. I found it hard to do 5 to 1 ratio ( five positive interactions to every one negative interaction ), but disingenuous positive feedback is worse than not doing any.

Don't over think about over praising too. In general, software engineer don't praise a lot, it would take a lot to actually "over the top".

Genuine, sincere praises should be coming from both reviewer and reviewee.

## Anti-patterns

I have talked about using **Pull Request** as a way build relationships. It should be quite obvious not to do anything that would undone the hard-earned relationship.

Such as using **Pull Request** to deflect blames, or being too afraid to provide feedbacks to a low confidence member.

## Reference

* [Code Review Best Practices - Trisha Gee](https://trishagee.github.io/post/code_review_best_practices/)
* [Code Review Best Practices - Trisha Gee (Youtube)](https://www.youtube.com/watch?v=a9_0UUUNt-Y)
* [Amazing Code Reviews](https://youtu.be/ly86Wq_E18o)
* [About Pull Requests - Github](https://docs.github.com/en/github/collaborating-with-issues-and-pull-requests/about-pull-requests)
* [Why code reviews matter (and actually save time!)](https://www.atlassian.com/agile/software-development/code-reviews)
