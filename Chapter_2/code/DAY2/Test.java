class LogicTest{
	public static void main(String[] args){
			/* boolean x = true;
			boolean y = false;
			short z = 42;
			//if(y == true)
			if((z++ == 42)&&(y = true)) z++;
			if((x = false)||(++z == 45)) z++;
			System.out.println("z="+z); */
			
			//��һ��0~255���ڵ�������ʮ������
			int i1 = 60;
			int i2 = i1 & 15;//�õ�����λ 0011 1100&0000 1111-->0000 1100
			String j = (i2>9)? (char)(i2-10+'A')+"":i2 + "";
			int temp = i1>>>4;//�õ�����λ0011 1100>>>4-->0000 0011
			String k = (temp > 9)?(char)(temp-10+'A')+"":temp + "";
			System.out.println(k + "" + j);
	}
}