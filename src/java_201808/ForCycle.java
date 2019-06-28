
//for循环
package java_201808;

public class ForCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = {9,2,6,4,5};
		System.out.println("age.lenth="+(age.length));
		
		int max=0;
		for(int i=0;i<age.length;i++) {
			if(max<age[i]) {
				max=age[i];
			}
		}
		System.out.println("max="+max);
	}

}
