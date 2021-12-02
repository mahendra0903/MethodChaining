package pakage;

public class Main {
	
	public static void main(String[] args) {
		 Test d =new Test();
		 Demo r =d.sendTest();
		 Auto i= r.sendObj();
		 i.sendData();
		 d.sendTest().sendObj().sendData();
	}

}
