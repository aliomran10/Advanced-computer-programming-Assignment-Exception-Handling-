# Advanced-computer-programming-Assignment-Exception-Handling-
This assignment requires you to write a program that can read and reorder containers in an ARXML file. ARXML stands for Autosar XML, which is a format used by AUTOSAR (AUTomotive Open System ARchitecture), a standardization initiative for the automotive industry.
# Task Description
Your program should perform the following steps:

- Read an ARXML file that contains a list of containers, each with a unique ID and a name sub-container “SHORT-NAME”.

- Reorder the containers alphabetically by their name sub-container “SHORT-NAME”.

- Write the reordered containers to a new ARXML file with the same name as the input file, but with “_mod.arxml” appended to it. For example, if the input file is “Rte_Ecuc.arxml”, the output file should be “Rte_Ecuc_mod.arxml”.
# Requirements
- The name of the arxml file shall be an argument which needs to passed through the command 
line.

- If the file is not having .arxml extension then you should trigger a user defined checked 
exception “NotVaildAutosarFileException”.

- If the file is empty, then you should trigger user defined unchecked exception 
“EmptyAutosarFileException”

- The output file shall be named as the same of the input file concatenated with “_mod.arxml”
e.g. if the input was named “Rte_Ecuc.arxml” then the output should be 
“Rte_Ecuc_mod.arxml”.

- Assume any missing requirement.
# Files Description
- **main.java:** This is the class where you should implement your program logic.
- **normal.arxml:** This is a normal ARXML file for testing the normal case.
- **empty.arxml:** This is an empty ARXML file for testing the empty file case.
- **notvalid.html** This is a file for testing the not valid extension case.
- **run.bat** This is a batch file that runs your program with different input files for testing purposes.
# How to run
To run your program with a single input file, use the following commands:

**javac \*.java**

**java main <your_file>**
  
where **main** is your main class and **<your_file>** is the name of the ARXML file you want to process. 
  For example: **java main normal.arxml**
  
This will create a new file called “normal_mod.arxml” with the reordered containers.

To run your program with all the test files provided:

Navigate to the directory where your batch file is located using the cd command (e.g. cd C:\Users\YourUserName\Documents\YourProject).

Run the batch file by typing its name with the extension (e.g. run.bat) and pressing Enter. 

This will run your program with each of the test files and show the output on the console.
