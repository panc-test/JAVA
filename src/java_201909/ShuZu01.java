/*声明数组并分配空间格式：数据类型[]数组名=new 数据类型[数组长度];
初始化数组：type[] array=new type[]{值 1,值 2,值 3,值 4,• • •,值 n};*/

//编写一个 Java 程序，使用数组存放录入的 5 件商品价格，然后使用下标访问第 3商品的价格。
package java_201909;
import java.util.Scanner;
public class ShuZu01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] prices=new double[5];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("请输出第"+(i+1)+"件商品的价格：");
			prices[i]=input.nextDouble();
		}
		System.out.println("第三件商品的价格是："+prices[2]);
		input.close();
	}

}
