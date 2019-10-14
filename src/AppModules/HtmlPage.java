package AppModules;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.openqa.selenium.WebDriver;

public class HtmlPage extends Flights_BookingStatus_From_CallCenter {
	
	public static void Html_Css(int iTestCaseRow,WebDriver driver) throws Exception {
		
		COMDomainNames=String.format("%30s %30s %15s %15s %15s %15s %15s", "COM", "WEGO", "B2C", "MOBIOS", "MOBAPP","SKYSCN", "TOTAL");
		StringBuilder htmlStringBuilder=new StringBuilder();
		
		 htmlStringBuilder.append("<html><head><title>ALL Status </title></head>");
         htmlStringBuilder.append("<style>");
         
         htmlStringBuilder.append("table, th, td { border: 1px solid black; border-collapse: collapse;} ");
         htmlStringBuilder.append("th{background-color: orange;}.Yellow{background-color: yellow;}.orange{background-color: orange;}");
         
         htmlStringBuilder.append("</style></head>");
         
         
         
         //append body
         htmlStringBuilder.append("<body>");
         
         htmlStringBuilder.append("<table> <tr><th> </th> <th></th> <th>B2C</th><th>MOBAPP</th><th>MOBIOS</th> <th>WEGO</th> <th>SKYSON</th>   <th> Grand Total </th></tr>");

		//Transaction Successful
		htmlStringBuilder.append("<tr class=yellow><td rowspan=5 >Transaction Successful</td><tr class=yellow><td>COM</td> <td>"+Com_TS_Wego+"</td><td>"+Com_TS_b2c+"</td><td>"+Com_TS_MobIos+"</td><td>"+Com_TS_MobAnd+"</td><td>"+Com_TS_skyscan+"</td><td>"+Com_TS_Transaction_Total+"</td></tr> ");
		htmlStringBuilder.append("<tr class=yellow><td>SA</td> <td>"+SA_TS_Wego+"</td><td>"+SA_TS_b2c+"</td><td>"+SA_TS_MobIos+"</td><td>"+SA_TS_MobAnd+"</td><td>"+SA_TS_skyscan+"</td><td>"+SA_TS_Transaction_Total+"</td></tr>");
		htmlStringBuilder.append("<tr class=yellow><td>AE</td> <td>"+AE_TS_Wego+"</td><td>"+AE_TS_b2c+"</td><td>"+AE_TS_MobIos+"</td><td>"+AE_TS_MobAnd+"</td><td>"+AE_TS_skyscan+"</td><td>"+AE_TS_Transaction_Total+"</td></tr>");
        htmlStringBuilder.append("<tr class=yellow><td>EG</td> <td>"+EG_TS_Wego+"</td><td>"+EG_TS_b2c+"</td><td>"+EG_TS_MobIos+"</td><td>"+EG_TS_MobAnd+"</td><td>"+EG_TS_skyscan+"</td><td>"+EG_TS_Transaction_Total+"</td></tr>");
		
   		 
   		 //Sold Outs
   		 
   		htmlStringBuilder.append("<tr class=orange><td rowspan=5>Soldout</td><tr class=orange><td>COM</td> <td>"+Com_SD_Wego+"</td><td>"+Com_SD_b2c+"</td><td>"+Com_SD_MobIos+"</td><td>"+Com_SD_MobAnd+"</td><td>"+Com_SD_skyscan+"</td><td>"+Com_SD_SoldOut_Total+"</td></tr>");
   	    htmlStringBuilder.append("<tr class=orange><td>SA</td> <td>"+SA_SD_Wego+"</td><td>"+SA_SD_b2c+"</td><td>"+SA_SD_MobIos+"</td><td>"+SA_SD_MobAnd+"</td><td>"+SA_SD_skyscan+"</td><td>"+SA_SD_SoldOut_Total+"</td></tr>");
		htmlStringBuilder.append("<tr class=orange><td>AE</td> <td>"+AE_SD_Wego+"</td><td>"+AE_SD_b2c+"</td><td>"+AE_SD_MobIos+"</td><td>"+AE_SD_MobAnd+"</td><td>"+AE_SD_skyscan+"</td><td>"+AE_SD_SoldOut_Total+"</td></tr>");
        htmlStringBuilder.append("<tr class=orange><td>EG</td> <td>"+EG_SD_Wego+"</td><td>"+EG_SD_b2c+"</td><td>"+EG_SD_MobIos+"</td><td>"+EG_SD_MobAnd+"</td><td>"+EG_SD_skyscan+"</td><td>"+EG_SD_SoldOut_Total+"</td></tr>");
	
	//Cancelled
	
  		 
        htmlStringBuilder.append("<tr class=yellow><td rowspan=5 >Cancelled</td><tr class=yellow><td>COM</td> <td>"+Com_CN_Wego+"</td><td>"+Com_CN_b2c+"</td><td>"+Com_CN_MobIos+"</td><td>"+Com_CN_MobAnd+"</td><td>"+Com_CN_skyscan+"</td><td>"+Com_CN_CancelledTotal+"</td></tr> ");
        htmlStringBuilder.append("<tr class=yellow><td>SA</td> <td>"+SA_CN_Wego+"</td><td>"+SA_CN_b2c+"</td><td>"+SA_CN_MobIos+"</td><td>"+SA_CN_MobAnd+"</td><td>"+SA_CN_skyscan+"</td><td>"+SA_CN_CancelledTotal+"</td></tr> ");
		htmlStringBuilder.append("<tr class=yellow><td>AE</td> <td>"+AE_CN_Wego+"</td><td>"+AE_CN_b2c+"</td><td>"+AE_CN_MobIos+"</td><td>"+AE_CN_MobAnd+"</td><td>"+AE_CN_skyscan+"</td><td>"+AE_CN_CancelledTotal+"</td></tr> ");
        htmlStringBuilder.append("<tr class=yellow><td>EG</td> <td>"+EG_CN_Wego+"</td><td>"+EG_CN_b2c+"</td><td>"+EG_CN_MobIos+"</td><td>"+EG_CN_MobAnd+"</td><td>"+EG_CN_skyscan+"</td><td>"+EG_CN_CancelledTotal+"</td></tr> ");
		
   		 
   		 //Transaction Hold
   		 
    	htmlStringBuilder.append("<tr class=orange><td rowspan=5>Transaction Hold</td><tr class=orange><td>COM</td> <td>"+Com_TH_Wego+"</td><td>"+Com_TH_b2c+"</td><td>"+Com_TH_MobIos+"</td><td>"+Com_TH_MobAnd+"</td><td>"+Com_TH_skyscan+"</td><td>"+Com_TH_Transactionhold_total+"</td></tr>");
    	htmlStringBuilder.append("<tr class=orange><td>SA</td> <td>"+SA_TH_Wego+"</td><td>"+SA_TH_b2c+"</td><td>"+SA_TH_MobIos+"</td><td>"+SA_TH_MobAnd+"</td><td>"+SA_TH_skyscan+"</td><td>"+SA_TH_Transactionhold_total+"</td></tr>");
 		htmlStringBuilder.append("<tr class=orange><td>AE</td> <td>"+AE_TH_Wego+"</td><td>"+AE_TH_b2c+"</td><td>"+AE_TH_MobIos+"</td><td>"+AE_TH_MobAnd+"</td><td>"+AE_TH_skyscan+"</td><td>"+AE_TH_Transactionhold_total+"</td></tr>");
        htmlStringBuilder.append("<tr class=orange><td>EG</td> <td>"+EG_TH_Wego+"</td><td>"+EG_TH_b2c+"</td><td>"+EG_TH_MobIos+"</td><td>"+EG_TH_MobAnd+"</td><td>"+EG_TH_skyscan+"</td><td>"+EG_TH_Transactionhold_total+"</td></tr>");
 	
   		 
   		 htmlStringBuilder.append("</table></body></html>");
   		WriteToFile(htmlStringBuilder.toString(),"AllStatus_Table.html");
	
	}

	 public static void WriteToFile(String fileContent, String fileName) throws IOException {
	        String projectPath = System.getProperty("user.dir");
	        String tempFile = projectPath + File.separator+fileName;
	        File file = new File(tempFile);
	        // if file does exists, then delete and create a new file
	        if (file.exists()) {
	            try {
	                File newFileName = new File(projectPath + File.separator+ "backup_"+fileName);
	                file.renameTo(newFileName);
	                file.createNewFile();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        //write to file with OutputStreamWriter
	        OutputStream outputStream = new FileOutputStream(file.getAbsoluteFile());
	        Writer writer=new OutputStreamWriter(outputStream);
	        writer.write(fileContent);
	        writer.close();

	    }

}
