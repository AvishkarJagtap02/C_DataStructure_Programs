#include<iostream>
class Demo {
	int x =10;
	static int y ;
	public:
	void fun() {
		int a = 10;
		static int b = 20;

		std::cout<<x<<std::endl;
		std::cout<<y<<std::endl;
		std::cout<<a<<std::endl;
		std::cout<<b<<std::endl;
	}
	static void gun() {
		int a = 10;
		static int b = 20;

		//std::cout<<x<<std::endl; error
		std::cout<<y<<std::endl;
		std::cout<<a<<std::endl;
		std::cout<<b<<std::endl;
	}
};

int Demo::y = 20;
int main() {
	Demo obj1; //object will be created on stack
	Demo *obj2 = new Demo(); //object will be created on heap

	obj1.fun();
	obj1.gun();

	obj2->fun();
	obj2->gun();
	
	return 0;
}

//output:
//10
//20
//10
//20
//20
//10
//20
//10
//20
//10
//20
//20
//10
//20

		
