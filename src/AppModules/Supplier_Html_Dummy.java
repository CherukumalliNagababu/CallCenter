package AppModules;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.mail.Header;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.WebDriver;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import utility.Utils;

public class Supplier_Html_Dummy extends Supplier_Flight_dummy {
public static void TestFormate(int iTestCaseRow,WebDriver driver) throws Exception {
		
	//COMDomainNames=String.format("%30s %30s %15s %15s %15s %15s %15s", "COM", "WEGO", "B2C", "MOBIOS", "MOBAPP","SKYSCN", "TOTAL");
	StringBuilder htmlStringBuilder=new StringBuilder();
	
	
	
	//Supplier Transaction Successful
	String COM_TS_Sup_Total = new Integer(Com_TS_Supplier_Transaction_Total).toString();
	String AE_TS_Sup_Total = new Integer(AE_TS_Supplier_Transaction_Total).toString();
	String SA_TS_Sup_Total = new Integer(SA_TS_Supplier_Transaction_Total).toString();
	String EG_TS_Sup_Total = new Integer(EG_TS_Supplier_Transaction_Total).toString();

	int TS_Sup_TotalValue = Integer.parseInt(COM_TS_Sup_Total) + Integer.parseInt(AE_TS_Sup_Total) +Integer.parseInt(SA_TS_Sup_Total) + Integer.parseInt(EG_TS_Sup_Total);
	 int All_Sup_TransactionSuccess_total = TS_Sup_TotalValue; 
	System.out.println("SUPPLIERS TRANSACTION SUCCESS GRAND TOTAL:::----"+All_Sup_TransactionSuccess_total);

//Total value of All Domains
	
	int G_3R1G_T=Com_TS_G_3R1+AE_TS_G_3R1+SA_TS_G_3R1+EG_TS_G_3R1;
	int G_570E_T=Com_TS_G_570E+AE_TS_G_570E+SA_TS_G_570E+EG_TS_G_570E;
	int G_5N61_T=Com_TS_G_5N61+AE_TS_G_5N61+SA_TS_G_5N61+EG_TS_G_5N61;
	int G_7FK5_T=Com_TS_G_7FK5+AE_TS_G_7FK5+SA_TS_G_7FK5+EG_TS_G_7FK5;
	
	int G_7JY2_T=Com_TS_G_7JY2+AE_TS_G_7JY2+SA_TS_G_7JY2+EG_TS_G_7JY2;
	int G_7X7W_T=Com_TS_G_7X7W+AE_TS_G_7X7W+SA_TS_G_7X7W+EG_TS_G_7X7W;
	int G_802N_T=Com_TS_G_802N+AE_TS_G_802N+SA_TS_G_802N+EG_TS_G_802N;
	int G_802R_T=Com_TS_G_802R+AE_TS_G_802R+SA_TS_G_802R+EG_TS_G_802R;
	
	int G_8SQ7_T=Com_TS_G_8SQ7+AE_TS_G_8SQ7+SA_TS_G_8SQ7+EG_TS_G_8SQ7;
	int JAZEERA_T=Com_TS_JAZEERA+AE_TS_JAZEERA+SA_TS_JAZEERA+EG_TS_JAZEERA;
	int KIWI_T=Com_TS_KIWI+AE_TS_KIWI+SA_TS_KIWI+EG_TS_KIWI;
	int Manual_T=Com_TS_M_u+AE_TS_M_u+SA_TS_M_u+EG_TS_M_u;
	
	int My_Fly_T=Com_TS_My_Fly+AE_TS_My_Fly+SA_TS_My_Fly+EG_TS_My_Fly;
	int NESMA_T=Com_TS_NESMA+AE_TS_NESMA+SA_TS_NESMA+EG_TS_NESMA;
	int PEGASUS_T=Com_TS_PEGASUS+AE_TS_PEGASUS+SA_TS_PEGASUS+EG_TS_PEGASUS;
	int S_9JFH_T=Com_TS_S_9JFH+AE_TS_S_9JFH+SA_TS_S_9JFH+EG_TS_S_9JFH;
	
	int S_ID2I_T=Com_TS_S_ID2I+AE_TS_S_ID2I+SA_TS_S_ID2I+EG_TS_S_ID2I;
	int S_L8YI_T=Com_TS_S_L8YI+AE_TS_S_L8YI+SA_TS_S_L8YI+EG_TS_S_L8YI;
	int S_L9AI_T=Com_TS_S_L9AI+AE_TS_S_L9AI+SA_TS_S_L9AI+EG_TS_S_L9AI;
	int S_L9CI_T=Com_TS_S_L9CI+AE_TS_S_L9CI+SA_TS_S_L9CI+EG_TS_S_L9CI;
	
	int S_T13I_T=Com_TS_S_T13I+AE_TS_S_T13I+SA_TS_S_T13I+EG_TS_S_T13I;
	int S_T20I_T=Com_TS_S_T20I+AE_TS_S_T20I+SA_TS_S_T20I+EG_TS_S_T20I;
	int SALAM_T=Com_TS_SALAM+AE_TS_SALAM+SA_TS_SALAM+EG_TS_SALAM;
	int S_Jet_T=Com_TS_S_Jet+AE_TS_S_Jet+SA_TS_S_Jet+EG_TS_S_Jet;
	
	int U_3R1G_T=Com_TS_U_3R1G+AE_TS_U_3R1G+SA_TS_U_3R1G+EG_TS_U_3R1G;
	int U_570E_T=Com_TS_U_570E+AE_TS_U_570E+SA_TS_U_570E+EG_TS_U_570E;
	int U_5N61_T=Com_TS_U_5N61+AE_TS_U_5N61+SA_TS_U_5N61+EG_TS_U_5N61;
	int U_6E_T=Com_TS_U_6E+AE_TS_U_6E+SA_TS_U_6E+EG_TS_U_6E;
	
	int U_7FK5_T=Com_TS_U_7FK5+AE_TS_U_7FK5+SA_TS_U_7FK5+EG_TS_U_7FK5;
	int U_7JY2_T=Com_TS_U_7JY2+AE_TS_U_7JY2+SA_TS_U_7JY2+EG_TS_U_7JY2;
	int U_802N_T=Com_TS_U_802N+AE_TS_U_802N+SA_TS_U_802N+EG_TS_U_802N;
	int U_802R_T=Com_TS_U_802R+AE_TS_U_802R+SA_TS_U_802R+EG_TS_U_802R;
	
	int U_8SQ7_T=Com_TS_U_8SQ7+AE_TS_U_8SQ7+SA_TS_U_8SQ7+EG_TS_U_8SQ7;
	int WATANIYA_T=Com_TS_WATANIYA+AE_TS_WATANIYA+SA_TS_WATANIYA+EG_TS_WATANIYA;
	int A_AR_T=Com_TS_A_AR+AE_TS_A_AR+SA_TS_A_AR+EG_TS_A_AR;
	int A_AR_E_T=Com_TS_A_AR_E+AE_TS_A_AR_E+SA_TS_A_AR_E+EG_TS_A_AR_E;
	
	int A_AR_M_T=Com_TS_A_AR_M+AE_TS_A_AR_M+SA_TS_A_AR_M+EG_TS_A_AR_M;
	int A_I_E_T=Com_TS_A_I_E+AE_TS_A_I_E+SA_TS_A_I_E+EG_TS_A_I_E;
	int FlyDubai_T=Com_TS_FlyDubai+AE_TS_FlyDubai+SA_TS_FlyDubai+EG_TS_FlyDubai;
	int Flynas_T=Com_TS_Flynas+AE_TS_Flynas+SA_TS_Flynas+EG_TS_Flynas;
	
	
	
	
	
	String G_3R1G_AD=Integer.toString(G_3R1G_T);
	String G_570E_AD=Integer.toString(G_570E_T);
	String G_5N61_AD=Integer.toString(G_5N61_T);
	String G_7FK5_AD=Integer.toString(G_7FK5_T);
	String G_7JY2_AD=Integer.toString(G_7JY2_T);
	String G_7X7W_AD=Integer.toString(G_7X7W_T);
	String G_802N_AD=Integer.toString(G_802N_T);
	
	String G_802R_AD=Integer.toString(G_802R_T);
	String G_8SQ7_AD=Integer.toString(G_8SQ7_T);
	String JAZEERA_AD=Integer.toString(JAZEERA_T);
	String KIWI_AD=Integer.toString(KIWI_T);
	String Manual_AD=Integer.toString(Manual_T);
	String My_Fly_AD=Integer.toString(My_Fly_T);
	String NESMA_AD=Integer.toString(NESMA_T);
	
	String PEGASUS_AD=Integer.toString(PEGASUS_T);
	String S_9JFH_AD=Integer.toString(S_9JFH_T);
	String S_ID2I_AD=Integer.toString(S_ID2I_T);
	String S_L8YI_AD=Integer.toString(S_L8YI_T);
	String S_L9AI_AD=Integer.toString(S_L9AI_T);
	String S_L9CI_AD=Integer.toString(S_L9CI_T);
	String S_T13I_AD=Integer.toString(S_T13I_T);
	String S_T20I_AD=Integer.toString(S_T20I_T);
	String SALAM_AD=Integer.toString(SALAM_T);
	String S_Jet_AD=Integer.toString(S_Jet_T);
	
	String U_3R1G_AD=Integer.toString(U_3R1G_T);
	String U_570E_AD=Integer.toString(U_570E_T);
	String U_5N61_AD=Integer.toString(U_5N61_T);
	String U_6E_AD=Integer.toString(U_6E_T);
	String U_7FK5_AD=Integer.toString(U_7FK5_T);
	String U_7JY2_AD=Integer.toString(U_7JY2_T);
	String U_802N_AD=Integer.toString(U_802N_T);
	
	String U_802R_AD=Integer.toString(U_802R_T);
	String U_8SQ7_AD=Integer.toString(U_8SQ7_T);
	String WATANIYA_AD=Integer.toString(WATANIYA_T);
	String A_AR_AD=Integer.toString(A_AR_T);
	String A_AR_E_AD=Integer.toString(A_AR_E_T);
	String A_AR_M_AD=Integer.toString(A_AR_M_T);
	String A_I_E_AD=Integer.toString(A_I_E_T);
	String FlyDubai_AD=Integer.toString(FlyDubai_T);
	String Flynas_AD=Integer.toString(Flynas_T);
	
	
	
	
	
	
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

//Date And Time

Date mDate = new Date();
DateFormat timeFormat = SimpleDateFormat.getTimeInstance();


  DateFormat date = new SimpleDateFormat("dd-MM-yyyy");
  String time=timeFormat.format(mDate); 
  String Date=date.format(mDate);
  
  //This method used for 5 Min slow
  DateFormat GetMin = new SimpleDateFormat("hh:mm:ss a");
  Calendar getCal = Calendar.getInstance();
  getCal.add(Calendar.SECOND, -30);
  getCal.add(Calendar.MINUTE, -5);
  System.out.println("Current Date Time : " + GetMin.format(getCal.getTime()));
  
  String currentServerTime =GetMin.format(getCal.getTime());


email.setSubject("Flight Bookings :- "+Utils.TodayName()+"- Date: "+Date+" Time: "+currentServerTime);
//email.setSubject("Flight Bookings :- "+Utils.TodayName()+"- Date: "+Date+" Time: "+time);
//email.setSubject(Utils.timestamp()+" -  Flight Booking Status Report ");
System.out.println("2");
//---------------------------------------------------


email.setHtmlMsg(""+htmlStringBuilder.append("<table width = 500 height = 200 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th><th>SUPPLIERS </th> <th>COM</th> <th>AE</th><th>SA</th><th>EG</th><th>TOTAL</th></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=44 >SUPPLIERS TRANSACTION SUCCESSFUL</td>"));



//Not Equal to Zero
if(!G_3R1G_AD.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_TS_G_3R1+"</td><td>"+AE_TS_G_3R1+"</td><td>"+SA_TS_G_3R1+"</td><td>"+EG_TS_G_3R1+"</td><td>"+G_3R1G_T+"</td></tr>"));

}
if(!G_570E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-570E</td> <td>"+Com_TS_G_570E+"</td><td>"+AE_TS_G_570E+"</td><td>"+SA_TS_G_570E+"</td><td>"+EG_TS_G_570E+"</td><td>"+G_570E_T+"</td></tr>"));
	
}
if(!G_5N61_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-5N61</td> <td>"+Com_TS_G_5N61+"</td><td>"+AE_TS_G_5N61+"</td><td>"+SA_TS_G_5N61+"</td><td>"+EG_TS_G_5N61+"</td><td>"+G_5N61_T+"</td></tr>"));
	
}
if(!G_7FK5_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7FK5</td> <td>"+Com_TS_G_7FK5+"</td><td>"+AE_TS_G_7FK5+"</td><td>"+SA_TS_G_7FK5+"</td><td>"+EG_TS_G_7FK5+"</td><td>"+G_7FK5_T+"</td></tr>"));
	
}
if(!G_7JY2_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7JY2</td> <td>"+Com_TS_G_7JY2+"</td><td>"+AE_TS_G_7JY2+"</td><td>"+SA_TS_G_7JY2+"</td><td>"+EG_TS_G_7JY2+"</td><td>"+G_7JY2_T+"</td></tr>"));
	
}
if(!G_7X7W_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7X7W</td> <td>"+Com_TS_G_7X7W+"</td><td>"+AE_TS_G_7X7W+"</td><td>"+SA_TS_G_7X7W+"</td><td>"+EG_TS_G_7X7W+"</td><td>"+G_7X7W_T+"</td></tr>"));
	
}
if(!G_802N_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-802N</td> <td>"+Com_TS_G_802N+"</td><td>"+AE_TS_G_802N+"</td><td>"+SA_TS_G_802N+"</td><td>"+EG_TS_G_802N+"</td><td>"+G_802N_T+"</td></tr>"));
	
}
if(!G_802R_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-802R</td> <td>"+Com_TS_G_802R+"</td><td>"+AE_TS_G_802R+"</td><td>"+SA_TS_G_802R+"</td><td>"+EG_TS_G_802R+"</td><td>"+G_802R_T+"</td></tr>"));
	
}
if(!G_8SQ7_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-8SQ7</td> <td>"+Com_TS_G_8SQ7+"</td><td>"+AE_TS_G_8SQ7+"</td><td>"+SA_TS_G_8SQ7+"</td><td>"+EG_TS_G_8SQ7+"</td><td>"+G_8SQ7_T+"</td></tr>"));
	
}
if(!JAZEERA_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>JAZEERA</td> <td>"+Com_TS_JAZEERA+"</td><td>"+AE_TS_JAZEERA+"</td><td>"+SA_TS_JAZEERA+"</td><td>"+EG_TS_JAZEERA+"</td><td>"+JAZEERA_T+"</td></tr>"));
	
}
if(!KIWI_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>KIWI</td> <td>"+Com_TS_KIWI+"</td><td>"+AE_TS_KIWI+"</td><td>"+SA_TS_KIWI+"</td><td>"+EG_TS_KIWI+"</td><td>"+KIWI_T+"</td></tr>"));
	
}
if(!Manual_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Manual</td> <td>"+Com_TS_M_u+"</td><td>"+AE_TS_M_u+"</td><td>"+SA_TS_M_u+"</td><td>"+EG_TS_M_u+"</td><td>"+Manual_T+"</td></tr>"));
	
}
if(!My_Fly_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>MystiFly</td> <td>"+Com_TS_My_Fly+"</td><td>"+AE_TS_My_Fly+"</td><td>"+SA_TS_My_Fly+"</td><td>"+EG_TS_My_Fly+"</td><td>"+My_Fly_T+"</td></tr>"));
	
}
if(!NESMA_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>NESMA</td> <td>"+Com_TS_NESMA+"</td><td>"+AE_TS_NESMA+"</td><td>"+SA_TS_NESMA+"</td><td>"+EG_TS_NESMA+"</td><td>"+NESMA_T+"</td></tr>"));
	
}
if(!PEGASUS_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>PEGASUS</td> <td>"+Com_TS_PEGASUS+"</td><td>"+AE_TS_PEGASUS+"</td><td>"+SA_TS_PEGASUS+"</td><td>"+EG_TS_PEGASUS+"</td><td>"+PEGASUS_T+"</td></tr>"));
	
}
if(!S_9JFH_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_9JFH</td> <td>"+Com_TS_S_9JFH+"</td><td>"+AE_TS_S_9JFH+"</td><td>"+SA_TS_S_9JFH+"</td><td>"+EG_TS_S_9JFH+"</td><td>"+S_9JFH_T+"</td></tr>"));
	
}
if(!S_ID2I_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_ID2I</td> <td>"+Com_TS_S_ID2I+"</td><td>"+AE_TS_S_ID2I+"</td><td>"+SA_TS_S_ID2I+"</td><td>"+EG_TS_S_ID2I+"</td><td>"+S_ID2I_T+"</td></tr>"));
	
}
if(!S_L8YI_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L8YI</td> <td>"+Com_TS_S_L8YI+"</td><td>"+AE_TS_S_L8YI+"</td><td>"+SA_TS_S_L8YI+"</td><td>"+EG_TS_S_L8YI+"</td><td>"+S_L8YI_T+"</td></tr>"));
	
}
if(!S_L9AI_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L9AI</td> <td>"+Com_TS_S_L9AI+"</td><td>"+AE_TS_S_L9AI+"</td><td>"+SA_TS_S_L9AI+"</td><td>"+EG_TS_S_L9AI+"</td><td>"+S_L9AI_T+"</td></tr>"));
	
}
if(!S_L9CI_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L9CI</td> <td>"+Com_TS_S_L9CI+"</td><td>"+AE_TS_S_L9CI+"</td><td>"+SA_TS_S_L9CI+"</td><td>"+EG_TS_S_L9CI+"</td><td>"+S_L9CI_T+"</td></tr>"));
	
}
if(!S_T13I_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_T13I</td> <td>"+Com_TS_S_T13I+"</td><td>"+AE_TS_S_T13I+"</td><td>"+SA_TS_S_T13I+"</td><td>"+EG_TS_S_T13I+"</td><td>"+S_T13I_T+"</td></tr>"));
	
}
if(!S_T20I_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_T20I</td> <td>"+Com_TS_S_T20I+"</td><td>"+AE_TS_S_T20I+"</td><td>"+SA_TS_S_T20I+"</td><td>"+EG_TS_S_T20I+"</td><td>"+S_T20I_T+"</td></tr>"));
	
}
if(!SALAM_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SALAM</td> <td>"+Com_TS_SALAM+"</td><td>"+AE_TS_SALAM+"</td><td>"+SA_TS_SALAM+"</td><td>"+EG_TS_SALAM+"</td><td>"+SALAM_T+"</td></tr>"));
	
}
if(!S_Jet_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SpiceJet</td> <td>"+Com_TS_S_Jet+"</td><td>"+AE_TS_S_Jet+"</td><td>"+SA_TS_S_Jet+"</td><td>"+EG_TS_S_Jet+"</td><td>"+S_Jet_T+"</td></tr>"));
	
}
if(!U_3R1G_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_3R1G</td> <td>"+Com_TS_U_3R1G+"</td><td>"+AE_TS_U_3R1G+"</td><td>"+SA_TS_U_3R1G+"</td><td>"+EG_TS_U_3R1G+"</td><td>"+U_3R1G_T+"</td></tr>"));
	
}
if(!U_570E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_570E</td> <td>"+Com_TS_U_570E+"</td><td>"+AE_TS_U_570E+"</td><td>"+SA_TS_U_570E+"</td><td>"+EG_TS_U_570E+"</td><td>"+U_570E_T+"</td></tr>"));
	
}
if(!U_5N61_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_5N61</td> <td>"+Com_TS_U_5N61+"</td><td>"+AE_TS_U_5N61+"</td><td>"+SA_TS_U_5N61+"</td><td>"+EG_TS_U_5N61+"</td><td>"+U_5N61_T+"</td></tr>"));
	
}
if(!U_6E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_6E</td> <td>"+Com_TS_U_6E+"</td><td>"+AE_TS_U_6E+"</td><td>"+SA_TS_U_6E+"</td><td>"+EG_TS_U_6E+"</td><td>"+U_6E_T+"</td></tr>"));
	
}
if(!U_7FK5_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_7FK5</td> <td>"+Com_TS_U_7FK5+"</td><td>"+AE_TS_U_7FK5+"</td><td>"+SA_TS_U_7FK5+"</td><td>"+EG_TS_U_7FK5+"</td><td>"+U_7FK5_T+"</td></tr>"));
	
}
if(!U_7JY2_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_7JY2</td> <td>"+Com_TS_U_7JY2+"</td><td>"+AE_TS_U_7JY2+"</td><td>"+SA_TS_U_7JY2+"</td><td>"+EG_TS_U_7JY2+"</td><td>"+U_7JY2_T+"</td></tr>"));
	
}
if(!U_802N_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_802N</td> <td>"+Com_TS_U_802N+"</td><td>"+AE_TS_U_802N+"</td><td>"+SA_TS_U_802N+"</td><td>"+EG_TS_U_802N+"</td><td>"+U_802N_T+"</td></tr>"));
	
}
if(!U_802R_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_802R</td> <td>"+Com_TS_U_802R+"</td><td>"+AE_TS_U_802R+"</td><td>"+SA_TS_U_802R+"</td><td>"+EG_TS_U_802R+"</td><td>"+U_802R_T+"</td></tr>"));
	
}
if(!U_8SQ7_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_8SQ7</td> <td>"+Com_TS_U_8SQ7+"</td><td>"+AE_TS_U_8SQ7+"</td><td>"+SA_TS_U_8SQ7+"</td><td>"+EG_TS_U_8SQ7+"</td><td>"+U_8SQ7_T+"</td></tr>"));
	
}
if(!WATANIYA_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>WATANIYA</td> <td>"+Com_TS_WATANIYA+"</td><td>"+AE_TS_WATANIYA+"</td><td>"+SA_TS_WATANIYA+"</td><td>"+EG_TS_WATANIYA+"</td><td>"+WATANIYA_T+"</td></tr>"));
	
}
if(!A_AR_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabia</td> <td>"+Com_TS_A_AR+"</td><td>"+AE_TS_A_AR+"</td><td>"+SA_TS_A_AR+"</td><td>"+EG_TS_A_AR+"</td><td>"+A_AR_T+"</td></tr>"));
	
}
if(!A_AR_E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabiaEgypt</td> <td>"+Com_TS_A_AR_E+"</td><td>"+AE_TS_A_AR_E+"</td><td>"+SA_TS_A_AR_E+"</td><td>"+EG_TS_A_AR_E+"</td><td>"+A_AR_E_T+"</td></tr>"));
	
}
if(!A_AR_M_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabiaMoroc</td> <td>"+Com_TS_A_AR_M+"</td><td>"+AE_TS_A_AR_M+"</td><td>"+SA_TS_A_AR_M+"</td><td>"+EG_TS_A_AR_M+"</td><td>"+A_AR_M_T+"</td></tr>"));
	
} 
if(!A_I_E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirIndiaExpress</td> <td>"+Com_TS_A_I_E+"</td><td>"+AE_TS_A_I_E+"</td><td>"+SA_TS_A_I_E+"</td><td>"+EG_TS_A_I_E+"</td><td>"+A_I_E_T+"</td></tr>"));
	
} 
if(!FlyDubai_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>FlyDubai</td> <td>"+Com_TS_FlyDubai+"</td><td>"+AE_TS_FlyDubai+"</td><td>"+SA_TS_FlyDubai+"</td><td>"+EG_TS_FlyDubai+"</td><td>"+FlyDubai_T+"</td></tr>"));
	
} 
if(!Flynas_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Flynas</td> <td>"+Com_TS_Flynas+"</td><td>"+AE_TS_Flynas+"</td><td>"+SA_TS_Flynas+"</td><td>"+EG_TS_Flynas+"</td><td>"+Flynas_T+"</td></tr>"));

} 

//Equal TO Zero

/*if(G_3R1G_AD.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_TS_G_3R1+"</td><td>"+AE_TS_G_3R1+"</td><td>"+SA_TS_G_3R1+"</td><td>"+EG_TS_G_3R1+"</td><td>"+G_3R1G_T+"</td></tr>"));

}
if(G_570E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-570E</td> <td>"+Com_TS_G_570E+"</td><td>"+AE_TS_G_570E+"</td><td>"+SA_TS_G_570E+"</td><td>"+EG_TS_G_570E+"</td><td>"+G_570E_T+"</td></tr>"));
	
}
if(G_5N61_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-5N61</td> <td>"+Com_TS_G_5N61+"</td><td>"+AE_TS_G_5N61+"</td><td>"+SA_TS_G_5N61+"</td><td>"+EG_TS_G_5N61+"</td><td>"+G_5N61_T+"</td></tr>"));
	
}
if(G_7FK5_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7FK5</td> <td>"+Com_TS_G_7FK5+"</td><td>"+AE_TS_G_7FK5+"</td><td>"+SA_TS_G_7FK5+"</td><td>"+EG_TS_G_7FK5+"</td><td>"+G_7FK5_T+"</td></tr>"));
	
}
if(G_7JY2_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7JY2</td> <td>"+Com_TS_G_7JY2+"</td><td>"+AE_TS_G_7JY2+"</td><td>"+SA_TS_G_7JY2+"</td><td>"+EG_TS_G_7JY2+"</td><td>"+G_7JY2_T+"</td></tr>"));
	
}
if(G_7X7W_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7X7W</td> <td>"+Com_TS_G_7X7W+"</td><td>"+AE_TS_G_7X7W+"</td><td>"+SA_TS_G_7X7W+"</td><td>"+EG_TS_G_7X7W+"</td><td>"+G_7X7W_T+"</td></tr>"));
	
}
if(G_802N_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-802N</td> <td>"+Com_TS_G_802N+"</td><td>"+AE_TS_G_802N+"</td><td>"+SA_TS_G_802N+"</td><td>"+EG_TS_G_802N+"</td><td>"+G_802N_T+"</td></tr>"));
	
}
if(G_802R_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-802R</td> <td>"+Com_TS_G_802R+"</td><td>"+AE_TS_G_802R+"</td><td>"+SA_TS_G_802R+"</td><td>"+EG_TS_G_802R+"</td><td>"+G_802R_T+"</td></tr>"));
	
}
if(G_8SQ7_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-8SQ7</td> <td>"+Com_TS_G_8SQ7+"</td><td>"+AE_TS_G_8SQ7+"</td><td>"+SA_TS_G_8SQ7+"</td><td>"+EG_TS_G_8SQ7+"</td><td>"+G_8SQ7_T+"</td></tr>"));
	
}
if(JAZEERA_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>JAZEERA</td> <td>"+Com_TS_JAZEERA+"</td><td>"+AE_TS_JAZEERA+"</td><td>"+SA_TS_JAZEERA+"</td><td>"+EG_TS_JAZEERA+"</td><td>"+JAZEERA_T+"</td></tr>"));
	
}
if(KIWI_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>KIWI</td> <td>"+Com_TS_KIWI+"</td><td>"+AE_TS_KIWI+"</td><td>"+SA_TS_KIWI+"</td><td>"+EG_TS_KIWI+"</td><td>"+KIWI_T+"</td></tr>"));
	
}
if(Manual_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Manual</td> <td>"+Com_TS_M_u+"</td><td>"+AE_TS_M_u+"</td><td>"+SA_TS_M_u+"</td><td>"+EG_TS_M_u+"</td><td>"+Manual_T+"</td></tr>"));
	
}
if(My_Fly_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>MystiFly</td> <td>"+Com_TS_My_Fly+"</td><td>"+AE_TS_My_Fly+"</td><td>"+SA_TS_My_Fly+"</td><td>"+EG_TS_My_Fly+"</td><td>"+My_Fly_T+"</td></tr>"));
	
}
if(NESMA_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>NESMA</td> <td>"+Com_TS_NESMA+"</td><td>"+AE_TS_NESMA+"</td><td>"+SA_TS_NESMA+"</td><td>"+EG_TS_NESMA+"</td><td>"+NESMA_T+"</td></tr>"));
	
}
if(PEGASUS_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>PEGASUS</td> <td>"+Com_TS_PEGASUS+"</td><td>"+AE_TS_PEGASUS+"</td><td>"+SA_TS_PEGASUS+"</td><td>"+EG_TS_PEGASUS+"</td><td>"+PEGASUS_T+"</td></tr>"));
	
}
if(S_9JFH_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_9JFH</td> <td>"+Com_TS_S_9JFH+"</td><td>"+AE_TS_S_9JFH+"</td><td>"+SA_TS_S_9JFH+"</td><td>"+EG_TS_S_9JFH+"</td><td>"+S_9JFH_T+"</td></tr>"));
	
}
if(S_ID2I_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_ID2I</td> <td>"+Com_TS_S_ID2I+"</td><td>"+AE_TS_S_ID2I+"</td><td>"+SA_TS_S_ID2I+"</td><td>"+EG_TS_S_ID2I+"</td><td>"+S_ID2I_T+"</td></tr>"));
	
}
if(S_L8YI_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L8YI</td> <td>"+Com_TS_S_L8YI+"</td><td>"+AE_TS_S_L8YI+"</td><td>"+SA_TS_S_L8YI+"</td><td>"+EG_TS_S_L8YI+"</td><td>"+S_L8YI_T+"</td></tr>"));
	
}
if(S_L9AI_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L9AI</td> <td>"+Com_TS_S_L9AI+"</td><td>"+AE_TS_S_L9AI+"</td><td>"+SA_TS_S_L9AI+"</td><td>"+EG_TS_S_L9AI+"</td><td>"+S_L9AI_T+"</td></tr>"));
	
}
if(S_L9CI_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L9CI</td> <td>"+Com_TS_S_L9CI+"</td><td>"+AE_TS_S_L9CI+"</td><td>"+SA_TS_S_L9CI+"</td><td>"+EG_TS_S_L9CI+"</td><td>"+S_L9CI_T+"</td></tr>"));
	
}
if(S_T13I_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_T13I</td> <td>"+Com_TS_S_T13I+"</td><td>"+AE_TS_S_T13I+"</td><td>"+SA_TS_S_T13I+"</td><td>"+EG_TS_S_T13I+"</td><td>"+S_T13I_T+"</td></tr>"));
	
}
if(S_T20I_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_T20I</td> <td>"+Com_TS_S_T20I+"</td><td>"+AE_TS_S_T20I+"</td><td>"+SA_TS_S_T20I+"</td><td>"+EG_TS_S_T20I+"</td><td>"+S_T20I_T+"</td></tr>"));
	
}
if(SALAM_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SALAM</td> <td>"+Com_TS_SALAM+"</td><td>"+AE_TS_SALAM+"</td><td>"+SA_TS_SALAM+"</td><td>"+EG_TS_SALAM+"</td><td>"+SALAM_T+"</td></tr>"));
	
}
if(S_Jet_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SpiceJet</td> <td>"+Com_TS_S_Jet+"</td><td>"+AE_TS_S_Jet+"</td><td>"+SA_TS_S_Jet+"</td><td>"+EG_TS_S_Jet+"</td><td>"+S_Jet_T+"</td></tr>"));
	
}
if(U_3R1G_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_3R1G</td> <td>"+Com_TS_U_3R1G+"</td><td>"+AE_TS_U_3R1G+"</td><td>"+SA_TS_U_3R1G+"</td><td>"+EG_TS_U_3R1G+"</td><td>"+U_3R1G_T+"</td></tr>"));
	
}
if(U_570E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_570E</td> <td>"+Com_TS_U_570E+"</td><td>"+AE_TS_U_570E+"</td><td>"+SA_TS_U_570E+"</td><td>"+EG_TS_U_570E+"</td><td>"+U_570E_T+"</td></tr>"));
	
}
if(U_5N61_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_5N61</td> <td>"+Com_TS_U_5N61+"</td><td>"+AE_TS_U_5N61+"</td><td>"+SA_TS_U_5N61+"</td><td>"+EG_TS_U_5N61+"</td><td>"+U_5N61_T+"</td></tr>"));
	
}
if(U_6E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_6E</td> <td>"+Com_TS_U_6E+"</td><td>"+AE_TS_U_6E+"</td><td>"+SA_TS_U_6E+"</td><td>"+EG_TS_U_6E+"</td><td>"+U_6E_T+"</td></tr>"));
	
}
if(U_7FK5_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_7FK5</td> <td>"+Com_TS_U_7FK5+"</td><td>"+AE_TS_U_7FK5+"</td><td>"+SA_TS_U_7FK5+"</td><td>"+EG_TS_U_7FK5+"</td><td>"+U_7FK5_T+"</td></tr>"));
	
}
if(U_7JY2_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_7JY2</td> <td>"+Com_TS_U_7JY2+"</td><td>"+AE_TS_U_7JY2+"</td><td>"+SA_TS_U_7JY2+"</td><td>"+EG_TS_U_7JY2+"</td><td>"+U_7JY2_T+"</td></tr>"));
	
}
if(U_802N_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_802N</td> <td>"+Com_TS_U_802N+"</td><td>"+AE_TS_U_802N+"</td><td>"+SA_TS_U_802N+"</td><td>"+EG_TS_U_802N+"</td><td>"+U_802N_T+"</td></tr>"));
	
}
if(U_802R_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_802R</td> <td>"+Com_TS_U_802R+"</td><td>"+AE_TS_U_802R+"</td><td>"+SA_TS_U_802R+"</td><td>"+EG_TS_U_802R+"</td><td>"+U_802R_T+"</td></tr>"));
	
}
if(U_8SQ7_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_8SQ7</td> <td>"+Com_TS_U_8SQ7+"</td><td>"+AE_TS_U_8SQ7+"</td><td>"+SA_TS_U_8SQ7+"</td><td>"+EG_TS_U_8SQ7+"</td><td>"+U_8SQ7_T+"</td></tr>"));
	
}
if(WATANIYA_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>WATANIYA</td> <td>"+Com_TS_WATANIYA+"</td><td>"+AE_TS_WATANIYA+"</td><td>"+SA_TS_WATANIYA+"</td><td>"+EG_TS_WATANIYA+"</td><td>"+WATANIYA_T+"</td></tr>"));
	
}
if(A_AR_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabia</td> <td>"+Com_TS_A_AR+"</td><td>"+AE_TS_A_AR+"</td><td>"+SA_TS_A_AR+"</td><td>"+EG_TS_A_AR+"</td><td>"+A_AR_T+"</td></tr>"));
	
}
if(A_AR_E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabiaEgypt</td> <td>"+Com_TS_A_AR_E+"</td><td>"+AE_TS_A_AR_E+"</td><td>"+SA_TS_A_AR_E+"</td><td>"+EG_TS_A_AR_E+"</td><td>"+A_AR_E_T+"</td></tr>"));
	
}
if(A_AR_M_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabiaMoroc</td> <td>"+Com_TS_A_AR_M+"</td><td>"+AE_TS_A_AR_M+"</td><td>"+SA_TS_A_AR_M+"</td><td>"+EG_TS_A_AR_M+"</td><td>"+A_AR_M_T+"</td></tr>"));
	
} 
if(A_I_E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirIndiaExpress</td> <td>"+Com_TS_A_I_E+"</td><td>"+AE_TS_A_I_E+"</td><td>"+SA_TS_A_I_E+"</td><td>"+EG_TS_A_I_E+"</td><td>"+A_I_E_T+"</td></tr>"));
	
} 
if(FlyDubai_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>FlyDubai</td> <td>"+Com_TS_FlyDubai+"</td><td>"+AE_TS_FlyDubai+"</td><td>"+SA_TS_FlyDubai+"</td><td>"+EG_TS_FlyDubai+"</td><td>"+FlyDubai_T+"</td></tr>"));
	
} 
if(Flynas_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Flynas</td> <td>"+Com_TS_Flynas+"</td><td>"+AE_TS_Flynas+"</td><td>"+SA_TS_Flynas+"</td><td>"+EG_TS_Flynas+"</td><td>"+Flynas_T+"</td></tr>"));

} */

email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>GRAND TOTAL</td> <td>"+Com_TS_Supplier_Transaction_Total+"</td><td>"+AE_TS_Supplier_Transaction_Total+"</td><td>"+SA_TS_Supplier_Transaction_Total+"</td><td>"+EG_TS_Supplier_Transaction_Total+"</td><td>"+All_Sup_TransactionSuccess_total+"</td></tr>"));











//Transaction Success
/*email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=44 >SUPPLIERS TRANSACTION SUCCESSFUL</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_TS_G_3R1+"</td><td>"+AE_TS_G_3R1+"</td><td>"+SA_TS_G_3R1+"</td><td>"+EG_TS_G_3R1+"</td><td>"+G_3R1G_T+"</td></tr>"));

email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-570E</td> <td>"+Com_TS_G_570E+"</td><td>"+AE_TS_G_570E+"</td><td>"+SA_TS_G_570E+"</td><td>"+EG_TS_G_570E+"</td><td>"+G_570E_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-5N61</td> <td>"+Com_TS_G_5N61+"</td><td>"+AE_TS_G_5N61+"</td><td>"+SA_TS_G_5N61+"</td><td>"+EG_TS_G_5N61+"</td><td>"+G_5N61_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7FK5</td> <td>"+Com_TS_G_7FK5+"</td><td>"+AE_TS_G_7FK5+"</td><td>"+SA_TS_G_7FK5+"</td><td>"+EG_TS_G_7FK5+"</td><td>"+G_7FK5_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7JY2</td> <td>"+Com_TS_G_7JY2+"</td><td>"+AE_TS_G_7JY2+"</td><td>"+SA_TS_G_7JY2+"</td><td>"+EG_TS_G_7JY2+"</td><td>"+G_7JY2_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7X7W</td> <td>"+Com_TS_G_7X7W+"</td><td>"+AE_TS_G_7X7W+"</td><td>"+SA_TS_G_7X7W+"</td><td>"+EG_TS_G_7X7W+"</td><td>"+G_7X7W_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-802N</td> <td>"+Com_TS_G_802N+"</td><td>"+AE_TS_G_802N+"</td><td>"+SA_TS_G_802N+"</td><td>"+EG_TS_G_802N+"</td><td>"+G_802N_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-802R</td> <td>"+Com_TS_G_802R+"</td><td>"+AE_TS_G_802R+"</td><td>"+SA_TS_G_802R+"</td><td>"+EG_TS_G_802R+"</td><td>"+G_802R_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-8SQ7</td> <td>"+Com_TS_G_8SQ7+"</td><td>"+AE_TS_G_8SQ7+"</td><td>"+SA_TS_G_8SQ7+"</td><td>"+EG_TS_G_8SQ7+"</td><td>"+G_8SQ7_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>JAZEERA</td> <td>"+Com_TS_JAZEERA+"</td><td>"+AE_TS_JAZEERA+"</td><td>"+SA_TS_JAZEERA+"</td><td>"+EG_TS_JAZEERA+"</td><td>"+JAZEERA_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>KIWI</td> <td>"+Com_TS_KIWI+"</td><td>"+AE_TS_KIWI+"</td><td>"+SA_TS_KIWI+"</td><td>"+EG_TS_KIWI+"</td><td>"+KIWI_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Manual</td> <td>"+Com_TS_M_u+"</td><td>"+AE_TS_M_u+"</td><td>"+SA_TS_M_u+"</td><td>"+EG_TS_M_u+"</td><td>"+Manual_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>MystiFly</td> <td>"+Com_TS_My_Fly+"</td><td>"+AE_TS_My_Fly+"</td><td>"+SA_TS_My_Fly+"</td><td>"+EG_TS_My_Fly+"</td><td>"+My_Fly_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>NESMA</td> <td>"+Com_TS_NESMA+"</td><td>"+AE_TS_NESMA+"</td><td>"+SA_TS_NESMA+"</td><td>"+EG_TS_NESMA+"</td><td>"+NESMA_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>PEGASUS</td> <td>"+Com_TS_PEGASUS+"</td><td>"+AE_TS_PEGASUS+"</td><td>"+SA_TS_PEGASUS+"</td><td>"+EG_TS_PEGASUS+"</td><td>"+PEGASUS_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_9JFH</td> <td>"+Com_TS_S_9JFH+"</td><td>"+AE_TS_S_9JFH+"</td><td>"+SA_TS_S_9JFH+"</td><td>"+EG_TS_S_9JFH+"</td><td>"+S_9JFH_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_ID2I</td> <td>"+Com_TS_S_ID2I+"</td><td>"+AE_TS_S_ID2I+"</td><td>"+SA_TS_S_ID2I+"</td><td>"+EG_TS_S_ID2I+"</td><td>"+S_ID2I_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L8YI</td> <td>"+Com_TS_S_L8YI+"</td><td>"+AE_TS_S_L8YI+"</td><td>"+SA_TS_S_L8YI+"</td><td>"+EG_TS_S_L8YI+"</td><td>"+S_L8YI_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L9AI</td> <td>"+Com_TS_S_L9AI+"</td><td>"+AE_TS_S_L9AI+"</td><td>"+SA_TS_S_L9AI+"</td><td>"+EG_TS_S_L9AI+"</td><td>"+S_L9AI_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L9CI</td> <td>"+Com_TS_S_L9CI+"</td><td>"+AE_TS_S_L9CI+"</td><td>"+SA_TS_S_L9CI+"</td><td>"+EG_TS_S_L9CI+"</td><td>"+S_L9CI_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_T13I</td> <td>"+Com_TS_S_T13I+"</td><td>"+AE_TS_S_T13I+"</td><td>"+SA_TS_S_T13I+"</td><td>"+EG_TS_S_T13I+"</td><td>"+S_T13I_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_T20I</td> <td>"+Com_TS_S_T20I+"</td><td>"+AE_TS_S_T20I+"</td><td>"+SA_TS_S_T20I+"</td><td>"+EG_TS_S_T20I+"</td><td>"+S_T20I_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SALAM</td> <td>"+Com_TS_SALAM+"</td><td>"+AE_TS_SALAM+"</td><td>"+SA_TS_SALAM+"</td><td>"+EG_TS_SALAM+"</td><td>"+SALAM_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SpiceJet</td> <td>"+Com_TS_S_Jet+"</td><td>"+AE_TS_S_Jet+"</td><td>"+SA_TS_S_Jet+"</td><td>"+EG_TS_S_Jet+"</td><td>"+S_Jet_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_3R1G</td> <td>"+Com_TS_U_3R1G+"</td><td>"+AE_TS_U_3R1G+"</td><td>"+SA_TS_U_3R1G+"</td><td>"+EG_TS_U_3R1G+"</td><td>"+U_3R1G_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_570E</td> <td>"+Com_TS_U_570E+"</td><td>"+AE_TS_U_570E+"</td><td>"+SA_TS_U_570E+"</td><td>"+EG_TS_U_570E+"</td><td>"+U_570E_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_5N61</td> <td>"+Com_TS_U_5N61+"</td><td>"+AE_TS_U_5N61+"</td><td>"+SA_TS_U_5N61+"</td><td>"+EG_TS_U_5N61+"</td><td>"+U_5N61_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_6E</td> <td>"+Com_TS_U_6E+"</td><td>"+AE_TS_U_6E+"</td><td>"+SA_TS_U_6E+"</td><td>"+EG_TS_U_6E+"</td><td>"+U_6E_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_7FK5</td> <td>"+Com_TS_U_7FK5+"</td><td>"+AE_TS_U_7FK5+"</td><td>"+SA_TS_U_7FK5+"</td><td>"+EG_TS_U_7FK5+"</td><td>"+U_7FK5_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_7JY2</td> <td>"+Com_TS_U_7JY2+"</td><td>"+AE_TS_U_7JY2+"</td><td>"+SA_TS_U_7JY2+"</td><td>"+EG_TS_U_7JY2+"</td><td>"+U_7JY2_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_802N</td> <td>"+Com_TS_U_802N+"</td><td>"+AE_TS_U_802N+"</td><td>"+SA_TS_U_802N+"</td><td>"+EG_TS_U_802N+"</td><td>"+U_802N_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_802R</td> <td>"+Com_TS_U_802R+"</td><td>"+AE_TS_U_802R+"</td><td>"+SA_TS_U_802R+"</td><td>"+EG_TS_U_802R+"</td><td>"+U_802R_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_8SQ7</td> <td>"+Com_TS_U_8SQ7+"</td><td>"+AE_TS_U_8SQ7+"</td><td>"+SA_TS_U_8SQ7+"</td><td>"+EG_TS_U_8SQ7+"</td><td>"+U_8SQ7_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>WATANIYA</td> <td>"+Com_TS_WATANIYA+"</td><td>"+AE_TS_WATANIYA+"</td><td>"+SA_TS_WATANIYA+"</td><td>"+EG_TS_WATANIYA+"</td><td>"+WATANIYA_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabia</td> <td>"+Com_TS_A_AR+"</td><td>"+AE_TS_A_AR+"</td><td>"+SA_TS_A_AR+"</td><td>"+EG_TS_A_AR+"</td><td>"+A_AR_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabiaEgypt</td> <td>"+Com_TS_A_AR_E+"</td><td>"+AE_TS_A_AR_E+"</td><td>"+SA_TS_A_AR_E+"</td><td>"+EG_TS_A_AR_E+"</td><td>"+A_AR_E_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabiaMoroc</td> <td>"+Com_TS_A_AR_M+"</td><td>"+AE_TS_A_AR_M+"</td><td>"+SA_TS_A_AR_M+"</td><td>"+EG_TS_A_AR_M+"</td><td>"+A_AR_M_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirIndiaExpress</td> <td>"+Com_TS_A_I_E+"</td><td>"+AE_TS_A_I_E+"</td><td>"+SA_TS_A_I_E+"</td><td>"+EG_TS_A_I_E+"</td><td>"+A_I_E_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>FlyDubai</td> <td>"+Com_TS_FlyDubai+"</td><td>"+AE_TS_FlyDubai+"</td><td>"+SA_TS_FlyDubai+"</td><td>"+EG_TS_FlyDubai+"</td><td>"+FlyDubai_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Flynas</td> <td>"+Com_TS_Flynas+"</td><td>"+AE_TS_Flynas+"</td><td>"+SA_TS_Flynas+"</td><td>"+EG_TS_Flynas+"</td><td>"+Flynas_T+"</td></tr>"));


email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>GRAND TOTAL</td> <td>"+Com_TS_Supplier_Transaction_Total+"</td><td>"+AE_TS_Supplier_Transaction_Total+"</td><td>"+SA_TS_Supplier_Transaction_Total+"</td><td>"+EG_TS_Supplier_Transaction_Total+"</td><td>"+All_Sup_TransactionSuccess_total+"</td></tr>"));
//email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>TOTAL</td> <td>"+Com_TS_Supplier_Transaction_Total+"</td><td>"+AE_TS_Supplier_Transaction_Total+"</td><td>"+SA_TS_Supplier_Transaction_Total+"</td><td>"+EG_TS_Supplier_Transaction_Total+"</td></tr>"));
//email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>GRAND TOTAL</td> <th colspan=5>"+All_Sup_TransactionSuccess_total+"</th></tr>"));	


*/


//Transaction Success
/*email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >SUPPLIERS TRANSACTION SUCCESSFUL</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Com_TS_G_3R1+"</td><td>"+Com_TS_G_570E+"</td><td>"+Com_TS_G_5N61+"</td><td>"+Com_TS_G_7FK5+"</td><td>"+Com_TS_G_7JY2+"</td><td>"+Com_TS_G_7X7W+"</td><td>"+Com_TS_G_802N+"</td><td>"+Com_TS_G_802R+"</td><td>"+Com_TS_G_8SQ7+"</td><td>"+Com_TS_JAZEERA+"</td><td>"+Com_TS_KIWI+"</td><td>"+Com_TS_M_u+"</td><td>"+Com_TS_My_Fly+"</td><td>"+Com_TS_NESMA+"</td><td>"+Com_TS_PEGASUS+"</td><td>"+Com_TS_S_9JFH+"</td>"
				+ "<td>"+Com_TS_S_ID2I+"</td><td>"+Com_TS_S_L8YI+"</td><td>"+Com_TS_S_L9AI+"</td><td>"+Com_TS_S_L9CI+"</td><td>"+Com_TS_S_T13I+"</td><td>"+Com_TS_S_T20I+"</td><td>"+Com_TS_SALAM+"</td><td>"+Com_TS_S_Jet+"</td><td>"+Com_TS_U_3R1G+"</td><td>"+Com_TS_U_570E+"</td><td>"+Com_TS_U_5N61+"</td><td>"+Com_TS_U_6E+"</td><td>"+Com_TS_U_7FK5+"</td><td>"+Com_TS_U_7JY2+"</td><td>"+Com_TS_U_802N+"</td><td>"+Com_TS_U_802R+"</td><td>"+Com_TS_U_8SQ7+"</td><td>"+Com_TS_WATANIYA+"</td><td>"+Com_TS_A_AR+"</td><td>"+Com_TS_A_AR_E+"</td><td>"+Com_TS_A_AR_M+"</td><td>"+Com_TS_A_I_E+"</td><td>"+Com_TS_FlyDubai+"</td><td>"+Com_TS_Flynas+"</td><td>"+Com_TS_Supplier_Transaction_Total+"</td><td rowspan=5>"+All_Sup_TransactionSuccess_total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_TS_G_3R1+"</td><td>"+AE_TS_G_570E+"</td><td>"+AE_TS_G_5N61+"</td><td>"+AE_TS_G_7FK5+"</td><td>"+AE_TS_G_7JY2+"</td><td>"+AE_TS_G_7X7W+"</td><td>"+AE_TS_G_802N+"</td><td>"+AE_TS_G_802R+"</td><td>"+AE_TS_G_8SQ7+"</td><td>"+AE_TS_JAZEERA+"</td><td>"+AE_TS_KIWI+"</td><td>"+AE_TS_M_u+"</td><td>"+AE_TS_My_Fly+"</td><td>"+AE_TS_NESMA+"</td><td>"+AE_TS_PEGASUS+"</td><td>"+AE_TS_S_9JFH+"</td>"
				+ "<td>"+AE_TS_S_ID2I+"</td><td>"+AE_TS_S_L8YI+"</td><td>"+AE_TS_S_L9AI+"</td><td>"+AE_TS_S_L9CI+"</td><td>"+AE_TS_S_T13I+"</td><td>"+AE_TS_S_T20I+"</td><td>"+AE_TS_SALAM+"</td><td>"+AE_TS_S_Jet+"</td><td>"+AE_TS_U_3R1G+"</td><td>"+AE_TS_U_570E+"</td><td>"+AE_TS_U_5N61+"</td><td>"+AE_TS_U_6E+"</td><td>"+AE_TS_U_7FK5+"</td><td>"+AE_TS_U_7JY2+"</td><td>"+AE_TS_U_802N+"</td><td>"+AE_TS_U_802R+"</td><td>"+AE_TS_U_8SQ7+"</td><td>"+AE_TS_WATANIYA+"</td><td>"+AE_TS_A_AR+"</td><td>"+AE_TS_A_AR_E+"</td><td>"+AE_TS_A_AR_M+"</td><td>"+AE_TS_A_I_E+"</td><td>"+AE_TS_FlyDubai+"</td><td>"+AE_TS_Flynas+"</td><td>"+AE_TS_Supplier_Transaction_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_TS_G_3R1+"</td><td>"+SA_TS_G_570E+"</td><td>"+SA_TS_G_5N61+"</td><td>"+SA_TS_G_7FK5+"</td><td>"+SA_TS_G_7JY2+"</td><td>"+SA_TS_G_7X7W+"</td><td>"+SA_TS_G_802N+"</td><td>"+SA_TS_G_802R+"</td><td>"+SA_TS_G_8SQ7+"</td><td>"+SA_TS_JAZEERA+"</td><td>"+SA_TS_KIWI+"</td><td>"+SA_TS_M_u+"</td><td>"+SA_TS_My_Fly+"</td><td>"+SA_TS_NESMA+"</td><td>"+SA_TS_PEGASUS+"</td><td>"+SA_TS_S_9JFH+"</td>"
				+ "<td>"+SA_TS_S_ID2I+"</td><td>"+SA_TS_S_L8YI+"</td><td>"+SA_TS_S_L9AI+"</td><td>"+SA_TS_S_L9CI+"</td><td>"+SA_TS_S_T13I+"</td><td>"+SA_TS_S_T20I+"</td><td>"+SA_TS_SALAM+"</td><td>"+SA_TS_S_Jet+"</td><td>"+SA_TS_U_3R1G+"</td><td>"+SA_TS_U_570E+"</td><td>"+SA_TS_U_5N61+"</td><td>"+SA_TS_U_6E+"</td><td>"+SA_TS_U_7FK5+"</td><td>"+SA_TS_U_7JY2+"</td><td>"+SA_TS_U_802N+"</td><td>"+SA_TS_U_802R+"</td><td>"+SA_TS_U_8SQ7+"</td><td>"+SA_TS_WATANIYA+"</td><td>"+SA_TS_A_AR+"</td><td>"+SA_TS_A_AR_E+"</td><td>"+SA_TS_A_AR_M+"</td><td>"+SA_TS_A_I_E+"</td><td>"+SA_TS_FlyDubai+"</td><td>"+SA_TS_Flynas+"</td><td>"+SA_TS_Supplier_Transaction_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_TS_G_3R1+"</td><td>"+EG_TS_G_570E+"</td><td>"+EG_TS_G_5N61+"</td><td>"+EG_TS_G_7FK5+"</td><td>"+EG_TS_G_7JY2+"</td><td>"+EG_TS_G_7X7W+"</td><td>"+EG_TS_G_802N+"</td><td>"+EG_TS_G_802R+"</td><td>"+EG_TS_G_8SQ7+"</td><td>"+EG_TS_JAZEERA+"</td><td>"+EG_TS_KIWI+"</td><td>"+EG_TS_M_u+"</td><td>"+EG_TS_My_Fly+"</td><td>"+EG_TS_NESMA+"</td><td>"+EG_TS_PEGASUS+"</td><td>"+EG_TS_S_9JFH+"</td>"
				+ "<td>"+EG_TS_S_ID2I+"</td><td>"+EG_TS_S_L8YI+"</td><td>"+EG_TS_S_L9AI+"</td><td>"+EG_TS_S_L9CI+"</td><td>"+EG_TS_S_T13I+"</td><td>"+EG_TS_S_T20I+"</td><td>"+EG_TS_SALAM+"</td><td>"+EG_TS_S_Jet+"</td><td>"+EG_TS_U_3R1G+"</td><td>"+EG_TS_U_570E+"</td><td>"+EG_TS_U_5N61+"</td><td>"+EG_TS_U_6E+"</td><td>"+EG_TS_U_7FK5+"</td><td>"+EG_TS_U_7JY2+"</td><td>"+EG_TS_U_802N+"</td><td>"+EG_TS_U_802R+"</td><td>"+EG_TS_U_8SQ7+"</td><td>"+EG_TS_WATANIYA+"</td><td>"+EG_TS_A_AR+"</td><td>"+EG_TS_A_AR_E+"</td><td>"+EG_TS_A_AR_M+"</td><td>"+EG_TS_A_I_E+"</td><td>"+EG_TS_FlyDubai+"</td><td>"+EG_TS_Flynas+"</td><td>"+EG_TS_Supplier_Transaction_Total+"</td></tr>"));
*/








	


email.addTo("nagababu.cherukumalli@rehlat.com");


System.out.println("3");
email.send();
System.out.println("END");



















}

}
