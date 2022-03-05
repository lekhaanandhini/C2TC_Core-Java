import org.junit.jupiter.api.Assumptions;
public class Assumptions {

	void Dev() {
		System.setProperty("ENV", "DEV");
    	Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
	}
}
