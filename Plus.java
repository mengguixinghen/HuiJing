//程序中+号的使用
//1.当左右两边都是数值型时，则做加法运算。
//2.当左右两边有一方为字符串，则做拼接运算.
//3.运算顺序，是从左到右
public class Plus{
	  //编写一个main方法
	public static void main(String[] args){
System.out.println(100 + 98);//198
System.out.println("100" + 98);//输出10098 "100"表示100字符串，做拼接运算 
System.out.println(100 + 3 + "hello");//103hello
System.out.println("hello" + 100 + 3);//hello1003
}
}