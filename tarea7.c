#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[]) {

 int A1[50],A2[50],A3[50];
 int G_1,G_2;
 int mayor,DG,i;
 system("clear");
 printf("\n1er polinomio");
 printf("¿Que grado sera?\n");
 scanf("%d",&G_1);

 for(i=0;i<=G_1;i++){
 printf("Da coeficiente %d= ",i+1);
 scanf("%d",&A1[i]);
 }

 printf("\n2do polinomio");
 printf("\n¿Que grado sera?\n");
 scanf("%d",&G_2);
 for(i=0;i<=G_2;i++){
 printf("Da coeficiente %d= ",i+1);
 scanf("%d",&A2[i]);
 }

 if(G_2<G_1){
 DG = G_1 - G_2;
 mayor = G_1;
 for(i=0;i<DG;i++){
 A3[i]=A1[i];
 }
 for(i=DG;i<=G_1;i++){
 A3[i] = A1[i] + A2[i-DG];
 }
 }else if(G_1<G_2){
 DG = G_2 - G_1;
 mayor = G_2;
 for(i=0;i<DG;i++){
 A3[i]=A2[i];
 }
 for(i=DG;i<=G_2;i++){
 A3[i] = A1[i-DG] + A2[i];
 }

 }else{
 mayor = G_1;
 for(i=0;i<=G_1;i++){
 A3[i] = A1[i] + A2[i];
 }
 }

 printf("\nEl resultado es: ");
 for(i=0;i<mayor;i++){
 printf("%dx^%d + ",A3[i],mayor-i);
 }
 printf("%d",A3[mayor]);
 printf("\n");
 return 0;
}
