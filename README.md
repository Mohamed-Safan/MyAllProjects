# MyAllProjects
##  GetHub for beginners

## Step 1 

Open the Terminal

## Step 2

### If you have a project directory, just go to your terminal and in your project directory run the command

                 git init
                 
                 
### If you want to initialize your project with all of the files in your project directory, run
 
                 git init .

## Step 3

### Let’s say you have a folder for your project called “new_project.” You could head on over to that folder in your terminal window and add a local repository to it by running

               cd new_project
               git init
           
## Step 4 

### Now you have a new hidden directory called .git in your project directory. This is where Git stores what it needs so that it can track your project. Now you can add files to the staging area one by one with 

                git add <filename_one>
                
### or run

                 git add .

## Step 5

### to add all of your files to the staging area. You can commit these changes with the command


                git commit -m "<add a commit message here>"
     
## Step 6

### and if you have no issues in your changes you can run

              git push
        
### to push your changes through. You can check whether or not you have changes to push through any time by running              
                
                git status
    
## Step 7    
### If you made some changes, you can update your files on at a time with
        
             git add --all
             
 ## finally
 ### Then commit them with your commit message and push them through.
    
