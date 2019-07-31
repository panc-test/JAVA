//输出九九乘法口诀表
package java_201907;

public class ChengFaBiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");       //\t是8个空格键
			}
			System.out.println();
		}
	}

}
