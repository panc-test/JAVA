//同样是计算 5 的阶乘，使用 for 循环的实现代码

package java_201907;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=1;
		for(int number=1;number<=5;number++) {
//			result=result*number;
			result*=number;
		}
		System.out.println("5的阶乘="+result);
	}

}
