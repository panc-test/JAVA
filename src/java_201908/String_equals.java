/*在 Java 中，比较字符串的常用方法有 3 个：equals() 方法、equalsIgnoreCase() 方法、 compareTo() 方法。
（1）equals() 方法将逐个地比较两个字符串的每个字符是否相同。对于字符的大小写，也在检查的范围之内。
（2）equalsIgnoreCase() 方法的作用和语法与 equals() 方法完全相同，唯一不同的是 equalsIgnoreCase() 比较时不区分大小写。*/


package java_201908;
import java.util.Scanner;
public class String_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("《学生管理系统》");
		Scanner input=new Scanner(System.in);
		
		System.out.println("请设置一个管理员密码：");
		String password1=input.next();
		
		System.out.println("请再次输入密码：");
		String password2=input.next();
		
		input.close();
		
		if(password1.equals(password2)) {
			System.out.println("设置密码成功，请牢记你的密码："+password1);
		}else {
			System.out.println("两次密码不一致，请重新输入");
			}
		
//		if(password1.equalsIgnoreCase(password2)) {
//			System.out.println("设置密码成功，请牢记你的密码："+password1);
//		}else {
//			System.out.println("两次密码不一致，请重新输入");
//		}
	}

}
