//整数的使用细节
/*
public class IntDetail{
	  //编写一个main方法
	public static void main(String[] args){
		//java的整型常量(具体值)默认为int型，声明long型常量须加‘l'或‘L‘
		int n1 = 1;
		//int n2 = 1L;❌
		long n3 = 1L;//对
	}
}
*/
//浮点小数的使用细节
/*
public class FloatDetail{
	  //编写一个main方法
	public static void main(String[] args){
		//java的浮点型常量(具体值)默认为double型，声明float型常量须加‘f'或‘F‘
		//float num1 = 1.1;❌
		float num2 = 1.1F;//对
		double num3 = 1.1;//对
		double num4 = 1.1f;//对
		//十进制数形式：如：5.12  512.of  .512 (必须有小数点)
		double num5 = .123;//等价0.123
		System.out.println(num5);
		//科学技术法形式：如：5.12e2[] =5.12*10^2   5.12E-2[] =5.12/10^2
		System.out.println(5.12e2);//512.0 保存成double类型
		System.out.println(5.12E-2);//0.0512
		//通常情况下，应该使用double型，因为它比float型更精确
		double num9 = 2.1234567851;
		float num10 = 2.1234567851F;
		System.out.println(num9);
		System.out.println(num10);
		//陷阱
		double num11 = 2.7;
		double num12 = 8.1 / 3;
		System.out.println(num11);//2.7
		System.out.println(num12);//接近2.7的小数
		//得到一个重要的使用点：当我们对运算结果是小数的进行相等判断时要小心。
		//应该是以两个数的差值的绝对值，在某个精度范围内判断
		// if( num11 == num12){
		// 	System.out.println("相等");
		// }
		//正确的写法。 command+/ 注释快捷键，再次输入就取消注释
		//可以通过java的API来看
		if(Math.abs(num11 - num12)<0.0000001){
			System.out.println("差值非常小，满足规定的精度，认为相等...");

		}
					//细节：如果是直接查询得到的小数或者直接赋值，是可以判断相等的。
		double num13 = 2.7;
		double num14 = 2.7;
		if( num13 == num14){
	    System.out.println("相等");

		}
	}
}
*/
//字符类型的使用细节
/*
public class CharDetail{
	  //编写一个main方法
	public static void main(String[] args){
		char c1 = 97;
		System.out.println(c1);//输出unicode码对应的字符a
		char c2 = 'a';
		System.out.println((int)c2);//输出'a'对应的数字
		char c3 = '韩';
		System.out.println((int)c3);//38889
		char c4 = 38889;
		System.out.println(c4);//输出韩
		//char类型是可以进行运算的，相当于一个整数，因为它都有对应的Unicode码.
		System.out.println('a'+10);//输出107
		//课堂小测试
		char c5 = 'b' + 1;//98+1=99
		System.out.println((int)c5);//99
		System.out.println(c5);//99->对应的字符，编码表ASCII(规定好的)=>c
	}
}
*/
//自动类型转换细节
/*
public class AutoConvertDetail{
	public static void main(String[] args){
		//细节1:有多种类型的数据混合运算时，
		//系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算.
		int n1 = 10;
		double d1 = n1 + 1.1;
		float d2 = n1 + 1.1F;
		//细节2:当我们把精度(容量)大的数据类型赋值给精度(容量)小的数据类型时，就会报错。
        //反之就会进行自动类型转换.
        //int n2 = 1.1;//❌ double -> int
        //细节3:(byte,short)和char之间不会相互自动转换
        //当把数赋给byte时，先判断该数是否在byte范围内，如果是就可以
        byte b1 = 10;//对，~128-127
        // int n2 = 1;//n2是int 
        //byte b2 = n2;//❌，原因：如果是变量赋值，判断类型。
        //char c1 = b1;//❌，原因：byte不能自动转成char
        //细节4:byte、short、char他们三者可以计算，即使只出现其中一个，在计算时首先转化为int类型.
        byte b2 = 1;
        byte b3 = 2;
        short s1 = 1;
        //short s2 = b2 + s1;//❌,b2 + s1 => int
        //byte b4 = b2 + b3;//❌ b2 + b3 => int
        //细节5:boolean不参与转换.
        boolean pass = true;
        //int num100 = pass;//❌
        //细节6:自动提升原则：表达式结果的类型自动提升为操作数最大的类型.
        byte b4 = 1;
        short s3 = 100;
        int num200 = 1;
        double num300 = 1.1;
        double num500= b4 + s3 +num200 + num300; 
	}
}
*/
//强制类型转换使用细节
/*
public class ForceConvertDetail{
	  //编写一个main方法
	public static void main(String[] args){
		//强制符合只针对于最近的操作数有效，往往会使用小括号提升优先级
		//int x = (int)10*3.5+6*1.5;//❌ double -> int 
		int y = (int)(10*3.5+6*1.5);//(int)44.0 -> 44
		System.out.println(y);//44
		//char类型可以保存int的常量值，但不能保存int的变量值，需要强转
		char c1 = 100; //对
		int m = 100;//对
		//char c2 = m;//❌，类型不匹配
		char c3 = (char)m;//对
		System.out.println(c3);//100对应的字符d
}
}
*/
//演示字符串转基本数据类型的细节
/*
public class StringToBasicDetail{
	  //编写一个main方法
	public static void main(String[] args){
		String str1 = "123";
		String str2 = "hello";
		//转成int
		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		System.out.println(n1);//对
        //System.out.println(n2);//❌
	}
}
*/