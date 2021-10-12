class PrimeTest{
	
	public static void main(String[] args){
		
		boolean isFlag = true; //创建一个标志
		for(int i = 2; i < 100; i++){
			for(int j = 2; j <= Math.sqrt(i); j++){
				if(i%j == 0){
					isFlag = false;//标识i是否被j除尽，一旦除尽，修改其值
					break;
				}
			}
			//判断标志isFlag是否还是true
			if(isFlag == true){
				System.out.println(i);
				
			}
			//重置标志
			isFlag = true;
		}
	}
}