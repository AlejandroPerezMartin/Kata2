package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        
        int[] vector = {1,7,2,4,6,3,2,8,0,1,1,1,5,8,9,0,3,5,7,7,9};
        
        HashMap<Integer, Integer> list = new HashMap<>();
        
        for( Integer currentValue : vector ){
            
            if( list.containsKey( currentValue ) ){
                int occurrences = list.get( currentValue );
                list.put( currentValue, ++occurrences );
            }
            else{
                list.put( currentValue, 1 );
            }
           
        }
        
        System.out.println( list );
        
    }
    
}
