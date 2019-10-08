//(1) 创建人类 People，并定义 name、age、sex、sn 属性，代码如下：
package jicheng_test;

public class People{
    public String name;    //姓名
    public int age;    //年龄
    public String sex;    //性别
    public String sn;    //身份证号
    public People(String name,int age,String sex,String sn)
    {
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.sn=sn;
    }
    
    //toString() 方法返回此对象本身,因为它是Object里面已经有了的方法，而所有类都是继承Object，所以“所有对象都有这个方法”。
    public String toString()
    {
        return"姓名："+name+"\n年龄："+age+"\n性别："+sex+"\n身份证号："+sn;
    }


}
