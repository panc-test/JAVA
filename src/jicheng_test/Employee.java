/*实现封装的具体步骤如下：
1、修改属性的可见性来限制对属性的访问。
2、为每个属性创建一对赋值方法和取值方法，用于对这些属性的访问。
3、在赋值和取值方法中，加入对属性的存取限制。*/

//面以一个员工类的封装为例介绍封装过程。一个员工的主要属性有姓名、年龄、联系电话和家庭住址。假设员工类为 Employee，示例如下：
package jicheng_test;

public class Employee {
    private String name;    //姓名
    private int age;    //年龄
    private String phone;    //联系电话
    private String address;    //家庭住址
    
    public String getname() {
    	return name;
    }   
    public void setname(String name) {
    	this.name=name;
    }
    
    public int getage() {
    	return age;
    }
    
    public void setage(int age) {
    	this.age=age;
    }
    
    public String getphone() {
    	return phone;
    }   
    public void setphone(String phone) {
    	this.phone=phone;
    }
    
    public String getaddress() {
    	return address;
    }   
    public void setaddress(String address) {
    	this.address=address;
    }
	

}
