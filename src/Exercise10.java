import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        //initialize scanner

        Scanner inputCard = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        String cardNum = inputCard.nextLine();
        String cardType = "";

        inputCard.close();

        //create card array and determine card type
        int cardNumLength = cardNum.length();

        int[] cardArray = new int[cardNumLength];
        for(int i = 0; i < cardNumLength; i++){
            String cardSub = cardNum.substring(i, i+1);
            int cardNumSub = Integer.parseInt(cardSub);
            cardArray[i] = cardNumSub;
        }
        if (cardNumLength == 15 && cardNum.substring(0,2).equals("34") || cardNum.substring(0,2).equals("37")){
            cardType = "American Express";
        }
        else if(cardNumLength == 16 &&
                cardNum.substring(0,2).equals("51") ||
                cardNum.substring(0,2).equals("52") ||
                cardNum.substring(0,2).equals("53") ||
                cardNum.substring(0,2).equals("54") ||
                cardNum.substring(0,2).equals("55")){
            cardType = "Mastercard";
        }
        else if(cardNumLength == 13 ||
                cardNumLength == 16 &&
                cardNum.substring(0,1).equals("4")){
            cardType = "Visa";
        }
        else {
            cardType = null;
        }

        //test if card number is valid
        boolean isValid = true;

        int[] multiplyArray = new int[cardNumLength/2];
        int checksum = 0;
        int start = 0;
        for(int i = cardNumLength-2; i >= 0; i-=2){
                multiplyArray[start++] = cardArray[i]*2;
        }
        int multiplySum = 0;
        for(int i = 0; i < multiplyArray.length; i++){
            if(multiplyArray[i] >=10){
                String twoDigitNum = String.valueOf(multiplyArray[i]);
                for(int j = 0; j < twoDigitNum.length(); j++){
                    int subNum = Integer.parseInt(twoDigitNum.substring(j, j+1));
                    checksum+= subNum;
                }
            }
            else{
                checksum+= multiplyArray[i];
            }
        }
        for(int i = cardNumLength-1; i >=0; i-=2){
            checksum+= cardArray[i];
        }
        //convert checksum to string and check last digit
        String checkSumToString = String.valueOf(checksum);
        int checkSumLength = checkSumToString.length();
        String lastDigit = checkSumToString.substring(checkSumLength-1, checkSumLength);
        if(lastDigit.equals("0")){
            isValid = true;
        }
        else{
            isValid = false;
        }

        if(isValid && cardType != null){
            System.out.println("\n"+cardType+".");
        }
        else {
            System.out.println("\nInvalid.");
        }
    }
}
