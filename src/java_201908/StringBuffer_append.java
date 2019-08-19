/*StringBuffer 类的 append() 方法用于向原有 StringBuffer 对象中追加字符串。
该方法的语法格式如下：StringBuffer 对象.append(String str)
该方法的作用是追加内容到当前 StringBuffer 对象的末尾，类似于字符串的连接。*/


package java_201908;

public class StringBuffer_append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer=new StringBuffer("hello ");
		String str="world!";
		System.out.println("buffer.append(str)="+buffer.append(str));
	}

}
