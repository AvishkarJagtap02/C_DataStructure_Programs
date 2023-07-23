//copy constructor is by default available in cpp
#include<iostream>
class Demo {
	public:
		Demo() {
			std::cout<<"No Arg Constructor"<<std::endl;
		}
		Demo(int x) {
			std::cout<<"Para Constructor"<<std::endl;
			std::cout<<x<<std::endl;
		}
		Demo(Demo& xyz) {
			std::cout<<"In Copy Constructor"<<std::endl;
		}
};
int main() {
	Demo obj1;	//No Arg
	Demo obj3(10);	//Para
	Demo obj2(obj1);//copy
	Demo obj4= obj1;//copy
}
