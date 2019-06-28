package java_201905;

public class MethodTest {
	
	//定义一个max方法
	public static int max(int a,int b) {
		int result;
		if(a>b) {
			result=a;
		}else
			result=b;
		return result;	
	}
	//在main主方法中调用定义的max方法
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		int y=2;
		int t =max(x,y);
		System.out.println(t);
	}

}
