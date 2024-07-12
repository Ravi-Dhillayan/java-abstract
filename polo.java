package abstraat;

import java.util.Scanner;

abstract class employee {
	abstract void empol();
}
class Bank extends employee{
	int salary,id;
	String nm;
	public void empol() {
		System.out.println("Enter the name of Bank employee : ");
		Scanner o=new Scanner(System.in);
		nm=o.nextLine();
		System.out.println("Enter the Employee Id : ");
		id=o.nextInt();
		System.out.println("Enter the Employeee Salary : ");
		salary=o.nextInt();
		
	}
public	void empol(int a)  {
		System.out.println("Name of Bank employee :: "+nm);
		System.out.println("Bank Employee Id : "+id);
		System.out.println("Salary of Employee : "+salary);
	}

}
class company extends Bank{
	int salary,id;
	String nm;
	public void empol() {
		System.out.println("Enter the name of Company  employee : ");
		Scanner o=new Scanner(System.in);
		nm=o.nextLine();
		System.out.println("Enter the Employee Id : ");
		id=o.nextInt();
		System.out.println("Enter the Employeee Salary : ");
		salary=o.nextInt();
		
	}
public	void empol(int a)  {
		System.out.println("Name of Company  employee :: "+nm);
		System.out.println("Bank Employee Id : "+id);
		System.out.println("Salary of Employee : "+salary);
	}
}
public class polo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bank obj=new Bank();
      obj.empol();
      obj.empol(1);
      obj=new company();
      obj.empol();
      obj.empol(1);
	}

}
