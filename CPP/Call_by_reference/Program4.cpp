#include<iostream>

int main() {

	int x = 10;
	int y = 20;
	int &ref = x;

	std::cout<< ref <<std::endl; //10
	ref =  y;
	std::cout<< ref <<std::endl; //20
	std::cout<< x <<std::endl; //20
	return 0;
}
	
