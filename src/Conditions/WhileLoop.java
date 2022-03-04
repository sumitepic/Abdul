package Conditions;

public class WhileLoop {
	
	public void f1(){
		int[] a ={11,21,31,41,51,61};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int i = 0;
		while(i < a.length){
			System.out.println(a[i]);
			i++;
		}
	}
	
	public static void main(String[] args) {
		WhileLoop obj = new WhileLoop();
		obj.f1();
	}
}
