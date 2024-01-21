class Arravg{
public static void main(String[] args)
{
int arrLength=args.length;
int arrTotal=0;
for(int i=0;i<arrLength;i++)
{
arrTotal+=Integer.parseInt(args[i]);
}
System.out.print("Average:"+arrTotal/arrLength);
}
}

