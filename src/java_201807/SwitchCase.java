//switch....case....break....default结构
package java_201807;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade="A";
		switch(grade) {
			case "A":
				System.out.println("优秀");
				break;
			case "B":
				System.out.println("良好");
				break;
			case "C":
				System.out.println("及格");
				break;
			case "D":
				System.out.println("不及格");
				break;
			default:
				System.out.println("未知");
		}
	}

}
