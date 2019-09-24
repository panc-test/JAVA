/*声明可变参数的语法格式如下：methodName({paramList},paramType…paramName)
其中，methodName 表示方法名称；paramList 表示方法的固定参数列表；paramType 表示可变参数的类型；… 是声明可变参数的标识；paramName 表示可变参数名称。*/

package java_201909;

public class StudentTestMethod {
	
	public void print(String...names) {
		System.out.println("参加本次考试的同学名单如下：");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentTestMethod stu=new StudentTestMethod();
		stu.print("张强","李成","王勇");
	}

}
