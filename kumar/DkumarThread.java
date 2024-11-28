package kumar;

class MyClass extends DkumarThread {
	public void run() {
		System.out.println("run method"+Thread.currentThread());
		
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

	public void join() {
		// TODO Auto-generated method stub
		
	}
}
public class DkumarThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JVM Thread"+Thread.currentThread());
		MyClass obj = new MyClass();
		obj.setName("first");
		MyClass obj1 = new MyClass();
		obj.setName("Second");
		obj.start();
		obj1.start();
		obj.start();

	}

	public static String currentThread() {
		// TODO Auto-generated method stub
		return null;
	}

}
