package simpleexercises;

import java.util.Scanner;

public class SimpleExercises {
    static boolean isAscending(int number1, int number2){
        boolean result = (number1 < number2) ? true : false;
        return result;
    }
    
    public static void main(String[] args) {
        int number1;
        int number2;
        boolean orderComparing;
        
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.print("Type an integer: \n");
            number1 = input.nextInt();
            System.out.print("Type an integer: \n");
            number2 = input.nextInt();
            orderComparing = isAscending(number1, number2);
            if(orderComparing == true){
                System.out.println("Ascending.");
            }
            else if((orderComparing == false) && (number1 != number2)){
                System.out.println("Descending.");
            }
            else{
                 break;   
            }
        }while(true);       
    }
}
