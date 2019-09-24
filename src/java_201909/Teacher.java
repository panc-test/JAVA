/*构造方法是类的一种特殊方法，用来初始化类的一个新的对象。Java 中的每个类都有一个默认的构造方法，它必须具有和类名相同的名称，而且没有返回类型。
构造方法的默认返回类型就是对象类型本身，并且构造方法不能被 static、final、synchronized、abstract 和 native 修饰。*/
package java_201909;

public class Teacher {
	
    private String name;    //教师名称
    private double salary;    //工资
    private int age;    //年龄
    
    //创建一个构造方法Teacher
    public  Teacher(String name,double salary,int age){
        this.name=name;  
        this.salary=salary; 
        this.age=age;  
    }
    
    //在main主方法中调用构造方法
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Teacher teacher=new Teacher("王刚",5000.0,45);   //创建一个变量teacher引用构造方法Teacher
		System.out.println("教师信息如下：");
		System.out.println("教师名称："+teacher.name+"\n教师工资："+teacher.salary+"\n教师年龄："+teacher.age);

	}

}
