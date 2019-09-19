//使用 DecimalFormat 类将数字转换成各种格式

/*符号	说明
0	显示数字，如果位数不够则补 0
#	显示数字，如果位数不够不发生变化
.	小数分隔符
-	减号
,	组分隔符
E	分隔科学记数法中的尾数和小数
%	前缀或后缀，乘以 100 后作为百分比显示
?	乘以 1000 后作为千进制货币符显示。用货币符号代替。如果双写，用国际货币符号代替；
如果出现在一个模式中，用货币十进制分隔符代替十进制分隔符*/

package java_201909;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DecimalFormat01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("请输入一个float类型的数字：");
        float f=scan.nextFloat();
        DecimalFormat df1=new DecimalFormat("0.0");  //	显示数字，如果位数不够则补 0
        DecimalFormat df2=new DecimalFormat("#.#");  //显示数字，如果位数不够不发生变化
        DecimalFormat df3=new DecimalFormat("000.000");
        DecimalFormat df4=new DecimalFormat("###.###");

        System.out.println("0.0 格式："+df1.format(f));
        System.out.println("#.# 格式："+df2.format(f));
        System.out.println("000.000 格式："+df3.format(f));
        System.out.println("###.### 格式："+df4.format(f));
        scan.close();
	}

}
