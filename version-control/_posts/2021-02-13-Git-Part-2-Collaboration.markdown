---
layout: post
title: "Git - With Github - Part 2"
date: 2021-02-13 13:05:49 +1300
categories: Version-control
tags: git github github-desktop
---

![Github New Repo](/assets/git/github-new-repo-1.png)

This is the 2nd part on source control introduction.

* [Part 1 - Get Started]({% post_url version-control/2021-02-08-Git-Part-1-Get-Started %})
* [Part 2 - Git With Github (You are here)]({% post_url version-control/2021-02-13-Git-Part-2-Collaboration %})
* [Part 3 - Git Branching]({% post_url version-control/2021-03-03-Git-Part-3-Git-Branching %})
* Part 4 - Github Deep Dive
* Part 5 - How to Pull Request
* Part 6 - Git Tips

There is come a time where you are going to work in a team environment, or you working between multiple locations. A git service provider is going to help serve as a central place to share your work.

```bash
                                                                   
                                                                   
                          +----------+                             
                          |  Github  |                             
                          +----------+                             
                          --       \-                              
                        -/           \-                            
                     --/               \-                          
                +---/------+     +-------\--+                      
                |  PC - 1  |     |  PC - 2  |                      
                +----------+     +----------+                      
                                                                   
                                                                   
```

There are many consideration when picking a git service provider, such as support for private repositories, service availability and features. You can even [host your own](https://hub.docker.com/r/gitlab/gitlab-ee/)! It the future I will talk about my experience on set up different service provider ( BitBucket and Github ) for work environment.

This blog will just focusing on the basic features of those service. Github is very popular, if not the most popular service provider, which I will be using it with Github Desktop in the following blogs, and the knowledge should be transferable.

## Prerequisite

1. [Github](https://github.com/)
1. [Github Desktop](https://desktop.github.com/) or [Linux variant here](https://github.com/shiftkey/desktop)

## Github Desktop To Create Repository

If you have followed [part 1]({% post_url version-control/2021-02-08-Git-Part-1-Get-Started %}). You can open Github Desktop and hit that **Publish repository** button. It will do all the magic for you. Which make creating new repository a lot easier.

> Tip - Give your project a good name while you are here will definitely helps in the future.

![Github Desktop Create and Push Repository](/assets/git/github-desktop-create-repo-1.png)

![Github Desktop Create and Push Repository](/assets/git/github-desktop-create-repo-2.png)

---

## What is It Actually Doing?

If you are not using github desktop, you can achieve the same results with following steps.

### 1) Create a New Repository at Github

There are 2 options, **Add a README file** & **Add .gitignore**, which we will discuss later.

![Github Create Repo - 1](/assets/git/github-new-repo-2.png)

### 2) Set Your Local Repository Pointing to Github

![Github Create Repo - 2](/assets/git/github-new-repo-3.png)

```bash
git branch -M main
git remote add origin https://github.com/kaga/my-first-repo.git
```

> *Master* used to be the terminology to describe the main branch of a repository. The community is slowly transitioning from *Master* to *Main*. [See this github post for detail](https://github.blog/2020-07-27-highlights-from-git-2-28/)

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

It is usually render as the first page when visiting repository's page. Since it is usually the first document a newly onboard developer read about your project. It is very important to keep this file up-to-date and include all relevant information for your target audience.

Here is some of the information I usually include:

* An overview for this project
* Project statuses
* How to run the application
* How to setup development environment
* How to run unit test the application
* How to manually build the application for deployment
* Common Setup Issues and Solutions
* Deployment Environment

There are many great resources for how to create a good readme document. Such as this one [makeareadme.com](https://www.makeareadme.com/)

**A picture is worth a thousand words**. Try [mermaid](https://mermaid-js.github.io/mermaid-live-editor/) to generate some charts.

## How About **.gitignore**

This is a file where you tell git to ignore certain files, but if those files were added to git before updating the .gitignore file, Git is going to keep track changes once it was removed.

A common file to .gitignore would be:

* IDE generated files (i.e. .idea)
* OS generated files (i.e. .DS_Store)
* Build folders (i.e. build)
* Sensitive Information (i.e. keystore, private keys, passwords)
* File that unique to each development environment (i.e. local.properties points to android sdk location)

```.gitignore
# Example .gitignore
# See https://help.github.com/articles/ignoring-files/ or https://git-scm.com/docs/gitignore for more about ignoring files.

# dependencies
/node_modules

# testing
/coverage

# production
/build

# misc
.DS_Store
.env.local
.env.development.local
.env.test.local
.env.production.local

npm-debug.log*
yarn-debug.log*
yarn-error.log*
.eslintcache

```

> Tip - The git changes UI should only contain your code changes, that will keep it easier for you to review later on.

## Pulling Changes Into Your Local Environment `git pull`

Once you start collaborating, you can **pull** to get the latest changes. Most GUI clients, such as Github Desktop, will notify you when there are new changes. In a time where I am building a feature in a team environment. I would pull at each morning to make sure I am up-to-date.

![github desktop clone repo](/assets/git/github-desktop-clone.png)

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

## Tags `git tag`

Tag is a great way to identify a major milestones of your project.

Although you can use command line to start tagging ( `git tag -a v1.0.0 -m "version 1.0.0"` ), I actually recommend using github releases to create the tag. As we can utilize Github Actions to drive more automation.

![Github Create Release - 1](/assets/git/github-release-1.png)

See [Github Managing Releases](https://docs.github.com/en/github/administering-a-repository/managing-releases-in-a-repository)

## Get a Fresh Copy `git clone`

Last but not least, for sharing the repository you can share the repository url and everything should be self-explaining by **readme.md**.

> Tip - When the newly onboard developer is having trouble following the **readme.md**. Try having them to update it so the next onboarding experience is smoother. It is also a great opportunity for the new member too.

![Github Clone](/assets/git/github-clone.png)

```bash
➜  GitHub git clone git@github.com:kaga/my-first-repo.git
Cloning into 'my-first-repo'...
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 3 (delta 0), pack-reused 0
Receiving objects: 100% (3/3), done.
```
