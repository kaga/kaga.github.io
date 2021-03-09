---
layout: post
title:  "Git - Tips & Tricks - Part 6"
date:   2021-02-08 12:05:49 +1300
categories: Version control
---

## Merge Conflicts

## Renaming Files

## Git LFS

## 

---

Code Sharing

- Packages
    - npm
    - nuget
    - maven

- Git Subtree

- Git Submodule

## Commit Tips

### File Line-Ending

[Handle Line Ending](https://docs.github.com/en/github/using-git/configuring-git-to-handle-line-endings)

While you are here, set the [newline at end of file](https://thoughtbot.com/blog/no-newline-at-end-of-file) too.

### Renaming Files `git mv`

There will be a time where you would like to relocate a file into different folders 

This will help tracking the file changes over long period of time.
files that relocated into different folders

> Tip - Commit Changes Before Renaming

#### It is Sightly Trickier For Changing Letter Case

1. Commit changes first
1. Rename the file to something else, commit
1. Rename teh file to correct letter case, commit

I recently had an experience where the code looks like this, and because this feature was not used,

a way to easily find out the reason for this change was no longer possible
