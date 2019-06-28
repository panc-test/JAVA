//位运算符
package java_201809;

public class Wei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int a = 60; 		//60 = 0011 1100 
	     int b = 13; 		//13 = 0000 1101 
	     System.out.println("a&b="+(a&b));		// &:如果相对应位都是1，则结果为1，否则为0  	a%b=0000 1100=12
	     System.out.println("a|b="+(a|b));		// |: 如果相对应位都是0，则结果为0，否则为1 	a|b=0011 1101=61
	     System.out.println("a^b="+(a^b));		// ^:如果相对应位值相同，则结果为0，否则为1 	a^b=0011 0001=49
	     System.out.println("~a="+(~a));		// ~:按位取反运算符翻转操作数的每一位，即0变成1，1变成0 	~a=1100 0011=       ****补码
	     System.out.println("a<<2="+(a<<2));    // <<:按位左移运算符。左操作数按位左移右操作数指定的位数            a<<2=1111 0000=240
	     System.out.println("a>>2="+(a>>2)); 	// >>:按位右移运算符。左操作数按位右移右操作数指定的位数。        a>>2=1111=15
	     System.out.println("a>>>2="+(a>>>2)); 	// >>>:按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。   a>>>2=0000 1111=15
	}

}
