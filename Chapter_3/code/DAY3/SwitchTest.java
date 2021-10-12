import java.util.Scanner;

public class SwitchTest{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);//实例化Scanner
		
		String word = scan.next(); //使用Scanner的一个方法
		
		char c1 = word.charAt(0);  //
		switch(c1)
		{
			case 'a': System.out.println("A");
				break;
			case 'b': System.out.println("B");
				break;
			case 'c': System.out.println("C");
				break;
			default :System.out.println("输入错误");
		}
	}
}