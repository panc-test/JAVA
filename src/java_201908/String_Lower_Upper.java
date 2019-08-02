//String 类的 toLowerCase() 方法可以将字符串中的所有字符全部转换成小写，toUpperCase() 则将字符串中的所有字符全部转换成大写，非字母的字符不受影响。

package java_201908;

public class String_Lower_Upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sahfa12#w字符sa";
		System.out.println("小写："+str.toLowerCase());
		System.out.println("大写："+str.toUpperCase());
		
	}

}
