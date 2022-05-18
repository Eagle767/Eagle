package Access;

public class Prime {

	public static void main(String[] args) {
		System.out.println("The prime Numbers are ");
		// TODO Auto-generated method stub
		for(int n=0;n<=100;n++) {
			 int i, m=0;
			 boolean flag=true;      
			  //int n=3;//it is the number to be checked    
			  m=n/2;      
			  if(n==0||n==1){  
			  // System.out.println(n+" is not prime number");      
			  }else{  
			   for(i=2;i<=m;i++){      
			    if(n%i==0){      
			    // System.out.println(n+" is not prime number");      
			     flag=false;      
			     break;      
			    }      
			   }      
			   if(flag)  { System.out.print(n+" "); }  
			  }//end of else
			}
		}
			

}
