import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifeCycleLogger {
	@BeforeAll
	default void BeforeAllTest() {
		System.out.println("Before all Test");
	}
	@AfterAll
	default void AfterAllTest() {
		System.out.println("After all Test");
	}
	@Test
	default void TestMethod() {
		System.out.println("This is test Method");
	}
}
