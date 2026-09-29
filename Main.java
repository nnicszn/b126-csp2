import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserController controller = new UserController();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== SESSION 2: CRUD MENU ===");
            System.out.println("1. Create User");
            System.out.println("2. Read (View All Users)");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    controller.addUser(name, email);
                    break;
                case 2:
                    controller.showAllUsers();
                    break;
                case 3:
                    System.out.print("Enter User ID to Update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Email: ");
                    String newEmail = scanner.nextLine();
                    controller.updateUser(updateId, newName, newEmail);
                    break;
                case 4:
                    System.out.print("Enter User ID to Delete: ");
                    int deleteId = scanner.nextInt();
                    controller.removeUser(deleteId);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting application... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}