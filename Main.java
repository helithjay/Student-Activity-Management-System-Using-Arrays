import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String[][] students = new String[100][2];
        initialise(students);
        System.out.println("1. Check available seats\n" +
                "2. Register student (with ID)\n" +
                "3. Delete student\n" +
                "4. Find student (with student ID)\n" +
                "5. Store student details into a file\n" +
                "6. Load student details from the file to the system\n"+
                "7. View the list of students based on their names ");

        while (true) {  // Use an infinite loop to keep asking for input
            System.out.println("Enter what do you want to do(use number): ");
            int whattodo = input.nextInt();

            switch (whattodo) {
                case 1:
                    System.out.println("You typed 1");
                    checkavailablesets(students);
                    break;
                case 2:
                    System.out.println("You typed 2");
                    registerstudent(students);
                    break;
                case 3:
                    System.out.println("You typed 3");
                    deletestudent(students);
                    break;
                case 4:
                    System.out.println("You typed 4");
                    findstudents(students);
                    break;
                case 5:
                    System.out.println("You typed 5");
                    storeinfiles(students);
                    break;
                case 6:
                    System.out.println("You typed 6");
                    loaddetais(students);
                    break;
                case 7:
                    System.out.println("You typed 7");
                    viewstudents(students);
                    break;



                default:
                    System.out.println("Invalid option. Please enter a number between 1 and 7.");
            }
        }
    }


    //method for initialise
    private static void initialise(String studentn[][]) {
        for (int x = 0; x < 100; x++) {
            studentn[x][0] = "e";
            studentn[x][1] = "e";
        }
        System.out.println("initilise ");

    }

    //method for check avilable seats (1)
    private static void checkavailablesets(String student1[][]) {
        for (int x = 0; x < 100; x++) {
            if (student1[x][0].equals("e"))
                System.out.println("seat " + x + " is empty");
        }
    }

    //method  for register (2)
    private static void registerstudent(String student1[][]) {

        input.nextLine();
        System.out.println("Enter your student ID:");
        String ID = input.nextLine();
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        for (int x = 0; x < 100; x++) {
            if (student1[x][0].equals("e")) {
                student1[x][0] = ID;
                student1[x][1] = name;
                break;
            }
        }
        System.out.println("Student added to the system");
    }

    //method for delete student (3)
    private static void deletestudent(String student1[][]) {
        input.nextLine();
        System.out.println("Enter Student ID to delete");
        String ID = input.nextLine();
        for (int x = 0; x < 100; x++) {
            if (student1[x][0].equals(ID)) {
                student1[x][0] = "e";
                student1[x][1] = "e";
                break;
            }
        }
        System.out.println("ID Deleted:");
    }

    //method for find students (4)
    private static void findstudents(String student1[][]) {
        input.nextLine();
        System.out.println("Enter student ID to search");
        String ID = input.nextLine();
        for (int x = 0; x < 100; x++) {
            if (student1[x][0].equals(ID))
                System.out.println("You searched: " + student1[x][0] + student1[x][1]);
        }
    }

    //method for store data in text file (5)
    private static void storeinfiles(String student1[][]) {
        String filePath = "output.txt";

        try (FileWriter writer = new FileWriter(filePath)) {
            for (int x = 0; x < 100; x++) {
                writer.write(student1[x][0] + "," + student1[x][1] + "\n"); // Write each element on a new line
            }
            System.out.println("Array has been written to " + filePath);
        } catch (IOException e) {
            System.out.println("An error ");
        }
    }

    //method for load detais from text file(6)
    private static void loaddetais(String student1[][]) {
        try {
            File file = new File("output.txt");
            Scanner file_reader = new Scanner(file);
            int y = 0;
            while (file_reader.hasNextLine()) {
                String line = file_reader.nextLine();
                String[] parts = line.split(",");
                student1[y][0] = parts[0];
                student1[y][1] = parts[1];
                y += 1;
            }
            file_reader.close();
        } catch (IOException e) {
            System.out.println("Error while reading a file.");
            e.printStackTrace();
        }
    }

    //method for viewstudents (7)
    private static void viewstudents(String student1[][]) {
        for (int x = 0; x < 100; x++) {
            if (!student1[x][0].equals("e")) {
                System.out.println(student1[x][0]);
                System.out.println(student1[x][1]);
            }
        }
    }



}






