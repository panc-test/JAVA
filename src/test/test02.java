/*假设，在作业提交系统中学生需要录入提交的 Java 文件名称及要提交到的邮箱地址，那么就需要对学生输入的这些信息进行校验，判断输入是否有误。
校验的规则为：录入的文件名称必须以“.java”结尾，录入的邮箱地址中必须包含有“@”符号和“.”符号，且“@”在“.”之前。*/


package test;
import java.util.Scanner;
public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean filecon=false;    //判断文件名是否合法
	        boolean emailcon=false;    //判断邮箱地址是否合法
	        System.out.println("************ 欢迎进入作业提交系统 ************");
	        Scanner input=new Scanner(System.in);
	        System.out.println("请输入要提交的Java文件名称：");
	        String name=input.next();    //获取输入的Java文件名
	        System.out.println("请输入要提交到的邮箱地址：");
	        String email=input.next();    //获取输入的邮箱地址
	        
	        //检查输入的文件名是否合法
	        int index=name.lastIndexOf('.');    // 获取"."所在的位置
	        if(index!=-1&&name.charAt(index+1)=='j'
	                    &&name.charAt(index+2)=='a'
	                    &&name.charAt(index+3)=='v'
	                    &&name.charAt(index+4)=='a')
	        {
	            filecon=true;
	        }
	        else
	        {
	            System.out.println("输入的文件名无效！");
	        }
	        //检查邮箱地址是否合法
	        if(email.indexOf('@')!=1&&email.indexOf('.')>email.indexOf('@'))
	        {
	            emailcon=true;
	        }
	        else
	        {
	            System.out.println("输入的邮箱地址无效!");
	        }
	        //输出校验的结果
	        if(filecon&&emailcon)
	        {
	            System.out.println("作业提交成功!");
	        }
	        else
	        {
	            System.out.println("作业提交失败!");
	        }
	        input.close();
	}

}
