// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   IType.java

package com.example.sun.utils.base;

import java.util.Map;

// Referenced classes of package com.example.sun.utils.base:
//			StringBaseType, IntBaseType, IntBaseTypeSort

public interface IType
{

	public static Object get(String type, Class clazz)
	{
		return StringBaseType.get(type.trim(), clazz);
	}

	public static Object get(int type, Class clazz)
	{
		return IntBaseType.get(type, clazz);
	}

	public static Map getAll(Class clazz)
	{
		return IntBaseType.getAll(clazz);
	}

	public static Map getAllBySort(Class clazz)
	{
		return IntBaseTypeSort.getAllBySort(clazz);
	}

	public static boolean contains(String type, Class clazz)
	{
		return StringBaseType.contains(type.trim(), clazz);
	}

	public static boolean contains(int type, Class clazz)
	{
		return IntBaseType.contains(type, clazz);
	}
}
