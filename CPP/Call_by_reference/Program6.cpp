#include<iostream>
int& fun(int x) {
	
	int &y = x;
	return y;

}
int main() {
	int a = 50;
	int ret = fun(a);
	std::cout<< ret << std::endl; //50
	return 0;
}
