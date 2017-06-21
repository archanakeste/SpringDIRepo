package service;

public class EmailService implements MessageService{

	@Override
	public void sendMessage(String msg, String rec) {
       System.out.println("Email service msg is:"+msg +"to the recipient "+rec);		
	}

}
