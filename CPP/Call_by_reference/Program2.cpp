//reference Variable
#include<iostream>

int main() {

	int x = 10;
	int &y = x;	//&y is the refrence variable which is the another variable of the x
	int *ptr = &x;

	std::cout<< x << std::endl; //10
	std::cout<< y << std::endl; //10
	std::cout<< ptr <<std::endl; //0x100
	
	std::cout<< &x << std::endl; //0x100
	std::cout<< &y << std::endl; //0x100	//it also has the same address as x but  internally it works as pointer
	std::cout<< &ptr <<std::endl; //0x200
}
