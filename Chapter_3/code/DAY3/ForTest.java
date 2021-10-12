import java.util.Scanner;

public class ForTest{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("请输入第一个数：");
		int num1 = scan.nextInt();
		
		System.out.print("请输入第二个数：");
		int num2 = scan.nextInt();
		
		//取两个数最小值
		int min = (num1 <= num2)?num1:num2;  
		//从两数中的最小值往下寻找公倍数，找到的第一个公倍数即最大公倍数
		for(int i = min; i > 0; i--){
			if(num1%i == 0 && num2%i == 0){
				System.out.println("最大公约数为："+ i);
				break;
				//找到后即跳出循环
			}
		}
		//找到最大值
		int max = (num1 >= num2)?num1:num2;
		
		for(int i = max; i <= num1*num2; i++){
			if(i%num1 == 0 && i%num2 == 0){
				System.out.println("最小公倍数为：" + i);
				break;
			}
		}
	}
	
}