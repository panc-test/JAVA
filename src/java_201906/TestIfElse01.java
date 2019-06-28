package java_201906;
//输入学生成绩判断等级，等级标注为不低于 90，可以评为优秀；低于 90 但不低于 80，可以评为良好；低于 80 但不低于 60，可以评为中等；否则评为差。

import java.util.Scanner;
public class TestIfElse01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入成绩：");
		Scanner input=new Scanner(System.in);  //接收键盘输入数据
		int score=input.nextInt();
		if(score>=90) {
			System.out.println("优秀");
		}
		else if(score>=80) {
			System.out.println("良好");
		}
		else if(score>=60){
			System.out.println("中等");
		}
		else {
			System.out.println("差");
		}

	}

}
