package OOPS;

public class child extends Parent{
	
	public void childFlat(){
		System.out.println("Child");
	}
	
	public void parentFlat(){
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		child child = new child();
		Parent parent = new child(); 
		parent.parentFlat();
		
	}
}
