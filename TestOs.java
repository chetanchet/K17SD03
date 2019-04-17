import java.util.*;
import java.lang.*;
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
		int i=0,bur=1,h=0,sum1=0,sum2=0,sum3=0,r=0;
		int g,k,n,s1,s2,s3,t;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Processes");
		n=sc.nextInt();
		
		int p[]=new int[n];
		int at[]=new int[n];
		int bt[]=new int[n];
		int tt[]=new int[n];
		int wt[]=new int[n];
		int ct[]=new int[n];
		boolean ps[]=new boolean[n];
		
		ArrayList ar=new ArrayList();
		ArrayList tempar1=new ArrayList();
		ArrayList tempar2=new ArrayList();
		ArrayList tempar3=new ArrayList();
		ArrayList btemp=new ArrayList();
		
		for(int ig=0;ig<n;ig++)
		{
			btemp.add(bt[ig]);
		}

		for(i=0;i<n;i++)
		{
			p[i]=i;
			System.out.println("enter the arrival time of process P"+(i+1)+" and it should not be zero");
			at[i]=sc.nextInt();
			if(at[i]<=0)
			{
				System.out.println("arrival time cannot be zero");
				System.exit(0);
			}
			System.out.println("enter the burst time of process P"+(i+1));
			bt[i]=sc.nextInt();
			ps[i]=false;
		}
		
		SJF o=new SJF();
		
		int sbt=o.comp(bt);
		
		for(t=1;t<=sbt;t++)
		{
			for(h=0;h<n;h++)
			{
				if(at[h]<=t)
				{
					if(ps[h]==false)
					{
						tempar1.add(p[h]);
						tempar2.add(bt[h]);
						ps[h]=true;
					}	
				}
			}
			tempar3.addAll(tempar2);
			Collections.sort(tempar2);
			for(int x=0;x<tempar1.size();x++)
			{
				int l=(int)tempar2.get(x);
				int gf=tempar3.indexOf(l);
				int gu=(int)tempar1.get(gf);
				ar.add(gu);
			}
			tempar1.clear();
			tempar2.clear();
			tempar3.clear();
		}
		
		g=(int)ar.get(0);
		ct[g]=at[g]+bt[g];
		bur=ct[g]+2;
		
		for(k=1;k<ar.size();k++)
		{
			g=(int)ar.get(k);
			bur=bur+bt[g];
			ct[g]=bur;
			bur=bur+2;
		}
		
		for(i=0;i<n;i++)
		{
			tt[i]=o.compute(ct[i],at[i]);
			wt[i]=o.compute(tt[i],bt[i]);
		}
		
		System.out.println("PRO\tAT\tBT\tCT\tTAT\tWT");
		for(int z=0;z<n;z++)
		{
			System.out.println("\nP"+(z+1)+"\t"+at[z]+"\t"+bt[z]+"\t"+ct[z]+"\t"+tt[z]+"\t"+wt[z]);
		}
		
		int ctt=o.comp(tt);
		double att=(double)((ctt/n)+(ctt%n));
		System.out.println("\nAverage Turn Around Time is = "+att);
		int cawt=o.comp(wt);
		double awt=(double)((cawt/n)+(cawt%n));
		System.out.println("Average Waiting Time is = "+awt);
		
	}
}