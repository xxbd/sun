/*
// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   IntBaseTypeSort.java

package com.example.sun.utils.base;

import java.util.Comparator;

// Referenced classes of package com.example.sun.utils.base:
//			IntBaseTypeSort

public static class IntBaseTypeSort$1
	implements Comparator
{

	public int compare(IntBaseTypeSort o1, IntBaseTypeSort o2)
	{
		return Integer.valueOf(o1.getSort()).compareTo(Integer.valueOf(o2.getSort()));
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((IntBaseTypeSort)obj, (IntBaseTypeSort)obj1);
	}

	IntBaseTypeSort$1()
	{
	}
}
*/
