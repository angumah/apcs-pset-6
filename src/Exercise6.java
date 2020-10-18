import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        //initialize scanner
        Scanner inputInteger = new Scanner(System.in);
        int userInt = -1;

        while(userInt <0 || userInt > 92){
            System.out.print("Enter an Integer: ");
            userInt = inputInteger.nextInt();
        }

        inputInteger.close();

        //fibonacci sequence
        int size = userInt;
        long[] fibonacciArray = new long[size];

        for(int i = 0; i < size; i++){
            if(i-1 >=0 && i - 2 >= 0){
                fibonacciArray[i] = (fibonacciArray[i-2]+fibonacciArray[i-1]);
            }
            else if (i == 0) {
                fibonacciArray[i] = 0;
            }
            else if (i == 1){
                fibonacciArray[i] = 1;
            }
        }
        System.out.printf("%,d", fibonacciArray[userInt-1]);
    }
}
