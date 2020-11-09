import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        //initialize scanner

        Scanner inputInt = new Scanner(System.in);

        //initialize int variable
        Double userDouble = 0.0;
        //makes sure an int or double is entered
        while(userDouble <= 0) {
            System.out.print("Enter an Integer: ");
            userDouble = inputInt.nextDouble();
        }
        inputInt.close();
        //makes sure it is an int
        int userInt = userDouble.intValue();
        //converts int to string
        String usrString = String.valueOf(userInt);
        int length = usrString.length();

        //fixed formatting
        System.out.println();
        for(int i = length-1; i > -1; i--) {
            String subInt = usrString.substring(i, i+1);
            if(i == 0){
                System.out.print(subInt + ". ");
            }
            else {
                System.out.print(subInt + ", ");
            }
        }
        System.out.print("\n");
    }
}
