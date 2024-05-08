import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username;
    private String password;
    private double balance;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0.0;
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class OnlineBank {
    private static Map<String, User> users = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create some dummy users
        users.put("user1", new User("user1", "password1"));
        users.put("user2", new User("user2", "password2"));

        // Simulate login
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (login(username, password)) {
            User user = users.get(username);
            System.out.println("Login successful");
            System.out.println("Welcome, " + user.getUsername());

            // Simulate deposit
            System.out.print("Enter deposit amount: ");
            double depositAmount = scanner.nextDouble();
            user.deposit(depositAmount);
            System.out.println("Deposit successful. New balance: " + user.getBalance());

            // Simulate withdrawal
            System.out.print("Enter withdrawal amount: ");
            double withdrawAmount = scanner.nextDouble();
            user.withdraw(withdrawAmount);
            System.out.println("Withdrawal successful. New balance: " + user.getBalance());
        } else {
            System.out.println("Invalid username or password");
        }
    }

    private static boolean login(String username, String password) {
        if (users.containsKey(username)) {
            return users.get(username).authenticate(password);
        }
        return false;
    }
}
