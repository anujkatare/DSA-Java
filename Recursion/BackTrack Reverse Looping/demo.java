public class demo {
    public void f(int i){
     if(i > 3){
        return;
     };
     f(i+1);
     System.out.println(i);
    }

public void main(String[] args) {
    f(1);
}    
}
