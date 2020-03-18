package bookExercises;

public class Book520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for (int n=3;n<1001;n++) {
		int i,m=0,flag=0;    
		  m=n/2;      
		  if(n==0||n==1){       
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
		}
	}

}
