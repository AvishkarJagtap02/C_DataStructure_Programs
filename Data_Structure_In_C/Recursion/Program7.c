//o/p: 
#include<stdio.h>
int x = 5;
void fun(int x) {
	printf("Hello\n");
	if(x!=1) {
		fun(--x);
	}
	printf("Bye\n");
}
void main() {	
	fun(x);
}	
