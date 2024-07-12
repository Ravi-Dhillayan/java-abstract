package abstraat;

//import ainhert.Animala;
//import ainhert.Monkey;
//import ainhert.cheetah;

abstract class Animala{
	 abstract void eat();
	 abstract void foot();
	
}
class Monkey extends Animala{
	 void eat() {
		 System.out.println("Monkey eats Bananas");
	 }
	 void foot() {
		 System.out.println("Monkey foot is four");
	 }
}
class cheetah extends Animala{
	 void eat() {
		 System.out.println("cheetah eats meat : ");
	 }
	 void foot() {
		 System.out.println("Cheetah foot four : ");
	 }
}
public class Ani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cheetah co=new cheetah();
		co.eat();
		co.foot();
		Monkey mo=new Monkey();
		mo.eat();
		mo.foot();
	}

}
