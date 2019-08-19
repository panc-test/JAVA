/*deleteCharAt() 方法用于移除序列中指定位置的字符，
该方法的语法格式如下：StringBuffer 对象.deleteCharAt(int index);
deleteCharAt() 方法的作用是删除指定位置的字符，然后将剩余的内容形成一个新的字符串。*/

/*delete() 方法用于移除序列中子字符串的字符，
该方法的语法格式如下：StringBuffer 对象.delete(int start,int end);
其中，start 表示要删除字符的起始索引值（包括索引值所对应的字符），end 表示要删除字符串的结束索引值（不包括索引值所对应的字符）。
该方法的作用是删除指定区域以内的所有字符。*/
package java_201908;

public class StringBuffer_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//deleteCharAt方法
		StringBuffer sb=new StringBuffer("She");
		sb.deleteCharAt(2);
		System.out.println(sb);  
		
		//delete方法-左闭右开区间
		StringBuffer sb1=new StringBuffer("hello jack");
		sb1.delete(2,5);
		System.out.println(sb1);    
		sb1.delete(2,5);
		System.out.println(sb1);
	}

}
