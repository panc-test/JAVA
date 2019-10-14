//主线程中编写代码，创建一个 MyRunnable 类实例，并将该实例作为参数传递给 Thread 类的构造方法，最后调用 Thread 类的 start() 方法启动线程
package java_201910;

public class RunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable myrunnable=new MyRunnable();
		Thread thread=new Thread(myrunnable);
		thread.start();
		System.out.println("主线程运行结束!");
		
	}

}
