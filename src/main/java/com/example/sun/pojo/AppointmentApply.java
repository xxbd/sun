// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   AppointmentApply.java

package com.example.sun.pojo;


public class AppointmentApply
{

	private String ybid;
	private String seqNo;
	private String yqdh;
	private String ybbh;
	private String url;

	public String getYbid()
	{
		return ybid;
	}

	public String getSeqNo()
	{
		return seqNo;
	}

	public String getYqdh()
	{
		return yqdh;
	}

	public String getYbbh()
	{
		return ybbh;
	}

	public String getUrl()
	{
		return url;
	}

	public void setYbid(String ybid)
	{
		this.ybid = ybid;
	}

	public void setSeqNo(String seqNo)
	{
		this.seqNo = seqNo;
	}

	public void setYqdh(String yqdh)
	{
		this.yqdh = yqdh;
	}

	public void setYbbh(String ybbh)
	{
		this.ybbh = ybbh;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public boolean equals(Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof AppointmentApply))
			return false;
		AppointmentApply other = (AppointmentApply)o;
		if (!other.canEqual(this))
			return false;
		Object this$ybid = getYbid();
		Object other$ybid = other.getYbid();
		if (this$ybid != null ? !this$ybid.equals(other$ybid) : other$ybid != null)
			return false;
		Object this$seqNo = getSeqNo();
		Object other$seqNo = other.getSeqNo();
		if (this$seqNo != null ? !this$seqNo.equals(other$seqNo) : other$seqNo != null)
			return false;
		Object this$yqdh = getYqdh();
		Object other$yqdh = other.getYqdh();
		if (this$yqdh != null ? !this$yqdh.equals(other$yqdh) : other$yqdh != null)
			return false;
		Object this$ybbh = getYbbh();
		Object other$ybbh = other.getYbbh();
		if (this$ybbh != null ? !this$ybbh.equals(other$ybbh) : other$ybbh != null)
			return false;
		Object this$url = getUrl();
		Object other$url = other.getUrl();
		return this$url != null ? this$url.equals(other$url) : other$url == null;
	}

	protected boolean canEqual(Object other)
	{
		return other instanceof AppointmentApply;
	}

	public int hashCode()
	{
		int PRIME = 59;
		int result = 1;
		Object $ybid = getYbid();
		result = result * 59 + ($ybid != null ? $ybid.hashCode() : 43);
		Object $seqNo = getSeqNo();
		result = result * 59 + ($seqNo != null ? $seqNo.hashCode() : 43);
		Object $yqdh = getYqdh();
		result = result * 59 + ($yqdh != null ? $yqdh.hashCode() : 43);
		Object $ybbh = getYbbh();
		result = result * 59 + ($ybbh != null ? $ybbh.hashCode() : 43);
		Object $url = getUrl();
		result = result * 59 + ($url != null ? $url.hashCode() : 43);
		return result;
	}

	public String toString()
	{
		return (new StringBuilder()).append("AppointmentApply(ybid=").append(getYbid()).append(", seqNo=").append(getSeqNo()).append(", yqdh=").append(getYqdh()).append(", ybbh=").append(getYbbh()).append(", url=").append(getUrl()).append(")").toString();
	}

	public AppointmentApply(String ybid, String seqNo, String yqdh, String ybbh, String url)
	{
		this.ybid = ybid;
		this.seqNo = seqNo;
		this.yqdh = yqdh;
		this.ybbh = ybbh;
		this.url = url;
	}

	public AppointmentApply()
	{
	}
}
