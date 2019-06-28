package java_201906;

//if else 嵌套语句
//假设某航空公司为吸引更多的顾客推出了优惠活动。原来的飞机票价为 3000 元，活动时，4~11 月旺季，头等舱 9 折，经济舱 8 折；1~3 月、12 月淡季，头等舱 5 折，经济舱 4 折，求机票的价格。

import java.util.Scanner;
public class TestIfElse02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入出行月份：");
		int month=input.nextInt();
		System.out.println("请输入机票类型，数字1表示头等舱，数字2表示经济舱：");
		int kind=input.nextInt();
		double price=3000;//定义原始机票价格
		if(month>=4&&month<=11) {
			if(kind==1) {
				System.out.println("机票价格="+price*0.9);
			}
			else if(kind==2) {
				System.out.println("机票价格="+price*0.8);
			}
			else {
				System.out.println("输入机票类型非法，请重新输入");
			}
		}
		else if(month>=1&&month<=3||month==12) {
			if(kind==1) {
				System.out.println("机票价格="+price*0.5);
			}
			else if(kind==2) {
				System.out.println("机票价格="+price*0.4);
			}
			else {
				System.out.println("输入机票类型非法，请重新输入");
			}
		}
		else {
			System.out.println("输入出行月份非法，请重新输入");
		}
		
	}

}
