package AppModules;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.WebDriver;

import utility.Utils;

public class RepricingMail {
	
	public static void sendMail(int iTestCaseRow,WebDriver driver,String DomainName) throws Exception {
		
		    Email email = new SimpleEmail();
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			System.out.println("1");
			email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
			email.setSSLOnConnect(true);
			email.setFrom("naga123.ch@gmail.com");
		
			//email.setSubject("HIGH PRIORITY : BRB mail not received today!!!");
			email.setSubject(""+Utils.DaybeforeYesterdaytimestamp()+" "+"To"+" "+ Utils.Yesterdaytimestamp()+" "+DomainName+ " : Repricing Status Report");
			email.setMsg("Dear Team," + "\n" + "" + "\n" + " We have received ." + "\n"
					+ " Request you to check and do needful on the same." + "\n" + "" + "\n" + "Thanks and Regards,"
					+ "\n" + "QA Team");

			System.out.println("2");
			email.addTo("naga.ch199@gmail.com");
			//email.addCc("qateam@rehlat.com ");
			//email.addCc("devteam@rehlat.com");

			System.out.println("3");
			email.send();
			System.out.println("END");

			
		
		
		
	}
		
	

}
