#include <stdio.h>
int main(int argc, char *argv[]) {
	int x, t; 
	int x1, t1;
	int sumax, sumat;
		printf("= = Programa que suma dos polinomios = =\n\n");
		printf("Ingrese coeficientes del primer polinomio:\n");
		scanf("%d", &x);
		scanf("%d", &t);
		printf("\n\tSu polinomio es: %dx + %d ",x,t);
		printf("\n\nIngrese coeficientes del segundo polinomio:\n");
		scanf("%d", &x1);
		scanf("%d", &t1);
		printf("\n\tSu polinomio es: %dx + %d ",x1,t1);
		sumax=x+x1;
		sumat=t+t1;
		printf("\n\nLa suma de ambos polinomios es: %dx + %d",sumax,sumat);
	return 0;
}
