// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   StringBaseType.java

package com.example.sun.utils.base;

import java.security.InvalidParameterException;

// Referenced classes of package com.example.sun.utils.base:
//			IType

public interface StringBaseType
	extends IType
{

	public static Object get(String type, Class clazz)
	{
		if (!clazz.isEnum())
			throw new InvalidParameterException();
		StringBaseType astringbasetype[] = (StringBaseType[])(StringBaseType[])clazz.getEnumConstants();
		int i = astringbasetype.length;
		for (int j = 0; j < i; j++)
		{
			StringBaseType item = astringbasetype[j];
			if (item.getValue().equals(type))
				return item;
		}

		return null;
	}

	public static boolean contains(String type, Class clazz)
	{
		return get(type, clazz) != null;
	}



	public abstract String getValue();
}
