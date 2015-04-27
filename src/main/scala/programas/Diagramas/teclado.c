#include<stdio.h>

main(){

    int x=0,xx=0;
    int y=0,yy=0;
    int suma=0,suma2=0;



	printf("Ingrese el coeficiente 1\n");
	scanf("%d",&x);

	printf("Ingrese el coeficiente 2\n");
	scanf("%d",&xx);


	printf("\nIngrese el coeficiente 1\n");
	scanf("%d",&y);

	printf("Ingrese el coeficiente 2\n");
	scanf("%d",&yy);


	suma=suma+x+y;
	suma2=suma2+xx+yy;

	printf("\n%dx+%d\n+\n%dx+%d\n",x,xx,y,yy);
	printf("La suma es:\n");
	printf("%dx+%d\n",suma,suma2);
}
