class A 
{
	void m1(){ //신사 
		int i=0; //초기식 
		while(i<5){ //조건식
			System.out.println("i: " + i);
			i=i+1; //i+=1; i++; 증감식
		}
	}
	void m2(){ //조폭 
		int i=0; //초기식
		do{
			System.out.println("i: " + i);
			i++; //증감식 
		}while(i<5);
	}
	void m3(){ //신사
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