#include<stdio.h>
#include<stdlib.h>

 int main(int argc, char *argv[]) {
 int a,b,c,d;
 int sumaa=0, sumab=0;
 system("clear");
 printf("Da los 2 coeficintes del 1er polinomio: "); 
 scanf("%d %d",&a, &b);
 printf("\nDa los 2 coeficintes del 2er polinomio: "); 
 scanf("%d %d",&c, &d);
 sumaa=a+c;
 sumab=b+d;
 printf("\nRespuesta= %dx + %d \n",sumaa, sumab);
 return 0;
}
