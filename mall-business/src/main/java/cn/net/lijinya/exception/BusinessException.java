package cn.net.lijinya.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BusinessException extends RuntimeException {

    public static final long serialVersionUID = -6735897190745766939L;

    /**
     * 异常码
     */
    private int code;

    /**
     * 具体异常信息
     */
    private String message;

    public BusinessException() {
        super();
    }
}