class Eclipse implements Runnable{
		public void run() {

	}
}
public class multithread {
	public static void main(String[] args) {
		Eclipse obj =new Eclipse();
		Thread t1 =new Thread(obj);
		t1.start();
		
	}
}