
package com.example.demo;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.json.JSONObject;



public class test {
	
	public static void main(String[] args) throws ParseException, ScriptException {
		//(item)=>{ return (item.admissionType == 'PHARMACY_DIRECT_ORDER')?'WALKIN':'OP'; }
		//String abc="{visit_summary_detail=[{\"fieldDetail\":\"[{\\\"noKnownAllergy\\\":true,\\\"g_modified_by_name\\\":\\\"Divyansh Jain\\\",\\\"g_modify_time\\\":1618378951706,\\\"role\\\":\\\"Facility Admin\\\"}, {\\\"category\\\":\\\"Drug\\\",\\\"substance\\\":\\\"Abacavir\\\",\\\"manifestation\\\":[{\\\"\\\":\\\"\\\",\\\"id\\\":\\\"agitation\\\",\\\"text\\\":\\\"Agitation\\\"},{\\\"\\\":\\\"\\\",\\\"id\\\":\\\"alopecia\\\",\\\"text\\\":\\\"Alopecia\\\"}],\\\"severity\\\":\\\"Moderate\\\",\\\"note\\\":\\\"\\\",\\\"selectedType\\\":\\\"onSetDate\\\",\\\"onSetDate\\\":1618338600000,\\\"source\\\":\\\"Historical\\\",\\\"g_modified_by_name\\\":\\\"Divyansh Jain\\\",\\\"g_modify_time\\\":1618378972226,\\\"role\\\":\\\"Facility Admin\\\"}]\",\"fieldName\":\"Allergy\",\"name\":\"allergyData\",\"id\":\"4ffed786-9ce4-11eb-84bd-be36a15379a8-91\"}], familyMemberHistory=[], observations=[], config_value=true, status=draft}";
		//JSONArray jsonArray=new JSONArray(abc);
		   ScriptEngine engine = null;
		   //  "format": "fn=function(item){return (item.extra_data.visit_count==undefined)?'':item.extra_data.visit_count;}",
		   JSONObject jsonObject=new JSONObject();
		   JSONObject jsonObject1=new JSONObject();
		   Object obj1=true;
		   jsonObject.put("serviceDate", "1625821570700");
		   jsonObject.put("serviceType_code", "pathology1");
		   //jsonObject.put("stage_with_date_time",jsonObject1);
		   String abc=jsonObject.toString();
		   try {
			      engine = new ScriptEngineManager().getEngineByName("javascript");
			      engine.eval("var item = JSON.parse('"+abc+"'); "); // Evals the creation of a simple object

			      String foo = "fn=function(item){ if(item.serviceType_code == 'pathology' || item.serviceType_code == 'neurology' || item.serviceType_code == 'radiology' || item.serviceType_code == 'pulmonology' || item.serviceType_code == 'cardiology' || item.serviceType_code == 'nuclear_medicine'){ return new Date(Number(item.serviceDate)).toLocaleDateString('en-US', {timeZone: 'America/New_York'});}else{ return new Date(Number(item.serviceDate)).toLocaleString('en-US', {timeZone: 'America/New_York'});}}";
			      //fn=function(item){return (item.taxType == 'cgst'?item.taxValue:'';}
			      //String foo1="{('uhid'=='BL_387'&&'itemname'=='testinggod')}";
			      engine.eval(foo);
			      //engine.eval(Files.newBufferedReader(Paths.get(foo), StandardCharsets.UTF_8));
			      //engine.eval(Files.newBufferedReader(Paths.get("C:/Scripts/Jsfunctions.js"), StandardCharsets.UTF_8));
			      Object obj = engine.eval("var obj = fn(item)"); // Evals the creation of a simple object
			      System.out.println(engine.get("obj").toString());
			      
			   } catch (Exception ex) {
		      System.out.println(ex.getMessage());
		   }
		
		
		  
		/*
		 * String
		 * format="(item) => `${item.currentTreatingDoctor==undefined?item.treatingDoctor:item.currentTreatingDoctor}"
		 * ;
		 * 
		 * String currentTreatingDoctor=null; //format=
		 * DatatypeConverter.printHexBinary(DatatypeConverter.parseBase64Binary(format))
		 * ; format =format.replaceAll("[^a-zA-Z0-9?:=]", "").replaceAll("item", "");
		 * format=format.substring(1,format.length()); String
		 * abc=format.substring(format.indexOf("?")+1,format.indexOf(":"));
		 * 
		 * System.out.println(currentTreatingDoctor);
		 * System.out.println("format:: "+format); System.out.println("abc:: "+abc);
		 */ 
		//System.out.println(ans);
		/*
		 * Scanner s = new Scanner(System.in); int total = 0;
		 * System.out.println("Enter the group of dies:"); int group =
		 * s.nextInt();//this value give group of dies ex. 4 dies is for 6 faces and 3
		 * dies for 4 faces so group = 2 for(int i=0; i<group; i++ ) {
		 * System.out.println("Enter the number of dies:"); int number = s.nextInt(); //
		 * number of dies System.out.println("Enter the faces of dies:"); int faces =
		 * s.nextInt(); // faces of dies System.out.println(""); Random ranNum = new
		 * Random();
		 * 
		 * System.out.print("dies numbering :: ");
		 * 
		 * int randomNumber = 0;
		 * 
		 * for (int j = 0; j < number; j++) {
		 * 
		 * randomNumber = ranNum.nextInt(faces) + 1; total = total + randomNumber;
		 * System.out.print(randomNumber+" "); }
		 * 
		 * System.out.println("\n\nTotal: " + total);
		 * 
		 * 
		 * } s.close();
		 */// Initializing the Random object for 
        // generating random numbers 
        	
		/*
		 * try { System.out.println("Present Project Directory : "+
		 * System.getProperty("user.dir"));
		 * 
		 * 
		 * String url = new
		 * File("/home/vivek/Documents/html/demo1.html").toURI().toURL().toString();
		 * FileOutputStream out1 = new
		 * FileOutputStream("/home/vivek/Documents/html/invoiceReg.pdf"); ITextRenderer
		 * renderer = new ITextRenderer(); renderer.setDocument(url); renderer.layout();
		 * renderer.createPDF(out1); out1.close();
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */
		/*
		 * Base64.Decoder decoder = Base64.getDecoder();
		 * 
		 * String encodedString=
		 * "W3sia2V5IjoiVG90YWxCaWxsQW1vdW50IiwidmFsdWUiOjYyODI4LjExfSx7ImtleSI6IlRvdGFsRGlzY291bnQiLCJ2YWx1ZSI6NjEyfSx7ImtleSI6IlRvdGFsTmV0QW1vdW50IiwidmFsdWUiOjYyMjE2LjExfSx7ImtleSI6IlRvdGFsUGFpZEFtb3VudCIsInZhbHVlIjo2MjAxN30seyJrZXkiOiJUb3RhbER1ZUFtb3VudCIsInZhbHVlIjowfV0=";
		 * //String decodedString = new
		 * String(Base64.decodeBase64(encodedString.getBytes())); String dStr = new
		 * String(decoder.decode(encodedString));
		 * //System.out.println("Decoded string: "+dStr); JSONArray jsonArray=new
		 * JSONArray(dStr); Map<String, Object> retMap=null; for(int
		 * i=0;i<jsonArray.length();i++) { JSONObject jsonObject
		 * =jsonArray.getJSONObject(i); retMap = new Gson().fromJson(
		 * jsonObject.toString(), new TypeToken<HashMap<String, Object>>() {}.getType()
		 * ); System.out.println(retMap); }
		 * 
		 */

		/*
		 * int a=10; int b=595; int c=(10*595)/100; System.out.println("c:: "+c);
		 */
		/*
		 * String str=
		 * "%7B%22webAction%22%3A%22videoCallStart%22%2C%22extras%22%3A%22%22%2C%22androidAction%22%3A%22%22%2C%22title%22%3A%22Video+Call+Request%22%2C%22message%22%3A%22Please+Join+Video+Call%21%21%22%7D%2CuserId%3A7cf030a0-8582-11ea-898b-6a9223368c0d-78%2Cuser_name%3ARED+RED%2CorderId%3AAMB-576%2Cchannel_id%3A464fc632-02ed-11eb-b136-9a14c874765e-40";
		 * URLDecoder.decode(str, "UTF-8"); System.out.println("str:: "+str);
		 * 
		 * try { String result = java.net.URLDecoder.decode(str,
		 * StandardCharsets.UTF_8.name()); System.out.println("result::"+result ); }
		 * catch (UnsupportedEncodingException e) { // not going to happen - value came
		 * from JDK's own StandardCharsets }
		 */
		/*
		 * Multimap<String, String> multimap = ArrayListMultimap.create();
		 * multimap.put("abc", "xyz"); multimap.put("abc", "x1yz"); multimap.put("abc1",
		 * "xy1z"); multimap.put("abc", "xyz2"); multimap.put("abc", "xyz");
		 * System.out.println("multimap:: "+multimap); String b=""; for(Object
		 * a:multimap.values()) { b+=a.toString()+","; }
		 * System.out.println(b.substring(0,b.length()-1));
		 */
		/*
		 * Map<String, String> map = new HashMap<>(); map.put("1", "x"); map.put("2",
		 * "y"); map.put("3", "x"); map.put("4", "z"); System.out.println(map);
		 * Map<String, ArrayList<String>> reverseMap = new HashMap<>(
		 * map.entrySet().stream()
		 * .collect(Collectors.groupingBy(Map.Entry::getValue)).values().stream()
		 * .collect(Collectors.toMap( item -> item.get(0).getValue(), item -> new
		 * ArrayList<>( item.stream() .map(Map.Entry::getKey)
		 * .collect(Collectors.toList()) )) ));
		 * 
		 * System.out.println(reverseMap);
		 */

		/*
		 * Map<String, Object> hm = new HashMap<String, Object>(); Map<String, Object>
		 * hm2 = new HashMap<String, Object>(); Collection<Map<String, ?>> data1 = new
		 * ArrayList<Map<String,?>>(); hm.put("abc", 12); hm.put("abc1", 13);
		 * hm2.put("abc2", "nitin"); hm2.put("abc3", "vivek"); data1.add(hm);
		 * data1.add(hm2); System.out.println("data1:: "+data1); Map<String, String> hm1
		 * = new HashMap<String, String>();
		 * 
		 * for (Map<String, ?> in : data1) {
		 * System.out.println(in.values().toArray()[0]+" ;;  ;; ;; "+in.values().toArray
		 * ()[1]);
		 * 
		 * 
		 * }
		 */
	}

}
