package UP_DOWN_Casting;

public class ClassC {
	
	
	public static void main(String[] args) {
		
		
		ClassB k = new ClassB();
		 
		k.demo1();
		k.demo2();
		k.demo3();
		
		System.out.println(" ");
		System.out.println("================Upcasted ClassB==================");
		
		ClassA p = new ClassB();
		
		p.demo1();
		p.demo2();
		
		System.out.println(" ");
		System.out.println("==============UpCasted ClassD====================");
		
		p = new ClassD();
		
		p.demo1();
		p.demo2();
		
		System.out.println(" ");
		System.out.println("==============Down Casting=======================");
		
	//	ClassB h = new ClassA();          //Cannot Down Casting in implicit way.
		
		ClassA m = new ClassB();
		
		ClassB t = (ClassB)m;   //Down Casting (Explicitly)
		
		t.demo1();
		t.demo2();
		t.demo3();
		
		
		
		
		
		
	}
	
	
	

}
