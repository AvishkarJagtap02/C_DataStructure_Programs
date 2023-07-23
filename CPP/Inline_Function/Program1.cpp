//Inline Function - if any function have very small lines of code then compiler decides to not to push stackframes of that function

#include<iostream>
#define sum(x,y) x+y	//sum(x,y) is replaced by x+y
#define z 500	

int main() {
	int x = 10;
	int y = 30;

	std::cout<<sum(x,y)<<std::endl;
	std::cout<<z<<std::endl;
	return 0;
}

//Compiler Does not do the same in some cases like static , recursion,for loops,multiple variable declarations, large codes Inline Does not work

