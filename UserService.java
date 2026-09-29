import java.util.List;

public class UserService {
    private UserRepository repo = new UserRepository();

    public boolean register(String name, String email, String password, String role) {
        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            System.out.println("❌ Error: All fields are required!");
            return false;
        }
        return repo.add(new User(name, email, password, role));
    }

    public User authenticate(String email, String password) {
        if (email.isEmpty() || password.isEmpty()) {
            System.out.println("❌ Email and password cannot be empty.");
            return null;
        }
        return repo.login(email, password);
    }

    public List<User> getAllUsers() {
        return repo.getAll();
    }

    public boolean removeUser(int id) {
        return repo.delete(id);
    }
}