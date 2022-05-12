// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   IntBaseTypeSort.java
package com.example.sun.utils.base;

import java.security.InvalidParameterException;
import java.util.*;

// Referenced classes of package com.example.sun.utils.base:
//			IntBaseType

public interface IntBaseTypeSort
	extends IntBaseType
{

	public static Map getAllBySort(Class clazz)
	{
		if (!clazz.isEnum())
			throw new InvalidParameterException();
		List sorts = enumSort(clazz);
		Map sortMap = new LinkedHashMap();
		IntBaseTypeSort i;
		for (Iterator iterator = sorts.iterator(); iterator.hasNext(); sortMap.put(i.getDesc(), Integer.valueOf(i.getValue())))
			i = (IntBaseTypeSort)iterator.next();

		return sortMap;
	}

	public static List enumSort(Class clazz)
	{
		List sortList = Arrays.asList((IntBaseTypeSort[])(IntBaseTypeSort[])clazz.getEnumConstants());
		Collections.sort(sortList, new Comparator() {

			public int compare(IntBaseTypeSort o1, IntBaseTypeSort o2)
			{
				return Integer.valueOf(o1.getSort()).compareTo(Integer.valueOf(o2.getSort()));
			}

			public int compare(Object obj, Object obj1)
			{
				return compare((IntBaseTypeSort)obj, (IntBaseTypeSort)obj1);
			}

		});
		return sortList;
	}

	public abstract int getValue();

	public abstract String getDesc();

	public abstract int getSort();
}
