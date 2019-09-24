/*与成员变量类似，成员方法也可以分为两种：静态方法（或称为类方法），指被 static 修饰的成员方法；实例方法，指没有被 static 修饰的成员方法。
在访问非静态方法时，需要通过实例对象来访问，而在访冋静态方法时，可以直接访问，也可以通过类名来访问，还可以通过实例化对象来访问。*/

package java_201909;

public class StaticMethod {
	
	public static int count=3;	//定义一个公共的静态变量count=1
	
	public int method1(){		//实例方法method1 
		count++;
		System.out.println("静态方法 method1()中的 count="+count);
		return count;
	}
	
	public static int method2() {	//静态方法method2
		count+=count;
		System.out.println("m静态方法 method2()中的 count="+count);
		return count;
	}
	
	public static void method3() {	//静态方法method3
		count+=2;
		System.out.println("method3方法中="+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod stf=new StaticMethod();
		System.out.println("method1() 方法返回值="+stf.method1()+"\n");
		System.out.println("method2() 方法返回值="+method2()+"\n");
		StaticMethod.method3();

	}

}
