import java.util.List;

public class UserService {
    private UserRepository repository = new UserRepository();

    public void createUser(String name, String email) {
        if (name.isEmpty() || email.isEmpty()) {
            System.out.println("❌ Error: Name and Email cannot be empty.");
            return;
        }
        User user = new User(name, email);
        if (repository.add(user)) {
            System.out.println("✅ User successfully created!");
        } else {
            System.out.println("❌ Failed to create user.");
        }
    }

    public List<User> fetchAllUsers() {
        return repository.getAll();
    }

    public void updateUser(int id, String name, String email) {
        User user = new User(id, name, email);
        if (repository.update(user)) {
            System.out.println("✅ User successfully updated!");
        } else {
            System.out.println("❌ Failed to update user.");
        }
    }

    public void deleteUser(int id) {
        if (repository.delete(id)) {
            System.out.println("✅ User successfully deleted!");
        } else {
            System.out.println("❌ Failed to delete user.");
        }
    }
}