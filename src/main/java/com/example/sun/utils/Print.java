// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   Print.java

package com.example.sun.utils;

import java.awt.print.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import javax.print.*;
import javax.print.attribute.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.*;

public class Print
{

	public Print()
	{
	}

	public static void printFile(String fileUrl, PrintService printService, String jobName)
		throws Exception
	{
		String s = toUtf8String(fileUrl);
		URL url = new URL(s);
		URLConnection conn = url.openConnection();
		InputStream is = conn.getInputStream();
		PDDocument document = PDDocument.load(is);
		PrinterJob job = PrinterJob.getPrinterJob();
		job.setJobName((new StringBuilder()).append("�ļ�_").append(jobName).toString());
		job.setPrintService(printService);
		job.setPageable(new PDFPageable(document));
		Paper paper = new Paper();
		paper.setSize(595D, 842D);
		paper.setImageableArea(0.0D, 0.0D, paper.getWidth(), paper.getHeight());
		PageFormat pageFormat = new PageFormat();
		pageFormat.setPaper(paper);
		Book book = new Book();
		book.append(new PDFPrintable(document, Scaling.SCALE_TO_FIT), pageFormat, 1);
		job.setPageable(book);
		job.print();
		document.close();
	}


	public static PrintService specifyPrinter(String printerName)
	{
		DocFlavor psInFormat = javax.print.DocFlavor.INPUT_STREAM.AUTOSENSE;
		HashPrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
		PrintService printService[] = PrintServiceLookup.lookupPrintServices(psInFormat, pras);
		PrintService myPrinter = null;
		PrintService aprintservice[] = printService;
		int i = aprintservice.length;
		int j = 0;
		do
		{
			if (j >= i)
				break;
			PrintService printService2 = aprintservice[j];
			String svcName = printService2.toString();
			if (svcName.contains(printerName))
			{
				myPrinter = printService2;
				break;
			}
			j++;
		} while (true);
		if (myPrinter == null)
			myPrinter = PrintServiceLookup.lookupDefaultPrintService();
		return myPrinter;
	}

	public static String toUtf8String(String s)
	{
		StringBuffer sb = new StringBuffer();
label0:
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if (c >= 0 && c <= '\377')
			{
				sb.append(c);
				continue;
			}
			byte b[];
			try
			{
				b = String.valueOf(c).getBytes("utf-8");
			}
			catch (Exception ex)
			{
				System.out.println(ex);
				b = new byte[0];
			}
			int j = 0;
			do
			{
				if (j >= b.length)
					continue label0;
				int k = b[j];
				if (k < 0)
					k += 256;
				sb.append((new StringBuilder()).append("%").append(Integer.toHexString(k).toUpperCase()).toString());
				j++;
			} while (true);
		}

		return sb.toString();
	}
}
