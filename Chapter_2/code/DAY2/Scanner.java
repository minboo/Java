import java.util.Scanner;

class ScannerTest{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("请输入你的工号：");
		int num = scan.nextInt();
		System.out.println("你的工号是"+num);
		
		System.out.print("请输入你的名字：");
		String name = scan.next();
		System.out.println("你的名字叫:"+name);
		
		System.out.print("请输入你的年龄：");
		int age = scan.nextInt();
		System.out.println("你的年龄是："+age+"岁");
		
		System.out.print("请输入你的体重(kg):");
		double weight = scan.nextDouble();
		System.out.println("你的体重为"+weight+"kg");
	}
}