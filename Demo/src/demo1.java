import java.util.*;

public class demo1 {

public static void main(String[] args) {
	Set<String> vowels = new LinkedHashSet<>();
	vowels.add("a");
	vowels.add("e"); 
	vowels.add("i");
List<String> vowelsList = new ArrayList<>(vowels);
      System.out.println("vowels set = "+vowels);
      System.out.println("vowelsList = "+vowelsList);
	vowels.add("o");
	vowelsList.add("a");
	vowelsList.add("u");
	System.out.println("vowels set = "+vowels);
         System.out.println("vowelsList = "+vowelsList);
      vowels = new HashSet<>(vowelsList);
         System.out.println("vowels set = "+vowels);


}
}