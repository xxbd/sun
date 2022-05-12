// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   IntBaseType.java

package com.example.sun.utils.base;

import java.security.InvalidParameterException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.example.sun.utils.base:
//			IType

public interface IntBaseType
	extends IType
{

	public static Object get(int type, Class clazz)
	{
		if (!clazz.isEnum())
			throw new InvalidParameterException();
		IntBaseType aintbasetype[] = (IntBaseType[])(IntBaseType[])clazz.getEnumConstants();
		int i = aintbasetype.length;
		for (int j = 0; j < i; j++)
		{
			IntBaseType item = aintbasetype[j];
			if (item.getValue() == type)
				return item;
		}

		return null;
	}

	public static Map getAll(Class clazz)
	{
		if (!clazz.isEnum())
			throw new InvalidParameterException();
		Map map = new ConcurrentHashMap();
		IntBaseType aintbasetype[] = (IntBaseType[])(IntBaseType[])clazz.getEnumConstants();
		int i = aintbasetype.length;
		for (int j = 0; j < i; j++)
		{
			IntBaseType item = aintbasetype[j];
			map.put(item.getDesc(), Integer.valueOf(item.getValue()));
		}

		return map;
	}

	public static boolean contains(int type, Class clazz)
	{
		return get(type, clazz) != null;
	}

	public boolean isType(int type);

	public boolean isType(IntBaseType type);

	public abstract int getValue();

	public abstract String getDesc();
}
