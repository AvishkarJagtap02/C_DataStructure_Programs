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
};
int main() {
	Demo obj;	// calls No Arg Constructor
	Demo *obj2 = new Demo(); // calls No Args Constructor
	//Demo obj2{};	//calls to No Arg Constructor
	//Demo obj1();	//This is Declaration of function
	Demo obj3(10);	//para Constructor
	Demo *obj4 = new Demo(20); // para constructor
				  // 20
	return 0;
}
