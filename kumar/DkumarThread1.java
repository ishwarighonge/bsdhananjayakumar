package kumar;

class MyClass12 extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("run method"+Thread.currentThread());
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

public class DkumarThread1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("JVM Thread"+Thread.currentThread());
		MyClass12 obj = new MyClass12();
		obj.setName("First");
		System.out.println("Thread is alive or dead="+obj.isAlive());
		MyClass12 obj1 = new MyClass12();
		obj1.setName("Second");
		obj1.start();
		System.out.println("Thread is alive or dead="+obj.isAlive());
		obj.join();
		System.out.println("Thread is alive or dead="+obj.isAlive());
		obj1.start();
		//obj.start();
		

	}

}
