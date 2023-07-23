//Constructor
//    ||
// 1)No Argument Constructors
// 2)Parameterized constructors
// 3)Copy Constructors

#include<iostream> 
class Demo {
	public:
	Demo() {				//No Argument Constructor
		std::cout<< "In Constructor" << std::endl;
		std::cout<< this << std::endl;	//this and obj have same address
	}
};
int main()  {
	Demo obj;
	std::cout<<&obj<<std::endl;
	return 0;
}
		
