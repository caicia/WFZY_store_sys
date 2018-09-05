package com.WFZY.ulits;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DateUtils {
	public static String getSimpleDate(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(date);
	}

	public static String getRandomDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		Random random = new Random();
		return random.nextInt(1000) + df.format(new Date());
	}

	public static Date getDate(String date) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return df.parse(date);
	}
}
