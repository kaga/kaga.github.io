---
layout: post
title: "Shopping For Development Experience"
date: 2021-03-11 21:05:49 +1300
categories: Version control
tags: Git Github
---

This post supplements the [source control series]({% post_url version-control/2021-02-08-Git-Part-1-Get-Started %}), where I used Github to demonstrate different development activities and how they integrate together.

However, Github is **NOT** the only solution. Technology comes and goes very quickly. Tools that I used 2010 are not the same tools that I used in 2021. Also, driven by factors such as company policy, your solution might be very different as well.

This records my journey on selecting 2 providers in 5 years and my considerations before making the decision.

Selecting a Git provider is not like Test Driven Development, where you can start practicing it right away. It is more like a topic to be reviewed every 3~5 years in an established development team, or starting new, which is way more common for businesses going through digital transformation.

## It is About Building a Development Experience

Similar to [Test Driven Development isn't About Testing]({% post_url 2021-02-25-Test-Driven-Development-Part-2 %}), picking a Git provider is not just about finding a place to store source code. It is about imagine the full lifecycle of software development.

- Recording and communicating system requirements and software requirements
- Tracking development progress and task management
- Place to store source code and review
- Building and method of delivering the software
- Providing feedbacks and start over again

In terms of software, here are some of them

- Wiki
- Project Management
- Issue Tracking
- Source Control
- ( Private ) Package Registry
- File Hosting
- Continuous Integration and Continuous Delivery (CI/CD)

To give more context, below are the toolset that I used since I start professionally develop software, where I was directly involved in making the decision since 2016.

| Year        | Wiki        | Project Management | Issue Tracking | Source Control | Package Registry | File Hosting             | CI/CD                       |
| ----------- | ----------- | ------------------ | -------------- | -------------- | ---------------- | ------------------------ | --------------------------- |
| 2010 - 2012 | None        | Excel              | Excel          | DIY Git Server | None             | Gmail                    | None                        |
| 2012 - 2016 | Google Docs | Trello             | FogBugz        | Kiln           | DIY              | DIY PHP                  | TeamCity                    |
| 2016 - 2019 | Bitbucket   | Trello, Excel      | Jira           | Bitbucket      | JFrog            | Shared Folder, NextCloud | Bamboo, Bitbucket Pipelines |
| 2020 - 2021 | Confluence  | Jira               | Jira           | Github         | Github           | Github                   | Github                      |

## Considerations

### On-Premise vs Cloud Based

The first and foremost is probably deciding where the solution locates, which depends on many factors, such as company polices and cost.

how the team access the server when working from home? If it is a cloud based solution, what is the authentication mechanism?

It is also not necessary means cloud based solution is better than on-premise solution.

### Maintenance

> Who is going to maintain the infrastructure?

It is great if the company got a dedicated person/team to maintain the solution. However, if it is development team to maintain the infrastructure, and next question would be - What else can be done with the time spend?

For example, I estimated it took me about 6 to 8 weeks per year to maintain Bamboo, JFrog, NextCould, which includes 4 software updates and progress improvement.

### Reliability

> How often that service breakdown?

On the surface, it might appears few 15 minutes breakdown a month does not matter too much, because it is not critical part of writing code.

### How to Pay the Bills

This is not related to the feature, but it could limit your options

Some companies only accept invoice as a payment method, especially if the service involves a significant cost ( > 10,000 USD ).

> Tip - Learn how to raise a Purchase Order

While some service providers only accept credit card payment only.

## Why Github ( Enterprise )

How many minutes needed for Github Action
This was one of many reasons that I prefer **Github** over other solutions, as it saved the cost of purchasing and maintaining yet another service. **Github Packages** supports all the use cases I have in mind too.

## Migration Lesson

Github was blocked in company firewall

## Reference

http://dev-with-alex.blogspot.com/2016/12/shopping-for-frameworks.html
