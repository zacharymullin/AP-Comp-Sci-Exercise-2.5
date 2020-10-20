import java.util.Scanner;
public class D6_v3
{
    
    public static void main(String[] args){
        String input = "y";
        Scanner sc = new Scanner(System.in);
        int numDice;
        int numSides;
        int total;
        int roll;
        while(input.equals("y")){
            System.out.println("How many dice do you want to roll?");
            numDice = sc.nextInt();
            System.out.println("How many sides do you want these dice to have?");
            numSides = sc.nextInt();
            total = 0;
            System.out.print("You rolled: ");
            for(int i = 0; i < numDice; i++){
                roll = rollDie(numSides);
                System.out.print(roll + " ");
                total += roll;            
            } 
            System.out.println("");
            System.out.println("Total: " + total);
            System.out.println("Do you want to roll again? (y/n)");
            input = sc.next();
        }
    }

    public static int rollDie(int sides){
        return (int) (Math.random()*sides+1);
    }
}
