#include<iostream>
int main() {
	
	int x = 10;
	int y = 20.5f;
	std::cout<< x <<std::endl;
	int a {10};
	int b {10.5f};	//error: narrowing conversion of 1.05 + 1f from float to int
	
	std::cout<< a <<std::endl;
	return 0;
}
