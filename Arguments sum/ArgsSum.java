class ArgsSum
{
  public static void main (String[]args)
  {
    int sum=0;
    int argsLength=args.length;
    for (int i =0; i<args.length; i++)
      {
	sum+=Integer.parseInt(args[i]);
      }
		System.out.print (sum);
       
}
}
