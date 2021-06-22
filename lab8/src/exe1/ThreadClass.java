package exe1;

public class ThreadClass {
	
	public static void main(String[] args) 
	{
		System.out.print("\n");
		System.out.print("HH:mm:ss \n");
		
		//reate objects of thread
		Thread Thread1 = new ThreadNumber();
		Thread THread2 = new ThreadNumber();

		// thread name
		Thread1.setName("Thread 1");
		THread2.setName("Thread 2");
			
		// Execute the threads
		Thread1.start();
		THread2.start();

	}

}
