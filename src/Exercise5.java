import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        //initialize scanner
        Scanner inputInteger = new Scanner(System.in);
        int userInt = 0;

        while(userInt <=0){
            System.out.print("Enter an Integer: ");
            userInt = inputInteger.nextInt();
        }

        inputInteger.close();

        int[] divideNumbers = new int[9];

        int num = 1;

        for(int i=0; i < divideNumbers.length; i++){

            divideNumbers[i] = num++;
        }
        int numOfFactors = 0;
        for(int i=0; i<divideNumbers.length; i++){
            if(userInt % divideNumbers[i] == 0){
                numOfFactors++;
            }
        }
        if(numOfFactors > 2){
            System.out.println("\nNot prime.");
        }
        else {
            System.out.println("\nPrime.");
        }
    }
}
