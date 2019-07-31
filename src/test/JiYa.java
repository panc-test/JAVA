//鸡和鸭共35只，腿94只，计算鸡鸭各多少只  
package test;

public class JiYa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y; // 鸡x只，鸭y只
		for (x = 1; x < 35; x++) {
			y = 35 - x;
			if (2 * x + 4 * y == 94) {
				System.out.println("鸡数：" + x + '\n' + "鸭数：" + y);
			}
		}
	}

}
