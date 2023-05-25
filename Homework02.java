//1.程序阅读题，看看输出什么
/*
public class Homework02{
	//编写一个main方法
	public static void main(String[] args){
		int n1;//定义一个整型变量n1
		n1 = 13;//给n1赋值13
		int n2;//定义一个整型变量n2
		n2 = 17;//给n2赋值17
		int n3;//定义一个整型变量n3
		n3 = n1 + n2;//将n1 + n2的值赋给n3，即n3=30
		System.out.println("n3 = " + n3);//输出n3=30
		int n4 = 38;//定义一个整型变量n4，并给n4赋值38
		int n5 = n4 - n3;//将n4-n3的值赋给n5，即n5=8
		System.out.println("n5 = " + n5);//输出n5=8

	}
}
*/
//2.使用char类型，分别保存\n \t \r \\ 1 2 3等字符，并打印输出.
/*
public class Homework02{
	//编写一个main方法
	public static void main(String[] args){
		char n1 = '\n';//换行
		char n2 = '\t';//制表位
		char n3 = '\r';//回车
		char n4 = '\\';//输出\
		char n5 = '1';//
		char n6 = '2';
		char n7 = '3';
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(n7);
	}
}
*/
//3.编程，保存两本书名，用+拼接，看效果。保存两个性别，用加号拼接，看效果。
//  保存两本书价格，用加号拼接，看效果。
/*
public class Homework02{
	//编写一个main方法
	public static void main(String[] args){
		//书名应该使用String保存
		String book1 = "天龙八部";
		String book2 = "笑傲江湖";
		System.out.println(book1 + book2);//天龙八部笑傲江湖
		//性别应该使用char保存
		char c1 = '男';
		char c2 = '女';
		System.out.println(c1 + c2);//得到男字符码值+女字符码值
		//保存两本书的价格
		double price1 = 123.56;
		double price2 = 100.11;
		System.out.println(price1 + price2);//223.670

	}
}
*/
//4.编程实现如下效果
//姓名 年龄 成绩 性别 爱好
//XX   XX  XX  XX   XX
//要求：
//(1)用变量将姓名、年龄、成绩、性别、爱好存储
//(2)使用+
//(3)添加适当的注释
//(4)添加转义字符，使用一条语句输出
/*
public class Homework02{
	public static void main(String[] args){
		String name = "xiaowei";
		int age = 18;
		double score = 89.5;
		char gender = '女';
		String hobby = "喜欢运动";
		// char c1 = '\t';
		// char c2 = '\n';
		//System.out.println("姓名" + c1 + "年龄" + c1 + "成绩" + c1 + "性别" + c1 +"爱好" + c2 + name + c1 + age +c1 + grade + c1 + gender + c1 + hobby);
		//输出信息可以使用换行
		System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n" + 
			name + "\t" + age + "\t" + score + "\t" + gender + "\t" + hobby);
 
	}
}
*/




