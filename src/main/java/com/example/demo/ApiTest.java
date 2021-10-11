package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.security.SecurityUtil;

public class ApiTest {

	 String gridCompositeExtract(Map<String, Object> resourceMap, String format) throws ApplicationException {
		String argRegex = "\\((.*?)\\).*?\\=>";
		Pattern patternArg = Pattern.compile(argRegex, Pattern.MULTILINE);
		format = SecurityUtil.decodeBase64(format);
		Matcher matcherArg = patternArg.matcher(format);
		String arg = "";
		if (matcherArg.find()) {
			arg = matcherArg.group(1);
		}

		String regex = "\\$\\{" + arg + ".(.*?)\\}";
		Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(format);
		matcher = pattern.matcher(format);
		Map<String, String> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		while (matcher.find()) {
			for (int i = 1; i <= matcher.groupCount(); i++) {
				String match = matcher.group(i);
				String[] split = match.split("\\.");
				boolean toAdd = true;
				for (String spl : split) {
					spl = spl.trim();
					int index = 0;
					if (spl.contains("[") && spl.contains("]")) {
						try {
							String indexStr = spl.substring(spl.indexOf("[") + 1, spl.indexOf("]"));
							index = Integer.valueOf(indexStr);
							spl = spl.substring(0, spl.indexOf("["));
						} catch (Exception e) {

						}
					}

					Object obj = resourceMap.get(spl);
					if (obj == null) {
						toAdd = false;
						break;
					} else if (obj instanceof ArrayList) {
						ArrayList tempArray = (ArrayList) obj;
						obj = tempArray.get(index);
					}
					if (!(obj instanceof BaseResource)) {
						map.put(matcher.group(0), obj.toString());
					} else {
						BaseResource br = (BaseResource) obj;
						resourceMap = br.validateAndConvertResourceToMap(false);
					}
				}
				if (toAdd) {
					list.add(matcher.group(0));
				}
			}
		}
		String finalStringRegex = "\\`(.*?)\\`";
		Pattern patternFinal = Pattern.compile(finalStringRegex, Pattern.MULTILINE);
		Matcher matcherFinal = patternFinal.matcher(format);
		String finalString = "";
		if (matcherFinal.find()) {
			// if(map.containsKey(matcherFinal.group(1))) {
			finalString = matcherFinal.group(1);
			// }

		}
		// System.out.println(finalString);
		boolean replaced = false;
		for (String str : list) {
			if (map.containsKey(str)) {
				replaced = true;
				finalString = finalString.replaceAll(Pattern.quote(str), map.get(str));
			}
		}
		int finalStringIndex=finalString.indexOf(".");
		System.out.println(finalString);
		System.out.println(finalStringIndex);
		if(finalString.isEmpty()||finalStringIndex!=-1) {
			System.out.println("inside is ::::>>>>");
			String spl="";
			finalString="";
			String as[]=format.split("[.]",-1);
			System.out.println("as ::::>>>>"+as[1]);
			spl=as[1].substring(0, as[1].indexOf("==")).trim();
			System.out.println("spl ::::>>>>"+spl);
			Object obj = resourceMap.get(spl);
			String finalString1=obj.toString();
			System.out.println("finalString1 ::::>>>>"+finalString1);
			String asv[]=format.split("==",-1);
			String sd=asv[1].replaceAll("[');}]", "").trim();
			System.out.println("sd ::::>>>>"+sd);
			String df=sd.substring(sd.indexOf('?')+1, sd.indexOf(':')).trim();
			System.out.println("df ::::>>>>"+df);
			String dsf=sd.substring(sd.indexOf(':')+1, sd.length()).trim();
			System.out.println("dsf ::::>>>>"+dsf);
			String dfg=sd.substring(0,sd.indexOf('?')).trim();
			System.out.println("dfg ::::>>>>"+dfg);
			if(finalString1.equalsIgnoreCase(dfg)) 
				finalString=df;
			else
				finalString=dsf;
			System.out.println("finalString ::::>>>>"+finalString);
			int firstIndex = finalString.indexOf('.');
			System.out.println("firstIndex ::::>>>>"+firstIndex);
			if(firstIndex!=-1) {
				System.out.println("if codition ::::>>>>");
				finalString=finalString.substring(firstIndex+1, finalString.length()).trim();
				System.out.println("finalString>>> ::: "+finalString);
				Object obj1 = resourceMap.get(finalString.trim());
				finalString=obj1.toString();
				System.out.println("finalString23 ::::>>>>"+finalString);
			}
			return finalString;
		}
		if (!replaced) {
			finalString = "";
		}
		return finalString;
	}
	
	public static void main(String[] args) throws ApplicationException {
		// TODO Auto-generated method stub
		ApiTest ta=new ApiTest();
		Map<String, Object> resourceMap=new HashMap<String, Object>();
		resourceMap.put("visit_type", "IP");
		resourceMap.put("currentTreatingDoctor", "Dr Anu Pareek");
		resourceMap.put("specility", "Pathologist");
		resourceMap.put("visit_date", "	02/17/2021, 16:05");
		String format="KGl0ZW0pID0+IGAke2l0ZW0uY3VycmVudFRyZWF0aW5nRG9jdG9yPT11bmRlZmluZWQ/aXRlbS50cmVhdGluZ0RvY3RvcjppdGVtLmN1cnJlbnRUcmVhdGluZ0RvY3Rvcn1g";
		System.out.println(ta.gridCompositeExtract(resourceMap, format));
	}

}
