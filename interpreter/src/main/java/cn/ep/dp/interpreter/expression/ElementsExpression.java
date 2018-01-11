package cn.ep.dp.interpreter.expression;

import cn.ep.dp.interpreter.context.Context;
import org.w3c.dom.Element;

import java.util.*;

/**
 * 多个元素做为非终结符的解释处理对象
 *
 * @author lhl
 */
public class ElementsExpression extends BaseXmlExpression {
    /**
     * 用来记录组合的ReadXmlExpression元素
     */
    private Collection<BaseXmlExpression> eles = new ArrayList<>();
    /**
     * 元素名字
     */
    private String eleName = "";

    public ElementsExpression(String eleName) {
        this.eleName = eleName;
    }

    @Override
    public String[] interpret(Context c) {
        //先取出上下文里的父级元素
        List<Element> pEles = c.getPreEles();
        //把当前获取的元素放到上下文里面，这次是获取多个元素
        List<Element> nowEles = new ArrayList<>();

        for (Element ele : pEles) {
            nowEles.addAll(c.getNowEles(ele, eleName));
        }
        c.setPreEles(nowEles);

        //循环调用子元素的interpret方法
        String[] ss = null;
        for (BaseXmlExpression ele : eles) {
            ss = ele.interpret(c);
        }
        return ss;
    }

    public boolean addEle(BaseXmlExpression ele) {
        this.eles.add(ele);
        return true;
    }

    public boolean removeEle(BaseXmlExpression ele) {
        this.eles.remove(ele);
        return true;
    }
}
