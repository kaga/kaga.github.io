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

In the last post on **Github Pull Request**, **Github Actions** was mentioned as way spend less time on debating **"Tabs vs Spaces"** and **"Missing semicolon"** and more time on collaboration.

**Github Actions** is a cloud-hosted Continuous Integration( CI ) service, it is opposed to on-premise solutions such as Bamboo, TeamCity. Having a CI service is like having an extra member in your team, which provide feedbacks in consistent, repeatable way.

## Automate Everything

![Github Actions Overview](/assets/git/github-actions-overview.png)

> Tip - Github Actions is an evolving product and it is **evolving fast**. [Check documentation for up-to-date usage](https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions)

**Github Actions** lives and breathes command-line programs. It accompanies **readme.md** serving as a live development documentation on the project.

Here are some common workflows:

* Lint
* Run Unit Test, Integration Test
* Build Artifact ( For Development, Test, Production )

> Tip - You can base64 encode signing certificates and store it in [secrets encrypted](https://docs.github.com/en/actions/reference/encrypted-secrets)

### Create First Github Action

> lint, or a linter, is a static code analysis tool used to flag programming errors, bugs, stylistic errors, and suspicious constructs. - [Wikipedia](https://en.wikipedia.org/wiki/Lint_(software))

```yml
name: Lint

# Only runs when kotlin source file changes
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
...
BUILD FAILED in 671ms
1 actionable task: 1 executed
```

This shows the same command running on my local environment and **Github Action**.

In the **lint** github action example above, it was much slower to run on Github then on my local machine ( 40s vs 1s ), but when taking into account to:

1. checking out the exact commit
1. open the IDE
1. start gradle sync
1. run the lint
1. finally fix the lint

The 40 seconds execution time is not so slow after all. However, it is a good practice to run those workflow locally before commit, because not all errors can be fixed automatically and everything is already open and ready to run anyway.

![ktlint features](/assets/git/git-linter-features.png)

> Tip - Some language linter requires configuration, it is good to reference from a reputable tech company, such as [Airbnb](https://github.com/airbnb/javascript), [Google](https://google.github.io/styleguide/jsguide.html). It avoids arguing if certain formatting decision was right or wrong. It also allows new developers, who already familiar with those style guide, to pick up the source code quickly. It is even better if an opinionated linter is available.
>
> Tip - Some linter also provides built-in formatter as well, which make fixing those formatting issues hassle-free.

### Use Github Action to Show the Correctness of Your Code

![Github Actions To Demonstrate A Bug In A Library](/assets/git/github-actions-unit-test.png)
**I created [a repository to demonstrate a possible bug in mockk](https://github.com/kaga/mockk-coverify-example)**

One of the main reasons for running unit test, and subsequently building the project via **Github Actions**, is that it creates a new environment every time and contains no side effects from previous runs. It is like setting a fresh environment up just to run this workflow and discard immediately. This characteristic makes running those workflows very repeatable.

Using the build artifacts from **Github Actions** makes sure there is someone in the team capable to build and release the project, even when the core developer is away.

I have once tried to build an iOS app that the developer already left for few years. The project has no documentation whatsoever and it took me 2 weeks to track down all the dependencies and able to compile the app again.

In contrast, I have worked on few projects that has **Github Actions** for linting, testing, building and deploying, which allow myself to start writing code and contributing within a day, without fear of breaking the project. This significant time saving would make onboarding new developer much more easier.

#### Trigger Contract Test Periodically or Manually

When working with another team or contractor, it is useful to run some integration tests to check if the system is implemented as agreed and functioning as expected.

Here is another story - there was a time an OAuth 2.0 server was newly built. It works for most of the time and can authenticate user successfully.

However, 1 in 5 chances it would just randomly return **"unable to authenticate"** error. The administrator ran the request in Postman but failed to replicate. User must have typed the wrong password and the issue was dismissed.

To prove that was not the case, I created a simple script to authenticate against the service every minute for an hour. Soon enough, with hundreds of test results generated the pattern was clear and a patch was later applied.

It could have been very hard to prove the issue exists without a CI service.

## Badge Up [![Lint](https://github.com/kaga/mockk-coverify-example/actions/workflows/lint.yml/badge.svg?branch=main)](https://github.com/kaga/mockk-coverify-example/actions/workflows/lint.yml)

![Readme with Badge](/assets/git/github-readme-status-badge.png)

Once a workflow is created, put the badge at the top of the **readme.md**, so anyone can have a quick glance and see if everything is running well. I like the badge and think it is a morale boost device.

## Putting Things Together

With those development workflows migrated to **Github Actions**, those actions can be integrated with different Github features and we can start tying everything in this series together.

### Github Pull Request

In addition to combat bikeshedding, [which discussed previously]({% post_url version-control/2021-03-07-Git-Part-4-Pull-Request %}), just using workflows above can significant improve the **Pull Request** experience 🎉.

For example, running the unit test workflow save reviewer's time manually verify the change.

Further more, having a development variant of the application attached to the **Pull Request**, allows reviewer to run it immediately, which minutes could be saved on a decently sized project.

### Integration With Github Release

> ... I actually recommend using github releases to create the tag. As we can utilize Github Actions to drive more automation. - [Part 2 - Git With Github]({% post_url version-control/2021-02-13-Git-Part-2-Collaboration %})

```bash
                                                                              
    On Merge To Main Branch                                                   
    +-----------------+      +-----------------+     +--------------------+   
    |                 |      |                 |     | Version Bump       |   
    |      Lint       --------  Run Unit Test  ------- Generate Changelog |   
    |                 |      |                 |     | Create Release     |   
    +-----------------+      +-----------------+     +----|---------------+   
                                                          |                   
+---------------------------------------------------------|                   
|                                                                             
|                                                                             
|    On Create Github Release                                                 
|    +-----------------+      +-----------------+                             
|    |                 |      |                 |                             
|-----  Build Artifact |      |      Deploy     |                             
     |                 |      |                 |                             
     +-----------------+      +-----------------+                             
                                                                              
```

> Tip - A personal access token needed to [enable triggering new workflows in a workflow](https://docs.github.com/en/actions/reference/events-that-trigger-workflows)

*[Source workflows](hhttps://github.com/kaga/react-vehicle-selector/tree/main/.github/workflows)*

![Github Release](/assets/git/github-release-3.png)

The idea was automating a manually process, without changing the release process significantly.

For example, rather than tagging it at Github and produce the artifact on local dev machine. A workflow will be triggered instead, building and [uploading the artifact to the release page](https://github.com/actions/upload-release-asset).

This save time on manually building the project as well as using **Github** to share build artifact with deployment team. The ability to manually create release, such as hotfix on a different branch, was preserved. From here it is easy to [deliver new versions continuously](https://www.atlassian.com/continuous-delivery/principles/continuous-integration-vs-delivery-vs-deployment#:~:text=To%20put%20it%20simply%20continuous,except%20that%20releases%20happen%20automatically.).

### Integration with External Services ( i.e. Jira )

![Jira Releases Panel](/assets/git/jira-releases-panel.png)
![Enable Jira Releases Feature](/assets/git/jira-releases-feature.png)
![Jira Github Action Trigger Config](/assets/git/jira-github-action-trigger.png)

Github Actions can be triggered externally [by HTTP request](https://docs.github.com/en/rest/reference/actions#create-a-workflow-dispatch-event).

For example, with the **Releases** feature in Jira next-gen project, which can be served as central panel to easily trigger the release workflow. It is suitable in some environments, which requires accumulating few more changes before weekly delivery to QA.

> TODO: There will be a post in the future where I will go more in depth on how I setup Jira

## Use Github Actions With Github Packages To Create A Repository Of Modules

> With GitHub Packages, you can safely publish and consume packages within your organization or with the entire world. - [Github](https://github.com/features/packages)

A private package manager can utilized all the infrastructures and tooling already built for the open source version, which help the onboarding experience and further reduce the need to use **Git subtree** or monolithic repository architecture.

## Conclusion

In the series, a Git based development workflow, which use in conjunction with **Github** to manage and automate variety of tasks during development, was explored. From **committing** changes from a **branch**, then **push** it to **Github** and create a **Pull Request** to **merge**, to continuously build and deploy the project using **Github Actions**. It was also discussed utilizing Github as a collaboration platform to share knowledge.

> TODO - There are some Git features which I have left out but will cover in the future, because my usage for those features are getting fewer and farther between.
