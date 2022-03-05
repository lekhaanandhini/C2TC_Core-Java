

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class Assertdemo {
	
	@Test
	public void simple() {
	      int A =1;
	      int B =2;
	      assertEquals(A,B);
	     assertEquals(A,B); //f
      }
    @Test
    public void simple1() {
          int A =1;
          int B =1;
          assertEquals(A,B); //T
        }
  
   @Test
   public void simple2() {
         int A =1;
         int B =1;
         assertEquals(A,B); //T
       }
}
