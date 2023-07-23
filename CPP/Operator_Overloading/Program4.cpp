/*
 * Operator can be overloaded in three scenarios
 * 1)Using Friend Function
 * 2)Using Normal Function
 * 3)Using Member Function
 * */

//Using Normal Function
#include<iostream>
class Demo {
	int x = 10;
	public:
		Demo(int x) {
		       this->x = x;
		}
 		int getData()const {
			return x;
		}
};
int operator+(const Demo& obj1,const Demo& obj2) {
	return obj1.getData() + obj2.getData();
}
int main() {
	Demo obj1(30);
	Demo obj2(40);

	std::cout << obj1 + obj2 << std::endl;
	return 0;
}
