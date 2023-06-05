//第五章 数组、排序和查找作业
import java.util.Scanner;
public class Homework{
	public static void main(String[] args){
		/*
		1.下面数组定义正确的有( B、D )
		A.String strs[] = {'a','b','c'};//❌ char->String
		B.String[] strs = {"a","b","c"};//✅
		C.String[] strs = new String{"a","b","c"};//❌
		D.String strs[] = new String[]{"a","b","c"};//对!!!!!
		E.String[] strs = new String[3]{"a","b","c"};//❌
		
		//2.写出结果
		String foo = "blue";
		boolean[] bar = new boolean[2];
		if(bar[0]){//bar[0]默认false bar[0]默认false
			foo = "green";
		}
		System.out.println(foo);//blue
		
		//3.以下Java代码的输出结果为( )
		int num = 1;
		while(num < 10){
			System.out.println(num);
			if(num > 5){
				break;
			}
			num += 2;
		}//1 3 5 7 
		*/

        //4.已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序.
        //比如:[10,12,45,90],添加23后，数组为[10，12，23，45，90]
        /*
        	int arr[]={10,12,45,90};
        	do{
        	int arr1[] = new int[arr.length + 1];
        	Scanner scanner = new Scanner(System.in);
        	for(int i = 0;i < arr.length;i++){
        		arr1[i] = arr[i];
            }
            System.out.println("输入要求插入的一个元素:");
            int n = scanner.nextInt();
            arr1[arr.length] = n;//插入元素放到最后的位置
            int temp = arr1[0];
            arr = arr1;
            for(int j = 0; j < arr.length -1;j++){
            for(int i = 0;i < arr.length -1-j;i++){ //排序         	
            	if (arr[i] > arr[i+1]){
            		temp = arr[i+1];
            		arr[i+1] = arr[i];
            		arr[i] = temp;
            	}
            }
        }
             System.out.println("插入成功，展示效果:");
            for(int i = 0;i < arr.length;i++){        
            System.out.print(arr[i] + " ");
        }
            System.out.println("\n是否继续添加？y/n");
            char c = scanner.next().charAt(0);
            if(c == 'n'){
            	System.out.println("退出插入程序...");
            	break;
            }
        }while(true);
        */
        //老师讲解
        /*
           int[] arr = {10,12,45,90};
           int insertNum = 23;
           int index = -1;//index就是要插入的位置
           //遍历arr数组，如果发现insertNum <= arr[i],说明i就是要插入的位置
           //使用index 保留 index = i;
           //如果遍历完后，没有发现insertNum <= arr[i],说明index = arr.length
           //即添加到arr最后.
           for(int i = 0;i < arr.length;i++){
            if(insertNum <= arr[i]){
                index = i;
                break;//找到位置后就退出
            }
           }
           //判断index的值
           if(index == -1){//说明没有找到位置
            index= arr.length;
        }
        //System.out.println("index=" + index);
        //扩容
        //先创建一个新的数组，大小 arr.length +1
        int[] arrNew = new int[arr.length + 1];
        //将arr的元素拷贝到arrNew，并且要跳过index位置. 
        // 分析:
        // int[] arr = {10,12,45,90};
        // arrNew = {10,12, ,45,90};
        // arrNew = {10,12,23,45,90}
        //i控制arrNew的下标，j控制arr数组的下标
        for(int i = 0,j = 0;i < arrNew.length;i++){
            if(i != index){
                arrNew[i] = arr[j];
                j++;
            }else{//此时i的位置就是要插入的数
                arrNew[i] = insertNum;
            }
        }
        arr = arrNew;
        System.out.println("======插入后，arr数组的元素情况======");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        */

        //5.随机生成10个整数(1-100的范围)保存到数组，并倒序打印
        //  以及求平均值、最大值和最大值的下标，并查找里面是否有8.
        /*
        int arr[] = new int[10];
        for(int i = 0;i < arr.length;i++){
            arr[i] =(int)(Math.random()*100) + 1;//随机生成1-100的数
        }
        System.out.println("随机生成的十个整数:");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] +"\t");
        }
        System.out.println("\n倒序打印随机生成的十个整数:");
        for(int j = arr.length -1;j >= 0;j--){
            System.out.print(arr[j] + "\t");
        }
        //求平均值
        double sum = 0;;
        for(int i = 0;i < arr.length;i++){
            sum += arr[i];
        }
        System.out.println("\n平均值=" + sum/10);
        //最大值和最大值的下标
        int max = arr[0];
        int index = 0;
        for(int i = 1;i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("max=" + max);  
        System.out.println("最大值的下标=" + index);
        //查找是否含有8
        int find = 8;
        int d = -1;
        for(int i = 0;i < arr.length;i++){
        if(find == arr[i]){
            System.out.println("找到数" + find + " 下标=" + i);
            d = i;
            break;
        }

        if(d == -1){
            System.out.println("没有找到" + find);
            break;
        }
        }
        */

        //6.试写出以下代码的打印结果
        /* 
            char[] arr1 = {'a','z','b','c'};
            char[] arr2 = arr1;
            arr1[2] = '韩';
            for(int i = 0;i < arr2.length;i++){
            	System.out.println(arr1[i] + "," + arr2[i]);
            }//a,a z,z 韩,韩 c,c
        */

        //7.写出冒泡排序的代码
            
            //要求从小到大排序
            /*
            int arr[] = {10,30,20,-10,3};
            int temp = 0;
            for(int i = 0;i < arr.length-1;i++){
                for(int j = 0;j < arr.length-1-i;j++){
                    if(arr[j] > arr[j+1]){
                         temp = arr[j+1];
                         arr[j+1] = arr[j];
                         arr[j] = temp;
                    }
                }
            }         
            System.out.println("冒泡排序后:");
            for(int i = 0;i < arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            */
            //要求从小到大排序
            /*
            int arr[] = {10,30,20,-10,3};
            int temp = 0;
            for(int i = 0;i < arr.length-1;i++){
                for(int j = 0;j < arr.length-1-i;j++){
                    if(arr[j] < arr[j+1]){
                         temp = arr[j+1];
                         arr[j+1] = arr[j];
                         arr[j] = temp;
                    }
                }
            }         
            System.out.println("冒泡排序后:");
            for(int i = 0;i < arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            */
	}
}