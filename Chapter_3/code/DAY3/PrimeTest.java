class PrimeTest{
	
	public static void main(String[] args){
		
		boolean isFlag = true; //����һ����־
		for(int i = 2; i < 100; i++){
			for(int j = 2; j <= Math.sqrt(i); j++){
				if(i%j == 0){
					isFlag = false;//��ʶi�Ƿ�j������һ���������޸���ֵ
					break;
				}
			}
			//�жϱ�־isFlag�Ƿ���true
			if(isFlag == true){
				System.out.println(i);
				
			}
			//���ñ�־
			isFlag = true;
		}
	}
}