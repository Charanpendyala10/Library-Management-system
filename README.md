                        # Library Management System

This Project is a simple Library Management system implemented using java

## Features -


### Books Management
- Add New books : Add books to library database with title, author, genre, quantity
- update Existing book : update existing books like title, author and quantity
- remove books : remove books from library

### Borrower Management 
- Add New Borrower : registers new borrowers with their name and membership id
- update Borrower : updates existing borrowers name and contact details
- Remove borrowers : removes borrowers from the system

### Book Search and Availability
- Search Books : search for books with specified isbn and title
- Check Availability : displays the current quantity of book in search results

## Project Structure

````
src
|
|--Books.java      // Defines book class with fields, getters and setter
|--Borrowers.java  // Defines borrowers class with borrowers details
|--Management.java // Implementation of core functionality of managing books, borrowers, returning, borrowing and searching
|--Main.java       // Main class to test the system
