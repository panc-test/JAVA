//使用while语句计算 10 的阶乘
package java_201907;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int n=1;
		while(i<=10) {
			n=n*i;
			i++;
		}
		System.out.println("10的阶乘="+n);
	}

}
