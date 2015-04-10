#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {

int num1, num2, dem1, dem2, num3, dem3, opc;
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

printf("\n1 - suma\n2 - resta\n3 - multiplicacion\n4 - division\nQue operacion deseas hacer? ");
scanf("%d", &opc);
if(opc==1){
num3 = num1 * dem2 + num2 * dem1;
dem3 = dem1 * dem2;
}
if(opc==2){
num3 = num1 * dem2 - num2 * dem1;
dem3 = dem1 * dem2;
}
if(opc==3){
dem3 = dem1 * dem2;
num3 = num1 * num2;
}
if(opc==4){
dem3 = dem1 * num2;
num3 = num1 * dem2;
}
printf("El resultado de la  es: %d / %d \n",num3,dem3);

}

