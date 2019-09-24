//main() 方法是静态的。如果要在 main() 方法中调用本类中的其他方法，则该方法也必须是静态的，否则需要先创建本类的实例对象，然后再通过对象调用成员方法。
package java_201909;

public class MainTest {
	
	public void sum1() {
		System.out.println("sum1是非静态方法");
	}
	
	public static void sum2() {
		System.out.println("sum2是静态方法");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum2();  //静态方法可以直接调用
		
		MainTest sum=new MainTest();  //调用非静态方法，需要通过类的对象来调用
		sum.sum1();
		
	}

}
