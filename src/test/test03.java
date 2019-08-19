//正则表达式
package test;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex="0\\d{2,3}[-]?\\d{7,8}|0\\d{2,3}\\s?\\d{7,8}|13[0-9]\\d{8}|15[1089]\\d{8}";
		String answer="Y";
		do
		{
		    System.out.print("请留下您的电话号码：");
		    Scanner scan=new Scanner(System.in);
		    String phone=scan.next();    //接收用户在控制台输入的电话号码
		    Pattern pattern=Pattern.compile(regex);    //编译正则表达式
		    Matcher matcher=pattern.matcher(phone);    //创建给定输入模式的匹配器
		    boolean bool=matcher.matches();
		    scan.close();
		    if(bool)
		    { //如果验证通过
		        System.out.println("输入的电话号码格式正确。");
		    }
		    else
		    {
		        System.out.println("输入的电话号码无效，格式不正确。");
		    }
		    System.out.print("是否继续输入？（Y/N 或者 y/n）");
		    answer=scan.next();
		}while(answer.equalsIgnoreCase("Y"));
		System.out.println("注册结束。");
	}

}
