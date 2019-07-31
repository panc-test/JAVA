//用foreach遍历数组、集合
package java_201907;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]  languages= {"Java","Python","C","PHP"};
		System.out.println("现在流行的编程语言有：");
		for(String lange:languages) {
			System.out.println(lange);
		}
	}

}
