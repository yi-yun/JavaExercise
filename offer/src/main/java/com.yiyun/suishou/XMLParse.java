package com.yiyun.suishou;

import org.junit.Test;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class XMLParse {
    public void funParse(String tagName,String attribute) throws Exception{
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        String path = getClass().getResource("/Test.xml").getPath();
        //将xml文件解析
        Document document = db.parse(path);
        NodeList nodeIf = document.getElementsByTagName(tagName);
        for (int i = 0; i <nodeIf.getLength() ; i++) {
            NamedNodeMap attributes = nodeIf.item(i).getAttributes();
            Node node = attributes.getNamedItem(attribute);
            String nodeValue = node.getNodeValue().replaceAll(">","&lt;");
            String s = nodeValue.replaceAll("<", "&gt;");
            node.setNodeValue(s);
        }
        //写回
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        DOMSource source = new DOMSource(document);
        //添加xml 头信息
        transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        //输出xml流信息包装类
        PrintWriter pw = new PrintWriter(new FileOutputStream("Test.xml"));
        StreamResult result = new StreamResult(pw);
        //将xml写到文件中
        transformer.transform(source, result);
    }
    @Test
    public void fun() throws Exception{
        funParse("if","test");
    }
    @Test
    public void fun2(){
        String string =new String("test=flag>=1");
        String replace=string.replaceAll(">","&lt;");
        System.out.println(replace);
    }
}
