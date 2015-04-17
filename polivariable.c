#include <stdio.h>
int main(int argc, char *argv[]) {
	int A, B; 
	int A2, B2;
	int sumaA, sumaB;
		printf("= = PROGRAMA QUE SUMA DOS POLINOMIOS = =\n\n");
		printf("ESCRIBA COEFICIENTES DEL PRIMER POLINOMIO:\n");
		scanf("%d", &A);
		scanf("%d", &B);
		printf("\n\t EL RESULTADO ES: %dx + %d ",A,B);
		printf("\n\n ESCRIBA COEFICIENTES DEL SEGUNDO POLINOMIO:\n");
		scanf("%d", &A2);
		scanf("%d", &B2);
		printf("\n\t SU POLINOMIO ES: %dx + %d ",A2,B2);
		sumaA=A+A2;
		sumaB=B+B2;
		printf("\n\n LA SUMA DE LOS POLINOMIOS ES: %dx + %d",sumaA,sumaB);
	return 0;
}