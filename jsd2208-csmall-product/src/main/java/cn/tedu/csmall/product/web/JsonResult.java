package cn.tedu.csmall.product.web;

import cn.tedu.csmall.product.ex.ServiceException;
import lombok.Data;

/**
 * 响应结果类
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Data
public class JsonResult {

    /**
     * 业务状态码
     */
    private Integer state;
    /**
     * 操作失败时的提示消息
     */
    private String message;

    public static JsonResult ok() {
        JsonResult jsonResult = new JsonResult();
        jsonResult.state = ServiceCode.OK.getValue();
        return jsonResult;
    }

    public static JsonResult fail(ServiceException e) {
        // JsonResult jsonResult = new JsonResult();
        // jsonResult.state = e.getServiceCode().getValue();
        // jsonResult.message = e.getMessage();
        // return jsonResult;
        return fail(e.getServiceCode(), e.getMessage());
    }

    public static JsonResult fail(ServiceCode serviceCode, String message) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.state = serviceCode.getValue();
        jsonResult.message = message;
        return jsonResult;
    }

}
