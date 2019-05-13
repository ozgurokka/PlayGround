
public class Yaz extends Thread{
	private Application app;
	
	public Yaz(Application app) {
		this.app = app;
	}

	@Override
    public void run() {
        while (true) {
        	app.load();
        }
    }
}
