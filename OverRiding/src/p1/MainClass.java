package p1;

class Parent{
	public void Show() {
		System.out.println("Parent show...");
	}
}
class Child extends Parent{
	public void Show() {
		System.out.println("Child Show...");
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Parent ob1=new Parent();
   ob1.Show();
   
   Parent ob2=new Child();
   ob2.Show();
	}

}
