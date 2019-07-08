//根据出生日期计算（判断）星座
//白羊：0321~0420          天秤：0924~1023
//金牛：0421~0521          天蝎：1024~1122
//双子：0522~0621          射手：1123~1221
//巨蟹：0622~0722          摩羯：1222~0120
//狮子：0723~0823          水瓶：0121~0219
//处女：0824~0923          双鱼：0220~0320

package java_201907;

import java.util.Scanner;

public class SwithPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入你的出生日期（如0501表示5月1号）：");
		Scanner input = new Scanner(System.in);
		int monthday = input.nextInt();
		int month = monthday / 100;
		int day = monthday % 100;
		String xingzuo = "";
		switch (month) {

		case 1:
			xingzuo = day < 21 ? "摩羯座" : "水瓶座";
			break;
		case 2:
			xingzuo = day < 20 ? "水瓶座" : "双鱼座";
			break;
		case 3:
			xingzuo = day < 21 ? "双鱼座" : "白羊座";
			break;
		case 4:
			xingzuo = day < 21 ? "白羊座" : "金牛座";
			break;
		case 5:
			xingzuo = day < 22 ? "金牛座" : "双子座";
			break;
		case 6:
			xingzuo = day < 22 ? "双子座" : "巨蟹座";
			break;
		case 7:
			xingzuo = day < 23 ? "巨蟹座" : "狮子座";
			break;
		case 8:
			xingzuo = day < 24 ? "狮子座" : "处女座";
			break;
		case 9:
			xingzuo = day < 24 ? "处女座" : "天秤座";
			break;
		case 10:
			xingzuo = day < 24 ? "天秤座" : "天蝎座";
			break;
		case 11:
			xingzuo = day < 23 ? "天蝎座" : "射手座";
			break;
		case 12:
			xingzuo = day < 22 ? "射手座" : "摩羯座";
			break;
		}
		System.out.println("你的星座是："+xingzuo);
	}

}
