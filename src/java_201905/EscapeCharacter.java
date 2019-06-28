//转义字符
package java_201905;

public class EscapeCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("333\r455"); 		//  \r  在文中该处插入回车
		System.out.println("1239\n4545");   	//  \n  在文中该处换行
		System.out.println("1111\'3434\'tttt"); //  \'  在文中该处插入单引号
		System.out.println("dha\"12345\""); 	//  \"  在文中该处插入双引号
		System.out.println("aafa\tfaf");  		//  \t  在文中该处插入一个tab键
		System.out.println("das\\788");         //  \\  在文中该处插入反斜杠
		System.out.println("afds\b12456"); 		//  \b  在文中该处插入一个后退键
		System.out.println("dhajhe\f36367"); 	//  \f  在文中该处插入换页符
	}

}
