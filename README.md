# springbootgithub
GitHub - Version/Code Control Management

Basic Commands:

1. git init
Initializes a new Git repository in the current directory.

2. git clone [repository-url]
Creates a local copy of a remote repository.

3. git add [file]
Stages changes in the specified file for the next commit.

4. git commit -m "[message]"
Records staged changes with a descriptive message.

5. git status
Displays the status of the working directory and staging area.

6. git log
Shows the commit history.

Branching and Merging:

1. git branch
Lists all branches or creates a new branch if a name is provided.

2. git checkout [branch]
Switches to the specified branch.

3. git switch [branch]
Another way to switch branches (newer Git versions).

4. git merge [branch]
Merges the specified branch into the current branch.

Remote Repositories:

1. git remote -v
Lists remote connections (e.g., origin).

2. git fetch [remote]
Downloads objects and refs from a remote repository.

3. git pull
Fetches and integrates changes from a remote repository into the current branch.

4. git push [remote] [branch]
Uploads commits from the local branch to the remote branch.

Undoing Changes:

1. git reset [file]
Unstages a file but keeps the changes in the working directory.

2. git reset --hard [commit]
Resets the repository to a specific commit, discarding all changes.

3. git revert [commit]
Creates a new commit that undoes the changes of a specific commit.

4. git stash
Temporarily saves changes that are not ready to be committed.

5. git stash pop
Applies the stashed changes back to the working directory.

Viewing and Comparing:

1. git diff
Shows the differences between files in the working directory and the staging area.

2. git show [commit]
