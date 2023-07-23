#include<iostream>
class Demo {
	public:
		Demo(){
			std::cout<<"In Constructor"<<std::endl;
		}
};
int main() {
	int x = 10;
	std::cout<<x<<std::endl;
	//operator<<(cout,x); => function call
	//prototype
	//ostream& operator<<(ostream& , int); => Predefined
	Demo obj;
	//std::cout<<obj<<std::endl;  //error No match for fun(ostream&,Demo)
	//
	//operator<<(cout,obj);
	//prototype
	//ostream& operator<<(ostream&,Demo&)   => Not Predefined
	return 0; 
}

