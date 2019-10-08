//(4) 编写测试类 PeopleTest，在该类中创建 People 类的不同对象，分别调用它们的 toString() 方法，输出不同的信息。具体的代码如下：
package jicheng_test;

public class PeopleTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu=new Student("王丽丽",23,"女","410521198902145589","00001","计算机应用与技术");
		System.out.println(stu.toString()+"\n");
		
		Teacher tea=new Teacher("张文",30,"男","410521198203128847",5,"计算机应用与技术");
		System.out.println(tea.toString());

	}

}
