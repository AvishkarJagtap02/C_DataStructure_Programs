#include<iostream>

class Demo {
	int x = 10;
	int y = 20;

	public:
	Demo() {	//by default constructor are public but if we declare in class then we have to make it public
		std::cout<<"In Constructor"<<std::endl;
	}
	void fun() {
		std::cout<<x<<std::endl;
		std::cout<<y<<std::endl;
	}
};
int main() {
	Demo obj;	//Object will be made on stack
	obj.fun();
	return 0;
}
