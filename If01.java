import java.util.Scanner;
public class If01{
	public static void main(String[] args){

		//单分支
		//可以输入人的年龄，如果该同志的年龄大于18岁，
		//则输出"你年龄大于18,要对自己的行为负责，送入监狱."
		/*
		Scanner myscanner = new Scanner(System.in);
		System.out.println("输入人的年龄");
		int age = myscanner.nextInt();
		// if(age > 18){
		// 	System.out.println("你年龄大于18,要对自己的行为负责，送入监狱.");
		// }
		// System.out.println("程序继续...");
		*/


		//双分支
		//可以输入人的年龄，如果该同志的年龄大于18岁，
		//则输出"你年龄大于18,要对自己的行为负责，送入监狱."
		//否则，输出"你的年龄不大这次放过你了"
		/*
		if(age > 18){
			System.out.println("你年龄大于18,要对自己的行为负责，送入监狱.");
		}
		else{
			System.out.println("你的年龄不大这次放过你了");

		}
		System.out.println("程序继续...");
		*/


		//单分支和双分支练习题
		//1.对下列代码，若有输出，指出输出结果
		/*
		int x = 7;
		int y = 4;
		if(x > 5){
			if(y > 5){
				System.out.println(x + y);
			}
			System.out.println("韩顺平教育~");
			}else
			System.out.println("x is" + x);//韩顺平教育~
			*/
		//2.编写程序，声明2个double型变量并赋值。判断第一个数大于10.0,且第2个数小于20.0，打印两数之和.
			/* 自己写的很差劲
		System.out.println("请输入两个数");
		double a = myscanner.nextDouble();
		double b = myscanner.nextDouble();
		if(a > 10.0){
			if(b < 20){
				System.out.println(a + b);
			}else{
			System.out.println("第2个数不小于20.0");
		}
		}else{
			System.out.println("第一个数不大于10.0");
			}
			*/
			/*
			double d1 = 34.5;
			double d2 = 2.6;
			if(d1 > 10.0 && d2 < 20.0){
				System.out.println("两数之和=" + (d1 + d2));
			}
		//3.定义两个变量int,判断二者的和，是否能被3整除又能被5整除
			int c1 = 4;
			int c2 = 11;
			if((c1 + c2) % 3 == 0 && (c1 + c2) % 5 == 0){
				System.out.println("两数之和被3整除又能被5整除");
			}else{
				System.out.println("两数之和不能被3和5整除");
			}
		//4.判断一个年份是否是闰年，闰年的条件是符合下面二者之一:
		//(1)年份能被4整除，但不能被100整除 （2）能被400整除
			int year = 2004;
			if((year % 4 == 0 && year % 100 != 0)||year % 400 == 0){
				System.out.println(year + "年是闰年 ");
			}else{
				System.out.println(year + "年不是闰年 ");
			}
			*/



			//多分支
			/*
			//1.输入保国同志的芝麻信用分
			//如果：
			//(1).信用分为100分时，输出信用极好;
			//(2).信用分为(80,99]时，输出信用优秀;
			//(3).信用分为(60，80]时，输出信用一般;
			//(4).其它情况，输出信用不及格.
			//(5).请从键盘输入保国的芝麻信用分，并加以判断.
			//先对输入的信用分，进行一个范围的有效判断1-100，否则提示输入错误.
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入保国同志的芝麻信用分(1-100):");
			double grade = sc.nextDouble();
			if(grade >= 1 &&  grade <= 100){
			if(grade == 100){
				System.out.println("信用极好");
			}
			else if(grade <= 99 && grade > 80){
				System.out.println("信用优秀");
			}
			else if(grade <= 80 && grade > 60){
				System.out.println("信用一般");
			}
			else{
				System.out.println("信用不及格");		
			}
		}
		else{
			   System.out.println("信用分需要在1-100，请重新输入:");	
		}

		//2.看看输出什么
		boolean b = true;
		if(b == false)
			System.out.println("a");
		else if(b)
			System.out.println("b");
		else if(!b)
			System.out.println("c");
		else
			System.out.println("d");//b
		
		boolean b = true;
		if(b = false)
			System.out.println("a");
		else if(b)
			System.out.println("b");
		else if(!b)
			System.out.println("c");
		else
			System.out.println("d");//c
			*/



		//嵌套分支
		/*
		//1.参加歌手比赛，如果初赛成绩大于8.0进入决赛，否则提示淘汰.
		//并且根据性别提示进入男子组或女子组.
	    //输入成绩和性别，进行判断和输出信息.
		//提示:double score;char gender;
		//接收字符:char gender = scanner.next().charAt(0)
		Scanner rule = new Scanner(System.in);
		System.out.println("请输入成绩:");
		double score = rule.nextDouble();
		if(score > 8.0){
		System.out.println("请输入性别:");
		char gender = rule.next().charAt(0);
			if(gender == '男'){
				System.out.println("进入男子组决赛");
			}else if(gender == '女'){
				System.out.println("进入女子组决赛");
			}else{
				System.out.println("性别输入有误，请重新输入:");
			}
		}else{
			System.out.println("您被淘汰");
		}

		//2.出票系统:根据淡旺季的月份和年龄，打印票价.
		//4_10旺季:
		//    成人(18-60):60
		//    儿童(<18):半价
		//    老人(>60):1/3
		//    淡季:
		//    成人:40
		//    儿童:20
		Scanner   scanner = new Scanner(System.in);
		System.out.println("请输入月份(1-12):");
		int month = scanner.nextInt();
		if(month <= 10 && month >= 4){
		System.out.println("请输入年龄:");	
		int age = scanner.nextInt();	
		if(age >= 18 && age <= 60){
			System.out.println("成人票价:" + 60);
		}
			else if(age < 18){
				System.out.println("儿童票价:" + 30);
			}else if (age > 60){
				System.out.println("老人票价:" + 20);
			}
		}else{
		System.out.println("请输入年龄:");	
		int age = scanner.nextInt();	
		if(age >= 18 && age <= 60){
			System.out.println("成人票价:" + 40);
		}
			else if(age < 18){
				System.out.println("儿童票价:" + 20);
			}
			}
			*/




		//switch分支结构
		/*
		//1.编写一个程序，该程序可以接收一个字符，比如:a,b,c,d,e,f,g
		//2.a表示星期一，b表示星期二...
		//3.根据用户的输入显示相依的信息.要求使用switch语句完成.
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入一个字符(a-g):");
			char c = scanner.next().charAt(0);
		switch(c){
			case 'a':
				System.out.println("星期一");
			break;
			case 'b':
			System.out.println("星期二");
			break;
			case 'c':
			System.out.println("星期三");
			break;
			case 'd':
			System.out.println("星期四");
			break;
			case 'e':
			System.out.println("星期五");
			break;
			case 'f':
			System.out.println("星期六");
			break;
			case 'g':
			System.out.println("星期七");
			default:
			System.out.println("输入的字符不正确，没有匹配上");

		}
		System.out.println("退出switch,程序继续");
		*/
		//细节1
		//表达式数据类型,应和case后的常量类型一致，
		//或者是可以自动转成可以相互比较的类型>，比如输入的是字符，而常量是int.
		/*
		char c = 'a';
		switch(c){
			case 'a':
			System.out.println("ok1");
			break;
			case 'b':
			System.out.println("ok2");
			break;
			default:
			System.out.println("ok3");
			*/
		//细节2
		//switch(表达式)中表达式的返回值必须是:
		//(byte,short,int,char,enum[枚举],String)
		/*
		double c = 1.1;//❌
		switch(c){
			case 1.1:
			System.out.println("ok1");
			break;
			case 2.1:
			System.out.println("ok2");
			break;
			default:
			System.out.println("ok3");
		*/
		//细节3
		//case子句中的值必须是常量(1,'a')，或者是常量表达式，而不是变量a.
		/*
		char c = 'a';
		char c1 = 'c';
		switch(c){
			case 'a':
			System.out.println("ok1");
			break;
			//case c1://❌
			case 'b' + 1://对
			System.out.println("ok2");
			break;
			default:
			System.out.println("ok3");
		}
		*/
		//细节4
		//default子句是可选的，当没有匹配的case时，执行default.
		//如果没有default子句，又没有匹配任何常量，则没有输出.
		//细节5
		//break语句用来在执行完一个case分支后使程序跳出switch语句块;
		//如果没有写break，程序会顺序执行到switch结尾.
		/*
		char c = 'a';
		switch(c){
			case 'a':
			System.out.println("ok1");
			//break;
			case 'b':
			System.out.println("ok2");
			//break;
			default:
			System.out.println("ok3");
		}
		    System.out.println("退出switch，继续执行...");//ok1 ok2 ok3 退出switch，继续执行...
		*/
		//switch 课堂练习
		//1.使用switch把小写类型的char型转为大写(键盘输入).只转换a,b,c,d,e.
		//其它的输出"other".
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字母(a-e):");
		char a = scanner.next().charAt(0);
		switch(a){
			case 'a':
			    System.out.println("A");
			    break;
			case 'b':
			    System.out.println("B");
			    break;
			case 'c':
			    System.out.println("C");
			    break;
			case 'd':
			    System.out.println("D");
			    break;
			case 'e':
			    System.out.println("E");
			    break;
			default:
			    System.out.println("输入字母不在要求范围内");
		}
		*/
		//2.对学生成绩大于60分的，输出"合格".低于60分的，输出"不合格".
		//(注:输入的成绩不能大于100)，提示成绩/60.
		//思路分析
		//1.这道题可以用分支来完成，但是要求使用switch.
		//2.这里我们需要进行一个转换:
		//  如果成绩在[60,100],(int)(成绩/60)=1
		//  如果成绩在[0,60),(int)(成绩/60)=
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生成绩:");
		double score = scanner.nextDouble();
		//使用if-else保证输入的成绩是有效的 0-100
		if(score >=0 && score <= 100){
		int c = (int)(score/60);
		switch(c){
			case 1:
			System.out.println("合格");
			break;
			case 0:  
			System.out.println("不合格");
			break;
		}
	}else{ 
	 System.out.println("输入成绩有误");
	}
	*/
		//3.根据用于指定月份,打印该月份所属的季节.3,4,5春季 
		// 6,7,8夏季 9,10,11秋季 12,1,2冬季(使用穿透)
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入月份(1-12):");
		int month = scanner.nextInt();
		switch(month){
			case 3:
			case 4:
			case 5:
			System.out.println("春季");
			break;
			case 6:
			case 7:
			case 8:
			System.out.println("夏季");
			break;
			case 9:
			case 10:
			case 11:
			System.out.println("秋季");
			break;
			case 12:
			case 1:
			case 2:
			System.out.println("冬季");
			break;
			default:
			System.out.println("输入月份不对");
		}
		*/



		//使用for循环控制
		//打印10句"你好，韩顺平教育!"
		//第一种格式
		// for( int i = 1;i <= 10; i++){
		// 	System.out.println("你好，韩顺平教育！" + i);
		// }
		//第二种格式
		// int i = 1;//循环变量初始化
		// for(;i <= 10;){
		// 	System.out.println("你好，韩顺平教育！" + i);
		// 	i++;
		// }
		// System.ouy.println("i=" + i);//ok

		//补充(不要执行)		
		// for(;){//表示一个无限循环,死循环+break;配合
		// 	System.out.println("ok~")
		// }

		//分析下面代码输出什么
		/*
		int count = 3;
		for(int i = 0, j = 0; i < count;i++,j += 2){
			System.out.println("i=" + i + " j=" + j);
		}//i=0 j=0
		 //i=1 j=2
		 //i=2 j=4
		 */

		//for循环练习题
		//1.打印1～100之间所有是9的倍数的整数，统计个数及总和.[化繁为简，先死后活
		//(1).化繁为简:即将复杂的需求，拆解成简单的需求，逐步完成.
		//(2).先死后活:先考虑固定的值,然后转成可以灵活变化的值.
		//思路分析:
		//化繁为简
		//(1).完成输入1-100的值.
		//(2).在输出过程中，进行过滤，
		//(3).统计个数,定义一个变量 int count = 0;当条件满足时，count++;
		//(4).总和，定义一个变量int sum = 0;当条件满足时累积 sum += i;
		/*
		int count = 0;//统计9的倍数个数变量
		int sum = 0;//总和
		for(int i = 1;i <= 100; i++){
			if(i % 9 == 0){
		    System.out.println("i="+i);	
		    count++;
		    sum += i;
		}
	}
	System.out.println("count="+count);	
	System.out.println("sum="+sum);	
	*/
		//先死后活
		//(1).为了适应更好的需求，把范围的开始的值和结束的值，做出变量
	    //(2).还可以进一步 9的倍数也做成变量
	/*
		int count = 0;//统计9的倍数个数变量
		int sum = 0;//总和
		int start = 1;
		int end = 100;
		int t = 9;
		for(int i = start;i <= end; i++){
			if(i % t == 0){
		    System.out.println("i="+i);	
		    count++;
		    sum += i;
		}
	}
	System.out.println("count="+count);	
	System.out.println("sum="+sum);	
	*/
		//2.完成下面的表达式输出.
	    // 0 + 5 = 5
	    // 1 + 4 = 5
	    // 2 + 3 = 5
	    // 3 + 2 = 5
	    // 4 + 1 = 5
	    // 5 + 0 = 5
	    /*
	    for(int i = 0; i <= 5;i++){
	    	for(int j = 5;j >= 0;j--){
		   if(i + j == 5){
			System.out.println(i + "+" + j + "=5");
		}
		}
	}
	*/
	    //化繁为简
	    //(1).先输出0-5
	    //(2).后面的+是5-i
	    /*
	    for(int i = 0; i <= 5;i++){
			System.out.println(i + "+" + (5-i) + "=5");
	    }
	    */
	    //先死后活
	    //5替换成n
	    /*
	    int n = 5;
	    for(int i = 0; i <= n;i++){
			System.out.println(i + "+" + (n-i) + "=5");
	    }
	    */



	    //while循环案例
	    //输出10句 你好，韩顺平教育
	    /*
	    int i = 1;//循环变量初始化
	    while(i <= 10){//循环条件
	    	System.out.println("你好，韩顺平教育" + i);
	    	i++;//循环变量迭代
	    }
	    System.out.println("退出while循环，继续...");
	    */

	    //while习题
	    //1.打印1-100之间所有能被3整除的数.
	    /*
	    int i = 1;
	    int endNum = 100;
	    System.out.println("打印1-100之间所有能被3整除的数:");
	    while(i <= endNum){
	    	if(i % 3 == 0){
	    		System.out.println("i=" + i);
	    	}
	    	i++;
	    }
	    */
	    //2.打印40-200之间所有的偶数.
        /*
	    int j = 40;
	    int endNum = 200;
	    System.out.println("打印40-200之间所有的偶数:");
	    while(j <= endNum){
	    	if(j % 2 == 0){
	    		System.out.println("j=" + j);
	    	}
	    	j++;
	    }
	    */

	    

	    //do while案例
	    //输出10句 你好，韩顺平教育
	    /*
	    int i = 1;
	    do{
	    	System.out.println("你好，韩顺平教育" + i);
	    	i++;
	    }while(i <= 10);
	    System.out.println("退出do-while,继续执行..");
	    */

	    //do while练习题
	    //1.打印1-100
	    /*
	    int i = 1;
	    do{
	    	System.out.println(i);
	    	i++;
	    }while(i <= 100);
	    */
	    //2.计算1-100的和
	    /*
	    int j = 1;
	    int sum = 0;
	    do{
	    	sum += j;
	    	j++;
	    }while(j <= 100);
	    System.out.println("计算1-100的和为:" + sum);//5050
	    */
	    //3.统计1-200之间能被5整除但不能被3整除的个数
	    /*
	    int i = 1;
	    int end = 200;
	    int count = 0;
	    do{
	    	if(i % 5 == 0 && i % 3 != 0){
	    		System.out.println("i=" + i);
	    		count++;
	    	}
	    	i++;
	    }while(i <= end);
	    System.out.println("1-200之间能被5整除但不能被3整除的个数是" + count);//27
	    */
	    //4.如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止.
	    //System.out.println("老韩问:还钱吗？y/n") do while
	    /*
	    Scanner scanner = new Scanner(System.in);
	    char answer = ' ';
	    do{
	    	System.out.println("老韩使出五连鞭");
	    	System.out.println("老韩问:还钱吗？y/n");
	    	  answer = scanner.next().charAt(0);
	    	  System.out.println("他的回答是" + answer);
	    }while(answer == 'n');
	    */



	    //多重循环控制案例
	    /*
	    for(int i = 0; i < 2; i++){
	    	for(int j = 0; j < 3; j++){
	    		System.out.println("i=" + i + " j=" + j);//i=0 j=0;i=0 j=1;i=0 j=2
	    		                                         //i=1 j=0;i=1 j=1;i=1 j=2
	    	}
	    }
	    */
	    //多重循环控制练习题
	    //1.统计3个班级成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分
	    //. [学生的成绩从键盘输入]
	    //2.统计三个班及格人数，每个班有5名同学.
	    /*
	    Scanner scanner = new Scanner(System.in);
	    double all = 0;
	    int passNum = 0;
	    int classNum = 3;//班级个数
	    int stuNum = 5;//学生个数
	    for(int i = 1;i <= classNum;i++){ 
	    	double sum = 0;
	    	int pass = 0;
	    for(int j = 1;j <= stuNum;j++){
	    	System.out.println("请输入第" + i +"个班的第" + j + "个学生成绩:");
	    	double score = scanner.nextDouble(); 
	    	if(score >= 60){
	    		passNum++;
	    		pass++;
	    	}
	    	System.out.println("第" + i +"个班的第" + j + "个学生成绩为:" + score);
	    	sum += score;
	    }
	    all += sum;
	    System.out.println("第" + i +"个班的平均分:" + sum/stuNum);
	    System.out.println("第" + i + "个班级的及格人数为:" + pass);	
	}
	System.out.println("所有班级的平均分:" + all/(classNum*stuNum));
	System.out.println("3个班级的及格人数为:" + passNum);
	*/
	    //3.打印出九九乘法表
	    /*
	    for(int i = 1;i <= 9;i++){
	    	for(int j = 1;j <= i;j++){
	    		System.out.print(j + "*" + i + "=" + i*j + "\t");
	    	}
	    	System.out.println("");
	    }
	    */
    
	  
	    //使用for循环完成下面案例
	    //请编写一个程序，可以接收一个整数,表示层数(totallevel),打印出金字塔.
        /*
                 *
                * *
              *     *
             *        *
            ************

        */
        //化繁为简
        //1.先打印一个矩形
        /*
            *****
            *****
            *****
            *****
            *****
        */
        /*
        for(int i = 1; i <= 5;i++){
        		System.out.print("*****");//print不换行
        }       
        */
        //2.打印半个金字塔
        /*
        *
        **
        ***
        ****
        *****
        */
        /*
        for(int i = 1; i <= 5;i++){
        	for(int j = 1;j <= 2*i-1;j++){

        		System.out.print("*");//print不换行
        	}
        	System.out.println("");//println换行
        }
        */
        //3.打印整个金字塔
        /*
            *          4个空格
           ***         3个空格    空格数=总层数减-当前层数
          *****        2个空格
         *******       1个空格
        *********      0个空格
        */
  
        //在输出*之前还要输出空格
        /*
            for(int i = 1; i <= 5;i++){
        	for(int k = 1; k <= 5-i;k++){
        		System.out.print(" ");
        	}
        	for(int j = 1;j <= 2*i-1;j++){

        		System.out.print("*");//print不换行
        	}
        	System.out.println("");//println换行
        }
        */
        //4.打印空心金字塔
        /*
                 *           当前行的第一个位置是*，最后一个位置也是*
                * *          当前行的第一个位置是*，最后一个位置也是*
              *     *        当前行的第一个位置是*，最后一个位置也是*
             *        *      当前行的第一个位置是*，最后一个位置也是*
            ************     全部输出*
        */
        /*
        int totallevel = 5; 
        for(int i = 1; i <= totallevel;i++){//层数
        	for(int k = 1; k <= totallevel-i;k++){//外部空格数
        		System.out.print(" ");
        	}
        	for(int j = 1;j <= 2*i-1;j++){//*
        		if(j == 1 || j == 2*i-1 || i == totallevel){
        		System.out.print("*");//print不换行
        	}else{
        	System.out.print(" ");//内部空格数
        }
    }
    //每打印完一层的*后，就换行 println本身会换行.
        System.out.println("");
        }
        */

        //打印空心菱形
        /*
           *
          * *
         *   *
        *     *
         *   *
          * *
           *
        
        */
        /*
        int i = 1;
        int up = 10;//上半部分的层数
        for( i = 1;i <= up; i++){
        	for(int k = 1;k <= up - i;k++){
        		System.out.print(" ");
        	}
        	for(int j = 1;j <= 2*i-1;j++){
        		if(j ==1||j == 2*i-1){
        		System.out.print("*");	
        		}else{
        			System.out.print(" ");	
        		}       		
        	}
        	System.out.println(" ");	
        }
        
        for(i = up-1;i >= 1;i--){
        	for(int k = 1;k <=up - i;k++){
        		System.out.print(" ");
        	}
        	for(int j = 1;j <= 2*i-1;j++){
        		if(j ==1||j == 2*i-1){
        		System.out.print("*");	
        		}else{
        			System.out.print(" ");	
        		}       		
        	}
        	System.out.println(" ");	
        }
        */


        //跳转控制语句-break
        //随机生成1-100的一个数，直到生成97这个数，看看你一共用了多少次?
        //提示使用(int)(Math.random()*100) + 1//public static double random()返回一个double值为正号，大于等于0.0 ，小于1.0 。
	    //思路分析
	    //循环，但是循环的次数不知道，-> break，当某个条件满足时，
	    //终止循环通过该需求可以说明其它流程控制数据的必要性，比如break
	    /*
	    int i = 0;
	    int c = 0; 
	    do{
	     	c =(int)(Math.random()*100)+1;
	     	i++;
	    	System.out.println("第"+ i + "个数是" +c);
	    }while(c != 97);
	    System.out.println("直到生成97这个数用了" + i + "次");
	    */
	    //测试代码
	    /*
	    for( int i = 0;i < 10;i++){
	    	if(i == 3){
	    		break;//提前终止for循环
	    	}
	    	System.out.println("i=" +i);//i=0 i=1 i=2
	    }
	    System.out.println("退出for循环，继续执行..");
	    */
	    //break与标签搭配使用，指定break用于退出某个循环
	    /*
	    label1:
	    for(int j = 0;j < 4;j++){//外层for
	    label2:
	    for(int i = 0;i < 10;i++){//内层for
	    	if(i == 2){
	    		break label1;
	    	}
	    	System.out.println("i=" + i);//i=0 i=1 
	      }
	    }
	    */
	    //break练习题
	    //1.1-100以内的数求和，求出当和第一次大于20的当前数.[for + break]
	    /*
	    int sum = 0;   
	    for(int i = 1;i <= 100;i++){
	    	sum += i;//累加
	    	if(sum > 20)
	    	{
	    		System.out.println("第一次和大于20，当前数i=" + i);
	    		break;
	    	}
	    }
	    */
	    //2.实现登录验证，有3次机会，如果用户名为"丁真"，密码为"666"提示登录成功.
	    //否则提示还有几次机会，请使用for+break完成.
	    /*
	    Scanner scanner = new Scanner(System.in);
	    String name = "";
	    String passwd = "";
	    int chance = 3;
	    //String name = scanner.next();
	    for(int i = 1;i <= chance;i++){
	    System.out.println("请输入名字:");
	    name = scanner.next();	
	    System.out.println("请输入密码:");
	    passwd = scanner.next();
	    //比较输入名字和字符串是否正确
	    //补充说明字符串的比较使用方法 equals
	    if("丁真".equals(name) && "666".equals(passwd)){
	    	System.out.println("登录成功");
	    	break;
	    }
	    if(i == chance){
	    	System.out.println("登录失败");
	    	break;
	    }
	    System.out.println("密码输入错误，还有" + (chance - i) + "次机会");
	}
	*/


	     
	     //continue快速入门案例
	     /*
         int i = 1;
         while(i <= 4){
         	i++;
         	if(i == 2){
         		continue;
         	}
         	System.out.println("i=" + i);//i=3 i=4 i=5
         }
         */
         //continue细节案例和说明:
         /*
         label1:
         for(int j = 0;j < 4;j++){
         	label2:
         	for(int i = 0;i < 10;i++){
         		if(i == 2){
         			continue label1;//continue 输出4次[0,1,3,4,5,6,7,8,9]
         		}
         		System.out.println("i=" + i);//i=0 i=1 i=0 i=1 i=0 i=1 i=0 i=1
         	}
         }
         */



         //return案例
         /*
         for(int i = 1;i <= 5;i++){
         	if(i == 3){
         		System.out.println("韩顺平教育" + i);
         		return;
         	}
         	System.out.println("Hello world!");
         }
         System.out.println("go on..");//Hello world!; Hello world!;韩顺平教育3
         */
	}
}

