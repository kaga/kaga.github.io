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

main branch, pushing changes to github
marking some release

## Branching `git checkout -b`

```bash
                                                                                                     
                                                                                                     
                                                                                                     
 +---+             +---+              Main             +---+                                +---+    
 |   |--------------   \--------------------------------   ----------------------------------   |    
 +--\+            /+---+-\                           -/+---+ -\                           -/+---+    
     -\          /        -\                        /          -\                       -/           
       -\  +---+/           -\+---+          +---+-/             -\+---+        +---+ -/             
         --|   /              -  -------------   /                 -   ----------   -/               
           +---+              +---+          +---+                 +---+        +---+                
                                                                                                     
         Feature A                 Feature B                            Feature C                    
                                                                                                     
                                                                                                     
                                                                                                     
```

```bash
➜  git-example git:(master) git checkout -b some-other-feature
Switched to a new branch 'some-other-feature'
```

[Github Flow](https://guides.github.com/introduction/flow/)
[Git Branching Basic](https://git-scm.com/book/en/v2/Git-Branching-Basic-Branching-and-Merging)

Keeping change small

### How about larger feature

Create a new branch 

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

### Handling Hotfix / Patches

## Merging `git merge`

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


[Atlassian Gitflow](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow#:~:text=Gitflow%20Workflow%20is%20a%20Git,designed%20around%20the%20project%20release.)
