// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   ApiPaging.java

package com.example.sun.pojo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.io.Serializable;
import java.util.List;

public class ApiPaging
	implements Serializable
{

	private int pageNum;
	private int pageSize;
	private int total;
	private Object data;

	private ApiPaging()
	{
		pageNum = 0;
		pageSize = 0;
		total = 0;
	}

	public static ApiPaging build(Object list)
	{
		ApiPaging tLogoPaging = new ApiPaging();
		Page page = (Page)list;
		tLogoPaging.setPageNum((int)page.getCurrent());
		tLogoPaging.setPageSize((int)page.getSize());
		tLogoPaging.setTotal((int)page.getTotal());
		tLogoPaging.setData(page.getRecords());
		return tLogoPaging;
	}

	public static ApiPaging noPagebuild(Object list)
	{
		ApiPaging tLogoPaging = new ApiPaging();
		List nList = (List)list;
		tLogoPaging.setPageNum(1);
		tLogoPaging.setPageSize(1);
		tLogoPaging.setTotal(nList.size());
		tLogoPaging.setData(list);
		return tLogoPaging;
	}

	public int getPageNum()
	{
		return pageNum;
	}

	public int getPageSize()
	{
		return pageSize;
	}

	public int getTotal()
	{
		return total;
	}

	public Object getData()
	{
		return data;
	}

	public void setPageNum(int pageNum)
	{
		this.pageNum = pageNum;
	}

	public void setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
	}

	public void setTotal(int total)
	{
		this.total = total;
	}

	public void setData(Object data)
	{
		this.data = data;
	}

	public boolean equals(Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof ApiPaging))
			return false;
		ApiPaging other = (ApiPaging)o;
		if (!other.canEqual(this))
			return false;
		if (getPageNum() != other.getPageNum())
			return false;
		if (getPageSize() != other.getPageSize())
			return false;
		if (getTotal() != other.getTotal())
			return false;
		Object this$data = getData();
		Object other$data = other.getData();
		return this$data != null ? this$data.equals(other$data) : other$data == null;
	}

	protected boolean canEqual(Object other)
	{
		return other instanceof ApiPaging;
	}

	public int hashCode()
	{
		int PRIME = 59;
		int result = 1;
		result = result * 59 + getPageNum();
		result = result * 59 + getPageSize();
		result = result * 59 + getTotal();
		Object $data = getData();
		result = result * 59 + ($data != null ? $data.hashCode() : 43);
		return result;
	}

	public String toString()
	{
		return (new StringBuilder()).append("ApiPaging(pageNum=").append(getPageNum()).append(", pageSize=").append(getPageSize()).append(", total=").append(getTotal()).append(", data=").append(getData()).append(")").toString();
	}
}
