/*所谓闰年，就是指 2 月有 29 天的那一年。闰年同时满足以下条件：
年份能被 4 整除。
年份若是 100 的整数倍，须被 400 整除，否则是平年。*/

//判断用户输入的年份是不是闰年，并根据年份和月份输出某年某月的天数。
package java_201907;
import java.util.Scanner;
public class RunNian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年份(注: 必须大于 1990 年):");
		int year=input.nextInt();
		System.out.println("请输入月份:");
		int month=input.nextInt();
		
		input.close();//Problem: Resource leak: 'input' is never closed问题解决方案
		
		boolean isRen;
		if((year%4==0&&year%100!=0)||(year%400==0))
		{
		    System.out.println(year+"闰年");
		    isRen=true;
		}
		else
		{
		    System.out.println(year+"平年");
		    isRen=false;
		}
		
		int day=0;
		switch(month)
		{
		    case 1:
		    case 3:
		    case 5:
		    case 7:
		    case 8:
		    case 10:
		    case 12:
		        day=31;
		        break;
		    case 4:
		    case 6:
		    case 9:
		    case 11:
		        day=30;
		        break;
		    default:
		        if(isRen)
		        {
		            day=29;
		        }
		        else
		        {
		            day=28;
		        }
		        break;
		}
		System.out.println(year+"年"+month+"月共有"+day+"天");
		
	}

}
