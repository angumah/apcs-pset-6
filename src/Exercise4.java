import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        //initialize scanner
        Scanner inputInt = new Scanner(System.in);

        int[] userNums = new int[0];
        int size = 0;
        boolean promptInt = true;
        while (promptInt){
            System.out.print("Enter an integer: ");
            int inputNum = inputInt.nextInt();
            if(inputNum > 0 && size <= 0){
                size++;
                userNums = new int[size];
                userNums[0] = inputNum;
                }else if(inputNum > 0 && size > 0){
                int[] tempArray = new int[size];
                for(int i = 0; i < size; i++){
                    tempArray[i] = userNums[i];
                }
                size++;
                userNums = new int[size];
                userNums[0] = inputNum;
                for(int i = 1; i < size; i++){
                    userNums[i] = tempArray[i-1];
                }
            } else if(inputNum <= -1){
                promptInt = false;
            }
            }
        inputInt.close();

        //compute average
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum+= userNums[i];
        }
        if (size == 0){
            //removed extra new line statement
            System.out.println("\nError: division by zero.");
        } else {
            double average = (double) (sum) / size;
            System.out.printf("%n%,.2f", average);
            System.out.print(".\n");
        }
        }
    }
