// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   ResultCode.java

package com.example.sun.pojo;


public class ResultCode
{

	public static Integer SUCCESS = Integer.valueOf(20000);
	public static Integer ERROR = Integer.valueOf(20001);
	public static Integer LOGIN_NO_BIND = Integer.valueOf(20002);

	public ResultCode()
	{
	}

	public boolean equals(Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof ResultCode))
			return false;
		ResultCode other = (ResultCode)o;
		return other.canEqual(this);
	}

	protected boolean canEqual(Object other)
	{
		return other instanceof ResultCode;
	}

	public int hashCode()
	{
		int result = 1;
		return 1;
	}

	public String toString()
	{
		return "ResultCode()";
	}

}
