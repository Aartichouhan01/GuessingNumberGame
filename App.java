import java.util.Random;
import java.util.Scanner;
import java.util.random;
  class number_System
 {
   public static void main(String [] args)
   {
     Scanner scanner =new Scanner(System.in);
     Random random=new Random();
      int target =random.nextInt(100)+1;
      int attemp =0;
      System.out.println("Welcome to guess number game");
      System.out.println("you will be Asked to Guess A Win the Game");
      System.out.println("You have Maximum 5 attemp Limit");
      while(attemp<5)
      {
        System.out.println("Enter a Guess Number between 1 to 100");
        int guess= scanner.nextInt();
        attemp++;
        if(guess<target)
        {
            System.out.println("Your Guess Number is smaller");
        }
        else if(guess>target)
        {
                System.out.println("Your Guess Number is Greater");
        }
        else
        {
            System.out.println("OOhhOO ! , Your Number is Correct , You win the Game!");
        }
      }
      if(attemp==5)
      {
        System.out.println("Sorry  ,you have used all Attemps . your coorect Number was:"+target);
      }
      scanner.close();

       }
 }
