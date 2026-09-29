import java.util.List;

public class UserController {
    private UserService service = new UserService();

    public void addUser(String name, String email) {
        service.createUser(name, email);
    }

    public void showAllUsers() {
        List<User> users = service.fetchAllUsers();
        System.out.println("\n--- USER LIST ---");
        if (users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            for (User u : users) {
                System.out.println("ID: " + u.getId() + " | Name: " + u.getName() + " | Email: " + u.getEmail());
            }
        }
        System.out.println("-----------------");
    }

    public void updateUser(int id, String name, String email) {
        service.updateUser(id, name, email);
    }

    public void removeUser(int id) {
        service.deleteUser(id);
    }
}