---
layout: post
title:  "Git - Branching - Part 3"
date:   2021-03-02 12:05:49 +1300
categories: Version-control
tags: git
---

This is the 3rd part on source control introduction.

* [Part 1 - Get Started]({% post_url version-control/2021-02-08-Git-Part-1-Get-Started %})
* [Part 2 - Git With Github]({% post_url version-control/2021-02-13-Git-Part-2-Collaboration %})
* [Part 3 - Git Branching (You are here)]({% post_url version-control/2021-03-03-Git-Part-3-Git-Branching %})
* Part 4 - Github Deep Dive
* Part 5 - How to Pull Request
* Part 6 - Git Tips

I found with Part 1 and Part 2 alone, which we have explored the basic usage of git and github, are suffice for starting out. The following parts are slightly more advance and beneficial working in a larger team environment.

## Branching `git checkout -b`

> Branching means you diverge from the main line of development and continue to do work without messing with that main line. [Git Branching - Branches in a Nutshell](https://git-scm.com/book/en/v2/Git-Branching-Branches-in-a-Nutshell)

In general, I would like to keep the **main** branch store the latest stable version of the code base.

It is a safe base where I can:

* experiment a feature
* a feature needs to wait for other features to complete
* concurrent development with one developer works on feature A, and another developer works on feature B
* represent the corresponding state in a multi-landscape architecture, such as SAP

```bash
                                                             
                                                             
                                                             
 +---+             +---+              Main             +---+ 
 |   |--------------   \--------------------------------   - 
 +--\+            /+---+-\                           -/+---+ 
     -\          /        -\                        /        
       -\  +---+/           -\+---+          +---+-/         
         --|   /              -  -------------   /           
           +---+              +---+          +---+           
                                                             
         Feature A                 Feature B                 
                                                             
                                                             
```

This is how a typical branching looks like, where **Feature A** is developed on a separate branch, and merge back to the **main** branch. In the graph, **Feature B** is started after **Feature A** completed, but it is possible to start **Feature A** and **Feature B** at the same time.

```bash
                                                             
+---+        Main         +---+       +---+                  
|   |---------------------|   |-------|   |                  
+---\                   -/+---+      /+---+                  
  \  ---\             -/            /                        
   \     ---\ +---+ -/             /                         
    \        --   -/              /                          
     \        +---+              /                           
      \     Feature A           /                            
       \                       /                             
        \                     /                              
         \+---+        +---+ /                               
          |   |--------+   |/                                
          +---+        +---+                                 
              Feature B                                      
                                                             
```

### Creating a Branch

```bash
➜  git-example git:(master) git checkout -b some-other-feature
Switched to a new branch 'some-other-feature'
```

![github-desktop-create-branch-1](/assets/git/github-desktop-create-branch-1.png)

![github-desktop-create-branch-2](/assets/git/github-desktop-create-branch-2.png)

> Tip - Put issue tracking reference, [such as jira reference](https://support.atlassian.com/jira-cloud-administration/docs/enable-smart-commits/), in a branch name to enable automation
> i.e. JIRA-123-Feature-A
>
> Tip - With Jira and BitBucket integration, you can create branch from Jira, with suggested name.

### How about larger feature

It is possible to create a branch based on a branch

```bash
                                                                                                   
                                                                                                   
+---+                                       Main                                              +---+
|   |------------------------------------------------------------------------------------------   |
+--\+                                                                                      -/ +---+
    -\                                                                                  --/        
      -\ +---+      A Large Feature         +---+                               +---+ -/           
        --   --------------------------------   ---------------------------------   -/             
         +---+\                           -/+---+-\                          -/ +---+              
               -\                        /         \                      --/                      
                 \+---+           +---+-/           -\+---+       +---+ -/                         
                  -   -------------   /               -   ---------   -/                           
                  +---+           +---+               +---+       +---+                            
                        Feature A                         Feature B                                
                                                                                                   
                                                                                                   
                                                                                                   
```

## Merging `git merge`

Create a branch working on a feature means there is a point in time to bring it back to the **main** branch.

There is a way to merge using command line and github desktop, but using Github to do it is highly recommended.

```bash
➜  git-example git:(some-other-feature) git checkout master 
Switched to branch 'master'
Your branch is up to date with 'origin/master'.
➜  git-example git:(master) git merge some-other-feature 
Updating 48c008d..ed50239
Fast-forward
 readme.md | 2 +-
 1 file changed, 1 insertion(+), 1 deletion(-)
```

### Use Github To Merge

Github use the term **Pull Request**, but ignore the name and associate features for now.

Here are the steps:

1. Create Pull Request from Github Desktop, or in repository's **Pull Requests** at Github
1. Select **Create Pull Request**
1. Click **Merge**

Using Github to merge branch has a **Files changed** feature, which can be used to review the changes before merging to **main**.

Github also provide a way to **Delete Branch** to keep the git repo clean and tidy.

![Github Create PR](/assets/git/github-desktop-create-pr.png)

## Handling Merge Conflicts

![git merge conflict warning](/assets/git/git-merge-conflict-1.png)

Sometimes Git just couldn't handle the merge automatically and require your attention.

A common cause of conflict is modifying the same line from 2 branches, or a massive rename on variable, function names.

It is possible to use any text editor to resolve the conflicts, and I prefer using Visual Studio Code. Some IDEs, such as Android Studio, are excellent in resolve those conflicts automagically, but it is important to review what the tool has done. It might be decided to delete changes from 1 side and keep the other.

![git merge conflict 2](/assets/git/git-merge-conflict-2.png)

![git merge conflict 3](/assets/git/git-merge-conflict-3.png)

In other cases, there will be no merge conflict warnings. It is usually comes from relocate files to a different directory while modifying it at the same time.

Here is some of the advices I think it is useful in reducing merge conflicts.

### Keep Branch and Changes Small

> the only way you can make good at branching is to break down changes to smaller pieces and then break down some more.

A piece of work can be broken down into many features, which a feature can be a separate branch and completed in few weeks. Later a feature can be broken down into many stages, which a stage can be a separate branch and completed in few days or even few hours.

It is not a game. A developer that create and merge a branch in 5 minutes is not a better developer than the one that open a branch for 2 weeks.

### Pull Changes Frequently

With few developers working on a project, it is common to have tens of, if not hundreds of, changes merging back to **main** branch. Keeping your working branch up to date and handle merge conflicts in small and frequently will help.

I usually pull the latest changes at least once a day, first thing in the morning. Sometimes I would do it as I commit changes when working closely with another team member.

## Reference

[Github Flow](https://guides.github.com/introduction/flow/)
[Git Branching Basic](https://git-scm.com/book/en/v2/Git-Branching-Basic-Branching-and-Merging)
[Atlassian Gitflow](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow#:~:text=Gitflow%20Workflow%20is%20a%20Git,designed%20around%20the%20project%20release.)
