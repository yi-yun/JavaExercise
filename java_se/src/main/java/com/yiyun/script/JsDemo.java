package com.yiyun.script;

import org.junit.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class JsDemo {
    @Test
    public void fun() throws Exception{
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");
        engine.put("msg","yi-yun is headsome");
        String str="var user={name:'yi-yun',age:18,schools:['qwerer','micahel']};";
        str+="print(user.name)";
        //------------------------
        engine.eval(str);
        engine.eval("msg='yi-yun';");
        System.out.println(engine.get("msg"));
    }
}
