// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   AppointmentApplyMapper.java

package com.example.sun.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sun.pojo.AppointmentApply;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AppointmentApplyMapper extends BaseMapper<AppointmentApply>
{

     List selectPdfList(String s);

    List selectPdfByYytm(String s);

    List selectPdfUrl(String s, String s1, String s2);
}
