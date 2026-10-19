import java.util.Random;
import java.util.Scanner;

public class Randomgame {
    public static void main(String[] args) {
        

        Random num = new Random();
        Scanner sc = new Scanner(System.in);
        int attempt=0;
        int input;
        int guess = num.nextInt(1,100000);
        do{
            System.out.println("***************");
            System.out.println("WELCOME TO GAME");
            System.out.println("***************");

            System.out.print("GUESS A NUMBER :");
            input=sc.nextInt();

            if(input<guess){
                System.out.println("Too Low! Try again");
            }
            else if(input>guess){
                System.out.println("Too High! Try again");
            }
            else{
                System.out.println("WOW YOU JUST WON");
                System.out.println("TOTAL ATTEMPT TAKEN:"+attempt);
            }
            attempt++;
        }while(input != guess);
    }
}
