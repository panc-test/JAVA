
//数据类型转换
package java_201905;

public class DataTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char char1='!';
		int int1=char1;
		System.out.println("字符！转换成整型="+int1);			//查ASCII码表，！对应的十进制数是33
		
		//		强制转换
		int int2=500;
		byte byte2=(byte)int2;
		System.out.println("int类型的500强制转换成字节="+byte2);
		
	}

}
