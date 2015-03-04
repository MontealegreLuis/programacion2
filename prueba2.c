#include <stdio.h>
#include <math.h>

int main(){
	int x1, x2, y1, y2;
	int z1, z2;
	printf("primer polinomio: da las dos constantes:");
	scanf("%i %i", &x1, &x2);
	printf("segundo polinomio: da las dos constantes:");
	scanf("%i %i", &y1, &y2);
	z1=x1+y1;
	z2=x2+y2;
	printf("  %ix+%i\n", x1, x2);
	printf("+ %ix+%i\n", y1, y2);
	printf("------\n");
	printf("+ %ix+%i\n", z1, z2);
	return 0;
}
