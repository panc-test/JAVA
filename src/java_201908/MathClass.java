//在 Java 中 Math 类封装了常用的数学运算，提供了基本的数学操作，如指数、对数、平方根和三角函数等。Math 类位于 java.lang 包，

package java_201908;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//常量
		System.out.println("常量E="+Math.E);
		System.out.println("常量PI="+Math.PI);
		System.out.println();
		//绝对值，最大最小值
		System.out.println("绝对值="+Math.abs(-12));
		System.out.println("最大值="+Math.max(15.5, 20));
		System.out.println("最小值="+Math.min(18, 15));
		System.out.println();
		//求整数运算
		System.out.println(Math.ceil(5.1));		//返回大于或等于 5.1 的最小整数
		System.out.println(Math.floor(5.8));	//返回小于或等于 5.8  的最大整数
		System.out.println(Math.rint(5.4));		//返回最接近 5.4  的整数值，如果有两个同样接近的整数，则结果取偶数
		System.out.println(Math.round(8.8));	//将参数加上 1/2 后返回与参数最近的整数
		System.out.println();
		//三角函数
		System.out.println("sin30="+Math.sin(30));	//	返回角的三角正弦值，参数以孤度为单位
		System.out.println("cos60="+Math.cos(60));	//返回角的三角余弦值，参数以孤度为单位
		System.out.println("tan45="+Math.tan(45));	//返回角的三角正切值，参数以弧度为单位
		System.out.println();
		//指数运算
		System.out.println(Math.exp(5));	//返回 e 的 a 次幂
		System.out.println(Math.pow(2, 3));	//返回以 a 为底数，以 b 为指数的幂值
		System.out.println(Math.sqrt(9));	//返回 a 的平方根
		System.out.println(Math.cbrt(8));	//返回 a 的立方根
		System.out.println(Math.log(2));	//返回 a 的自然对数，即 lna 的值
		System.out.println(Math.log10(10));	//返回以 10 为底 a 的对数
	}

}
