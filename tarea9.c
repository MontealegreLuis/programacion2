#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {

int num1, num2, dem1, dem2, num3, dem3, opc,opc2=1;

while(opc2==1){
system("clear");
printf("Dame la primera fraccion.");
printf("\nNumerador: ");
scanf("%d",&num1);
printf("Denominador: ");
scanf("%d",&dem1);
printf("\nDame la segunda fraccion.");
printf("\nNumerador: ");
scanf("%d",&num2);
printf("Denominador: ");
scanf("%d",&dem2);

num3 = num1 * dem2 + num2 * dem1;
dem3 = dem1 * dem2;

printf("\nEl resultado es: %d / %d \n",num3,dem3);
printf("\nSi desea otra fraccion teclee 1 de lo contrario pulse 0: ");
scanf("%d",&opc2);
printf("\n");
}
}

