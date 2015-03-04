#include <stdio.h>

int main(int argc, char *argv[]) {
	
	
	
	int c[4]={2,5,3,-2};
	
	int e=1;
	int suma1;
	int suma;
	
	
	
	printf("%dx^%d + %d \n", c[0],e,c[1] );
	printf("+\n");	printf("%dx^%d  %d \n", c[2],e,c[3] );
	printf("____________\n");
	
	suma = c[0]+c[2];
	suma1= c[1]+c[3];	
printf("%dx^%d  + %d ",suma,e,suma1);
	
	return 0;
}

