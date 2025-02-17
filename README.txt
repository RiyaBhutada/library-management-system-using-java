Author: Riya Bhutada

Date: 07/26/2023

Description: This is a simple Library Management System with the following functionalities:
1.	Add a book
2.	View Library
3.	Issue/Borrow a book
4.	View issued books
5.	Remove a book

I have used 2 ADTs both of type RiyaItemType to implement these application functionalities: 
1.	Binary Tree: Add, View and Removes books from library
2.	Queue: Add and View the issued/borrowed books 


OOA design specifics:
•	BhutadaMyLibraryApp class contains the main() method. It displays a MENU to select from 4 options - ADD, VIEW, DELETE or QUIT APP. 
•	ADD option asks for Title, Author and Published Year of the book and adds to the binary tree in in-order.
•	VIEW will display all the books using In-Order Traversal
•	ISSUE/BORROW will first check if the book is present in the library in in-order fashion. If the book is found, details such as title and name of the person borrowing the book are stored in the Queue ADT.
•	VIEW ISSUED BOOKS will list all the books (stored in the Queue) that were borrowed by the respective people.
•	DELETE option deletes the specified book from the tree.
•	QUIT will exit the App.
•	There is a dependency relationship between Application class and ADT class. There is dependency relationship between both the ADT classes and ItemType class as well. The Tree ADT class implements the Interface. Both ADT classes and Application class uses Custom_Exception class.


Design pattern implemented:
I have implemented the Model-View-Controller (MVC) design pattern. The application logic is separated into three distinct components: 
a. The model (or the RiyaItemType class), which represents the data.
b. The view (or the main BhutadaMyLibraryApp class), which represents the user interface and takes user input.
c. The controller (or the CS420ListADT class), which handles user interactions and updates the model and view accordingly.

 
Files included:
1.	BhutadaMyLibraryApp.java
2.	BhutadaMyLibraryApp.class
3.	RiyaItemType.java
4.	RiyaItemType.class
5.	CS420ListADT.java
6.	CS420ListADT.class
7.	CS420ListADT2.java
8.	CS420ListADT2.class
9.	RiyaBookInterface.java
10.	RiyaBookInterface.class
11.	RiyaQueueException.java
12.	RiyaQueueException.class
13.	input.txt
14.	output.txt
15.	README.txt
16.	RiyaApplicationDesignDocument.doc
17.	RiyaUMLDiagram.png
18.	RiyaUseCaseDiagram.png


To run: java BhutadaMyLibrary.java

Input to the application is given using input.txt
Output is printed in output.txt file. 
