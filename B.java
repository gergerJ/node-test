class B 
{
	void m1(){
		for(;;){ //while(true)
			System.out.println("гого");
		}
	}
	void m2(){
		for(int i=0; i<3; i++) 
			System.out.println("1"); 

		System.out.println("2");
	}
    void m3(){
		int i=0;
		for(; i<3; i++)
			System.out.println("i:"+i); 
	}
	public static void main(String[] args) 
	{
		B b = new B();
		//b.m1();
		//b.m2();
		b.m3();
	}
}
