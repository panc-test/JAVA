//编写一个程序，根据用户输入的总人数和总成缋计算平均成绩。要求程序能够处理总人数或者总成绩不是数字时的情况。
package java_201910;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Throw_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		try{
			System.out.println("请输入班级总人数：");
			int count=input.nextInt();
            System.out.println("请输入总成绩：");
            int score=input.nextInt();
            int avg=score/count;    //获取平均分
            System.out.println("本次考试的平均分为："+avg);	
		}
		catch(InputMismatchException e1) {
			System.out.println("输入数值有误");
		}
		catch(ArithmeticException e2) {
			System.out.println("输入的总人数不能为0！");
		}
		catch(Exception e3) {
            e3.printStackTrace();
            System.out.println("发生错误！"+e3.getMessage());
		}
		input.close();
	}

}
