class Runnable1 implements Runnable{
public void run(){
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getPriority());
try{
    Thread.sleep(1000);
}
catch(InterruptedException e){
}
}
}
public class Main {
public static void main(String[] args) {
for(int i=0;i<3;i++){
Thread t = new Thread(new Runnable1());
t.setName("MainThread "+i);
t.start();
}
}
}