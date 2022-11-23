<<<<<<< HEAD
package access;
public class NumberToWord {
  private static final String[] units = {
    "",
    " one",
    " two",
    " three",
    " four",
    " five",
    " six",
    " seven",
    " eight",
    " nine"
  }; 
  private static final String[] doubles = {
    " ten",
    " eleven",
    " twelve",
    " thirteen",
    " fourteen",
    " fifteen",
    " sixteen",
    " seventeen",
    " eighteen",
    " nineteen"
  };
  private static final String[] tens = {
    "",
    "",
    " twenty",
    " thirty",
    " forty",
    " fifty",
    " sixty",
    " seventy",
    " eighty",
    " ninety"
  };
  private static final String[] hundreds = {
    "",
    " thousand",
    " million",
    " billion"
  }; 

  static String convertToWord(int number) {    
    String word = "";    
    int index = 0;
    do {
      // take 3 digits at a time
      int num = number % 1000;
      if (num != 0){
          String str = convert(num);
          System.out.println(str);
          word = str + hundreds[index] + word;
          System.out.println(word);
      }
      index++;
      // move left by 3 digits
      number = number/1000;
    } while (number > 0);
    return word;
  }
  private static String convert(int number) {
    String word = "";    
    int num = number % 100;
    System.out.println(num);
    // Logic to take word from appropriate array
    if(num < 10){
      word = word + units[num];
      System.out.println(num);
    }
    else if(num < 20){
      word = word + doubles[num%10];
      System.out.println(word);
    }else{
      word = tens[num/10] + units[num%10];
      System.out.println(word);
    }
    word = (number/100 > 0)? units[number/100] + " hundred" + word : word;
    System.out.println(word);
    return word;
  }
        
  public static void main(String[] args) {
    //System.out.println("Number-- " + convertToWord(123456789));
    //System.out.println("Number-- " + convertToWord(78));
    //System.out.println("Number-- " + convertToWord(35658));
    System.out.println("Number-- " + convertToWord(2367904));
    System.out.println("Number-- " + convertToWord(200));
  }
=======
package access;
public class NumberToWord {
  private static final String[] units = {
    "",
    " one",
    " two",
    " three",
    " four",
    " five",
    " six",
    " seven",
    " eight",
    " nine"
  }; 
  private static final String[] doubles = {
    " ten",
    " eleven",
    " twelve",
    " thirteen",
    " fourteen",
    " fifteen",
    " sixteen",
    " seventeen",
    " eighteen",
    " nineteen"
  };
  private static final String[] tens = {
    "",
    "",
    " twenty",
    " thirty",
    " forty",
    " fifty",
    " sixty",
    " seventy",
    " eighty",
    " ninety"
  };
  private static final String[] hundreds = {
    "",
    " thousand",
    " million",
    " billion"
  }; 

  static String convertToWord(int number) {    
    String word = "";    
    int index = 0;
    do {
      // take 3 digits at a time
      int num = number % 1000;
      if (num != 0){
          String str = convert(num);
          System.out.println(str);
          word = str + hundreds[index] + word;
          System.out.println(word);
      }
      index++;
      // move left by 3 digits
      number = number/1000;
    } while (number > 0);
    return word;
  }
  private static String convert(int number) {
    String word = "";    
    int num = number % 100;
    System.out.println(num);
    // Logic to take word from appropriate array
    if(num < 10){
      word = word + units[num];
      System.out.println(num);
    }
    else if(num < 20){
      word = word + doubles[num%10];
      System.out.println(word);
    }else{
      word = tens[num/10] + units[num%10];
      System.out.println(word);
    }
    word = (number/100 > 0)? units[number/100] + " hundred" + word : word;
    System.out.println(word);
    return word;
  }
        
  public static void main(String[] args) {
    //System.out.println("Number-- " + convertToWord(123456789));
    //System.out.println("Number-- " + convertToWord(78));
    //System.out.println("Number-- " + convertToWord(35658));
    System.out.println("Number-- " + convertToWord(2367904));
    System.out.println("Number-- " + convertToWord(200));
  }
>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
}