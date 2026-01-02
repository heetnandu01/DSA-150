//Repeated Number Finder :  

import java.util.HashSet;

public class unique {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,2};
        HashSet freq = new HashSet<>();
        for(int num:nums){
            if(freq.add(num) == false){
                System.out.println(num);
            }
        }
    }
}
