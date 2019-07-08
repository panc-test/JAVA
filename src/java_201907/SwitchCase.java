//在节目的抽奖环节里，节目组会根据每位嘉宾的座位号来进行抽奖游戏，根据不同的号码来决定奖项的大小

package java_201907;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入座位号：");
		Scanner input=new Scanner(System.in);
		int sum=input.nextInt();
		    switch(sum) {
		    	case 8:
		        	System.out.println("三等奖");
		        	break;
		    	case 88:
		    		System.out.println("二等奖");
		    		break;
		    	case 888:
		    		System.out.println("一等奖");
		    		break;
		    	default:
		    		System.out.println("谢谢参与");
		}
		

	}

}
