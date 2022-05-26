// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   AppointmentApplyCs.java

package com.example.sun.controller;

import com.example.sun.pojo.*;
import com.example.sun.service.AppointmentApplyService;
import com.example.sun.service.RecordService;
import com.example.sun.sys.Constast;
import com.example.sun.sys.ResultObj;
import com.example.sun.utils.Print;
import java.util.*;
import javax.print.PrintService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/appoint")
@CrossOrigin
public class AppointmentApplyCs
{

	@Autowired
	private AppointmentApplyService appointmentApplyService;
	@Autowired
	private RecordService recordService;

	@PostMapping("pdfSelect")
	public ResultObj pdfSelect(@RequestBody AppointmentApply apply)
	{
		System.out.println(apply.getYbid());
		List<AppointmentApply> list = appointmentApplyService.selectPdf(apply.getYbid());
		if (list != null && list.size() == 0){
			list = appointmentApplyService.selectPdfByYytm(apply.getYbid());
		}
		if (list != null && list.size() == 0){
			list = appointmentApplyService.selectPdfBySfzh(apply.getYbid());
		}
		if(list==null){
			return new ResultObj(Constast.ERROR, "未查询到记录", "");
		}


		if (list != null && list.size() > 0)
		{
			Integer count = recordService.selectRecord(apply.getYbid());
			if (count.intValue() > 3)
				return new ResultObj(Constast.ERROR, "查询次数过多", "");
			Record record = new Record();
			record.setDyrq(new Date());
			record.setYbid(apply.getYbid());
			recordService.insertRecord(record);
		}
		return new ResultObj(Constast.OK, "查询成功", list);
	}
	@PostMapping("pdfPrint")
	public ResultObj pdfPrint(List appointmentApplies)
	{
		if (appointmentApplies != null && appointmentApplies.size() > 0)
		{
			PrintService printService = Print.specifyPrinter("123");
			Iterator iterator = appointmentApplies.iterator();
			do
			{
				if (!iterator.hasNext())
					break;
				AppointmentApply s = (AppointmentApply)iterator.next();
				try
				{
					Print.printFile(s.getUrl(), printService, s.getYbid());
				}
				catch (Exception e)
				{
					e.printStackTrace();
					return new ResultObj(Constast.ERROR, "打印失败，请联系管理员", "");
				}
			} while (true);
			return new ResultObj(Constast.OK, "打印成功", Integer.valueOf(appointmentApplies.size()));
		} else
		{
			return new ResultObj(Constast.ERROR, "没有可打印报告", "");
		}
	}

	public ModelAndView selectPdf(User user)
	{
		List list = appointmentApplyService.selectPdf(user.getPhone());
		ModelAndView mv = new ModelAndView();
		mv.addObject("newText", (new StringBuilder()).append("���,").append(user.getName()).toString());
		mv.addObject("gender", "1");
		if (list.size() > 0)
		{
			mv.addObject("userList", list);
			mv.addObject("data", ((AppointmentApply)list.get(0)).getUrl());
		} else
		{
			mv.addObject("newText", "未查询到数据");
		}
		mv.setViewName("select.html");
		return mv;
	}

	public ApiResutl selectPdfUrl(String name, String phone, String idCard)
	{
		if (phone == null && idCard == null)
		{
			return ApiResutl.error("请输入身份证与手机号");
		} else
		{
			List list = appointmentApplyService.selectPdfUrl(name, phone, idCard);
			return ApiResutl.ok(list);
		}
	}

	public ModelAndView login()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.html");
		return mv;
	}

	public ModelAndView returnIndex()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.html");
		return mv;
	}
}
