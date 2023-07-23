//class is Like Structure in C but in structures of cpp we can initialize values declare functions into the structure
#include<iostream>
class Player {

	int jerNo = 18;
	std::string name = "Virat Kohali";
	public:
	void disp() {
		std::cout<< jerNo << std::endl;
		std::cout<< name << std::endl;
	}
};

int main() {

	Player obj;
	//std::cout<< obj.jerNo << std::endl;	data members and member functions in class are private .. to acess those we need to give public:
	//std::cout<< obj.name << std::endl;	or to acess the variables from outside the class we can take help of public method in class

	obj.disp();
	return 0;
}

