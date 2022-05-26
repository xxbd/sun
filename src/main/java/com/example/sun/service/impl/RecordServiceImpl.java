// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   RecordServiceImpl.java

package com.example.sun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sun.mapper.AppointmentApplyMapper;
import com.example.sun.mapper.RecordMapper;
import com.example.sun.pojo.AppointmentApply;
import com.example.sun.pojo.Record;
import com.example.sun.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl extends ServiceImpl<RecordMapper, Record> implements RecordService
{
	@Autowired
	private RecordMapper recordMapper;


	@Override
	public Integer selectRecord(String s) {
		return recordMapper.selectRecord(s);
	}

	@Override
	public void insertRecord(Record record) {

		recordMapper.insert(record);
	}
}
