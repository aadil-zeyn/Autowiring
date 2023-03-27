package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =    new ClassPathXmlApplicationContext("application.xml");  
    	NotificationServices n=context.getBean(NotificationServices.class);
    	
    	n.Notify();
    }

	
}
