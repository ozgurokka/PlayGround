
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application app = new Application();
		Oku o = new Oku(app);
		Yaz y = new Yaz(app);
		o.start();
		y.start();
	}

}
