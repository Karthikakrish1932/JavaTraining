class ArgsSumThree
{
  public static void main (String[]args)
  {
    int sum=0;
    for (int i =0; i<3; i++)
      {
	sum+=Integer.parseInt(args[i]);
      }
    System.out.print ("Average:"+sum/3);
       
}
}