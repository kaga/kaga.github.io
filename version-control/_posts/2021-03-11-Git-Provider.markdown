---
layout: post
title: "Shopping For Development Experience"
date: 2021-03-11 21:05:49 +1300
categories: Version control
tags: Git Github
---

In the [source control series]({% post_url version-control/2021-02-08-Git-Part-1-Get-Started %}), I used Github to demonstrate the distributed feature of Git and explained different development activities.

However, Github is **NOT** the only solution out there. Technology comes and goes very quickly. Tools that I used 2010 are no longer the same tools that I used in 2021. This post supplements the series and hopefully help you make the best decision when the time comes. So your solution might be very different than mine.

It is not about purchasing a single service to store source code as well. It is about imagining how the full lifecycle of software development would work in your environment.

Building a development experience is not like [Test Driven Development]({% post_url 2021-02-21-Test-Driven-Development %}), where you can start practicing it right away. It is a topic to be reviewed once every 3~5 years in an established development team, or starting up a new environment, which is way more common for businesses going through digital transformation.

I have been building development experience for my workplace for the last 5 years, during which I have made 2 significant changes. This post records my considerations before making the decision.

## Building a Development Experience

The purpose for building a good development experience, is to ensure you and your team work as efficiently as possible to deliver great products in years to come.

It is like designing a solution, not for your customer, but for your development team. So all the standard practices apply, like defining requirements, working closely with the team and listen their needs, and improve the experience over time.

Here are some high level items to consider when building the development experience:

- Recording and communicating system requirements and software requirements
- Tracking development progress and task management
- Place to store source code and review
- Building and delivering the software to customer
- Providing feedbacks and start over again

To give more context, below are the toolset that I used since I start develop software as a profession.

| Year | Wiki        | Project Management | Issue Tracking | Source Control | Package Registry | File Hosting             | CI/CD[^1]                       |
| ---- | ----------- | ------------------ | -------------- | -------------- | ---------------- | ------------------------ | --------------------------- |
| 2010 | None        | Excel              | Excel          | DIY Git Server | None             | Gmail                    | None                        |
| 2012 | Google Docs | Trello             | FogBugz        | Kiln           | DIY              | DIY PHP                  | TeamCity                    |
| 2016 | Bitbucket   | Trello, Excel      | Jira           | Bitbucket      | JFrog            | Shared Folder, NextCloud | Bamboo, Bitbucket Pipelines |
| 2020 | Confluence  | Jira               | Jira           | Github         | Github           | Github                   | Github                      |

## Considerations

> New isn't automatically better. New languages, new toolchains, new companies. On the surface these may be exciting and they may give you a market edge in some cases. Each one of them is however a double edged sword. These are a lot of companies out there using tried and true technologies because they work and they are known quantities. You should be one of these companies unless there is a pressing market reason that you cannot be. Using new things will make it harder to hire staff. The staff you do hire will create technical debt as they learn what works and what doesn't. - [Shopping For Frameworks - Dev with Alex](http://dev-with-alex.blogspot.com/2016/12/shopping-for-frameworks.html)

In the past, I thought every solution is more or less the same. For example, Bitbucket provided similar features compared to Github, so purchase either one is going to suffice. So I made the mistake of thinking this is a software purchase exercise. While the infrastructure worked at the end, it takes more effort to maintain, in terms of both operating expenditure and capital expenditure.

### On-Premise vs Cloud Based

The first and foremost is probably deciding where the solution locates. Company polices might dictate only on-premise solution. But it doesn't mean cloud based solution is automatically better than on-premise solution.

On the other hand, the cost of ownership per year for cloud based solution might be higher than on-premise because the usage is high. For example, as of 2021 [Github charges 10x premium](https://docs.github.com/en/github/setting-up-and-managing-billing-and-payments-on-github/about-billing-for-github-actions) on running CI/CD on Mac OS, then the 50,000 minutes monthly allowance for the enterprise plan may not be sufficient.

If on-premise solution is preferable, then how the team access the server when working from home? Is the on-premise solution contains less features than the cloud offering? If it is a cloud based solution, what is the authentication mechanism?

On-Premise vs Cloud is like a scale, where the extreme end of spectrum is 100% cloud based and the other end is on-premise. It is completely fine to sit some where in the spectrum.

> At first in 2016, I relied heavily on on-premise CI solution (9:1), such as Bamboo, because the technology is simply not mature yet. The server runs non-stop 6 hours a day (~75,000 minutes). We started offload to Bitbucket Pipeline with some success.In 2020, our plan was switching to 95% cloud based with some local agents.

### Integration With Between Softwares

It is not necessary always the case, but products that built by the same company often have better integration between their products. For example, it is very easy to create a Bitbucket hosted Git branch in Jira.

It might be easier too to get approval from management, if the solution is offered by the same company that already using.

### Maintenance

It is great if the company got a dedicated person/team to maintain the solution. However, if it is the development team to maintain the infrastructure, then the next question is:

> How much revenue can be generated with the same amount of time maintaining the solution?

For example, I estimated it took me about 6 to 8 weeks per year to maintain Bamboo, which includes 4 software updates and general process improvements. The same amount of time can be spent on implementing a medium size feature.

### Reliability

> How often that service breakdown? and for how long?

It is not just about time wasted, but it could potentially demoralize your team in the long run.

On the surface, it might appears few 15 minutes breakdown a month does not matter too much, because it is not critical part of writing code. But usually the time your team notice the downtime is often the worse possible time. Over time the frustration builds up when the team want to start a Pull Request for group discussion, or hotfix needs to get released asap.

### Paying the Bills

This is not related to the software features, but it could limit and change your options at the end. So this needs to take into consideration early on in the process.

Some companies only accept invoicing as a payment method, especially if the service involves a significant cost ( > 10,000 USD ). While some service providers only accept credit card payment only. It is a good place to start reviewing the company policy on billing.

Also don't afraid to ask the service provider if their website don't list support for your company's preferred method.

> Tip - Learn how to raise a Purchase Order

## Try Them All

"14 days free trial" is just too short to give enough impression to make a major decision, which will stuck with you for few years. So try to be up-front with management and ask for paying for it for 3 months before settling on your decision. With some napkin math on how many person will use the infrastructure and the estimated cost per year, it is obvious the initial cost of trialing is insignificant.

Bring a small team of volunteers with you too, for the initial discussion and participate in the trial. This will help you getting invaluable buy-in, and help you consider the wider group use cases.

Within few months or even few days of testing it real life, you will gain a lot better understanding on how it works.

## Migration

Great! You have a plan now.

Inform everyone with the finial decision and the migration plan early, including network administrator, which might block the service because of sudden increase in traffic. Be prepared to abort the migration and revert back if that happens.

[^1]: *Continuous Integration and Continuous Delivery (CI/CD)*
