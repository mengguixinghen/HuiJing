//数组的引出
import java.util.Scanner;
public class Array{
	public static void main(String[] args){
		/*
		一个养鸡场有 6 只鸡，它们的体重分别是3kg,5kg,1kg,3.4kg,2kg,50kg 。
		请问这六只鸡的总体重是多少?平均体重是多少?
		*/
		/*
		double hen1 = 3; 
		double hen2 = 5; 
		double hen3 = 1; 
		double hen4 = 3.4; 
		double hen5 = 2; 
		double hen6 = 50; 
		double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
		double avgWeight = totalWeight/6;
		System.out.println("总体重="+totalWeight + "kg 平均体重" 
		+avgWeight + "kg");
		*/
		//用数组解决
		//定义一个数组
		/*
		//1. double[]表示double类型的数组，数组名:hens
		//2.{3,5,1,3.4,2,50}表示数组的值/元素，依次表示数组的第几个元素 
		double[] hens = {3,5,1,3.4,2,50};
		//可以通过数组名.length 得到数组的大小/长度
		System.out.println("数组的长度=" + hens.length);

		//遍历数组得到数组的所有元素的和 使用for循环
		//1.通过hens[下标]来访问数组的元素
		//  下标是从0开始编号的，比如第一个元素就是hens[0]，依次类推
		//2.通过for循环就可以循环访问数组的元素/值
		//3.使用一个变量totalWeight将各个元素累积
		double totalWeight = 0;
		for(int i = 0; i < hens.length; i++){
			//System.out.println("第" +(i+1) + "个元素的值=" + hens[i]);
			totalWeight += hens[i];
		}
		System.out.println("总体重="+totalWeight + "kg 平均体重" 
		+totalWeight/hens.length+ "kg");
		*/

		//演示 数据类型 数组名[] = new 数据类型[大小];
		//循环输入5个成绩，保存到double数组，并输出
		/*
		//步骤
		//1.创建一个double数组，大小5
		//第一种动态分配方式:double scores[] = new double[5];
		//第二种动态分配方式(先声明数组，再new分配空间):
		double scores[];//声明数组 空值null
		scores[] = new double[5];//分配内存空间，可以存放数据
		//2.循环输入 
		//scores.length表示数组的大小/长度
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < scores.length;i++){
			System.out.println("请输入第" + (i+1) + "个元素的值:");
			scores[i] = scanner.nextDouble();
		}
		//输出，遍历数组
		System.out.println("==数组的元素/值的情况:===");
		for(int i = 0; i < scores.length;i++){
		System.out.println("第" + (i+1) + "个元素的值=" +scores[i]);
		}
		*/


		//数组注意事项
		/**
		// (1).数组是多个相同类型数据的组合，实现对这些数据的统一管理.
		int[] arr1 = {1,2,3,60};//✅
		//int[] arr1 = {1,2,3,60,1.1};//❌ double类型的数据不能赋值给整型变量
		//int[] arr1 = {1,2,3,60,"hello"};//❌ String 无法转换为int
		double[] arr2 = {1.1,2.2,3.3,60};//✅ int -> double
	    // (2).数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用.
	    String[] arr3 = {"北京","jack","milan"}; //✅
	    // (3).数组创建后，如果没有赋值，有默认值
	    //int 0,short 0,byte 0,long 0,float 0.0,double 0.0,char \u0000，
	    // boolean false,String null.
	    short[] arr4 = new short[3];
	    for(int i = 0;i < arr4.length;i++){
	    	System.out.print(arr4[i]);
	    }
	    // (4).使用数组的步骤:1.声明数组并开辟空间 2.给数组各个元素赋值 3.使用数组
	    // (5).数组的下标是从0开始的!!!!
	    // (6).数组下标必须在指定范围内使用，否则报:下标越界异常.
	    //比如 int[] arr = new int[5];则有效下标为0-4.
	    //即数组的下标/索引 最小:0 最大数组:长度-1
	    int[] arr = new int[5];
	    //System.out.println(arr[5]); //❌数组越界
	    // (7).数组属引用类型，数组型数据是对象(object).
	    */

	    //数组应用案例
	    //1.创建一个char类型的26个元素的数组，分别放置'A'-'Z'.
	    //使用for循环访问所有元素并打印出来.提示:char类型数据运算'A'+1->'B'.
	    /*
	    char c[] = new char[26];
	    for(int i = 0;i < c.length;i++){
	    	c[i] =(char)('A' + i);//('A' + i)是int类型，必须使用强转
	    }
	    for(int i = 0;i < c.length;i++){
	    	System.out.print(c[i] + " ");
	    }
	    */
	    //2.请求出一个数组int[]的最大值{4,-1,9,10,23},并得到对应的下标.
	    /*
	    int b[] = {4,-1,9,10,23};
	    int max = b[0];//假定第一个元素就是最大值
	    int l = 0;
	    for(int i = 1;i < b.length;i++){
	    	if(max < b[i]){
	    		max = b[i];
	    		l = i;
	    	}	
	    }
	    System.out.println("最大值=" + max +" 对应的下标=" + l);
	    */
	    //3.请求出一个数组的和和平均值(养鸡场)
	    /*
	    double a[]={1,4,5,6.8,8.9};
	    double total = 0;
	    for(int i = 0; i < a.length;i++){
	    	total += a[i];
	    }
	    System.out.println("这个数组的和=" + total + " 平均值=" + total/5);
	    */

        //值拷贝与引用传递的区别
        /*
	    //基本数据类型赋值,赋值方式为值拷贝
	    //n2的变化不会影响n1的值
	    int n1 = 10;
	    int n2 = n1;
	    n2 = 80;
	    System.out.println("n1=" + n1);//10
	    System.out.println("n2=" + n2);//80
	   //数组在默认情况下是引用传递，赋的值是地址.
	    //是一个地址，arr2变化会影响到arr1
	    int[] arr1 = {1,2,3};
	    int[] arr2 = arr1;//把arr1赋给arr2
	    arr2[0] = 10;
	    System.out.println("====arr1的元素====");
	    for(int i = 0;i < arr1.length;i++){
	    System.out.println(arr1[i]);//10,2,3
	    }
	    */

	    //数组拷贝(内容复制)
	    /*
	    //将 int[] arr1 = {10,20,30};拷贝到arr2数组.要求:数据空间是独立的
	    int[] arr1 = {10,20,30};
	    //创建一个新的数组arr2，开辟新的数据空间
	    //大小 arr1.length;
	    int arr2[] = new int[arr1.length];
	    for(int i = 1;i < arr1.length;i++){
	    	arr2[i]=arr1[i];
	    }
	    //修改 arr2,不会对arr1有影响.
	    arr2[0] = 100;
	    //输出arr1
	    System.out.println("====arr1的元素====");
	    for(int i = 0;i < arr1.length;i++){
	    System.out.println(arr1[i]);//10,20,30
	    }
	    //输出arr2
	    System.out.println("====arr2的元素====");
	    for(int i = 0;i < arr1.length;i++){
	    System.out.println(arr2[i]);//100,20,30
	    }
	    */

	    //数组反转
	    //要求:把数组的元素内容反转.
	    //arr{11,22,33,44,55,66}->{66,55,44,33,22,11}
	    //方法1:找规律反转
	    //1.把arr[0]和arr[5]进行交换 {66,22,33,44,55,11}
	    //2.把arr[1]和arr[4]进行交换 {66,55,33,44,22,11}
	    //3.把arr[2]和arr[3]进行交换 {66,55,44,33,22,11}
	    //4.一共交换3次 = arr.length/2
	    //5.每次交换时，对应的下标是arr[i]和arr[arr.length-1-i]
	    /*
	    int arr[] = {11,22,33,44,55,66};
	    int temp = 0;
	    int len = arr.length; 
	    for(int i = 0;i < len/2;i++){
	    	temp = arr[len-1-i];
	    	arr[len-1-i] = arr[i];
	    	arr[i] = temp;	    	
	    }
	    System.out.println("====反转后的数组====");
	    for(int i = 0;i < arr.length;i++){
	    	System.out.print(arr[i] + " ");
	    }
	    */
	    //放法2:使用逆序赋值方法
	    /*
	    int arr[] = {11,22,33,44,55,66};
	    int arr1[] = new int[arr.length];
	    for(int i = arr.length-1,j = 0;i >= 0;i--,j++){
	    	arr1[j]=arr[i];
	    }
	    arr = arr1;
	    for(int i = 0;i < arr.length;i++){
	    	System.out.print(arr[i] + " ");
	    }
	    */

	    //数组添加
	    //要求：实现动态的给数组添加元素效果，实现对数组扩容。
	    //1) 原始数组使用静态分配 int[] arr = {1,2,3} 
	    //2) 增加的元素4，直接放在数组的最后 arr = {1,2,3,4} 
	    //3) 用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n
	    /*
	    int arr[] = {1,2,3};
	    int arr1[] = new int[arr.length +1];
	    Scanner scanner = new Scanner(System.in);
	    for(int i = 0;i < arr.length;i++){
            arr1[i] = arr[i];
	    }
        arr1[arr.length] = 4;
        arr = arr1;
        System.out.println("====arr扩容后的效果====");
	    for(int i = 0;i < arr1.length;i++){
            System.out.print(arr[i] +"\t");
	    }
	    */

	    //难点！！！
	    //1.创建一个 Scanner 可以接受用户输入 
	    //2. 因为用户什么时候退出，不确定，老师使用 do-while + break 来控制
	    /*
	    int arr[] = {1,2,3};
	    Scanner scanner = new Scanner(System.in);
	    do{
	    int arr1[] = new int[arr.length +1]; //多次分配空间   
	    for(int i = 0;i < arr.length;i++){
            arr1[i] = arr[i];
	    }
	    System.out.println("请输入你要添加的元素:");
	    int addNum = scanner.nextInt();
        arr1[arr.length] = addNum;
        System.out.println("添加成功");
        arr = arr1;
        System.out.println("====arr扩容后的效果====");
	    for(int i = 0;i < arr1.length;i++){
            System.out.print(arr[i] +"\t");
	    }
	    //问用户是否继续
	    System.out.println("是否继续添加?y/n");
        char c = scanner.next().charAt(0);
        if(c == 'n'){
        	break;//强制退出循环
        }        
    }while(true);
	System.out.println("你退出了添加...");
	*/
	    //课后练习题
	    //有一个数组 {1， 2， 3， 4， 5}， 可以将该数组进行缩减，提示用户是否继续缩减，
	    //每次缩减最后那个元素。当只剩下最后一个元素，提示不能再缩减。
	    /*
	    int arr[] = {1,2,3,4,5};
	    Scanner scanner = new Scanner(System.in);
	    do{
	    	int arr1[] = new int[arr.length - 1];
	    	for(int i = 0;i < arr1.length;i++){
	    		arr1[i] = arr[i];
	    	}
	    	arr = arr1;
	    	System .out.println("====arr缩减效果====");
	    	for(int i = 0;i < arr1.length;i++){
	    		System .out.println(arr[i]);
	    	}	    	
	    	System .out.println("是否继续缩减y/n");
	    	char c = scanner.next().charAt(0);
	    	if(arr.length == 1 | c == 'n'){
	    		System .out.println("不能缩减");
	    		break;
	    	}
	    	System .out.println("缩减成功");
	    }while(true);
	    System .out.println("你已退出缩减元素的程序...");
	    */


	    //冒泡排序法案例
	    //将五个无序：24,69,80,57,13 使用冒泡排序法将其排成一个从小到大的有序数列。
	    //思路分析:
	    //数组{24,69,80,57,13}
	    //第1轮排序:目标把最大的数放在最后
	    //第1次排序:{24,69,80,57,13}
	    //第2次排序:{24,69,80,57,13}
	    //第3次排序:{24,69,57,80,13}
	    //第4次排序:{24,69,57,13,80}

	    //第2轮排序:目标把第二大的数放在倒数第二位置
	    //第1次排序:{24,69,57,13,80}
	    //第2次排序:{24,57,69,13,80}
	    //第3次排序:{24,57,13,69,80}

	    //第3轮排序:目标把第三大的数放在倒数第三位置
	    //第1次排序:{24,57,13,69,80}
	    //第2次排序:{24,13,57,69,80}

	    //第4轮排序:目标把第三大的数放在倒数第四位置
	    //第1次排序:{13,57,57,69,80}

	    //总结冒泡排序特点
	    /*
	    1.我们一共有5个元素
	    2.一共进行4轮排序，可以看成是外层循环.
	    3.每1轮排序可以确定一个数的位置，比如第1轮排序确定最大数，
	      第2轮排序，确定第二大的数位置，以此类推.
	    4.当进行比较时，如果前面的数大于后面的数，就交换
	    5.每轮比较在减少 4->3->2->1
	    */

	    //化繁为简，先死后活
	    /*
	    int arr[] = {24,69,80,57,13};
	    int temp = 0;//用于辅助交换的变量
	    for(int j =0;j < 4;j++){//4次比较
	    	//如果前面的数大于后面的数，就交换
	    	if(arr[j] > arr[j+1]){
	    	temp = arr[j];
	    	arr[j] = arr[j+1];
	    	arr[j+1] = temp;	
	    	}
	    }
	    System.out.println("==第1轮==");
	    for(int j = 0; j < arr.length;j++){
	    	System.out.print(arr[j] + "\t");
	    }
	    for(int j =0;j < 3;j++){//3次比较
	    	//如果前面的数大于后面的数，就交换
	    	if(arr[j] > arr[j+1]){
	    	temp = arr[j];
	    	arr[j] = arr[j+1];
	    	arr[j+1] = temp;	
	    	}
	    }
	    System.out.println("\n==第2轮==");
	    for(int j = 0; j < arr.length;j++){
	    	System.out.print(arr[j] + "\t");
	    }
	    for(int j =0;j < 2;j++){//2次比较
		//如果前面的数大于后面的数，就交换
		if(arr[j] > arr[j+1]){
		temp = arr[j];
		arr[j] = arr[j+1];
		arr[j+1] = temp;	
		}
	    }
	    System.out.println("\n==第3轮==");
	    for(int j = 0; j < arr.length;j++){
	    	System.out.print(arr[j] + "\t");
	    }
	    for(int j =0;j < 1;j++){//1次比较
		//如果前面的数大于后面的数，就交换
		if(arr[j] > arr[j+1]){
		temp = arr[j];
		arr[j] = arr[j+1];
		arr[j+1] = temp;	
		}
	    }
	    System.out.println("\n==第4轮==");
	    for(int j = 0; j < arr.length;j++){
	    	System.out.print(arr[j] + "\t");
	    }	
	    */	    
	    //将多轮排序使用外层循环包括起来(最终版)
	    /*
	    int arr[] = {24,69,80,57,13,-1,30,200,-110};
	    int temp = 0;//用于辅助交换的变量
	    int len = arr.length - 1;
	    for(int i = 0; i < len;i++){
	    for(int j =0;j < len - i;j++){//4次比较
	    	//如果前面的数大于后面的数，就交换
	    	if(arr[j] > arr[j+1]){
	    	temp = arr[j];
	    	arr[j] = arr[j+1];
	    	arr[j+1] = temp;	
	    	}
	    }
	    System.out.println("\n==第" + (i + 1) + "轮==");
	    for(int j = 0; j < arr.length;j++){
	    	System.out.print(arr[j] + "\t");
	    }
	    
	  }
	  */


	  //查找
	  /*
	  (1) 有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏：
	  从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】 
	  要求: 如果找到了，就提示找到，并给出下标值。

	  思路分析
	  1.定义一个字符串数组.
	  2.接收用户输入，遍历数组,逐一比较。如果有，则提示信息，并退出.
	  //定义字符串数组
	  String names[] = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("请输入一个名称:");
	  String findName = scanner.next();
	  int index = -1;
	  for(int i = 0;i < names.length;i++){
	  	//如果输入的名称就是当前元素
	  	if(findName.equals(names[i])){
	  		System.out.println("恭喜找到" + findName);
	  		System.out.println("下标=" + i);
	  		//把i 保存到index
	  		index = i;
	  		break;//退出
	  	}
	  }
	  //经典方法，如果索引没有发生改变，则没有找到.
	  if(index == -1){
	  	System.out.println("Sorry,没有找到" + findName);
	  }
	  */
	  //(2) 请对一个有序数组进行二分查找 {1,8, 10, 89, 1000, 1234} 
	  //输入一个数看看该数组是否存在此数，并且求出下标， 如果没有就提示"没有这个数"。

       

      //二维数组的使用
      //快速入门案例
      /*
        请用二维数组输出如下图形
	      0 0 0 0 0 0
	      0 0 1 0 0 0
	      0 2 0 3 0 0
	      0 0 0 0 0 0
      */
	      /*
	    //1.从定义形式上看 int[][]
	    //2.二维数组的每个元素是一维数组.
	    int[][] arr = {{0, 0, 0, 0, 0, 0},{0, 0, 1, 0, 0, 0},
	                  {0, 2, 0, 3, 0, 0},{0, 0, 0, 0, 0, 0}};
	    //关于二维数组的关键概念
	    //(1)
	    System.out.println("二维数组的元素个数=" + arr.length);
	    //(2)二维数组的每个元素是一维数组,所以如果需要得到每个一维数组的值还需要再次遍历.
	    //(3)访问第（i+1）个一维数组的第（j+1）个值,arr[i][j];    
	    //举例 访问3，它是第3个一维数组的第4个值，arr[2][3];       
	    //输出二维图形
	    //遍历二维数组的每个元素
	    //1.arr[i]表示二维数组的第i个元素.比如arr[0]表示二维数组的第一个元素.
	    //2.arr[i].length得到对应的每个一维数组的长度.
	    for(int i = 0;i < arr.length;i++){
	    	for(int j = 0;j < arr[i].length;j++){
	    	System.out.print(arr[i][j] + " ");
	       }
	       System.out.println();//换行
	    }
	    */
	    /*
	    //使用方式1
	    int arr[][] = new int[2][3];
	    //使用方式2
	    //int arr[][];
	    //arr[][] = new int[2][3];
	    
	    arr[1][1] = 8;
	    for(int i = 0;i < arr.length;i++){
	    	for(int j = 0;j < arr[i].length;j++){//对每个一维数组进行遍历
	    		System.out.print(arr[i][j]+" ");
	    	}
	    	System.out.println();//换行
	    }
	    */

	    //使用方式3:动态初始化-列数不确定
	    /*
        请用二维数组输出如下图形
	      1
	      2 2
	      3 3 3
	    */
        /*
		 //创建二维数组，一个有3个一维数组的二维数组，但是每个一维数组还没开数据空间
		  int arr[][] = new int[3][];
		  for(int i = 0;i < arr.length;i++){//遍历arr每个一维数组
		  	//给每个一维数组开空间
		  	//如果没有给一维数组new，那么arr[i]就是null.
		  	arr[i] = new int[i + 1];
		  	//遍历一维数组，并给一维数组的每个元素赋值
		  	for(int j = 0;j < arr[i].length;j++){
		  		arr[i][j]= i + 1;
		  	}
		  }
		  for(int i = 0;i < arr.length;i++){
		  	for(int j = 0;j < arr[i].length;j++){
		  		System.out.print(arr[i][j] + " ");
		  		}
		  		System.out.println();
		  	}
		  	*/

	     //二维数组的遍历
		 /* 	
		 //int arr[][]={{4,6},{1,4,5,7},{-2}}; 遍历该二维数组，并得到和
		  	int arr[][]={{4,6},{1,4,5,7},{-2}};
		  	int sum = 0;
		  	for(int i = 0;i < arr.length;i++){
		  	for(int j = 0;j < arr[i].length;j++){
		  		sum += arr[i][j];
		  	}
		  	}
		  	System.out.println("sum=" + sum);
		 */
		//二维数组的应用案例
		//打印10行的杨辉三角
	    /*
	       1
	       1 1
	       1 2 1
	       1 3 3 1
	       1 4 6 4 1
	       1 5 10 10 5 1
	       ...

	      提示:
	      1.第一行有1个元素，第n行有n个元素.
	      2.每一行的第一个元素和最后一个元素都是1.
	      3.从第三行开始，对于非第一个元素和最后一个元素的值.arr[i][j]
	        arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
	    */ 
	    /*  
	    int yanghui[][] = new int[10][];
	    for(int i = 0;i < yanghui.length;i++){//遍历yanghui的每个元素
	    	//给每个一维数组开空间
	    	yanghui[i]= new int[i+1];
	    	//给每个一维数组(行)赋值
	    	for(int j = 0;j < yanghui[i].length;j++){
	    		//每一行的第一个元素和最后一个元素都是1
	    		if(j == 0 | j == yanghui[i].length - 1){
	    			yanghui[i][j] = 1;
	    		}else{//中间的元素
	    			yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
	    		}
	    	}
	    }
	    for(int i = 0;i < yanghui.length;i++){
	    	for(int j = 0;j < yanghui[i].length;j++){
	    		System.out.print(yanghui[i][j] +" ");
	    	}
	    	System.out.println();
	    }
	    */

	    //二维数据练习
	    /*
	    //1.声明:int[] x,y[];以下选项允许通过编译的是(b,e);
	    //x[]是int类型的一维数组 y[][]是int类型的二维数组
	      (a) x[0] = y;//❌ int[][]->int[]
	      (b) y[0] = x;//✅ int[]—>int[]
	      (c) y[0][0] = x;//❌ int[]->int
	      (d) x[0][0] = y;//❌ x[]
	      (e) y[0][0] = x[0];//✅ int->int
	      (f) x = y;//❌ int[][]->int[]
	    */
	}  
}