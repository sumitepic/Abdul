package P2;

import P1.First;

public class callingClass {

	public void g1(){
		First abdul = new First(); // Object
		abdul.f2();
	}
	
	public static void main(String[] args) {
		callingClass obj =new callingClass();
		obj.g1();
	}
}
