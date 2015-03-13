 #include<stdio.h>

main(){

	int A1[7],A2[7],G1,G2,i,A3[7],mayor,DG;
	
	printf("Polinomio 1 De que grado es ?\n");
	scanf("%d",&G1);

	printf("Ingresa coeficientes\n");
	
	for(i=0;i<=G1;i++){
		printf("Ingresa Coeficiente %d \n",i+1);
		scanf("%d",&A1[i]);
	}

	printf("Polinomio 2 De que grado es ?\n");
	scanf("%d",&G2);

	printf("Ingresa coeficientes\n");
	
	for(i=0;i<=G2;i++){
		printf("Ingresa Coeficiente %d \n",i+1);
		scanf("%d",&A2[i]);
	}

	if(G2<G1){
		DG = G1 - G2;
		mayor = G1;
		for(i=0;i<DG;i++){		
			A3[i]=A1[i];
		}
		for(i=DG;i<=G1;i++){
		   A3[i] = A1[i] + A2[i-DG];
		}
	}else if(G1<G2){
		DG = G2 - G1;
		mayor = G2;
		for(i=0;i<DG;i++){		
			A3[i]=A2[i];
		}
		for(i=DG;i<=G2;i++){
		   A3[i] = A1[i-DG] + A2[i];
		}
	
	}else{
		mayor = G1;
		for(i=0;i<=G1;i++){
			A3[i] = A1[i] + A2[i];
		}
	}

	printf("Resultado:\n");
	for(i=0;i<mayor;i++){
		printf("%dx^%d + ",A3[i],mayor-i);
	}
	printf("%d",A3[mayor]);

}
