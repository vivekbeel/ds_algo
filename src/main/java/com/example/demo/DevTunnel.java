package com.example.demo;

import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DevTunnel {
	
	private static final Logger logger = LoggerFactory.getLogger(DevTunnel.class);

	private static final String REMOTE_USER = "devloperdbadmin";
	private static final String REMOTE_PASS = "kxDevl0per@7171";
	private static final String CLUSTER_NODE1 = "multi-shard-00-02.ql8ow.mongodb.net:27017";
	private static final String CLUSTER_NODE2 = "multi-shard-00-00.ql8ow.mongodb.net:27017";
	private static final String CLUSTER_NODE3 = "multi-shard-00-01.ql8ow.mongodb.net:27017";
	private static final String BASE_DATABASE = "admin";
	

	public static void main(String[] args) {
	try {
	    setDevEnv();
	    logger.info("DB Connection String Activated");
	    
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {

	}
	}
	
	public static void setDevEnv() {
        try {
        	
        	String credential = URLEncoder.encode(REMOTE_PASS, StandardCharsets.UTF_8.toString()); 
        	String DB_CONNECTION_STRING = "mongodb://"+REMOTE_USER+":"+credential+"@"+CLUSTER_NODE1+","+CLUSTER_NODE2+","+CLUSTER_NODE3+"/"+BASE_DATABASE+"?ssl=true&replicaSet=atlas-z6ci1f-shard-0&authSource=admin&retryWrites=true&w=majority&maxPoolSize=200&maxIdleTimeMS=3600000&socketTimeoutMS=12000";
        	
            Map<String, String> env = System.getenv();
            Class<?> cl = env.getClass();
            Field field = cl.getDeclaredField("m");
            field.setAccessible(true);
            Map<String, String> writableEnv = (Map<String, String>) field.get(env);
            writableEnv.put("DB_MECHANISM", "true");
            writableEnv.put("DB_AUTHENTICATION", "true");
            writableEnv.put("DB_CONNECTION_STRING", DB_CONNECTION_STRING);
            writableEnv.put("DEVELOPMENT", "true");
            writableEnv.put("ENVIRONMENT", "dev");
            writableEnv.put("IS_MONGO_CLUSTER_SHARED", "YES");
            
        } catch (Exception e) {
            throw new IllegalStateException("Failed to set environment variable", e);
        }
    }
	
}