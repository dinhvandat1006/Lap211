@echo off
echo Initializing Git repository for CSD201...

:: Initialize Git repository
git init

:: Add all files
git add .

:: Prompt user for commit message
set /p commitMessage="Enter your commit message: "

:: Create initial commit with user input
git commit -m "%commitMessage%"

:: Add GitHub remote (replace YOUR_USERNAME with actual GitHub username)
git remote add origin https://github.com/dinhvandat1006/Lap211.git

:: Push to GitHub
git push -u origin main