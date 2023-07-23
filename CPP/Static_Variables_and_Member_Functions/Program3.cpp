#include<iostream>
class Demo {

	int x = 10;
	static int y ;
	 public:
	 	void disp() {
			std::cout<<x<<std::endl;
			std::cout<<y<<std::endl;
		}
		static void info() {
			//std::cout<<x<<std::endl;	//error (non static variable cannot be used in static member function)
			std::cout<<y<<std::endl;
		}

};
int Demo::y = 20;	//static variable initialization global
int main() {
	Demo obj;	
	obj.disp();	

	obj.info();	
	Demo::info();

	return 0;
}
//o/p:
//10
//20
//20
//20

