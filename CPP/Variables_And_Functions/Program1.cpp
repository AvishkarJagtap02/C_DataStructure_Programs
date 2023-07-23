//Variable Initialization

#include<iostream>

int main() {
	int x = 10;	//copy initialiization

	int y(20);	//direct initialization

	std::cout<<x<<std::endl;
	std::cout<<y<<std::endl;

	int z {30};	//Uniform Initializaton

	std::cout << z <<std::endl;
	return 0;
}

// New Variable initialization is only availaible with version 11 or above... To check - try compiling it with g++ -std=c++03 Program1.cpp
