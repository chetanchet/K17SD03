#include<stdio.h>
main()
{
	int i,n,a[100];
	printf("enter the total number of cylinders\n");
	scanf("%d",&n);
	printf("enter the current position of the disk arm\n");
	scanf("%d",&a[0]);
	for(i=1;i<n;i++)
	{
		printf("enter the %d position of pending request\n",i);
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
		printf("%d\t",a[i]);
	}
}

