#include <stdio.h>

int main(int argc, char *argv[]) {

	int polin[20];
	int polin2[20];
	int result[20];
	int exp[20];
	int exp2[20];
	int i, n, m, may=0;
	
	printf("Deme el numero de terminos del primer polinomio: ");
	  scanf("%d",&n);
		
	for(i=0; i<n; i++){
	    printf("\nDeme el coeficiente del termino %d: ", i);
		   scanf("%d",&polin[i]);
		printf("Deme el grado del termino %d: ", i);
		   scanf("%d",&exp[i]);
	}
	printf("\nDeme el numero de terminos del segundo polinomio:");
	scanf("%d",&m);
	
	for(i=0; i<m; i++){
		printf("\nDeme el coeficiente del termino %d: ", i);
		  scanf("%d",&polin2[i]);
		printf("Deme el grado del termino %d: ", i);
		  scanf("%d",&exp2[i]);
	}
	if(n>m){
		may=n;
	}else{
		may=m;
	}
	for(i=0; i<may; i++){
		if(exp[i]=exp2[i]){
			result[i]=polin[i]+polin2[i];
		}
		else{
			break;
		}
	}
	for(i=0; i<may; i++)
	   printf("\n%d", result[i]);	
	return 0;
}

