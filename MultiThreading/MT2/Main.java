class Multithreading extends Thread{
int threadNumber;
public Multithreading(int i)
{
threadNumber=i;
}
public void run(){
for(int i=0;i<3;i++){
        System.out.println(threadNumber+" "+i);
try{
Thread.sleep(1000);
}
catch(InterruptedException e){
        System.out.println("Interrupted");
}
}
}
}

public class Main
{
public static void main(String[] args) {
for(int i=0;i<3;i++){
    Multithreading obj = new Multithreading(i);
    obj.start();
}	
}
}
