/*
 * Operator can be overloaded in three scenarios
 * 1)Using Friend Function
 * 2)Using Normal Function
 * 3)Using Member Function
 * */


//Using Freind Function
#include<iostream>
class Demo {
	int x = 10;
	int y = 20;
	public:
		Demo(int x,int y) {
		       this->x = x;
		       this->y = y;
		}
 	friend int operator*(const Demo& obj1,const Demo& obj2) {
		return obj1.x * obj2.y;
	}
};
int main() {
	Demo obj1(30,40);
	Demo obj2(50,60);

	std::cout << obj1 * obj2 << std::endl;
	return 0;
}
