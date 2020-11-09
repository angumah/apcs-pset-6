import java.util.Scanner;
//fixed incorrect solution
public class Exercise8 {
    public static void main(String[] args) {
        //initialize Scanner

        Scanner inputHeight = new Scanner(System.in);
        int userHeight = 0;

        while (userHeight <= 0 || userHeight > 24){
            System.out.print("Height: ");
            userHeight = inputHeight.nextInt();
        }
        inputHeight.close();

        int size = userHeight + 1;
        String[] starArray = new String[size];
        for(int i = 0; i < size; i++){
            starArray[i] = "*";
        }
        System.out.println();
        int stars = 2;
        for(int i = 1; i <= userHeight; i++){
            int spaces = userHeight - stars;

            for (int j = 0; j <= spaces; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++){
                System.out.print(starArray[k]);
            }
            stars++;
            System.out.println();
        }
    }
}
