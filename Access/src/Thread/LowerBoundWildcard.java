package Thread;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class LowerBoundWildcard {
  public static void main(String[] args) {
    //Lower Bounded Integer List 
    List<?super Integer> intList = Arrays.asList(10, 20, 30, 40);

    //Passing Integer list object 
    printOnlyIntegerClassorSuperClass(intList);

    //Number list 
    List <?super Double > numberList = Arrays.asList(10, 20.5555, 35, 40);

    //Passing Integer list object 
    printOnlyIntegerClassorSuperClass(numberList);
    
  }

  public static void printOnlyIntegerClassorSuperClass(List<?> numberList) {
    System.out.println(numberList);
  }
}
