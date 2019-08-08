//String 类的 substring() 方法用于对字符串进行提取

package java_201908;

public class String_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="我爱学习 java编程";
		
		//str.substring(beginIndex)
		System.out.println(str.substring(0));
		System.out.println(str.substring(5));
		
		//str.substring(beginIndex, endIndex)
		System.out.println(str.substring(0, 4));
		System.out.println(str.substring(5, 11));
	}

}
