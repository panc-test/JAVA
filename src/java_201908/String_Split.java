//String 类的 split() 方法可以按指定的分割符对目标字符串进行分割，分割后的内容存放在字符串数组中

package java_201908;

public class String_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Colors="Red,Black,White,Yellow,Blue";
		String[] colors1=Colors.split(",");
		String[] colors2=Colors.split(",", 3);

		//打印输出数组
		System.out.println("所有的颜色：");
		for(int i=0;i<colors1.length;i++) {
			System.out.println(colors1[i]);
		}
		
		System.out.println("前三种颜色：");
		for(int j=0;j<colors2.length;j++) {
			System.out.println(colors2[j]);
		}
		
		
			
	}

}
