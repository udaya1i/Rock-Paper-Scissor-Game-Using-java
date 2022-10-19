import java.util.Scanner;
import java.util.Random;

public class java_16_Rock_Paper_Scissor_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 0-----------------> Rock \n 1------------------> paper \n 2------------------->Scissor\n\n");
        System.out.print("Please Enter Your Move:- ");
        int me = sc.nextInt();
        Random random = new Random();
        int computer = random.nextInt(3);
        if (me==computer){
            System.out.println("Opps!! Its Draw...");
        }
        else if (me==0&&computer ==2 || me == 1&& computer ==0 || me ==2&&computer==1){
            System.out.println("\"Congratulation, You win the match\"");
        }
        else if(me >=3) {
            System.out.println("Please choose number in between 0-2. you choose more then 2 so computer win the game.");
        }
        else {
            System.out.println("\"Computer win the match\"\n");
        }
        System.out.println("Your move was  "+me);
        System.out.println("Computer move was  "+computer);
    }

}
