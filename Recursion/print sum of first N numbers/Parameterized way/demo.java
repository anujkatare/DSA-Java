import java.util.*;
public class demo {
    public void summation(int i, int x){
        if(i<1){
             System.out.println(x);
             return;
        }
        summation(i-1,x+i);
    }
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        summation(i,0);

    }
}
