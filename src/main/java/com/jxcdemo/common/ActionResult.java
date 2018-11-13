package com.jxcdemo.common;


/**
 * 2xx (成功类别) 200 Ok：标准的 HTTP 响应，表示 GET、PUT 或 POST 的处理成功。 201
 * Created：在创建新实例时，应返回此状态代码。例如，使用 POST 方法创建一个新的实例，应该始终返回 201 状态码。 204
 * 内容不存在：表示请求已被成功处理，但并未返回任何内容。 3xx (重定向类别) 304 未修改：表示客户端的响应已经在其缓存中。
 * 因此，不需要再次传送相同的数据。
 * 
 * 4xx (客户端错误类别) 400 错误请求：表示客户端的请求没有被处理，因为服务器不能理解客户端请求的是什么。 401
 * 未授权：表示客户端不被允许访问该资源，需要使用指定凭证重新请求。 403
 * 禁止访问：表示请求是有效的并且客户端已通过身份验证，但客户端不被允许以任何理由访问对应页面或资源。 例如有时授权的客户端不被允许访问服务器上的目录。
 * 404 未找到：表示所请求的资源现在不可用。 410 资源不可用：表示所请求的资源后续不再可用，该资源已被移动。
 * 
 * 5xx（服务器错误类别） 500是服务器内部错误，表示请求已经被接收到了，但服务器被要求处理某些未预设的请求而完全混乱。
 * 503服务不可用表示服务器已关闭或无法接收和处理请求。大多数情况是服务器正在进行维护。
 * 
 * @author hepeng
 *
 */
public class ActionResult {

	private ActionCode code;

	private String msg;

	private Object data;

	public ActionResult() {
		this.code = ActionCode.Success;
	}

	public ActionResult(ActionCode code) {
		this.code = code;
	}

	public ActionResult(ActionCode code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public ActionResult(ActionCode code, String msg,Object data) {
		this.code = code;
		this.msg = msg;
		this.data=data;
	}

	public ActionCode getCode() {
		return code;
	}

	public void setCode(ActionCode code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
