<<<<<<< HEAD
package newpack;
import java.util.Optional;
public class OptionalKeyWord3 {
	
    public static void main(String []args){
        String myString = null;
        System.out.println(myString.length());
        // The above code will throw a NullPointerException at line number 5.
        // This can be handled in this way.
        if (myString != null){
	   	     System.out.println(myString.length());
		}else{
			System.out.println("null string");
		}
        //Java 8 way
        Optional<String> myStringoptional = Optional.empty();
        myStringoptional.ifPresent(x -> System.out.println(x.length()));
    }
=======
package newpack;
import java.util.Optional;
public class OptionalKeyWord3 {
	
    public static void main(String []args){
        String myString = null;
        System.out.println(myString.length());
        // The above code will throw a NullPointerException at line number 5.
        // This can be handled in this way.
        if (myString != null){
	   	     System.out.println(myString.length());
		}else{
			System.out.println("null string");
		}
        //Java 8 way
        Optional<String> myStringoptional = Optional.empty();
        myStringoptional.ifPresent(x -> System.out.println(x.length()));
    }
>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
}