# 📚 Library Management System

**Author:** Riya Bhutada  
**Date:** 07/26/2023  

## 🎯 Aim
The **Library Management System** is designed to provide an efficient way to manage books in a library. It enables users to **add, view, borrow, and remove books**, ensuring seamless library operations through a structured data management approach. The system leverages **Binary Trees and Queues** to handle book records and borrowed books efficiently.

## ✨ Features
- **Add Books**: Users can add books with details like title, author, and publication year.
- **View Library**: Displays all available books in alphabetical order using an **In-Order Traversal** of a Binary Tree.
- **Issue/Borrow Books**: Checks for book availability and maintains a queue of issued books.
- **View Issued Books**: Displays all borrowed books and the corresponding borrowers.
- **Remove Books**: Deletes specified books from the library.
- **User-Friendly Menu**: Provides an intuitive interface for seamless navigation.

## 🛠️ Tools Used and How Did I Achieve This?
- **Programming Language**: Java
- **Data Structures**:
  - **Binary Tree**: Used for adding, viewing, and removing books efficiently.
  - **Queue**: Maintains records of borrowed books.
- **Design Pattern Implemented**:
  - **Model-View-Controller (MVC):**
    - **Model:** `RiyaItemType` class for book data representation.
    - **View:** `BhutadaMyLibraryApp` class for user interaction.
    - **Controller:** `CS420ListADT` and `CS420ListADT2` classes handle logic and updates.
- **Exception Handling**: Implemented `RiyaQueueException` for error management.
- **Object-Oriented Analysis (OOA) Design Specifics**:
  - `BhutadaMyLibraryApp` class contains the `main()` method and a menu with options: **ADD, VIEW, DELETE, QUIT**.
  - **ADD**: Takes book details and adds them to the binary tree.
  - **VIEW**: Displays all books using in-order traversal.
  - **ISSUE/BORROW**: Checks book availability and logs borrowed books into the queue.
  - **VIEW ISSUED BOOKS**: Lists all issued books.
  - **DELETE**: Removes a specified book from the binary tree.
  - **QUIT**: Exits the application.
  - **Dependencies**: The application class depends on ADT classes, which in turn depend on `ItemType`. The Tree ADT implements an interface, and custom exceptions are used.

## 📂 Files Included
1. `BhutadaMyLibraryApp.java`
2. `BhutadaMyLibraryApp.class`
3. `RiyaItemType.java`
4. `RiyaItemType.class`
5. `CS420ListADT.java`
6. `CS420ListADT.class`
7. `CS420ListADT2.java`
8. `CS420ListADT2.class`
9. `RiyaBookInterface.java`
10. `RiyaBookInterface.class`
11. `RiyaQueueException.java`
12. `RiyaQueueException.class`
13. `input.txt`
14. `output.txt`
15. `README.md`
16. `RiyaApplicationDesignDocument.pdf`
17. `RiyaUMLDiagram.png`
18. `RiyaUseCaseDiagram.png`

## 🚀 How to Run?
1. **Run the program**:
   ```sh
   java BhutadaMyLibraryApp
   ```
2. **Provide input via** `input.txt`.
3. **Check the output in** `output.txt`.

## 🔮 Future Scope
- **Database Integration**: Store book data persistently instead of using in-memory structures.
- **Graphical User Interface (GUI)**: Implement a more interactive UI.
- **User Authentication**: Differentiate between librarian and customer functionalities.
- **Search Functionality**: Enable users to search books by title, author, or genre.
- **Enhanced Borrowing System**: Introduce due dates and automatic reminders.

