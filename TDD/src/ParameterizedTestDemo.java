import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
     /*@ParameterizedTest
     @ValueSource(ints = {1,2,3} )
     void withValueSource(int number) {
    	 assertNotNull(number);
    	 
     }*/
     
    /* @ParameterizedTest
     @ValueSource(ints = {1,2,3} )
     void withValueSource1(String number) {
    	 assertNotNull(number); 
     }*/
     
     @ParameterizedTest
     @ValueSource(strings = {"1","2","Three","4","Five"} )
     void withValueSource2(int number) {
    	 assertNotNull(number);
    	 
     }
     /*@ParameterizedTest
     @ValueSource(strings = {"1","2","Three","4","Five"} )
     void withValueSource2(int number) {
    	 assertNotNull(number);
    	 
     }*/
}
