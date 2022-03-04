package Conditions;

public class ifcondition {
	
	public void f1(){
		int a =2;
		int b =5;
		int c =10;
		if(a==b){
		System.out.println("Equal");
		}else if(a==c){
			System.out.println("A and c are equal");
		}
		else if(b==c){
			System.out.println("b and c are equal");
		}else{
			System.out.println("Not equal");
		}
	}
	
	
	public void f2(){
		int[] a ={1,2,3,2,1,6};
	}
	
	public static void main(String[] args) {
		ifcondition obj = new ifcondition();
		obj.f1();
	}

}
