//实现多线程编程的方式主要有两种：一种是继承 Thread 类，另一种是实现 Runnable 接口。
//编写一段代码证明在使用多线程技术时，代码的运行结果与代码执行顺序或调用顺序是无关的（异步调用）。
package java_201910;

//创建的自定义线程类为 MyThread，此类继承自 Thread，并在重写的 run() 中输出一行字符串。
public class MyThread extends Thread{
	
	public void run() {
		super.run();
		System.out.println("这是线程类 MyThread");
	}

//编写启动 MyThread 线程的主方法
	public static void main(String[] args) {
		MyThread mythread=new MyThread();
		mythread.start();
		System.out.println("运行结束！");
	}

}
