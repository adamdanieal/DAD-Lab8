package exe2;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class TrackingThread implements Runnable {
	
	
	public void arrayText()
	{
		//create object for random
				Random rand = new Random();
				
				//store word in array
				String array[] = { "It", "is", "recommended", "to", "use", "Calendar", "class" };
				
				
				Set<Integer> set = new LinkedHashSet<Integer>();

				while (set.size() < array.length)
				{
					set.add(rand.nextInt(array.length));
				}

				Object textArray[] = set.toArray();

				//reorder the sentence
				String reorder = "";
				for (int i = 0; i < array.length; i++)
				{
					reorder += array[(int) textArray[i]] + " ";
				}
				System.out.println(reorder);
			
	}
	public void ExcuteText() {
		
		String text = "Hello Welcome";
		String temptext = "";
		char extractChar;
		
		//extract portions of text in 10 repetition
		for (int i = 1; i<=10; i++)
		{
			extractChar = text.charAt(i);
			temptext += extractChar;
			System.out.println(temptext);
			
		}
	}
	
	public void run() {
		
		Thread ct = Thread.currentThread();
		if (ct.getName() == "text") {
			
			arrayText();
			
		}
		else{
			ExcuteText();
			 
		}
		
	}

}
