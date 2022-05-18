package Access;

import java.util.Scanner;

public class Test1 {
	private static String[] ones = {"","one","two","three","four","five","six","seven","eight","nine","ten"};
    private static String[] twenties = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
    private static String[] tens = {"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
    private static String[] hundreds = {"ones","tens","hundred","thousand","thousand","lakhs","lakhs","crore","crore"};
    private static String a = "";
    private static String b = null;
    private static int c = 0;
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the number : ");
        int number = input.nextInt();
        int quotient = number/10;
        int reminder = number % 10;
        String newWord = null;
        int count=0;
        switch (count) {
       
        case 0:
            newWord = " "+ones[reminder];
            break;
        case 1:
            if(reminder==1){
                a = a; //skip
                number = Integer.parseInt(String.valueOf(reminder+""+c));
                newWord = " "+twenties[number];
            }else{
            	a = b + a;
                newWord = " "+tens[reminder];
            }
            break;
        case 2:
        	a = b + a; // adding tens
            newWord = " "+ones[reminder]+" "+hundreds[count]+" and";
            break;
        case 3:
        	a = b + a; //adding hundred
            newWord = " "+ones[reminder]+" "+hundreds[count];
            break;
        case 4:
            if(reminder==1){
                a = a;
                number = Integer.parseInt(String.valueOf(reminder+""+c));
                newWord = ""+twenties[number]+" "+hundreds[count]+"";
            }else{
            	a = b + a;
                newWord = " "+tens[reminder]+"";
            }
            break;

        default:
            System.out.println(" This is default statement, it won't print ");
            break;
        }
        c = reminder;
        b = newWord;
        //getTheWord(reminder,count);
        if(quotient<=0){
            a = b + a;
            System.out.println(" output : "+a);
            //return 0;
        }else
        {
           // return convertToWord(quotient,count+1);
        }
        
	}
}
