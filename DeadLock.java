package mypackage;

public class DeadLock {

	
	
	
	String s1 ="srv";
	String s2 ="srvk";
	
	
	
	Thread t1 = new Thread() {
		public void run() {
			while(true){
			synchronized(s1) {
				try {
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName()+"lock s1");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (s2) {
					
					System.out.println(s1+s2);
				}
				
			}
			
		}
	}
	
	};
	
	
	Thread t2 = new Thread() {
	public void run() {
		while(true){
		synchronized(s2) {
			System.out.println(Thread.currentThread().getName()+"lock s2");
			synchronized (s1) {
				
				
			}
			
		}
		
	}
	
	}
	
	
	};
	
	
	
	
	public static void main(String[] args) {
		DeadLock deadlock = new DeadLock();
		deadlock.t1.start();
		deadlock.t2.start();
		
		
		

	}

	}
