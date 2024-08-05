import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances =3;
        int finals = 0;
        boolean playAgain = true;
        System.out.println("Welcome to the Number Game!");
        System.out.println("hey buddy you have about  "+chances+"  to win the game");
        while (playAgain) {
            int rand = getrandN(1, 100);
            boolean guess = false;
            for (int i = 0; i <= 2; i++) {
                System.out.println("chances"+(i + 1)+  "  enter your guess:");
                int User = sc.nextInt();
                if(User == rand) {
                    guess = true;
                    finals += 1;
                    System.out.println("you won it");
                    break;
                }
                else if (User > rand) {
                    System.out.println("too high");
                } else {
                    System.out.println("too low");
                }
            }
            if (guess == false) {
                System.out.println("sorry buddy. you lost the chance.the number is" + rand);
            }
            System.out.println("would you like to play again? (y/n)");
            String pA = sc.next();
            playAgain = pA.equalsIgnoreCase("y");
        }
        System.out.println("Thank you for playing!");
        System.out.println("here is your score" + finals);
    }
        public static int getrandN(int min,int max) {
        return (int)(Math.random() * (max - min+1) + min);

        }

    }

