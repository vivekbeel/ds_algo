package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Map<String,String>> lists=new ArrayList<Map<String,String>>();
		Map<String,String> params=new HashMap<String, String>();
		params.put("id", "asd");
		params.put("test", "iukhdf");
			  ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
			  if (params != null) {
			    for (Map.Entry<String, String> pair : params.entrySet()) {
			      engine.put(pair.getKey(), pair.getValue());
			    }
			  }
			  try {
				  engine.eval("var item = Map.parse('"+params+"'); ");
			    engine.eval("fn=function(item){ return item.text }");
			    Object obj = engine.eval("var obj = fn(item)"); // Evals the creation of a simple object
			      System.out.println(engine.get("obj").toString());
			  } catch (ScriptException e) {
				  e.printStackTrace();
			  }
	}

}
