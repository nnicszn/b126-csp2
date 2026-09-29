import java.util.List;

public class UserController {
    private UserService service = new UserService();

    public boolean registerUser(String name, String email, String password, String role) {
        return service.register(name, email, password, role);
    }

    public User loginUser(String email, String password) {
        return service.authenticate(email, password);
    }

    public void displayAllUsers() {
        List<User> list = service.getAllUsers();
        System.out.println("\n-----------------------------------------------------------");
        System.out.printf("%-5s | %-20s | %-20s | %-10s\n", "ID", "Name", "Email", "Role");
        System.out.println("-----------------------------------------------------------");
        for (User u : list) {
            System.out.printf("%-5d | %-20s | %-20s | %-10s\n", u.getId(), u.getName(), u.getEmail(), u.getRole());
        }
        System.out.println("-----------------------------------------------------------");
    }

    public boolean deleteUser(int id) {
        return service.removeUser(id);
    }
}