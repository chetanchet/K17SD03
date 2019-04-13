#include<stdio.h>
main()
{
	int i,n,a[5000],sum=0,diff=0;
	int fun(int f);
	printf("enter the total number of cylinders\n");
	scanf("%d",&n);
	printf("enter the current position of the disk arm\n");
	scanf("%d",&a[0]);
	for(i=1;i<n;i++)
	{
		printf("enter the %d position of pending request\n",i);
		scanf("%d",&a[i]);
	}
	printf("\nThe pending request queue is: \n");
	for(i=0;i<n;i++)
	{
		printf("%d\t",a[i]);
	}
		for(i=1;i<n;i++)
	{
		diff=a[i]-a[i-1];
		sum=sum+fun(diff);
	}
	printf("\n\nThe distance is: %d",sum);
}
int fun(int f)
{
	if(f>=0)
	{
		return f;
	}
	else
	{
		return (-f);
	}
}
