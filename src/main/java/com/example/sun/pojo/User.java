// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   User.java

package com.example.sun.pojo;


public class User
{

	private String name;
	private String phone;

	public String getName()
	{
		return name;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public boolean equals(Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof User))
			return false;
		User other = (User)o;
		if (!other.canEqual(this))
			return false;
		Object this$name = getName();
		Object other$name = other.getName();
		if (this$name != null ? !this$name.equals(other$name) : other$name != null)
			return false;
		Object this$phone = getPhone();
		Object other$phone = other.getPhone();
		return this$phone != null ? this$phone.equals(other$phone) : other$phone == null;
	}

	protected boolean canEqual(Object other)
	{
		return other instanceof User;
	}

	public int hashCode()
	{
		int PRIME = 59;
		int result = 1;
		Object $name = getName();
		result = result * 59 + ($name != null ? $name.hashCode() : 43);
		Object $phone = getPhone();
		result = result * 59 + ($phone != null ? $phone.hashCode() : 43);
		return result;
	}

	public String toString()
	{
		return (new StringBuilder()).append("User(name=").append(getName()).append(", phone=").append(getPhone()).append(")").toString();
	}

	public User(String name, String phone)
	{
		this.name = name;
		this.phone = phone;
	}

	public User()
	{
	}
}
