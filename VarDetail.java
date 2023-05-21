//变量的注意事项
public class VarDetail{
	  //编写一个main方法
	public static void main(String[] args){
		//变量必须先声明，后使用，即有顺序
		int a = 50;
		System.out.println(a);//输出a变量的值
		//该区域的数据/值可以在同一类型范围内不断变化
		//a = "jack";//String❌
		a = 88;
		System.out.println(a);
		//变量在同一个作用域内不能重名
		//int a = 77;//❌
	}
}
class Dog{
	public static void main(String[] args){
		//变量在不同作用域内可以重名
		int a=666;//对
		System.out.println(a);
	}
}
