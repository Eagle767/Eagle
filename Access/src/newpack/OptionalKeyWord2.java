<<<<<<< HEAD
package newpack;
import java.util.Optional;
public class OptionalKeyWord2 {
	public static void main(String[] args) {
        String[] str = new String[10];
        if(str[0]!=null) {
        String lowercaseString = str[0].toLowerCase();
        System.out.print(lowercaseString);
        }
        str[5]="hello";
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){  // check for value is present or not
         String  lowercaseString = str[5].toLowerCase();
            System.out.println("...."+lowercaseString);
        }else {
            System.out.println("string value is not present");
        }
        checkNull.ifPresent(x -> System.out.println(x.toLowerCase()));
    }
=======
package newpack;
import java.util.Optional;
public class OptionalKeyWord2 {
	public static void main(String[] args) {
        String[] str = new String[10];
        if(str[0]!=null) {
        String lowercaseString = str[0].toLowerCase();
        System.out.print(lowercaseString);
        }
        str[5]="hello";
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){  // check for value is present or not
         String  lowercaseString = str[5].toLowerCase();
            System.out.println("...."+lowercaseString);
        }else {
            System.out.println("string value is not present");
        }
        checkNull.ifPresent(x -> System.out.println(x.toLowerCase()));
    }
>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
}