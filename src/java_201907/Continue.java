/*continue 语句是跳过循环体中剩余的语句而强制执行下一次循环，其作用为结束本次循环，即跳过循环体中下面尚未执行的语句，接着进行下一次是否执行循环的判定。
continue 语句类似于 break 语句，但它只能出现在循环体中。它与 break 语句的区别在于：continue 并不是中断循环语句，而是中止当前迭代的循环，进入下一次的迭代。
简单来讲，continue 是忽略循环语句的当次循环。
注意：continue 语句只能用在 while 语句、for 语句或者 foreach 语句的循环体之中，在这之外的任何地方使用它都会引起语法错误。*/

//循环录入 Java 课程的学生成绩，统计分数大于 80 分（包括等于）的学生人数。
//这时，需要定义变量 count 记录大于 80 分（包括等于）的学生人数，每循环一次，需要判断录入的学生分数是否大于等于 80，如果是，则执行 count+1，否则执行 continue，跳过本次循环，继续下次循环。
package java_201907;

import java.util.Scanner;
public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=0;
		int count=0;//记录成绩大于等于80分的人数
		Scanner input=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("请输入第"+(i+1)+"位学生的java成绩:");
			score=input.nextInt();
			if(score<80) {
				continue;
			}
			count++;
		}
		System.out.println("java成绩大于等于80的学生人数："+count);
	}

}





