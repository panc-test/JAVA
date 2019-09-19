/*Random 类位于 java.util 包中，该类常用的有如下两个构造方法。random 类提供的所有方法生成的随机数字都是均匀分布的，也就是说区间内部的数字生成的概率是均等的
Random()：该构造方法使用一个和当前系统时间对应的数字作为种子数，然后使用这个种子数构造 Random 对象。
Random(long seed)：使用单个 long 类型的参数创建一个新的随机数生成器。*/
package java_201909;

import java.util.Random;;

public class Random01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random r=new Random();
        double e1=r.nextDouble();    //生成[0,1.0]区间的小数
        int t1=r.nextInt(10);    //生成[0,10]区间的整数
        long g1=r.nextLong();    //生成一个随机长整型值
        boolean n1=r.nextBoolean();    //生成一个随机布尔型值
        float f1=r.nextFloat();    //生成一个随机浮点型值
        
        System.out.println(e1);
        System.out.println(t1);
        System.out.println(g1);
        System.out.println(n1);
        System.out.println(f1);
	
	}

}
