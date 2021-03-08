---
layout: post
title:  "Git - Github Actions - Part 5"
date:   2021-03-07 15:05:49 +1300
categories: Version control
---

![automate all the things](/assets/git/github-automate-all-the-things.jpeg)

This is the 5th part on source control introduction.

* [Part 1 - Get Started]({% post_url version-control/2021-02-08-Git-Part-1-Get-Started %})
* [Part 2 - Git With Github]({% post_url version-control/2021-02-13-Git-Part-2-Collaboration %})
* [Part 3 - Git Branching ]({% post_url version-control/2021-03-03-Git-Part-3-Git-Branching %})
* [Part 4 - Github Pull Request]({% post_url version-control/2021-03-07-Git-Part-4-Pull-Request %})
* [Part 5 - Github Actions (You are here)]({% post_url version-control/2021-03-07-Git-Part-5-Github-Action %})

In the last post on Github Pull Request, we explored using it as way to collaborate and less of a place to debate **"Tabs vs Spaces"** and **"Missing semicolon"**.

Github Actions is a cloud-hosted Continuous Integration( CI ) server, it is opposed to on-premise solutions such as Bamboo, TeamCity. It is like having an extra member in your team, which provide feedbacks in consistent, repeatable way.


I will try to avoid the specific usage of Github Actions as it is an evolving product, and I would like keep this post relevant for the next few years.

I have just used Github Actions for over 1 year now, and it is my first time using a cloud based CI service in anger. 

## Automate Everything



### Linter

> lint, or a linter, is a static code analysis tool used to flag programming errors, bugs, stylistic errors, and suspicious constructs. - [Wikipedia](https://en.wikipedia.org/wiki/Lint_(software))

It runs quickly, usually run quicker than compiling the program itself, and fails fast too. This **fail fast** approach allows quick feedback cycles.

```bash
➜  testmockk git:(main) ✗ ./gradlew lintKotlin

> Task :app:lintKotlinAndroidTest FAILED

/test_mockk/ExampleInstrumentedTest.kt:1:1: Lint error > [final-newline] 
    File must end with a newline (\n)

/test_mockk/ExampleInstrumentedTest.kt:3:1: Lint error > [import-ordering] 
    Imports must be ordered in lexicographic order without any empty lines 
    in-between with "java", "javax", "kotlin" and aliases in the end

/test_mockk/ExampleInstrumentedTest.kt:9:1: Lint error > [no-wildcard-imports] 
    Wildcard import

BUILD FAILED in 671ms
1 actionable task: 1 executed
```

*This example used [ktlint](https://github.com/pinterest/ktlint)*

Some language linter requires configuration, it is good to reference from a reputable tech companies, such as [Airbnb](https://github.com/airbnb/javascript), [Google](https://google.github.io/styleguide/jsguide.html). It is done to avoid arguing if certain formatting decision is right or wrong. It also allows new developers, who already familiar with those style guide, to pick up the source code quickly. It is even better if an opinionated linter is available.

![ktlint features](/assets/git/git-linter-features.png)

Some linter also provides built-in formatter as well, which make fixing those formatting issues hassle-free.

#### First Actions

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

> Tip - Github Actions is an evolving product and it is evolving fast. [Check documentation for up-to-date usage](https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions)

Github Actions can easily run those command-line programs, and it can accompany **readme.md** serving as a live documentation on how to run the project.

![Github Actions First Failure](/assets/git/github-actions-first-failure.png)

It is much slower to run on Github then on my local machine ( 40s vs 6s ), but when taking into account to checking out the exact commit,  



### Run Test



### Build Artifacts


Build Different Environments ( Dev / Test / Prod )

Secrets

> Tip - You can encode files with base64 before storing it in secrets

If the artifacts is supported by Github packages, try

## Badge Up



## Connecting Things Together

You can continous delivery 


### Github Pull Request



### Integration With Github Release

Dev Build in Master

> Tip - A personal access token needed to [enable triggering new workflows in a workflow](https://docs.github.com/en/actions/reference/events-that-trigger-workflows)

### External Integration Jira

> API

Release
Create Release

## Github Packages


