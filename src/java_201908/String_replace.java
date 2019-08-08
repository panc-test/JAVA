/*在 Java 中，String 类提供了 3 种字符串替换方法，分别是 replace()、replaceFirst() 和 replaceAll()
（1）replace() 方法用于将目标字符串中的指定字符（串）替换成新的字符（串）
（2）replaceFirst() 方法用于将目标字符串中匹配某正则表达式的第一个子字符串替换成新的字符串
（3）replaceAll() 方法用于将目标字符串中匹配某正则表达式的所有子字符串替换成新的字符串*/

package java_201908;

public class String_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String world="hello world,hello java";
		System.out.println(world.replace("hello", "你好"));
		System.out.println(world.replaceFirst("hello", "你好"));
		System.out.println(world.replaceAll("hello", "你好"));
	}

}
