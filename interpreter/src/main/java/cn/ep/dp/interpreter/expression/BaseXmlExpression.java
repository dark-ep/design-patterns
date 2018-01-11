package cn.ep.dp.interpreter.expression;

import cn.ep.dp.interpreter.context.Context;

/**
 * 用于处理自定义Xml取值表达式的接口
 *
 * @author lhl
 */
public abstract class BaseXmlExpression {

    /**
     * 解释表达式
     *
     * @param c 上下文
     * @return 解析过后的值，为了通用，可能是单个值，也可能是多个值，
     * 因此就返回一个数组
     */
    public abstract String[] interpret(Context c);

}

