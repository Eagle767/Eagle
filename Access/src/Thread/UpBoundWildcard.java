package Thread;

import java.util.Arrays;
import java.util.List;

public class UpBoundWildcard {
	  public static void main(String[] args) {
	    //Upper Bounded Integer List 
	    List<Integer> intList = Arrays.asList(10, 20, 30, 40);

	    //printing the sum of integer elements in list 
	    System.out.println("Total sum is:" + sum(intList));

	    //Upper Bounded Double list 
	    List < Double > doubleList = Arrays.asList(13.2, 15.3, 9.7, 22.5);

	    //printing the sum of double elements in list 
	    System.out.println("Total sum is: " + sum(doubleList));
	    
	  }
	  private static double sum(List <?extends Number> a) {
	    double sum = 0.0;
	    for (Number iterator: a) {
	      sum = sum + iterator.doubleValue();
	    }
	    return sum;
	  }
	}
