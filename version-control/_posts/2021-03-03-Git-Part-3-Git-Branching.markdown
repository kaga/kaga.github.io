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

* experiment a feature
* concurrent development with one developer works on feature A, and another developer works on feature B
* a feature needs to wait for other features to complete
* represent the corresponding state in a multi-landscape architecture, such as SAP

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

> Tip - Put issue tracking reference, [such as jira](https://support.atlassian.com/jira-cloud-administration/docs/enable-smart-commits/), in a branch name to enable automation

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




[Atlassian Gitflow](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow#:~:text=Gitflow%20Workflow%20is%20a%20Git,designed%20around%20the%20project%20release.)
