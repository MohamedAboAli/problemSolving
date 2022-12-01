package problemSolving;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;

import com.sun.mail.pop3.POP3Store;

public class ReceiveMail {

	public static void receiveEmail(String pop3Host, String storeType, String user, String password) {
		try {
			Properties properties = new Properties();
			properties.put("mail.pop3.host", pop3Host);
			
			Session emailSession = Session.getDefaultInstance(properties);

			Store emailStore = emailSession.getStore(storeType);
			emailStore.connect(pop3Host, 995,user, password);

			Folder emailFolder = emailStore.getFolder("INBOX");
			emailFolder.open(Folder.READ_ONLY);

			Message[] messages = emailFolder.getMessages();
			for (int i = 0; i < messages.length; i++) {
				Message message = messages[i];
				System.out.println("---------------------------------");
				System.out.println("Email Number " + (i + 1));
				System.out.println("Subject: " + message.getSubject());
				System.out.println("From: " + message.getFrom()[0]);
				System.out.println("Text: " + message.getContent().toString());
			}

			emailFolder.close(false);
			emailStore.close();

		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void receiveEmail1(String pop3Host, String storeType,final String user, final String password) {  
        try {  
         //1) get the session object  
         Properties props = new Properties();  
         props.put("mail.pop3.host", "pop.gmail.com");
         
         props.put("mail.pop3.ssl.enable", "true"); // Use SSL
         
         props.put("mail.pop3.user", user);

         props.put("mail.pop3.socketFactory", 995);

         props.put("mail.pop3.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

         props.put("mail.pop3.port", 995);
         
         Session session = Session.getDefaultInstance(props, new Authenticator() {
             
              protected PasswordAuthentication getPasswordAuthentication() {
                  return new PasswordAuthentication(user, password);

              }
          });  
           
         //2) create the POP3 store object and connect with the pop server  
         Store emailStore = (Store) session.getStore(storeType);  
         emailStore.connect("pop.gmail.com",995,user, password);  
        
         //3) create the folder object and open it  
         Folder emailFolder = emailStore.getFolder("test");  
         emailFolder.open(Folder.READ_ONLY);  
        
         //4) retrieve the messages from the folder in an array and print it  
         Message[] messages = emailFolder.getMessages();  
         for (int i = 0; i < messages.length; i++) {  
          Message message = messages[i];  
          System.out.println("---------------------------------");  
          System.out.println("Email Number " + (i + 1));  
          System.out.println("Subject: " + message.getSubject());  
          System.out.println("From: " + message.getFrom()[0]);  
          System.out.println("Text: " + message.getContent().toString());  
         }  
        
         //5) close the store and folder objects  
         emailFolder.close(false);  
         emailStore.close();  
        
        } catch (MessagingException e) {e.printStackTrace();}  
        catch (IOException e) {e.printStackTrace();}  
       }  


	public static void main(String[] args) {

		String host = "pop.gmail.com";// change accordingly
		String mailStoreType = "pop3";
		String username = "mohamedaboali2360@gmail.com";
		String password = "zmumhxvdueloglay";// change accordingly

		receiveEmail1(host, mailStoreType, username, password);

	}
}