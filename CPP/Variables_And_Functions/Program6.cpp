//constant In CPP

#include<iostream>
int main() {
	
	int y=20;
	int x =10;
	[[maybe_unused]]int z=10;

	std::cout<< x <<std::endl;//10
	std::cout<< y <<std::endl;//20
	
	//const int *ptr = &x;	//data is Constant
	const int *const ptr = &x;	//data and ptr is constant
	std::cout<< *ptr << std::endl;//10
	
	//*ptr = &y; error: read only variable
	std::cout<< *ptr << std::endl; //10
	return 0;
}
