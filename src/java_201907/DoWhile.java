//使用 do…while计算 10 的阶乘
package java_201907;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,n=1;
		do{
			n=n*i;
			i++;
		}while(i<=10);
		System.out.println("10的阶乘="+n);
	}

}
