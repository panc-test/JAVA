//输出本机IP 地址字符串和主机名
package java_201910;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_test {

	public static void main(String[] args)  {

		try {
			InetAddress ia = InetAddress.getLocalHost();
			System.out.println("主机名："+ia.getHostName());
			System.out.println("主机ip地址："+ia.getHostAddress());	
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}
		
	}

}
