---
layout: post
title:  "Git - Github Pull Request - Part 4"
date:   2021-03-07 03:05:49 +1300
categories: Version control
---

This is the 4th part on source control introduction.

* [Part 1 - Get Started]({% post_url version-control/2021-02-08-Git-Part-1-Get-Started %})
* [Part 2 - Git With Github]({% post_url version-control/2021-02-13-Git-Part-2-Collaboration %})
* [Part 3 - Git Branching ]({% post_url version-control/2021-03-03-Git-Part-3-Git-Branching %})
* [Part 4 - Github Pull Request (You are here)]({% post_url version-control/2021-03-07-Git-Part-4-Pull-Request %})
* [Part 5 - Github Actions]({% post_url version-control/2021-03-10-Git-Part-5-Github-Action %})

Last time in Git branching, **Pull Request** was mentioned as a way to merge branches.

> Pull requests are a mechanism for a developer to notify team members that they have completed a feature. Once their feature branch is ready, the developer files a pull request. This lets everybody involved know that they need to review the code and merge it into the main branch. - [Atlassian Git Tutorial](https://www.atlassian.com/git/tutorials/making-a-pull-request)

This time I will be diving deeper into **Pull Request**, **Code Review** or **Peer Code Review** ( I use them interchangeably ). However, I don't want to approach this **Pull Request** thing as part of software development establishments, which implies every developer should know.

I also don't want to see the rubber stamping version of this process because of the name **Code Review**.
It is similar to [Test Driven Development]({% post_url 2021-02-21-Test-Driven-Development %}), which is not about test. **Code Review is not just about reviewing code**.

For the last few years, I have been treating **Pull Request** as a medium to knowledge sharing and team building exercises. The discussion that generated from it often as important, if not more important than the change itself. It also helped me to overcome some resistance and build trust in my team where everyone felt unsafe to be criticized or feared of someone discovered a mistake.

## Draft Pull Request As a Way To Proofread

Having said that, **Pull Request** can work without involving another person. It is especially useful when being the sole developer in a company.

One advice I had in university on writing an assignment was, changing to a different font to proofread. I think this advice works well in reviewing code too. Taking advantage of **GitHub Draft Pull Request** is an easy way to do that, which you review the code on a browser in addition to the IDE.

> Tip You can use **Git Staged Changes** every time before each commit as a way to review too.

![Draft Pull Request](/assets/git/github-draft-pull-request.png)

### What to Look For

As a general advice, things that can be automated should be automated. Such as code formatting ( i.e tab vs spaces, space before {} etc. ), and checking all unit test are passing.

Once the [bikeshedding](https://en.wikipedia.org/wiki/Parkinson's_law_of_triviality) is out of the way, we then can turn our focus on code readability & maintainability. If source files organized with folders, choice of naming in variables/functions/classes, and removing any **"test code"**/**dev logs** etc.

Last but not least, if the code will meet customer requirements.

I think taking a step back and objectively judge the work, as if someone else did it, is beneficial here. It is important to remember that it is the work that being reviewed, not the developer.

## Pull Request With Reviewers

> There's only so far you can go in this field by yourself. Seek out other smart programmers. Work with them. Endeavor to be the dumbest guy in the room, and you'll quickly discover that software development is a far more social activity than most people realize. There's a lot you can learn from your fellow introverts. - [In Programming, One Is The Loneliest Number](https://blog.codinghorror.com/in-programming-one-is-the-loneliest-number/)

Having peers to work with is a blessing. You can bounce off ideas, a pair of eyes to look over in the code. I lost count how many mistakes I made when I was working alone, and only to found out the problems few years down the road.

I also thought I was experienced and careful enough to solo for a while too. How wrong I was.

Beware that involving **Pull Request with another developer** is a much different process than reviewing your own work.

### Draft Pull Request For Sharing Initial Ideas

I don't think there is a doubt that, getting early feedbacks directly contribute to the success of any projects. Once significant amount of time has been invested in interpreting scope of the task and customer requirements, it is time to see if the work is on track and opportunity to confirm expectations.

> "I have implemented this feature, do you think it is going to work?"
>
> "Can you have a look if I am using [Kotlin Channel](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.channels/-channel/) correctly?"

**Hopefully at the end the review process, there should be NO SURPRISES.**

Review after development completion should be a [gateway review](https://blog.jetbrains.com/upsource/2017/01/18/code-review-as-a-gateway/). It is place to check if the work adhere to company standards. In many cases, I would approve the work even I discovered a typo at this stage. I trust the developer will fix it before merging.

It is however, not a place for [hit and run micromanagement](https://www.joelonsoftware.com/2006/08/08/the-command-and-control-management-method/), inventing new requirements out of thin air.

> "Have you consider the future of this product or consider other use cases that I did not mention earlier, I expected you to think harder than this"

In some cases those responses are valid, but the feedback is often too late and this kind of **passive aggressive** behavior actually signals a deeper problem.

### Bring Reviewers In For Knowledge Sharing

Although it might sounds very disruptive to invite **everyone** to review every **Pull Request**, I found it is a good opportunity for gather junior & senior developers around to learn a particular part of the project. it is of course insane to invite a team of 30, but I think it works well in small team ( 5~6 ).

For example, through fixing a string template mistake, we can talk about [mustache](https://mustache.github.io/), or how that part of the project works.

It is also a place for new or junior developer to provide new insights or challenge existing dogmas.

### For Team Building as Well

In a bigger project, where it requires multi-teams effort. Using **Pull Request** is a good way to start the collaboration.

May be the other team focuses on the api development, or may be they are already knowledgeable about the process but in a different environment. Having the draft version of the API design up early will accelerate the project development and certainly a good way to start the working relationship.

**Pull Request** is not the only way to communicate too. It is good for having asynchronous conversation where everyone work remotely. Try using it as an anchor point to start a face-to-face synchronous conversation, [live share](https://visualstudio.microsoft.com/services/live-share/) or a live demo.

## To Make This Process Smoother

When a **Pull Request** involves anyone other than myself, I would like to make their experience a bit smoother, because they took their valuable time to help.

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

The draft might be about experimenting a new language feature, unless it was communicated by other means, but having no description force the reviewer to guess the intention.

> Tip - No one is a mind reader here, just pure 100% software developer.

If it is a module, add some sample usages, which could help setting examples in the **README.md** in the future.

If it is a UI related change, add some screenshots or GIFs as well.

![Github Pull Request with UI Demo](/assets/git/github-pull-request-ui-preview.gif)

Here are tools that I use ( Linux ):

* [Flameshot](https://github.com/flameshot-org/flameshot)
* [Peek](https://github.com/phw/peek)

### Remember to Praise as Well

From the reviewer perspective, it is very easy to only criticizing the mistakes. But it knockdowns the reviewee's confidence, which we worked so hard on. I found it hard to do 5 to 1 ratio ( five positive interactions to every one negative interaction ), but disingenuous positive feedback is worse than not doing any.

Don't over think about over praising too. In general, software engineer don't praise a lot, it would take a lot to actually "over the top".

Genuine, sincere praises should be coming from both the reviewer as well as the reviewee. Praise the reviewer for spotting a mistakes.

## Anti-patterns

I have talked about using **Pull Request** as a way build relationships. It should be quite obvious not to do anything that would undone the hard-earned relationship, such as using **Pull Request** to deflect blames.

## Reference

* [Code Review Best Practices - Trisha Gee](https://trishagee.github.io/post/code_review_best_practices/)
* [Code Review Best Practices - Trisha Gee (Youtube)](https://www.youtube.com/watch?v=a9_0UUUNt-Y)
* [Amazing Code Reviews](https://youtu.be/ly86Wq_E18o)
* [About Pull Requests - Github](https://docs.github.com/en/github/collaborating-with-issues-and-pull-requests/about-pull-requests)
* [Why code reviews matter (and actually save time!)](https://www.atlassian.com/agile/software-development/code-reviews)
