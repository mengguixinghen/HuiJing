//演示转义字符的使用
public class ChangeChar{
	public static void main(String[] args){
        // \t：一个制位表，实现对齐的功能
		System.out.println("北京\t天津\t上海");
        // \n:换行符
		System.out.println("jack\nsmith\nmary");
        //  \\:一个\
        System.out.println("HD:\\menggui\\HuiJing");
        // \\\\:两个\
        System.out.println("HD:\\\\menggui\\\\HuiJing");
        // \":一个“
        System.out.println("老韩说:\"要好好学习java\"");
        // \':一个‘
        System.out.println("老韩说:\'要好好学习java\'");
        // \r:一个回车
        //1.输出 韩顺平教育
        //2.\r表示回车 光标移到最前面 输出北京平教育
        System.out.println("韩顺平教育\r北京");
        //加上\n换行，就不会替换前两个字了
        System.out.println("韩顺平教育\r\n北京");

	}
}
