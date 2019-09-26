//(3) 创建 People 类的另一个子类 Teacher，并定义 tYear 和 tDept 属性，代码如下：
package jicheng_test;

public class Teacher extends People {

    private int tYear;    //教龄
    private String tDept;    //所教专业
    
	public Teacher(String name, int age, String sex, String sn, int tYear, String tDept) {
		super(name, age, sex, sn);
        this.tYear=tYear;
        this.tDept=tDept;
	}
	
    public String toString()
    {
        return"姓名："+name+"\n年龄："+age+"\n性别:"+sex+"\n身份证号："+sn+"\n教龄："+tYear+"\n所教专业："+tDept;
    }

}
