class AsgMethod{
	public static void main(String args[])
	{
	double i,j,k,d;

	i=AsgMethod.circle(10);
	System.out.println(i);
	j=AsgMethod.cube(20);
	System.out.println(j);
	//k=AsgMethod.square(30);
	//System.out.println(k);
	//d=AsgMethod.highest(20,30,40);
	//System.out.println(d);	
	}
static double circle(double b)
{
	double res;
	res=3.14*b;
	return res;
}

static double cube(double n)
{
	double res1;
	res1=6*n*n;
	return res1;
}
/*static double square(double c)
{
	double res2;
	res2=c*c;
	return res2;
}
static int highest(int m,int n,int o)
{
	int s;
	if(m>n && m>0)
	{
	s = m;
	//System.out.println(m," is greatest");
	return m;
	}
	elseif(n>m && n>o)
	{
	s=n;
	//System.out.println(n, " is greatest");
	return n;
	}
	else{
	//System.out.println(o," is greatest");
	return o;
	}
}*/
}
