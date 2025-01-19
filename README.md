## Comparing different variants of gcd algorithms of large integers

This repository contains my first-semester project from my Bachelor's in Computer Science. The project focuses on comparing different algorithms for calculating the Greatest Common Divisor (GCD) with BigInteger. By exploring five different GCD algorithms, the goal was to evaluate their performance and efficiency when implemented in Java. 

The project covers the following algorithms:

- Euclidean algorithm
- Extended Euclidean algorithm
- Binary algorithm (Stein's algorithm)
- Extended Binary algorithm
- Java’s built-in BigInteger GCD algorithm

I implemented these algorithms using NetBeans (Java) and recorded their execution times in Excel to create performance graphs. The project also includes a detailed analysis, focusing on both the scientific evaluation of algorithm performance and the technical aspects of the code.


Reports/Papers from the repository for better understanding:

- bsp01_licina_esada_primary_language_summary.pdf
- bsp01_licina_esada_scientific_and_technical_report.pdf
- bsp01_licina_esada_secondary_language_summary.pdf



# To run your project in NetBeans after cloning the repository and installing NetBeans, follow these steps:

- Open NetBeans: Launch the NetBeans IDE on your computer.
- Clone the Repository (if not already done): If you haven’t cloned the repository yet, open a terminal (Command Prompt, Git Bash, etc.) and run:
-          git clone <repository_url>
- Open the Project in NetBeans: In NetBeans, go to File -> Open Project. Browse to the folder where you cloned the repository, and select the project folder 'GCD_Algorithm_Code'. Click Open Project.
- Ensure Dependencies Are Set Up: After opening the project, NetBeans may prompt you to resolve any dependencies (libraries or missing files). If Java libraries (like BigInteger) are needed, ensure they are available in the project. NetBeans typically handles the setup of built-in Java libraries automatically.
- Build the Project: Before running the project, build it by selecting Build -> Build Project from the menu, or right-click the project in the Projects pane and choose Build. This will compile the code and ensure there are no errors.
- Run the Project: Once the build is successful, you can run the project by selecting Run -> Run Project, or right-click the project in the Projects pane and select Run. If there is a main() method in your project, it will execute the main class.




# Output Window Function: 


INTEGER:
This section is designed to calculate numbers under 32 bits, which can represent values between -2,147,483,647 and 2,147,483,647 (a maximum of 10 digits). 
If the input exceeds this range, the program will not return a result.

- In the two empty boxes labeled 'Number1' and 'Number2' under the white window (jList), you can enter your numbers.
- Click on one of the algorithm buttons, and the result will be displayed.
- To remove an item from the jList, first select the item, then click the 'Remove' button.
- There is also a 'Clear' button to clear the entire jList.


BIGINTEGER:
In this section, you can specify the length of random numbers to be generated, without any minimum or maximum limit.

- Enter the desired length in the box labeled 'Number of digits.'
- Click on one of the algorithm buttons to generate and display the results.
- This section also includes 'Clear' and 'Remove' buttons to manage the jList.
- To save the results to an Excel file, click the 'Save' button.
- Enter a file name and save the results.
- In the Excel sheet, only the same data shown in NetBeans will be exported.
- You will need to create the diagram or graph manually in Excel.
- There is also a 'Load' button, which allows you to reload saved results into the Excel window.
