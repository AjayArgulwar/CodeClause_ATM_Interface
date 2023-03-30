import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0; 
    
        String id = "5964";
        String password = "qwer";
        
        while (true) {
            System.out.print("Enter ID: ");
            String enteredId = scanner.next();
        
            if (enteredId.equals(id)) {
                System.out.print("Enter password: ");
                String enteredPassword = scanner.next();
                
                if (enteredPassword.equals(password)) {
                    System.out.println("Login successful!");
                    break;
                } else {
                    attempts++;
                    System.out.println("Invalid password. Please try again.");
                }
            } else {
                attempts++;
                System.out.println("Invalid ID. Please try again.");
            }
            
            if (attempts == 3) {
                System.out.println("Too many incorrect attempts. Exiting program.");
                System.exit(0);
            }
        }
        
        double balance = 1000.00; 
        
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");
            System.out.println("4. Exit");
            
            int option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.printf("Your current balance is ₹%.2f\n", balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds");
                    } else {
                        balance -= withdrawAmount;
                        System.out.printf("You withdrew ₹%.2f. Your new balance is ₹%.2f\n", withdrawAmount, balance);
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.printf("You deposited ₹%.2f. Your new balance is ₹%.2f\n", depositAmount, balance);
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
                    break;
            }
            
            System.out.println();
        }
    }
}
