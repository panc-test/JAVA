/*（3）String类的compareTo() 方法用于按字典顺序比较两个字符串的大小，该比较是基于字符串各个字符的 Unicode 值。
语法格式如下：str.compareTo(String otherstr);
它会按字典顺序将 str 表示的字符序列与 otherstr 参数表示的字符序列进行比较。如果按字典顺序 str 位于 otherster 参数之前，比较结果为一个负整数；
如果 str 位于 otherstr 之后，比较结果为一个正整数；如果两个字符串相等，则结果为 0。
*/

package java_201908;

public class String_CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String str="A";
	    String str1="a";
	    System.out.println("str="+str);
	    System.out.println("str1="+str1);
	    System.out.println("str.compareTo(str1)的结果是："+str.compareTo(str1));
	    System.out.println("str1.compareTo(str)的结果是："+str1.compareTo(str));
	    System.out.println("str1.compareTo('a')的结果是："+str1.compareTo("a"));
	}

}
