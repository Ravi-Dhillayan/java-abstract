package abstraat;


import java.util.Scanner;

 class clas {

	
	void Run() {
	System.out.println("Running");
	}
	void s(int a,int b) {
		//int c;
	
	int	c=a+b;
		System.out.println("Sum of two number : "+c);
		
		
	}
	void su() {
		//int c;
		int x,y,z;
		Scanner o= new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		x=o.nextInt();
		System.out.println("Enter the 2nd number : ");
		y=o.nextInt();
		z=x-y;
		System.out.println("Subtract of two number : "+z);
		
		
	}
	static void mul() {
		int n,n1,m;
		Scanner o= new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		n=o.nextInt();
		System.out.println("Enter the 2nd number : ");
		n1=o.nextInt();
		m=n*n1;
		System.out.println("multiple of two number : "+m);
		
		
	}
	

}

public class classobj {
public static void main(String[] args) {
		
		clas com = new clas();
		com.Run();
		Scanner o= new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
	int	a=o.nextInt();
		System.out.println("Enter the 2nd number : ");
	int	b=o.nextInt();
		com.s(a,b);
		com.su();
		com.mul();

	}
}
