package Demo;

class Demo2 
{
	int addElements(int[]a)
	{
		int sum=0;
		for(int b:a)
		{
			sum=sum+b;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int[] x={2,5,6,8,1,3,6};
		Demo2 d=new Demo2();
		int y=d.addElements(x);
	}
}

