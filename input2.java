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
	}
}	