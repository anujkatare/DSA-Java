public class demo {
    int count = 5;
    public void f1(){
        if(count == -1){
           return;
        }
        System.out.println(count);
        count--;
        f1();
    }
    public void main(String[] args) {
        f1();
    }
}
