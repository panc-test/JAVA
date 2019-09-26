//(4) 编写测试类 PeopleTest，在该类中创建 People 类的不同对象，分别调用它们的 toString() 方法，输出不同的信息。具体的代码如下：
package jicheng_test;

public class PeopleTest extends People {

	public PeopleTest(String name, int age, String sex, String sn) {
		super(name, age, sex, sn);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People stu=new Student("王丽丽",23,"女","410521198902145589","00001","计算机应用与技术");
		System.out.println(stu+"\n");
		
		People tea=new Teacher("张文",30,"男","410521198203128847",5,"计算机应用与技术");
		System.out.println(tea);

	}

}
