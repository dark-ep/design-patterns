package cn.ep.dp.interpreter.util;

import org.w3c.dom.Document;

import javax.xml.parsers.*;

/**
 * @author lhl
 */
public class XmlUtil {

    public static Document getRoot(String filePathName) throws Exception {
        //建立一个解析器工厂
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //获得一个DocumentBuilder对象，这个对象代表了具体的DOM解析器
        DocumentBuilder builder = factory.newDocumentBuilder();
        //得到一个表示XML文档的Document对象
        Document doc = builder.parse(ClassLoader.getSystemResourceAsStream(filePathName));
        //去掉XML文档中作为格式化内容的空白而映射在DOM树中的不必要的Text Node对象
        doc.normalize();
        return doc;
    }

}
