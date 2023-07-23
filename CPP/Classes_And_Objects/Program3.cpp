#include<iostream>

class Demo {

	int x = 10;
	static int y;	//static variables cannot be initialized inside class
	
	public:
	void fun() {
		std::cout<<x<<std::endl;
		std::cout<<y<<std::endl; //undefined reference to `main' collect2: error: ld returned 1 exit status
	}
};
