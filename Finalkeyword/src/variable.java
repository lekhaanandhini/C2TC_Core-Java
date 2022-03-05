
final class variable {
    int speedlimit =90;
      final void update() {
    	  System.out.println("in update method ");
      }
      class variable1 extends variable{
    	  void update() {
        	  System.out.println("in update method ");
          }
      }
      public static void main() {
    	  variable obj=new variable();
    	  obj.update();
		
	}
}
