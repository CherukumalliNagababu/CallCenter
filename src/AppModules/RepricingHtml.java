package AppModules;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.WebDriver;

import utility.Utils;

public class RepricingHtml extends RepricingReports {
public static void TestFormate(int iTestCaseRow,WebDriver driver) throws Exception {
	
	//COMDomainNames=String.format("%30s %30s %15s %15s %15s %15s %15s", "COM", "WEGO", "B2C", "MOBIOS", "MOBAPP","SKYSCN", "TOTAL");
	StringBuilder htmlStringBuilder=new StringBuilder();
	
	
	
	
	
	

	
	
	
	





 
//Repricing
String COM_RP_Total = new Integer(Com_RP_Repricing_Total).toString();
String AE_RP_Total = new Integer(AE_RP_Repricing_Total).toString();
String SA_RP_Total = new Integer(SA_RP_Repricing_Total).toString();
String EG_RP_Total = new Integer(EG_RP_Repricing_Total).toString();

int RP_TotalValue = Integer.parseInt(COM_RP_Total) + Integer.parseInt(AE_RP_Total) +Integer.parseInt(SA_RP_Total) + Integer.parseInt(EG_RP_Total);
int All_Repricing_total = RP_TotalValue; 
System.out.println("REPRICING  GRAND TOTAL:::----"+All_Repricing_total);


//new repricing
String COM_RP_Total1 = new Integer(com_byDefault).toString();
String AE_RP_Total1 = new Integer(Ae_byDefault).toString();
String SA_RP_Total1 = new Integer(Sa_byDefault).toString();
String EG_RP_Total1 = new Integer(Eg_byDefault).toString();

int RP_TotalValue1 = Integer.parseInt(COM_RP_Total1) + Integer.parseInt(AE_RP_Total1) +Integer.parseInt(SA_RP_Total1) + Integer.parseInt(EG_RP_Total1);
int All_Repricing_total1 = RP_TotalValue1; 
System.out.println("REPRICING  GRAND TOTAL:::----"+All_Repricing_total1);


//Confirmation pending
String COM_CP_Total = new Integer(Com_CP_conformation_pending_Total).toString();
String AE_CP_Total = new Integer(AE_CP_conformation_pending_Total).toString();
String SA_CP_Total = new Integer(SA_CP_conformation_pending_Total).toString();
String EG_CP_Total = new Integer(EG_CP_conformation_pending_Total).toString();



int CP_TotalValue = Integer.parseInt(COM_CP_Total) + Integer.parseInt(AE_CP_Total) +Integer.parseInt(SA_CP_Total) + Integer.parseInt(EG_CP_Total);
int All_Confirmationpending_total = CP_TotalValue; 
System.out.println("CONFIRMATION PENDING GRAND TOTAL:::----"+All_Confirmationpending_total);
	
	
			
	
	
	
	



//Reprice
	 String RP_Grand_Total=String.format("%7s " ,"REPRICING GRAND TOTAL :)- "+All_Repricing_total+"");
		String Com_Rp=String.format("%7s %5s %5s %5s %5s %5s %5s", "COM("+Com_RP_Repricing_Total+") :","-B2C("+Com_RP_b2c+")", "-MOBAPP("+Com_RP_MobAnd+")", "-MOBIOS("+Com_RP_MobIos+")", "-WEGO("+Com_RP_Wego+")","-SKYSCN("+Com_RP_skyscan+")", "-OTHERS("+Com_RP_Other_Repricingtotal+")");
		String AE_Rp =String.format("%7s %5s %5s %5s %5s %5s %5s", "AE"+"   "+"("+AE_RP_Repricing_Total+") :", "-B2C("+AE_RP_b2c+")", "-MOBAPP("+AE_RP_MobAnd+")", "-MOBIOS("+AE_RP_MobIos+")", "-WEGO("+AE_RP_Wego+")","-SKYSCN("+AE_RP_skyscan+")", "-OTHERS("+AE_RP_Other_Repricingtotal+")");
		String Sa_Rp =String.format("%7s %5s %5s %5s %5s %5s %5s", "SA"+"   "+"("+SA_RP_Repricing_Total+") :", "-B2C("+SA_RP_b2c+")", "-MOBAPP("+SA_RP_MobAnd+")", "-MOBIOS("+SA_RP_MobIos+")", "-WEGO("+SA_RP_Wego+")","-SKYSCN("+SA_RP_skyscan+")", "-OTHERS("+SA_RP_Other_Repricingtotal+")");
		String Eg_Rp =String.format("%7s %5s %5s %5s %5s %5s %5s", "EG"+"   "+"("+EG_RP_Repricing_Total+") :", "-B2C("+EG_RP_b2c+")", "-MOBAPP("+EG_RP_MobAnd+")", "-MOBIOS("+EG_RP_MobIos+")", "-WEGO("+EG_RP_Wego+")","-SKYSCN("+EG_RP_skyscan+")", "-OTHERS("+EG_RP_Other_Repricingtotal+")");
		
		









//Mail sent
	
	System.out.println("Started");
	 //StringBuilder htmlStringBuilder=new StringBuilder();
	 HtmlEmail email = new HtmlEmail();
	//Email email = new SimpleEmail();
	email.setHostName("smtp.googlemail.com");
	email.setSmtpPort(465);
	System.out.println("1");
	email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
	email.setSSLOnConnect(true);
	email.setFrom("naga123.ch@gmail.com");
	//email.setSubject(Utils.Yesterdaytimestamp()+" - Automation Report For "+urldomain1[0]+" Domain");
	email.setSubject(""+Utils.DaybeforeYesterdaytimestamp()+" "+"To"+" "+ Utils.Yesterdaytimestamp()+"  Repricing Status Report");
	System.out.println("2");
	
	
 
 
 

	
	/*email.setHtmlMsg(""+htmlStringBuilder.append(" <table width =400  height = 150 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th> <th>DOMAIN</th> <th>B2C</th><th>MOBAPP</th><th>MOBIOS</th> <th>WEGO</th> <th>SKYSCN</th> <th> OTHERS </th> <th> TOTAL</th><th> GRAND TOTAL </th></tr> "));

	
	
	//Repricing
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >REPRICING</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Com</td> <td>"+Com_RP_b2c+"</td><td>"+Com_RP_MobAnd+"</td><td>"+Com_RP_MobIos+"</td><td>"+Com_RP_Wego+"</td><td>"+Com_RP_skyscan+"</td><td>"+ Com_RP_Other_Repricingtotal+"</td><td>"+Com_RP_Repricing_Total+"</td><td rowspan=5>"+All_Repricing_total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_RP_b2c+"</td><td>"+AE_RP_MobAnd+"</td><td>"+AE_RP_MobIos+"</td><td>"+AE_RP_Wego+"</td><td>"+AE_RP_skyscan+"</td><td>"+AE_RP_Other_Repricingtotal+"</td><td>"+AE_RP_Repricing_Total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_RP_b2c+"</td><td>"+SA_RP_MobAnd+"</td><td>"+SA_RP_MobIos+"</td><td>"+SA_RP_Wego+"</td><td>"+SA_RP_skyscan+"</td><td>"+SA_RP_Other_Repricingtotal+"</td><td>"+SA_RP_Repricing_Total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_RP_b2c+"</td><td>"+EG_RP_MobAnd+"</td><td>"+EG_RP_MobIos+"</td><td>"+EG_RP_Wego+"</td><td>"+EG_RP_skyscan+"</td><td>"+EG_RP_Other_Repricingtotal+"</td><td>"+EG_RP_Repricing_Total+"</td></tr>"));
	
 
 
 
	//Confirmation pending
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >CONFIRMATION PENDING</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Com_CP_b2c+"</td><td>"+Com_CP_MobAnd+"</td><td>"+Com_CP_MobIos+"</td><td>"+Com_CP_Wego+"</td><td>"+Com_CP_skyscan+"</td><td>"+ Com_CP_Other_conformation_pending+"</td><td>"+Com_CP_conformation_pending_Total+"</td><td rowspan=5>"+All_Confirmationpending_total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_CP_b2c+"</td><td>"+AE_CP_MobAnd+"</td><td>"+AE_CP_MobIos+"</td><td>"+AE_CP_Wego+"</td><td>"+AE_CP_skyscan+"</td><td>"+AE_CP_Other_conformation_pending+"</td><td>"+AE_CP_conformation_pending_Total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_CP_b2c+"</td><td>"+SA_CP_MobAnd+"</td><td>"+SA_CP_MobIos+"</td><td>"+SA_CP_Wego+"</td><td>"+SA_CP_skyscan+"</td><td>"+SA_CP_Other_conformation_pending+"</td><td>"+SA_CP_conformation_pending_Total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_CP_b2c+"</td><td>"+EG_CP_MobAnd+"</td><td>"+EG_CP_MobIos+"</td><td>"+EG_CP_Wego+"</td><td>"+EG_CP_skyscan+"</td><td>"+EG_CP_Other_conformation_pending+"</td><td>"+EG_CP_conformation_pending_Total+"</td></tr>"));

	
	*/

 
 
	email.setHtmlMsg(""+htmlStringBuilder.append(" <table width =200  height = 100 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th> <th>DOMAIN</th>  <th> TOTAL</th><th> GRAND TOTAL </th></tr> "));

	
	//Repricing
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >REPRICING</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Com</td> <td>"+com_byDefault+"</td><td rowspan=5>"+All_Repricing_total1+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+Ae_byDefault+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+Sa_byDefault+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+Eg_byDefault+"</td></tr>"));
		
	
		email.setHtmlMsg(""+htmlStringBuilder.append("</table></body></html>"));

		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
	
		email.setHtmlMsg(""+htmlStringBuilder.append(" <table width =200  height = 100 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th> <th>DOMAIN</th> <th> TOTAL</th><th> GRAND TOTAL </th></tr> "));
		//Confirmation pending
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >CONFIRMATION PENDING</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Com_CP_conformation_pending_Total+"</td><td rowspan=5>"+All_Confirmationpending_total+"</td></tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td><td>"+AE_CP_conformation_pending_Total+"</td></tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td><td>"+SA_CP_conformation_pending_Total+"</td></tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td><td>"+EG_CP_conformation_pending_Total+"</td></tr>"));

			
	
	
	
	
	
	//email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <td colspan=10> NOTE:--TS -- Transaction Successful ,SD -- Sold Out,CX -- Cancelled,TH -- Transaction Hold </td></tr>"));
 
 

	
		
	email.addTo("Sreenivas.bodige@rehlat.com");
	email.addCc("tariqraza@rehlat.com");
	email.addCc("qateam@rehlat.com");
	email.addCc("rajendra.purohit@rehlat.com");
	
	email.addCc("veerendra.parvataneni@rehlat.com");
	email.addCc("suresh.kakarlapudi@rehlat.com");
	
	
	
	
// email.addTo("naga.ch199@gmail.com");
  
	
	System.out.println("3");
	email.send();
	System.out.println("END");
	









}

}
