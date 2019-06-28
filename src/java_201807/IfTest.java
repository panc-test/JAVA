//if嵌套语句
package java_201807;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=11;
		int y=21;
		
		if(x==10) {
			if(y==20) {
				System.out.println("两个条件都满足输出="+30);
			}else {
				System.out.println("满足第一个条件，不满足第二个条件输出="+(10+y));
			}
		}else {
			System.out.println("不满足第一个条件输出="+(x+y));
		}
	}

}
