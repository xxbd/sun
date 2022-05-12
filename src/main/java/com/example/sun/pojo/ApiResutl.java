// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   ApiResutl.java

package com.example.sun.pojo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.sun.utils.base.IntBaseType;
import java.util.List;

// Referenced classes of package com.example.sun.pojo:
//			ResultCode, ApiPaging

public class ApiResutl
{

	private Boolean success;
	private Integer code;
	private String message;
	private Object data;

	private ApiResutl()
	{
	}

	public static ApiResutl ok()
	{
		ApiResutl r = new ApiResutl();
		r.setSuccess(Boolean.valueOf(true));
		r.setCode(com.example.sun.pojo.ResultCode.SUCCESS);
		r.setMessage("�ɹ�");
		return r;
	}

	public static ApiResutl ok(Integer code, String message)
	{
		ApiResutl r = new ApiResutl();
		r.setSuccess(Boolean.valueOf(true));
		r.setCode(code);
		r.setMessage(message);
		return r;
	}

	public static ApiResutl ok(Object obj)
	{
		ApiResutl tResultOK = new ApiResutl();
		tResultOK.setSuccess(Boolean.valueOf(true));
		tResultOK.setCode(com.example.sun.pojo.ResultCode.SUCCESS);
		tResultOK.setMessage("�ɹ�");
		if (obj instanceof Page)
			tResultOK.setData(ApiPaging.build(obj));
		else
		if (obj instanceof List)
			tResultOK.setData(obj);
		else
			tResultOK.setData(obj);
		return tResultOK;
	}

	public static ApiResutl error()
	{
		ApiResutl r = new ApiResutl();
		r.setSuccess(Boolean.valueOf(false));
		r.setCode(com.example.sun.pojo.ResultCode.ERROR);
		r.setMessage("�������쳣");
		return r;
	}

	public static ApiResutl error(String message)
	{
		ApiResutl r = new ApiResutl();
		r.setSuccess(Boolean.valueOf(false));
		r.setCode(com.example.sun.pojo.ResultCode.ERROR);
		r.setMessage(message);
		return r;
	}

	public static ApiResutl error(Integer code, String message)
	{
		ApiResutl r = new ApiResutl();
		r.setSuccess(Boolean.valueOf(false));
		r.setCode(code);
		r.setMessage(message);
		return r;
	}

	public static ApiResutl error(Integer code, String message, Object data)
	{
		ApiResutl r = new ApiResutl();
		r.setSuccess(Boolean.valueOf(false));
		r.setCode(code);
		r.setMessage(message);
		r.setData(data);
		return r;
	}

	public static ApiResutl error(IntBaseType intBaseType)
	{
		ApiResutl r = new ApiResutl();
		r.setSuccess(Boolean.valueOf(false));
		r.setCode(Integer.valueOf(intBaseType.getValue()));
		r.setMessage(intBaseType.getDesc());
		return r;
	}

	public ApiResutl message(String message)
	{
		setMessage(message);
		return this;
	}

	public ApiResutl code(Integer code)
	{
		setCode(code);
		return this;
	}

	public Boolean getSuccess()
	{
		return success;
	}

	public Integer getCode()
	{
		return code;
	}

	public String getMessage()
	{
		return message;
	}

	public Object getData()
	{
		return data;
	}

	public void setSuccess(Boolean success)
	{
		this.success = success;
	}

	public void setCode(Integer code)
	{
		this.code = code;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public void setData(Object data)
	{
		this.data = data;
	}

	public boolean equals(Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof ApiResutl))
			return false;
		ApiResutl other = (ApiResutl)o;
		if (!other.canEqual(this))
			return false;
		Object this$success = getSuccess();
		Object other$success = other.getSuccess();
		if (this$success != null ? !this$success.equals(other$success) : other$success != null)
			return false;
		Object this$code = getCode();
		Object other$code = other.getCode();
		if (this$code != null ? !this$code.equals(other$code) : other$code != null)
			return false;
		Object this$message = getMessage();
		Object other$message = other.getMessage();
		if (this$message != null ? !this$message.equals(other$message) : other$message != null)
			return false;
		Object this$data = getData();
		Object other$data = other.getData();
		return this$data != null ? this$data.equals(other$data) : other$data == null;
	}

	protected boolean canEqual(Object other)
	{
		return other instanceof ApiResutl;
	}

	public int hashCode()
	{
		int PRIME = 59;
		int result = 1;
		Object $success = getSuccess();
		result = result * 59 + ($success != null ? $success.hashCode() : 43);
		Object $code = getCode();
		result = result * 59 + ($code != null ? $code.hashCode() : 43);
		Object $message = getMessage();
		result = result * 59 + ($message != null ? $message.hashCode() : 43);
		Object $data = getData();
		result = result * 59 + ($data != null ? $data.hashCode() : 43);
		return result;
	}

	public String toString()
	{
		return (new StringBuilder()).append("ApiResutl(success=").append(getSuccess()).append(", code=").append(getCode()).append(", message=").append(getMessage()).append(", data=").append(getData()).append(")").toString();
	}
}
