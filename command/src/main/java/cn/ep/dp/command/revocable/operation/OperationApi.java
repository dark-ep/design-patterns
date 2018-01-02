package cn.ep.dp.command.revocable.operation;

/**
 * 操作运算的接口
 *
 * @author lhl
 */
public interface OperationApi {

    /**
     * 获取计算完成后的结果
     *
     * @return 计算结果
     */
    int getResult();

    /**
     * 设置计算开始的初始值
     *
     * @param result 初始值
     */
    void setResult(int result);

    /**
     * 执行加法
     *
     * @param num 增加的数值
     */
    void add(int num);

    /**
     * 执行减法
     *
     * @param num 减少的数值
     */
    void substract(int num);

}
