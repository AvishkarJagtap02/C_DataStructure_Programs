#include<iostream>
class Demo {
	private:
		int x =10;
	public:
		int y= 20l;
	protected:		//protected is always acessible in child class only
		int z = 30;
};
int main() {
	Demo obj;
	std::cout<<obj.x<<obj.y<<obj.z<<std::endl;	//error : x is declared as private , z is declared as protected
}

