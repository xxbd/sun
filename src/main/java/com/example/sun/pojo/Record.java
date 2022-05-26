// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   Record.java

package com.example.sun.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("sun_zzdyjl")
public class Record
{

	private String ybid;
	private Date dyrq;

	public String getYbid()
	{
		return ybid;
	}

	public Date getDyrq()
	{
		return dyrq;
	}

	public void setYbid(String ybid)
	{
		this.ybid = ybid;
	}

	public void setDyrq(Date dyrq)
	{
		this.dyrq = dyrq;
	}

	public boolean equals(Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Record))
			return false;
		Record other = (Record)o;
		if (!other.canEqual(this))
			return false;
		Object this$ybid = getYbid();
		Object other$ybid = other.getYbid();
		if (this$ybid != null ? !this$ybid.equals(other$ybid) : other$ybid != null)
			return false;
		Object this$dyrq = getDyrq();
		Object other$dyrq = other.getDyrq();
		return this$dyrq != null ? this$dyrq.equals(other$dyrq) : other$dyrq == null;
	}

	protected boolean canEqual(Object other)
	{
		return other instanceof Record;
	}

	public int hashCode()
	{
		int PRIME = 59;
		int result = 1;
		Object $ybid = getYbid();
		result = result * 59 + ($ybid != null ? $ybid.hashCode() : 43);
		Object $dyrq = getDyrq();
		result = result * 59 + ($dyrq != null ? $dyrq.hashCode() : 43);
		return result;
	}

	public String toString()
	{
		return (new StringBuilder()).append("Record(ybid=").append(getYbid()).append(", dyrq=").append(getDyrq()).append(")").toString();
	}

	public Record(String ybid, Date dyrq)
	{
		this.ybid = ybid;
		this.dyrq = dyrq;
	}

	public Record()
	{
	}
}
