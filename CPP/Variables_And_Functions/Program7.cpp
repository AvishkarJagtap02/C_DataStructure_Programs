//Inline Function in CPP == > iif function is very small compiler dosent push its stackframe

#include<iostream>
#define sum(x,y) x+y	//works like macro which puts x+y in the place of sum(x,y)
int main() {
	int x =10;
	int y = 30;

	std::cout<<sum(x,y)<<std::endl;
	std::cout<< y <<std::endl;
	return 0;
}

//To verify compile it with g++ -E Program7.cpp > out.txt and see the last few lines
//Inline Not works In these conditions : static , Recursion , For , multiple variable declarations,big code
