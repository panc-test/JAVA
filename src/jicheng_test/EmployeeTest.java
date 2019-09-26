//编写测试类 EmployeeTest，在该类的 main() 方法中调用 Employee 属性的 setXxx() 方法对其相应的属性进行赋值，并调用 getXxx() 方法访问属性。

package jicheng_test;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee people=new Employee();
		people.setname("李明");
		people.setage(22);
		people.setphone("15224173510");
		people.setaddress("上海市浦东新区");
		
		System.out.println("姓名："+people.getname());
		System.out.println("年龄"+people.getage());
		System.out.println("电话"+people.getphone());
		System.out.println("地址："+people.getaddress());
	}

}
