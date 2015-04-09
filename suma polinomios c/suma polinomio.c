#include <stdio.h>
main()
{
	int a, b, c;
	
	int x, y, z;
	printf("ingresar los dos primeros coeficietes:");
	printf("\n");
	scanf("%d %d",& a,& b );
	printf("ingresar los otros dos coeficietes:");
	printf("\n");
	scanf("%d %d",& x,& y );
	c=a+x;
	z=b-y;
	
	printf("El resultado de la suma es %dx + %d\n",c,z);
	return 0;
}
