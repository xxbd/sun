// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   RecordMapper.java

package com.example.sun.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sun.pojo.Record;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface RecordMapper  extends BaseMapper<Record>
{

  public abstract Integer selectRecord(String s);
}
