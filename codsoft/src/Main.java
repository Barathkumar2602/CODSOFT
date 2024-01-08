
import java.util.*;
public class Main {

    public static void guessNumber(){

        int R=1+ (int)(100* Math.random());
        int S=3;
        Scanner sc=new Scanner(System.in);
        int i;

       for(i=0;i<S;i++){
           System.out.println("Guess the number:");
           int guess=sc.nextInt();
           if (R==guess){
               System.out.println("The guess is correct");
               break;

           } else if (R>guess && i!=S-1) {
               System.out.println("The number is greater than "+guess);
           } else if (R<guess && i!=S-1) {
               System.out.println("The number is less than "+guess);
           }
       }
       if(i==S){
           System.out.println("You have attempted "+S+" rounds");
           System.out.println("The number was "+R);v
       }

    }
    public static void main(String [] args){
        guessNumber();
    }
}