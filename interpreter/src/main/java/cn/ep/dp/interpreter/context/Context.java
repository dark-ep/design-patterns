package cn.ep.dp.interpreter.context;

import cn.ep.dp.interpreter.util.XmlUtil;
import org.w3c.dom.*;

import java.util.*;

/**
 * 上下文，用来包含解释器需要的一些全局信息
 *
 * @author lhl
 */
public class Context {

    /**
     * Dom解析Xml的Document对象
     */
    private Document document;
    /**
     * 上一次被处理的多个元素
     */
    private List<Element> preEles = new ArrayList<>();

    /**
     * 构造方法
     *
     * @param filePathName 需要读取的xml的路径和名字
     * @throws Exception 异常
     */
    public Context(String filePathName) throws Exception {
        //通过辅助的Xml工具类来获取被解析的xml对应的Document对象
        this.document = XmlUtil.getRoot(filePathName);
    }

    /**
     * 重新初始化上下文
     */
    public void reInit() {
        preEles = new ArrayList<>();
    }

    /**
     * 各个Expression公共使用的方法,
     * 根据父元素和当前元素的名称来获取当前的多个元素的集合
     *
     * @param pEle    父元素
     * @param eleName 当前元素的名称
     * @return 当前的多个元素的集合
     */
    public List<Element> getNowEles(Element pEle, String eleName) {
        List<Element> elements = new ArrayList<>();
        NodeList tempNodeList = pEle.getChildNodes();
        for (int i = 0; i < tempNodeList.getLength(); i++) {
            if (tempNodeList.item(i) instanceof Element) {
                Element nowEle = (Element) tempNodeList.item(i);
                if (nowEle.getTagName().equals(eleName)) {
                    elements.add(nowEle);
                }
            }
        }
        return elements;
    }

    public Document getDocument() {
        return document;
    }

    public List<Element> getPreEles() {
        return preEles;
    }

    public void setPreEles(List<Element> nowEles) {
        this.preEles = nowEles;
    }

}
