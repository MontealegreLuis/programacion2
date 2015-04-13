#include <stdio.h>

int main(int argc, char *argv[]) {
	
	int a1[50],a2[50],a3[50];
	int g1,g2;
	int mayor,difg,i;
	
	printf("= Polinomio 1 =\n\tDe que grado es? = ");
	scanf("%d",&g1);
	printf("\t Ingresa los coeficientes:\n");
	for(i=0;i<=g1;i++){
		printf("\t\t [%d] : ",i+1);
		scanf("%d",&a1[i]);
	}
	
	printf("= Polinomio 2 =\n\tDe que grado es? = ");
	scanf("%d",&g2);
	printf("\t Ingresa los coeficientes:\n");;
	for(i=0;i<=g2;i++){
		printf("\t\t [%d] : ",i+1);
		scanf("%d",&a2[i]);
	}
	
	if(g2<g1){
		difg= g1 - g2;
		mayor = g1;
		for(i=0;i<difg;i++){		
			a3[i]=a1[i];
		}
		for(i=difg;i<=g1;i++){
			a3[i] = a1[i] + a2[i-difg];
		}
	}else if(g1<g2){
		difg = g2 - g1;
		mayor = g2;
		for(i=0;i<difg;i++){		
			a3[i]=a2[i];
		}
		for(i=difg;i<=g2;i++){
			a3[i] = a1[i-difg] + a2[i];
		}
		
	}else{
		mayor = g1;
		for(i=0;i<=g1;i++){
			a3[i] = a1[i] + a2[i];
		}
	}
	
	printf("El resultado es: ");
	for(i=0;i<mayor;i++){
		printf("%dx^%d + ",a3[i],mayor-i);
	}
	printf("%d",a3[mayor]);

	return 0;
}

