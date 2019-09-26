//(2) 创建 People 类的子类 Student 类，并定义 stuNo 和 department 属性，代码如下：
package jicheng_test;

public class Student extends People {
	
    private String stuNo;    //学号
    private String department;    //所学专业

/*由于子类不能继承父类的构造方法，因此，要调用父类的构造方法，必须在子类的构造方法体的第一行使用 super() 方法。该方法会调用父类相应的构造方法来完成子类对象的初始化工作。
    在以下情况下需要使用 super 关键字：
    在类的构造方法中，通过 super 语句调用该类的父类的构造方法。
    在子类中访问父类中的成员。*/
	public Student(String name, int age, String sex, String sn,String stuNo,String department) {
		super(name, age, sex, sn);
        this.stuNo=stuNo;
        this.department=department;
	}
	
	public String toString() {
		return "姓名："+name+"\n年龄："+age+"\n性别"+sex+"\n身份证："+sn+"\n学号："+stuNo+"\n专业："+department;
	}

}
