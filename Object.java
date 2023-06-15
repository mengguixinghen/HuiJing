//1.类与对象
/*
public class Object{
	public static void main(String[] args){
		张老太养了两只猫猫:一只名字叫小白,今年 3 岁,白色。
		还有一只叫小花,今年 100 岁,花色。
		请编写一个程序，当用户 输入小猫的名字时，就显示该猫的名字，年龄，颜色。
		如果用户输入的小猫名错误，则显示 张老太没有这只猫猫。
		*/
		/*
		//单独变量解决 => 不利于数据的管理，效率低
		//第1只猫信息
		String cat1Name = "小白";
		int cat1Age = 3;
		String cat1Color = "白色";

		//第2只猫的信息
		String cat2Name = "小花";
		int cat2Age = 100;
		String cat2Color = "花色";

		//数组 => (1).数据类型体现不出来 
		//       (2).只能通过下标获取信息，造成变量名字和内容的对应关系不明确.
	    //       (3). 不能体现猫的行为
		String[] cat1 = {"小白","3","白色"};
		String[] cat2 = {"小花","100","花色"};
		*/

		/*
		//使用OOP面向对象解决
		//实例化一只猫[创建一只猫对象]
		//1 new Cat() 创建一只猫 
		//2.Cat cat1 = new Cat();把创建的猫赋给cat1.
		//3.cat1就是一个对象
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";
		cat1.weight = 10;
        //创建了第二只猫，并赋给cat2
        //cat2也是一个对象(猫对象)
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";
		cat2.weight = 20;

		//访问对象的属性
		System.out.println("第一只猫信息:" + cat1.name + "\t" 
			+ cat1.age + "\t" + cat1.color +"\t" + cat1.weight);
		System.out.println("第二只猫信息:" + cat2.name + "\t" 
			+ cat2.age + "\t" + cat2.color + "\t" + cat2.weight);
		
	}
}
        
		//使用面向对象的方式来解决养猫问题
		//定义一个猫类 -> 自定义的数据类型
		class Cat{
			//属性，成员变量，字段field
			//属性可以是基本类型，也可以是引用类型(对象，数组)
			String name;//名字
			int age;//年龄
			String color;//颜色
			double weight;//
			String[] master;//数组也可以
		}
		*/

		
		/*
public class Object{
    public static void main(String[] args){
		//创建 Person 对象
		 //p1 是对象名(对象引用) 
		 //new Person() 创建的对象空间(数据) 才是真正的对象
		  Person p1 = new Person(); 
		  //对象的属性默认值，遵守数组规则: 
		  //int 0，short 0, byte 0, long 0, float 0.0
		  //double 0.0，char \u0000，boolean false，String null 
		  System.out.println("当前这个人的信息:"); 
		  System.out.println("age=" + p1.age + " name=" + 
		  	p1.name + " sal=" + p1.sal + " isPass=" + p1.isPass) ; 
	}
}
        class Person { 
              //四个属性 
        	  int age; 
        	  String name; 
        	  double sal; 
        	  boolean isPass; 
        	}
        */

        /*
public class Object{
	public static void main(String[] args){
    	Person p1 = new Person();
    	p1.age = 10;
    	p1.name = "小明";
    	Person p2 = p1;//把p1赋给了p2，让p2指向p1.(给的是地址)
    	System.out.println(p2.age);//10
    }
}
class Person{
	int age;
	String name;
}
*/
        /*
public class Object{
	public static void main(String[] args){
         //类与对象对象练习题
         //看下面代码会输出什么信息
         Person a = new Person();
         a.age = 10;
         a.name = "小明";
         Person b;
         b = a;
         System.out.println(b.name);//小明
         b.age = 200;
         b = null;//b的指向地址没有了，但是不影响a指向那个地址
         System.out.println(a.age);//200
         System.out.println(b.age);//异常
     }
 }
 class Person{
 	int age;
 	String name;
 }
 */


//2.成员方法
 /*
 public class Object{
	public static void main(String[] args){
		//方法使用
		//1.方法写好后，如果不去调用，不会输出
		//2.先创建对象，然后调用方法即可
		Person p1 = new Person();
		p1.speak();//调用方法
		p1.cal01();//调用cal01方法
		p1.cal02(5);//调用cal02方法，同时给n = 5.
		p1.cal02(10);//调用cal02方法，同时给n = 10.
		//调用getSum方法，同时num1=10,num2=20
		//把方法getSum返回的值，赋给变量returnsum
		int returnsum = p1.getSum(10,20);
		System.out.println("getSum方法返回的值=" + returnsum);
	}
}
class Person{
	String name;
	int age;
	//添加 speak 成员方法,输出 “我是一个好人”
	//1.piblic表示方法是公开的
	//2.void 表示方法没有返回值
	//3.speak():speak是方法名，()形参列表
	//4.{}方法体，可以写我们执行的代码
	//5.System.out.println("我是一个好人");表示我们的方法就是输出一句话
	public void speak(){
		System.out.println("我是一个好人");
	}
	//添加 cal01 成员方法,可以计算从1+..+1000 的结果
	public void cal01(){
		int sum = 0;
		for (int i = 1;i <= 1000;i++){
			sum += i;
		}
		System.out.println("cal01计算结果=" + sum);
	}
	//添加cal02成员方法,该方法可以接收一个数n，计算从1+..+n 的结果
	//1.(int n)形参列表，表示当前有一个形参n,可以接收用户输入.
	public void cal02(int n){
		int sum = 0;
		for (int i = 1;i <= n;i++){
			sum += i;
		}
		System.out.println("cal02计算结果=" + sum);		 
	}
    //添加getSum成员方法,可以计算两个数的和
    //1.public表示方法是公开的
    //2.int:表示方法执行后，返回一个int值
    //3.getSum 方法名
    //4.(int num1,int num2)形参列表，2个形参，可以接收用户传入的两个数
    //5.return sum;表示把sum的值返回，返回给接收的地方.
    public int getSum(int num1,int num2){
    	int sum = num1 + num2;
    	return sum;	
    }
}
*/


//请遍历一个数组，输出数组的各个元素值int[][] map = {{0,0,1},{1,1,1},{1,1,3}};
/*
public class Object{
	public static void main(String[] args){
		int[][] map = {{0,0,1},{1,1,1},{1,1,3}};
		//传统的解决方式就是直接遍历
// 		for(int i = 0;i < map.length;i++){
// 			for(int j = 0;j < map[i].length;j++){
// 		System.out.print(map[i][j] + " ");
// 	}
// 	System.out.println();
// } 

         //使用方法完成输出,创建MyTools对象
         MyTools tool = new MyTools();
         tool.printArr(map);
         tool.printArr(map);
}
}
//把输出功能，写到一个类的方法中，然后调用该方法即可.
class MyTools{
	//方法，接收一个二维数组
	public void printArr(int[][] map){
		System.out.println("=======");
		//对传入的map数组进行遍历输出
	   for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
	        	System.out.print(map[i][j] + " ");
	        	 }
	        	 System.out.println();
	        	}
	        }
	    }
*/


//注意事项
/*
public class Object{
	public static void main(String[] args){
		AA a = new AA();
		a.sayok();
		a.m1();
		int[] res = a.getSumAndSub(1,4);
		System.out.println("和=" + res[0]);
		System.out.println("差=" + res[1]);
		//细节:调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型的参数!
		byte b1 = 1;
		byte b2 = 2;
		a.getSumAndSub(b1,b2);//✅byte -> int
		//a.getSumAndSub(1.1,1.8);//❌ double -> int
		//细节:实参和形参的类型要一致或兼容，个数、顺序必须一致!
		//a.getSumAndSub(100);//❌ 个数不一致
		a.f3("tom",10);//✅
		//a.f3(100,"jack");//❌ 实参和形参顺序不对
}
}
class AA{
	//细节:方法不能嵌套定义
	// public void f4(){
	// 	public void f5(){

	// 	}
	// }//❌
	public void f3(String str,int n){

	}
	//1.一个方法最多有一个返回值 [如何返回多个结果,返回数组]
	//2.返回类型可以为任意类型，包含基本类型或引用类型(数组，对象).
	public int[] getSumAndSub(int n1,int n2){
		int[] resArr = new int[2];//创建一个数组
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}
	//3.如果方法要求有返回数据类型，则方法体中最后的执行语句必须为return值;
	//而且要求返回值类型必须和return的值类型一致或兼容.
	public double f1(){
		double d1 = 1.1 * 3;
		int n = 100;
		return n;//对 int -> double
	}
	
	// public int f2(){
	// 	double d1 = 1.1 * 3;
	// 	int n = 100;
	// 	return d1;//❌ double -> int
	// }
	
	//4.如果方法是void，则方法体中可以没有return语句，或者只写return;
	public void f2(){
		System.out.println("hello,world");
		return;//✅
		//int n = 10;
		//return n;//❌
	}
	//同一个类中的方法调用：直接调用即可
	public void print(int n){
		System.out.println("print()方法被调用n=" + n);
	}
	public void sayok(){//sayok调用print(直接调用即可)
		print(10);
		System.out.println("继续执行sayok()~~~");
	}
	//跨类中的方法AA类调用BB类方法：需要通过对象名调用
	public void m1(){
		System.out.println("m1()方法被调用");
		//创建BB对象,然后再调用方法即可
		BB bb = new BB();
		bb.hi();
		System.out.println("m1()方法继续执行");
	}
}
class BB{
	public void hi(){
		System.out.println("B类中的hi()被执行");
	}
}
*/


//成员方法练习题
//1.编写类AA方法:判断一个数是奇数odd还是偶数，返回boolean
/*
import java.util.Scanner;
public class Object{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数:");
		int n = scanner.nextInt();
		Hj a = new Hj();
		boolean f = a.AA(n);	
		if(a.AA(n)){//常用方法
			System.out.println(n + "是奇数");
		}else{
			System.out.println(n + "是偶数");
		}
		System.out.println(f);
		
	}
}
class Hj{
	//1.方法的返回类型 boolean
	//2.方法的名字 AA
	//3.方法的形参 (int n)
	//4.方法体，判断
public boolean AA(int n){
	// if(n % 2 != 0){
	// 	System.out.println(n + "是奇数");
	// 	return true;
	// } else{
	// System.out.println(n + "是偶数");
	// return false;	
	// }
	//return n % 2 != 0 ? true;false
	return n % 2 != 0; 
}
}
*/
//2.根据行、列、字符打印对应行数和列数的字符.
//比如:行：4，列：4，字符#，则打印相应的效果.
/* #### 
   #### 
   #### 
   #### 
*/ 
/*
//import java.util.Scanner;
public class Object{
	public static void main(String[] args){
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("请输入行数:");
		// int n1 = scanner.nextInt();
		// System.out.println("请输入列数:");
		// int n2 = scanner.nextInt();
		// System.out.println("请输入字符:");
		// char c = scanner.next().charAt(0);
		Hj1 hj = new Hj1();
		hj.zf(4,4,'#');
	}
}
//思路 
//1. 方法的返回类型 void 
//2. 方法的名字 Hj1
//3. 方法的形参 (int n1, int n2, char c) 
//4. 方法体 , 循环 
class Hj1{
	public void zf(int n1,int n2,char c){
		System.out.println("==图形如下==");
		for(int i = 1;i <= n1;i++){
			for(int j = 1;j <= n2;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
*/


//3.成员方法传参机制
/*
public class Object{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		//创建AA对象
		AA aa = new AA();
		aa.swap(a,b);//调用swap方法
		System.out.println("main方法:\na=" + a + "\tb=" + b);//a=10 b=20
		B bb = new B();
		int[] arr = {1,2,3};
		bb.test100(arr);
		System.out.println("main的arr数组:");
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		bb.test200(p);
		//System.out.println("\nmain的age=:" + p.age);//10000
		//测试题，如果test200执行的是p=null，下面的结果是10
		System.out.println("\nmain的age=:" + p.age);//10
		//测试题，如果text200执行的是p = new Person();下面输出的是
		System.out.println("\nmain的age=:" + p.age);//10
	}
}
class AA{
public void swap(int a,int b){
	System.out.println("a和b交换前的值:\na=" + a + "\tb=" + b);//a=10 b=20
	//完成了a和b的交换
	int tmp = a;
	a = b;
	b = tmp;
	System.out.println("a和b交换后的值:\na=" + a + "\tb=" + b);//a=20 b=10
}
}
class B{
	//B类中编写一个方法test100，可以接收一个数组，
	//在方法中修改该数组，看看原来的数组是否变化？
	public void test100(int[] arr){
		arr[0] = 200;//修改元素
		//遍历数组
		System.out.println("test100的arr数组:");
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
}
	public void test200(Person p){
		//p.age = 10000;//修改对象属性
		//p = null;
		p = new Person();
		p.name = "tom";
		p.age = 99;
	}
}

	//B类中编写一个方法test200，可以接收一个Person(age,sal)对象，
	//在方法中修改该对象属性，看看原来的对象是否变化？
class Person{
	String name;
	int age; 
}
*/


//引用类型传参机制练习题
//1.编写类MyTools类，编写一个方法可以打印二维数组的数据。
/*
public class Object{
	public static void main(String[] args){
		Tools h = new Tools();
		int[][] a = {{1,2,3},{2,3,4},{3,4,5}};
		h.MyTools(a);
	}
}
class Tools{
	public void MyTools(int[][] a){
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < a[i].length;j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
*/
//2.编写一个方法copyPerson，可以复制一个Person对象，返回复制的对象。
//克隆对象，注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同代码
/*
public class Object{
	public static void main(String[] args){
		Person p = new Person();
		p.name = "yuwei";
		p.age = 100;
		A a = new A();
		Person b = a.copyPerson(p);
		//到此p和b是Person对象，但是是两个独立的对象，属性相同
		System.out.println("p的属性年龄=" + p.age + " 名字=" + p.name);
		System.out.println("b的属性年龄=" + b.age + " 名字=" + b.name);
		//可以通过比较对象的hashCode看看对象是否是同一个
		System.out.println(p == b);//false
	}
}
class A{
	//编写方法的思路
	//1.方法的返回类型Person
	//2.方法的名字copyPerson
	//3.方法的形参(Person p)
	//4.方法体,创建一个新对象，并复制属性，返回即可
	public Person copyPerson(Person p){
	Person	b = new Person();
	b.name = p.name;//把原来对象的名字赋给b.name
	b.age = p.age;//把原来对象的年龄赋给b.age
	return b;
	}
}
class Person{
	String name;
	int age;
}
*/


//方法递归调用
//1.打印问题
/*
public class Object{
	public static void main(String[] args){
		Recursion01 t = new Recursion01();
		t.test(4);//开辟一个主栈，n=2 n=3 n=4
	}
}
class Recursion01{
public void test(int n){
	if(n > 2){
		test(n - 1);
	}
	System.out.println("n=" + n);
	}
}
*/
//2.阶乘问题
/*
public class Object{
	public static void main(String[] args){
		Recursion02 t = new Recursion02();
		int res = t.factorial(5);
		System.out.println("res=" + res);
	}
}
class Recursion02{
//factorial 阶乘
public int factorial(int n){
if(n == 1){
	return 1;
}else{
	return factorial(n - 1) * n;
	}
}
}
*/


//方法递归调用课堂练习
//请使用递归的方式求出斐波那契数1，1，2，3，5，8，13...给你一个整数n,求出它的值是多少？
/*
public class Object{
	public static void main(String[] args){
		A a = new A();
		int n = 7;
		int res = a.test1(n);
		if(res != -1){
		System.out.println("当n=" + n + "对应的斐波那契数=" + res);
	}
}
}
class A{
	public int test1(int n){
		if(n >= 1){
		if(n == 1|n == 2){
			return 1;
		}else{
			return test1(n-1) + test1(n-2);
		}
	}else{
		System.out.println("要求输入n>=1的整数");
		return -1;
	}
	}
}
*/
//猴子吃桃子问题:有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
//以后每天猴子都吃其中一半，然后再多吃一个。当到第10天时，想再吃时(即还没吃),发现只有1个桃子.
//问题:最初共多少个桃子？
/*
1.day=10时有1个桃子
2.day=9时有(day10+1)*2=4
3.day=8时有(day9+1)*2=10
4.规律就是前一天的桃子=(后一天的桃子+1)*2
*/
/*
public class Object{
	public static void main(String[] args){
		B b = new B();
		int day = 1;
		int res = b.test2(day);
		if(res != -1){
		System.out.println("第" + day + "天有" + res +"个桃子");
	}
	}
}
class B{
	public int test2(int day){
		if(day == 10){
			return 1;
		}else if(day >=1 && day <= 9){
			return (test2(day+1)+1)*2;
		}else{
			System.out.println("day应在1-10");
			return -1;
		}
	}
}
*/

//迷宫问题
/*
public class Object{
	public static void main(String[] args){
		//思路
        //1.先创建迷宫，用二维数组表示int[][]map=newint[8][7];
        //2.先规定map数组的元素值:0表示可以走 1表示障碍物
        //3.将最上面的一行和最下面的一行，全部设置为1
        int[][] map = new int[8][7];
        for(int i = 0;i < 7;i++){
        	map[0][i] = 1;
        	map[7][i] = 1;
        }
        //4.将最右面的一列和最左面的一列，全部设置为1 
        for(int i = 0;i < 8;i++){
        	map[i][0] = 1;
        	map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;//测试回溯
        // map[2][1] = 1;
        // map[2][2] = 1;
        // map[1][2] = 1;
        //输出当前地图
        System.out.println("=====当前地图情况=====");
        for(int i = 0;i < map.length;i++){
        	for(int j = 0;j < map[i].length;j++){
        		System.out.print(map[i][j] + " ");       	
        	}
        	System.out.println();
        }
        //使用findway给老鼠找路
        T t1 = new T();
        t1.findway(map,1,1);
        System.out.println("\n===找路的情况如下===");
                System.out.println("=====当前地图情况=====");
        for(int i = 0;i < map.length;i++){
        	for(int j = 0;j < map[i].length;j++){
        		System.out.print(map[i][j] + " ");       	
        	}
        	System.out.println();
        }
	}
}
class T{
	//使用递归回溯的思想来解决老鼠出迷宫
	//1.findWay方法就是专门来找出迷宫的路径
	//2.如果找到，就返回true,否则返回false
	//3.map就是二维数组，即表示迷宫
	//4.i,j就是老鼠的位置，初始化的位置为(1,1)
    //5.因为我们是递归的找路，所以我先规定map数组的各个值的含义
    //0表示可以走 1表示障碍物 2表示可以走 3表示走过，但是走不通是死路
    //6.当map[6][5]=2就说明找到通路,就可以结束，否则就继续找.
    //7.先确定老鼠找路策略下->右->上->左
	public boolean findway(int[][] map,int i,int j){
		if(map[6][5] == 2){//说明已经找到
			return true;
		}else {
		   if(map[i][j] == 0){//0表示可以走
            //假定可以走通
			map[i][j] = 2;
			//使用找路策略，来确定该位置是否真的可以走通 
			//下->右->上->左
			if(findway(map,i+1,j)){//先走下
				return true;
			}else if(findway(map,i,j+1)){//右
				return true;
			}else if(findway(map,i-1,j)){//上
				return true;
			}else if(findway(map,i,j-1)){//左
				return true;
			}else{
				map[i][j] = 3;
				return false;
			}
		}else{//map[i][j]=1,2,3
			return false;
		}

	}
}

    //修改找路策略，看看路径是否有变化
    //下->右->上->左==>上->右->下->左
	public boolean findway2(int[][] map,int i,int j){
		if(map[6][5] == 2){//说明已经找到
			return true;
		}else {
		     if(map[i][j] == 0){//0表示可以走
            //假定可以走通
			map[i][j] = 2;
			//使用找路策略，来确定该位置是否真的可以走通 
			//上->右->下->左
			if(findway2(map,i-1,j)){//先走上
				return true;
			}else if(findway2(map,i,j+1)){//右
				return true;
			}else if(findway2(map,i+1,j)){//下
				return true;
			}else if(findway2(map,i,j-1)){//左
				return true;
			}else{
				map[i][j] = 3;
				return false;
			}
		}else{//map[i][j]=1,2,3
			return false;
		}

	}
}
}
*/

//递归调用实例-汉诺塔
/*
public class Object{
	public static void main(String[] args){
		Tower tower = new Tower();
		tower.move(3,'A','B','C');
	}
}
class Tower{
	//num表示要移动的个数，a,b,c分别表示A塔，B塔，C塔
	public void move(int num,char a,char b,char c){
		//如果只有一个盘 num=1
		if(num == 1){
			System.out.println(a + "->" + c);
		}else{
		   //如果有多个盘，可以看成两个，最下面的和上面的所有盘.
		   //(1).先移动a上面所有的盘到b,借助c
		   move(num - 1,a,c,b);
		   //(2).把最下面的这个盘，移动到c
		   System.out.println(a + "->" + c);
		   //(3).把b塔所有盘移动到c，借助a
		   move(num - 1,b,a,c);
		}
	}
}
*/

//递归调用实例-八皇后
/*
public class Object{
	public static void main(String[] args){
		T t1 = new T();
		t1.put(0);
	}
}
class T{
	int arr[] = new int[8];
	//输出算法
	public void print(){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	//判断算法
	public boolean judge(int index){
		for(int i = 0; i < index; i++){//判断和之前的index个皇后是否冲突
			if(arr[i] == arr[index] || Math.abs(arr[index]-arr[i]) == Math.abs(index -i)){
				return false;
			}
		}
		return true;//必须放在for循环外部，
	}
	//放置算法,即在棋盘中放置第几个皇后
	public void put(int index){
 
		//首先判断index是否等于8
		if(index == 8){//当index等于8的时候，即第9个棋子，已经完成了8个棋子的放置
			print();//调用输出算法
			
		}else{
			for(int i = 0; i < 8; i++){
				arr[index] = i;//
				if(judge(index)){//如果返回true则继续判断
					put(index + 1);
				}
 
			}
		}
	}
}
*/



//4.方法重载OverLoad
/*
public class Object{
	public static void main(String[] args){
		// System.out.println(100);
		// System.out.println("hello,world");
		// System.out.println('h');
		// System.out.println(1.1); 
		// System.out.println(true);
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1,2));
		System.out.println(mc.calculate(1.1,2));
		System.out.println(mc.calculate(1,2.2));
		System.out.println(mc.calculate(1,2,3));
	}
} 
class MyCalculator{
	//下面的四个calculate方法构成了重载
	//两个整数的和
	public int calculate(int n1,int n2){		
		return n1 + n2;
	}
	//没有构成方法重载，因为是方法的重复定义，返回类型无要求
	// public void calculate(int n1,int n2){		
	// 	return n1 + n2;
	// }
	//一个整数，一个double的和
	public double calculate(int n1,double n2){
		return n1 + n2;
	}
	//一个double,一个整数的和
	public double calculate(double n1,int n2){
		return n1 + n2;
	}
	//三个int的和
	public int calculate(int n1,int n2,int n3){
		return n1 + n2 +n3;
	}
}
*/

//方法重载练习题
//1.判断题:
//与void show(int a,char b,double c){}构成重载的有:[b,c,d,e]
//(a).void show(int x,char y,double z){}
//(b).int show(int a,double c,char b){}
//(c).void show(int a,double c,char b){}
//(d).boolean show(int c,char b){}
//(e).void show(double c){}
//(f).double show(int x,char y,double z){}
//(g).void shows(){}

//2.编写程序，类 Methods 中定义三个重载方法并调用。
//方法名为m。 三个方法分别接收一个 int 参数、两个 int 参数、一个字符串参数。
//分别执行平方运算并输出结果， 相乘并输出结果，输出字符串信息。
//在主类的 main ()方法中分别用参数区别调用三个方法.
/*
public class Object{
	public static void main(String[]args){
		Methods f = new Methods();
		f.m(10);//100
		f.m(10,20);//200
		f.m("我很快乐");
	}
}
class Methods{
	public void m(int n1){
		System.out.println("平方=" + n1 * n1);	 
	}
	public void m(int n1,int n2){
		System.out.println("相乘=" + n1 * n2);
	}
	public void m(String str){
		System.out.println("传入的字符串=" + str);	
	}
}
*/
//3.在Methods类，定义三个重载方法 max()，第一个方法，返回两个 int 值中的最大值， 
//第二个方法，返回两个 double 值中的最大值，
//第三个方法，返回三个 double 值中的最大值，并分别调用三个方法
/*
public class Object{
	public static void main(String[]args){
		Methods m = new Methods();
		System.out.println(m.max(1,5));
		System.out.println(m.max(2.3,1.5));
		System.out.println(m.max(1.4,1.3,2.1));
	}
}
class Methods{
	public int max(int n1,int n2){
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1,double n2){
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1,double n2,double n3){
	    // if(n1 > n2){
	    // 	if(n1 > n3){
	    // 		return n1;
	    // 	}else{
	    // 		return n3;
	    // 	}
	    // }else if(n2 > n3){
	    // 		return n2;
	    // 	}else{
	    // 		return n3;
	    // 	}	    
	    double max1 = n1 > n2 ? n1 : n2;
	    return max1 > n3 ? max1 : n3; 
	    }	
	}
*/



//5.可变参数
/*
public class Object{
	public static void main(String[] args){
		HspMethod m = new HspMethod();
		//(1).可变参数的实参可以为0个或任意多个.
		//System.out.println(m.sum());
		//(2).可变参数的实参是数组.
		// (3).可变参数的本质就是数组.
		// int[] arr = {1,2,3};
		// System.out.println(m.sum(arr));
		System.out.println(m.sum(1,5,100));//106

	}
}
//类 HspMethod，方法 sum (可以计算2个数的和，3个数的和,4,5...)
class HspMethod{
	// public int sum(int n1,int n2){
	// 	return n1 + n2;
	// }
	// public int sum(int n1,int n2,int n3){
	// 	return n1 + n2 + n3;
	// }
	// public int sum(int n1,int n2,int n3,int n4){
	// 	return n1 + n2 + n3 + n4;
	// }
	//上面的三个方法名称相同，功能相同, 参数个数不同-> 使用可变参数优化
	//1. int... 表示接受的是可变参数，类型是 int ,即可以接收多个int(0-多) 
	//2. 使用可变参数时，可以当做数组来使用 即nums可以当做数组
	//3. 遍历 nums 求和即可
	public int sum(int... nums){
		System.out.println("接收的参数个数=" + nums.length);
		int res = 0;
		for(int i = 0;i < nums.length;i++){
			 res += nums[i]; 
		}
		return res;
	}
	// (4).可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后.
	// public void f2(double... nums,String str){
	// }❌
	public void f2(String str,double... nums){
	}
	// (5).一个形参列表中只能出现一个可变参数.
	// public void f3(int... nums1,double... nums2){
	// }//❌
}
*/

//可变参数练习题
//有三个方法，分别实现返回姓名和两门课成绩(总分)，
//返回姓名和三门课成绩(总分)，返回姓名和五门课成绩(总分).
//封装成一个可变参数的方法.类名HspMethod 方法名showScore
/*
public class Object{
	public static void main(String[] args){
		HspMethod hm = new HspMethod();
		System.out.println(hm.showScore("milian",90.1,80.0));
		System.out.println(hm.showScore("yuwei",99,90.1,80.0));
		System.out.println(hm.showScore("weir",78,89,98.4,90.1,80.0));
	}
}
class HspMethod{
	//注意返回类型是String.
	public String showScore(String name,double... scores){
		double totalScore = 0;
		for(int i = 0;i < scores.length;i++){
			totalScore += scores[i];
		}
		return name + scores.length + "门课的成绩总分为=" + totalScore;
	}
}
*/


//6.作用域
/*
public class Object{
	public static void main(String[] args){

	}
}
class Cat{
	//全局变量:也就是属性，作用域为整个类体Cat类: cry eat等方法使用属性
	//属性在定义时，可以直接赋值.
	int age = 10;//指定的值是10.
	//全局变量(属性)可以不赋值，直接使用，因为有默认值.
	double weight;//✅ 默认值是0.0
	//局部变量必须赋值后，才能使用，因为没有默认值.
	public void hi(){
		// int num;//❌，没赋值，必须给初始值.
		// System.out.println("num" + num);
	}
	public void say(){
		//1.局部变量一般是指在成员方法中定义的变量.
		//2.n和name 就是局部变量.
		//3.n和name的作用域在cry方法中
		int n = 10;
		String name = "jack";
		System.out.println("在cry中使用属性age=" + age);
	}
	public void eat(){
		System.out.println("在eat中使用属性age=" + age);
		//System.out.println("在eat中使用cry的变量name=" + name);//❌
	}
}
*/
//注意事项
/*
public class Object{
	public static void main(String[] args){
	    //属性生命周期较长，伴随着对象的创建而创建，伴随着对象的销毁而销毁.
		//局部变量，生命周期较短，伴随着它的代码块的执行而创建，
		//伴随着代码块的结束而销毁。即在一次方法调用过程中.
		Person p1 = new Person();
		p1.say();
		//当执行 say 方法时，say 方法的局部变量比如 name,会创建.
		//当 say 执行完毕后，name 局部变量就销毁.
		//但是属性(全局变量)仍然可以使用 
		T t1 = new T(); 
		t1.test(); //第 1 种跨类访问对象属性的方式 
		t1.test2(p1);//第 2 种跨类访问对象属性的方式 
	} 
}

class Person{
	//全局变量/属性可以加修饰符(public,protected,private...)
	public int age = 20;
	String name = "jack";
	public void say(){
		//属性和局部变量可以重名，访问时遵循就近原则
		//public String name = "king";//❌ 局部变量不可以加修饰符
		String name = "king";
		System.out.println("name=" + name);//king
	}
	public void hi() { 
		//2.在同一个作用域中，比如在同一个成员方法中，两个局部变量不能重名.
	    String address = "北京"; 
	    //String address = "上海";//错误,重复定义变量 
	    String name = "hsp";//可以 
	} 
}

//全局变量:可以被本类使用，或其他类使用(通过对象调用).
class T{
	public void test(){
		Person p1 = new Person();
		System.out.println(p1.name);//jack
	}

	public void test2(Person p){
		System.out.println(p.name);//jack
	}
}
*/


//7.构造方法/构造器
//现在我们就用构造方法来完成刚才提出的问题:
//在创建人类的对象时，就直接指定这个对象的年龄和姓名.
/*
public class Object{
	public static void main(String[] args){
		//当我们new一个对象时，直接通过构造器指定名字和年龄.
		Person p1 = new Person("smith",80);
		System.out.println("p1的信息如下:");
		System.out.println("p1对象name=" + p1.name);//smith
		System.out.println("p1对象age=" + p1.age);//80
	}
}
class Person{
	String name;
	int age;
	//构造器
	//1.构造器没有返回值，也不能写void.
	//2.构造器的名称和类名Person一样.
	//3.(String pName,int pAge)是构造器形参列表，规则和成员方法一样.
	public Person(String pName,int pAge){
		System.out.println("构造器被调用～～完成对象的属性初始化");
		name = pName;//传入的变量赋给属性
		age = pAge;
	}
}
*/
//注意事项
/*
public class Object{
	public static void main(String[] args){
		//5.在构造对象时，系统自动调用该类的构造方法.
		Person p1 = new Person("king",40);//第1个构造器
		Person p2 = new Person("tom");//第2个构造器
		Dog dog1 = new Dog();//使用的是默认的无参构造器
	}
}
class Person{
	String name;
	int age;//默认0
	//1.一个类可以定义多个不同的构造器，即构造器重载.
	//3.构造器没有返回值.	
	//4.构造器是完成对象的初始化，并不是创建对象.
	//第1个构造器
	public Person(String pName,int pAge){
		name = pName;
		age = pAge;
	}
	//第2个构造器，只指定人名，不需要指定年龄
	public Person(String pName){
		name = pName;
	}
	//2.构造器名和类名要相同.

	// public Perso(String pName){//❌
	// 	name = pName;
	// }
}
class Dog{
//如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器(也叫默认构造器) 
//使用 javap 指令 反编译看看  javap Dog.class/javap Dog

  // 默认构造器
  // Dog(){
	
  // }

//一旦定义了自己的构造器,默认的构造器就覆盖了，就不能再使用默认的无参构造器， 
//除非显式的定义一下,即: Dog(){}写(这点很重要)
    public Dog(String dName){
  }
  Dog(){//显式的定义一下 无参构造器

  }
}
*/
//构造方法练习题
//在前面定义的 Person 类中添加两个构造器：
//第一个无参构造器:利用构造器设置所有人的 age 属性初始值都为18
//第二个带pName和pAge两个参数的构造器:使得每次创建Person对象的同时初始化对象的age属性值和name属性值。
//分别使用不同的构造器，创建对象.
/*
public class Object{
	public static void main(String[] args){
		Person p1 = new Person();//无参构造器
		System.out.println("p1的信息name=" + p1.name + " age=" + p1.age);
		Person p2 = new Person("yuwei",20);
		System.out.println("p2的信息name=" + p2.name + " age=" + p2.age);
	}
}
class Person{
	String name;//默认null
	int age;//默认0
	public Person(){
		 age = 18;
	}
	public Person(String pName,int pAge){
		name = pName;
		age = pAge;
	}
}
*/


//8.this关键字
/*
public class Object{
	public static void main(String[] args){
		Dog dog1 = new Dog("大壮",3);
		System.out.println("dog1的hashcode=" + dog1.hashCode());
		//dog1.info();
		Dog dog2 = new Dog("大黄",2);
		//dog2.info();
		System.out.println("dog2的hashcode=" + dog2.hashCode());
	}
}
class Dog{//类
	String name;
	int age;
	// public Dog(String dName,int dAge){//构造器
	// 	name = dName;
	// 	age = dAge;
	// }
	//考虑构造器直接写成属性名
	//但是出现了一个问题，根据变量的作用域原则 
	//构造器的name是局部变量，而不是属性 
	//构造器的age是局部变量，而不是属性
	//==>引出this关键字来解决.
	public Dog(String name,int age){//构造器
		//this.name就是当前对象的属性name
		this.name = name;
		//this.age就是当前对象的属性age
		this.age = age;
		System.out.println("this的hashcode=" + this.hashCode());
	}
public void info(){//成员方法 输出对象属性信息
	System.out.println(name + "\t" + age + "\t");
}
}
*/
//注意事项和使用细节
/*
public class Object{
	public static void main(String[] args){
		T t1 = new T();
		t1.f2();
		T t2 = new T();
		t2.f3();
	}
}
class T{
	String name = "jack";
	int age = 100;
	//1.访问成员方法的语法:this.方法名(参数列表);
	public void f1(){
		System.out.println("f1()方法..");
	}
	public void f2(){
		System.out.println("f2()方法..");
		//调用本类的f1
		//第一种方式
		f1();
		//第二种方式
		this.f1();
	}
	//this关键字可以用来访问本类的属性
	public void f3(){
		String name = "smith";
		//传统方法
		System.out.println("name=" + name + " age=" + age);//有局部变量，按就近原则
		//也可以用this访问属性
		System.out.println("name=" + this.name + " age=" + this.age);//准确访问
	}
	//2.访问构造器语法:this(参数列表); 注意只能在构造器中使用.
	public T(){
		//即只能在构造器中访问另外一个构造器, 必须放在第一条语句
		this("jack",100);
		System.out.println("T()构造器");	
	}
	public T(String name,int age){
		System.out.println("T(String name,int age)构造器");
	}
}
*/
//this课堂练习
/*
定义 Person 类，里面有 name、age 属性，
并提供 compareTo 比较方法，用于判断是否和另一个人相等，
提供测试类 TestPerson 用于测试, 
名字和年龄完全一样，就返回 true, 否则返回 false
*/
/*
public class Object{
	public static void main(String[]args){
		Person p1 = new Person("marry",20);
		Person p2 = new Person("smith",30);
		System.out.println("p1和p2比较的结果=" + p1.compareTo(p2));
	}
}
class Person{
	String name;
	int age;
	//构造器
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public boolean compareTo(Person p){
		// if(this.name.equals(p.name) && this.age == p.age){
		// 		return true;
		// 	}else{
		// 		return false;
		// 	}
		return this.name.equals(p.name) && this.age == p.age;
	}
}
*/











