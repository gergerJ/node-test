class C
{
	/*
	void m0(){
		for(int i=4; i>=0; i--)
			System.out.println("i: " + i);
	}
	void m00(){
		System.out.println("2^31-1: " + Integer.MAX_VALUE);
		System.out.println("-2^31: " + Integer.MIN_VALUE);
	}*/
	void m1(){ //1~100 ���� ����Ͻÿ�
		long sum = 0L;
		for(int i=0; i<=100; i++){
			sum += i;
		}
		System.out.println("sum: " + sum);
	}
	void m2(){ //1~100 Ȧ������ ����Ͻÿ�
		int sum = 0; 
		for(int i=1; i<=100; i+=2){ //int i=0; �̸� ¦������ ������
			sum += i;
		}
		System.out.println("Ȧ����: " + sum);
	}
	void m3(){ //1~100 ¦���հ� Ȧ������ ����Ͻÿ�
		int jjaxSum = 0; 
		int holSum = 0;
		for(int i=0; i<=100; i++){
			if(i%2==0) jjaxSum = jjaxSum+i;
			else holSum = holSum + i;
		}
		System.out.println("¦����: " + jjaxSum 
			+ ", Ȧ����: " + holSum + ", ����: "+(jjaxSum+holSum));
	}
	public static void main(String[] args) {
		C c = new C();
		//c.m0();
		//c.m00();
		//c.m1();
		//c.m2();
		c.m3();
	}
}
