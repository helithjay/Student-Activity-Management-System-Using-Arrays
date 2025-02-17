# Student Registration System

## Overview
This is a simple Java-based Student Registration System that allows users to:
- Check available seats
- Register students with an ID
- Delete student records
- Find students by their ID
- Store student details into a file
- Load student details from a file
- View a sorted list of students based on their names

## Features
1. **Check Available Seats**: Displays the available seats in the system.
2. **Register Student**: Allows users to input a student ID and name for registration.
3. **Delete Student**: Removes a student from the system using their student ID.
4. **Find Student**: Searches for a student by ID and displays their details.
5. **Store Student Details**: Saves all student records into a file (`output.txt`).
6. **Load Student Details**: Loads student records from `output.txt` into the system.
7. **View Students**: Lists all registered students.

## Technologies Used
- Java
- File Handling (for storing and retrieving student records)
- Scanner (for user input handling)

## How to Run
1. Compile the program using a Java compiler:
   ```sh
   javac Main.java
   ```
2. Run the program:
   ```sh
   java Main
   ```
3. Follow the on-screen menu options to interact with the system.

## File Structure
- **Main.java**: The main application file containing all functionalities.
- **output.txt**: Stores registered student details persistently.
- **Task1.iml**: IntelliJ module configuration file.

## Example Usage
- When prompted, enter an option number to perform a specific operation.
- Example of adding a student:
  ```
  Enter your student ID: W2084740
  Enter your name: Helith
  ```
- Example of deleting a student:
  ```
  Enter Student ID to delete: W2084740
  ID Deleted.
  ```

## Future Enhancements
- Implement a graphical user interface (GUI) for better usability.
- Improve sorting and searching efficiency.
- Add database support for better data persistence.

## Author
- Developed by Helith Jayasuriya

