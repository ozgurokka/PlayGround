
public class Oku extends Thread{
private Application app;
	
	public Oku(Application app) {
		this.app = app;
	}

	@Override
    public void run() {
        while (true) {
        	int a = app.get();
        	System.out.println(a);
        	if(a == 444) {
        		System.out.println("thread bitti");
        		break;
        	}
        }
    }
}
