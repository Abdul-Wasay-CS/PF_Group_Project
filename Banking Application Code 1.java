import java.util.Scanner:

public class BankingApp {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    // Global Variables
    int[] accountIDs = new int[100];
    String[] accountNames = new String[100];
    double[] accountBalances = new double[100];
    int totalAccounts = 0;
    loginScreen();
  }

  // Main && Menu
  public static void loginScreen() {
    System.out.println("===============================================");
    System.out.println("           BANKING MANAGEMENT SYSTEM           ");
    System.out.println("===============================================");
    System.out.println(
        "\n1. Create New Account\n2. Log Into Account\n3. Admin Login\n4. Exit\nChoose an option: ");
  }

  public void showMenu() {
    System.out.println(
        "1. Check Balance\n"
            + "2. Deposit Money\n"
            + "3. Withdraw Money\n"
            + "4. View Account Details\n"
            + "5. Delete Account\n"
            + "6. Exit\n"
            + "Choose an option: ");
  }

  public void handleChoice() {}

  // Account Management
  public void createAccount() {
    System.out.print("Enter Account ID: ");
    accountIDs[totalAccounts] = scanner.nextInt();
    
  // TODO: create a way to check if the account exists
    System.out.print("Enter Account Holder Name: ");
    accountNames[totalAccounts] = scanner.nextLine();
    System.out.print("Enter Initial Balance: ");
    double startingBalance = scanner.nextDouble();
    deposit(accountIDs, startingBalance); // Calls the method deposit()
    totalAccounts++;
  }

  public void viewAccount() {}

  public void deleteAccount() {}

  public void listAccount() {} // Useless

  // Transactions
  public void deposit(int accountIDs, double toDeposit) {}

  public void withdraw() {}

  public void checkBalance() {}

  // Data Handling
  public void saveData() {}

  public void loadData() {}
  
  public int findAccountIndex(){}
}
