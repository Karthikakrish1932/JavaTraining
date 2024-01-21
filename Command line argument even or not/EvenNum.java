class EvenNum
{
	public static void main(String[] args) 
        {
            int arrLength=args.length;
            for(int i=0;i<arrLength;i++)
            {
	    if(Integer.parseInt(args[i])%2==0)
	    System.out.println("Even");
	    else
	    System.out.println("Not even");
            }
	}
}
