package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class testy {

public static boolean comapreDate(String currentDaye,String refundLastDate) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date1 = sdf.parse(currentDaye);
    Date date2 = sdf.parse(refundLastDate);
    if(date2.after(date1))
        return true;
    else if(date1.equals(date2))
    	return true;
    else
    	return false;
}
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		LocalDate currentDaye=LocalDate.now();
		LocalDate txnlocalDate=LocalDate.parse("2021-9-25 15:46:22");
		System.out.println(comapreDate(currentDaye.toString(),txnlocalDate.toString()));
	}

}
