package com.mk.bigplatform.base.apiReturn;

/**
 * @Description:api异常
 * @author MK516787
 * @date 2019年5月7日 下午1:58:17
 */
public class ApiException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 异常码
     */
    private Integer code;
    
    /**
     * 异常信息
     */
    private String message;

    /*public ApiException(Integer code) {
        this.code = code;
    }*/
    
    public ApiException(Integer code) {
        this.code = code;
    }
    
    /**
     * 最好不要用这个构造方法，适用场景调用接口返回，如com.mk.bigplatform.park.service.impl.DeliyunServiceImpl.(doPost)所示
     * @param apiReturnCode
     * @param message
     */
    public ApiException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
