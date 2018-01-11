package cn.ep.dp.interpreter.expression;

import cn.ep.dp.interpreter.context.Context;
import org.w3c.dom.Element;

import java.util.*;

/**
 * 单个元素作为非终结符的解释器
 *
 * @author lhl
 */
public class ElementExpression extends BaseXmlExpression {
    /**
     * 用来记录组合的ReadXmlExpression元素
     */
    private Collection<BaseXmlExpression> eles = new ArrayList<>();
    /**
     * 元素的名称
     */
    private String eleName = "";

    public ElementExpression(String eleName) {
        this.eleName = eleName;
    }

    public boolean addEle(BaseXmlExpression ele) {
        return this.eles.add(ele);
    }

    public boolean removeEle(BaseXmlExpression ele) {
        return this.eles.remove(ele);
    }

    @Override
    public String[] interpret(Context c) {
        //先取出上下文里的父级元素
        List<Element> pEles = c.getPreEles();
        Element ele;
        //把当前获取的元素放到上下文里面
        List<Element> nowEles = new ArrayList<>();
        if (pEles.size() == 0) {
            //说明现在获取的是根元素
            ele = c.getDocument().getDocumentElement();
            pEles.add(ele);
            c.setPreEles(pEles);
        } else {
            for (Element tempEle : pEles) {
                nowEles.addAll(c.getNowEles(tempEle, eleName));
                if (nowEles.size() > 0) {
                    //找到一个就停止
                    break;
                }
            }
            List<Element> tempList = new ArrayList<>();
            tempList.add(nowEles.get(0));
            c.setPreEles(tempList);
        }

        //循环调用子元素的interpret方法
        String[] ss = null;
        for (BaseXmlExpression tempEle : eles) {
            ss = tempEle.interpret(c);
        }
        return ss;
    }
}