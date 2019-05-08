package com.yiyun.suishou;

import org.junit.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLParse {
    @Test
    public void fun1() throws Exception{
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        String path = getClass().getResource("/Test.xml").getPath();
        //将xml文件解析
        Document document = db.parse(path);
    }
}
