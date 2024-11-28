package kumar;

class Third implements Runnable {
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("inside run method"+Thread.currentThread());
	}
	
}

public class AppRunnable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Third obj = new Third();
		Thread tobj = new Thread(obj);
		
		System.out.println("Main thread="+Thread.currentThread());
		tobj.run();
		tobj.setName("firstThread");
		tobj.start();
	}

}
