package cn.ep.dp.flyweight.impl;

import cn.ep.dp.flyweight.Flyweight;

/**
 * 描述授权数据的数据模型
 *
 * @author lhl
 */
public class AuthorizationFlyweight implements Flyweight {

    private static final String REGEX = ",";
    /**
     * 安全实体
     */
    private String securityEntity;

    /**
     * 权限
     */
    private String permit;

    public AuthorizationFlyweight(String state) {
        String[] ss = state.split(REGEX);
        securityEntity = ss[0];
        permit = ss[1];
    }

    public String getSecurityEntity() {
        return securityEntity;
    }

    public void setSecurityEntity(String securityEntity) {
        this.securityEntity = securityEntity;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    @Override
    public boolean match(String securityEntity, String permit) {
        return this.securityEntity.equals(securityEntity) && this.permit.equals(permit);
    }

    @Override
    public void add(Flyweight flyweight) {
        throw new UnsupportedOperationException("对象不支持这个功能");

    }

}
