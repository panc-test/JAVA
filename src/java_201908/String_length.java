// String 类的 length() 方法获取字符串的长度

/*在学生信息管理系统中对管理员密码有这样的规定，即密码长度必须大于 6 位且小于 12 位。因为密码太短容易被破解，太长的话又不容易记住。
这就需要首先获取用户输入的密码字符串，然后调用 length() 方法获取长度，再做进一 步的长度判断，最终实现代码如下所示：*/

package java_201908;
import java.util.Scanner;
public class String_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎进入学生信息管理系统，请设置一个管理员密码：");
		Scanner input=new Scanner(System.in);
		String pass=input.nextLine();
		int lang=pass.length();     //获取密码长度
		if(lang>6&&lang<12) {
			System.out.println("密码已生效，请牢记密码："+pass);
		}else if(lang<=6) {
			System.out.println("密码太短");
		}else {
			System.out.println("密码太长");
		}
		input.close();
	}

}
