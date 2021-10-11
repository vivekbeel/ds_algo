package com.example.abc;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Test {
	public static void test1()
    {
        Integer result=null;
        try
        {
            ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
            System.out.println("scriptEngineManager object is "+scriptEngineManager);
            ScriptEngine nashorn=scriptEngineManager.getEngineByName("nashorn");
            System.out.println("nashorn object is "+nashorn);
            String name="Mahesh";
            nashorn.eval("print('"+name+"')");
            result=(Integer)nashorn.eval("10 + 2");
        }catch(ScriptException e)
        {
            System.out.println("Error executing script: "+e.getMessage());
            e.printStackTrace();
        }
        System.out.println(result.toString());
    }
	public static void main(String[] args) {
		test1();
	}

}
