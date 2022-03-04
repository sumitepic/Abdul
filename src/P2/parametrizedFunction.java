package P2;

public class parametrizedFunction {
	
	public void f1(int hour){
		int sal=0;
		sal =hour*1000;
		System.out.println(sal);
	}
	
	public void f1(){
		int sal=0;
		int hour =10;
		sal =hour*1000;
		System.out.println(sal);
	}
	
	public int[] f23(){
		int[] a ={10,11,12,45,36};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		return a;
	}
	
	public static void main(String[] args) {
		parametrizedFunction obj = new parametrizedFunction();
		obj.f1(9); //9000
		obj.f1(4); // 4000
		obj.f23();
	}

}
