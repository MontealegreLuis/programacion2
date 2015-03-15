#include <stdio.h>

int main(int argc, char *argv[]) {
	
	int c [2];
	int e [2];
	int c1 [2];	int e1 [2];
	int suma=0;
	int i;
	int j;
	int suma2;
	
	printf("deme el primer polinomio:\n");
	for (i=0;i<2;i++)
	{
		
		printf("deme el coeficiente:%d\n",i+1);		scanf("%d",&c[i]);	printf("deme el exponente:%d\n",i+1);	scanf("%d",&e[i]);
	
	
	
    }
	printf("deme el segundo polinomio\n");
	for (j=0;j<2;j++)	{
		printf("deme el coeficiente:%d \n",j+1);		scanf("%d",&c1[j]);		
		
		printf("deme el exponente:%d\n",j+1);		scanf("%d",&e1[j]);		
		
	}
	
	if ( e[0]== e1[0])
	{
		suma= c1[0]+ c[0];
	}
	
	if ( e[1] == e1[1])	{		suma2= c1[1]+ c[1];	}
	
	
	printf("%dx*%d + %d",suma,e[0],suma2);
	
	return 0;
}

