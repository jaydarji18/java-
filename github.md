## What is Git? 

Git is a **version control system**.

It helps you:
- Track code changes
- Work with a team
- Go back to old versions if something breaks
- Push code to GitHub / GitLab / Bitbucket

---

## Git Configuration (Email & Username) 

Before using Git, you must tell Git **who you are**.

### Check existing configuration
```bash
git config --list
```

Set username
```
git config --global user.name "Your Name"
```
Set email
```
git config --global user.email "your-email@gmail.com"
```
---

## Git Initialization 
Initialize Git in a project
```
git init
```

This creates a hidden .git folder
Now your project is a Git repository

---

## Git Status 
Shows the current state of files.

```
git status
```

It tells you:

- Which files are new
- Which files are modified
- Which files are staged (ready to commit)
- You will use this multiple times daily.
---

## Git Log 
Shows commit history.

```
git log
```

Simplified view:

```
git log --oneline
```
Useful to:

- See who committed
- See commit messages
- Track changes

---

## Basic Git Flow (Most Important) 
Daily Git flow:

```
Edit code → Add → Commit → Push
```

### Git Add 

Adds files to staging area.

Add specific file
```
git add fileName.java
```

Add all files
```
git add .
```

Think of staging as:

#### “Yes, I want to include these changes in next commit”



### Git Commit 

Saves changes locally with a message.

```
git commit -m "Added login validation"
```
---

## PULL, FETCH

### Git Pull 
Downloads latest changes from remote and merges them.

```
git pull origin main
```
#### Always run git pull before starting work.

### Git Fetch 

Fetch gets latest code without merging.

```

git fetch
```

##### Difference:
- pull = fetch + merge
- fetch = only download

--- 

## Branching 
Branch means working on a separate copy of code.

Create new branch
```
git branch feature-login
```

Switch branch
```
git checkout feature-login
```

OR (new way)
```
git switch feature-login
```

Create + switch together
```
git checkout -b feature-login
```
---

## Merging 
Merge combines one branch into another.

- Switch to main branch
- Merge feature branch
```
git checkout main
git merge feature-login
```

#### If conflict happens:

Git will show conflict

Manually fix code

Then:
```
git add .
git commit -m "Resolved merge conflict"
```
---
## Git Stash 
Used when:

You are working, Suddenly asked to switch branch, But your code is not ready to commit

Save changes temporarily:
```
git stash
See stash list
git stash list
Apply stash back
git stash apply
Apply and remove stash
git stash pop
```
