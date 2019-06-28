//部分case语句都有break语句
package java_201807;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade="C";
		switch(grade) {
			case "A":
				System.out.println("优秀");
				break;
			case "B":
				System.out.println("良好");
				break;
			case "C":
				System.out.println("及格");
				
			case "D":
				System.out.println("不及格");
				
			default:
				System.out.println("未知");
		}
	}

}
