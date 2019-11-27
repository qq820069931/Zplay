package com.Zplay.uitl;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class getIp {  //获得局域网IP地址
   public static InetAddress  GetIp(){
	 	 try {
 	        Enumeration<NetworkInterface> nifs = NetworkInterface.getNetworkInterfaces();
 	        while (nifs.hasMoreElements()) {
 	            NetworkInterface nif = nifs.nextElement();

 	            if (nif.getName().startsWith("wlan")) {
 	                Enumeration<InetAddress> addresses = nif.getInetAddresses();

 	                while (addresses.hasMoreElements()) {

 	                    InetAddress addr = addresses.nextElement();
 	                    if (addr.getAddress().length == 4) { // 速度快于 instanceof
 	                    	return addr;
 	                    }
 	                }
 	            }
 	        }
 	    } catch (SocketException ex) {
 	        ex.printStackTrace(System.err);
 	    }
	return null;
	
   
   }
}
