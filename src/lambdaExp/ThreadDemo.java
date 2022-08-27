package lambdaExp;

public class ThreadDemo {
	public static void main(String[] args) {
		Runnable thread1 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		// thread1.run();
		Thread t1 = new Thread(thread1);
		t1.setName("john");
		t1.start();
		System.out.println(t1.getName());

		
		Runnable r1=()->{
			for(int i=1;i<11;i++) {
				System.out.println(2*i);
				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t2=new Thread(r1);
		t2.setName("Table");
		t2.start();
		System.out.println(t2.getName());
	}
}
