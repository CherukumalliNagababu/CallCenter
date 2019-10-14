package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class NewReportCal {
	static int Percentage=100;
	static int zero=0;
	
	protected static int Wow_Meta;
	protected static int Wow_B2C;
	protected static int Wow_MobApp;
	protected static int Wow_Others;
	protected static int Wow_ALL_Total;
	
	protected static int Wow2_Meta;
	protected static int Wow2_B2C;
	protected static int Wow2_MobApp;
	protected static int Wow2_Others;
	protected static int Wow2_ALL_Total;

	protected static int currentDay_meta_bothtotal;
	protected static int Currentday_B2c_total;
	protected static int Currentday_mobapp_both_total;
	protected static int Currentday_others_total;
	protected static int Currentday_ALL_Total;
	
	//calculations
	//B2C
	protected static int B2C_ts_com;
	protected static int B2C_ts_ae;
	protected static int B2C_ts_sa;
	protected static int B2C_ts_eg;
	
	protected static int B2C_cp_com;
	protected static int B2C_cp_ae;
	protected static int B2C_cp_sa;
	protected static int B2C_cp_eg;
	
	protected static int B2C_th_com;
	protected static int B2C_th_ae;
	protected static int B2C_th_sa;
	protected static int B2C_th_eg;
	
	protected static int B2C_sd_com;
	protected static int B2C_sd_ae;
	protected static int B2C_sd_sa;
	protected static int B2C_sd_eg;
	
	protected static int B2C_cn_com;
	protected static int B2C_cn_ae;
	protected static int B2C_cn_sa;
	protected static int B2C_cn_eg;
	
	protected static int B2C_rp_com;
	protected static int B2C_rp_ae;
	protected static int B2C_rp_sa;
	protected static int B2C_rp_eg;
	
	//MOB_AND
	protected static int MOBAPP_ts_com;
	protected static int MOBAPP_ts_ae;
	protected static int MOBAPP_ts_sa;
	protected static int MOBAPP_ts_eg;
	
	protected static int MOBAPP_cp_com;
	protected static int MOBAPP_cp_ae;
	protected static int MOBAPP_cp_sa;
	protected static int MOBAPP_cp_eg;
	
	protected static int MOBAPP_th_com;
	protected static int MOBAPP_th_ae;
	protected static int MOBAPP_th_sa;
	protected static int MOBAPP_th_eg;
	
	protected static int MOBAPP_sd_com;
	protected static int MOBAPP_sd_ae;
	protected static int MOBAPP_sd_sa;
	protected static int MOBAPP_sd_eg;
	
	protected static int MOBAPP_cn_com;
	protected static int MOBAPP_cn_ae;
	protected static int MOBAPP_cn_sa;
	protected static int MOBAPP_cn_eg;
	
	protected static int MOBAPP_rp_com;
	protected static int MOBAPP_rp_ae;
	protected static int MOBAPP_rp_sa;
	protected static int MOBAPP_rp_eg;
	
	// MOB_IOS
	protected static int MOBIOS_ts_com;
	protected static int MOBIOS_ts_ae;
	protected static int MOBIOS_ts_sa;
	protected static int MOBIOS_ts_eg;

	protected static int MOBIOS_cp_com;
	protected static int MOBIOS_cp_ae;
	protected static int MOBIOS_cp_sa;
	protected static int MOBIOS_cp_eg;

	protected static int MOBIOS_th_com;
	protected static int MOBIOS_th_ae;
	protected static int MOBIOS_th_sa;
	protected static int MOBIOS_th_eg;

	protected static int MOBIOS_sd_com;
	protected static int MOBIOS_sd_ae;
	protected static int MOBIOS_sd_sa;
	protected static int MOBIOS_sd_eg;

	protected static int MOBIOS_cn_com;
	protected static int MOBIOS_cn_ae;
	protected static int MOBIOS_cn_sa;
	protected static int MOBIOS_cn_eg;

	protected static int MOBIOS_rp_com;
	protected static int MOBIOS_rp_ae;
	protected static int MOBIOS_rp_sa;
	protected static int MOBIOS_rp_eg;
	
	// WEGO
	protected static int WEGO_ts_com;
	protected static int WEGO_ts_ae;
	protected static int WEGO_ts_sa;
	protected static int WEGO_ts_eg;

	protected static int WEGO_cp_com;
	protected static int WEGO_cp_ae;
	protected static int WEGO_cp_sa;
	protected static int WEGO_cp_eg;

	protected static int WEGO_th_com;
	protected static int WEGO_th_ae;
	protected static int WEGO_th_sa;
	protected static int WEGO_th_eg;

	protected static int WEGO_sd_com;
	protected static int WEGO_sd_ae;
	protected static int WEGO_sd_sa;
	protected static int WEGO_sd_eg;

	protected static int WEGO_cn_com;
	protected static int WEGO_cn_ae;
	protected static int WEGO_cn_sa;
	protected static int WEGO_cn_eg;

	protected static int WEGO_rp_com;
	protected static int WEGO_rp_ae;
	protected static int WEGO_rp_sa;
	protected static int WEGO_rp_eg;
	
	
	// SKYSCAN
	protected static int SKYSCAN_ts_com;
	protected static int SKYSCAN_ts_ae;
	protected static int SKYSCAN_ts_sa;
	protected static int SKYSCAN_ts_eg;

	protected static int SKYSCAN_cp_com;
	protected static int SKYSCAN_cp_ae;
	protected static int SKYSCAN_cp_sa;
	protected static int SKYSCAN_cp_eg;

	protected static int SKYSCAN_th_com;
	protected static int SKYSCAN_th_ae;
	protected static int SKYSCAN_th_sa;
	protected static int SKYSCAN_th_eg;

	protected static int SKYSCAN_sd_com;
	protected static int SKYSCAN_sd_ae;
	protected static int SKYSCAN_sd_sa;
	protected static int SKYSCAN_sd_eg;

	protected static int SKYSCAN_cn_com;
	protected static int SKYSCAN_cn_ae;
	protected static int SKYSCAN_cn_sa;
	protected static int SKYSCAN_cn_eg;

	protected static int SKYSCAN_rp_com;
	protected static int SKYSCAN_rp_ae;
	protected static int SKYSCAN_rp_sa;
	protected static int SKYSCAN_rp_eg;
	
	// OTHERS
	protected static int OTHERS_ts_com;
	protected static int OTHERS_ts_ae;
	protected static int OTHERS_ts_sa;
	protected static int OTHERS_ts_eg;

	protected static int OTHERS_cp_com;
	protected static int OTHERS_cp_ae;
	protected static int OTHERS_cp_sa;
	protected static int OTHERS_cp_eg;

	protected static int OTHERS_th_com;
	protected static int OTHERS_th_ae;
	protected static int OTHERS_th_sa;
	protected static int OTHERS_th_eg;

	protected static int OTHERS_sd_com;
	protected static int OTHERS_sd_ae;
	protected static int OTHERS_sd_sa;
	protected static int OTHERS_sd_eg;

	protected static int OTHERS_cn_com;
	protected static int OTHERS_cn_ae;
	protected static int OTHERS_cn_sa;
	protected static int OTHERS_cn_eg;

	protected static int OTHERS_rp_com;
	protected static int OTHERS_rp_ae;
	protected static int OTHERS_rp_sa;
	protected static int OTHERS_rp_eg;

	// TS
	protected static String com_b2c_ts;
	protected static String com_mobapp_ts;
	protected static String com_mobios_ts;
	protected static String com_wego_ts;
	protected static String com_skyscan_ts;
	protected static String com_others_ts;

	protected static String ae_b2c_ts;
	protected static String ae_mobapp_ts;
	protected static String ae_mobios_ts;
	protected static String ae_wego_ts;
	protected static String ae_skyscan_ts;
	protected static String ae_others_ts;

	protected static String sa_b2c_ts;
	protected static String sa_mobapp_ts;
	protected static String sa_mobios_ts;
	protected static String sa_wego_ts;
	protected static String sa_skyscan_ts;
	protected static String sa_others_ts;

	protected static String eg_b2c_ts;
	protected static String eg_mobapp_ts;
	protected static String eg_mobios_ts;
	protected static String eg_wego_ts;
	protected static String eg_skyscan_ts;
	protected static String eg_others_ts;

	// CP

	protected static String com_b2c_cp;
	protected static String com_mobapp_cp;
	protected static String com_mobios_cp;
	protected static String com_wego_cp;
	protected static String com_skyscan_cp;
	protected static String com_others_cp;

	protected static String ae_b2c_cp;
	protected static String ae_mobapp_cp;
	protected static String ae_mobios_cp;
	protected static String ae_wego_cp;
	protected static String ae_skyscan_cp;
	protected static String ae_others_cp;

	protected static String sa_b2c_cp;
	protected static String sa_mobapp_cp;
	protected static String sa_mobios_cp;
	protected static String sa_wego_cp;
	protected static String sa_skyscan_cp;
	protected static String sa_others_cp;

	protected static String eg_b2c_cp;
	protected static String eg_mobapp_cp;
	protected static String eg_mobios_cp;
	protected static String eg_wego_cp;
	protected static String eg_skyscan_cp;
	protected static String eg_others_cp;

	// TH

	protected static String com_b2c_th;
	protected static String com_mobapp_th;
	protected static String com_mobios_th;
	protected static String com_wego_th;
	protected static String com_skyscan_th;
	protected static String com_others_th;

	protected static String ae_b2c_th;
	protected static String ae_mobapp_th;
	protected static String ae_mobios_th;
	protected static String ae_wego_th;
	protected static String ae_skyscan_th;
	protected static String ae_others_th;

	protected static String sa_b2c_th;
	protected static String sa_mobapp_th;
	protected static String sa_mobios_th;
	protected static String sa_wego_th;
	protected static String sa_skyscan_th;
	protected static String sa_others_th;

	protected static String eg_b2c_th;
	protected static String eg_mobapp_th;
	protected static String eg_mobios_th;
	protected static String eg_wego_th;
	protected static String eg_skyscan_th;
	protected static String eg_others_th;

	// SD
	protected static String com_b2c_sd;
	protected static String com_mobapp_sd;
	protected static String com_mobios_sd;
	protected static String com_wego_sd;
	protected static String com_skyscan_sd;
	protected static String com_others_sd;

	protected static String ae_b2c_sd;
	protected static String ae_mobapp_sd;
	protected static String ae_mobios_sd;
	protected static String ae_wego_sd;
	protected static String ae_skyscan_sd;
	protected static String ae_others_sd;

	protected static String sa_b2c_sd;
	protected static String sa_mobapp_sd;
	protected static String sa_mobios_sd;
	protected static String sa_wego_sd;
	protected static String sa_skyscan_sd;
	protected static String sa_others_sd;

	protected static String eg_b2c_sd;
	protected static String eg_mobapp_sd;
	protected static String eg_mobios_sd;
	protected static String eg_wego_sd;
	protected static String eg_skyscan_sd;
	protected static String eg_others_sd;

	// CN

	protected static String com_b2c_cn;
	protected static String com_mobapp_cn;
	protected static String com_mobios_cn;
	protected static String com_wego_cn;
	protected static String com_skyscan_cn;
	protected static String com_others_cn;

	protected static String ae_b2c_cn;
	protected static String ae_mobapp_cn;
	protected static String ae_mobios_cn;
	protected static String ae_wego_cn;
	protected static String ae_skyscan_cn;
	protected static String ae_others_cn;

	protected static String sa_b2c_cn;
	protected static String sa_mobapp_cn;
	protected static String sa_mobios_cn;
	protected static String sa_wego_cn;
	protected static String sa_skyscan_cn;
	protected static String sa_others_cn;

	protected static String eg_b2c_cn;
	protected static String eg_mobapp_cn;
	protected static String eg_mobios_cn;
	protected static String eg_wego_cn;
	protected static String eg_skyscan_cn;
	protected static String eg_others_cn;

	// RP

	protected static String com_b2c_rp;
	protected static String com_mobapp_rp;
	protected static String com_mobios_rp;
	protected static String com_wego_rp;
	protected static String com_skyscan_rp;
	protected static String com_others_rp;

	protected static String ae_b2c_rp;
	protected static String ae_mobapp_rp;
	protected static String ae_mobios_rp;
	protected static String ae_wego_rp;
	protected static String ae_skyscan_rp;
	protected static String ae_others_rp;

	protected static String sa_b2c_rp;
	protected static String sa_mobapp_rp;
	protected static String sa_mobios_rp;
	protected static String sa_wego_rp;
	protected static String sa_skyscan_rp;
	protected static String sa_others_rp;

	protected static String eg_b2c_rp;
	protected static String eg_mobapp_rp;
	protected static String eg_mobios_rp;
	protected static String eg_wego_rp;
	protected static String eg_skyscan_rp;
	protected static String eg_others_rp;
	// Last Week

	// TS
	protected static String com_b2c_ts_L1;
	protected static String com_mobapp_ts_L1;
	protected static String com_mobios_ts_L1;
	protected static String com_wego_ts_L1;
	protected static String com_skyscan_ts_L1;
	protected static String com_others_ts_L1;

	protected static String ae_b2c_ts_L1;
	protected static String ae_mobapp_ts_L1;
	protected static String ae_mobios_ts_L1;
	protected static String ae_wego_ts_L1;
	protected static String ae_skyscan_ts_L1;
	protected static String ae_others_ts_L1;

	protected static String sa_b2c_ts_L1;
	protected static String sa_mobapp_ts_L1;
	protected static String sa_mobios_ts_L1;
	protected static String sa_wego_ts_L1;
	protected static String sa_skyscan_ts_L1;
	protected static String sa_others_ts_L1;

	protected static String eg_b2c_ts_L1;
	protected static String eg_mobapp_ts_L1;
	protected static String eg_mobios_ts_L1;
	protected static String eg_wego_ts_L1;
	protected static String eg_skyscan_ts_L1;
	protected static String eg_others_ts_L1;

	// CP

	protected static String com_b2c_cp_L1;
	protected static String com_mobapp_cp_L1;
	protected static String com_mobios_cp_L1;
	protected static String com_wego_cp_L1;
	protected static String com_skyscan_cp_L1;
	protected static String com_others_cp_L1;

	protected static String ae_b2c_cp_L1;
	protected static String ae_mobapp_cp_L1;
	protected static String ae_mobios_cp_L1;
	protected static String ae_wego_cp_L1;
	protected static String ae_skyscan_cp_L1;
	protected static String ae_others_cp_L1;

	protected static String sa_b2c_cp_L1;
	protected static String sa_mobapp_cp_L1;
	protected static String sa_mobios_cp_L1;
	protected static String sa_wego_cp_L1;
	protected static String sa_skyscan_cp_L1;
	protected static String sa_others_cp_L1;

	protected static String eg_b2c_cp_L1;
	protected static String eg_mobapp_cp_L1;
	protected static String eg_mobios_cp_L1;
	protected static String eg_wego_cp_L1;
	protected static String eg_skyscan_cp_L1;
	protected static String eg_others_cp_L1;

	// TH

	protected static String com_b2c_th_L1;
	protected static String com_mobapp_th_L1;
	protected static String com_mobios_th_L1;
	protected static String com_wego_th_L1;
	protected static String com_skyscan_th_L1;
	protected static String com_others_th_L1;

	protected static String ae_b2c_th_L1;
	protected static String ae_mobapp_th_L1;
	protected static String ae_mobios_th_L1;
	protected static String ae_wego_th_L1;
	protected static String ae_skyscan_th_L1;
	protected static String ae_others_th_L1;

	protected static String sa_b2c_th_L1;
	protected static String sa_mobapp_th_L1;
	protected static String sa_mobios_th_L1;
	protected static String sa_wego_th_L1;
	protected static String sa_skyscan_th_L1;
	protected static String sa_others_th_L1;

	protected static String eg_b2c_th_L1;
	protected static String eg_mobapp_th_L1;
	protected static String eg_mobios_th_L1;
	protected static String eg_wego_th_L1;
	protected static String eg_skyscan_th_L1;
	protected static String eg_others_th_L1;

	// SD
	protected static String com_b2c_sd_L1;
	protected static String com_mobapp_sd_L1;
	protected static String com_mobios_sd_L1;
	protected static String com_wego_sd_L1;
	protected static String com_skyscan_sd_L1;
	protected static String com_others_sd_L1;

	protected static String ae_b2c_sd_L1;
	protected static String ae_mobapp_sd_L1;
	protected static String ae_mobios_sd_L1;
	protected static String ae_wego_sd_L1;
	protected static String ae_skyscan_sd_L1;
	protected static String ae_others_sd_L1;

	protected static String sa_b2c_sd_L1;
	protected static String sa_mobapp_sd_L1;
	protected static String sa_mobios_sd_L1;
	protected static String sa_wego_sd_L1;
	protected static String sa_skyscan_sd_L1;
	protected static String sa_others_sd_L1;

	protected static String eg_b2c_sd_L1;
	protected static String eg_mobapp_sd_L1;
	protected static String eg_mobios_sd_L1;
	protected static String eg_wego_sd_L1;
	protected static String eg_skyscan_sd_L1;
	protected static String eg_others_sd_L1;

	// CN

	protected static String com_b2c_cn_L1;
	protected static String com_mobapp_cn_L1;
	protected static String com_mobios_cn_L1;
	protected static String com_wego_cn_L1;
	protected static String com_skyscan_cn_L1;
	protected static String com_others_cn_L1;

	protected static String ae_b2c_cn_L1;
	protected static String ae_mobapp_cn_L1;
	protected static String ae_mobios_cn_L1;
	protected static String ae_wego_cn_L1;
	protected static String ae_skyscan_cn_L1;
	protected static String ae_others_cn_L1;

	protected static String sa_b2c_cn_L1;
	protected static String sa_mobapp_cn_L1;
	protected static String sa_mobios_cn_L1;
	protected static String sa_wego_cn_L1;
	protected static String sa_skyscan_cn_L1;
	protected static String sa_others_cn_L1;

	protected static String eg_b2c_cn_L1;
	protected static String eg_mobapp_cn_L1;
	protected static String eg_mobios_cn_L1;
	protected static String eg_wego_cn_L1;
	protected static String eg_skyscan_cn_L1;
	protected static String eg_others_cn_L1;

	// RP

	protected static String com_b2c_rp_L1;
	protected static String com_mobapp_rp_L1;
	protected static String com_mobios_rp_L1;
	protected static String com_wego_rp_L1;
	protected static String com_skyscan_rp_L1;
	protected static String com_others_rp_L1;

	protected static String ae_b2c_rp_L1;
	protected static String ae_mobapp_rp_L1;
	protected static String ae_mobios_rp_L1;
	protected static String ae_wego_rp_L1;
	protected static String ae_skyscan_rp_L1;
	protected static String ae_others_rp_L1;

	protected static String sa_b2c_rp_L1;
	protected static String sa_mobapp_rp_L1;
	protected static String sa_mobios_rp_L1;
	protected static String sa_wego_rp_L1;
	protected static String sa_skyscan_rp_L1;
	protected static String sa_others_rp_L1;

	protected static String eg_b2c_rp_L1;
	protected static String eg_mobapp_rp_L1;
	protected static String eg_mobios_rp_L1;
	protected static String eg_wego_rp_L1;
	protected static String eg_skyscan_rp_L1;
	protected static String eg_others_rp_L1;

	// Last Week2

	// TS
	protected static String com_b2c_ts_L2;
	protected static String com_mobapp_ts_L2;
	protected static String com_mobios_ts_L2;
	protected static String com_wego_ts_L2;
	protected static String com_skyscan_ts_L2;
	protected static String com_others_ts_L2;

	protected static String ae_b2c_ts_L2;
	protected static String ae_mobapp_ts_L2;
	protected static String ae_mobios_ts_L2;
	protected static String ae_wego_ts_L2;
	protected static String ae_skyscan_ts_L2;
	protected static String ae_others_ts_L2;

	protected static String sa_b2c_ts_L2;
	protected static String sa_mobapp_ts_L2;
	protected static String sa_mobios_ts_L2;
	protected static String sa_wego_ts_L2;
	protected static String sa_skyscan_ts_L2;
	protected static String sa_others_ts_L2;

	protected static String eg_b2c_ts_L2;
	protected static String eg_mobapp_ts_L2;
	protected static String eg_mobios_ts_L2;
	protected static String eg_wego_ts_L2;
	protected static String eg_skyscan_ts_L2;
	protected static String eg_others_ts_L2;

	// CP

	protected static String com_b2c_cp_L2;
	protected static String com_mobapp_cp_L2;
	protected static String com_mobios_cp_L2;
	protected static String com_wego_cp_L2;
	protected static String com_skyscan_cp_L2;
	protected static String com_others_cp_L2;

	protected static String ae_b2c_cp_L2;
	protected static String ae_mobapp_cp_L2;
	protected static String ae_mobios_cp_L2;
	protected static String ae_wego_cp_L2;
	protected static String ae_skyscan_cp_L2;
	protected static String ae_others_cp_L2;

	protected static String sa_b2c_cp_L2;
	protected static String sa_mobapp_cp_L2;
	protected static String sa_mobios_cp_L2;
	protected static String sa_wego_cp_L2;
	protected static String sa_skyscan_cp_L2;
	protected static String sa_others_cp_L2;

	protected static String eg_b2c_cp_L2;
	protected static String eg_mobapp_cp_L2;
	protected static String eg_mobios_cp_L2;
	protected static String eg_wego_cp_L2;
	protected static String eg_skyscan_cp_L2;
	protected static String eg_others_cp_L2;

	// TH

	protected static String com_b2c_th_L2;
	protected static String com_mobapp_th_L2;
	protected static String com_mobios_th_L2;
	protected static String com_wego_th_L2;
	protected static String com_skyscan_th_L2;
	protected static String com_others_th_L2;

	protected static String ae_b2c_th_L2;
	protected static String ae_mobapp_th_L2;
	protected static String ae_mobios_th_L2;
	protected static String ae_wego_th_L2;
	protected static String ae_skyscan_th_L2;
	protected static String ae_others_th_L2;

	protected static String sa_b2c_th_L2;
	protected static String sa_mobapp_th_L2;
	protected static String sa_mobios_th_L2;
	protected static String sa_wego_th_L2;
	protected static String sa_skyscan_th_L2;
	protected static String sa_others_th_L2;

	protected static String eg_b2c_th_L2;
	protected static String eg_mobapp_th_L2;
	protected static String eg_mobios_th_L2;
	protected static String eg_wego_th_L2;
	protected static String eg_skyscan_th_L2;
	protected static String eg_others_th_L2;

	// SD
	protected static String com_b2c_sd_L2;
	protected static String com_mobapp_sd_L2;
	protected static String com_mobios_sd_L2;
	protected static String com_wego_sd_L2;
	protected static String com_skyscan_sd_L2;
	protected static String com_others_sd_L2;

	protected static String ae_b2c_sd_L2;
	protected static String ae_mobapp_sd_L2;
	protected static String ae_mobios_sd_L2;
	protected static String ae_wego_sd_L2;
	protected static String ae_skyscan_sd_L2;
	protected static String ae_others_sd_L2;

	protected static String sa_b2c_sd_L2;
	protected static String sa_mobapp_sd_L2;
	protected static String sa_mobios_sd_L2;
	protected static String sa_wego_sd_L2;
	protected static String sa_skyscan_sd_L2;
	protected static String sa_others_sd_L2;

	protected static String eg_b2c_sd_L2;
	protected static String eg_mobapp_sd_L2;
	protected static String eg_mobios_sd_L2;
	protected static String eg_wego_sd_L2;
	protected static String eg_skyscan_sd_L2;
	protected static String eg_others_sd_L2;

	// CN

	protected static String com_b2c_cn_L2;
	protected static String com_mobapp_cn_L2;
	protected static String com_mobios_cn_L2;
	protected static String com_wego_cn_L2;
	protected static String com_skyscan_cn_L2;
	protected static String com_others_cn_L2;

	protected static String ae_b2c_cn_L2;
	protected static String ae_mobapp_cn_L2;
	protected static String ae_mobios_cn_L2;
	protected static String ae_wego_cn_L2;
	protected static String ae_skyscan_cn_L2;
	protected static String ae_others_cn_L2;

	protected static String sa_b2c_cn_L2;
	protected static String sa_mobapp_cn_L2;
	protected static String sa_mobios_cn_L2;
	protected static String sa_wego_cn_L2;
	protected static String sa_skyscan_cn_L2;
	protected static String sa_others_cn_L2;

	protected static String eg_b2c_cn_L2;
	protected static String eg_mobapp_cn_L2;
	protected static String eg_mobios_cn_L2;
	protected static String eg_wego_cn_L2;
	protected static String eg_skyscan_cn_L2;
	protected static String eg_others_cn_L2;

	// RP

	protected static String com_b2c_rp_L2;
	protected static String com_mobapp_rp_L2;
	protected static String com_mobios_rp_L2;
	protected static String com_wego_rp_L2;
	protected static String com_skyscan_rp_L2;
	protected static String com_others_rp_L2;

	protected static String ae_b2c_rp_L2;
	protected static String ae_mobapp_rp_L2;
	protected static String ae_mobios_rp_L2;
	protected static String ae_wego_rp_L2;
	protected static String ae_skyscan_rp_L2;
	protected static String ae_others_rp_L2;

	protected static String sa_b2c_rp_L2;
	protected static String sa_mobapp_rp_L2;
	protected static String sa_mobios_rp_L2;
	protected static String sa_wego_rp_L2;
	protected static String sa_skyscan_rp_L2;
	protected static String sa_others_rp_L2;

	protected static String eg_b2c_rp_L2;
	protected static String eg_mobapp_rp_L2;
	protected static String eg_mobios_rp_L2;
	protected static String eg_wego_rp_L2;
	protected static String eg_skyscan_rp_L2;
	protected static String eg_others_rp_L2;

	public static void calculation_Report_Present(String CurrentFile, String LastweekFile)
			throws BiffException, IOException {
		FileInputStream file1 = new FileInputStream(CurrentFile);
		Workbook wb1 = Workbook.getWorkbook(file1);
		Sheet sheet1 = wb1.getSheet("Results");
		// TS
		com_b2c_ts = sheet1.getCell(1, 4).getContents();
		com_mobapp_ts = sheet1.getCell(2, 4).getContents();
		com_mobios_ts = sheet1.getCell(3, 4).getContents();
		com_wego_ts = sheet1.getCell(4, 4).getContents();
		com_skyscan_ts = sheet1.getCell(5, 4).getContents();
		com_others_ts = sheet1.getCell(6, 4).getContents();

		ae_b2c_ts = sheet1.getCell(1, 5).getContents();
		ae_mobapp_ts = sheet1.getCell(2, 5).getContents();
		ae_mobios_ts = sheet1.getCell(3, 5).getContents();
		ae_wego_ts = sheet1.getCell(4, 5).getContents();
		ae_skyscan_ts = sheet1.getCell(5, 5).getContents();
		ae_others_ts = sheet1.getCell(6, 5).getContents();

		sa_b2c_ts = sheet1.getCell(1, 6).getContents();
		sa_mobapp_ts = sheet1.getCell(2, 6).getContents();
		sa_mobios_ts = sheet1.getCell(3, 6).getContents();
		sa_wego_ts = sheet1.getCell(4, 6).getContents();
		sa_skyscan_ts = sheet1.getCell(5, 6).getContents();
		sa_others_ts = sheet1.getCell(6, 6).getContents();

		eg_b2c_ts = sheet1.getCell(1, 7).getContents();
		eg_mobapp_ts = sheet1.getCell(2, 7).getContents();
		eg_mobios_ts = sheet1.getCell(3, 7).getContents();
		eg_wego_ts = sheet1.getCell(4, 7).getContents();
		eg_skyscan_ts = sheet1.getCell(5, 7).getContents();
		eg_others_ts = sheet1.getCell(6, 7).getContents();

		// CP

		com_b2c_cp = sheet1.getCell(1, 11).getContents();
		com_mobapp_cp = sheet1.getCell(2, 11).getContents();
		com_mobios_cp = sheet1.getCell(3, 11).getContents();
		com_wego_cp = sheet1.getCell(4, 11).getContents();
		com_skyscan_cp = sheet1.getCell(5, 11).getContents();
		com_others_cp = sheet1.getCell(6, 11).getContents();

		ae_b2c_cp = sheet1.getCell(1, 12).getContents();
		ae_mobapp_cp = sheet1.getCell(2, 12).getContents();
		ae_mobios_cp = sheet1.getCell(3, 12).getContents();
		ae_wego_cp = sheet1.getCell(4, 12).getContents();
		ae_skyscan_cp = sheet1.getCell(5, 12).getContents();
		ae_others_cp = sheet1.getCell(6, 12).getContents();

		sa_b2c_cp = sheet1.getCell(1, 13).getContents();
		sa_mobapp_cp = sheet1.getCell(2, 13).getContents();
		sa_mobios_cp = sheet1.getCell(3, 13).getContents();
		sa_wego_cp = sheet1.getCell(4, 13).getContents();
		sa_skyscan_cp = sheet1.getCell(5, 13).getContents();
		sa_others_cp = sheet1.getCell(6, 13).getContents();

		eg_b2c_cp = sheet1.getCell(1, 14).getContents();
		eg_mobapp_cp = sheet1.getCell(2, 14).getContents();
		eg_mobios_cp = sheet1.getCell(3, 14).getContents();
		eg_wego_cp = sheet1.getCell(4, 14).getContents();
		eg_skyscan_cp = sheet1.getCell(5, 14).getContents();
		eg_others_cp = sheet1.getCell(6, 14).getContents();

		// TH

		com_b2c_th = sheet1.getCell(1, 18).getContents();
		com_mobapp_th = sheet1.getCell(2, 18).getContents();
		com_mobios_th = sheet1.getCell(3, 18).getContents();
		com_wego_th = sheet1.getCell(4, 18).getContents();
		com_skyscan_th = sheet1.getCell(5, 18).getContents();
		com_others_th = sheet1.getCell(6, 18).getContents();

		ae_b2c_th = sheet1.getCell(1, 19).getContents();
		ae_mobapp_th = sheet1.getCell(2, 19).getContents();
		ae_mobios_th = sheet1.getCell(3, 19).getContents();
		ae_wego_th = sheet1.getCell(4, 19).getContents();
		ae_skyscan_th = sheet1.getCell(5, 19).getContents();
		ae_others_th = sheet1.getCell(6, 19).getContents();

		sa_b2c_th = sheet1.getCell(1, 20).getContents();
		sa_mobapp_th = sheet1.getCell(2, 20).getContents();
		sa_mobios_th = sheet1.getCell(3, 20).getContents();
		sa_wego_th = sheet1.getCell(4, 20).getContents();
		sa_skyscan_th = sheet1.getCell(5, 20).getContents();
		sa_others_th = sheet1.getCell(6, 20).getContents();

		eg_b2c_th = sheet1.getCell(1, 21).getContents();
		eg_mobapp_th = sheet1.getCell(2, 21).getContents();
		eg_mobios_th = sheet1.getCell(3, 21).getContents();
		eg_wego_th = sheet1.getCell(4, 21).getContents();
		eg_skyscan_th = sheet1.getCell(5, 21).getContents();
		eg_others_th = sheet1.getCell(6, 21).getContents();

		// SD
		com_b2c_sd = sheet1.getCell(1, 25).getContents();
		com_mobapp_sd = sheet1.getCell(2, 25).getContents();
		com_mobios_sd = sheet1.getCell(3, 25).getContents();
		com_wego_sd = sheet1.getCell(4, 25).getContents();
		com_skyscan_sd = sheet1.getCell(5, 25).getContents();
		com_others_sd = sheet1.getCell(6, 25).getContents();

		ae_b2c_sd = sheet1.getCell(1, 26).getContents();
		ae_mobapp_sd = sheet1.getCell(2, 26).getContents();
		ae_mobios_sd = sheet1.getCell(3, 26).getContents();
		ae_wego_sd = sheet1.getCell(4, 26).getContents();
		ae_skyscan_sd = sheet1.getCell(5, 26).getContents();
		ae_others_sd = sheet1.getCell(6, 26).getContents();

		sa_b2c_sd = sheet1.getCell(1, 27).getContents();
		sa_mobapp_sd = sheet1.getCell(2, 27).getContents();
		sa_mobios_sd = sheet1.getCell(3, 27).getContents();
		sa_wego_sd = sheet1.getCell(4, 27).getContents();
		sa_skyscan_sd = sheet1.getCell(5, 27).getContents();
		sa_others_sd = sheet1.getCell(6, 27).getContents();

		eg_b2c_sd = sheet1.getCell(1, 28).getContents();
		eg_mobapp_sd = sheet1.getCell(2, 28).getContents();
		eg_mobios_sd = sheet1.getCell(3, 28).getContents();
		eg_wego_sd = sheet1.getCell(4, 28).getContents();
		eg_skyscan_sd = sheet1.getCell(5, 28).getContents();
		eg_others_sd = sheet1.getCell(6, 28).getContents();

		// CN

		com_b2c_cn = sheet1.getCell(1, 32).getContents();
		com_mobapp_cn = sheet1.getCell(2, 32).getContents();
		com_mobios_cn = sheet1.getCell(3, 32).getContents();
		com_wego_cn = sheet1.getCell(4, 32).getContents();
		com_skyscan_cn = sheet1.getCell(5, 32).getContents();
		com_others_cn = sheet1.getCell(6, 32).getContents();

		ae_b2c_cn = sheet1.getCell(1, 33).getContents();
		ae_mobapp_cn = sheet1.getCell(2, 33).getContents();
		ae_mobios_cn = sheet1.getCell(3, 33).getContents();
		ae_wego_cn = sheet1.getCell(4, 33).getContents();
		ae_skyscan_cn = sheet1.getCell(5, 33).getContents();
		ae_others_cn = sheet1.getCell(6, 33).getContents();

		sa_b2c_cn = sheet1.getCell(1, 34).getContents();
		sa_mobapp_cn = sheet1.getCell(2, 34).getContents();
		sa_mobios_cn = sheet1.getCell(3, 34).getContents();
		sa_wego_cn = sheet1.getCell(4, 34).getContents();
		sa_skyscan_cn = sheet1.getCell(5, 34).getContents();
		sa_others_cn = sheet1.getCell(6, 34).getContents();

		eg_b2c_cn = sheet1.getCell(1, 35).getContents();
		eg_mobapp_cn = sheet1.getCell(2, 35).getContents();
		eg_mobios_cn = sheet1.getCell(3, 35).getContents();
		eg_wego_cn = sheet1.getCell(4, 35).getContents();
		eg_skyscan_cn = sheet1.getCell(5, 35).getContents();
		eg_others_cn = sheet1.getCell(6, 35).getContents();

		// RP

		com_b2c_rp = sheet1.getCell(1, 39).getContents();
		com_mobapp_rp = sheet1.getCell(2, 39).getContents();
		com_mobios_rp = sheet1.getCell(3, 39).getContents();
		com_wego_rp = sheet1.getCell(4, 39).getContents();
		com_skyscan_rp = sheet1.getCell(5, 39).getContents();
		com_others_rp = sheet1.getCell(6, 39).getContents();

		ae_b2c_rp = sheet1.getCell(1, 40).getContents();
		ae_mobapp_rp = sheet1.getCell(2, 40).getContents();
		ae_mobios_rp = sheet1.getCell(3, 40).getContents();
		ae_wego_rp = sheet1.getCell(4, 40).getContents();
		ae_skyscan_rp = sheet1.getCell(5, 40).getContents();
		ae_others_rp = sheet1.getCell(6, 40).getContents();

		sa_b2c_rp = sheet1.getCell(1, 41).getContents();
		sa_mobapp_rp = sheet1.getCell(2, 41).getContents();
		sa_mobios_rp = sheet1.getCell(3, 41).getContents();
		sa_wego_rp = sheet1.getCell(4, 41).getContents();
		sa_skyscan_rp = sheet1.getCell(5, 41).getContents();
		sa_others_rp = sheet1.getCell(6, 41).getContents();

		eg_b2c_rp = sheet1.getCell(1, 42).getContents();
		eg_mobapp_rp = sheet1.getCell(2, 42).getContents();
		eg_mobios_rp = sheet1.getCell(3, 42).getContents();
		eg_wego_rp = sheet1.getCell(4, 42).getContents();
		eg_skyscan_rp = sheet1.getCell(5, 42).getContents();
		eg_others_rp = sheet1.getCell(6, 42).getContents();

		FileInputStream fileL1 = new FileInputStream(LastweekFile);
		Workbook wbL1 = Workbook.getWorkbook(fileL1);
		Sheet sheetL1 = wbL1.getSheet("Results");
		// TS
		com_b2c_ts_L1 = sheetL1.getCell(1, 4).getContents();
		com_mobapp_ts_L1 = sheetL1.getCell(2, 4).getContents();
		com_mobios_ts_L1 = sheetL1.getCell(3, 4).getContents();
		com_wego_ts_L1 = sheetL1.getCell(4, 4).getContents();
		com_skyscan_ts_L1 = sheetL1.getCell(5, 4).getContents();
		com_others_ts_L1 = sheetL1.getCell(6, 4).getContents();

		ae_b2c_ts_L1 = sheetL1.getCell(1, 5).getContents();
		ae_mobapp_ts_L1 = sheetL1.getCell(2, 5).getContents();
		ae_mobios_ts_L1 = sheetL1.getCell(3, 5).getContents();
		ae_wego_ts_L1 = sheetL1.getCell(4, 5).getContents();
		ae_skyscan_ts_L1 = sheetL1.getCell(5, 5).getContents();
		ae_others_ts_L1 = sheetL1.getCell(6, 5).getContents();

		sa_b2c_ts_L1 = sheetL1.getCell(1, 6).getContents();
		sa_mobapp_ts_L1 = sheetL1.getCell(2, 6).getContents();
		sa_mobios_ts_L1 = sheetL1.getCell(3, 6).getContents();
		sa_wego_ts_L1 = sheetL1.getCell(4, 6).getContents();
		sa_skyscan_ts_L1 = sheetL1.getCell(5, 6).getContents();
		sa_others_ts_L1 = sheetL1.getCell(6, 6).getContents();

		eg_b2c_ts_L1 = sheetL1.getCell(1, 7).getContents();
		eg_mobapp_ts_L1 = sheetL1.getCell(2, 7).getContents();
		eg_mobios_ts_L1 = sheetL1.getCell(3, 7).getContents();
		eg_wego_ts_L1 = sheetL1.getCell(4, 7).getContents();
		eg_skyscan_ts_L1 = sheetL1.getCell(5, 7).getContents();
		eg_others_ts_L1 = sheetL1.getCell(6, 7).getContents();

		// CP

		com_b2c_cp_L1 = sheetL1.getCell(1, 11).getContents();
		com_mobapp_cp_L1 = sheetL1.getCell(2, 11).getContents();
		com_mobios_cp_L1 = sheetL1.getCell(3, 11).getContents();
		com_wego_cp_L1 = sheetL1.getCell(4, 11).getContents();
		com_skyscan_cp_L1 = sheetL1.getCell(5, 11).getContents();
		com_others_cp_L1 = sheetL1.getCell(6, 11).getContents();

		ae_b2c_cp_L1 = sheetL1.getCell(1, 12).getContents();
		ae_mobapp_cp_L1 = sheetL1.getCell(2, 12).getContents();
		ae_mobios_cp_L1 = sheetL1.getCell(3, 12).getContents();
		ae_wego_cp_L1 = sheetL1.getCell(4, 12).getContents();
		ae_skyscan_cp_L1 = sheetL1.getCell(5, 12).getContents();
		ae_others_cp_L1 = sheetL1.getCell(6, 12).getContents();

		sa_b2c_cp_L1 = sheetL1.getCell(1, 13).getContents();
		sa_mobapp_cp_L1 = sheetL1.getCell(2, 13).getContents();
		sa_mobios_cp_L1 = sheetL1.getCell(3, 13).getContents();
		sa_wego_cp_L1 = sheetL1.getCell(4, 13).getContents();
		sa_skyscan_cp_L1 = sheetL1.getCell(5, 13).getContents();
		sa_others_cp_L1 = sheetL1.getCell(6, 13).getContents();

		eg_b2c_cp_L1 = sheetL1.getCell(1, 14).getContents();
		eg_mobapp_cp_L1 = sheetL1.getCell(2, 14).getContents();
		eg_mobios_cp_L1 = sheetL1.getCell(3, 14).getContents();
		eg_wego_cp_L1 = sheetL1.getCell(4, 14).getContents();
		eg_skyscan_cp_L1 = sheetL1.getCell(5, 14).getContents();
		eg_others_cp_L1 = sheetL1.getCell(6, 14).getContents();

		// TH

		com_b2c_th_L1 = sheetL1.getCell(1, 18).getContents();
		com_mobapp_th_L1 = sheetL1.getCell(2, 18).getContents();
		com_mobios_th_L1 = sheetL1.getCell(3, 18).getContents();
		com_wego_th_L1 = sheetL1.getCell(4, 18).getContents();
		com_skyscan_th_L1 = sheetL1.getCell(5, 18).getContents();
		com_others_th_L1 = sheetL1.getCell(6, 18).getContents();

		ae_b2c_th_L1 = sheetL1.getCell(1, 19).getContents();
		ae_mobapp_th_L1 = sheetL1.getCell(2, 19).getContents();
		ae_mobios_th_L1 = sheetL1.getCell(3, 19).getContents();
		ae_wego_th_L1 = sheetL1.getCell(4, 19).getContents();
		ae_skyscan_th_L1 = sheetL1.getCell(5, 19).getContents();
		ae_others_th_L1 = sheetL1.getCell(6, 19).getContents();

		sa_b2c_th_L1 = sheetL1.getCell(1, 20).getContents();
		sa_mobapp_th_L1 = sheetL1.getCell(2, 20).getContents();
		sa_mobios_th_L1 = sheetL1.getCell(3, 20).getContents();
		sa_wego_th_L1 = sheetL1.getCell(4, 20).getContents();
		sa_skyscan_th_L1 = sheetL1.getCell(5, 20).getContents();
		sa_others_th_L1 = sheetL1.getCell(6, 20).getContents();

		eg_b2c_th_L1 = sheetL1.getCell(1, 21).getContents();
		eg_mobapp_th_L1 = sheetL1.getCell(2, 21).getContents();
		eg_mobios_th_L1 = sheetL1.getCell(3, 21).getContents();
		eg_wego_th_L1 = sheetL1.getCell(4, 21).getContents();
		eg_skyscan_th_L1 = sheetL1.getCell(5, 21).getContents();
		eg_others_th_L1 = sheetL1.getCell(6, 21).getContents();

		// SD
		com_b2c_sd_L1 = sheetL1.getCell(1, 25).getContents();
		com_mobapp_sd_L1 = sheetL1.getCell(2, 25).getContents();
		com_mobios_sd_L1 = sheetL1.getCell(3, 25).getContents();
		com_wego_sd_L1 = sheetL1.getCell(4, 25).getContents();
		com_skyscan_sd_L1 = sheetL1.getCell(5, 25).getContents();
		com_others_sd_L1 = sheetL1.getCell(6, 25).getContents();

		ae_b2c_sd_L1 = sheetL1.getCell(1, 26).getContents();
		ae_mobapp_sd_L1 = sheetL1.getCell(2, 26).getContents();
		ae_mobios_sd_L1 = sheetL1.getCell(3, 26).getContents();
		ae_wego_sd_L1 = sheetL1.getCell(4, 26).getContents();
		ae_skyscan_sd_L1 = sheetL1.getCell(5, 26).getContents();
		ae_others_sd_L1 = sheetL1.getCell(6, 26).getContents();

		sa_b2c_sd_L1 = sheetL1.getCell(1, 27).getContents();
		sa_mobapp_sd_L1 = sheetL1.getCell(2, 27).getContents();
		sa_mobios_sd_L1 = sheetL1.getCell(3, 27).getContents();
		sa_wego_sd_L1 = sheetL1.getCell(4, 27).getContents();
		sa_skyscan_sd_L1 = sheetL1.getCell(5, 27).getContents();
		sa_others_sd_L1 = sheetL1.getCell(6, 27).getContents();

		eg_b2c_sd_L1 = sheetL1.getCell(1, 28).getContents();
		eg_mobapp_sd_L1 = sheetL1.getCell(2, 28).getContents();
		eg_mobios_sd_L1 = sheetL1.getCell(3, 28).getContents();
		eg_wego_sd_L1 = sheetL1.getCell(4, 28).getContents();
		eg_skyscan_sd_L1 = sheetL1.getCell(5, 28).getContents();
		eg_others_sd_L1 = sheetL1.getCell(6, 28).getContents();

		// CN

		com_b2c_cn_L1 = sheetL1.getCell(1, 32).getContents();
		com_mobapp_cn_L1 = sheetL1.getCell(2, 32).getContents();
		com_mobios_cn_L1 = sheetL1.getCell(3, 32).getContents();
		com_wego_cn_L1 = sheetL1.getCell(4, 32).getContents();
		com_skyscan_cn_L1 = sheetL1.getCell(5, 32).getContents();
		com_others_cn_L1 = sheetL1.getCell(6, 32).getContents();

		ae_b2c_cn_L1 = sheetL1.getCell(1, 33).getContents();
		ae_mobapp_cn_L1 = sheetL1.getCell(2, 33).getContents();
		ae_mobios_cn_L1 = sheetL1.getCell(3, 33).getContents();
		ae_wego_cn_L1 = sheetL1.getCell(4, 33).getContents();
		ae_skyscan_cn_L1 = sheetL1.getCell(5, 33).getContents();
		ae_others_cn_L1 = sheetL1.getCell(6, 33).getContents();

		sa_b2c_cn_L1 = sheetL1.getCell(1, 34).getContents();
		sa_mobapp_cn_L1 = sheetL1.getCell(2, 34).getContents();
		sa_mobios_cn_L1 = sheetL1.getCell(3, 34).getContents();
		sa_wego_cn_L1 = sheetL1.getCell(4, 34).getContents();
		sa_skyscan_cn_L1 = sheetL1.getCell(5, 34).getContents();
		sa_others_cn_L1 = sheetL1.getCell(6, 34).getContents();

		eg_b2c_cn_L1 = sheetL1.getCell(1, 35).getContents();
		eg_mobapp_cn_L1 = sheetL1.getCell(2, 35).getContents();
		eg_mobios_cn_L1 = sheetL1.getCell(3, 35).getContents();
		eg_wego_cn_L1 = sheetL1.getCell(4, 35).getContents();
		eg_skyscan_cn_L1 = sheetL1.getCell(5, 35).getContents();
		eg_others_cn_L1 = sheetL1.getCell(6, 35).getContents();

		// RP

		com_b2c_rp_L1 = sheetL1.getCell(1, 39).getContents();
		com_mobapp_rp_L1 = sheetL1.getCell(2, 39).getContents();
		com_mobios_rp_L1 = sheetL1.getCell(3, 39).getContents();
		com_wego_rp_L1 = sheetL1.getCell(4, 39).getContents();
		com_skyscan_rp_L1 = sheetL1.getCell(5, 39).getContents();
		com_others_rp_L1 = sheetL1.getCell(6, 39).getContents();

		ae_b2c_rp_L1 = sheetL1.getCell(1, 40).getContents();
		ae_mobapp_rp_L1 = sheetL1.getCell(2, 40).getContents();
		ae_mobios_rp_L1 = sheetL1.getCell(3, 40).getContents();
		ae_wego_rp_L1 = sheetL1.getCell(4, 40).getContents();
		ae_skyscan_rp_L1 = sheetL1.getCell(5, 40).getContents();
		ae_others_rp_L1 = sheetL1.getCell(6, 40).getContents();

		sa_b2c_rp_L1 = sheetL1.getCell(1, 41).getContents();
		sa_mobapp_rp_L1 = sheetL1.getCell(2, 41).getContents();
		sa_mobios_rp_L1 = sheetL1.getCell(3, 41).getContents();
		sa_wego_rp_L1 = sheetL1.getCell(4, 41).getContents();
		sa_skyscan_rp_L1 = sheetL1.getCell(5, 41).getContents();
		sa_others_rp_L1 = sheetL1.getCell(6, 41).getContents();

		eg_b2c_rp_L1 = sheetL1.getCell(1, 42).getContents();
		eg_mobapp_rp_L1 = sheetL1.getCell(2, 42).getContents();
		eg_mobios_rp_L1 = sheetL1.getCell(3, 42).getContents();
		eg_wego_rp_L1 = sheetL1.getCell(4, 42).getContents();
		eg_skyscan_rp_L1 = sheetL1.getCell(5, 42).getContents();
		eg_others_rp_L1 = sheetL1.getCell(6, 42).getContents();

		// Calculation
		// -----------------------B2C------------------------------------------------
		int b2c_com_ts_C = Integer.parseInt(com_b2c_ts);
		int b2c_com_ts_L = Integer.parseInt(com_b2c_ts_L1);
		int b2c_ae_ts_C = Integer.parseInt(ae_b2c_ts);
		int b2c_ae_ts_L = Integer.parseInt(ae_b2c_ts_L1);
		int b2c_sa_ts_C = Integer.parseInt(sa_b2c_ts);
		int b2c_sa_ts_L = Integer.parseInt(sa_b2c_ts_L1);
		int b2c_eg_ts_C = Integer.parseInt(eg_b2c_ts);
		int b2c_eg_ts_L = Integer.parseInt(eg_b2c_ts_L1);

		float b2c_com_ts_L_F=b2c_com_ts_L;
		float b2c_ae_ts_L_F=b2c_ae_ts_L;
		float b2c_sa_ts_L_F=b2c_sa_ts_L;
		float b2c_eg_ts_L_F=b2c_eg_ts_L;
		
		
		 if(b2c_com_ts_C <= 0 && b2c_com_ts_L <= 0)
		{
			B2C_ts_com = zero;
		}
		else if (b2c_com_ts_L <= 0) {
			B2C_ts_com = Percentage;
		}
		else {
			B2C_ts_com = (int) ((b2c_com_ts_C - b2c_com_ts_L_F) / b2c_com_ts_L_F * 100);
		}

		
		 if(b2c_ae_ts_C <= 0 && b2c_ae_ts_L <= 0)
		{
			B2C_ts_ae = zero;
		}
		 else if (b2c_ae_ts_L <= 0) {
			B2C_ts_ae = Percentage;
		} 
		else {
			B2C_ts_ae = (int) ((b2c_ae_ts_C - b2c_ae_ts_L_F) / b2c_ae_ts_L_F * 100);
		}
		
		
		 if(b2c_sa_ts_C <= 0 && b2c_sa_ts_L <= 0)
		{
			B2C_ts_sa = zero;
		}
		 else if (b2c_sa_ts_L <= 0) {
			B2C_ts_sa = Percentage;
		} 
		else {
			B2C_ts_sa = (int) ((b2c_sa_ts_C - b2c_sa_ts_L_F) / b2c_sa_ts_L_F * 100);
		}
		
		
		 if(b2c_eg_ts_C <= 0 && b2c_eg_ts_L <= 0)
		{
			B2C_ts_eg = zero;
		}
		 else if (b2c_eg_ts_L <= 0) {
			B2C_ts_eg = Percentage;
		} 
		else {
			B2C_ts_eg = (int) ((b2c_eg_ts_C - b2c_eg_ts_L_F) / b2c_eg_ts_L_F * 100);
		}

		int b2c_com_cp_C = Integer.parseInt(com_b2c_cp);
		int b2c_com_cp_L = Integer.parseInt(com_b2c_cp_L1);
		int b2c_ae_cp_C = Integer.parseInt(ae_b2c_cp);
		int b2c_ae_cp_L = Integer.parseInt(ae_b2c_cp_L1);
		int b2c_sa_cp_C = Integer.parseInt(sa_b2c_cp);
		int b2c_sa_cp_L = Integer.parseInt(sa_b2c_cp_L1);
		int b2c_eg_cp_C = Integer.parseInt(eg_b2c_cp);
		int b2c_eg_cp_L = Integer.parseInt(eg_b2c_cp_L1);
		
		float b2c_com_cp_L_F=b2c_com_cp_L;
		float b2c_ae_cp_L_F=b2c_ae_cp_L;
		float b2c_sa_cp_L_F=b2c_sa_cp_L;
		float b2c_eg_cp_L_F=b2c_eg_cp_L;

		
		if (b2c_com_cp_C <= 0 && b2c_com_cp_L <= 0) {
			B2C_cp_com = zero;
		} else if (b2c_com_cp_L <= 0) {
			B2C_cp_com = Percentage;
		} else {
			B2C_cp_com = (int) ((b2c_com_cp_C - b2c_com_cp_L_F) / b2c_com_cp_L_F * 100);
		}

		if (b2c_ae_cp_C <= 0 && b2c_ae_cp_L <= 0) {
			B2C_cp_ae = zero;
		} else if (b2c_ae_cp_L <= 0) {
			B2C_cp_ae = Percentage;
		} else {
			B2C_cp_ae = (int) ((b2c_ae_cp_C - b2c_ae_cp_L) / b2c_ae_cp_L_F * 100);
		}

		if (b2c_sa_cp_C <= 0 && b2c_sa_cp_L <= 0) {
			B2C_cp_sa = zero;
		} else if (b2c_sa_cp_L <= 0) {
			B2C_cp_sa = Percentage;
		} else {
			B2C_cp_sa = (int) ((b2c_sa_cp_C - b2c_sa_cp_L_F) / b2c_sa_cp_L_F * 100);
		}

		if (b2c_eg_cp_C <= 0 && b2c_eg_cp_L <= 0) {
			B2C_cp_eg = zero;
		} else if (b2c_eg_cp_L <= 0) {
			B2C_cp_eg = Percentage;
		} else {
			B2C_cp_eg = (int) ((b2c_eg_cp_C - b2c_eg_cp_L_F) / b2c_eg_cp_L_F * 100);
		}
		
		 
		

		int b2c_com_th_C = Integer.parseInt(com_b2c_th);
		int b2c_com_th_L = Integer.parseInt(com_b2c_th_L1);
		int b2c_ae_th_C = Integer.parseInt(ae_b2c_th);
		int b2c_ae_th_L = Integer.parseInt(ae_b2c_th_L1);
		int b2c_sa_th_C = Integer.parseInt(sa_b2c_th);
		int b2c_sa_th_L = Integer.parseInt(sa_b2c_th_L1);
		int b2c_eg_th_C = Integer.parseInt(eg_b2c_th);
		int b2c_eg_th_L = Integer.parseInt(eg_b2c_th_L1);
		
		float b2c_com_th_L_F=b2c_com_th_L;
		float b2c_ae_th_L_F=b2c_ae_th_L;
		float b2c_sa_th_L_F=b2c_sa_th_L;
		float b2c_eg_th_L_F=b2c_eg_th_L;
		
		
		 if(b2c_com_th_C <= 0 && b2c_com_th_L <= 0)
		{
			B2C_th_com = zero;
		}
		 else if (b2c_com_th_L <= 0) {
			B2C_th_com = Percentage;
		}
		
		else {
			B2C_th_com = (int) ((b2c_com_th_C - b2c_com_th_L_F) / b2c_com_th_L_F * 100);
		}
		
		
		 if(b2c_ae_th_C <= 0 && b2c_ae_th_L <= 0)
		{
			B2C_th_ae = zero;
		}
		 else if (b2c_ae_th_L <= 0) {
			B2C_th_ae = Percentage;
		} 
		else {
			B2C_th_ae = (int) ((b2c_ae_th_C - b2c_ae_th_L_F) / b2c_ae_th_L_F * 100);
		}
		
		
		 if(b2c_sa_th_C <= 0 && b2c_sa_th_L <= 0)
		{
			B2C_th_sa = zero;
		}
	    else if (b2c_sa_th_L <= 0) {
			B2C_th_sa = Percentage;
		}
		else {
			B2C_th_sa = (int) ((b2c_sa_th_C - b2c_sa_th_L_F) / b2c_sa_th_L_F * 100);
		}
		
		
		 if(b2c_eg_th_C <= 0 && b2c_eg_th_L <= 0)
		{
			B2C_th_eg = zero;
		}
		 else if (b2c_eg_th_L <= 0) {
			B2C_th_eg = Percentage;
		}
		else {
			B2C_th_eg = (int) ((b2c_eg_th_C - b2c_eg_th_L_F) / b2c_eg_th_L_F * 100);
		}
		 
		
		 
		 

		int b2c_com_sd_C = Integer.parseInt(com_b2c_sd);
		int b2c_com_sd_L = Integer.parseInt(com_b2c_sd_L1);
		int b2c_ae_sd_C = Integer.parseInt(ae_b2c_sd);
		int b2c_ae_sd_L = Integer.parseInt(ae_b2c_sd_L1);
		int b2c_sa_sd_C = Integer.parseInt(sa_b2c_sd);
		int b2c_sa_sd_L = Integer.parseInt(sa_b2c_sd_L1);
		int b2c_eg_sd_C = Integer.parseInt(eg_b2c_sd);
		int b2c_eg_sd_L = Integer.parseInt(eg_b2c_sd_L1);
		
		float b2c_com_sd_L_F=b2c_com_sd_L;
		float b2c_ae_sd_L_F=b2c_ae_sd_L;
		float b2c_sa_sd_L_F=b2c_sa_sd_L;
		float b2c_eg_sd_L_F=b2c_eg_sd_L;
		
		
		 if(b2c_com_sd_C <= 0 && b2c_com_sd_L <= 0)
		{
			B2C_sd_com = zero;
		}
		 else if (b2c_com_sd_L <= 0) {
			B2C_sd_com = Percentage;
		} 
		else {
			B2C_sd_com = (int) ((b2c_com_sd_C - b2c_com_sd_L_F) / b2c_com_sd_L_F * 100);
		}
		
		
		 if(b2c_ae_sd_C <= 0 && b2c_ae_sd_L <= 0)
		{
			B2C_sd_ae = zero;
		}
		 else if (b2c_ae_sd_L <= 0) {
			B2C_sd_ae = Percentage;
		} 
		else {
			B2C_sd_ae = (int) ((b2c_ae_sd_C - b2c_ae_sd_L_F) / b2c_ae_sd_L_F * 100);
		}
		
		
		 if(b2c_sa_sd_C <= 0 && b2c_sa_sd_L <= 0)
		{
			B2C_sd_sa = zero;
		}
		 else if (b2c_sa_sd_L <= 0) {
			B2C_sd_sa = Percentage;
		}
		else {
			B2C_sd_sa = (int) ((b2c_sa_sd_C - b2c_sa_sd_L_F) / b2c_sa_sd_L_F * 100);
		}
		
		
		 if(b2c_eg_sd_C <= 0 && b2c_eg_sd_L <= 0)
		{
			B2C_sd_eg = zero;
		}
		 else if (b2c_eg_sd_L <= 0) {
			B2C_sd_eg = Percentage;
		}
		else {
			B2C_sd_eg = (int) ((b2c_eg_sd_C - b2c_eg_sd_L_F) / b2c_eg_sd_L_F * 100);
		}
		
		 
		 
		

		int b2c_com_cn_C = Integer.parseInt(com_b2c_cn);
		int b2c_com_cn_L = Integer.parseInt(com_b2c_cn_L1);
		int b2c_ae_cn_C = Integer.parseInt(ae_b2c_cn);
		int b2c_ae_cn_L = Integer.parseInt(ae_b2c_cn_L1);
		int b2c_sa_cn_C = Integer.parseInt(sa_b2c_cn);
		int b2c_sa_cn_L = Integer.parseInt(sa_b2c_cn_L1);
		int b2c_eg_cn_C = Integer.parseInt(eg_b2c_cn);
		int b2c_eg_cn_L = Integer.parseInt(eg_b2c_cn_L1);

		float b2c_com_cn_L_F=b2c_com_cn_L;
		float b2c_ae_cn_L_F=b2c_ae_cn_L;
		float b2c_sa_cn_L_F=b2c_sa_cn_L;
		float b2c_eg_cn_L_F=b2c_eg_cn_L;
		
		
		 if(b2c_com_cn_C <= 0 && b2c_com_cn_L <= 0)
		{
			B2C_cn_com = zero;
		}
		 else if (b2c_com_cn_L <= 0) {
			B2C_cn_com = Percentage;
		} 
		
		else {
			B2C_cn_com = (int) ((b2c_com_cn_C - b2c_com_cn_L_F) / b2c_com_cn_L_F * 100);
		}
		
		
		 if(b2c_ae_cn_C <= 0 && b2c_ae_cn_L <= 0)
		{
			B2C_cn_ae = zero;
		}
		 else if (b2c_ae_cn_L <= 0) {
			B2C_cn_ae = Percentage;
		}
		else {
			B2C_cn_ae = (int) ((b2c_ae_cn_C - b2c_ae_cn_L_F) / b2c_ae_cn_L_F * 100);
		}
		
		
		 if(b2c_sa_cn_C <= 0 && b2c_sa_cn_L <= 0)
		{
			B2C_cn_sa = zero;
		}
		
		 else if (b2c_sa_cn_L <= 0) {
			B2C_cn_sa = Percentage;
		}
		else {
			B2C_cn_sa = (int) ((b2c_sa_cn_C - b2c_sa_cn_L_F) / b2c_sa_cn_L_F * 100);
		}
		
		
		 if(b2c_eg_cn_C <= 0 && b2c_eg_cn_L <= 0)
		{
			B2C_cn_eg = zero;
		}
		 else if (b2c_eg_cn_L <= 0) {
			B2C_cn_eg = Percentage;
		} 
		else {
			B2C_cn_eg = (int) ((b2c_eg_cn_C - b2c_eg_cn_L_F) / b2c_eg_cn_L_F * 100);
		}
		
		
		 
		 
		 

		int b2c_com_rp_C = Integer.parseInt(com_b2c_rp);
		int b2c_com_rp_L = Integer.parseInt(com_b2c_rp_L1);
		int b2c_ae_rp_C = Integer.parseInt(ae_b2c_rp);
		int b2c_ae_rp_L = Integer.parseInt(ae_b2c_rp_L1);
		int b2c_sa_rp_C = Integer.parseInt(sa_b2c_rp);
		int b2c_sa_rp_L = Integer.parseInt(sa_b2c_rp_L1);
		int b2c_eg_rp_C = Integer.parseInt(eg_b2c_rp);
		int b2c_eg_rp_L = Integer.parseInt(eg_b2c_rp_L1);
		
		float b2c_com_rp_L_F=b2c_com_rp_L;
		float b2c_ae_rp_L_F=b2c_ae_rp_L;
		float b2c_sa_rp_L_F=b2c_sa_rp_L;
		float b2c_eg_rp_L_F=b2c_eg_rp_L;
		
		
		 if(b2c_com_rp_C <= 0 && b2c_com_rp_L <= 0)
		{
			B2C_rp_com = zero;
		}
		
		 else if (b2c_com_rp_L <= 0) {
			B2C_rp_com = Percentage;
		} 
		else {
			B2C_rp_com = (int) ((b2c_com_rp_C - b2c_com_rp_L_F) / b2c_com_rp_L_F * 100);
		}
		
		
		 if(b2c_ae_rp_C <= 0 && b2c_ae_rp_L <= 0)
		{
			B2C_rp_ae = zero;
		}
		 else if (b2c_ae_rp_L <= 0) {
			B2C_rp_ae = Percentage;
		}
		else {
			B2C_rp_ae = (int) ((b2c_ae_rp_C - b2c_ae_rp_L_F) / b2c_ae_rp_L_F * 100);
		}
		
		
		 if(b2c_sa_rp_C <= 0 && b2c_sa_rp_L <= 0)
		{
			B2C_rp_sa = zero;
		}
		 else if (b2c_sa_rp_L <= 0) {
			B2C_rp_sa = Percentage;
		} 
		else {
			B2C_rp_sa = (int) ((b2c_sa_rp_C - b2c_sa_rp_L_F) / b2c_sa_rp_L_F * 100);
		}
		
		
		 if(b2c_eg_rp_C <= 0 && b2c_eg_rp_L <= 0)
		{
			B2C_rp_eg = zero;
		}
		 else if (b2c_eg_rp_L <= 0) {
			B2C_rp_eg = Percentage;
		}
		else {
			B2C_rp_eg = (int) ((b2c_eg_rp_C - b2c_eg_rp_L_F) / b2c_eg_rp_L_F * 100);
		}

		
		
		 
		
		// -----------------------MOBAPP ANDROID------------------------------------------------

		int mobapp_com_ts_C = Integer.parseInt(com_mobapp_ts);
		int mobapp_com_ts_L = Integer.parseInt(com_mobapp_ts_L1);
		int mobapp_ae_ts_C = Integer.parseInt(ae_mobapp_ts);
		int mobapp_ae_ts_L = Integer.parseInt(ae_mobapp_ts_L1);
		int mobapp_sa_ts_C = Integer.parseInt(sa_mobapp_ts);
		int mobapp_sa_ts_L = Integer.parseInt(sa_mobapp_ts_L1);
		int mobapp_eg_ts_C = Integer.parseInt(eg_mobapp_ts);
		int mobapp_eg_ts_L = Integer.parseInt(eg_mobapp_ts_L1);
		
		float mobapp_com_ts_L_F=mobapp_com_ts_L;
		float mobapp_ae_ts_L_F=mobapp_ae_ts_L;
		float mobapp_sa_ts_L_F=mobapp_sa_ts_L;
		float mobapp_eg_ts_L_F=mobapp_eg_ts_L;
		
		
		 if(mobapp_com_ts_C <= 0 && mobapp_com_ts_L <= 0)
		{
			MOBAPP_ts_com = zero;
		}
		 else if (mobapp_com_ts_L <= 0) {
			MOBAPP_ts_com = Percentage;
		} 
		else {
			MOBAPP_ts_com = (int) ((mobapp_com_ts_C - mobapp_com_ts_L_F) / mobapp_com_ts_L_F * 100);
		}
		
		
		 if(mobapp_ae_ts_C <= 0 && mobapp_ae_ts_L <= 0)
		{
			MOBAPP_ts_ae = zero;
		} 
		
		 else if (mobapp_ae_ts_L <= 0) {
			MOBAPP_ts_ae = Percentage;
		}
		else {
			MOBAPP_ts_ae = (int) ((mobapp_ae_ts_C - mobapp_ae_ts_L_F) / mobapp_ae_ts_L_F * 100);
		}
		
		
		 if(mobapp_sa_ts_C <= 0 && mobapp_sa_ts_L <= 0)
		{
			MOBAPP_ts_sa = zero;
		}
		 else if (mobapp_sa_ts_L <= 0) {
			MOBAPP_ts_sa = Percentage;
		} 
		else {
			MOBAPP_ts_sa = (int) ((mobapp_sa_ts_C - mobapp_sa_ts_L_F) / mobapp_sa_ts_L_F * 100);
		}
		
		
		 if(mobapp_eg_ts_C <= 0 && mobapp_eg_ts_L <= 0)
		{
			MOBAPP_ts_eg = zero;
		}
		 else if (mobapp_eg_ts_L <= 0) {
			MOBAPP_ts_eg = Percentage;
		} 
		else {
			MOBAPP_ts_eg = (int) ((mobapp_eg_ts_C - mobapp_eg_ts_L_F) / mobapp_eg_ts_L_F * 100);
		}
		 
		
		
		 

		int mobapp_com_cp_C = Integer.parseInt(com_mobapp_cp);
		int mobapp_com_cp_L = Integer.parseInt(com_mobapp_cp_L1);
		int mobapp_ae_cp_C = Integer.parseInt(ae_mobapp_cp);
		int mobapp_ae_cp_L = Integer.parseInt(ae_mobapp_cp_L1);
		int mobapp_sa_cp_C = Integer.parseInt(sa_mobapp_cp);
		int mobapp_sa_cp_L = Integer.parseInt(sa_mobapp_cp_L1);
		int mobapp_eg_cp_C = Integer.parseInt(eg_mobapp_cp);
		int mobapp_eg_cp_L = Integer.parseInt(eg_mobapp_cp_L1);
		
		float mobapp_com_cp_L_F=mobapp_com_cp_L;
		float mobapp_ae_cp_L_F=mobapp_ae_cp_L;
		float mobapp_sa_cp_L_F=mobapp_sa_cp_L;
		float mobapp_eg_cp_L_F=mobapp_eg_cp_L;

		
		 if(mobapp_com_cp_C <= 0 && mobapp_com_cp_L <= 0)
		{
			MOBAPP_cp_com = zero;
		}
		 else if (mobapp_com_cp_L <= 0) {
			MOBAPP_cp_com = Percentage;
		}
		else {
			MOBAPP_cp_com = (int) ((mobapp_com_cp_C - mobapp_com_cp_L_F) / mobapp_com_cp_L_F * 100);
		}
		
		
		 if(mobapp_ae_cp_C <= 0 && mobapp_ae_cp_L <= 0)
		{
			MOBAPP_cp_ae = zero;
		}
		 else if (mobapp_ae_cp_L <= 0) {
			MOBAPP_cp_ae = Percentage;
		} 
		else {
			MOBAPP_cp_ae = (int) ((mobapp_ae_cp_C - mobapp_ae_cp_L_F) / mobapp_ae_cp_L_F * 100);
		}
		
		
		 if(mobapp_sa_cp_C <= 0 && mobapp_sa_cp_L <= 0)
		{
			MOBAPP_cp_sa = zero;
		}
		 else if (mobapp_sa_cp_L <= 0) {
			MOBAPP_cp_sa = Percentage;
		} 
		else {
			MOBAPP_cp_sa = (int) ((mobapp_sa_cp_C - mobapp_sa_cp_L_F) / mobapp_sa_cp_L_F * 100);
		}
		
		
		 if(mobapp_eg_cp_C <= 0 && mobapp_eg_cp_L <= 0)
		{
			MOBAPP_cp_eg = zero;
		}
		 else if (mobapp_eg_cp_L <= 0) {
			MOBAPP_cp_eg = Percentage;
		} 
		else {
			MOBAPP_cp_eg = (int) ((mobapp_eg_cp_C - mobapp_eg_cp_L_F) / mobapp_eg_cp_L_F * 100);
		}
		
		
		

		int mobapp_com_th_C = Integer.parseInt(com_mobapp_th);
		int mobapp_com_th_L = Integer.parseInt(com_mobapp_th_L1);
		int mobapp_ae_th_C = Integer.parseInt(ae_mobapp_th);
		int mobapp_ae_th_L = Integer.parseInt(ae_mobapp_th_L1);
		int mobapp_sa_th_C = Integer.parseInt(sa_mobapp_th);
		int mobapp_sa_th_L = Integer.parseInt(sa_mobapp_th_L1);
		int mobapp_eg_th_C = Integer.parseInt(eg_mobapp_th);
		int mobapp_eg_th_L = Integer.parseInt(eg_mobapp_th_L1);

		float mobapp_com_th_L_F=mobapp_com_th_L;
		float mobapp_ae_th_L_F=mobapp_ae_th_L;
		float mobapp_sa_th_L_F=mobapp_sa_th_L;
		float mobapp_eg_th_L_F=mobapp_eg_th_L;
		
		
		 if(mobapp_com_th_C <= 0 && mobapp_com_th_L <= 0)
		{
			MOBAPP_th_com = zero;
		}
		 else if (mobapp_com_th_L <= 0) {
			MOBAPP_th_com = Percentage;
		}
		else {
			MOBAPP_th_com = (int) ((mobapp_com_th_C - mobapp_com_th_L_F) / mobapp_com_th_L_F * 100);
		}
		
		
	    if(mobapp_ae_th_C <= 0 && mobapp_ae_th_L <= 0)
		{
			MOBAPP_th_ae = zero;
		}
		else if (mobapp_ae_th_L <= 0) {
			MOBAPP_th_ae = Percentage;
		}
		else {
			MOBAPP_th_ae = (int) ((mobapp_ae_th_C - mobapp_ae_th_L_F) / mobapp_ae_th_L_F * 100);
		}
		
		
		 if(mobapp_sa_th_C <= 0 && mobapp_sa_th_L <= 0)
		{
			MOBAPP_th_sa = zero;
		}
		 else if (mobapp_sa_th_L <= 0) {
			MOBAPP_th_sa = Percentage;
		} 
		else {
			MOBAPP_th_sa = (int) ((mobapp_sa_th_C - mobapp_sa_th_L_F) / mobapp_sa_th_L_F * 100);
		}
		
		
		 if(mobapp_eg_th_C <= 0 && mobapp_eg_th_L <= 0)
		{
			MOBAPP_th_eg = zero;
		}
		
		 else if (mobapp_eg_th_L <= 0) {
			MOBAPP_th_eg = Percentage;
		} 
		else {
			MOBAPP_th_eg = (int) ((mobapp_eg_th_C - mobapp_eg_th_L_F) / mobapp_eg_th_L_F * 100);
		}
		 
		 
		
		

		int mobapp_com_sd_C = Integer.parseInt(com_mobapp_sd);
		int mobapp_com_sd_L = Integer.parseInt(com_mobapp_sd_L1);
		int mobapp_ae_sd_C = Integer.parseInt(ae_mobapp_sd);
		int mobapp_ae_sd_L = Integer.parseInt(ae_mobapp_sd_L1);
		int mobapp_sa_sd_C = Integer.parseInt(sa_mobapp_sd);
		int mobapp_sa_sd_L = Integer.parseInt(sa_mobapp_sd_L1);
		int mobapp_eg_sd_C = Integer.parseInt(eg_mobapp_sd);
		int mobapp_eg_sd_L = Integer.parseInt(eg_mobapp_sd_L1);
		
         float mobapp_com_sd_L_F=mobapp_com_sd_L;
         float mobapp_ae_sd_L_F=mobapp_ae_sd_L;
         float mobapp_sa_sd_L_F=mobapp_sa_sd_L;
         float mobapp_eg_sd_L_F=mobapp_eg_sd_L;
         
		
		 if(mobapp_com_sd_C <= 0 && mobapp_com_sd_L <= 0)
		{
			MOBAPP_sd_com = zero;
		}
		 else if (mobapp_com_sd_L <= 0) {
			MOBAPP_sd_com = Percentage;
		} 
		
		else {
			MOBAPP_sd_com = (int) ((mobapp_com_sd_C - mobapp_com_sd_L_F) / mobapp_com_sd_L_F * 100);
		}
		
		
		 if(mobapp_ae_sd_C <= 0 && mobapp_ae_sd_L <= 0)
		{
			MOBAPP_sd_ae = zero;
		}
		 else if (mobapp_ae_sd_L <= 0) {
			MOBAPP_sd_ae = Percentage;
		} 
		else {
			MOBAPP_sd_ae = (int) ((mobapp_ae_sd_C - mobapp_ae_sd_L_F) / mobapp_ae_sd_L_F * 100);
		}
		
		
		 if(mobapp_sa_sd_C <= 0 && mobapp_sa_sd_L <= 0)
		{
			MOBAPP_sd_sa = zero;
		}
		
		 else if (mobapp_sa_sd_L <= 0) {
			MOBAPP_sd_sa = Percentage;
		} 
		else {
			MOBAPP_sd_sa = (int) ((mobapp_sa_sd_C - mobapp_sa_sd_L_F) / mobapp_sa_sd_L_F * 100);
		}
		
		
		 if(mobapp_eg_sd_C <= 0 && mobapp_eg_sd_L <= 0)
		{
			MOBAPP_sd_eg = zero;
		}
		 else if (mobapp_eg_sd_L <= 0) {
			MOBAPP_sd_eg = Percentage;
		}
		else {
			MOBAPP_sd_eg = (int) ((mobapp_eg_sd_C - mobapp_eg_sd_L_F) / mobapp_eg_sd_L_F * 100);
		}
		
		 
		 
		

		int mobapp_com_cn_C = Integer.parseInt(com_mobapp_cn);
		int mobapp_com_cn_L = Integer.parseInt(com_mobapp_cn_L1);
		int mobapp_ae_cn_C = Integer.parseInt(ae_mobapp_cn);
		int mobapp_ae_cn_L = Integer.parseInt(ae_mobapp_cn_L1);
		int mobapp_sa_cn_C = Integer.parseInt(sa_mobapp_cn);
		int mobapp_sa_cn_L = Integer.parseInt(sa_mobapp_cn_L1);
		int mobapp_eg_cn_C = Integer.parseInt(eg_mobapp_cn);
		int mobapp_eg_cn_L = Integer.parseInt(eg_mobapp_cn_L1);
		
		float mobapp_com_cn_L_F=mobapp_com_cn_L;
		float mobapp_ae_cn_L_F=mobapp_ae_cn_L;
		float mobapp_sa_cn_L_F=mobapp_sa_cn_L;
		float mobapp_eg_cn_L_F=mobapp_eg_cn_L;

		
		 if(mobapp_com_cn_C <= 0 && mobapp_com_sd_L <= 0)
		{
			MOBAPP_cn_com = zero;
		}
		 else if (mobapp_com_sd_L <= 0) {
			MOBAPP_cn_com = Percentage;
		} 
		else {
			MOBAPP_cn_com = (int) ((mobapp_com_cn_C - mobapp_com_cn_L_F) / mobapp_com_cn_L_F * 100);
		}
		
		
		 if(mobapp_ae_cn_C <= 0 && mobapp_ae_sd_L <= 0)
		{
			MOBAPP_cn_ae = zero;
		}
		 else if (mobapp_ae_sd_L <= 0) {
			MOBAPP_cn_ae = Percentage;
		} 
		else {
			MOBAPP_cn_ae = (int) ((mobapp_ae_cn_C - mobapp_ae_cn_L_F) / mobapp_ae_cn_L_F * 100);
		}
		
		
		 if(mobapp_sa_cn_C <= 0 && mobapp_sa_sd_L <= 0)
		{
			MOBAPP_cn_sa = zero;
		}
		 else if (mobapp_sa_sd_L <= 0) {
			MOBAPP_cn_sa = Percentage;
		}
		else {
			MOBAPP_cn_sa = (int) ((mobapp_sa_cn_C - mobapp_sa_cn_L_F) / mobapp_sa_cn_L_F * 100);
		}
		
		
		 if(mobapp_eg_cn_C <= 0 && mobapp_eg_sd_L <= 0)
		{
			MOBAPP_cn_eg = zero;
		}
		 else if (mobapp_eg_sd_L <= 0) {
			MOBAPP_cn_eg = Percentage;
		} 
		else {
			MOBAPP_cn_eg = (int) ((mobapp_eg_cn_C - mobapp_eg_cn_L_F) / mobapp_eg_cn_L_F * 100);
		}
		
		 
		 
		 

		int mobapp_com_rp_C = Integer.parseInt(com_mobapp_rp);
		int mobapp_com_rp_L = Integer.parseInt(com_mobapp_rp_L1);
		int mobapp_ae_rp_C = Integer.parseInt(ae_mobapp_rp);
		int mobapp_ae_rp_L = Integer.parseInt(ae_mobapp_rp_L1);
		int mobapp_sa_rp_C = Integer.parseInt(sa_mobapp_rp);
		int mobapp_sa_rp_L = Integer.parseInt(sa_mobapp_rp_L1);
		int mobapp_eg_rp_C = Integer.parseInt(eg_mobapp_rp);
		int mobapp_eg_rp_L = Integer.parseInt(eg_mobapp_rp_L1);
		
		float mobapp_com_rp_L_F=mobapp_com_rp_L;
		float mobapp_ae_rp_L_F=mobapp_ae_rp_L;
		float mobapp_sa_rp_L_F=mobapp_sa_rp_L;
		float mobapp_eg_rp_L_F=mobapp_eg_rp_L;
		
		
		 if(mobapp_com_rp_C <= 0 && mobapp_com_rp_L <= 0)
		{
			MOBAPP_rp_com = zero;
		}
		 else if (mobapp_com_rp_L <= 0) {
			MOBAPP_rp_com = Percentage;
		} 
		else {
			MOBAPP_rp_com = (int) ((mobapp_com_rp_C - mobapp_com_rp_L_F) / mobapp_com_rp_L_F * 100);
		}
		
		
		 if(mobapp_ae_rp_C <= 0 && mobapp_ae_rp_L <= 0)
		{
			MOBAPP_rp_ae = zero;
		}
		
		 else if (mobapp_ae_rp_L <= 0) {
			MOBAPP_rp_ae = Percentage;
		} 
		else {
			MOBAPP_rp_ae = (int) ((mobapp_ae_rp_C - mobapp_ae_rp_L_F) / mobapp_ae_rp_L_F * 100);
		}
		
		
		 if(mobapp_sa_rp_C <= 0 && mobapp_sa_rp_L <= 0)
		{
			MOBAPP_rp_sa = zero;
		}
		
		 else if (mobapp_sa_rp_L <= 0) {
			MOBAPP_rp_sa = Percentage;
		}
		else {
			MOBAPP_rp_sa = (int) ((mobapp_sa_rp_C - mobapp_sa_rp_L_F) / mobapp_sa_rp_L_F * 100);
		}
		
		
		 if(mobapp_eg_rp_C <= 0 && mobapp_eg_rp_L <= 0)
		{
			MOBAPP_rp_eg = zero;
		}
		 else if (mobapp_eg_rp_L <= 0) {
			MOBAPP_rp_eg = Percentage;
		} 
		else {
			MOBAPP_rp_eg = (int) ((mobapp_eg_rp_C - mobapp_eg_rp_L_F) / mobapp_eg_rp_L_F * 100);
		}
		
		
		 
		 

		// -----------------------MOBAPP IOS------------------------------------------------

		int mobios_com_ts_C = Integer.parseInt(com_mobios_ts);
		int mobios_com_ts_L = Integer.parseInt(com_mobios_ts_L1);
		int mobios_ae_ts_C = Integer.parseInt(ae_mobios_ts);
		int mobios_ae_ts_L = Integer.parseInt(ae_mobios_ts_L1);
		int mobios_sa_ts_C = Integer.parseInt(sa_mobios_ts);
		int mobios_sa_ts_L = Integer.parseInt(sa_mobios_ts_L1);
		int mobios_eg_ts_C = Integer.parseInt(eg_mobios_ts);
		int mobios_eg_ts_L = Integer.parseInt(eg_mobios_ts_L1);

		float mobios_com_ts_L_F=mobios_com_ts_L;
		float mobios_ae_ts_L_F=mobios_ae_ts_L;
		float mobios_sa_ts_L_F=mobios_sa_ts_L;
		float mobios_eg_ts_L_F=mobios_eg_ts_L;
		
		
		 if(mobios_com_ts_C <= 0 && mobios_com_ts_L <= 0)
		{
			MOBIOS_ts_com = zero;
		}
		 else if (mobios_com_ts_L <= 0) {
			MOBIOS_ts_com = Percentage;
		} 
		else {
			MOBIOS_ts_com = (int) ((mobios_com_ts_C - mobios_com_ts_L_F) / mobios_com_ts_L_F * 100);
		}
		
		
		 if(mobios_ae_ts_C <= 0 && mobios_ae_ts_L <= 0)
		{
			MOBIOS_ts_ae = zero;
		}
		 else if (mobios_ae_ts_L <= 0) {
			MOBIOS_ts_ae = Percentage;
		}
		else {
			MOBIOS_ts_ae = (int) ((mobios_ae_ts_C - mobios_ae_ts_L_F) / mobios_ae_ts_L_F * 100);
		}
		
		
		 if(mobios_sa_ts_C <= 0 && mobios_sa_ts_L <= 0)
		{
			MOBIOS_ts_sa = zero;
		}
		
		 else if (mobios_sa_ts_L <= 0) {
			MOBIOS_ts_sa = Percentage;
		}
		else {
			MOBIOS_ts_sa = (int) ((mobios_sa_ts_C - mobios_sa_ts_L_F) / mobios_sa_ts_L_F * 100);
		}
		
		
		 if(mobios_eg_ts_C <= 0 && mobios_eg_ts_L <= 0)
		{
			MOBIOS_ts_eg = zero;
		}
		
		 else if (mobios_eg_ts_L <= 0) {
			MOBIOS_ts_eg = Percentage;
		}
		else {
			MOBIOS_ts_eg = (int) ((mobios_eg_ts_C - mobios_eg_ts_L_F) / mobios_eg_ts_L_F * 100);
		}
		
		
		
		 
		 

		int mobios_com_cp_C = Integer.parseInt(com_mobios_cp);
		int mobios_com_cp_L = Integer.parseInt(com_mobios_cp_L1);
		int mobios_ae_cp_C = Integer.parseInt(ae_mobios_cp);
		int mobios_ae_cp_L = Integer.parseInt(ae_mobios_cp_L1);
		int mobios_sa_cp_C = Integer.parseInt(sa_mobios_cp);
		int mobios_sa_cp_L = Integer.parseInt(sa_mobios_cp_L1);
		int mobios_eg_cp_C = Integer.parseInt(eg_mobios_cp);
		int mobios_eg_cp_L = Integer.parseInt(eg_mobios_cp_L1);
		
		float mobios_com_cp_L_F=mobios_com_cp_L;
		float mobios_ae_cp_L_F=mobios_ae_cp_L;
		float mobios_sa_cp_L_F=mobios_sa_cp_L;
		float mobios_eg_cp_L_F=mobios_eg_cp_L;
		
		
		 if(mobios_com_cp_C <= 0 && mobios_com_cp_L <= 0)
		{
			MOBIOS_cp_com = zero;
		}
		 else if (mobios_com_cp_L <= 0) {
			MOBIOS_cp_com = Percentage;
		} 
		else {
			MOBIOS_cp_com = (int) ((mobios_com_cp_C - mobios_com_cp_L_F) / mobios_com_cp_L_F * 100);
		}
		
		
		 if(mobios_ae_cp_C <= 0 && mobios_ae_cp_L <= 0)
		{
			MOBIOS_cp_ae = zero;
		}
		 else if (mobios_ae_cp_L <= 0) {
			MOBIOS_cp_ae = Percentage;
		} 
		else {
			MOBIOS_cp_ae = (int) ((mobios_ae_cp_C - mobios_ae_cp_L_F) / mobios_ae_cp_L_F * 100);
		}
		
		
		 if(mobios_sa_cp_C <= 0 && mobios_sa_cp_L <= 0)
		{
			MOBIOS_cp_sa = zero;
		}
		 else if (mobios_sa_cp_L <= 0) {
			MOBIOS_cp_sa = Percentage;
		}
		else {
			MOBIOS_cp_sa = (int) ((mobios_sa_cp_C - mobios_sa_cp_L_F) / mobios_sa_cp_L_F * 100);
		}
		
		
		 if(mobios_eg_cp_C <= 0 && mobios_eg_cp_L <= 0)
		{
			MOBIOS_cp_eg = zero;
		}
		
		 else if (mobios_eg_cp_L <= 0) {
			MOBIOS_cp_eg = Percentage;
		}
		else {
			MOBIOS_cp_eg = (int) ((mobios_eg_cp_C - mobios_eg_cp_L_F) / mobios_eg_cp_L_F * 100);
		}
		 
		 
		
		 

		int mobios_com_th_C = Integer.parseInt(com_mobios_th);
		int mobios_com_th_L = Integer.parseInt(com_mobios_th_L1);
		int mobios_ae_th_C = Integer.parseInt(ae_mobios_th);
		int mobios_ae_th_L = Integer.parseInt(ae_mobios_th_L1);
		int mobios_sa_th_C = Integer.parseInt(sa_mobios_th);
		int mobios_sa_th_L = Integer.parseInt(sa_mobios_th_L1);
		int mobios_eg_th_C = Integer.parseInt(eg_mobios_th);
		int mobios_eg_th_L = Integer.parseInt(eg_mobios_th_L1);
		
		float mobios_com_th_L_F=mobios_com_th_L;
		float mobios_ae_th_L_F=mobios_ae_th_L;
		float mobios_sa_th_L_F=mobios_sa_th_L;
		float mobios_eg_th_L_F=mobios_eg_th_L;
		
		
		 if(mobios_com_th_C <= 0 && mobios_com_th_L <= 0)
		{
			MOBIOS_th_com = zero;
		}
		
		 else if (mobios_com_th_L <= 0) {
			MOBIOS_th_com = Percentage;
		} 
		else {
			MOBIOS_th_com = (int) ((mobios_com_th_C - mobios_com_th_L_F) / mobios_com_th_L_F * 100);
		}
		
		
		 if(mobios_ae_th_C <= 0 && mobios_ae_th_L <= 0)
		{
			MOBIOS_th_ae = zero;
		}
		
		 else if (mobios_ae_th_L <= 0) {
			MOBIOS_th_ae = Percentage;
		} 
		else {
			MOBIOS_th_ae = (int) ((mobios_ae_th_C - mobios_ae_th_L_F) / mobios_ae_th_L_F * 100);
		}
		
		
		 if(mobios_sa_th_C <= 0 && mobios_sa_th_L <= 0)
		{
			MOBIOS_th_sa = zero;
		}
		
		 else if (mobios_sa_th_L <= 0) {
			MOBIOS_th_sa = Percentage;
		} 
		else {
			MOBIOS_th_sa = (int) ((mobios_sa_th_C - mobios_sa_th_L_F) / mobios_sa_th_L_F * 100);
		}
		
		
		 if(mobios_eg_th_C <= 0 && mobios_eg_th_L <= 0)
		{
			MOBIOS_th_eg = zero;
		}
		
		 else if (mobios_eg_th_L <= 0) {
			MOBIOS_th_eg = Percentage;
		}
		else {
			MOBIOS_th_eg = (int) ((mobios_eg_th_C - mobios_eg_th_L_F) / mobios_eg_th_L_F * 100);
		}
			

		 
		
		
		 

		int mobios_com_sd_C = Integer.parseInt(com_mobios_sd);
		int mobios_com_sd_L = Integer.parseInt(com_mobios_sd_L1);
		int mobios_ae_sd_C = Integer.parseInt(ae_mobios_sd);
		int mobios_ae_sd_L = Integer.parseInt(ae_mobios_sd_L1);
		int mobios_sa_sd_C = Integer.parseInt(sa_mobios_sd);
		int mobios_sa_sd_L = Integer.parseInt(sa_mobios_sd_L1);
		int mobios_eg_sd_C = Integer.parseInt(eg_mobios_sd);
		int mobios_eg_sd_L = Integer.parseInt(eg_mobios_sd_L1);
		
		float mobios_com_sd_L_F=mobios_com_sd_L;
		float mobios_ae_sd_L_F=mobios_ae_sd_L;
		float mobios_sa_sd_L_F=mobios_sa_sd_L;
		float mobios_eg_sd_L_F=mobios_eg_sd_L;
		
		
		 if(mobios_com_sd_C <= 0 && mobios_com_sd_L <= 0)
		{
			MOBIOS_sd_com = zero;
		}
		 else if (mobios_com_sd_L <= 0) {
			MOBIOS_sd_com = Percentage;
		} 
		else {
			MOBIOS_sd_com = (int) ((mobios_com_sd_C - mobios_com_sd_L_F) / mobios_com_sd_L_F * 100);
		}
		
		 if(mobios_ae_sd_C <= 0 && mobios_ae_sd_L <= 0)
		{
			MOBIOS_sd_ae = zero;
		}
		
		 else if (mobios_ae_sd_L <= 0) {
			MOBIOS_sd_ae = Percentage;
		} 
		else {
			MOBIOS_sd_ae = (int) ((mobios_ae_sd_C - mobios_ae_sd_L_F) / mobios_ae_sd_L_F * 100);
		}
		
		 if(mobios_sa_sd_C <= 0 && mobios_sa_sd_L <= 0)
		{
			MOBIOS_sd_sa = zero;
		}
		
		 else if (mobios_sa_sd_L <= 0) {
			MOBIOS_sd_sa = Percentage;
		} 
		else {
			MOBIOS_sd_sa = (int) ((mobios_sa_sd_C - mobios_sa_sd_L_F) / mobios_sa_sd_L_F * 100);
		}
		
		 if(mobios_eg_sd_C <= 0 && mobios_eg_sd_L <= 0)
		{
			MOBIOS_sd_eg = zero;
		}
		
		 else if (mobios_eg_sd_L <= 0) {
			MOBIOS_sd_eg = Percentage;
		}
		else {
			MOBIOS_sd_eg = (int) ((mobios_eg_sd_C - mobios_eg_sd_L_F) / mobios_eg_sd_L_F * 100);
		}
		
		
		 
		
		

		int mobios_com_cn_C = Integer.parseInt(com_mobios_cn);
		int mobios_com_cn_L = Integer.parseInt(com_mobios_cn_L1);
		int mobios_ae_cn_C = Integer.parseInt(ae_mobios_cn);
		int mobios_ae_cn_L = Integer.parseInt(ae_mobios_cn_L1);
		int mobios_sa_cn_C = Integer.parseInt(sa_mobios_cn);
		int mobios_sa_cn_L = Integer.parseInt(sa_mobios_cn_L1);
		int mobios_eg_cn_C = Integer.parseInt(eg_mobios_cn);
		int mobios_eg_cn_L = Integer.parseInt(eg_mobios_cn_L1);

		float mobios_com_cn_L_F=mobios_com_cn_L;
		float mobios_ae_cn_L_F=mobios_ae_cn_L;
		float mobios_sa_cn_L_F=mobios_sa_cn_L;
		float mobios_eg_cn_L_F=mobios_eg_cn_L;
		
		
		 if(mobios_com_cn_C <= 0 && mobios_com_cn_L <= 0)
		{
			MOBIOS_cn_com = zero;
		}
		 else if (mobios_com_cn_L <= 0) {
			MOBIOS_cn_com = Percentage;
		} 
		else {
			MOBIOS_cn_com = (int) ((mobios_com_cn_C - mobios_com_cn_L_F) / mobios_com_cn_L_F * 100);
		}
		
		 if(mobios_ae_cn_C <= 0 && mobios_ae_cn_L <= 0)
		{
			MOBIOS_cn_ae = zero;
		}
		
		 else if (mobios_ae_cn_L <= 0) {
			MOBIOS_cn_ae = Percentage;
		} 
		else {
			MOBIOS_cn_ae = (int) ((mobios_ae_cn_C - mobios_ae_cn_L_F) / mobios_ae_cn_L_F * 100);
		}
		
		 if(mobios_sa_cn_C <= 0 && mobios_sa_cn_L <= 0)
		{
			MOBIOS_cn_sa = zero;
		}
		
		 else if (mobios_sa_cn_L <= 0) {
			MOBIOS_cn_sa = Percentage;
		}
		else {
			MOBIOS_cn_sa = (int) ((mobios_sa_cn_C - mobios_sa_cn_L_F) / mobios_sa_cn_L_F * 100);
		}
		
		 if(mobios_eg_cn_C <= 0 && mobios_eg_cn_L <= 0)
		{
			MOBIOS_cn_eg = zero;
		}
		
		 else if (mobios_eg_cn_L <= 0) {
			MOBIOS_cn_eg = Percentage;
		}
		else {
			MOBIOS_cn_eg = (int) ((mobios_eg_cn_C - mobios_eg_cn_L_F) / mobios_eg_cn_L_F * 100);
		}
		
		 
		
		 
		 

		int mobios_com_rp_C = Integer.parseInt(com_mobios_rp);
		int mobios_com_rp_L = Integer.parseInt(com_mobios_rp_L1);
		int mobios_ae_rp_C = Integer.parseInt(ae_mobios_rp);
		int mobios_ae_rp_L = Integer.parseInt(ae_mobios_rp_L1);
		int mobios_sa_rp_C = Integer.parseInt(sa_mobios_rp);
		int mobios_sa_rp_L = Integer.parseInt(sa_mobios_rp_L1);
		int mobios_eg_rp_C = Integer.parseInt(eg_mobios_rp);
		int mobios_eg_rp_L = Integer.parseInt(eg_mobios_rp_L1);

		float mobios_com_rp_L_F=mobios_com_rp_L;
		float mobios_ae_rp_L_F=mobios_ae_rp_L;
		float mobios_sa_rp_L_F=mobios_sa_rp_L;
		float mobios_eg_rp_L_F=mobios_eg_rp_L;
		
		
		 if(mobios_com_rp_C <= 0 && mobios_com_rp_L <= 0)
		{
			MOBIOS_rp_com = zero;
		}
		 else if (mobios_com_rp_L <= 0) {
			MOBIOS_rp_com = Percentage;
		} 
		else {
			MOBIOS_rp_com = (int) ((mobios_com_rp_C - mobios_com_rp_L_F) / mobios_com_rp_L_F * 100);
		}
		
		 if(mobios_ae_rp_C <= 0 && mobios_ae_rp_L <= 0)
		{
			MOBIOS_rp_ae = zero;
		}
		
		 else if (mobios_ae_rp_L <= 0) {
			MOBIOS_rp_ae = Percentage;
		}
		else {
			MOBIOS_rp_ae = (int) ((mobios_ae_rp_C - mobios_ae_rp_L_F) / mobios_ae_rp_L_F * 100);
		}
		
		 if(mobios_sa_rp_C <= 0 && mobios_sa_rp_L <= 0)
		{
			MOBIOS_rp_sa = zero;
		}
		
		 else if (mobios_sa_rp_L <= 0) {
			MOBIOS_rp_sa = Percentage;
		}
		else {
			MOBIOS_rp_sa = (int) ((mobios_sa_rp_C - mobios_sa_rp_L_F) / mobios_sa_rp_L_F * 100);
		}
		
		 if(mobios_eg_rp_C <= 0 && mobios_eg_rp_L <= 0)
		{
			MOBIOS_rp_eg = zero;
		}
		
		 else if (mobios_eg_rp_L <= 0) {
			MOBIOS_rp_eg = Percentage;
		}
		else {
			MOBIOS_rp_eg = (int) ((mobios_eg_rp_C - mobios_eg_rp_L_F) / mobios_eg_rp_L_F * 100);
		}
			
		
		
		
		
		
		// -----------------------WEGO------------------------------------------------
		int wego_com_ts_C = Integer.parseInt(com_wego_ts);
		int wego_com_ts_L = Integer.parseInt(com_wego_ts_L1);
		int wego_ae_ts_C = Integer.parseInt(ae_wego_ts);
		int wego_ae_ts_L = Integer.parseInt(ae_wego_ts_L1);
		int wego_sa_ts_C = Integer.parseInt(sa_wego_ts);
		int wego_sa_ts_L = Integer.parseInt(sa_wego_ts_L1);
		int wego_eg_ts_C = Integer.parseInt(eg_wego_ts);
		int wego_eg_ts_L = Integer.parseInt(eg_wego_ts_L1);
		
		float wego_com_ts_L_F=wego_com_ts_L;
		float wego_ae_ts_L_F=wego_ae_ts_L;
		float wego_sa_ts_L_F=wego_sa_ts_L;
		float wego_eg_ts_L_F=wego_eg_ts_L;
		
		
		 if(wego_com_ts_C <= 0 && wego_com_ts_L <= 0)
		{
			WEGO_ts_com = zero;
		}
		
		 else if (wego_com_ts_L <= 0) {
			WEGO_ts_com = Percentage;
		}
		else {
			WEGO_ts_com = (int) ((wego_com_ts_C - wego_com_ts_L_F) / wego_com_ts_L_F * 100);
		}
		
		 if(wego_ae_ts_C <= 0 && wego_ae_ts_L <= 0)
		{
			WEGO_ts_ae = zero;
		}
		
		 else if (wego_ae_ts_L <= 0) {
			WEGO_ts_ae = Percentage;
		} 
		else {
			WEGO_ts_ae = (int) ((wego_ae_ts_C - wego_ae_ts_L_F) / wego_ae_ts_L_F * 100);
		}
		
		 if(wego_sa_ts_C <= 0 && wego_sa_ts_L <= 0)
		{
			WEGO_ts_sa = zero;
		}
		
		 else if (wego_sa_ts_L <= 0) {
			WEGO_ts_sa = Percentage;
		} 
		else {
			WEGO_ts_sa = (int) ((wego_sa_ts_C - wego_sa_ts_L_F) / wego_sa_ts_L_F * 100);
		}
		
		 if(wego_eg_ts_C <= 0 && wego_eg_ts_L <= 0)
		{
			WEGO_ts_eg = zero;
		}
		
		 else if (wego_eg_ts_L <= 0) {
			WEGO_ts_eg = Percentage;
		} 
		else {
			WEGO_ts_eg = (int) ((wego_eg_ts_C - wego_eg_ts_L_F) / wego_eg_ts_L_F * 100);
		}
		 
		
		
		

		int wego_com_cp_C = Integer.parseInt(com_wego_cp);
		int wego_com_cp_L = Integer.parseInt(com_wego_cp_L1);
		int wego_ae_cp_C = Integer.parseInt(ae_wego_cp);
		int wego_ae_cp_L = Integer.parseInt(ae_wego_cp_L1);
		int wego_sa_cp_C = Integer.parseInt(sa_wego_cp);
		int wego_sa_cp_L = Integer.parseInt(sa_wego_cp_L1);
		int wego_eg_cp_C = Integer.parseInt(eg_wego_cp);
		int wego_eg_cp_L = Integer.parseInt(eg_wego_cp_L1);

		float wego_com_cp_L_F=wego_com_cp_L;
		float wego_ae_cp_L_F=wego_ae_cp_L;
		float wego_sa_cp_L_F=wego_sa_cp_L;
		float wego_eg_cp_L_F=wego_eg_cp_L;
		
		
		 if(wego_com_cp_C <= 0 && wego_com_cp_L <= 0)
		{
			WEGO_cp_com = zero;
		}
		
		 else if (wego_com_cp_L <= 0) {
			WEGO_cp_com = Percentage;
		} 
		else {
			WEGO_cp_com = (int) ((wego_com_cp_C - wego_com_cp_L_F) / wego_com_cp_L_F * 100);
		}
		
		 if(wego_ae_cp_C <= 0 && wego_ae_cp_L <= 0)
		{
			WEGO_cp_ae = zero;
		}
		
		 else if (wego_ae_cp_L <= 0) {
			WEGO_cp_ae = Percentage;
		}
		else {
			WEGO_cp_ae = (int) ((wego_ae_cp_C - wego_ae_cp_L_F) / wego_ae_cp_L_F * 100);
		}
		
		 if(wego_sa_cp_C <= 0 && wego_sa_cp_L <= 0)
		{
			WEGO_cp_sa = zero;
		}
		
		 else if (wego_sa_cp_L <= 0) {
			WEGO_cp_sa = Percentage;
		}
		else {
			WEGO_cp_sa = (int) ((wego_sa_cp_C - wego_sa_cp_L_F) / wego_sa_cp_L_F * 100);
		}
		
		 if(wego_eg_cp_C <= 0 && wego_eg_cp_L <= 0)
		{
			WEGO_cp_eg = zero;
		}
		
		 else if (wego_eg_cp_L <= 0) {
			WEGO_cp_eg = Percentage;
		} 
		else {
			WEGO_cp_eg = (int) ((wego_eg_cp_C - wego_eg_cp_L_F) / wego_eg_cp_L_F * 100);
		}
         
		
		
		

		int wego_com_th_C = Integer.parseInt(com_wego_th);
		int wego_com_th_L = Integer.parseInt(com_wego_th_L1);
		int wego_ae_th_C = Integer.parseInt(ae_wego_th);
		int wego_ae_th_L = Integer.parseInt(ae_wego_th_L1);
		int wego_sa_th_C = Integer.parseInt(sa_wego_th);
		int wego_sa_th_L = Integer.parseInt(sa_wego_th_L1);
		int wego_eg_th_C = Integer.parseInt(eg_wego_th);
		int wego_eg_th_L = Integer.parseInt(eg_wego_th_L1);

		float wego_com_th_L_F=wego_com_th_L;
		float wego_ae_th_L_F=wego_ae_th_L;
		float wego_sa_th_L_F=wego_sa_th_L;
		float wego_eg_th_L_F=wego_eg_th_L;
		
		
		 if(wego_com_th_C <= 0 && wego_com_th_L <= 0)
		{
			WEGO_th_com = zero;
		}
		
		 else if (wego_com_th_L <= 0) {
			WEGO_th_com = Percentage;
		} 
		else {
			WEGO_th_com = (int) ((wego_com_th_C - wego_com_th_L_F) / wego_com_th_L_F * 100);
		}
		
		 if(wego_ae_th_C <= 0 && wego_ae_th_L <= 0)
		{
			WEGO_th_ae = zero;
		}
		
		 else if (wego_ae_th_L <= 0) {
			WEGO_th_ae = Percentage;
		}
		else {
			WEGO_th_ae = (int) ((wego_ae_th_C - wego_ae_th_L_F) / wego_ae_th_L_F * 100);
		}
		
		 if(wego_sa_th_C <= 0 && wego_sa_th_L <= 0)
		{
			WEGO_th_sa = zero;
		}
		
		 else if (wego_sa_th_L <= 0) {
			WEGO_th_sa = Percentage;
		} 
		else {
			WEGO_th_sa = (int) ((wego_sa_th_C - wego_sa_th_L_F) / wego_sa_th_L_F * 100);
		}
		
		 if(wego_eg_th_C <= 0 && wego_eg_th_L <= 0)
		{
			WEGO_th_eg = zero;
		}
		
		 else if (wego_eg_th_L <= 0) {
			WEGO_th_eg = Percentage;
		}
		else {
			WEGO_th_eg = (int) ((wego_eg_th_C - wego_eg_th_L_F) / wego_eg_th_L_F * 100);
		}
		
		
		 
		 
		

		int wego_com_sd_C = Integer.parseInt(com_wego_sd);
		int wego_com_sd_L = Integer.parseInt(com_wego_sd_L1);
		int wego_ae_sd_C = Integer.parseInt(ae_wego_sd);
		int wego_ae_sd_L = Integer.parseInt(ae_wego_sd_L1);
		int wego_sa_sd_C = Integer.parseInt(sa_wego_sd);
		int wego_sa_sd_L = Integer.parseInt(sa_wego_sd_L1);
		int wego_eg_sd_C = Integer.parseInt(eg_wego_sd);
		int wego_eg_sd_L = Integer.parseInt(eg_wego_sd_L1);
		
		float wego_com_sd_L_F=wego_com_sd_L;
		float wego_ae_sd_L_F=wego_ae_sd_L;
		float wego_sa_sd_L_F=wego_sa_sd_L;
		float wego_eg_sd_L_F=wego_eg_sd_L;
		
		
		 if(wego_com_sd_C <= 0 && wego_com_sd_L <= 0)
		{
			WEGO_sd_com = zero;
		}
		 else if (wego_com_sd_L <= 0) {
			WEGO_sd_com = Percentage;
		} 
		else {
			WEGO_sd_com = (int) ((wego_com_sd_C - wego_com_sd_L_F) / wego_com_sd_L_F * 100);
		}
		
		 if(wego_ae_sd_C <= 0 && wego_ae_sd_L <= 0)
		{
			WEGO_sd_ae = zero;
		}
		
		 else if (wego_ae_sd_L <= 0) {
			WEGO_sd_ae = Percentage;
		} 
		else {
			WEGO_sd_ae = (int) ((wego_ae_sd_C - wego_ae_sd_L_F) / wego_ae_sd_L_F * 100);
		}
		
		 if(wego_sa_sd_C <= 0 && wego_sa_sd_L <= 0)
		{
			WEGO_sd_sa = zero;
		}
		
		 else if (wego_sa_sd_L <= 0) {
			WEGO_sd_sa = Percentage;
		}
		else {
			WEGO_sd_sa = (int) ((wego_sa_sd_C - wego_sa_sd_L_F) / wego_sa_sd_L_F * 100);
		}
		
		 if(wego_eg_sd_C <= 0 && wego_eg_sd_L <= 0)
		{
			WEGO_sd_eg = zero;
		}
		
		 else if (wego_eg_sd_L <= 0) {
			WEGO_sd_eg = Percentage;
		}
		else {
			WEGO_sd_eg = (int) ((wego_eg_sd_C - wego_eg_sd_L_F) / wego_eg_sd_L_F * 100);
		}
		
		
		
		
		 

		int wego_com_cn_C = Integer.parseInt(com_wego_cn);
		int wego_com_cn_L = Integer.parseInt(com_wego_cn_L1);
		int wego_ae_cn_C = Integer.parseInt(ae_wego_cn);
		int wego_ae_cn_L = Integer.parseInt(ae_wego_cn_L1);
		int wego_sa_cn_C = Integer.parseInt(sa_wego_cn);
		int wego_sa_cn_L = Integer.parseInt(sa_wego_cn_L1);
		int wego_eg_cn_C = Integer.parseInt(eg_wego_cn);
		int wego_eg_cn_L = Integer.parseInt(eg_wego_cn_L1);

		float wego_com_cn_L_F=wego_com_cn_L;
		float wego_ae_cn_L_F=wego_ae_cn_L;
		float wego_sa_cn_L_F=wego_sa_cn_L;
		float wego_eg_cn_L_F=wego_eg_cn_L;
		
		
		 if(wego_com_cn_C <= 0 && wego_com_cn_L <= 0)
		{
			WEGO_cn_com = zero;
		}
		 else if (wego_com_cn_L <= 0) {
			WEGO_cn_com = Percentage;
		} 
		else {
			WEGO_cn_com = (int) ((wego_com_cn_C - wego_com_cn_L_F) / wego_com_cn_L_F * 100);
		}
		
		 if(wego_ae_cn_C <= 0 && wego_ae_cn_L <= 0)
		{
			WEGO_cn_ae = zero;
		}
		
		 else if (wego_ae_cn_L <= 0) {
			WEGO_cn_ae = Percentage;
		}
		else {
			WEGO_cn_ae = (int) ((wego_ae_cn_C - wego_ae_cn_L_F) / wego_ae_cn_L_F * 100);
		}
		
		 if(wego_sa_cn_C <= 0 && wego_sa_cn_L <= 0)
		{
			WEGO_cn_sa = zero;
		}
		
		 else if (wego_sa_cn_L <= 0) {
			WEGO_cn_sa = Percentage;
		}
		else {
			WEGO_cn_sa = (int) ((wego_sa_cn_C - wego_sa_cn_L_F) / wego_sa_cn_L_F * 100);
		}
		
		 if(wego_eg_cn_C <= 0 && wego_eg_cn_L <= 0)
		{
			WEGO_cn_eg = zero;
		}
		 else if (wego_eg_cn_L <= 0) {
			WEGO_cn_eg = Percentage;
		} 
		else {
			WEGO_cn_eg = (int) ((wego_eg_cn_C - wego_eg_cn_L_F) / wego_eg_cn_L_F * 100);
		}
		
		
		 
		 
		

		int wego_com_rp_C = Integer.parseInt(com_wego_rp);
		int wego_com_rp_L = Integer.parseInt(com_wego_rp_L1);
		int wego_ae_rp_C = Integer.parseInt(ae_wego_rp);
		int wego_ae_rp_L = Integer.parseInt(ae_wego_rp_L1);
		int wego_sa_rp_C = Integer.parseInt(sa_wego_rp);
		int wego_sa_rp_L = Integer.parseInt(sa_wego_rp_L1);
		int wego_eg_rp_C = Integer.parseInt(eg_wego_rp);
		int wego_eg_rp_L = Integer.parseInt(eg_wego_rp_L1);

		float wego_com_rp_L_F=wego_com_rp_L;
		float wego_ae_rp_L_F=wego_ae_rp_L;
		float wego_sa_rp_L_F=wego_sa_rp_L;
		float wego_eg_rp_L_F=wego_eg_rp_L;
		
		
		 if(wego_com_rp_C <= 0 && wego_com_rp_L <= 0)
		{
			WEGO_rp_com = zero;
		}
		
		 else if (wego_com_rp_L <= 0) {
			WEGO_rp_com = Percentage;
		} 
		else {
			WEGO_rp_com = (int) ((wego_com_rp_C - wego_com_rp_L_F) / wego_com_rp_L_F * 100);
		}
		
		 if(wego_ae_rp_C <= 0 && wego_ae_rp_L <= 0)
		{
			WEGO_rp_ae = zero;
		}
		
		 else if (wego_ae_rp_L <= 0) {
			WEGO_rp_ae = Percentage;
		} 
		else {
			WEGO_rp_ae = (int) ((wego_ae_rp_C - wego_ae_rp_L_F) / wego_ae_rp_L_F * 100);
		}
		
		 if(wego_sa_rp_C <= 0 && wego_sa_rp_L <= 0)
		{
			WEGO_rp_sa = zero;
		}
		
		 else if (wego_sa_rp_L <= 0) {
			WEGO_rp_sa = Percentage;
		} 
		else {
			WEGO_rp_sa = (int) ((wego_sa_rp_C - wego_sa_rp_L_F) / wego_sa_rp_L_F * 100);
		}
		
		 if(wego_eg_rp_C <= 0 && wego_eg_rp_L <= 0)
		{
			WEGO_rp_eg = zero;
		}
		
		 else if (wego_eg_rp_L <= 0) {
			WEGO_rp_eg = Percentage;
		} 
		else {
			WEGO_rp_eg = (int) ((wego_eg_rp_C - wego_eg_rp_L_F) / wego_eg_rp_L_F * 100);
		}
		
		
		
		
		 

		// -----------------------SKYSCAN------------------------------------------------
		int skyscan_com_ts_C = Integer.parseInt(com_skyscan_ts);
		int skyscan_com_ts_L = Integer.parseInt(com_skyscan_ts_L1);
		int skyscan_ae_ts_C = Integer.parseInt(ae_skyscan_ts);
		int skyscan_ae_ts_L = Integer.parseInt(ae_skyscan_ts_L1);
		int skyscan_sa_ts_C = Integer.parseInt(sa_skyscan_ts);
		int skyscan_sa_ts_L = Integer.parseInt(sa_skyscan_ts_L1);
		int skyscan_eg_ts_C = Integer.parseInt(eg_skyscan_ts);
		int skyscan_eg_ts_L = Integer.parseInt(eg_skyscan_ts_L1);
		
		float skyscan_com_ts_L_F=skyscan_com_ts_L;
		float skyscan_ae_ts_L_F=skyscan_ae_ts_L;
		float skyscan_sa_ts_L_F=skyscan_sa_ts_L;
		float skyscan_eg_ts_L_F=skyscan_eg_ts_L;
		
		
		 if(skyscan_com_ts_C <= 0 && skyscan_com_ts_L <= 0)
		{
			SKYSCAN_ts_com = zero;
		}
		
		 else if (skyscan_com_ts_L <= 0) {
			SKYSCAN_ts_com = Percentage;
		} 
		else {
			SKYSCAN_ts_com = (int) ((skyscan_com_ts_C - skyscan_com_ts_L_F) / skyscan_com_ts_L_F * 100);
		}
		
		 if(skyscan_ae_ts_C <= 0 && skyscan_ae_ts_L <= 0)
		{
			SKYSCAN_ts_ae = zero;
		}
		
		 else if (skyscan_ae_ts_L <= 0) {
			SKYSCAN_ts_ae = Percentage;
		} 
		else {
			SKYSCAN_ts_ae = (int) ((skyscan_ae_ts_C - skyscan_ae_ts_L_F) / skyscan_ae_ts_L_F * 100);
		}
		
		 if(skyscan_sa_ts_C <= 0 && skyscan_sa_ts_L <= 0)
		{
			SKYSCAN_ts_sa = zero;
		}
		
		 else if (skyscan_sa_ts_L <= 0) {
			SKYSCAN_ts_sa = Percentage;
		} 
		else {
			SKYSCAN_ts_sa = (int) ((skyscan_sa_ts_C - skyscan_sa_ts_L_F) / skyscan_sa_ts_L_F * 100);
		}
		
		 if(skyscan_eg_ts_C <= 0 && skyscan_eg_ts_L <= 0)
		{
			SKYSCAN_ts_eg = zero;
		}
		
		 else if (skyscan_eg_ts_L <= 0) {
			SKYSCAN_ts_eg = Percentage;
		}
		else {
			SKYSCAN_ts_eg = (int) ((skyscan_eg_ts_C - skyscan_eg_ts_L_F) / skyscan_eg_ts_L_F * 100);
		}
		
		
		
		 

		int skyscan_com_cp_C = Integer.parseInt(com_skyscan_cp);
		int skyscan_com_cp_L = Integer.parseInt(com_skyscan_cp_L1);
		int skyscan_ae_cp_C = Integer.parseInt(ae_skyscan_cp);
		int skyscan_ae_cp_L = Integer.parseInt(ae_skyscan_cp_L1);
		int skyscan_sa_cp_C = Integer.parseInt(sa_skyscan_cp);
		int skyscan_sa_cp_L = Integer.parseInt(sa_skyscan_cp_L1);
		int skyscan_eg_cp_C = Integer.parseInt(eg_skyscan_cp);
		int skyscan_eg_cp_L = Integer.parseInt(eg_skyscan_cp_L1);
		
		float skyscan_com_cp_L_F=skyscan_com_cp_L;
		float skyscan_ae_cp_L_F=skyscan_ae_cp_L;
		float skyscan_sa_cp_L_F=skyscan_sa_cp_L;
		float skyscan_eg_cp_L_F=skyscan_eg_cp_L;
		
		
		 if(skyscan_com_cp_C <= 0 && skyscan_com_cp_L <= 0)
		{
			SKYSCAN_cp_com = zero;
		}
		
		 else if (skyscan_com_cp_L <= 0) {
			SKYSCAN_cp_com = Percentage;
		} 
		else {
			SKYSCAN_cp_com = (int) ((skyscan_com_cp_C - skyscan_com_cp_L_F) / skyscan_com_cp_L_F * 100);
		}
		
		 if(skyscan_ae_cp_C <= 0 && skyscan_ae_cp_L <= 0)
		{
			SKYSCAN_cp_ae = zero;
		}
		
		 else if (skyscan_ae_cp_L <= 0) {
			SKYSCAN_cp_ae = Percentage;
		}
		else {
			SKYSCAN_cp_ae = (int) ((skyscan_ae_cp_C - skyscan_ae_cp_L_F) / skyscan_ae_cp_L_F * 100);
		}
		
		 if(skyscan_sa_cp_C <= 0 && skyscan_sa_cp_L <= 0)
		{
			SKYSCAN_cp_sa = zero;
		}
		
		 else if (skyscan_sa_cp_L <= 0) {
			SKYSCAN_cp_sa = Percentage;
		} 
		else {
			SKYSCAN_cp_sa = (int) ((skyscan_sa_cp_C - skyscan_sa_cp_L_F) / skyscan_sa_cp_L_F * 100);
		}
		
		 if(skyscan_eg_cp_C <= 0 && skyscan_eg_cp_L <= 0)
		{
			SKYSCAN_cp_eg = zero;
		}
		
		 else if (skyscan_eg_cp_L <= 0) {
			SKYSCAN_cp_eg = Percentage;
		} 
		else {
			SKYSCAN_cp_eg = (int) ((skyscan_eg_cp_C - skyscan_eg_cp_L_F) / skyscan_eg_cp_L_F * 100);
		}
		
		 
		
		 

		int skyscan_com_th_C = Integer.parseInt(com_skyscan_th);
		int skyscan_com_th_L = Integer.parseInt(com_skyscan_th_L1);
		int skyscan_ae_th_C = Integer.parseInt(ae_skyscan_th);
		int skyscan_ae_th_L = Integer.parseInt(ae_skyscan_th_L1);
		int skyscan_sa_th_C = Integer.parseInt(sa_skyscan_th);
		int skyscan_sa_th_L = Integer.parseInt(sa_skyscan_th_L1);
		int skyscan_eg_th_C = Integer.parseInt(eg_skyscan_th);
		int skyscan_eg_th_L = Integer.parseInt(eg_skyscan_th_L1);
		
		float skyscan_com_th_L_F=skyscan_com_th_L;
		float skyscan_ae_th_L_F=skyscan_ae_th_L;
		float skyscan_sa_th_L_F=skyscan_sa_th_L;
		float skyscan_eg_th_L_F=skyscan_eg_th_L;
		
		
		 if(skyscan_com_th_C <= 0 && skyscan_com_th_L <= 0)
		{
			SKYSCAN_th_com = zero;
		}
		 else if (skyscan_com_th_L <= 0) {
			SKYSCAN_th_com = Percentage;
		} 
		else {
			SKYSCAN_th_com = (int) ((skyscan_com_th_C - skyscan_com_th_L_F) / skyscan_com_th_L_F * 100);
		}
		
		 if(skyscan_ae_th_C <= 0 && skyscan_ae_th_L <= 0)
		{
			SKYSCAN_th_ae = zero;
		}
		
		 else if (skyscan_ae_th_L <= 0) {
			SKYSCAN_th_ae = Percentage;
		}
		else {
			SKYSCAN_th_ae = (int) ((skyscan_ae_th_C - skyscan_ae_th_L_F) / skyscan_ae_th_L_F * 100);
		}
		
		 if(skyscan_sa_th_C <= 0 && skyscan_sa_th_L <= 0)
		{
			SKYSCAN_th_sa = zero;
		}
		
		 else if (skyscan_sa_th_L <= 0) {
			SKYSCAN_th_sa = Percentage;
		}
		else {
			SKYSCAN_th_sa = (int) ((skyscan_sa_th_C - skyscan_sa_th_L_F) / skyscan_sa_th_L_F * 100);
		}
		
		 if(skyscan_eg_th_C <= 0 && skyscan_eg_th_L <= 0)
		{
			SKYSCAN_th_eg = zero;
		}
		
		 else if (skyscan_eg_th_L <= 0) {
			SKYSCAN_th_eg = Percentage;
		} 
		else {
			SKYSCAN_th_eg = (int) ((skyscan_eg_th_C - skyscan_eg_th_L_F) / skyscan_eg_th_L_F * 100);
		}
		 
		
		 
		 

		int skyscan_com_sd_C = Integer.parseInt(com_skyscan_sd);
		int skyscan_com_sd_L = Integer.parseInt(com_skyscan_sd_L1);
		int skyscan_ae_sd_C = Integer.parseInt(ae_skyscan_sd);
		int skyscan_ae_sd_L = Integer.parseInt(ae_skyscan_sd_L1);
		int skyscan_sa_sd_C = Integer.parseInt(sa_skyscan_sd);
		int skyscan_sa_sd_L = Integer.parseInt(sa_skyscan_sd_L1);
		int skyscan_eg_sd_C = Integer.parseInt(eg_skyscan_sd);
		int skyscan_eg_sd_L = Integer.parseInt(eg_skyscan_sd_L1);
		
		float skyscan_com_sd_L_F=skyscan_com_sd_L;
		float skyscan_ae_sd_L_F=skyscan_ae_sd_L;
		float skyscan_sa_sd_L_F=skyscan_sa_sd_L;
		float skyscan_eg_sd_L_F=skyscan_eg_sd_L;
		
		
		 if(skyscan_com_sd_C <= 0 && skyscan_com_sd_L <= 0)
		{
			SKYSCAN_sd_com = zero;
		}
		
		 else if (skyscan_com_sd_L <= 0) {
			SKYSCAN_sd_com = Percentage;
		} 
		else {
			SKYSCAN_sd_com = (int) ((skyscan_com_sd_C - skyscan_com_sd_L_F) / skyscan_com_sd_L_F * 100);
		}
		
		 if(skyscan_ae_sd_C <= 0 && skyscan_ae_sd_L <= 0)
		{
			SKYSCAN_sd_ae = zero;
		}
		
		 else if (skyscan_ae_sd_L <= 0) {
			SKYSCAN_sd_ae = Percentage;
		} 
		else {
			SKYSCAN_sd_ae = (int) ((skyscan_ae_sd_C - skyscan_ae_sd_L_F) / skyscan_ae_sd_L_F * 100);
		}
		
		 if(skyscan_sa_sd_C <= 0 && skyscan_sa_sd_L <= 0)
		{
			SKYSCAN_sd_sa = zero;
		}
		
		 else if (skyscan_sa_sd_L <= 0) {
			SKYSCAN_sd_sa = Percentage;
		} 
		else {
			SKYSCAN_sd_sa = (int) ((skyscan_sa_sd_C - skyscan_sa_sd_L_F) / skyscan_sa_sd_L_F * 100);
		}
		
		 if(skyscan_eg_sd_C <= 0 && skyscan_eg_sd_L <= 0)
		{
			SKYSCAN_sd_eg = zero;
		}
		
		 else if (skyscan_eg_sd_L <= 0) {
			SKYSCAN_sd_eg = Percentage;
		} 
		else {
			SKYSCAN_sd_eg = (int) ((skyscan_eg_sd_C - skyscan_eg_sd_L_F) / skyscan_eg_sd_L_F * 100);
		}
		
		 
		
		 

		int skyscan_com_cn_C = Integer.parseInt(com_skyscan_cn);
		int skyscan_com_cn_L = Integer.parseInt(com_skyscan_cn_L1);
		int skyscan_ae_cn_C = Integer.parseInt(ae_skyscan_cn);
		int skyscan_ae_cn_L = Integer.parseInt(ae_skyscan_cn_L1);
		int skyscan_sa_cn_C = Integer.parseInt(sa_skyscan_cn);
		int skyscan_sa_cn_L = Integer.parseInt(sa_skyscan_cn_L1);
		int skyscan_eg_cn_C = Integer.parseInt(eg_skyscan_cn);
		int skyscan_eg_cn_L = Integer.parseInt(eg_skyscan_cn_L1);
		
		float skyscan_com_cn_L_F=skyscan_com_cn_L;
		float skyscan_ae_cn_L_F=skyscan_ae_cn_L;
		float skyscan_sa_cn_L_F=skyscan_sa_cn_L;
		float skyscan_eg_cn_L_F=skyscan_eg_cn_L;

		
		 if(skyscan_com_cn_C <= 0 && skyscan_com_cn_L <= 0)
		{
			SKYSCAN_cn_com = zero;
		}
		
		 else if (skyscan_com_cn_L <= 0) {
			SKYSCAN_cn_com = Percentage;
		}
		else {
			SKYSCAN_cn_com = (int) ((skyscan_com_cn_C - skyscan_com_cn_L_F) / skyscan_com_cn_L_F * 100);
		}
		
		 if(skyscan_ae_cn_C <= 0 && skyscan_ae_cn_L <= 0)
		{
			SKYSCAN_cn_ae = zero;
		}
		 else if (skyscan_ae_cn_L <= 0) {
			SKYSCAN_cn_ae = Percentage;
		} 
		else {
			SKYSCAN_cn_ae = (int) ((skyscan_ae_cn_C - skyscan_ae_cn_L_F) / skyscan_ae_cn_L_F * 100);
		}
		
		
		 if(skyscan_sa_cn_C <= 0 && skyscan_sa_cn_L <= 0)
		{
			SKYSCAN_cn_sa = zero;
		}
		 else if (skyscan_sa_cn_L <= 0) {
			SKYSCAN_cn_sa = Percentage;
		}
		else {
			SKYSCAN_cn_sa = (int) ((skyscan_sa_cn_C - skyscan_sa_cn_L_F) / skyscan_sa_cn_L_F * 100);
		}
		
		 if(skyscan_eg_cn_C <= 0 && skyscan_eg_cn_L <= 0)
		{
			SKYSCAN_cn_eg = zero;
		}
		
		 else if (skyscan_eg_cn_L <= 0) {
			SKYSCAN_cn_eg = Percentage;
		} 
		else {
			SKYSCAN_cn_eg = (int) ((skyscan_eg_cn_C - skyscan_eg_cn_L_F) / skyscan_eg_cn_L_F * 100);
		}
		
		
		
		
		 

		int skyscan_com_rp_C = Integer.parseInt(com_skyscan_rp);
		int skyscan_com_rp_L = Integer.parseInt(com_skyscan_rp_L1);
		int skyscan_ae_rp_C = Integer.parseInt(ae_skyscan_rp);
		int skyscan_ae_rp_L = Integer.parseInt(ae_skyscan_rp_L1);
		int skyscan_sa_rp_C = Integer.parseInt(sa_skyscan_rp);
		int skyscan_sa_rp_L = Integer.parseInt(sa_skyscan_rp_L1);
		int skyscan_eg_rp_C = Integer.parseInt(eg_skyscan_rp);
		int skyscan_eg_rp_L = Integer.parseInt(eg_skyscan_rp_L1);
		
		float skyscan_com_rp_L_F=skyscan_com_rp_L;
		float skyscan_ae_rp_L_F=skyscan_ae_rp_L;
		float skyscan_sa_rp_L_F=skyscan_sa_rp_L;
		float skyscan_eg_rp_L_F=skyscan_eg_rp_L;
		
		
		 if(skyscan_com_rp_C <= 0 && skyscan_com_rp_L <= 0)
		{
			SKYSCAN_rp_com = zero;
		}
		 else if (skyscan_com_rp_L <= 0) {
			SKYSCAN_rp_com = Percentage;
		} 
		else {
			SKYSCAN_rp_com = (int) ((skyscan_com_rp_C - skyscan_com_rp_L_F) / skyscan_com_rp_L_F * 100);
		}
		
		 if(skyscan_ae_rp_C <= 0 && skyscan_ae_rp_L <= 0)
		{
			SKYSCAN_rp_ae = zero;
		}
		
		 else if (skyscan_ae_rp_L <= 0) {
			SKYSCAN_rp_ae = Percentage;
		} 
		else {
			SKYSCAN_rp_ae = (int) ((skyscan_ae_rp_C - skyscan_ae_rp_L_F) / skyscan_ae_rp_L_F * 100);
		}
		
		 if(skyscan_sa_rp_C <= 0 && skyscan_sa_rp_L <= 0)
		{
			SKYSCAN_rp_sa = zero;
		}
		
		 else if (skyscan_sa_rp_L <= 0) {
			SKYSCAN_rp_sa = Percentage;
		}
		else {
			SKYSCAN_rp_sa = (int) ((skyscan_sa_rp_C - skyscan_sa_rp_L_F) / skyscan_sa_rp_L_F * 100);
		}
		
		 if(skyscan_eg_rp_C <= 0 && skyscan_eg_rp_L <= 0)
		{
			SKYSCAN_rp_eg = zero;
		}
		
		 else if (skyscan_eg_rp_L <= 0) {
			SKYSCAN_rp_eg = Percentage;
		} 
		else {
			SKYSCAN_rp_eg = (int) ((skyscan_eg_rp_C - skyscan_eg_rp_L_F) / skyscan_eg_rp_L_F * 100);
		}

		
		
		 
		

		// -----------------------OTHERS------------------------------------------------
		int others_com_ts_C = Integer.parseInt(com_others_ts);
		int others_com_ts_L = Integer.parseInt(com_others_ts_L1);
		int others_ae_ts_C = Integer.parseInt(ae_others_ts);
		int others_ae_ts_L = Integer.parseInt(ae_others_ts_L1);
		int others_sa_ts_C = Integer.parseInt(sa_others_ts);
		int others_sa_ts_L = Integer.parseInt(sa_others_ts_L1);
		int others_eg_ts_C = Integer.parseInt(eg_others_ts);
		int others_eg_ts_L = Integer.parseInt(eg_others_ts_L1);

		float others_com_ts_L_F=others_com_ts_L;
		float others_ae_ts_L_F=others_ae_ts_L;
		float others_sa_ts_L_F=others_sa_ts_L;
		float others_eg_ts_L_F=others_eg_ts_L;
		
		
		 if(others_com_ts_C <= 0 && others_com_ts_L <= 0)
		{
			OTHERS_ts_com = zero;
		}
		
		 else if (others_com_ts_L <= 0) {
			OTHERS_ts_com = Percentage;
		} 
		else {
			OTHERS_ts_com = (int) ((others_com_ts_C - others_com_ts_L_F) / others_com_ts_L_F * 100);
		}
		
		 if(others_ae_ts_C <= 0 && others_ae_ts_L <= 0)
		{
			OTHERS_ts_ae = zero;
		}
		
		 else if (others_ae_ts_L <= 0) {
			OTHERS_ts_ae = Percentage;
		} 
		else {
			OTHERS_ts_ae = (int) ((others_ae_ts_C - others_ae_ts_L_F) / others_ae_ts_L_F * 100);
		}
		
		 if(others_sa_ts_C <= 0 && others_sa_ts_L <= 0)
		{
			OTHERS_ts_sa = zero;
		}
		
		 else if (others_sa_ts_L <= 0) {
			OTHERS_ts_sa = Percentage;
		} 
		else {
			OTHERS_ts_sa = (int) ((others_sa_ts_C - others_sa_ts_L_F) / others_sa_ts_L_F * 100);
		}
		
		 if(others_eg_ts_C <= 0 && others_eg_ts_L <= 0)
		{
			OTHERS_ts_eg = zero;
		}
		
		 else if (others_eg_ts_L <= 0) {
			OTHERS_ts_eg = Percentage;
		} 
		else {
			OTHERS_ts_eg = (int) ((others_eg_ts_C - others_eg_ts_L_F) / others_eg_ts_L_F * 100);
		}
		
		
		
		 
		 

		int others_com_cp_C = Integer.parseInt(com_others_cp);
		int others_com_cp_L = Integer.parseInt(com_others_cp_L1);
		int others_ae_cp_C = Integer.parseInt(ae_others_cp);
		int others_ae_cp_L = Integer.parseInt(ae_others_cp_L1);
		int others_sa_cp_C = Integer.parseInt(sa_others_cp);
		int others_sa_cp_L = Integer.parseInt(sa_others_cp_L1);
		int others_eg_cp_C = Integer.parseInt(eg_others_cp);
		int others_eg_cp_L = Integer.parseInt(eg_others_cp_L1);

		float others_com_cp_L_F=others_com_cp_L;
		float others_ae_cp_L_F=others_ae_cp_L;
		float others_sa_cp_L_F=others_sa_cp_L;
		float others_eg_cp_L_F=others_eg_cp_L;
		
		
		 if(others_com_cp_C <= 0 && others_com_cp_L <= 0)
		{
			OTHERS_cp_com = zero;
		}
		
		 else if (others_com_cp_L <= 0) {
			OTHERS_cp_com = Percentage;
		} 
		else {
			OTHERS_cp_com = (int) ((others_com_cp_C - others_com_cp_L_F) / others_com_cp_L_F * 100);
		}
		
		 if(others_ae_cp_C <= 0 && others_ae_cp_L <= 0)
		{
			OTHERS_cp_ae = zero;
		}
		
		 else if (others_ae_cp_L <= 0) {
			OTHERS_cp_ae = Percentage;
		}
		else {
			OTHERS_cp_ae = (int) ((others_ae_cp_C - others_ae_cp_L_F) / others_ae_cp_L_F * 100);
		}
		
		 if(others_sa_cp_C <= 0 && others_sa_cp_L <= 0)
		{
			OTHERS_cp_sa = zero;
		}
		
		 else if (others_sa_cp_L <= 0) {
			OTHERS_cp_sa = Percentage;
		}
		else {
			OTHERS_cp_sa = (int) ((others_sa_cp_C - others_sa_cp_L_F) / others_sa_cp_L_F * 100);
		}
		
		 if(others_eg_cp_C <= 0 && others_eg_cp_L <= 0)
		{
			OTHERS_cp_eg = zero;
		}
		
		 else if (others_eg_cp_L <= 0) {
			OTHERS_cp_eg = Percentage;
		} 
		else {
			OTHERS_cp_eg = (int) ((others_eg_cp_C - others_eg_cp_L_F) / others_eg_cp_L_F * 100);
		}
		
		 
		
		 

		int others_com_th_C = Integer.parseInt(com_others_th);
		int others_com_th_L = Integer.parseInt(com_others_th_L1);
		int others_ae_th_C = Integer.parseInt(ae_others_th);
		int others_ae_th_L = Integer.parseInt(ae_others_th_L1);
		int others_sa_th_C = Integer.parseInt(sa_others_th);
		int others_sa_th_L = Integer.parseInt(sa_others_th_L1);
		int others_eg_th_C = Integer.parseInt(eg_others_th);
		int others_eg_th_L = Integer.parseInt(eg_others_th_L1);

		float others_com_th_L_F=others_com_th_L;
		float others_ae_th_L_F=others_ae_th_L;
		float others_sa_th_L_F=others_sa_th_L;
		float others_eg_th_L_F=others_eg_th_L;
		
		
		 if(others_com_th_C <= 0 && others_com_th_L <= 0)
		{
			OTHERS_th_com = zero;
		}
		 else if (others_com_th_L <= 0) {
			OTHERS_th_com = Percentage;
		} 
		else {
			OTHERS_th_com = (int) ((others_com_th_C - others_com_th_L_F) / others_com_th_L_F * 100);
		}
		
		
		 if(others_ae_th_C <= 0 && others_ae_th_L <= 0)
		{
			OTHERS_th_ae = zero;
		}
		 else if (others_ae_th_L <= 0) {
			OTHERS_th_ae = Percentage;
		} 
		else {
			OTHERS_th_ae = (int) ((others_ae_th_C - others_ae_th_L_F) / others_ae_th_L_F * 100);
		}
		
		 if(others_sa_th_C <= 0 && others_sa_th_L <= 0)
		{
			OTHERS_th_sa = zero;
		}
		 else if (others_sa_th_L <= 0) {
			OTHERS_th_sa = Percentage;
		} 
		else {
			OTHERS_th_sa = (int) ((others_sa_th_C - others_sa_th_L_F) / others_sa_th_L_F * 100);
		}
		
		 if(others_eg_th_C <= 0 && others_eg_th_L <= 0)
		{
			OTHERS_th_eg = zero;
		}
		 else if (others_eg_th_L <= 0) {
			OTHERS_th_eg = Percentage;
		}
		else {
			OTHERS_th_eg = (int) ((others_eg_th_C - others_eg_th_L_F) / others_eg_th_L_F * 100);
		}
		
		
		
		 
		

		int others_com_sd_C = Integer.parseInt(com_others_sd);
		int others_com_sd_L = Integer.parseInt(com_others_sd_L1);
		int others_ae_sd_C = Integer.parseInt(ae_others_sd);
		int others_ae_sd_L = Integer.parseInt(ae_others_sd_L1);
		int others_sa_sd_C = Integer.parseInt(sa_others_sd);
		int others_sa_sd_L = Integer.parseInt(sa_others_sd_L1);
		int others_eg_sd_C = Integer.parseInt(eg_others_sd);
		int others_eg_sd_L = Integer.parseInt(eg_others_sd_L1);

		float others_com_sd_L_F=others_com_sd_L;
		float others_ae_sd_L_F=others_ae_sd_L;
		float others_sa_sd_L_F=others_sa_sd_L;
		float others_eg_sd_L_F=others_eg_sd_L;
		
		
		 if(others_com_sd_C <= 0 && others_com_sd_L <= 0)
		{
			OTHERS_sd_com = zero;
		}
		
		 else if (others_com_sd_L <= 0) {
			OTHERS_sd_com = Percentage;
		} 
		else {
			OTHERS_sd_com = (int) ((others_com_sd_C - others_com_sd_L_F) / others_com_sd_L_F * 100);
		}
		
		 if(others_ae_sd_C <= 0 && others_ae_sd_L <= 0)
		{
			OTHERS_sd_ae = zero;
		}
		 else if (others_ae_sd_L <= 0) {
			OTHERS_sd_ae = Percentage;
		}
		else {
			OTHERS_sd_ae = (int) ((others_ae_sd_C - others_ae_sd_L_F) / others_ae_sd_L_F * 100);
		}
		
		 if(others_sa_sd_C <= 0 && others_sa_sd_L <= 0)
		{
			OTHERS_sd_sa = zero;
		}
		
		 else if (others_sa_sd_L <= 0) {
			OTHERS_sd_sa = Percentage;
		} 
		else {
			OTHERS_sd_sa = (int) ((others_sa_sd_C - others_sa_sd_L_F) / others_sa_sd_L_F * 100);
		}
		
		 if(others_eg_sd_C <= 0 && others_eg_sd_L <= 0)
		{
			OTHERS_sd_eg = zero;
		}
		
		 else if (others_eg_sd_L <= 0) {
			OTHERS_sd_eg = Percentage;
		} 
		else {
			OTHERS_sd_eg = (int) ((others_eg_sd_C - others_eg_sd_L_F) / others_eg_sd_L_F * 100);
		}
		
		
		
		
		

		int others_com_cn_C = Integer.parseInt(com_others_cn);
		int others_com_cn_L = Integer.parseInt(com_others_cn_L1);
		int others_ae_cn_C = Integer.parseInt(ae_others_cn);
		int others_ae_cn_L = Integer.parseInt(ae_others_cn_L1);
		int others_sa_cn_C = Integer.parseInt(sa_others_cn);
		int others_sa_cn_L = Integer.parseInt(sa_others_cn_L1);
		int others_eg_cn_C = Integer.parseInt(eg_others_cn);
		int others_eg_cn_L = Integer.parseInt(eg_others_cn_L1);

		float others_com_cn_L_F=others_com_cn_L;
		float others_ae_cn_L_F=others_ae_cn_L;
		float others_sa_cn_L_F=others_sa_cn_L;
		float others_eg_cn_L_F=others_eg_cn_L;
		
		
		 if(others_com_cn_C <= 0 && others_com_cn_L <= 0)
		{
			OTHERS_cn_com = zero;
		}
		
		 else if (others_com_cn_L <= 0) {
			OTHERS_cn_com = Percentage;
		}
		else {
			OTHERS_cn_com = (int) ((others_com_cn_C - others_com_cn_L_F) / others_com_cn_L_F * 100);
		}
		
		 if(others_ae_cn_C <= 0 && others_ae_cn_L <= 0)
		{
			OTHERS_cn_ae = zero;
		}
		
		 else if (others_ae_cn_L <= 0) {
			OTHERS_cn_ae = Percentage;
		} 
		else {
			OTHERS_cn_ae = (int) ((others_ae_cn_C - others_ae_cn_L_F) / others_ae_cn_L_F * 100);
		}
		
		 if(others_sa_cn_C <= 0 && others_sa_cn_L <= 0)
		{
			OTHERS_cn_sa = zero;
		}
		
		 else if (others_sa_cn_L <= 0) {
			OTHERS_cn_sa = Percentage;
		}
		else {
			OTHERS_cn_sa = (int) ((others_sa_cn_C - others_sa_cn_L_F) / others_sa_cn_L_F * 100);
		}
		
		 if(others_eg_cn_C <= 0 && others_eg_cn_L <= 0)
		{
			OTHERS_cn_eg = zero;
		}
		 else if (others_eg_cn_L <= 0) {
			OTHERS_cn_eg = Percentage;
		}
		else {
			OTHERS_cn_eg = (int) ((others_eg_cn_C - others_eg_cn_L_F) / others_eg_cn_L_F * 100);
		}
		
		 
		
		

		int others_com_rp_C = Integer.parseInt(com_others_rp);
		int others_com_rp_L = Integer.parseInt(com_others_rp_L1);
		int others_ae_rp_C = Integer.parseInt(ae_others_rp);
		int others_ae_rp_L = Integer.parseInt(ae_others_rp_L1);
		int others_sa_rp_C = Integer.parseInt(sa_others_rp);
		int others_sa_rp_L = Integer.parseInt(sa_others_rp_L1);
		int others_eg_rp_C = Integer.parseInt(eg_others_rp);
		int others_eg_rp_L = Integer.parseInt(eg_others_rp_L1);

		float others_com_rp_L_F=others_com_rp_L;
		float others_ae_rp_L_F=others_ae_rp_L;
		float others_sa_rp_L_F=others_sa_rp_L;
		float others_eg_rp_L_F=others_eg_rp_L;
		
		
		 if(others_com_rp_C <= 0 && others_com_rp_L <= 0)
		{
			OTHERS_rp_com = zero;
		}
		
		 else if (others_com_rp_L <= 0) {
			OTHERS_rp_com = Percentage;
		}
		
		else {
			OTHERS_rp_com = (int) ((others_com_rp_C - others_com_rp_L_F) / others_com_rp_L_F * 100);
		}
		
		 if(others_ae_rp_C <= 0 && others_ae_rp_L <= 0)
		{
			OTHERS_rp_ae = zero;
		}
		
		 else if (others_ae_rp_L <= 0) {
			OTHERS_rp_ae = Percentage;
		} 
		else {
			OTHERS_rp_ae = (int) ((others_ae_rp_C - others_ae_rp_L_F) / others_ae_rp_L_F * 100);
		}
		
		 if(others_sa_rp_C <= 0 && others_sa_rp_L <= 0)
		{
			OTHERS_rp_sa = zero;
		}
		
		 else if (others_sa_rp_L <= 0) {
			OTHERS_rp_sa = Percentage;
		} 
		else {
			OTHERS_rp_sa = (int) ((others_sa_rp_C - others_sa_rp_L_F) / others_sa_rp_L_F * 100);
		}
		
		
		 if(others_eg_rp_C <= 0 && others_eg_rp_L <= 0)
		{
			OTHERS_rp_eg = zero;
		}
		 else if (others_eg_rp_L <= 0) {
			OTHERS_rp_eg = Percentage;
		} 
		else {
			OTHERS_rp_eg = (int) ((others_eg_rp_C - others_eg_rp_L_F) / others_eg_rp_L_F * 100);
		}
		
		
		
		
		
	}

	/*
	 * public static void calculation_Report_LastWeek1(String file) throws
	 * BiffException, IOException { FileInputStream file1 = new
	 * FileInputStream(file); Workbook wb1 = Workbook.getWorkbook(file1); Sheet
	 * sheet1 = wb1.getSheet("Results"); // TS com_b2c_ts_L1 = sheet1.getCell(1,
	 * 4).getContents(); com_mobapp_ts_L1 = sheet1.getCell(2, 4).getContents();
	 * com_mobios_ts_L1 = sheet1.getCell(3, 4).getContents(); com_wego_ts_L1 =
	 * sheet1.getCell(4, 4).getContents(); com_skyscan_ts_L1 = sheet1.getCell(5,
	 * 4).getContents(); com_others_ts_L1 = sheet1.getCell(6, 4).getContents();
	 * 
	 * ae_b2c_ts_L1 = sheet1.getCell(1, 5).getContents(); ae_mobapp_ts_L1 =
	 * sheet1.getCell(2, 5).getContents(); ae_mobios_ts_L1 = sheet1.getCell(3,
	 * 5).getContents(); ae_wego_ts_L1 = sheet1.getCell(4, 5).getContents();
	 * ae_skyscan_ts_L1 = sheet1.getCell(5, 5).getContents(); ae_others_ts_L1 =
	 * sheet1.getCell(6, 5).getContents();
	 * 
	 * sa_b2c_ts_L1 = sheet1.getCell(1, 6).getContents(); sa_mobapp_ts_L1 =
	 * sheet1.getCell(2, 6).getContents(); sa_mobios_ts_L1 = sheet1.getCell(3,
	 * 6).getContents(); sa_wego_ts_L1 = sheet1.getCell(4, 6).getContents();
	 * sa_skyscan_ts_L1 = sheet1.getCell(5, 6).getContents(); sa_others_ts_L1 =
	 * sheet1.getCell(6, 6).getContents();
	 * 
	 * eg_b2c_ts_L1 = sheet1.getCell(1, 7).getContents(); eg_mobapp_ts_L1 =
	 * sheet1.getCell(2, 7).getContents(); eg_mobios_ts_L1 = sheet1.getCell(3,
	 * 7).getContents(); eg_wego_ts_L1 = sheet1.getCell(4, 7).getContents();
	 * eg_skyscan_ts_L1 = sheet1.getCell(5, 7).getContents(); eg_others_ts_L1 =
	 * sheet1.getCell(6, 7).getContents();
	 * 
	 * // CP
	 * 
	 * com_b2c_cp_L1 = sheet1.getCell(1, 11).getContents(); com_mobapp_cp_L1 =
	 * sheet1.getCell(2, 11).getContents(); com_mobios_cp_L1 = sheet1.getCell(3,
	 * 11).getContents(); com_wego_cp_L1 = sheet1.getCell(4, 11).getContents();
	 * com_skyscan_cp_L1 = sheet1.getCell(5, 11).getContents(); com_others_cp_L1
	 * = sheet1.getCell(6, 11).getContents();
	 * 
	 * ae_b2c_cp_L1 = sheet1.getCell(1, 12).getContents(); ae_mobapp_cp_L1 =
	 * sheet1.getCell(2, 12).getContents(); ae_mobios_cp_L1 = sheet1.getCell(3,
	 * 12).getContents(); ae_wego_cp_L1 = sheet1.getCell(4, 12).getContents();
	 * ae_skyscan_cp_L1 = sheet1.getCell(5, 12).getContents(); ae_others_cp_L1 =
	 * sheet1.getCell(6, 12).getContents();
	 * 
	 * sa_b2c_cp_L1 = sheet1.getCell(1, 13).getContents(); sa_mobapp_cp_L1 =
	 * sheet1.getCell(2, 13).getContents(); sa_mobios_cp_L1 = sheet1.getCell(3,
	 * 13).getContents(); sa_wego_cp_L1 = sheet1.getCell(4, 13).getContents();
	 * sa_skyscan_cp_L1 = sheet1.getCell(5, 13).getContents(); sa_others_cp_L1 =
	 * sheet1.getCell(6, 13).getContents();
	 * 
	 * eg_b2c_cp_L1 = sheet1.getCell(1, 14).getContents(); eg_mobapp_cp_L1 =
	 * sheet1.getCell(2, 14).getContents(); eg_mobios_cp_L1 = sheet1.getCell(3,
	 * 14).getContents(); eg_wego_cp_L1 = sheet1.getCell(4, 14).getContents();
	 * eg_skyscan_cp_L1 = sheet1.getCell(5, 14).getContents(); eg_others_cp_L1 =
	 * sheet1.getCell(6, 14).getContents();
	 * 
	 * // TH
	 * 
	 * com_b2c_th_L1 = sheet1.getCell(1, 18).getContents(); com_mobapp_th_L1 =
	 * sheet1.getCell(2, 18).getContents(); com_mobios_th_L1 = sheet1.getCell(3,
	 * 18).getContents(); com_wego_th_L1 = sheet1.getCell(4, 18).getContents();
	 * com_skyscan_th_L1 = sheet1.getCell(5, 18).getContents(); com_others_th_L1
	 * = sheet1.getCell(6, 18).getContents();
	 * 
	 * ae_b2c_th_L1 = sheet1.getCell(1, 19).getContents(); ae_mobapp_th_L1 =
	 * sheet1.getCell(2, 19).getContents(); ae_mobios_th_L1 = sheet1.getCell(3,
	 * 19).getContents(); ae_wego_th_L1 = sheet1.getCell(4, 19).getContents();
	 * ae_skyscan_th_L1 = sheet1.getCell(5, 19).getContents(); ae_others_th_L1 =
	 * sheet1.getCell(6, 19).getContents();
	 * 
	 * sa_b2c_th_L1 = sheet1.getCell(1, 20).getContents(); sa_mobapp_th_L1 =
	 * sheet1.getCell(2, 20).getContents(); sa_mobios_th_L1 = sheet1.getCell(3,
	 * 20).getContents(); sa_wego_th_L1 = sheet1.getCell(4, 20).getContents();
	 * sa_skyscan_th_L1 = sheet1.getCell(5, 20).getContents(); sa_others_th_L1 =
	 * sheet1.getCell(6, 20).getContents();
	 * 
	 * eg_b2c_th_L1 = sheet1.getCell(1, 21).getContents(); eg_mobapp_th_L1 =
	 * sheet1.getCell(2, 21).getContents(); eg_mobios_th_L1 = sheet1.getCell(3,
	 * 21).getContents(); eg_wego_th_L1 = sheet1.getCell(4, 21).getContents();
	 * eg_skyscan_th_L1 = sheet1.getCell(5, 21).getContents(); eg_others_th_L1 =
	 * sheet1.getCell(6, 21).getContents();
	 * 
	 * // SD com_b2c_sd_L1 = sheet1.getCell(1, 25).getContents();
	 * com_mobapp_sd_L1 = sheet1.getCell(2, 25).getContents(); com_mobios_sd_L1
	 * = sheet1.getCell(3, 25).getContents(); com_wego_sd_L1 = sheet1.getCell(4,
	 * 25).getContents(); com_skyscan_sd_L1 = sheet1.getCell(5,
	 * 25).getContents(); com_others_sd_L1 = sheet1.getCell(6,
	 * 25).getContents();
	 * 
	 * ae_b2c_sd_L1 = sheet1.getCell(1, 26).getContents(); ae_mobapp_sd_L1 =
	 * sheet1.getCell(2, 26).getContents(); ae_mobios_sd_L1 = sheet1.getCell(3,
	 * 26).getContents(); ae_wego_sd_L1 = sheet1.getCell(4, 26).getContents();
	 * ae_skyscan_sd_L1 = sheet1.getCell(5, 26).getContents(); ae_others_sd_L1 =
	 * sheet1.getCell(6, 26).getContents();
	 * 
	 * sa_b2c_sd_L1 = sheet1.getCell(1, 27).getContents(); sa_mobapp_sd_L1 =
	 * sheet1.getCell(2, 27).getContents(); sa_mobios_sd_L1 = sheet1.getCell(3,
	 * 27).getContents(); sa_wego_sd_L1 = sheet1.getCell(4, 27).getContents();
	 * sa_skyscan_sd_L1 = sheet1.getCell(5, 27).getContents(); sa_others_sd_L1 =
	 * sheet1.getCell(6, 27).getContents();
	 * 
	 * eg_b2c_sd_L1 = sheet1.getCell(1, 28).getContents(); eg_mobapp_sd_L1 =
	 * sheet1.getCell(2, 28).getContents(); eg_mobios_sd_L1 = sheet1.getCell(3,
	 * 28).getContents(); eg_wego_sd_L1 = sheet1.getCell(4, 28).getContents();
	 * eg_skyscan_sd_L1 = sheet1.getCell(5, 28).getContents(); eg_others_sd_L1 =
	 * sheet1.getCell(6, 28).getContents();
	 * 
	 * // CN
	 * 
	 * com_b2c_cn_L1 = sheet1.getCell(1, 32).getContents(); com_mobapp_cn_L1 =
	 * sheet1.getCell(2, 32).getContents(); com_mobios_cn_L1 = sheet1.getCell(3,
	 * 32).getContents(); com_wego_cn_L1 = sheet1.getCell(4, 32).getContents();
	 * com_skyscan_cn_L1 = sheet1.getCell(5, 32).getContents(); com_others_cn_L1
	 * = sheet1.getCell(6, 32).getContents();
	 * 
	 * ae_b2c_cn_L1 = sheet1.getCell(1, 33).getContents(); ae_mobapp_cn_L1 =
	 * sheet1.getCell(2, 33).getContents(); ae_mobios_cn_L1 = sheet1.getCell(3,
	 * 33).getContents(); ae_wego_cn_L1 = sheet1.getCell(4, 33).getContents();
	 * ae_skyscan_cn_L1 = sheet1.getCell(5, 33).getContents(); ae_others_cn_L1 =
	 * sheet1.getCell(6, 33).getContents();
	 * 
	 * sa_b2c_cn_L1 = sheet1.getCell(1, 34).getContents(); sa_mobapp_cn_L1 =
	 * sheet1.getCell(2, 34).getContents(); sa_mobios_cn_L1 = sheet1.getCell(3,
	 * 34).getContents(); sa_wego_cn_L1 = sheet1.getCell(4, 34).getContents();
	 * sa_skyscan_cn_L1 = sheet1.getCell(5, 34).getContents(); sa_others_cn_L1 =
	 * sheet1.getCell(6, 34).getContents();
	 * 
	 * eg_b2c_cn_L1 = sheet1.getCell(1, 35).getContents(); eg_mobapp_cn_L1 =
	 * sheet1.getCell(2, 35).getContents(); eg_mobios_cn_L1 = sheet1.getCell(3,
	 * 35).getContents(); eg_wego_cn_L1 = sheet1.getCell(4, 35).getContents();
	 * eg_skyscan_cn_L1 = sheet1.getCell(5, 35).getContents(); eg_others_cn_L1 =
	 * sheet1.getCell(6, 35).getContents();
	 * 
	 * // RP
	 * 
	 * com_b2c_rp_L1 = sheet1.getCell(1, 39).getContents(); com_mobapp_rp_L1 =
	 * sheet1.getCell(2, 39).getContents(); com_mobios_rp_L1 = sheet1.getCell(3,
	 * 39).getContents(); com_wego_rp_L1 = sheet1.getCell(4, 39).getContents();
	 * com_skyscan_rp_L1 = sheet1.getCell(5, 39).getContents(); com_others_rp_L1
	 * = sheet1.getCell(6, 39).getContents();
	 * 
	 * ae_b2c_rp_L1 = sheet1.getCell(1, 40).getContents(); ae_mobapp_rp_L1 =
	 * sheet1.getCell(2, 40).getContents(); ae_mobios_rp_L1 = sheet1.getCell(3,
	 * 40).getContents(); ae_wego_rp_L1 = sheet1.getCell(4, 40).getContents();
	 * ae_skyscan_rp_L1 = sheet1.getCell(5, 40).getContents(); ae_others_rp_L1 =
	 * sheet1.getCell(6, 40).getContents();
	 * 
	 * sa_b2c_rp_L1 = sheet1.getCell(1, 41).getContents(); sa_mobapp_rp_L1 =
	 * sheet1.getCell(2, 41).getContents(); sa_mobios_rp_L1 = sheet1.getCell(3,
	 * 41).getContents(); sa_wego_rp_L1 = sheet1.getCell(4, 41).getContents();
	 * sa_skyscan_rp_L1 = sheet1.getCell(5, 41).getContents(); sa_others_rp_L1 =
	 * sheet1.getCell(6, 41).getContents();
	 * 
	 * eg_b2c_rp_L1 = sheet1.getCell(1, 42).getContents(); eg_mobapp_rp_L1 =
	 * sheet1.getCell(2, 42).getContents(); eg_mobios_rp_L1 = sheet1.getCell(3,
	 * 42).getContents(); eg_wego_rp_L1 = sheet1.getCell(4, 42).getContents();
	 * eg_skyscan_rp_L1 = sheet1.getCell(5, 42).getContents(); eg_others_rp_L1 =
	 * sheet1.getCell(6, 42).getContents(); }
	 * 
	 * public static void calculation_Report_LastWeek2(String file) throws
	 * BiffException, IOException { FileInputStream file1 = new
	 * FileInputStream(file); Workbook wb1 = Workbook.getWorkbook(file1); Sheet
	 * sheet1 = wb1.getSheet("Results"); // TS com_b2c_ts_L2 = sheet1.getCell(1,
	 * 4).getContents(); com_mobapp_ts_L2 = sheet1.getCell(2, 4).getContents();
	 * com_mobios_ts_L2 = sheet1.getCell(3, 4).getContents(); com_wego_ts_L2 =
	 * sheet1.getCell(4, 4).getContents(); com_skyscan_ts_L2 = sheet1.getCell(5,
	 * 4).getContents(); com_others_ts_L2 = sheet1.getCell(6, 4).getContents();
	 * 
	 * ae_b2c_ts_L2 = sheet1.getCell(1, 5).getContents(); ae_mobapp_ts_L2 =
	 * sheet1.getCell(2, 5).getContents(); ae_mobios_ts_L2 = sheet1.getCell(3,
	 * 5).getContents(); ae_wego_ts_L2 = sheet1.getCell(4, 5).getContents();
	 * ae_skyscan_ts_L2 = sheet1.getCell(5, 5).getContents(); ae_others_ts_L2 =
	 * sheet1.getCell(6, 5).getContents();
	 * 
	 * sa_b2c_ts_L2 = sheet1.getCell(1, 6).getContents(); sa_mobapp_ts_L2 =
	 * sheet1.getCell(2, 6).getContents(); sa_mobios_ts_L2 = sheet1.getCell(3,
	 * 6).getContents(); sa_wego_ts_L2 = sheet1.getCell(4, 6).getContents();
	 * sa_skyscan_ts_L2 = sheet1.getCell(5, 6).getContents(); sa_others_ts_L2 =
	 * sheet1.getCell(6, 6).getContents();
	 * 
	 * eg_b2c_ts_L2 = sheet1.getCell(1, 7).getContents(); eg_mobapp_ts_L2 =
	 * sheet1.getCell(2, 7).getContents(); eg_mobios_ts_L2 = sheet1.getCell(3,
	 * 7).getContents(); eg_wego_ts_L2 = sheet1.getCell(4, 7).getContents();
	 * eg_skyscan_ts_L2 = sheet1.getCell(5, 7).getContents(); eg_others_ts_L2 =
	 * sheet1.getCell(6, 7).getContents();
	 * 
	 * // CP
	 * 
	 * com_b2c_cp_L2 = sheet1.getCell(1, 11).getContents(); com_mobapp_cp_L2 =
	 * sheet1.getCell(2, 11).getContents(); com_mobios_cp_L2 = sheet1.getCell(3,
	 * 11).getContents(); com_wego_cp_L2 = sheet1.getCell(4, 11).getContents();
	 * com_skyscan_cp_L2 = sheet1.getCell(5, 11).getContents(); com_others_cp_L2
	 * = sheet1.getCell(6, 11).getContents();
	 * 
	 * ae_b2c_cp_L2 = sheet1.getCell(1, 12).getContents(); ae_mobapp_cp_L2 =
	 * sheet1.getCell(2, 12).getContents(); ae_mobios_cp_L2 = sheet1.getCell(3,
	 * 12).getContents(); ae_wego_cp_L2 = sheet1.getCell(4, 12).getContents();
	 * ae_skyscan_cp_L2 = sheet1.getCell(5, 12).getContents(); ae_others_cp_L2 =
	 * sheet1.getCell(6, 12).getContents();
	 * 
	 * sa_b2c_cp_L2 = sheet1.getCell(1, 13).getContents(); sa_mobapp_cp_L2 =
	 * sheet1.getCell(2, 13).getContents(); sa_mobios_cp_L2 = sheet1.getCell(3,
	 * 13).getContents(); sa_wego_cp_L2 = sheet1.getCell(4, 13).getContents();
	 * sa_skyscan_cp_L2 = sheet1.getCell(5, 13).getContents(); sa_others_cp_L2 =
	 * sheet1.getCell(6, 13).getContents();
	 * 
	 * eg_b2c_cp_L2 = sheet1.getCell(1, 14).getContents(); eg_mobapp_cp_L2 =
	 * sheet1.getCell(2, 14).getContents(); eg_mobios_cp_L2 = sheet1.getCell(3,
	 * 14).getContents(); eg_wego_cp_L2 = sheet1.getCell(4, 14).getContents();
	 * eg_skyscan_cp_L2 = sheet1.getCell(5, 14).getContents(); eg_others_cp_L2 =
	 * sheet1.getCell(6, 14).getContents();
	 * 
	 * // TH
	 * 
	 * com_b2c_th_L2 = sheet1.getCell(1, 18).getContents(); com_mobapp_th_L2 =
	 * sheet1.getCell(2, 18).getContents(); com_mobios_th_L2 = sheet1.getCell(3,
	 * 18).getContents(); com_wego_th_L2 = sheet1.getCell(4, 18).getContents();
	 * com_skyscan_th_L2 = sheet1.getCell(5, 18).getContents(); com_others_th_L2
	 * = sheet1.getCell(6, 18).getContents();
	 * 
	 * ae_b2c_th_L2 = sheet1.getCell(1, 19).getContents(); ae_mobapp_th_L2 =
	 * sheet1.getCell(2, 19).getContents(); ae_mobios_th_L2 = sheet1.getCell(3,
	 * 19).getContents(); ae_wego_th_L2 = sheet1.getCell(4, 19).getContents();
	 * ae_skyscan_th_L2 = sheet1.getCell(5, 19).getContents(); ae_others_th_L2 =
	 * sheet1.getCell(6, 19).getContents();
	 * 
	 * sa_b2c_th_L2 = sheet1.getCell(1, 20).getContents(); sa_mobapp_th_L2 =
	 * sheet1.getCell(2, 20).getContents(); sa_mobios_th_L2 = sheet1.getCell(3,
	 * 20).getContents(); sa_wego_th_L2 = sheet1.getCell(4, 20).getContents();
	 * sa_skyscan_th_L2 = sheet1.getCell(5, 20).getContents(); sa_others_th_L2 =
	 * sheet1.getCell(6, 20).getContents();
	 * 
	 * eg_b2c_th_L2 = sheet1.getCell(1, 21).getContents(); eg_mobapp_th_L2 =
	 * sheet1.getCell(2, 21).getContents(); eg_mobios_th_L2 = sheet1.getCell(3,
	 * 21).getContents(); eg_wego_th_L2 = sheet1.getCell(4, 21).getContents();
	 * eg_skyscan_th_L2 = sheet1.getCell(5, 21).getContents(); eg_others_th_L2 =
	 * sheet1.getCell(6, 21).getContents();
	 * 
	 * // SD com_b2c_sd_L2 = sheet1.getCell(1, 25).getContents();
	 * com_mobapp_sd_L2 = sheet1.getCell(2, 25).getContents(); com_mobios_sd_L2
	 * = sheet1.getCell(3, 25).getContents(); com_wego_sd_L2 = sheet1.getCell(4,
	 * 25).getContents(); com_skyscan_sd_L2 = sheet1.getCell(5,
	 * 25).getContents(); com_others_sd_L2 = sheet1.getCell(6,
	 * 25).getContents();
	 * 
	 * ae_b2c_sd_L2 = sheet1.getCell(1, 26).getContents(); ae_mobapp_sd_L2 =
	 * sheet1.getCell(2, 26).getContents(); ae_mobios_sd_L2 = sheet1.getCell(3,
	 * 26).getContents(); ae_wego_sd_L2 = sheet1.getCell(4, 26).getContents();
	 * ae_skyscan_sd_L2 = sheet1.getCell(5, 26).getContents(); ae_others_sd_L2 =
	 * sheet1.getCell(6, 26).getContents();
	 * 
	 * sa_b2c_sd_L2 = sheet1.getCell(1, 27).getContents(); sa_mobapp_sd_L2 =
	 * sheet1.getCell(2, 27).getContents(); sa_mobios_sd_L2 = sheet1.getCell(3,
	 * 27).getContents(); sa_wego_sd_L2 = sheet1.getCell(4, 27).getContents();
	 * sa_skyscan_sd_L2 = sheet1.getCell(5, 27).getContents(); sa_others_sd_L2 =
	 * sheet1.getCell(6, 27).getContents();
	 * 
	 * eg_b2c_sd_L2 = sheet1.getCell(1, 28).getContents(); eg_mobapp_sd_L2 =
	 * sheet1.getCell(2, 28).getContents(); eg_mobios_sd_L2 = sheet1.getCell(3,
	 * 28).getContents(); eg_wego_sd_L2 = sheet1.getCell(4, 28).getContents();
	 * eg_skyscan_sd_L2 = sheet1.getCell(5, 28).getContents(); eg_others_sd_L2 =
	 * sheet1.getCell(6, 28).getContents();
	 * 
	 * // CN
	 * 
	 * com_b2c_cn_L2 = sheet1.getCell(1, 32).getContents(); com_mobapp_cn_L2 =
	 * sheet1.getCell(2, 32).getContents(); com_mobios_cn_L2 = sheet1.getCell(3,
	 * 32).getContents(); com_wego_cn_L2 = sheet1.getCell(4, 32).getContents();
	 * com_skyscan_cn_L2 = sheet1.getCell(5, 32).getContents(); com_others_cn_L2
	 * = sheet1.getCell(6, 32).getContents();
	 * 
	 * ae_b2c_cn_L2 = sheet1.getCell(1, 33).getContents(); ae_mobapp_cn_L2 =
	 * sheet1.getCell(2, 33).getContents(); ae_mobios_cn_L2 = sheet1.getCell(3,
	 * 33).getContents(); ae_wego_cn_L2 = sheet1.getCell(4, 33).getContents();
	 * ae_skyscan_cn_L2 = sheet1.getCell(5, 33).getContents(); ae_others_cn_L2 =
	 * sheet1.getCell(6, 33).getContents();
	 * 
	 * sa_b2c_cn_L2 = sheet1.getCell(1, 34).getContents(); sa_mobapp_cn_L2 =
	 * sheet1.getCell(2, 34).getContents(); sa_mobios_cn_L2 = sheet1.getCell(3,
	 * 34).getContents(); sa_wego_cn_L2 = sheet1.getCell(4, 34).getContents();
	 * sa_skyscan_cn_L2 = sheet1.getCell(5, 34).getContents(); sa_others_cn_L2 =
	 * sheet1.getCell(6, 34).getContents();
	 * 
	 * eg_b2c_cn_L2 = sheet1.getCell(1, 35).getContents(); eg_mobapp_cn_L2 =
	 * sheet1.getCell(2, 35).getContents(); eg_mobios_cn_L2 = sheet1.getCell(3,
	 * 35).getContents(); eg_wego_cn_L2 = sheet1.getCell(4, 35).getContents();
	 * eg_skyscan_cn_L2 = sheet1.getCell(5, 35).getContents(); eg_others_cn_L2 =
	 * sheet1.getCell(6, 35).getContents();
	 * 
	 * // RP
	 * 
	 * com_b2c_rp_L2 = sheet1.getCell(1, 39).getContents(); com_mobapp_rp_L2 =
	 * sheet1.getCell(2, 39).getContents(); com_mobios_rp_L2 = sheet1.getCell(3,
	 * 39).getContents(); com_wego_rp_L2 = sheet1.getCell(4, 39).getContents();
	 * com_skyscan_rp_L2 = sheet1.getCell(5, 39).getContents(); com_others_rp_L2
	 * = sheet1.getCell(6, 39).getContents();
	 * 
	 * ae_b2c_rp_L2 = sheet1.getCell(1, 40).getContents(); ae_mobapp_rp_L2 =
	 * sheet1.getCell(2, 40).getContents(); ae_mobios_rp_L2 = sheet1.getCell(3,
	 * 40).getContents(); ae_wego_rp_L2 = sheet1.getCell(4, 40).getContents();
	 * ae_skyscan_rp_L2 = sheet1.getCell(5, 40).getContents(); ae_others_rp_L2 =
	 * sheet1.getCell(6, 40).getContents();
	 * 
	 * sa_b2c_rp_L2 = sheet1.getCell(1, 41).getContents(); sa_mobapp_rp_L2 =
	 * sheet1.getCell(2, 41).getContents(); sa_mobios_rp_L2 = sheet1.getCell(3,
	 * 41).getContents(); sa_wego_rp_L2 = sheet1.getCell(4, 41).getContents();
	 * sa_skyscan_rp_L2 = sheet1.getCell(5, 41).getContents(); sa_others_rp_L2 =
	 * sheet1.getCell(6, 41).getContents();
	 * 
	 * eg_b2c_rp_L2 = sheet1.getCell(1, 42).getContents(); eg_mobapp_rp_L2 =
	 * sheet1.getCell(2, 42).getContents(); eg_mobios_rp_L2 = sheet1.getCell(3,
	 * 42).getContents(); eg_wego_rp_L2 = sheet1.getCell(4, 42).getContents();
	 * eg_skyscan_rp_L2 = sheet1.getCell(5, 42).getContents(); eg_others_rp_L2 =
	 * sheet1.getCell(6, 42).getContents(); }
	 */

	public static void wow_Growth_Cal(String fileP, String fileL1) throws BiffException, IOException {

		FileInputStream file1 = new FileInputStream(fileP);
		Workbook wb1 = Workbook.getWorkbook(file1);
		Sheet sheet1 = wb1.getSheet("Results");
		// WEGO
		String com_wego_ts = sheet1.getCell(4, 4).getContents();
		String ae_wego_ts = sheet1.getCell(4, 5).getContents();
		String sa_wego_ts = sheet1.getCell(4, 6).getContents();
		String eg_wego_ts = sheet1.getCell(4, 7).getContents();
		// SKY
		String com_skyscan_ts = sheet1.getCell(5, 4).getContents();
		String ae_skyscan_ts = sheet1.getCell(5, 5).getContents();
		String sa_skyscan_ts = sheet1.getCell(5, 6).getContents();
		String eg_skyscan_ts = sheet1.getCell(5, 7).getContents();

		// B2c
		String com_b2c_ts = sheet1.getCell(1, 4).getContents();
		String ae_b2c_ts = sheet1.getCell(1, 5).getContents();
		String sa_b2c_ts = sheet1.getCell(1, 6).getContents();
		String eg_b2c_ts = sheet1.getCell(1, 7).getContents();

		// MOBAPP
		String com_mobapp_ts = sheet1.getCell(2, 4).getContents();
		String ae_mobapp_ts = sheet1.getCell(2, 5).getContents();
		String sa_mobapp_ts = sheet1.getCell(2, 6).getContents();
		String eg_mobapp_ts = sheet1.getCell(2, 7).getContents();
		// MOBIOS
		String com_mobios_ts = sheet1.getCell(3, 4).getContents();
		String ae_mobios_ts = sheet1.getCell(3, 5).getContents();
		String sa_mobios_ts = sheet1.getCell(3, 6).getContents();
		String eg_mobios_ts = sheet1.getCell(3, 7).getContents();

		// OTHERS
		String com_others_ts = sheet1.getCell(6, 4).getContents();
		String ae_others_ts = sheet1.getCell(6, 5).getContents();
		String sa_others_ts = sheet1.getCell(6, 6).getContents();
		String eg_others_ts = sheet1.getCell(6, 7).getContents();

		FileInputStream file_l1 = new FileInputStream(fileL1);
		Workbook wb_l1 = Workbook.getWorkbook(file_l1);
		Sheet sheet_l1 = wb_l1.getSheet("Results");
		// WEGO_L1
		String com_wego_ts_l1 = sheet_l1.getCell(4, 4).getContents();
		String ae_wego_ts_l1 = sheet_l1.getCell(4, 5).getContents();
		String sa_wego_ts_l1 = sheet_l1.getCell(4, 6).getContents();
		String eg_wego_ts_l1 = sheet_l1.getCell(4, 7).getContents();
		// SKY_L1
		String com_skyscan_ts_l1 = sheet_l1.getCell(5, 4).getContents();
		String ae_skyscan_ts_l1 = sheet_l1.getCell(5, 5).getContents();
		String sa_skyscan_ts_l1 = sheet_l1.getCell(5, 6).getContents();
		String eg_skyscan_ts_l1 = sheet_l1.getCell(5, 7).getContents();
		// B2C_L1

		String com_b2c_ts_l1 = sheet_l1.getCell(1, 4).getContents();
		String ae_b2c_ts_l1 = sheet_l1.getCell(1, 5).getContents();
		String sa_b2c_ts_l1 = sheet_l1.getCell(1, 6).getContents();
		String eg_b2c_ts_l1 = sheet_l1.getCell(1, 7).getContents();
		// MOBAPP_L1
		String com_mobapp_ts_l1 = sheet_l1.getCell(2, 4).getContents();
		String ae_mobapp_ts_l1 = sheet_l1.getCell(2, 5).getContents();
		String sa_mobapp_ts_l1 = sheet_l1.getCell(2, 6).getContents();
		String eg_mobapp_ts_l1 = sheet_l1.getCell(2, 7).getContents();
		// MOBIOS_L1
		String com_mobios_ts_l1 = sheet_l1.getCell(3, 4).getContents();
		String ae_mobios_ts_l1 = sheet_l1.getCell(3, 5).getContents();
		String sa_mobios_ts_l1 = sheet_l1.getCell(3, 6).getContents();
		String eg_mobios_ts_l1 = sheet_l1.getCell(3, 7).getContents();

		// OTHERS
		String com_others_ts_l1 = sheet_l1.getCell(6, 4).getContents();
		String ae_others_ts_l1 = sheet_l1.getCell(6, 5).getContents();
		String sa_others_ts_l1 = sheet_l1.getCell(6, 6).getContents();
		String eg_others_ts_l1 = sheet_l1.getCell(6, 7).getContents();

		// meta
		int wego_total = Integer.parseInt(com_wego_ts) + Integer.parseInt(ae_wego_ts) + Integer.parseInt(sa_wego_ts)
				+ Integer.parseInt(eg_wego_ts);
		int skyscan_total = Integer.parseInt(com_skyscan_ts) + Integer.parseInt(ae_skyscan_ts)
				+ Integer.parseInt(sa_skyscan_ts) + Integer.parseInt(eg_skyscan_ts);

		// last week
		int wego_total_l1 = Integer.parseInt(com_wego_ts_l1) + Integer.parseInt(ae_wego_ts_l1)
				+ Integer.parseInt(sa_wego_ts_l1) + Integer.parseInt(eg_wego_ts_l1);
		int skyscan_total_l1 = Integer.parseInt(com_skyscan_ts_l1) + Integer.parseInt(ae_skyscan_ts_l1)
				+ Integer.parseInt(sa_skyscan_ts_l1) + Integer.parseInt(eg_skyscan_ts_l1);
       
		currentDay_meta_bothtotal = wego_total + skyscan_total;
		int lastweek_meta_bothtotal = wego_total_l1 + skyscan_total_l1;
		float lastweek_meta_bothtotal_F=lastweek_meta_bothtotal;
		if(lastweek_meta_bothtotal<=0)
		{
			Wow_Meta=100;
		}
		else{
		 Wow_Meta = (int) ((currentDay_meta_bothtotal - lastweek_meta_bothtotal_F )/ lastweek_meta_bothtotal_F * 100);
		}
		System.out.println("WOW GROWTH META:" + Wow_Meta);
		// -----------------------------B2C-------------------------------

		// Current
		Currentday_B2c_total = Integer.parseInt(com_b2c_ts) + Integer.parseInt(ae_b2c_ts) + Integer.parseInt(sa_b2c_ts)
				+ Integer.parseInt(eg_b2c_ts);
		// last week
		int b2c_total_l1 = Integer.parseInt(com_b2c_ts_l1) + Integer.parseInt(ae_b2c_ts_l1)
				+ Integer.parseInt(sa_b2c_ts_l1) + Integer.parseInt(eg_b2c_ts_l1);
		float b2c_total_l1_F=b2c_total_l1;
		System.out.println("current:"+Currentday_B2c_total);
		System.out.println("current:"+b2c_total_l1);
		
		if(b2c_total_l1<=0)
		{
			Wow_B2C=100;
		}
		else{
		Wow_B2C = (int) ((Currentday_B2c_total - b2c_total_l1_F) / b2c_total_l1_F * 100);
		}
		System.out.println("WOW GROWTH B2C:" + Wow_B2C);
		// --------------------------------ANDROID AND
		// IOS-----------------------
		int mobapp_total = Integer.parseInt(com_mobapp_ts) + Integer.parseInt(ae_mobapp_ts)
				+ Integer.parseInt(sa_mobapp_ts) + Integer.parseInt(eg_mobapp_ts);
		int mobios_total = Integer.parseInt(com_mobios_ts) + Integer.parseInt(ae_mobios_ts)
				+ Integer.parseInt(sa_mobios_ts) + Integer.parseInt(eg_mobios_ts);

		int mobapp_total_l1 = Integer.parseInt(com_mobapp_ts_l1) + Integer.parseInt(ae_mobapp_ts_l1)
				+ Integer.parseInt(sa_mobapp_ts_l1) + Integer.parseInt(eg_mobapp_ts_l1);
		int mobios_total_l1 = Integer.parseInt(com_mobios_ts_l1) + Integer.parseInt(ae_mobios_ts_l1)
				+ Integer.parseInt(sa_mobios_ts_l1) + Integer.parseInt(eg_mobios_ts_l1);

		Currentday_mobapp_both_total = mobapp_total + mobios_total;
		int lastweek_mobapp_both_total = mobapp_total_l1 + mobios_total_l1;
		float lastweek_mobapp_both_total_F=lastweek_mobapp_both_total;
		
		if(lastweek_mobapp_both_total<=0)
		{
			Wow_MobApp=100;
		}
		else{
		Wow_MobApp = (int) ((Currentday_mobapp_both_total - lastweek_mobapp_both_total_F) / lastweek_mobapp_both_total_F * 100);
		}
		System.out.println("WOW GROWTH MOBAPP:" + Wow_MobApp);

		// ---------------------------------------OTHERS--------------------------------
		// Current
		Currentday_others_total = Integer.parseInt(com_others_ts) + Integer.parseInt(ae_others_ts)
				+ Integer.parseInt(sa_others_ts) + Integer.parseInt(eg_others_ts);
		// last week
		int others_total_lastweek = Integer.parseInt(com_others_ts_l1) + Integer.parseInt(ae_others_ts_l1)
				+ Integer.parseInt(sa_others_ts_l1) + Integer.parseInt(eg_others_ts_l1);
		float others_total_lastweek_F=others_total_lastweek;
		if(others_total_lastweek<=0)
		{
			Wow_Others=100;
		}
		else{
		Wow_Others = (int) ((Currentday_others_total - others_total_lastweek_F) / others_total_lastweek_F * 100);
		}
		System.out.println("WOW GROWTH OTHERS:" + Wow_Others);

		// Total

		Currentday_ALL_Total = currentDay_meta_bothtotal + Currentday_B2c_total + Currentday_mobapp_both_total
				+ Currentday_others_total;
		int ALL_Total_Lastweek = lastweek_meta_bothtotal + b2c_total_l1 + lastweek_mobapp_both_total
				+ others_total_lastweek;

		float ALL_Total_Lastweek_F=ALL_Total_Lastweek;
		if(ALL_Total_Lastweek<=0)
		{
			Wow_ALL_Total=100;
		}
		else{
		Wow_ALL_Total = (int) ((Currentday_ALL_Total - ALL_Total_Lastweek_F) / ALL_Total_Lastweek_F * 100);
		}
		System.out.println("WOW GROWTH ALL TOTAL:" + Wow_ALL_Total);

	}

	public static void wow2_Growth_Cal(String fileP, String fileL2) throws BiffException, IOException {

		FileInputStream file1 = new FileInputStream(fileP);
		Workbook wb1 = Workbook.getWorkbook(file1);
		Sheet sheet1 = wb1.getSheet("Results");
		// WEGO
		String com_wego_ts = sheet1.getCell(4, 4).getContents();
		String ae_wego_ts = sheet1.getCell(4, 5).getContents();
		String sa_wego_ts = sheet1.getCell(4, 6).getContents();
		String eg_wego_ts = sheet1.getCell(4, 7).getContents();
		// SKY
		String com_skyscan_ts = sheet1.getCell(5, 4).getContents();
		String ae_skyscan_ts = sheet1.getCell(5, 5).getContents();
		String sa_skyscan_ts = sheet1.getCell(5, 6).getContents();
		String eg_skyscan_ts = sheet1.getCell(5, 7).getContents();

		// B2c
		String com_b2c_ts = sheet1.getCell(1, 4).getContents();
		String ae_b2c_ts = sheet1.getCell(1, 5).getContents();
		String sa_b2c_ts = sheet1.getCell(1, 6).getContents();
		String eg_b2c_ts = sheet1.getCell(1, 7).getContents();

		// MOBAPP
		String com_mobapp_ts = sheet1.getCell(2, 4).getContents();
		String ae_mobapp_ts = sheet1.getCell(2, 5).getContents();
		String sa_mobapp_ts = sheet1.getCell(2, 6).getContents();
		String eg_mobapp_ts = sheet1.getCell(2, 7).getContents();
		// MOBIOS
		String com_mobios_ts = sheet1.getCell(3, 4).getContents();
		String ae_mobios_ts = sheet1.getCell(3, 5).getContents();
		String sa_mobios_ts = sheet1.getCell(3, 6).getContents();
		String eg_mobios_ts = sheet1.getCell(3, 7).getContents();

		// OTHERS
		String com_others_ts = sheet1.getCell(6, 4).getContents();
		String ae_others_ts = sheet1.getCell(6, 5).getContents();
		String sa_others_ts = sheet1.getCell(6, 6).getContents();
		String eg_others_ts = sheet1.getCell(6, 7).getContents();

		FileInputStream file_l2 = new FileInputStream(fileL2);
		Workbook wb_l2 = Workbook.getWorkbook(file_l2);
		Sheet sheet_l2 = wb_l2.getSheet("Results");
		// WEGO_L1
		String com_wego_ts_l2 = sheet_l2.getCell(4, 4).getContents();
		String ae_wego_ts_l2 = sheet_l2.getCell(4, 5).getContents();
		String sa_wego_ts_l2 = sheet_l2.getCell(4, 6).getContents();
		String eg_wego_ts_l2 = sheet_l2.getCell(4, 7).getContents();
		// SKY_L1
		String com_skyscan_ts_l2 = sheet_l2.getCell(5, 4).getContents();
		String ae_skyscan_ts_l2 = sheet_l2.getCell(5, 5).getContents();
		String sa_skyscan_ts_l2 = sheet_l2.getCell(5, 6).getContents();
		String eg_skyscan_ts_l2 = sheet_l2.getCell(5, 7).getContents();
		// B2C_L1

		String com_b2c_ts_l2 = sheet_l2.getCell(1, 4).getContents();
		String ae_b2c_ts_l2 = sheet_l2.getCell(1, 5).getContents();
		String sa_b2c_ts_l2 = sheet_l2.getCell(1, 6).getContents();
		String eg_b2c_ts_l2 = sheet_l2.getCell(1, 7).getContents();
		// MOBAPP_L1
		String com_mobapp_ts_l2 = sheet_l2.getCell(2, 4).getContents();
		String ae_mobapp_ts_l2 = sheet_l2.getCell(2, 5).getContents();
		String sa_mobapp_ts_l2 = sheet_l2.getCell(2, 6).getContents();
		String eg_mobapp_ts_l2 = sheet_l2.getCell(2, 7).getContents();
		// MOBIOS_L1
		String com_mobios_ts_l2 = sheet_l2.getCell(3, 4).getContents();
		String ae_mobios_ts_l2 = sheet_l2.getCell(3, 5).getContents();
		String sa_mobios_ts_l2 = sheet_l2.getCell(3, 6).getContents();
		String eg_mobios_ts_l2 = sheet_l2.getCell(3, 7).getContents();

		// OTHERS
		String com_others_ts_l2 = sheet_l2.getCell(6, 4).getContents();
		String ae_others_ts_l2 = sheet_l2.getCell(6, 5).getContents();
		String sa_others_ts_l2 = sheet_l2.getCell(6, 6).getContents();
		String eg_others_ts_l2 = sheet_l2.getCell(6, 7).getContents();

		// meta
		int wego_total = Integer.parseInt(com_wego_ts) + Integer.parseInt(ae_wego_ts) + Integer.parseInt(sa_wego_ts)
				+ Integer.parseInt(eg_wego_ts);
		int skyscan_total = Integer.parseInt(com_skyscan_ts) + Integer.parseInt(ae_skyscan_ts)
				+ Integer.parseInt(sa_skyscan_ts) + Integer.parseInt(eg_skyscan_ts);

		// last week2
		int wego_total_l2 = Integer.parseInt(com_wego_ts_l2) + Integer.parseInt(ae_wego_ts_l2)
				+ Integer.parseInt(sa_wego_ts_l2) + Integer.parseInt(eg_wego_ts_l2);
		int skyscan_total_l2 = Integer.parseInt(com_skyscan_ts_l2) + Integer.parseInt(ae_skyscan_ts_l2)
				+ Integer.parseInt(sa_skyscan_ts_l2) + Integer.parseInt(eg_skyscan_ts_l2);

		int CureentDay_Meta1 = wego_total + skyscan_total;
		int lastweek_meta_bothtotal = wego_total_l2 + skyscan_total_l2;
		
		float lastweek_meta_bothtotal_F=lastweek_meta_bothtotal;
		
		if(lastweek_meta_bothtotal<=0)
		{
			Wow2_Meta=100;
		}
		else{
		 Wow2_Meta = (int) ((CureentDay_Meta1 - lastweek_meta_bothtotal_F) / lastweek_meta_bothtotal_F * 100);
		}
		 System.out.println("WOW2 GROWTH META:" + Wow2_Meta);
		// -----------------------------B2C-------------------------------

		// Current
		int Currentday_B2c_total = Integer.parseInt(com_b2c_ts) + Integer.parseInt(ae_b2c_ts)
				+ Integer.parseInt(sa_b2c_ts) + Integer.parseInt(eg_b2c_ts);
		// last week
		int b2c_total_l2 = Integer.parseInt(com_b2c_ts_l2) + Integer.parseInt(ae_b2c_ts_l2)
				+ Integer.parseInt(sa_b2c_ts_l2) + Integer.parseInt(eg_b2c_ts_l2);
		float b2c_total_l2_F=b2c_total_l2;

		if(b2c_total_l2<=0)
		{
			Wow2_B2C=100;
		}
		else{
		 Wow2_B2C = (int) ((Currentday_B2c_total - b2c_total_l2_F) / b2c_total_l2_F * 100);
		}
		System.out.println("WOW2 GROWTH B2C:" + Wow2_B2C);
		// --------------------------------ANDROID AND IOS-----------------------
		int mobapp_total = Integer.parseInt(com_mobapp_ts) + Integer.parseInt(ae_mobapp_ts)
				+ Integer.parseInt(sa_mobapp_ts) + Integer.parseInt(eg_mobapp_ts);
		int mobios_total = Integer.parseInt(com_mobios_ts) + Integer.parseInt(ae_mobios_ts)
				+ Integer.parseInt(sa_mobios_ts) + Integer.parseInt(eg_mobios_ts);

		int mobapp_total_l2 = Integer.parseInt(com_mobapp_ts_l2) + Integer.parseInt(ae_mobapp_ts_l2)
				+ Integer.parseInt(sa_mobapp_ts_l2) + Integer.parseInt(eg_mobapp_ts_l2);
		int mobios_total_l2 = Integer.parseInt(com_mobios_ts_l2) + Integer.parseInt(ae_mobios_ts_l2)
				+ Integer.parseInt(sa_mobios_ts_l2) + Integer.parseInt(eg_mobios_ts_l2);

		int Current_mobapp_both_total = mobapp_total + mobios_total;
		int lastweek_mobapp_both_total = mobapp_total_l2 + mobios_total_l2;
		
		float lastweek_mobapp_both_total_F=lastweek_mobapp_both_total;
		if(lastweek_mobapp_both_total<=0)
		{
			Wow2_MobApp=100;
		}
		else{
		 Wow2_MobApp = (int) ((Current_mobapp_both_total - lastweek_mobapp_both_total_F) / lastweek_mobapp_both_total_F * 100);
		}
		 System.out.println("WOW2 GROWTH MOBAPP:" + Wow2_MobApp);

		// ---------------------------------------OTHERS--------------------------------
		// Current
		int others_total = Integer.parseInt(com_others_ts) + Integer.parseInt(ae_others_ts)
				+ Integer.parseInt(sa_others_ts) + Integer.parseInt(eg_others_ts);
		// last week
		int others_total_lastweek = Integer.parseInt(com_others_ts_l2) + Integer.parseInt(ae_others_ts_l2)
				+ Integer.parseInt(sa_others_ts_l2) + Integer.parseInt(eg_others_ts_l2);
		
		float others_total_lastweek_F=others_total_lastweek;
		if(others_total_lastweek<=0)
		{
			Wow2_Others=100;
		}
		else{
		 Wow2_Others = (int) ((others_total - others_total_lastweek_F) / others_total_lastweek_F * 100);
		}
		 System.out.println("WOW2 GROWTH OTHERS:" + Wow2_Others);

		// Total

		int ALL_Total = CureentDay_Meta1 + Currentday_B2c_total + Current_mobapp_both_total + others_total;
		int ALL_Total_Lastweek = lastweek_meta_bothtotal + b2c_total_l2 + lastweek_mobapp_both_total
				+ others_total_lastweek;

		float ALL_Total_Lastweek_F=ALL_Total_Lastweek;
		if(ALL_Total_Lastweek<=0)
		{
			Wow2_ALL_Total=100;
		}
		else{
		 Wow2_ALL_Total = (int) ((ALL_Total - ALL_Total_Lastweek_F) / ALL_Total_Lastweek_F * 100);
		}
		System.out.println("WOW2 GROWTH ALL TOTAL:" + Wow2_ALL_Total);

	}

}
