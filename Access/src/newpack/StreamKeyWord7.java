<<<<<<< HEAD
package newpack;
import java.util.ArrayList;
import java.util.List;
public class StreamKeyWord7 {
    public static void main(String[] args) {
        long t1, t2;
        List<Employee> eList = new ArrayList<Employee>();
        for(int i=0; i<1000000; i++) {
            eList.add(new Employee("A"+i, 20000));
        }
        /***** Here We Are Creating A 'Sequential Stream' & Displaying The Result *****/
        t1 = System.currentTimeMillis();
        System.out.println("Sequential Stream Count?= " + eList.stream().filter(e -> e.getSalary() > 15000).count());
        t2 = System.currentTimeMillis();
        System.out.println("Sequential Stream Time Taken?= " + (t2-t1) + "\n");
        /***** Here We Are Creating A 'Parallel Stream' & Displaying The Result *****/
        t1 = System.currentTimeMillis();
        System.out.println("Parallel Stream Count?= " + eList.parallelStream().filter(e -> e.getSalary() > 15000).count());
        t2 = System.currentTimeMillis();
        System.out.println("Parallel Stream Time Taken?= " + (t2-t1));
    }
=======
package newpack;
import java.util.ArrayList;
import java.util.List;
public class StreamKeyWord7 {
    public static void main(String[] args) {
        long t1, t2;
        List<Employee> eList = new ArrayList<Employee>();
        for(int i=0; i<1000000; i++) {
            eList.add(new Employee("A"+i, 20000));
        }
        /***** Here We Are Creating A 'Sequential Stream' & Displaying The Result *****/
        t1 = System.currentTimeMillis();
        System.out.println("Sequential Stream Count?= " + eList.stream().filter(e -> e.getSalary() > 15000).count());
        t2 = System.currentTimeMillis();
        System.out.println("Sequential Stream Time Taken?= " + (t2-t1) + "\n");
        /***** Here We Are Creating A 'Parallel Stream' & Displaying The Result *****/
        t1 = System.currentTimeMillis();
        System.out.println("Parallel Stream Count?= " + eList.parallelStream().filter(e -> e.getSalary() > 15000).count());
        t2 = System.currentTimeMillis();
        System.out.println("Parallel Stream Time Taken?= " + (t2-t1));
    }
>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
}