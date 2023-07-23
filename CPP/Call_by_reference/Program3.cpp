//compiler internally puts *y instead of &y 
#include<iostream>

int main() {
	int x = 10;

	int &y = x;
	int *ptr = &x;

	std::cout<< sizeof(x) <<std::endl;	//4
	std::cout<< sizeof(y) <<std::endl;	//4
	std::cout<< sizeof(ptr) <<std::endl;	//8
	return 0;
}


