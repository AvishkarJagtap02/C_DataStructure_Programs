#include<iostream> 

void fun(int x, int y) {	//fun(i,i) 
	std::cout<< x << y << std::endl;
}

void fun(int x, float y) {	//fun(i,f)
	std::cout<< x << y <<std::endl;
}
void fun(float x, float y) {	//fun(f,f)
	std::cout << x << y <<std::endl;
}

int main() {
	fun(10,20);	//10 20
	fun(10,20.5f);	//10 20.5
	fun(10.5f,20.5f);//10.5 20.5
	fun(10.5,20.5);	//error Double cannot be converted into float
	//exact match or half match or no match  
	return 0;
}	
