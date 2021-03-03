---
layout: post
title:  "Git - Get Started - Part 1"
date:   2021-02-08 12:05:49 +1300
categories: Version-control
tags: git
---

![Reddit Meme](/assets/git/reddit-meme.jpg)
[From Reddit](https://www.reddit.com/r/ProgrammerHumor/comments/9cakf8/laughs_in_source_control/)

Have you used some software that once you saved the file, you cannot go back to previous saved version? You might copy the file and start naming the file like this.

```bash
file-name-v1.doc
file-name-v2.doc
file-name-v3.doc
file-name-v4.doc
file-name-v5.doc
```

This is a multi-part introduction on source control ( or version control ). This is aimed for someone that never used version control before. May be you are a graphic designer dealing with image files, or a graduated developer starting out a career.

There are many version control softwares available on the market, but I will just focusing on [Git](https://git-scm.com/) alone. Git has becoming very popular in the last few years and it is easier to find learning resource.

* [Part 1 - Get Started (You are here)]({% post_url version-control/2021-02-08-Git-Part-1-Get-Started %})
* [Part 2 - Git With Github]({% post_url version-control/2021-02-13-Git-Part-2-Collaboration %})
* [Part 3 - Git Branching]({% post_url version-control/2021-03-03-Git-Part-3-Git-Branching %})
* Part 4 - Github Pull Request
* Part 5 - Github Actions
* Part 6 - Git Tips

## What is Git, and Why?

> Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency. [git-scm.com](https://git-scm.com/)

**Distributed version control system** means files and its history are mirrored to your computer. It lets you work offline and not depending on connectivity to a central server.

Whether you are working in a team environment with multiple contributors, or working solo in multiple locations. Git let you work simultaneously with ease* (Checkout part 6 if you want to know more).

Although Git is not a replacement to backup. It helps keeping disruption to a minimum when your computer or server eventually breakdown in the least expected time.

Git usually associated with software development, but it supports all files.

---

## How to use it ( GUI )

It is very easy to get started with a graphical user interface client, here are some of the standalone clients that I recommend.

![Github Desktop](/assets/git/github-desktop.png)

1. [Github Desktop](https://desktop.github.com/)
1. [Sourcetree](https://www.sourcetreeapp.com/)

![VSCode](/assets/git/vscode-commit.png)

> I am getting increasingly dissatisfy with the recent releases of Sourcetree. It has becoming slower and [not available on Linux](https://community.atlassian.com/t5/Sourcetree-questions/SourceTree-for-Linux/qaq-p/255473). I have been transitioning to built-in solution from IDEs (Android Studio & Visual Studio Code) as well as Github Desktop.

Github Desktop covers most of the day to day use cases and it is constantly improving. For new user starting out, I would strongly recommend trying out Github Desktop first. If you are using Android Studio ( [Intellij](https://www.jetbrains.com/idea/) ) or [Visual Studio Code](https://code.visualstudio.com/), give the built-in tool a try too.

### Adding a New Repository

In Git terms, a repository ( or repo in short ) means a project or a single piece of software ( i.e. An app, a service ). Git works on a folder. While you cannot select a single file as a "Repo", but you can select a folder one and start tracking that file.

you can choose to try it on a new project before making a decision to migrate everything. You don't even need to decide on which service provider ( i.e. Github, BitBucket, Gitlab ) just yet. you can try it locally first.

![Github Desktop - New Repository](/assets/git/github-new-repo.png)

### Commit / Saving Changes

![Commit Message](/assets/git/github-desktop-commit-message.png)

Once you have a repository, you can start committing! Although I recommend to keep short message for reference in the future, you can just use the default message.

---

## How to use it ( Command Line )

For those who do software development, I would strongly recommend trying out the command lines to better understand what is happening behind the scene.

### Installation

The official page [git-scm.com](https://git-scm.com/downloads) is a good start.

```bash
➜  ~ which git
/usr/bin/git
```

### Starting a New Project

```bash
➜  ~ cd git-example 
➜  git-example git init
Initialized empty Git repository in /git-example/.git/
```

### Create a New File

```bash
➜  git-example git:(master) echo "this is my first git commit" > readme.md
➜  git-example git:(master) ✗ ls
readme.md
➜  git-example git:(master) ✗ cat readme.md 
this is my first git commit
```

### `git add <file>`

```bash
➜  git-example git:(master) ✗ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
    readme.md

nothing added to commit but untracked files present (use "git add" to track)
➜  git-example git:(master) ✗ git add readme.md
```

### `git commit -m`

```bash
➜  git-example git:(master) ✗ git commit -m "this is my first commit"
[master (root-commit) 4783bf0] this is my first commit
 1 file changed, 1 insertion(+)
 create mode 100644 readme.md
```

---

## Commit History

![Github Desktop - 1st cmd commit](/assets/git/github-desktop-first-commit.png)

Once you have committed, it looks like this in Github Desktop. You can see your file change history here, go back and get that specific version. You can experiment as much as you want without fear of modified the known good version.

That's it! Remember to **commit early commit often. Keep committing**.

[Getting Started - About Version Control](https://git-scm.com/book/en/v2/Getting-Started-About-Version-Control)
