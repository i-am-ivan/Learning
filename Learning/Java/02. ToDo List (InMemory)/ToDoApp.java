// This simple ToDo list app in Java to demonstrate simple program structure and functionality
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Manages the to do app
public class ToDoApp {
    // Declare where to save the ToDo list and how to save them
    private static List<String> tasks = new ArrayList<String>();
    // Main Function, display meanu and get user inputs
    public static void main(String[] args) {
        // Great and display user menu for simple console ToDo list
        Scanner scanner = new Scanner(System.in);
        // Continue showing until user or program exits
        while(true){
            // List menu options
            System.out.println("\n| ------------------- Welcome to ToDo ------------------- |\n");
            System.out.println("\n 1. Create a new task.");
            System.out.println("\n 2. View task list.");
            System.out.println("\n 3. Remove a task from list.");
            System.out.println("\n 4. Exit.");
            System.out.println("\n-------------------------------------------------------------");
            System.out.print("\n Choose an option above to continue: ");
            // Check user input
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            // Review input type, make sure it is within the allowed range
            if(choice < 1 || choice > 4){
                System.out.println("\nInvalid option. Please try again.");
                continue;
            }
            // Perform action based on user choice
            switch(choice){
                case 1:
                    createTask(scanner);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    removeTask(scanner);
                    break;
                case 4:
                    System.out.println(" \n------------------------------------------------------------- \n Exiting ToDo app ... \n Thank you for using our ToDo app. \n Goodbye! \n-------------------------------------------------------------");
                    System.exit(0);
            }
        }
    }
    // Methods to look after
    // Create new tasks -----------------------------------------------------------------------------------------------------------------------------------------------
    private static void createTask(Scanner scanner){
        // Create user task option
        System.out.print("\n Enter a new task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("\n Task added successfully.");
    }
    // List/view tasks ------------------------------------------------------------------------------------------------------------------------------------------------
    private static void viewTasks(){
        // List the tasks
        System.out.println("\n Here is a list of all your todo tasks.\n--------------------------------------------------------------------------------------\n");
        // List the tasks one by one
        for(int i = 0; i < tasks.size(); i++){
            // List tasks in the list
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
        System.out.println("\n--------------------------------------------------------------------------------------\n");
    }
    // Remove tasks ---------------------------------------------------------------------------------------------------------------------------------------------------
    private static void removeTask(Scanner scanner){
        // Delete task entry from list
        System.out.print("\n Please select a task from the list that you want to remove: ");
        // Get the tasks using the index
        int taskNumber = scanner.nextInt();
        // Ensure it is within the list range
        if(taskNumber > 0 && taskNumber <= tasks.size()) {
            // Remove task entry from list
            tasks.remove(taskNumber - 1);
            System.out.println("\n Task successfully removed from list.");
        }else {
            // Error finding that task entry
            System.out.println("\n Invalid task entry selected. Please try again.\n");
        }
    }
}