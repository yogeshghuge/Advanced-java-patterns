/*
A
bA
CbA
dCbA
EdCbA
dCbA
CbA
bA
A
*/

class alP10
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n)
			{
				for(int j=i; j>=1; j--)
					if(j%2!=0)
					 	System.out.print((char)(j+64));
					else
						System.out.print((char)(j+96));
			}
			else
			{
				for(int j=(n*2)-i;j>=1;j--)
					if(j%2!=0)
						System.out.print((char)(j+64));
					else
						System.out.print((char)(j+96));
			}
			System.out.println();
		}
	}
}