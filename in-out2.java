class SJF
{
	int comp(int ef[])
	{
		int sum=0;
		for(int y=0;y<ef.length;y++)
		{
			sum+=ef[y];
		}
		return sum;
	}
	int compute(int a,int b)
	{
		return (a-b);
	}
}
class TestOs
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of processes");
		n=sc.nextInt();
		int at[]=new int[n];
		int bt[]=new int[n];
		boolean ps[]=new boolean[n];
		for(i=0;i<n;i++)
		{
			System.out.println("enter the arrival time of "+(i+1)+"th process and it should not be zero");
			at[i]=sc.nextInt();
			if(at[i]==0)
			{
				System.out.println("arrival time cannot be zero");
				System.exit(0);
			}
			System.out.println("enter the burst time of "+(i+1)+"th process");
			bt[i]=sc.nextInt();
			ps[i]=false;
		}
		
		for(k=1;k<ar.size();k++)
		{
			g=(int)ar.get(k);
			bur=bur+bt[g];
			ct[g]=bur;
		}
		
		for(i=0;i<n;i++)
		{
			tt[i]=o.compute(ct[i],at[i]);
			wt[i]=o.compute(tt[i],bt[i]);
		}
		
		double att=((o.comp(tt))/n);
		System.out.println("average turn around time is = "+att);
		double awt=((o.comp(wt))/n);
		System.out.println("average waiting time is = "+awt);
	}
}	