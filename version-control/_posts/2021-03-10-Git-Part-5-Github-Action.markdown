---
layout: post
title:  "Git - Github Actions - Part 5"
date:   2021-03-10 00:05:49 +1300
categories: Version control
---

![automate all the things](/assets/git/github-automate-all-the-things.jpeg)

This is the 5th part on source control introduction.

* [Part 1 - Get Started]({% post_url version-control/2021-02-08-Git-Part-1-Get-Started %})
* [Part 2 - Git With Github]({% post_url version-control/2021-02-13-Git-Part-2-Collaboration %})
* [Part 3 - Git Branching ]({% post_url version-control/2021-03-03-Git-Part-3-Git-Branching %})
* [Part 4 - Github Pull Request]({% post_url version-control/2021-03-07-Git-Part-4-Pull-Request %})
* [Part 5 - Github Actions (You are here)]({% post_url version-control/2021-03-10-Git-Part-5-Github-Action %})

In the last post on Github Pull Request, we explored using it as way to collaborate and less of a place to debate **"Tabs vs Spaces"** and **"Missing semicolon"**.

Github Actions is a cloud-hosted Continuous Integration( CI ) server, it is opposed to on-premise solutions such as Bamboo, TeamCity. It is like having an extra member in your team, which provide feedbacks in consistent, repeatable way.

## Automate Everything

![Github Actions Overview](/assets/git/github-actions-overview.png)

> Tip - Github Actions is an evolving product and it is **evolving fast**. [Check documentation for up-to-date usage](https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions)

Github Actions can easily run command-line programs, and it can accompany **readme.md** serving as a live documentation on how to run the project.

Here are some common workflows ideas to automate

* Lint
* Run Unit Test
* Build Artifact

> Tip - You can encode base64 files with base64 before storing it in secrets

Lets use Github Action to lint one of my github repository.

### Create First Github Action

> lint, or a linter, is a static code analysis tool used to flag programming errors, bugs, stylistic errors, and suspicious constructs. - [Wikipedia](https://en.wikipedia.org/wiki/Lint_(software))

```yml
name: Lint

on:
  push:
    paths:
      - '**.kt'

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
    - uses: actions/checkout@v2
    - run: ./gradlew lintKotlin
```

*This example used [ktlint](https://github.com/pinterest/ktlint)*. Source file is located here *[lint.yml](https://github.com/kaga/mockk-coverify-example/blob/main/.github/workflows/lint.yml)*.

![Github Actions First Failure](/assets/git/github-actions-first-failure.png)

```bash
➜  testmockk git:(main) ✗ ./gradlew lintKotlin

> Task :app:lintKotlinAndroidTest FAILED
.
.
.
BUILD FAILED in 671ms
1 actionable task: 1 executed
```

This is how to the same command run on both my local environment and Github Action.

In the **lint** github action example above, it is much slower to run on Github then on my local machine ( 40s vs 1s ) and recommended to run it on local machine where possible, but when taking into account to checking out the exact commit, open the IDE, start gradle sync, run the lint and finally fix the lint. The 40 seconds execution time is not so slow after all.

![ktlint features](/assets/git/git-linter-features.png)

> Tip - Some language linter requires configuration, it is good to reference from a reputable tech companies, such as [Airbnb](https://github.com/airbnb/javascript), [Google](https://google.github.io/styleguide/jsguide.html). It is done to avoid arguing if certain formatting decision is right or wrong. It also allows new developers, who already familiar with those style guide, to pick up the source code quickly. It is even better if an opinionated linter is available.
>
> Tip - Some linter also provides built-in formatter as well, which make fixing those formatting issues hassle-free.

### Use Github Action to Show the Correctness of Your Code

The reason for running unit test, and subsequently building the project on Github Actions, is that it is an unbiased repeatable in checking if a new change broken other parts of a system. Github Actions creates a new environment every time and contains no side effects from previous runs.

Using the build artifacts from Github Actions makes sure there is always capability to build the project, even when developer is away.

To put it perspective, I have once tried to build an iOS app that the contractor is no longer left for few years. It has no documentation whatsoever and it took me 2 weeks to track down all the dependencies and compile the app.

In contrast, I have worked on numerous projects that has Github Actions for linting, testing, building and deploying the application, which I can start writing code and contribute within a day, without fear of breaking or the secrets to sign and deploy the application.

#### Trigger Contract Test Periodically or Manually

When working with a 3rd party team, sometimes it is useful to run some integration tests to check if the system is functioning as expected.

There was one time a newly OAuth 2.0 server was built and for most of the time it can authenticate user successfully, but for 1 in 5 times it just randomly refuse to work. The administrator ran the request in Postman and yelled **"It works on for me"**. So I created a simple script to test the service every minute for an hour. Soon enough, with hundreds of test results generated the pattern was clear and a patch was later applied.

It would have been very hard, if not impossible, to prove the issue without a CI service available.

## Badge Up [![Lint](https://github.com/kaga/mockk-coverify-example/actions/workflows/lint.yml/badge.svg?branch=main)](https://github.com/kaga/mockk-coverify-example/actions/workflows/lint.yml)

Once a workflow is created, put the badge at the top of the **readme.md**, so you can have a quick glance and see if everything is running well.

## Github Packages To Create A Repository Of Modules

> With GitHub Packages, you can safely publish and consume packages within your organization or with the entire world. - [Github](https://github.com/features/packages)

This is one of the main reasons I choose Github over other solutions, because supports all the use case I have, and saved the cost of purchasing [JFrog](https://jfrog.com/). Significantly reduce the need to use git subtree or monolithic repository architecture.

## Connecting Things Together

With all the development workflows migrated to Github Actions, we can  

### Github Pull Request

> Step 1. Create a Pull Request
>
> Step 2. Github Actions run the lint and unit test workflow
>
> Step 3. Smash the **Merge** button once the knowledge sharing activity is done, pull request approved and workflows ran successfully
>
> Step 4. There is no step 4

### Integration With Github Release

> Although you can use command line to start tagging ( `git tag -a v1.0.0 -m "version 1.0.0"` ), I actually recommend using github releases to create the tag. As we can utilize Github Actions to drive more automation. - [Part 2 - Git With Github]({% post_url version-control/2021-02-13-Git-Part-2-Collaboration %})

The idea in Part 2 was once getting used to create release and tags via Github, it becomes a natural step to create a workflow to build the project and [upload the artifact to the release page](https://github.com/actions/upload-release-asset).

#### On Github Release Created Workflow

1. Build the project
1. Upload the artifacts to Github Release
1. Deploy the artifacts

*[example release workflow](https://github.com/kaga/react-vehicle-selector/blob/main/.github/workflows/publish.yml)*

This enables manually create regular releases, as well as any hotfix if required in the future.

From here it is easy to automate regular release, so that a new version will [deploy continuously](https://www.atlassian.com/continuous-delivery/principles/continuous-integration-vs-delivery-vs-deployment#:~:text=To%20put%20it%20simply%20continuous,except%20that%20releases%20happen%20automatically.).

#### On Push to **Main** Branch Workflow

1. Do some finial checks
1. Create a Github Release

*[example create release workflow](https://github.com/kaga/react-vehicle-selector/blob/main/.github/workflows/continuous-deployment.yml)*

> Tip - A personal access token needed to [enable triggering new workflows in a workflow](https://docs.github.com/en/actions/reference/events-that-trigger-workflows)

#### Or Integration with External Services i.e. Jira

![Jira Releases Panel](/assets/git/jira-releases-panel.png)

In some environment, it is appropriate to accumulate few more changes before deploying daily or weekly. Github Actions can be triggered [by a HTTP call](https://docs.github.com/en/rest/reference/actions#create-a-workflow-dispatch-event).

![Enable Jira Releases Feature](/assets/git/jira-releases-feature.png)
![Jira Github Action Trigger Config](/assets/git/jira-github-action-trigger.png)

For example in Jira next-gen project, there is a **Releases** feature available, which can easily trigger the release workflow.

> TODO: There will be a post in the future where I will go more in depth on how I setup Jira

## Conclusion

In the series, a Git based development workflow, which use in conjunction with **Github** to manage and automate variety of tasks during development, was explored. From **committing** changes from a **branch**, then **push** it to **Github** and create a **Pull Request** to **merge**, to continuously build and deploy the project using **Github Actions**. It was also discussed utilizing Github as a collaboration platform to share knowledge.

> TODO - There are some Git features which I have left out but will cover in the future, because my usage for those features are getting fewer and farther between.
