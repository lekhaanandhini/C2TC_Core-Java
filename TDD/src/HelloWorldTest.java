import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
public class HelloWorldTest implements TestLifeCycleLogger {
	@Test
@RepeatedTest(10)
	void Test() {
		System.out.println("This is first Test Case");
	}

	

}
