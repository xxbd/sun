// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   ResultObj.java

package com.example.sun.sys;


// Referenced classes of package com.example.sun.sys:
//			Constast

public class ResultObj
{

	public static final ResultObj LOGIN_SUCCESS;
	public static final ResultObj LOGIN_ERROR_PASS;
	public static final ResultObj LOGIN_ERROR_CODE;
	public static final ResultObj ADD_SUCCESS;
	public static final ResultObj ADD_ERROR;
	public static final ResultObj DELETE_SUCCESS;
	public static final ResultObj DELETE_ERROR;
	public static final ResultObj UPDATE_SUCCESS;
	public static final ResultObj UPDATE_ERROR;
	public static final ResultObj SELECT_ERROR;
	public static final ResultObj RESET_SUCCESS;
	public static final ResultObj RESET_ERROR;
	public static final ResultObj AUTH_SUCCESS;
	public static final ResultObj AUTH_ERROR;
	public static final ResultObj DISPATCH_SUCCESS;
	public static final ResultObj DISPATCH_ERROR;
	public static final ResultObj BACKINPORT_SUCCESS;
	public static final ResultObj BACKINPORT_ERROR;
	public static final ResultObj SYNCCACHE_SUCCESS;
	private Integer code;
	private String msg;
	private Object data;

	public Integer getCode()
	{
		return code;
	}

	public String getMsg()
	{
		return msg;
	}

	public Object getData()
	{
		return data;
	}

	public void setCode(Integer code)
	{
		this.code = code;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

	public void setData(Object data)
	{
		this.data = data;
	}

	public boolean equals(Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof ResultObj))
			return false;
		ResultObj other = (ResultObj)o;
		if (!other.canEqual(this))
			return false;
		Object this$code = getCode();
		Object other$code = other.getCode();
		if (this$code != null ? !this$code.equals(other$code) : other$code != null)
			return false;
		Object this$msg = getMsg();
		Object other$msg = other.getMsg();
		if (this$msg != null ? !this$msg.equals(other$msg) : other$msg != null)
			return false;
		Object this$data = getData();
		Object other$data = other.getData();
		return this$data != null ? this$data.equals(other$data) : other$data == null;
	}

	protected boolean canEqual(Object other)
	{
		return other instanceof ResultObj;
	}

	public int hashCode()
	{
		int PRIME = 59;
		int result = 1;
		Object $code = getCode();
		result = result * 59 + ($code != null ? $code.hashCode() : 43);
		Object $msg = getMsg();
		result = result * 59 + ($msg != null ? $msg.hashCode() : 43);
		Object $data = getData();
		result = result * 59 + ($data != null ? $data.hashCode() : 43);
		return result;
	}

	public String toString()
	{
		return (new StringBuilder()).append("ResultObj(code=").append(getCode()).append(", msg=").append(getMsg()).append(", data=").append(getData()).append(")").toString();
	}

	public ResultObj(Integer code, String msg, Object data)
	{
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public ResultObj()
	{
	}

	static
	{
		LOGIN_SUCCESS = new ResultObj(Constast.OK, "��½�ɹ�", null);
		LOGIN_ERROR_PASS = new ResultObj(Constast.ERROR, "�û������������", null);
		LOGIN_ERROR_CODE = new ResultObj(Constast.ERROR, "��֤�����", null);
		ADD_SUCCESS = new ResultObj(Constast.OK, "ԤԼ�ɹ�", null);
		ADD_ERROR = new ResultObj(Constast.ERROR, "���ʧ��", null);
		DELETE_SUCCESS = new ResultObj(Constast.OK, "ɾ���ɹ�", null);
		DELETE_ERROR = new ResultObj(Constast.ERROR, "ɾ��ʧ��", null);
		UPDATE_SUCCESS = new ResultObj(Constast.OK, "�޸ĳɹ�", null);
		UPDATE_ERROR = new ResultObj(Constast.ERROR, "�޸�ʧ��", null);
		SELECT_ERROR = new ResultObj(Constast.ERROR, "��ѯʧ��", null);
		RESET_SUCCESS = new ResultObj(Constast.OK, "���óɹ�", null);
		RESET_ERROR = new ResultObj(Constast.ERROR, "����ʧ��", null);
		AUTH_SUCCESS = new ResultObj(Constast.OK, "�����ɹ�", null);
		AUTH_ERROR = new ResultObj(Constast.ERROR, "����ʧ��", null);
		DISPATCH_SUCCESS = new ResultObj(Constast.OK, "����ɹ�", null);
		DISPATCH_ERROR = new ResultObj(Constast.ERROR, "����ʧ��", null);
		BACKINPORT_SUCCESS = new ResultObj(Constast.OK, "�˻��ɹ�", null);
		BACKINPORT_ERROR = new ResultObj(Constast.ERROR, "�˻�ʧ��", null);
		SYNCCACHE_SUCCESS = new ResultObj(Constast.OK, "ͬ������ɹ�", null);
	}
}
