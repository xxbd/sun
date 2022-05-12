// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   RecordService.java

package com.example.sun.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.sun.pojo.Record;
import org.springframework.stereotype.Service;

@Service
public interface RecordService extends IService<Record>
{

   Integer selectRecord(String s);

   void insertRecord(Record record);
}
