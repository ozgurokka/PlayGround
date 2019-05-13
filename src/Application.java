import java.util.Random;

public class Application {

	private int sayi = 5 ;
	
	public synchronized void load() {
		Random generator = new Random(); 
		sayi = 444;
		sayi = generator.nextInt(10) + 1;
	}
	
	public synchronized int get() {
		return sayi;
	}
}
