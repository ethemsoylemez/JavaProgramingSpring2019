package day50_inheritance03;

public class SlackChannel {
	
	public static void main(String[] args) {
		
		SlackUser su = new SlackUser("Nadir");
		AdminUser au = new AdminUser("Florian");
		
		su.sendAMessage("This Thursday, we will summarize Jira management tool, and focus on Jira Xray plug in / add on. Please prepare your questions on Jira. Also, we will continue reviewing testing types, and specifically go over smoke test suite and see the example.");
		au.sendAMessage("If you have any questions fell free to ask");
		
	}

}
