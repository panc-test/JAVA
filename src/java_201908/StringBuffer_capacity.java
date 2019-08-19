/*StringBuffer 类提供了 3 个构造方法来创建一个字符串，如下所示：
StringBuffer() 构造一个空的字符串缓冲区，并且初始化为 16 个字符的容量。
StringBuffer(int length) 创建一个空的字符串缓冲区，并且初始化为指定长度 length 的容量。
StringBuffer(String str) 创建一个字符串缓冲区，并将其内容初始化为指定的字符串内容 str，字符串缓冲区的初始容量为 16 加上字符串 str 的长度。*/

package java_201908;

public class StringBuffer_capacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str1=new StringBuffer();
		StringBuffer str2=new StringBuffer(10);
		StringBuffer str3=new StringBuffer("java");
		
		//capacity()方法返回字符串的容量大小
		System.out.println(str1.capacity());
		System.out.println(str2.capacity());
		System.out.println(str3.capacity());

	}

}
