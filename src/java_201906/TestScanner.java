package java_201906;
//java中获取键盘输入值Scanner类的用法

import java.util.Scanner;
public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入姓名：");
		String name=input.nextLine();
		
		System.out.println("请输入年龄：");
		int age=input.nextInt();
		
		System.out.println("请输入工资：");
		float salary=input.nextFloat();
		
		System.out.println("你的个人信息如下：");
		System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"工资："+salary);   //  "\n"转义字符换行
	}

}
