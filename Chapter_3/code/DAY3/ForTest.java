import java.util.Scanner;

public class ForTest{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�������һ������");
		int num1 = scan.nextInt();
		
		System.out.print("������ڶ�������");
		int num2 = scan.nextInt();
		
		//ȡ��������Сֵ
		int min = (num1 <= num2)?num1:num2;  
		//�������е���Сֵ����Ѱ�ҹ��������ҵ��ĵ�һ������������󹫱���
		for(int i = min; i > 0; i--){
			if(num1%i == 0 && num2%i == 0){
				System.out.println("���Լ��Ϊ��"+ i);
				break;
				//�ҵ�������ѭ��
			}
		}
		//�ҵ����ֵ
		int max = (num1 >= num2)?num1:num2;
		
		for(int i = max; i <= num1*num2; i++){
			if(i%num1 == 0 && i%num2 == 0){
				System.out.println("��С������Ϊ��" + i);
				break;
			}
		}
	}
	
}