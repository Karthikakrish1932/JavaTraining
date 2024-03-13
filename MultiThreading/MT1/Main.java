class Multithreading extends Thread{
public void run(){
    for(int i=0;i<3;i++){
        System.out.println(i);
    }
}   
}

public class Main
{
public static void main(String[] args) {
for(int i=0;i<3;i++){
    Multithreading obj = new Multithreading();
    obj.start();
}	
}
}
