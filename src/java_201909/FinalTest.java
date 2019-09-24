//final 关键字表示对象是最终形态的，对象是不可改变的意思。final 应用于类、方法和变量时意义是不同的，但本质是一样的：final 表示不可改变。

package java_201909;

public class FinalTest {
	
	 final int count=1;   //count值不允许修改
		 
	 //修改final属性值，提示错误
//	 public int updateCount(){
//	     count=4;   
//	     return count;
//	 }
	 
	 public final int sum() {
		 int number=count+4;
		 return number;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalTest fu=new FinalTest();
		System.out.println("number值="+fu.sum());
	}

}
