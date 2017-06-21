package componentApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.MessageService;

@Component
public class MyApplication {
      //field level Auto wire	
      //@Autowired
	    MessageService messageService;
		/*public MyApplication(MessageService messageService){
				this.messageService=messageService;
			};
		*/
	    @Autowired
		public void setMessageService(MessageService messageService) {
			this.messageService = messageService;
		}

		public void processMessage(String msg,String rec){
			messageService.sendMessage(msg, rec);
			System.out.println("Successfully Sent");
		}
	

}
