package exe1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ThreadNumber extends Thread {
	
	public void printer (String threadname)
	{
		LocalTime time = LocalTime.now();
		DateTimeFormatter timeFormat= DateTimeFormatter.ofPattern("HH:mm:ss");
		String timeformat=time.format(timeFormat);
		
		//to display the current time and thread name in 10 repetition
		for(int i=1;i<11;++i)
		{
			System.out.println(i+") "+ threadname +" on " + timeformat);
		}
	}

	public void run()
	{
		//create object to get current thread
		Thread ct = Thread.currentThread();
		
		//print thread
		printer(ct.getName());
	}
}
