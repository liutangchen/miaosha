package com.imooc.miaosha.result;

public class CodeMsg {
    private Integer code;
    private String msg;

    // 通用异常
    public static CodeMsg SUCCESS = new CodeMsg(0, "success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100,"服务端异常");

    // 登陆模块 5002xx

    // 商品模块 5003xx

    // 订单模块 5004xx

    // 秒杀模块 5005xx

    private CodeMsg(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
