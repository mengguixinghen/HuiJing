//第四章 程序控制结构作业
import java.util.Scanner;
public class Homework{
	public static void main(String[] args){
		//1.编程实现如下功能
		//某人有100000元，每经过一次路口，需要交费，规则如下:
		//(1).当现金>50000时，每次交5%
		//(2).当现金<=50000时，每次交1000
		//编程计算该人可以经过多少次路口，要求:使用while break方式完成
		/*
		int money = 100000;
		int count = 0;
		while(true){
			if(money > 50000){
				money *= 0.95;
				count++;
			}else if(money >= 1000){
				money -= 1000;
				count ++;
			}else{
				break;
			}
		}
		System.out.println("100000元可以经过" + count +"次路口");
		*/

		//2.实现判断一个整数，属于哪个范围:大于0；小于0；等于0
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int Num = scanner.nextInt();
		if(Num > 0){
			System.out.println("大于0");
		}else if(Num == 0){
			System.out.println("等于0");
		}else{
			System.out.println("小于0");
		}
		*/

		//3.判断一个年份是否为闰年
		//(1)年份能被4整除，但不能被100整除 （2）能被400整除
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个年份");
		int year = scanner.nextInt();
		if((year % 4 ==0 && year % 100 !=0) | year % 400 ==0){
			System.out.println(year + "是闰年");
		}else{
			System.out.println(year + "不是闰年");
		}
		*/

		//4.判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身.
		//例如:153=1*1*1+3*3*3+5*5*5
		//Num百位=Num/100;
		//Num十位=Num%100/10;
		//Num个位=Num%10;
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个3位数:");
		int Num = scanner.nextInt();
		int Num1 = Num/100;
		int Num2 = Num%100/10;
		int Num3 = Num%10;
		if(Num1*Num1*Num1 + Num2*Num2*Num2 + Num3*Num3*Num3 == Num){
			System.out.println(Num + "是水仙花数");
		}else{
			System.out.println(Num + "不是水仙花数");
		}
		*/
		//5.看看下面代码输出什么
		/*
		int m = 0,n = 3;
		if(m > 0){
			if(n > 2)
				System.out.println("OK1");
			
			else
				System.out.println("OK2");

		}//什么也不输出	
		*/	
		//6.输出1-100之间的不能被5整除的数，每5个一行
		/*
		int count = 0;
		System.out.println("输出1-100之间的不能被5整除的数:");
		for(int i = 1;i <= 100;i++){	
			if(i % 5 !=0){
				System.out.print(i + "\t");
				count++;
		    if(count % 5 == 0){
			    System.out.println();
		    }
		}
	}
	*/	
		//7.输出小写的a-z以及大写的Z-A
		/*
		char n1 = 'a';
		char n2 = 'Z';
		for(int i = 1;i <= 26;i++){	
			System.out.println((char)n1);
			n1 += 1;
		}
		for(int i = 1;i <= 26;i++){	
			System.out.println((char)n2);
			n2 -= 1;
		}
		*/
		//老师讲解
		/*
		for(char c1 = 'a';c1 <= 'z'; c1++){
			System.out.print(c1 + " ");
		}
		System.out.print("\n");
		for(char c1 = 'Z';c1 >= 'A'; c1--){
			System.out.print(c1 + " ");
		}
		*/		
		//8.求出1-1/2+1/3-1/4......1/100的和
		/*
		double sum = 0;
		for(int i = 1;i <= 100;i++){
			if(i % 2 != 0){
				sum += 1.0/i;//必须写1.0，不然1/i就是整数.
			}else{
				sum -= 1.0/i;
			}
		}
		System.out.println("1-1/2+1/3-1/4......1/100的和为" + sum);
		*/
		//9.求1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+100)的结果
		/*
		int sum = 0;
		for(int i = 1; i <= 100;i++){
			for(int j = 1;j <= i;j++){
				sum += j;
			}
		}
		System.out.println("1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+100)的结果为" + sum);
		*/
	}
}