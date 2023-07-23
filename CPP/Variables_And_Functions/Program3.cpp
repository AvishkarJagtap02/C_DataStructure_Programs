//Variable Shadowing
// 1) Local Variable Shadowing
// 2) Global Variable Shadowing

#include<iostream>
//Local Variable Scope
int main() {
	int x = 10;
	{
		int x = 20;
		std::cout<< x <<std::endl; //20
		x=30;
	}
	std::cout<< x << std::endl; // 10
}
