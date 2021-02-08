---
layout: post
title:  "Git - Get Started - Part 1"
date:   2021-02-08 12:05:49 +1300
categories: Version control
---

Have you used some software that once you saved the file, you cannot go back to previous saved version? You might copy the file and start naming the file like this.

```bash
file-name-v1.doc
file-name-v2.doc
file-name-v3.doc
file-name-v4.doc
file-name-v5.doc
```

This is a multi-part introduction on source control ( or version control ). This is aimed for someone that never used version control before. May be you are a graphic designer dealing with image files, or a graduated developer starting out a career.

There are many version control softwares available on the market, but I will just focusing on [Git](https://git-scm.com/) alone. Git has becoming very popular in the last few years and it is easier to find resource online.

Part 1 - Get Started
Part 2 - Working with Others
Part 3 - Git Deep Dive
Part 4 - Github Deep Dive
Part 5 - How to Pull Request
Part 6 - Git Tips

## What is Git, and Why?

> Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency.

**Distributed** means files and its history are mirrored to your computer. It lets you work offline and not depending on connectivity to a central server.

Whether you are working in a team environment with multiple contributors, or working solo in multiple locations. Git let you work simultaneously with ease*.

Although Git is not a replacement to backup solutions. It helps keeping disruption to a minimum when storage device eventually breakdown in the least expected time.

Git usually associated with software development, but it supports all files.

## How to use it (GUI)

It is very easy to get started with a graphical interface client, here are some of the clients that I recommend.

![Github Desktop](/assets/git/github-desktop.png)

1. [Github Desktop](https://desktop.github.com/)
1. [Sourcetree](https://www.sourcetreeapp.com/)

I am getting increasingly dissatisfy with the recent releases of Soucetree. It has becoming slower and less reliable. I have been transitioning to built-in solution from IDE (Android Studio & Visual Studio Code) as well as Github Desktop. Github Desktop covers most of the day to day use case and it is constantly improving. For new user starting out, I would strongly recommend trying out Github Desktop first.

### Adding a New Repository

In Git term, a repository ( or repo in short ) could mean a project or a single piece of software ( i.e. An app, a service ).

Git works on a folder. While you cannot select a single file as a "Repo", but you can select a folder one and start tracking that file.

you can choose to try it on a new project before making a decision to migrate everything. You don't even need to decide on which service provider ( i.e. Github, BitBucket, Gitlab ) just yet. you can try it locally first.

![Github Desktop - New Repository](/assets/git/github-new-repo.png)

### Commit / Saving Changes

Once you have a repository, you can start committing! Although I recommend to keep short message for reference in the future, you can just use the default message.

## How to use it (Command Line)

For those who do software development, I would strongly recommend trying out the command line version to better understand what is happening behind the scene.

### Installation

```bash
➜  ~ which git
/usr/bin/git
```

### Start a New Project

```bash
➜  ~ cd git-example 
➜  git-example git init
Initialized empty Git repository in /git-example/.git/
```

### First Commit

#### Create a New File

```bash
➜  git-example git:(master) echo "this is my first git commit" > readme.md
➜  git-example git:(master) ✗ ls
readme.md
➜  git-example git:(master) ✗ cat readme.md 
this is my first git commit
```

#### `git add <file>`

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

#### `git commit -m`

```bash
➜  git-example git:(master) ✗ git commit -m "this is my first commit"
[master (root-commit) 4783bf0] this is my first commit
 1 file changed, 1 insertion(+)
 create mode 100644 readme.md
```

## Commit History

![Github Desktop - 1st cmd commit](/assets/git/github-desktop-first-commit.png)

Once you have committed, it looks like this in Github Desktop. You can see your file change history here, go back and get that specific version.

## That's it

> Commit early commit often. Keep committing.

[Getting Started - About Version Control](https://git-scm.com/book/en/v2/Getting-Started-About-Version-Control)
