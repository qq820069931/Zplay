package com.Zplay;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class app {
    public static void main(String[] args) throws UnknownHostException, SocketException {
        SpringApplication.run(app.class,args);
        Logger log = Logger.getLogger(app.class.getClass());
        log.debug("debug");
		log.error("error");	
   
    }
}