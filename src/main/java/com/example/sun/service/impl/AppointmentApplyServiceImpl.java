// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   AppointmentApplyServiceImpl.java

package com.example.sun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sun.mapper.AppointmentApplyMapper;
import com.example.sun.pojo.AppointmentApply;
import com.example.sun.service.AppointmentApplyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AppointmentApplyServiceImpl extends ServiceImpl<AppointmentApplyMapper, AppointmentApply>
   implements AppointmentApplyService
{

    @Autowired
    private AppointmentApplyMapper appointmentApplyMapper;



public List selectPdf(String ybid)
	{
		return appointmentApplyMapper.selectPdfList(ybid);
	}

public List selectPdfByYytm(String ybid)
	{
		return appointmentApplyMapper.selectPdfByYytm(ybid);
	}

public List selectPdfUrl(String name, String phone, String idCard)
{
return appointmentApplyMapper.selectPdfUrl(name, phone, idCard);
}
}
