//String 类的 concat() 方法实现了将一个字符串连接到另一个字符串的后面

package java_201908;
//import java.lang.String;
public class String_Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="字符串1、";
		str=str.concat("字符串2、");
		str=str.concat("字符串3");
		System.out.println(str);
		System.out.println(str.length());
		
	}

}
