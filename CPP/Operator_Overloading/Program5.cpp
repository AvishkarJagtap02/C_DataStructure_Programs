
/*
 * Operator can be overloaded in three scenarios
 * 1)Using Friend Function
 * 2)Using Normal Function
 * 3)Using Member Function
 * */

//Using Member Function
#include<iostream>
class Demo {
	int x = 10;
	public:
		Demo(int x) {
		       this->x = x;
		}
	int operator+(const Demo& obj2) {
		return this->x + obj2.x;
	}
};
int main() {
	Demo obj1(30);
	Demo obj2(40);

	std::cout << obj1 + obj2 << std::endl;
	return 0;
}
