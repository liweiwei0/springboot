package fun.lww.exception;

import fun.lww.enums.ResultEnum;

public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException() {
    }

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
