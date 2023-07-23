//Global variable Shadowing
#include<iostream>
int x = 10;
int main() {
	//int x = 10;
	std::cout<< x << std::endl; // 10
	{
		int x = 20;
		std::cout<< x << std:: endl;//20
		//std::cout<< ::x << std:: endl;//x has not been declared (Local variable Shadowing)
		x=30;
		std::cout<< x << std::endl;//30
	}
	std::cout<< x << std:: endl;//10
}
