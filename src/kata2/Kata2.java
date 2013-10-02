package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args)
    {
        
        HashMap<Integer, Integer> numbersList = new HashMap<>();
        int[] vector = { 1,7,2,4,6,3,2,8,0,1,1,1,5,8,9,0,3,5,7,7,9,8,8 };        
        int mostFrequentNumber = 0;
        int maxOccurrences = 1;
        
        for( Integer currentVectorValue : vector ){
            
            if( numbersList.containsKey( currentVectorValue ) )
            {
                
                int currentOccurrences = numbersList.get( currentVectorValue );
                numbersList.put( currentVectorValue, ++currentOccurrences );
                
                if( currentOccurrences >= maxOccurrences )
                {
                    mostFrequentNumber = currentVectorValue;
                    maxOccurrences = currentOccurrences;
                }
                
            }
            else
                numbersList.put( currentVectorValue, 1 );
           
        }
        
        System.out.println( "The most frequent number is: "+mostFrequentNumber );
        
    }
    
}
