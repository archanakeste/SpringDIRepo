package componentApplication;

import org.springframework.beans.factory.annotation.Autowired;

import service.MessageService;

public class XmlMyApp {

	MessageService messageService;
    @Autowired
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	
	
	public void processMessage(String msg,String rec){
		messageService.sendMessage(msg, rec);
		System.out.println(" Success Twitter MSG");
	}
}
