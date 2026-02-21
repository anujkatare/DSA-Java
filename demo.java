import java.util.*;
public class demo{
    public static void main(String[] args) {
        Set <Integer> uniSet = new HashSet<>();
        ArrayList<Integer> interArray = new ArrayList<>();
        Integer arr1[] = {1,2,3,3,4,5};
        Integer arr2[] = {3,3,5,7,8};
        Integer n1 = arr1.length;
        Integer n2 = arr2.length;

        //union
        for(Integer i = 0; i < n1; i++){
           uniSet.add(arr1[i]);
        }
        for(Integer i = 0; i < n2; i++){
           uniSet.add(arr2[i]);
        }
       
        System.out.println("Union of both the Array is : " + uniSet);

        //intersection
        for(Integer i = 0; i < n1; i++){
            for(Integer j = 0; j < n2; j++){
                if(arr1[i] == arr2[j]){
                    interArray.add(arr1[i]);
                    break;
                }
            }
        }

        System.out.println("Intersection of both the Array is : " + interArray);
    }
}