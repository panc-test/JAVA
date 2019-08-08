//String类的indexOf() 方法用于返回字符（串）在指 定字符串中首次出现的索引位置，如果能找到，则返回索引值，否则返回 -1。

/*该方法主要有两种重载形式：
str.indexOf(value)
str.indexOf(value,int fromIndex)

其中，str 表示指定字符串；value 表示待查找的字符（串）；fromIndex 表示查找时的起始索引，如果不指定 fromIndex，则默认从指定字符串中的开始位置（即 fromIndex 默认为 0）开始查找。*/

package java_201908;

public class String_indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello world";
		System.out.println(str.indexOf("o"));
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("o", 5));
	}

}
