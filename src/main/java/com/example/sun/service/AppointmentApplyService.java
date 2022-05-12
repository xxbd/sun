// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   AppointmentApplyService.java

package com.example.sun.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.sun.pojo.AppointmentApply;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppointmentApplyService extends IService<AppointmentApply>
{

    List selectPdf(String s);

	List selectPdfByYytm(String s);

	List selectPdfUrl(String s, String s1, String s2);
}
