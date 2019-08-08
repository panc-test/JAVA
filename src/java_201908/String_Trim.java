// String 类的 trim() 方法可以去掉字符串中的首尾空格

package java_201908;

public class String_Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="  45wraf54 ";
		System.out.println("字符串str的长度是："+str.length());
		System.out.println("去掉首位空格后字符串str:"+str.trim());
		System.out.println("字符串str的长度是："+str.trim().length());
	}

}
