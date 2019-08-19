/*StringBuffer 类的 setCharAt() 方法用于在字符串的指定索引位置替换一个字符。
该方法的语法格式如下：StringBuffer 对象.setCharAt(int index, char ch);
该方法的作用是修改对象中索引值为 index 位置的字符为新的字符 ch。*/

package java_201908;

public class StringBuffer_setCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer=new StringBuffer("java");
		buffer.setCharAt(0, 'J');
		System.out.println(buffer);
		buffer.setCharAt(1, 'A');
		System.out.println(buffer);
		buffer.setCharAt(2, 'V');
		System.out.println(buffer);
		buffer.setCharAt(3, 'A');
		System.out.println(buffer);
	}

}
