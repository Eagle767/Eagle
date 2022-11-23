<<<<<<< HEAD
package access;

import java.util.Scanner;

public class Test {
	static String[] key= {"","one","two","three","four","five","six","seven","eight"," nine", " ten",
		    " eleven",
		    " twelve",
		    " thirteen",
		    " fourteen",
		    " fifteen",
		    " sixteen",
		    " seventeen",
		    " eighteen",
		    " nineteen",
		    " twenty",
		    " thirty",
		    " forty",
		    " fifty",
		    " sixty",
		    " seventy",
		    " eighty",
		    " ninety"};
	static String[] key2= {"",
		    "",
		    " twenty",
		    " thirty",
		    " forty",
		    " fifty",
		    " sixty",
		    " seventy",
		    " eighty",
		    " ninety"};
	static String[] key3= {"hundred",
		    " thousand",
		   // " million",
		   // " billion"
	};
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 10000 Below values");
		int n=s.nextInt();
		
		String word="";
		
		if(0<=n && n< 20){
		      word =key[n];
		      //System.out.println(n);
		    }
		    else if(n >= 20 && n<100){
		      word =key2[n/10] + key[n%10];
		      //System.out.println(word);
		    }
		    else if(n/100>0){
		    	int index = 0;
		        do {
		          // take 3 digits at a time
		          int num = n % 1000;
		          if (num != 0){
		              //String str = num;
		             // System.out.println(num);
		              word = num + key3[index] + word;
		              System.out.println(word);
		          }
		          index++;
		          // move left by 3 digits
		          n = n/1000;
		        } while (n > 0);
			      //word = key[n/100]+ key3[0] + key2[(n%100)/10] +key[(n%100)%10];
			      //System.out.println(word);
			    }//filled
		    /*  else if(n/100 > 0){
			      word = key[n/1000]+ key3[1] + key[(n%1000)/100]+ key3[0] + key2[(n%100)/10] +key[(n%100)%10] ;
			      //System.out.println(word);
		    }//filled
		   else if(n >= 10000 && n<10000000){
			      word = key[n/1000000]+ key3[2];//+ key[(n%10000)/1000]+ key3[1] + key[(n%1000)/100]+ key3[0] + key2[(n%100)/10] +key[(n%100)%10] ;
			      System.out.println(word);
		    }
		    else if(n >= 10000000 && n<2000000000){
			      word = key[n/1000]+ key3[3] +key[n/1000]+ key3[2]+ key[n/1000]+ key3[1] + key[(n%1000)/100]+ key3[0] + key2[(n%100)/10] +key[(n%100)%10] ;
			      System.out.println(word);
		    }*///System.out.println(word);
	}
}


=======
package access;

import java.util.Scanner;

public class Test {
	static String[] key= {"","one","two","three","four","five","six","seven","eight"," nine", " ten",
		    " eleven",
		    " twelve",
		    " thirteen",
		    " fourteen",
		    " fifteen",
		    " sixteen",
		    " seventeen",
		    " eighteen",
		    " nineteen",
		    " twenty",
		    " thirty",
		    " forty",
		    " fifty",
		    " sixty",
		    " seventy",
		    " eighty",
		    " ninety"};
	static String[] key2= {"",
		    "",
		    " twenty",
		    " thirty",
		    " forty",
		    " fifty",
		    " sixty",
		    " seventy",
		    " eighty",
		    " ninety"};
	static String[] key3= {"hundred",
		    " thousand",
		   // " million",
		   // " billion"
	};
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 10000 Below values");
		int n=s.nextInt();
		
		String word="";
		
		if(0<=n && n< 20){
		      word =key[n];
		      //System.out.println(n);
		    }
		    else if(n >= 20 && n<100){
		      word =key2[n/10] + key[n%10];
		      //System.out.println(word);
		    }
		    else if(n/100>0){
		    	int index = 0;
		        do {
		          // take 3 digits at a time
		          int num = n % 1000;
		          if (num != 0){
		              //String str = num;
		             // System.out.println(num);
		              word = num + key3[index] + word;
		              System.out.println(word);
		          }
		          index++;
		          // move left by 3 digits
		          n = n/1000;
		        } while (n > 0);
			      //word = key[n/100]+ key3[0] + key2[(n%100)/10] +key[(n%100)%10];
			      //System.out.println(word);
			    }//filled
		    /*  else if(n/100 > 0){
			      word = key[n/1000]+ key3[1] + key[(n%1000)/100]+ key3[0] + key2[(n%100)/10] +key[(n%100)%10] ;
			      //System.out.println(word);
		    }//filled
		   else if(n >= 10000 && n<10000000){
			      word = key[n/1000000]+ key3[2];//+ key[(n%10000)/1000]+ key3[1] + key[(n%1000)/100]+ key3[0] + key2[(n%100)/10] +key[(n%100)%10] ;
			      System.out.println(word);
		    }
		    else if(n >= 10000000 && n<2000000000){
			      word = key[n/1000]+ key3[3] +key[n/1000]+ key3[2]+ key[n/1000]+ key3[1] + key[(n%1000)/100]+ key3[0] + key2[(n%100)/10] +key[(n%100)%10] ;
			      System.out.println(word);
		    }*///System.out.println(word);
	}
}


>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
