/*访问范围			private		friendly(默认)	protected	public
同一个类			可访问		可访问			可访问		可访问
同一包中的其他类		不可访问		可访问			可访问		可访问
不同包中的子类		不可访问		不可访问			可访问		可访问
不同包中的非子类		不可访问		不可访问			不可访问		可访问*/

package java_201909;

class Student{

	String name;
	private String idNumber;
	protected String no;
	public String email;
    
    public String info()
    {
        return"姓名："+name+"，身份证号码："+idNumber+"，学号："+no+"，邮箱："+email;
    }
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.name="李明";
		//stu.idNumber="342225199210242414";  idNumber是私有变量，其他类中无法调用
		stu.no="11431050";
		stu.email="1976085712@qq.com";
		
		System.out.println(stu.info());
	}

}
