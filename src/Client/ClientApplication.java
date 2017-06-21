package Client;
// it has both xml based and Java based  Spring Example 
import org.springframework.context.support.ClassPathXmlApplicationContext;
import componentApplication.XmlMyApp;

public class ClientApplication {
	public static void main(String[] arg){
		//Annotation Based Application Context 
/*		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication application=context.getBean(MyApplication.class);
		application.processMessage("Hello ", "archana.keste@gmail.com");
		*/
		//xml based Application Context
		
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		XmlMyApp app=applicationContext.getBean(XmlMyApp.class);
		app.processMessage("I am Star performer", "archana.keste@arisglobal.com");
		applicationContext.close();
	}
}
