package com.tns.util;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class example8 {

	public static void main(String[] args) {
		
		ZonedDateTime currentTime = ZonedDateTime.now();
        System.out.println(currentTime);
       
        ZonedDateTime currentTimeinparis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(currentTimeinparis);     


	}

}
