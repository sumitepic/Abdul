package exceptionHandling;

public class First {
		int a =10;
		String g ="";
	public void f1(int a, int b) {
		try{
		System.out.println(a+b);
		}catch(Exception e){
			System.out.println("I am in exception block");
		}finally{
			System.out.println("Finally block Always Print");
		}
	}

	public void f3() throws InterruptedException{
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			Thread.sleep(5000);
		}
	}
	public void f2() throws InterruptedException {
		System.out.println("Print");
		
	}

	public static void main(String[] args) throws InterruptedException  {
		First obj = new First();
		obj.f3();
		
		
	}

}
