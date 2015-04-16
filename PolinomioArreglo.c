#include <stdio.h>

int main(int argc, char *argv[]) {
	
	int P1[50],P2[50],P3[50];
	int Grado_1,Grado_2;
	int mayor,DG,i;
	
	printf("= Polinomio 1 =\n\tDe que grado es? = ");
	scanf("%d",&Grado_1);
	printf("\t Ingresa los coeficientes:\n");
	for(i=0;i<=Grado_1;i++){
		printf("\t\t [%d] : ",i+1);
		scanf("%d",&P1[i]);
	}
	
	printf("= Polinomio 2 =\n\tDe que grado es? = ");
	scanf("%d",&Grado_2);
	printf("\t Ingresa los coeficientes:\n");;
	for(i=0;i<=Grado_2;i++){
		printf("\t\t [%d] : ",i+1);
		scanf("%d",&P2[i]);
	}
	
	if(Grado_2<Grado_1){
		DG = Grado_1 - Grado_2;
		mayor = Grado_1;
		for(i=0;i<DG;i++){		
			P3[i]=P1[i];
		}
		for(i=DG;i<=Grado_1;i++){
			P3[i] = P1[i] + P2[i-DG];
		}
	}else if(Grado_1<Grado_2){
		DG = Grado_2 - Grado_1;
		mayor = Grado_2;
		for(i=0;i<DG;i++){		
			P3[i]=P2[i];
		}
		for(i=DG;i<=Grado_2;i++){
			P3[i] = P1[i-DG] + P2[i];
		}
		
	}else{
		mayor = Grado_1;
		for(i=0;i<=Grado_1;i++){
			P3[i] = P1[i] + P2[i];
		}
	}
	
	printf("El resultado es: ");
	for(i=0;i<mayor;i++){
		printf("%dx^%d + ",P3[i],mayor-i);
	}
	printf("%d",P3[mayor]);

	return 0;
}
