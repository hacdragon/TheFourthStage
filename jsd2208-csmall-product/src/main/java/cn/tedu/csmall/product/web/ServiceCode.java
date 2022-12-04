package cn.tedu.csmall.product.web;

/**
 * 业务状态码
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
public enum ServiceCode {

    /**
     * 成功
     */
    OK(200),
    /**
     * 错误：请求参数格式有误
     */
    ERR_BAD_REQUEST(400),
    /**
     * 错误：数据不存在
     */
    ERR_NOT_FOUND(404),
    /**
     * 错误：数据冲突
     */
    ERR_CONFLICT(409);

    private Integer value;

    ServiceCode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
