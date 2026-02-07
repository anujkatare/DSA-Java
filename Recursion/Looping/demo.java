package Recursion.Looping;

public class demo {
    int count = 0;
    public void f1(){
        if(count == 6){
           return;
        }
        System.out.println("anuj");
        count++;
        f1();
    }
    public void main(String[] args) {
        f1();
    }
}
