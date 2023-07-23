#include<iostream>
int add(int x, int y) {		//Internally add(i,i)/add(add 2i)
	return x+y;
}
int add(int x,int y, int z) {	//Internally add(i,i)/(add 3i)
	return x+y+z;
}
int main() {
	std::cout<<add(10,20)<<std::endl;
	std::cout<<add(10,20,30)<<std::endl;
	return 0;
}

