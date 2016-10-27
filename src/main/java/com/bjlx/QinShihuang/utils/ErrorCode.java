package com.bjlx.QinShihuang.utils;

/**
 * 错误码
 * 所有接口的错误码都在这里，除了通用错误，其他的错误码都是按照接口来定的
 * 错误码由6位数字构成，每1位的含义如下：
 * 第1位：表示产品编号
 * 第2~4位：表示接口编号
 * 第5~6位：表示指定接口的错误编号
 * 比如100101表示第一个产品的第一个接口的第一个错误编号，这样可以根据错误码，定位到是哪个接口出现了什么问题
 *
 * 错误名称定义是由错误描述加上接口编号，比如：TEL_FORMAT_1001表示手机号格式错误，是1001接口抛出来的
 */
public enum ErrorCode {

	/**
	 * 通用错误
	 */
	OK(0, "Normal"),
	INVALID_ARGUMENTS(100, "Invalid arguments"),
	FORBIDDEN(403, "Forbidden"), 
	NOT_FOUND(404, "Resource not found"),
	ServerException(500, "Server Exception"),
	ALIPAY_REFUND(901, "Ali pay refund need manual operation"),
	UNKNOWN(999, "Unknown error"),
	NETWORK_ERROR(601, "网络异常"),

	/**
	 * 验证码
 	 */

	// 发送验证码
	ACCOUNT_NULL_1001(100101, "参数账户为空"),
	ACCOUNT_FORMAT_1001(100102, "账户格式不正确"),
	ACTION_NULL_1001(100103, "参数action为空"),
	ACTION_LIMIT_1001(100104, "参数action的值不合法"),
	USER_EXIST_1001(100105, "用户已存在"),
	USER_NOT_EXIST_1001(100106, "账户不存在"),
	TEL_EXIST_1001(100107, "手机号已存在"),
	EMAIL_EXIST_1001(100108, "邮箱已存在"),
	TIME_LIMIT_1001(100109, "请求过于频繁，请稍后再试"),
	REQUEST_TOO_MANY_1001(100110, "请求次数过多"),

	// 检验验证码
	ACCOUNT_NULL_1002(100201, "参数账户为空"),
	ACCOUNT_FORMAT_1002(100202, "账户格式不正确"),
	CODE_NULL_1002(100203, "验证码为空"),
	CODE_INVALID_1002(100204, "验证码不合法"),
	VALIDATION_FAIL_1002(100205, "验证失败"),

	/**
	 * 用户模块
	 */

	// 用户注册

	;









	public String msg;

	public int code;
	
	private ErrorCode(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public String getMsg() {
		return this.msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
}
