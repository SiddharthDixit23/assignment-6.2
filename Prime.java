import java.util.*;
class Hello implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 int n, i, flag = 0;

		   System.out.println("Enter a positive integer: ");
		   Scanner obj = new Scanner(System.in);
		   n = obj.nextInt();

		    for(i=2; i<=n/2; i++)
		    {
		       
		        if(n%i==0)
		        {
		            flag=1;
		            break;
		        }
		    }

		    if (flag==0)
		        System.out.println(n+" is a prime number.");
		    else
		        System.out.println(n+" is not a prime number.");
		    
		    
	}
	
}


public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello h = new Hello();
		Thread t = new Thread(h);
		t.start();
	}

}
