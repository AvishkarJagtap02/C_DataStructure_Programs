#include<iostream>
class Player {
	int jerNo = 18;
	std::string name = "Kohli";

	public:
	void info() {
		std::cout<<jerNo<<"="<<name<<std::endl;
	}
};
int main() {
	Player vk;
	vk.info();
}
	
