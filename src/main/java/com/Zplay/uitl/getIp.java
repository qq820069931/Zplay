package com.Zplay.uitl;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class getIp {  //��þ�����IP��ַ
   public static InetAddress  GetIp(){
	 	 try {
 	        Enumeration<NetworkInterface> nifs = NetworkInterface.getNetworkInterfaces();
 	        while (nifs.hasMoreElements()) {
 	            NetworkInterface nif = nifs.nextElement();

 	            if (nif.getName().startsWith("wlan")) {
 	                Enumeration<InetAddress> addresses = nif.getInetAddresses();

 	                while (addresses.hasMoreElements()) {

 	                    InetAddress addr = addresses.nextElement();
 	                    if (addr.getAddress().length == 4) { // �ٶȿ��� instanceof
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
