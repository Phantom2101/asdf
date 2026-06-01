Experiment 1: Linux Commands for DevOps
Objective

Learn basic Linux commands used by DevOps engineers for:

File management
Process management
Software installation
Searching logs
Network troubleshooting
Where to Perform
Ubuntu Linux
WSL (Windows Subsystem for Linux)
Virtual Machine

Part 1: Directory Management
Create Directory
mkdir mydir

What happens?

Linux creates a folder named mydir

Verify:

ls
Create Multiple Directories
mkdir dir1 dir2 dir3

Creates three folders at once.

Enter Directory
cd mydir

Changes current working directory.

Check location:

pwd

Example Output:

/home/user/mydir
Part 2: File Management
Create File
touch file.txt

Creates an empty file.

Verify:

ls
Write Data
echo "Hello World" > file.txt

What happens?

Creates content inside file
Overwrites previous content
Append Data
echo "New Line" >> file.txt

Adds content without deleting old data.

View File
cat file.txt

Output:

Hello World
New Line
Part 3: Copy and Move
Copy File
cp file.txt backup.txt

Creates duplicate copy.

Move File
mv file.txt newfile.txt

Renames file.

Part 4: Delete
rm file.txt

Delete file.

rm -r folder

Delete folder recursively.

Part 5: Install Software
sudo apt update

Updates package list.

Install Git:

sudo apt install git

Install Docker:

sudo apt install docker.io
Part 6: Search Logs
grep error logfile.txt

Searches "error".

Part 7: Processes
ps -e

Shows running processes.

Filter:

ps -e | grep ssh
Part 8: Network Testing
ping google.com

Checks internet connectivity.

What Examiner May Ask
What is Linux?

Open-source operating system.

What is grep?

Search utility.

What is pipe?

Transfers output from one command to another.

Experiment 2: Git Staging, Commit and Push
Objective

Store source code and maintain version history.

Where?

Git Bash / Terminal

Step 1: Initialize Repository

Create folder:

mkdir MyProject
cd MyProject

Initialize Git:

git init

What happens?

Git creates:

.git

hidden directory.

This stores all version history.

Step 2: Create File
touch HelloWorld.java
Step 3: Check Status
git status

Output:

Untracked files:
HelloWorld.java
Step 4: Stage File
git add HelloWorld.java

or

git add .

What happens?

File moves to staging area.

Step 5: Commit
git commit -m "Initial Commit"

Git creates permanent snapshot.

Step 6: Connect GitHub
git remote add origin URL

Example:

git remote add origin https://github.com/user/project.git
Step 7: Push
git push -u origin main

Uploads code to GitHub.

Internal Git Flow
Working Directory
       ↓
git add
       ↓
Staging Area
       ↓
git commit
       ↓
Local Repository
       ↓
git push
       ↓
GitHub Repository
Experiment 3: Branching and Forking
Objective

Allow multiple developers to work independently.

Create Branch
git branch feature

Creates branch.

Switch Branch
git checkout feature

Now working inside feature branch.

Add Changes
echo "Feature" > feature.txt

Commit:

git add .
git commit -m "Added feature"
Merge

Return to main:

git checkout main

Merge:

git merge feature

Changes move into main.

Forking

Performed on GitHub.

Click:

Repository
↓
Fork

GitHub copies repository to your account.

Difference
Branch	Fork
Same repository	Different repository
Internal development	External contribution
Experiment 4: Jenkins CI/CD
Objective

Automate build and deployment.

Where?

Jenkins Dashboard

http://localhost:8080
Step 1: Install

Install:

Java
Git
Jenkins
Step 2: Create Java Program
public class HelloWorld {
 public static void main(String[] args){
  System.out.println("Hello Jenkins");
 }
}
Step 3: Push to GitHub
git add .
git commit -m "Initial"
git push
Step 4: Create Jenkins Job
New Item
↓
Freestyle Project
Step 5: Configure GitHub URL

Source Code Management

Git Repository URL
Step 6: Build Step
javac HelloWorld.java
java HelloWorld
Step 7: Build Now

Jenkins:

Pulls code
Compiles code
Runs code
CI/CD Flow
Developer
↓
GitHub
↓
Jenkins
↓
Build
↓
Test
↓
Deploy
Experiment 5: Docker Commands
Objective

Learn Docker basics.

What is Docker?

Platform for containerization.

Download Image
docker pull ubuntu:20.04

Downloads Ubuntu image.

View Images
docker images
Run Container
docker run --name mycontainer -it ubuntu:20.04 /bin/bash

Creates and starts container.

View Running Containers
docker ps
View All Containers
docker ps -a
Stop Container
docker stop mycontainer
Remove Container
docker rm mycontainer
Remove Image
docker rmi ubuntu:20.04
Docker Architecture
Docker Image
      ↓
docker run
      ↓
Docker Container
Experiment 6: Docker Containerization
Objective

Run Java application inside Docker.

Create Java File
public class HelloWorld{
 public static void main(String[] args){
  System.out.println("Hello Docker");
 }
}
Create Dockerfile
FROM eclipse-temurin:11

WORKDIR /app

COPY HelloWorld.java /app/

RUN javac HelloWorld.java

CMD ["java","HelloWorld"]
Build Image
docker build -t myjavaimage .

What happens?

Downloads Java image
Copies Java file
Compiles Java file
Creates image
Run Container
docker run myjavaimage

Output:

Hello Docker
Internal Flow
Dockerfile
     ↓
docker build
     ↓
Docker Image
     ↓
docker run
     ↓
Docker Container
Experiment 7: Maven Build Lifecycle
Objective

Automate Java project build.

Maven Structure
src/
 ├── main/
 └── test/

pom.xml
pom.xml

Contains:

dependencies
plugins
project information
Lifecycle
Clean
mvn clean

Deletes old build files.

Validate
mvn validate

Checks pom.xml.

Compile
mvn compile

Converts:

.java → .class
Test
mvn test

Runs tests.

Package
mvn package

Creates JAR.

Install
mvn install

Stores JAR in local repository.

Build Flow
Source Code
      ↓
Compile
      ↓
Test
      ↓
Package
      ↓
Install
Experiment 8: Selenium Testing
Objective

Automate browser testing.

Components
Selenium

Automation framework.

WebDriver

Controls browser.

ChromeDriver

Connects Selenium and Chrome.

Example

Open browser:

driver.get("https://google.com");
Run
mvn test
What Happens?
Java Program
      ↓
WebDriver
      ↓
Chrome Browser
      ↓
Website Opens
Login Test

Steps:

Open website
Enter username
Enter password
Click login
Verify result
Experiment 9: TestNG
Objective

Run automated tests.

Annotation Lifecycle
@BeforeSuite
↓
@BeforeClass
↓
@BeforeMethod
↓
@Test
↓
@AfterMethod
↓
@AfterClass
↓
@AfterSuite
Example
@Test
public void testAddition(){
 Assert.assertEquals(10+5,15);
}
DataProvider
@DataProvider

Provides multiple datasets.

Example:

{1,2,3}
{5,5,10}
Report Generation
mvn test

Report location:

target/surefire-reports
Experiment 10: Complete DevOps Lifecycle

This is the integration of all previous experiments.

Architecture
Developer
    ↓
Git
    ↓
GitHub
    ↓
Jenkins
    ↓
Maven
    ↓
TestNG
    ↓
Docker
    ↓
Deployment
Step 1: Create Web Application

Java Servlet.

Step 2: Commit Code
git add .
git commit -m "Initial Commit"
Step 3: Push
git push

GitHub receives code.

Step 4: Jenkins Detects Change

Poll SCM:

* * * * *

Jenkins checks GitHub every minute.

Step 5: Maven Executes
mvn clean
mvn compile
mvn test
mvn package

Builds WAR file.

Step 6: TestNG Executes

Runs automated tests.

Step 7: Docker Build
docker build -t devopsapp .

Creates image.

Step 8: Deploy
docker run -d -p 8085:8080 devopsapp

Application becomes accessible in browser.

Most Important Viva Question

"Explain the complete DevOps lifecycle."

Answer:

Developer writes code → Git tracks changes → GitHub stores code remotely → Jenkins automatically pulls code → Maven compiles and packages application → TestNG runs tests → Docker containerizes application → Application is deployed and available to users.
