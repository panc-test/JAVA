/*如果要创建的线程类已经有一个父类，这时就不能再继承 Thread 类，因为 Java 不支持多继承，所以需要实现 Runnable 接口来应对这样的情况。
实现 Runnable 接口的语法格式如下：public class thread extends Object implements Runnable*/

package java_201910;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("MyRunnable运行中!");
	}
	
}