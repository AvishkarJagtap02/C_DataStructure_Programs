// Reference Variable ---> Just A Another Name To a Variable And Can be used to pass as parameter to the function

#include<iostream>
int main() {
	
	int x = 10;
	int &y = x;	//Reference Variable
	
	std::cout<< x <<std::endl; //10
	std::cout<< y <<std::endl; //10
	std::cout<< &x <<std::endl; //address
	std::cout<< &y <<std::endl; //same address

	//Reference Variable Should be cumpulsory initialized
}



