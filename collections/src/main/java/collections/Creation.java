package collections;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Creation
{
	private static final Logger logger = LogManager.getLogger(Creation.class);
    private static Scanner sc;

	public static void main(String[] args) 
    {
    	sc = new Scanner(System.in);
    	MyArraylist<Integer> list = new MyArraylist<Integer>();
    	logger.info("Pre-initialized list:");
    	logger.info(list);
        logger.info("Press 0 to add elements to the list ");
        logger.info("Press 1 to remove elements from the list ");
        int option=sc.nextInt();
        if(option==0)
    	{logger.info("How many elements do you want to add");
        
    	int noOfAdd=sc.nextInt();
        for (int i=0;i<noOfAdd;i++)
        {
        	int adding=sc.nextInt();
        	list.add(adding);
        }
        logger.info("Total list after adding elements:");
        logger.info(list);
    	}
        if(option==1)
        { logger.info("Enter postion of value to be removed");
        int removeElement;
        removeElement=sc.nextInt();
        list.remove(removeElement);
        logger.info("Total list after removing elements:"+list);
        }
        else
        logger.info("Fetched value at index 0 is  "+ list.fetch(0));
        logger.info("Fetched value at index 1 is"+ list.fetch(1));
 
        //List Size
        logger.info("total size="+list.size());
    }
}