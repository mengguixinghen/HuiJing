//第六章 面向对象编程作业
//1.编写类A01，定义方法max，实现求某个double数组的最大值，并返回.
/*
public class Homework{
	public static void main(String[] args){
		A01 a = new A01();
		//double[] arr = null;
		double[] arr = {3.2,1.5,5.6,1.8};
		Double res = a.max(arr);
		if(res != null){
		System.out.println("arr的最大值=" + res);
	   }else{
	   	System.out.println("arr的输入有误");
	   }
	}
}
class A01{
	public Double max(double[] arr){
		if(arr != null && arr.length > 0){
		double max = arr[0];
		for(int i = 1;i < arr.length;i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}else{
		return null;
	}
   }
}
*/
//2.编写类A02,定义方法find，实现查找某字符串是否在数组中，并返回索引.
//  如果找不到，返回-1.
/*
public class Homework{
	public static void main(String[] args){
		A02 a = new A02();
		String[] arr = {"jack","millin","yuwei"};
		System.out.println(a.find("yuwei",arr));
	}
}
class A02{
	public int find(String c,String[] arr){
		for(int i = 0;i < arr.length;i++){
			if(c.equals(arr[i])){
				return i;//返回下标		
			}
		}
		return -1;					
	}
}
*/
//3.编写类Book，定义方法updatePrice，实现更改某本书的价格，
//  具体:如果价格>150，则更改为150，如果价格>100，更改为100，否则不变.
/*
public class Homework{
	public static void main(String[] args){
		Book book = new Book("笑傲江湖",300);
		book.updatePrice();
		book.info();
		//System.out.println("book的价格为" + book.Price);
	}
}
class Book{
	String name;
	double price;
	public Book(String name,double price){
		this.name = name;
		this.price = price;
	}
	public void updatePrice(){
		//如果方法中没有price局部变量，this.price等价price.
		if(this.price > 150){
			this.price = 150;
		}else if(this.price > 100){
			this.price = 100;
		}
	}
	//显示书籍情况
	public void info(){
		System.out.println("书名=" + this.name + " 价格=" + this.price);
	}
}
*/
//4.编写类A03，实现数组的复制功能copyArr，输入旧数组，
//  返回一个新数组，元素和旧数组一样.
/*
public class Homework{
	public static void main(String[] args){
		A03 a = new A03();
		int[] arr = {1,3,4,3,4};
		int[] newarr = a.copyArr(arr);
		for(int i =0;i < newarr.length;i++){
		System.out.print(newarr[i] + " ");
	}
	}
}
class A03{
	public int[] copyArr(int[] oldarr){
		int[] newarr = new int[oldarr.length];
		for(int i = 0;i < oldarr.length;i++){
			newarr[i] = oldarr[i];
		}
		return newarr;
	}
}
*/
//5.定义一个圆类Circle，定义属性:半径，提供显示圆周长功能的方法，提供显示圆面积的方法.
/*
public class Homework{
	public static void main(String[] args){
		Circle cl = new Circle(3);
		System.out.println("半径为" + cl.radius + "的圆的周长为" + cl.C());
		System.out.println("半径为" + cl.radius + "的圆的面积为" + cl.S());
	}
}
class Circle{
	double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	public double C(){
		return Math.PI*2*radius;
	}
	public double S(){	
		return Math.PI*radius*radius;
	}
}
*/
//6.编程创建一个Cale计算类，在其中定义2个变量表示2个操作数，
//  定义四个方法实现求和、差、乘、商(要求除数为0的话，要提示)并创建两个对象，分别测试.
/*
public class Homework{
	public static void main(String[] args){	
	Cale n1 = new Cale(4,5);
	System.out.println("两个数的和为" + n1.sum());
	System.out.println("两个数的差为" + n1.minus());
	System.out.println("两个数的乘为" + n1.mul());
	if(n1.div() != null){
	System.out.println("两个数的除为" + n1.div());
    }
    System.out.println("=============");
	Cale n2 = new Cale(3,0);	
	System.out.println("两个数的和为" + n2.sum());
	System.out.println("两个数的差为" + n2.minus());
	System.out.println("两个数的乘为" + n2.mul());
	if(n2.div() != null){
	System.out.println("两个数的除为" + n2.div());
    }
	}
}
class Cale{
	double num1;
	double num2;
	public Cale(double num1,double num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	public double sum(){
		return num1 + num2;
	}
	public double minus(){
		return num1 - num2;
	}
	public double mul(){
		return num1 * num2;
	}
	public Double div(){//Double包装类 可以返回空null
		if(num2 != 0){
		return num1 / num2;
		}else{
			System.out.println("除数为0,不能计算");
			return null;
		}
		}
	}
*/
//7.设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show()显示其信息.
//  并创建对象，进行测试.(提示this.属性)
/*
public class Homework{
	public static void main(String[] args){	
		Dog dog1 = new Dog("小花","黄色",4);
		dog1.show();
		Dog dog2 = new Dog("小维","黑白色",2);
		dog2.show();
	}
}
class Dog{
	String name;
	String color;
	int age;
	public Dog(String name,String color,int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public void show(){
		System.out.println("名字=" + this.name + 
			" 颜色=" + this.color + " 年龄=" + this.age);
	}
}
*/
//8.给定一个Java程序的代码如下所示，则编译运行后，输出结果是()
/*
public class Test{
	int count = 9;//属性
	public void count1(){//Test类的成员方法
		count = 10;//这个count就是属性
		System.out.println("count1=" + count);
	}
	public void count2(){//Test类的成员方法
		System.out.println("count1=" + count++);
	}
	//这是Test类的main方法,任何一个类，都可有main
	public static void main(String[] args){
		//1.new Test()是匿名对象，匿名对象使用后，就不能使用.
		//2.new Test().count1()创建好匿名对象后，就调用count1().
		new Test().count1();
		Test t1 = new Test();
		t1.count2();
		t1.count2();
	}
}//count1=10 count1=9 count1 =10
*/
//9.定义Music类，里面有音乐名name、音乐时长times属性，
//  并有播放play功能和返回本身属性信息的功能方法getInfo.
/*
public class Homework{
	public static void main(String[] args){	
		Music m = new Music("爵士乐",5.3);
		m.play();
		System.out.println(m.getInfo());
	}
}
class Music{
	String name;
	double times;
	public Music(String name,double times){
		this.name = name;
		this.times = times;
	}
	public void play(){
		System.out.println("音乐" + name + " 正在播放中..." + 
			  "时长为" + times + "秒");
	}
	public String getInfo(){
		return "name=" + name + " times=" + times;
	}	
}
*/
//10.试写出以下代码的运行结果()
/*
class Demo{
	int i = 100;
	public void m(){
		int j = i++;
		System.out.println("i=" + i);
		System.out.println("j=" + j);
	}
}
class Homework{
	public static void main(String[] args){
		Demo d1 = new Demo();
		Demo d2 = d1;
		d2.m();
		System.out.println(d1.i);
		System.out.println(d2.i);
	}
}//i=101 j=100 101 101 
*/
//11.在测试方法中，调用method方法，代码如下，编译正确，试写出method方法的定义形式,
//   调用语句为:System.out.println(method(method(10.0,20.0),100));
/*
 public class Homework{
	public static void main(String[] args){			
		A a = new A();
		a.m();
	}
}
class A{
	public double method(double n1,double n2){
			return  n1;
	}
	public double method(double n1,int n2){
			return n2;
	}
	public  void m(){
	System.out.println(method(method(10.0,20.0),100));
}
}
*/
//12.创建一个Employee类，属性有(名字，性别，年龄，职位，薪水)，提供3个构造方法，
//   可以初始化(1)(名字，性别，年龄，职位，薪水)，(2)(名字，性别，年龄)
//   (3).(职位，薪水)，要求充分复用构造器
/*
 public class Homework{
	public static void main(String[] args){	
	}
}
class Employee{
	String name;
	char gender;
	int age;
	String job;
	double sal;
	//职位，薪水
	public Employee(String job,double sal){
		this.job = job;
		this.sal = sal;
	}
	//名字，性别，年龄
	public Employee(String name,char gender,int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	//名字，性别，年龄，职位，薪水
	public Employee(String name,char gender,int age,String job,double sal){
		this(name,gender,age);//使用前面的构造器
		this.job = job;
		this.sal = sal;
	}
}
*/
//13.将对象作为参数传递给方法。
/*
题目要求:
(1)定义-个Circle类， 包含-个double型的radius属性代表圆的半径， findArea()方法返回圆的面积。
(2)定义-个类PassObject,在类中定义一个方法printAreas(), 该方法的定义如下:
 public void printAreas(Circle C, int times) //方法签名
(3)在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积。 
例如，times为5, 则输出半径1, 2, 3, 4, 5,以及对应的圆面积。
(4)在main方法中调用printAreas(方法，调用完毕后输出当前半径值。程序运行结果如图所示
   Redius       Area
   1.0          3.141592653589793
   2.0          12.566370614359172
   3.0          28.274333882308138
   4.0          50.26548245243669
   5.0          78.53981633974483
*/
 /*
 public class Homework{
	public static void main(String[] args){
	PassObject a = new PassObject();
	Circle p = new Circle();
	a.printAreas(p,5);	
	}
}
class Circle{
	double radius;
	public double findArea(){
		return Math.PI*radius*radius;
	}
	//添加方法setRadius，修改对象的半径值
	public void setRadius(double radius){
		this.radius = radius;
	}
}
class PassObject{
	public void printAreas(Circle c, int times){
		System.out.println("Redius\tArea");
		for(double i = 1;i <= times;i++){
		c.setRadius(i);//修改c对象的半径值		
		System.out.println(i + "\t" + c.findArea());
	}
	}
}
*/
//14.扩展题.有个人Tom设计他的成员变量.成员方法，可以电脑猜拳.
//   电脑每次都会随机生成0, 1, 2, 
//   0表示石头 1表示剪刀 2表示布 并要可以显示Tom的输赢次数(清单)
/*
import java.util.Random;
import java.util.Scanner;
 public class Homework{
	public static void main(String[] args){	
		//创建一个玩家对象
		Tom t = new Tom();
		//用来记录最后输赢的次数
		int isWinCount = 0;
		//创建一个二维数组，用来接收局数，Tom出拳情况以及电脑出拳情况
		int[][] arr1 = new int[3][3];
		int j = 0;
		//创建一个一维数组，用来接收输赢情况
		String[] arr2 = new String[3];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i < 3;i++){//比赛3次
		//获取玩家的出拳
		System.out.println("请输入你要出的拳（0-拳头，1-剪刀，2-布):");
		int num = scanner.nextInt();
		t.TomNum(num);
		int tomGuess = t.getTomGuessNum();
		arr1[i][j+1] = tomGuess;
		//获取电脑出拳
		int comGuess = t.computerNum();
		arr1[i][j+2] = comGuess;
		//将玩家猜的拳与电脑做比较
		String iswin = t.vs();
		arr2[i] = iswin;
		arr1[i][j] = t.count;
		//对每一局的情况进行输出
		System.out.println("================================");
		System.out.println("局数\t玩家的出拳\t电脑的出拳\t输赢情况");	
		System.out.println(t.count + "\t" + tomGuess + "\t\t" + comGuess + "\t\t" + iswin);
		System.out.println("================================");
		System.out.println("\n\n");
		isWinCount = t.winCount(iswin);
		}
		//对游戏的最终结果进行输出
		System.out.println("局数\t玩家的出拳\t电脑的出拳\t输赢情况");
		for(int a = 0;a < arr1.length;a++){
			for(int b = 0;b < arr1[a].length;b++){
				System.out.print(arr1[a][b] + "\t\t\t");
			}
			System.out.print(arr2[a]);
			System.out.println();
		}
		System.out.println("你赢了" + isWinCount + "次");
	}
}
class Tom{
	//玩家出拳
	int tomGuessNum;//0，1，2
	//电脑出拳
	int comGuessNum;//0，1，2
	//玩家赢得次数
	int winCountNum;
	//比赛次数
	int count = 1;
	public void showInfo(){

	}
	//电脑随机生成猜拳的数字
	public int computerNum(){
		Random r = new Random();
		comGuessNum = r.nextInt(3);//方法 返回0-2的随机数
		return comGuessNum;
	}
	//设置玩家猜拳的数字
	public void TomNum(int tomGuessNum){
		if(tomGuessNum > 2 || tomGuessNum < 0){
			//异常处理
			throw new IllegalArgumentException("数字输入有误");
		}
		this.tomGuessNum = tomGuessNum;
	}
	public int getTomGuessNum(){
		return tomGuessNum;
	}
	//比较猜拳的结果
	public String vs(){
		if(tomGuessNum == 0 && comGuessNum == 1){
			return "你赢了";
		}else if(tomGuessNum == 1 && comGuessNum == 2){
			return "你赢了";
		}else if(tomGuessNum == 2 && comGuessNum == 0){
			return "你赢了";
		}else if(tomGuessNum == comGuessNum){
			return "平手";
		}else{
			return "你输了";
		}
	}
	//记录玩家赢得次数
	public int winCount(String s){
		count++;
		if(s.equals("你赢了")){
			winCountNum++;
		}
		return winCountNum;
	}
}
*/




