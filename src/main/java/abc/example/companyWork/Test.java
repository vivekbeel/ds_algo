package abc.example.companyWork;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.scheduling.annotation.Scheduled;

import com.google.common.io.BaseEncoding;

//import org.json.JSONObject;

public class Test {
	private static String ALGORITHM_AES256 = "AES/CBC/PKCS5Padding";

	private static byte[] newByteArr;

	public static void test() {
		String jsonString = "{\"data\":[{\"orderNo\": \"100000794\",\"itemId\": 68690,\"proposalNo\": \"126395458\","
				+ "\"leadId\": 1234,\"productId\": 7,\"insurerId\": 10,\"uniqueId\": \"vivek@beel\",\"planId\": 776,\"txAmount\": 1419,"
				+ "\"txDate\": \"2016-09-27 19:25:31\",\"txStatus\": 3,\"paymentMode\": \"CC\",\"totalRefundedAmount\": 1419,"
				+ "\"netAmount\": 0},{\"orderNo\": \"100000794\",\"itemId\": 68691,\"proposalNo\": \"126395458\",\"leadId\": 1234,"
				+ "\"productId\": 7,\"insurerId\": 10,\"uniqueId\": \"vivek@beel1\",\"planId\": 776,\"txAmount\": 1419,"
				+ "\"txDate\": \"2016-09-27 19:21:31\",\"txStatus\": 3,\"paymentMode\": \"CC\",\"totalRefundedAmount\": 1419,"
				+ "\"netAmount\": 0},],\"msg\":\"sucess\",\"ok\":1}";
		// JSONObject jsonObject = new JSONObject(jsonString);
		// System.out.println(jsonObject);
	}

	public static void emptyTest() {
		List<String> list = new ArrayList<>();
		if (list == null || list.isEmpty())
			list.get(0);
	}

	public static void scheduledExecutorCallable() throws InterruptedException, ExecutionException {
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
		Callable<String> task2 = () -> "first";
		ScheduledFuture<String> schedule = ses.schedule(task2, 10, TimeUnit.SECONDS);
		System.out.println(schedule.get());
		System.out.println("shutdown!");

		ses.shutdown();
	}

	private static int count = 0;

	@Scheduled(fixedRate = 10000)
	public static void create() {
		System.out.println("tyasyuui yfduy");
	}

	public static void scheduledExecutorRunnable() throws InterruptedException, ExecutionException {
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

		Runnable task1 = () -> {
			count++;
			System.out.println("Running...task1 - count : " + count);

		};

// init Delay = 5, repeat the task every 1 second
		ScheduledFuture<?> scheduledFuture = ses.scheduleAtFixedRate(task1, 5, 5, TimeUnit.SECONDS);
		while (true) {
			Thread.sleep(1000);
			if (count == 5) {
				System.out.println("Count is 5, cancel the scheduledFuture!");
				scheduledFuture.cancel(true);
				ses.shutdown();
				break;
			}
		}
	}

	public static void task1() {
		System.out.println("Running task1...");
	}

	public static void me() {
		Date date = null;
		String s = date.toString();
		System.out.println(s);
	}

	/*
	 * public static String decodeBase64String(String val) { byte[] decodedString =
	 * Base64.getDecoder().decode(val); return new String(decodedString); }
	 */

	public static String decrypt(String message, String key, String iv) throws Exception {
		try {
			// byte[] decodedKey = Base64.getDecoder().decode(message);

//message=decodeBase64String(message);

			SecretKeySpec secretKeySpec = new SecretKeySpec(decodeBase64String(key).getBytes(StandardCharsets.UTF_8),
					"AES");
			IvParameterSpec ivs = new IvParameterSpec(decodeBase64String(iv).getBytes(StandardCharsets.UTF_8));
			Cipher cipher = Cipher.getInstance(ALGORITHM_AES256);
			cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivs);

			// byte[] encryptedTextBytes = Base64.getMimeDecoder().decode(message+"=");
			// byte[] encryptedTextBytes2 = Base64.getMimeDecoder().decode(message+"==");
			System.out.println("Test.decrypt() incoming = " + message);
			System.out.println("Test.decrypt() newByteArr = " + newByteArr);
			byte[] decodedString = BaseEncoding.base64().decode(message);
			System.out.println("Test.decrypt() decodedString = " + decodedString);
			// System.out.println("Test.decrypt() decodedString bytes = "+((new
			// String(decodedString)).getBytes()));
			byte[] decryptedTextBytes = cipher.doFinal(decodedString);
			return new String(decryptedTextBytes);

		} catch (NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException
				| InvalidKeyException | InvalidAlgorithmParameterException e) {
			System.out.println("Unable to encrypt message :: {}" + e);
			throw new Exception(e);
		}
//return iv;
	}

	private static String decodeBase64String(String newByteArr2) {
		byte[] decodedString = Base64.getDecoder().decode(newByteArr2);
		return new String(decodedString);
	}

	private static String decodeBase64StringtoByteString(String newByteArr2) {
		byte[] decodedString = Base64.getDecoder().decode(newByteArr);
		return decodedString.toString();
	}

	public static String encodedBase64String(byte[] encryptedTextBytes) {
		byte[] encodedString = Base64.getEncoder().encode(encryptedTextBytes);
		newByteArr = encodedString;
		return encodedString.toString();
	}

	public static String encrypt(String message, String key, String iv) throws Exception {
		try {
			// byte[] decodedKey = Base64.getDecoder().nulldecode(message);
			SecretKeySpec secretKeySpec = new SecretKeySpec(decodeBase64String(key).getBytes(StandardCharsets.UTF_8),
					"AES");
			IvParameterSpec ivs = new IvParameterSpec(decodeBase64String(iv).getBytes(StandardCharsets.UTF_8));
			Cipher cipher = Cipher.getInstance(ALGORITHM_AES256);
			cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivs);
			byte[] encryptedTextBytes = cipher.doFinal(message.getBytes("UTF-8"));
			System.out.println("Test.encrypt() encryptedTextBytes text = " + encryptedTextBytes.toString());
			System.out.println("Test.encrypt() encryptedTextBytes text 2v = " + encryptedTextBytes);
			String sample = BaseEncoding.base64().encode(encryptedTextBytes);
			// newByteArr = encryptedTextBytes;
			return sample;// Base64.getEncoder().encodeToString(sample.getBytes());
		} catch (NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException
				| UnsupportedEncodingException | InvalidKeyException | InvalidAlgorithmParameterException e) {
			System.out.println("Unable to encrypt message :: {}" + e);
			throw new Exception(e);
		}
//return iv;
	}

	public static boolean comapreDate(String currentDaye, String refundLastDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse(currentDaye);
		Date date2 = sdf.parse(refundLastDate);
		if (date2.after(date1))
			return true;
		else if (date1.equals(date2))
			return true;
		else
			return false;
	}

	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?"); // match a number with optional '-' and decimal.
	}

	public static boolean isNumeric1(String strNum) {
		if (strNum == null || strNum.isEmpty()) {
			return false;
		}

		try {
			Long.parseLong(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static String generateChecksum(String mid, String salt, String linkedHashSet)
			throws NoSuchAlgorithmException {
		StringBuilder inputStringBuilder = new StringBuilder().append(mid);

		inputStringBuilder.append("|");
		inputStringBuilder.append(linkedHashSet);

		inputStringBuilder.append("|").append(salt);
		// logger.info("checksum String - {} "+ inputStringBuilder);
		byte[] hashseq = inputStringBuilder.toString().getBytes();
		StringBuffer hexString = new StringBuffer();
		MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
		algorithm.reset();
		algorithm.update(hashseq);
		byte[] messageDigest = algorithm.digest();
		for (int i = 0; i < messageDigest.length; i++) {
			String hex = Integer.toHexString(0xFF & messageDigest[i]);
			if (hex.length() == 1)
				hexString.append("0");
			hexString.append(hex);
		}
		// logger.info("checksum generatad - {} "+ hexString.toString());
		return hexString.toString();
	}

	public static String generateChecksum(Map<String, Object> map) throws NoSuchAlgorithmException {

		StringBuilder keyItems = new StringBuilder("");

		if (null != map && map.size() > 0) {
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				if (entry.getValue() != null) {
					keyItems = keyItems.append(entry.getKey() + "=").append(entry.getValue()).append(";");
				}
			}
			keyItems = new StringBuilder(keyItems.substring(0, keyItems.length() - 1));
			keyItems = keyItems.append(";");
		}

		return keyItems.toString();
	}

	private static void oneDateToAnotherDate() {
		LocalDateTime date = LocalDateTime.parse("Tue Sep 21 16:10:30 IST 2021",
				DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy"));
		System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(date));
	}

	private static void longToDate() throws ParseException {

		String d = "2021-09-24 18:53:50";
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(d);

		System.out.println("date:: " + date + " >>>> ");
	}

	public static boolean validData(String str, String min) {
		// null or empty
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException ne) {
			return false;
		}
	}

	public static void main(String[] args) throws Exception {

		
		
		//scheduledExecutorCallable();
		//create();
		
		  System.out.println("Test.main() " + validData("126", "min"));
		  
		  // test(); //
		  
		  String encriptString = encrypt("689139727",
		  "QlRYbEhEcHR6aFVzaExIamFKaFVGdklEdVpkcGdxeUs=", "S0d4bUhSaXZqeXNvSG1aUQ==");
		  
		  System.out.println("generateChecksum(map) :: >> ");
		  System.out.println("generateChecksum >>> " + generateChecksum("HA4K3",
		  "gMbsh35hgfhfhHGf122mFBcy2341XIw",
		  "additionalRefundReason=cfswefsw;itemId=136669;orderNo=100171777;refNo=1632316906288;refundAmount=20;refundReason=cfswefsw;"
		  )); System.out.println("Encrypted == " + encriptString);
		  oneDateToAnotherDate(); String decString =
		  decrypt("r40+W0EvP7C9HOh/3bxC+w==",
		  "QlRYbEhEcHR6aFVzaExIamFKaFVGdklEdVpkcGdxeUs=", "S0d4bUhSaXZqeXNvSG1aUQ==");
		  
		  System.out.println("Decrypted == " + decString);
		  System.out.println(System.currentTimeMillis()); if (isNumeric("12345a"))
		  Long.parseLong("12345a"); else {
		  
		  } System.out.println(System.currentTimeMillis());
		  
		  System.out.println(System.currentTimeMillis()); try { isNumeric1("123456a");
		  Long.parseLong("123456a"); } catch (Exception e) { System.out.println(); }
		  System.out.println(System.currentTimeMillis());
		  
		  longToDate();
		  
		  String str = "[B@5ae63ade";
		  
		  // byte[] arr = new Byte(str);
		  
		  // String decodedString =
		  Base64.getMimeEncoder().encodeToString(str.getBytes());
		  
		  String encoded = encodedBase64String(str.getBytes());
		  System.out.println("encoded = " + encoded);
		  
		  //String decoded = decodeBase64String(encoded); System.out.println(decoded);
		 		
	}
}

class Task implements Runnable {
	public void run() {
		System.out.println("Number " + " Current time : " + Calendar.getInstance().get(Calendar.SECOND));
	}
}