package mainPackage;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class Mail extends Main{
	
	String [] elit= new String[5];
	String [] genel= new String[5];
	
	String gonderen= "22120205013test@gmail.com"; // GONDERICI MAILI
	String parola= "kqywbxrolknfuftn";            // PAROLA
	
	public void elitmail(String mail) { //ELIT UYEKERE MAIL ATMA FONKSIYONU
		
		if(elit[0].endsWith(".com")) {
			try {
				// e-postayı göndereceğiniz adres
				String from = gonderen;
				// hesabınızın parolası
				String pass = parola;
				// e-postanın gönderileceği adresler
				String[] to = { elit[0] };
				// host
				String host = "smtp.gmail.com";

				Properties props = System.getProperties();
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.user", from);
				props.put("mail.smtp.password", pass);
				props.put("mail.smtp.port", "587");
				props.put("mail.smtp.auth", "true");

				Session session = Session.getDefaultInstance(props, null);
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress = new InternetAddress[to.length];
				for (int i = 0; i < to.length; i++) {
					toAddress[i] = new InternetAddress(to[i]);
				}

				for (int i = 0; i < toAddress.length; i++) {
					message.addRecipient(Message.RecipientType.TO, toAddress[i]);
				}
				// başlık
				message.setSubject("Mail Title");
				// içerik
				message.setText(mail);
				Transport transport = session.getTransport("smtp");
				transport.connect(host, from, pass);
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(elit[1].endsWith(".com")) {
			try {
				// e-postayı göndereceğiniz adres
				String from = gonderen;
				// hesabınızın parolası
				String pass = parola;
				// e-postanın gönderileceği adresler
				String[] to = { elit[1] };
				// host
				String host = "smtp.gmail.com";

				Properties props = System.getProperties();
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.user", from);
				props.put("mail.smtp.password", pass);
				props.put("mail.smtp.port", "587");
				props.put("mail.smtp.auth", "true");

				Session session = Session.getDefaultInstance(props, null);
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress = new InternetAddress[to.length];
				for (int i = 0; i < to.length; i++) {
					toAddress[i] = new InternetAddress(to[i]);
				}

				for (int i = 0; i < toAddress.length; i++) {
					message.addRecipient(Message.RecipientType.TO, toAddress[i]);
				}
				// başlık
				message.setSubject("Mail Title");
				// içerik
				message.setText(mail);
				Transport transport = session.getTransport("smtp");
				transport.connect(host, from, pass);
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(elit[2].endsWith(".com")) {
			try {
				// e-postayı göndereceğiniz adres
				String from = gonderen;
				// hesabınızın parolası
				String pass = parola;
				// e-postanın gönderileceği adresler
				String[] to = { elit[2] };
				// host
				String host = "smtp.gmail.com";

				Properties props = System.getProperties();
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.user", from);
				props.put("mail.smtp.password", pass);
				props.put("mail.smtp.port", "587");
				props.put("mail.smtp.auth", "true");

				Session session = Session.getDefaultInstance(props, null);
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress = new InternetAddress[to.length];
				for (int i = 0; i < to.length; i++) {
					toAddress[i] = new InternetAddress(to[i]);
				}

				for (int i = 0; i < toAddress.length; i++) {
					message.addRecipient(Message.RecipientType.TO, toAddress[i]);
				}
				// başlık
				message.setSubject("Mail Title");
				// içerik
				message.setText(mail);
				Transport transport = session.getTransport("smtp");
				transport.connect(host, from, pass);
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(elit[3].endsWith(".com")) {
			try {
				// e-postayı göndereceğiniz adres
				String from = gonderen;
				// hesabınızın parolası
				String pass = parola;
				// e-postanın gönderileceği adresler
				String[] to = { elit[3] };
				// host
				String host = "smtp.gmail.com";

				Properties props = System.getProperties();
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.user", from);
				props.put("mail.smtp.password", pass);
				props.put("mail.smtp.port", "587");
				props.put("mail.smtp.auth", "true");

				Session session = Session.getDefaultInstance(props, null);
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress = new InternetAddress[to.length];
				for (int i = 0; i < to.length; i++) {
					toAddress[i] = new InternetAddress(to[i]);
				}

				for (int i = 0; i < toAddress.length; i++) {
					message.addRecipient(Message.RecipientType.TO, toAddress[i]);
				}
				// başlık
				message.setSubject("Mail Title");
				// içerik
				message.setText(mail);
				Transport transport = session.getTransport("smtp");
				transport.connect(host, from, pass);
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(elit[4].endsWith(".com")) {
			try {
				// e-postayı göndereceğiniz adres
				String from = gonderen;
				// hesabınızın parolası
				String pass = parola;
				// e-postanın gönderileceği adresler
				String[] to = { elit[4] };
				// host
				String host = "smtp.gmail.com";

				Properties props = System.getProperties();
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.user", from);
				props.put("mail.smtp.password", pass);
				props.put("mail.smtp.port", "587");
				props.put("mail.smtp.auth", "true");

				Session session = Session.getDefaultInstance(props, null);
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress = new InternetAddress[to.length];
				for (int i = 0; i < to.length; i++) {
					toAddress[i] = new InternetAddress(to[i]);
				}

				for (int i = 0; i < toAddress.length; i++) {
					message.addRecipient(Message.RecipientType.TO, toAddress[i]);
				}
				// başlık
				message.setSubject("Mail Title");
				// içerik
				message.setText(mail);
				Transport transport = session.getTransport("smtp");
				transport.connect(host, from, pass);
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void genelmail(String mail) { //GENEL UYELERE MAIL ATMA FONKSIYONU
		if(genel[0].endsWith(".com")) {
			try {
				// e-postayı göndereceğiniz adres
				String from = gonderen;
				// hesabınızın parolası
				String pass = parola;
				// e-postanın gönderileceği adresler
				String[] to = { genel[0] };
				// host
				String host = "smtp.gmail.com";

				Properties props = System.getProperties();
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.user", from);
				props.put("mail.smtp.password", pass);
				props.put("mail.smtp.port", "587");
				props.put("mail.smtp.auth", "true");

				Session session = Session.getDefaultInstance(props, null);
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress = new InternetAddress[to.length];
				for (int i = 0; i < to.length; i++) {
					toAddress[i] = new InternetAddress(to[i]);
				}

				for (int i = 0; i < toAddress.length; i++) {
					message.addRecipient(Message.RecipientType.TO, toAddress[i]);
				}
				// başlık
				message.setSubject("Mail Title");
				// içerik
				message.setText(mail);
				Transport transport = session.getTransport("smtp");
				transport.connect(host, from, pass);
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(genel[1].endsWith(".com")) {
			try {
				// e-postayı göndereceğiniz adres
				String from = gonderen;
				// hesabınızın parolası
				String pass = parola;
				// e-postanın gönderileceği adresler
				String[] to = { genel[1] };
				// host
				String host = "smtp.gmail.com";

				Properties props = System.getProperties();
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.user", from);
				props.put("mail.smtp.password", pass);
				props.put("mail.smtp.port", "587");
				props.put("mail.smtp.auth", "true");

				Session session = Session.getDefaultInstance(props, null);
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress = new InternetAddress[to.length];
				for (int i = 0; i < to.length; i++) {
					toAddress[i] = new InternetAddress(to[i]);
				}

				for (int i = 0; i < toAddress.length; i++) {
					message.addRecipient(Message.RecipientType.TO, toAddress[i]);
				}
				// başlık
				message.setSubject("Mail Title");
				// içerik
				message.setText(mail);
				Transport transport = session.getTransport("smtp");
				transport.connect(host, from, pass);
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(genel[2].endsWith(".com")) {
			try {
				// e-postayı göndereceğiniz adres
				String from = gonderen;
				// hesabınızın parolası
				String pass = parola;
				// e-postanın gönderileceği adresler
				String[] to = { genel[2] };
				// host
				String host = "smtp.gmail.com";

				Properties props = System.getProperties();
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.user", from);
				props.put("mail.smtp.password", pass);
				props.put("mail.smtp.port", "587");
				props.put("mail.smtp.auth", "true");

				Session session = Session.getDefaultInstance(props, null);
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress = new InternetAddress[to.length];
				for (int i = 0; i < to.length; i++) {
					toAddress[i] = new InternetAddress(to[i]);
				}

				for (int i = 0; i < toAddress.length; i++) {
					message.addRecipient(Message.RecipientType.TO, toAddress[i]);
				}
				// başlık
				message.setSubject("Mail Title");
				// içerik
				message.setText(mail);
				Transport transport = session.getTransport("smtp");
				transport.connect(host, from, pass);
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(genel[3].endsWith(".com")) {
			try {
				// e-postayı göndereceğiniz adres
				String from = gonderen;
				// hesabınızın parolası
				String pass = parola;
				// e-postanın gönderileceği adresler
				String[] to = { genel[3] };
				// host
				String host = "smtp.gmail.com";

				Properties props = System.getProperties();
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.user", from);
				props.put("mail.smtp.password", pass);
				props.put("mail.smtp.port", "587");
				props.put("mail.smtp.auth", "true");

				Session session = Session.getDefaultInstance(props, null);
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress = new InternetAddress[to.length];
				for (int i = 0; i < to.length; i++) {
					toAddress[i] = new InternetAddress(to[i]);
				}

				for (int i = 0; i < toAddress.length; i++) {
					message.addRecipient(Message.RecipientType.TO, toAddress[i]);
				}
				// başlık
				message.setSubject("Mail Title");
				// içerik
				message.setText(mail);
				Transport transport = session.getTransport("smtp");
				transport.connect(host, from, pass);
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(genel[4].endsWith(".com")) {
			try {
				// e-postayı göndereceğiniz adres
				String from = gonderen;
				// hesabınızın parolası
				String pass = parola;
				// e-postanın gönderileceği adresler
				String[] to = { genel[4] };
				// host
				String host = "smtp.gmail.com";

				Properties props = System.getProperties();
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.user", from);
				props.put("mail.smtp.password", pass);
				props.put("mail.smtp.port", "587");
				props.put("mail.smtp.auth", "true");

				Session session = Session.getDefaultInstance(props, null);
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress = new InternetAddress[to.length];
				for (int i = 0; i < to.length; i++) {
					toAddress[i] = new InternetAddress(to[i]);
				}

				for (int i = 0; i < toAddress.length; i++) {
					message.addRecipient(Message.RecipientType.TO, toAddress[i]);
				}
				// başlık
				message.setSubject("Mail Title");
				// içerik
				message.setText(mail);
				Transport transport = session.getTransport("smtp");
				transport.connect(host, from, pass);
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void tummail(String mail) {
		
		if(elit[0].endsWith(".com")) {
			try {
				// e-postayı göndereceğiniz adres
				String from = gonderen;
				// hesabınızın parolası
				String pass = parola;
				// e-postanın gönderileceği adresler
				String[] to = { elit[0] };
				// host
				String host = "smtp.gmail.com";

				Properties props = System.getProperties();
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.user", from);
				props.put("mail.smtp.password", pass);
				props.put("mail.smtp.port", "587");
				props.put("mail.smtp.auth", "true");

				Session session = Session.getDefaultInstance(props, null);
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress = new InternetAddress[to.length];
				for (int i = 0; i < to.length; i++) {
					toAddress[i] = new InternetAddress(to[i]);
				}

				for (int i = 0; i < toAddress.length; i++) {
					message.addRecipient(Message.RecipientType.TO, toAddress[i]);
				}
				// başlık
				message.setSubject("Mail Title");
				// içerik
				message.setText(mail);
				Transport transport = session.getTransport("smtp");
				transport.connect(host, from, pass);
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(elit[1].endsWith(".com")) {
			try {
				// e-postayı göndereceğiniz adres
				String from = gonderen;
				// hesabınızın parolası
				String pass = parola;
				// e-postanın gönderileceği adresler
				String[] to = { elit[1] };
				// host
				String host = "smtp.gmail.com";

				Properties props = System.getProperties();
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.user", from);
				props.put("mail.smtp.password", pass);
				props.put("mail.smtp.port", "587");
				props.put("mail.smtp.auth", "true");

				Session session = Session.getDefaultInstance(props, null);
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress = new InternetAddress[to.length];
				for (int i = 0; i < to.length; i++) {
					toAddress[i] = new InternetAddress(to[i]);
				}

				for (int i = 0; i < toAddress.length; i++) {
					message.addRecipient(Message.RecipientType.TO, toAddress[i]);
				}
				// başlık
				message.setSubject("Mail Title");
				// içerik
				message.setText(mail);
				Transport transport = session.getTransport("smtp");
				transport.connect(host, from, pass);
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(elit[2].endsWith(".com")) {
			try {
				// e-postayı göndereceğiniz adres
				String from = gonderen;
				// hesabınızın parolası
				String pass = parola;
				// e-postanın gönderileceği adresler
				String[] to = { elit[2] };
				// host
				String host = "smtp.gmail.com";

				Properties props = System.getProperties();
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.user", from);
				props.put("mail.smtp.password", pass);
				props.put("mail.smtp.port", "587");
				props.put("mail.smtp.auth", "true");

				Session session = Session.getDefaultInstance(props, null);
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress = new InternetAddress[to.length];
				for (int i = 0; i < to.length; i++) {
					toAddress[i] = new InternetAddress(to[i]);
				}

				for (int i = 0; i < toAddress.length; i++) {
					message.addRecipient(Message.RecipientType.TO, toAddress[i]);
				}
				// başlık
				message.setSubject("Mail Title");
				// içerik
				message.setText(mail);
				Transport transport = session.getTransport("smtp");
				transport.connect(host, from, pass);
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(elit[3].endsWith(".com")) {
			try {
				// e-postayı göndereceğiniz adres
				String from = gonderen;
				// hesabınızın parolası
				String pass = parola;
				// e-postanın gönderileceği adresler
				String[] to = { elit[3] };
				// host
				String host = "smtp.gmail.com";

				Properties props = System.getProperties();
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.user", from);
				props.put("mail.smtp.password", pass);
				props.put("mail.smtp.port", "587");
				props.put("mail.smtp.auth", "true");

				Session session = Session.getDefaultInstance(props, null);
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress = new InternetAddress[to.length];
				for (int i = 0; i < to.length; i++) {
					toAddress[i] = new InternetAddress(to[i]);
				}

				for (int i = 0; i < toAddress.length; i++) {
					message.addRecipient(Message.RecipientType.TO, toAddress[i]);
				}
				// başlık
				message.setSubject("Mail Title");
				// içerik
				message.setText(mail);
				Transport transport = session.getTransport("smtp");
				transport.connect(host, from, pass);
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(elit[4].endsWith(".com")) {
			try {
				// e-postayı göndereceğiniz adres
				String from = gonderen;
				// hesabınızın parolası
				String pass = parola;
				// e-postanın gönderileceği adresler
				String[] to = { elit[4] };
				// host
				String host = "smtp.gmail.com";

				Properties props = System.getProperties();
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.user", from);
				props.put("mail.smtp.password", pass);
				props.put("mail.smtp.port", "587");
				props.put("mail.smtp.auth", "true");

				Session session = Session.getDefaultInstance(props, null);
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress = new InternetAddress[to.length];
				for (int i = 0; i < to.length; i++) {
					toAddress[i] = new InternetAddress(to[i]);
				}

				for (int i = 0; i < toAddress.length; i++) {
					message.addRecipient(Message.RecipientType.TO, toAddress[i]);
				}
				// başlık
				message.setSubject("Mail Title");
				// içerik
				message.setText(mail);
				Transport transport = session.getTransport("smtp");
				transport.connect(host, from, pass);
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	if(genel[0].endsWith(".com")) {
		try {
			// e-postayı göndereceğiniz adres
			String from = gonderen;
			// hesabınızın parolası
			String pass = parola;
			// e-postanın gönderileceği adresler
			String[] to = { genel[0] };
			// host
			String host = "smtp.gmail.com";

			Properties props = System.getProperties();
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.user", from);
			props.put("mail.smtp.password", pass);
			props.put("mail.smtp.port", "587");
			props.put("mail.smtp.auth", "true");

			Session session = Session.getDefaultInstance(props, null);
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			InternetAddress[] toAddress = new InternetAddress[to.length];
			for (int i = 0; i < to.length; i++) {
				toAddress[i] = new InternetAddress(to[i]);
			}

			for (int i = 0; i < toAddress.length; i++) {
				message.addRecipient(Message.RecipientType.TO, toAddress[i]);
			}
			// başlık
			message.setSubject("Mail Title");
			// içerik
			message.setText(mail);
			Transport transport = session.getTransport("smtp");
			transport.connect(host, from, pass);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	if(genel[1].endsWith(".com")) {
		try {
			// e-postayı göndereceğiniz adres
			String from = gonderen;
			// hesabınızın parolası
			String pass = parola;
			// e-postanın gönderileceği adresler
			String[] to = { genel[1] };
			// host
			String host = "smtp.gmail.com";

			Properties props = System.getProperties();
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.user", from);
			props.put("mail.smtp.password", pass);
			props.put("mail.smtp.port", "587");
			props.put("mail.smtp.auth", "true");

			Session session = Session.getDefaultInstance(props, null);
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			InternetAddress[] toAddress = new InternetAddress[to.length];
			for (int i = 0; i < to.length; i++) {
				toAddress[i] = new InternetAddress(to[i]);
			}

			for (int i = 0; i < toAddress.length; i++) {
				message.addRecipient(Message.RecipientType.TO, toAddress[i]);
			}
			// başlık
			message.setSubject("Mail Title");
			// içerik
			message.setText(mail);
			Transport transport = session.getTransport("smtp");
			transport.connect(host, from, pass);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	if(genel[2].endsWith(".com")) {
		try {
			// e-postayı göndereceğiniz adres
			String from = gonderen;
			// hesabınızın parolası
			String pass = parola;
			// e-postanın gönderileceği adresler
			String[] to = { genel[2] };
			// host
			String host = "smtp.gmail.com";

			Properties props = System.getProperties();
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.user", from);
			props.put("mail.smtp.password", pass);
			props.put("mail.smtp.port", "587");
			props.put("mail.smtp.auth", "true");

			Session session = Session.getDefaultInstance(props, null);
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			InternetAddress[] toAddress = new InternetAddress[to.length];
			for (int i = 0; i < to.length; i++) {
				toAddress[i] = new InternetAddress(to[i]);
			}

			for (int i = 0; i < toAddress.length; i++) {
				message.addRecipient(Message.RecipientType.TO, toAddress[i]);
			}
			// başlık
			message.setSubject("Mail Title");
			// içerik
			message.setText(mail);
			Transport transport = session.getTransport("smtp");
			transport.connect(host, from, pass);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	if(genel[3].endsWith(".com")) {
		try {
			// e-postayı göndereceğiniz adres
			String from = gonderen;
			// hesabınızın parolası
			String pass = parola;
			// e-postanın gönderileceği adresler
			String[] to = { genel[3] };
			// host
			String host = "smtp.gmail.com";

			Properties props = System.getProperties();
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.user", from);
			props.put("mail.smtp.password", pass);
			props.put("mail.smtp.port", "587");
			props.put("mail.smtp.auth", "true");

			Session session = Session.getDefaultInstance(props, null);
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			InternetAddress[] toAddress = new InternetAddress[to.length];
			for (int i = 0; i < to.length; i++) {
				toAddress[i] = new InternetAddress(to[i]);
			}

			for (int i = 0; i < toAddress.length; i++) {
				message.addRecipient(Message.RecipientType.TO, toAddress[i]);
			}
			// başlık
			message.setSubject("Mail Title");
			// içerik
			message.setText(mail);
			Transport transport = session.getTransport("smtp");
			transport.connect(host, from, pass);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	if(genel[4].endsWith(".com")) {
		try {
			// e-postayı göndereceğiniz adres
			String from = gonderen;
			// hesabınızın parolası
			String pass = parola;
			// e-postanın gönderileceği adresler
			String[] to = { genel[4] };
			// host
			String host = "smtp.gmail.com";

			Properties props = System.getProperties();
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.user", from);
			props.put("mail.smtp.password", pass);
			props.put("mail.smtp.port", "587");
			props.put("mail.smtp.auth", "true");

			Session session = Session.getDefaultInstance(props, null);
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			InternetAddress[] toAddress = new InternetAddress[to.length];
			for (int i = 0; i < to.length; i++) {
				toAddress[i] = new InternetAddress(to[i]);
			}

			for (int i = 0; i < toAddress.length; i++) {
				message.addRecipient(Message.RecipientType.TO, toAddress[i]);
			}
			// başlık
			message.setSubject("Mail Title");
			// içerik
			message.setText(mail);
			Transport transport = session.getTransport("smtp");
			transport.connect(host, from, pass);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
}