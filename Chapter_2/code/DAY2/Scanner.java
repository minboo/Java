import java.util.Scanner;

class ScannerTest{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��������Ĺ��ţ�");
		int num = scan.nextInt();
		System.out.println("��Ĺ�����"+num);
		
		System.out.print("������������֣�");
		String name = scan.next();
		System.out.println("������ֽ�:"+name);
		
		System.out.print("������������䣺");
		int age = scan.nextInt();
		System.out.println("��������ǣ�"+age+"��");
		
		System.out.print("�������������(kg):");
		double weight = scan.nextDouble();
		System.out.println("�������Ϊ"+weight+"kg");
	}
}