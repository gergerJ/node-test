class A 
{
	void m1(){ //�Ż� 
		int i=0; //�ʱ�� 
		while(i<5){ //���ǽ�
			System.out.println("i: " + i);
			i=i+1; //i+=1; i++; ������
		}
	}
	void m2(){ //���� 
		int i=0; //�ʱ��
		do{
			System.out.println("i: " + i);
			i++; //������ 
		}while(i<5);
	}
	void m3(){ //�Ż�
		for(int i=0; i<5; i++){
			System.out.println("i: " + i);
		}
	}
	public static void main(String[] args){
		A a = new A();
		//a.m1();
		//a.m2();
		a.m3();
	}
}