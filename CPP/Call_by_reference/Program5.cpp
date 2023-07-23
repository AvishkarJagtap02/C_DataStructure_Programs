//call by reference

#include<iostream>

void fun(int &ref1, int &ref2) {
	
	int temp = ref1;
	ref1 = ref2 ;
	ref2 = temp;
	std::cout<<ref1<<" "<<ref2<<std::endl; //20 10
}
int main()  {
	int x = 10;
	int y = 20;

	std::cout<< x <<" "<< y << std::endl;	//10 20
        fun(x,y);
	std::cout<< x <<" "<< y << std::endl;	//20 10
	return 0;
}
