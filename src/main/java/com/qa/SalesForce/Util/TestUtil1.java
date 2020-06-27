package com.qa.SalesForce.Util;


	import java.util.ArrayList;

	import com.qa.SalesForce.Utillity.Xls_Reader;


	public class TestUtil1 {
		public static Xls_Reader r;
		public static ArrayList<Object[]> getDataFromExcel(){
		ArrayList<Object[]> data= new ArrayList<Object[]>();
		try {
			r=new Xls_Reader("C:\\Users\\Mashuda\\eclipse-workspace\\SeleniumProject\\APIToolsTest\\src\\main\\java\\com\\qa\\SalesForce\\TestData\\MyData.xlsx");
			
		}
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
		for(int rn=2; rn<=r.getRowCount("Sheet1");rn++) {
			String UserId=r.getCellData("Sheet1", "UserId", rn);
			String Password=r.getCellData("Sheet1", "Password", rn);
			Object ob[]= {UserId,Password};
			data.add(ob);
			
		}
		return data;
	}
	}

