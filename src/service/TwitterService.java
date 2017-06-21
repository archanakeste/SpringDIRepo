package service;

public class TwitterService implements MessageService{

	@Override
	public void sendMessage(String msg, String rec) {
		System.out.println("Twitter service msg is:"+msg +"to the recipient "+rec);
	}

}
