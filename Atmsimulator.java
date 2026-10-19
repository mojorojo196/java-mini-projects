import java.util.Scanner;

public class Atmsimulator {
   static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double balance = 0;
        int pin=2525;

        System.out.print("ENTER YOU PIN :");

        int userpin= sc.nextInt();

        if(pin==userpin){
            boolean isRunning = true;
            while(isRunning){
                 System.out.println("\n--- ATM MAIN MENU ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Choose an option (1-4): ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("YOUR BALANCE : $"+ balance);
                        break;
                
                    case 2:
                        balance+=addbalance(balance);
                        break;
                    case 3:
                        withDraw(balance);
                        break;
                    case 4:
                        System.out.println("Thank you for using our ATM . GoodBye!");
                        isRunning=false;
                        break;
                    default:
                        System.out.println("Invalid choice! please select between 1 and 4.");
                }
            }
        }
        else{
            System.out.println("Incorrect Pin! Access Denied");
        }

    }
    public static void withDraw(double balance){
        System.out.println("Enter amount to withdraw");
        int amountWithdraw = sc.nextInt();
        if(amountWithdraw>balance){
            System.out.println("Insufficient amount!");
        }
        else if(amountWithdraw<=0){
            System.out.println("Invalid amount!");
        }
        else{
            balance-=amountWithdraw;
            System.out.println("Please collect your cash : $" + amountWithdraw);
            System.out.println("Your remaining balance : $" + balance);
        }

    }
    public static double addbalance(double balance){
        System.out.print("Enter amount to deposi t : $");
        int amountDeposit = sc.nextInt();
        if(amountDeposit>0){
            balance+=amountDeposit;
            System.out.println("Successfully deposited $" + amountDeposit);
        }
        else{
            System.out.println("Invalid amount!");
        }
        
        return balance;
    }
}
