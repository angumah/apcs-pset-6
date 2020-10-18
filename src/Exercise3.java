import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        //initialize scanner
        Scanner inputNumber = new Scanner(System.in);
        int userInt = -1;
        while(userInt <= 0) {
            System.out.print("Enter an integer: ");
            userInt = inputNumber.nextInt();
        }
        inputNumber.close();
        int sum = 0;
        String userString = String.valueOf(userInt);
        int length = userString.length();
        for(int i = 0; i < length; i++){
            String intSub = userString.substring(i, i+1);
            int intAtString = Integer.parseInt(intSub);
            if(intAtString % 2 != 0){
                sum+= intAtString;
            }
        }
        System.out.println("\n" + sum + ".");
    }
}
