package com.linkjb.servicebase.error;

/**
 * @author sharkshen
 * @data 2019/3/24 23:23
 * @Useage
 */
public enum EmBussnessError implements CommonError{
    //通用错误类型00001
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),

    UNKNOWN_ERROR(10002,"未知错误"),
    //20000开头为用户信息相关错误定义
    USER_NOT_EXIST(20001,"用户不存在"),
    ;

    private EmBussnessError(int errCode,String errMsg){
        this.errCode=errCode;
        this.errMsg=errMsg;
    }

    private int errCode;
    private String errMsg;
    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {

        this.errMsg=errMsg;
        return this;
    }}
