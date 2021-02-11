---
layout: post
title: "Git - Working With Others - Part 2"
date: 2021-02-10 23:05:49 +1300
categories: Version control
---

![Github New Repo](/assets/git/github-new-repo-1.png)

This is the 2nd part on source control introduction.

- [Part 1 - Get Started](https://kaga.github.io/version/control/2021/02/07/Git-Part-1-Get-Started.html)
- Part 2 - Working with Others
- Part 3 - Git Deep Dive
- Part 4 - Github Deep Dive
- Part 5 - How to Pull Request
- Part 6 - Git Tips

There is come a time where you are going to work in a team environment, or you working between multiple locations. A git service provider is going to help serve as a central place to share your work.

There are many consideration when picking a git service provider, such as support for private repositories, service availability and features. You can even [host your own](https://hub.docker.com/r/gitlab/gitlab-ee/)! It the future I will talk about my experience on set up different service provider ( BitBucket and Github ) for my work environment.

This blog will just focusing on the basic features of those service. Github is very popular, if not the most popular service provider, which I will be using it with Github Desktop in the following blogs.

[Sign up here if you haven't already](https://github.com/).

## Github Desktop To Create Repository

If you have followed [part 1](https://kaga.github.io/version/control/2021/02/07/Git-Part-1-Get-Started.html). You can open Github Desktop and hit that _publish_ button. It will do all the magic for you. Which make creating new repository a lot easier.

![Github Desktop Create and Push Repository](/assets/git/github-desktop-create-repo-1.png)

![Github Desktop Create and Push Repository](/assets/git/github-desktop-create-repo-2.png)

> Tip - Give your project a good name while you are here will definitely helps in the future.

---

## What is It Actually Doing?

If you are not using github desktop, you can achieve the same results with following steps.

### 1) Create a New Repository at Github

![Github Create Repo - 1](/assets/git/github-new-repo-2.png)

There are 2 options, **Add a README file** & **Add .gitignore**, which we will discuss later.

### 2) Set Your Local Repository To Point to Github

![Github Create Repo - 2](/assets/git/github-new-repo-3.png)

```bash
git branch -M main
git remote add origin https://github.com/kaga/my-first-repo.git
```

> *Master* used to be the terminology to describe the main branch of a repository. The community is slowly transitioning from *Master* to *Main*. [See this github post for details](https://github.blog/2020-07-27-highlights-from-git-2-28/)

### 3) Push Your Local Repository To Github

```bash
➜  my-first-repo git:(main) git push -u origin main
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 214 bytes | 214.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/kaga/my-first-repo.git
 * [new branch]      main -> main
Branch 'main' set up to track remote branch 'main' from 'origin'.
```

## What is **README.md**?

It is usually render as the first page when going to a repository. It is usually the first document a developer read about your project. It is very important to keep this file up-to-date and include all relevant information for your target audience.

Here are some of the information I usually includes:

- An overview for this project
- Project statuses
- How to run the application
- How to setup development environment
- How to run unit test the application
- How to manually build the application for deployment
- Common Setup Issues
- Deployment Environment

There are many great resources for how to create a good readme document. Such as this one [makeareadme.com](https://www.makeareadme.com/)

## How About **.gitignore**

This is a file where you tell git to _ignore_. Git will not monitor any changes to ignored files or folders. But if those files added to git before updating the .gitignore file, Git is going to track changes until it was removed.

A good candidates for .gitignore would be:

- IDE generated files (i.e. .idea)
- OS generated files (i.e. .DS_Store)
- Build folders (i.e. build)
- Sensitive Information (i.e. keystore, private keys, passwords)
- File that unique to each development environment (i.e. local.properties points to android sdk location)

It can support quite complex pattern matching, check [this](https://git-scm.com/docs/gitignore) out for details.

The git changes UI should only contain your code changes, that will keep it easier for you to review later on.

## Clone

![Github Clone](/assets/git/github-clone.png)

For sharing the repository, you can share the repository url and everything else should be self-explaining.

```bash
➜  GitHub git clone git@github.com:kaga/my-first-repo.git
Cloning into 'my-first-repo'...
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 3 (delta 0), pack-reused 0
Receiving objects: 100% (3/3), done.
```

## Pulling Changes Into Your Local Environment

Once you start collaborating, you can pull to get the latest changes. Most GUI clients, such as Github Desktop, will notify you when there are new changes. In a time where I was involved in building a feature in a team environment. I would pull at each morning to get myself up-to-date.

```bash
➜  git-example git:(master) git pull

remote: Enumerating objects: 5, done.
remote: Counting objects: 100% (5/5), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), 632 bytes | 316.00 KiB/s, done.
From https://github.com/kaga/git-example
   4783bf0..48c008d  master     -> origin/master
Updating 4783bf0..48c008d
Fast-forward
 readme.md | 2 +-
 1 file changed, 1 insertion(+), 1 deletion(-)
```

## Tags

Tag is a great way to identify a major milestone of your project.

Although you can use command line to start tagging ( `git tag -a v1.0.0 -m "version 1.0.0"` ), I actually recommend using github releases to create the tag. As we can utilize Github Actions to drive more automation.

![Github Create Release - 1](/assets/git/github-release-1.png)

[Github Managing Releases](https://docs.github.com/en/github/administering-a-repository/managing-releases-in-a-repository)
