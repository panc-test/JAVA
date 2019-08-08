//String类的lastIndexOf() 方法用于返回字符（串）在指定字符串中最后一次出现的索引位置，如果能找到则返回索引值，否则返回 -1。
/*该方法也有两种重载形式：
str.lastIndexOf(value)
str.lastlndexOf(value, int fromIndex)
注意：lastIndexOf() 方法的查找策略是从右往左查找，如果不指定起始索引，则默认从字符串的末尾开始查找。*/

package java_201908;

public class String_LastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words="today,monday,Sunday";
		System.out.println(words.lastIndexOf("day"));
		System.out.println(words.lastIndexOf("day", 3));
	}

}
