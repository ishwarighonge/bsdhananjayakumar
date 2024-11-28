package kumar;

class MyClass11 extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("run method"+Thread.currentThread()+""+i);
			try {
				Thread.sleep(5000);
			}
			catch (InterruptedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MainAppThread1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("JVM Thread"+Thread.currentThread());
		MyClass11 obj = new MyClass11();
		obj.setName("first");
		
		MyClass11 obj1 = new MyClass11();
		obj1.setName("Second");
		obj1.start();
		obj.join();
		obj1.start();
		obj.start();

	}

}
