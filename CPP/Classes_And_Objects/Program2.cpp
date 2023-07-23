
#include<iostream>
class Demo {
	int x = 10;
	public:		// to avoid private acess error give public: to acess data members and functions of class by its object
	void fun() {
		std::cout<< x <<std::endl;
	}
};
			//A constructor is by default  Public
int main() {

	Demo obj;

	obj.fun();	
	return 0;
}
