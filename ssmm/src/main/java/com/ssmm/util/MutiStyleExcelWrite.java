package com.ssmm.util;
	import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import jxl.Workbook;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import com.ssmm.model.lxcUser;

	public class MutiStyleExcelWrite {
	    public void createExcel(OutputStream os,List<lxcUser> list) throws WriteException,IOException {
	        //创建工作薄
	        WritableWorkbook workbook = Workbook.createWorkbook(os);
	        //创建新的一页
	        WritableSheet sheet = workbook.createSheet("First Sheet", 0);
	        //构造表头
	        sheet.mergeCells(0, 0, 4, 0);//添加合并单元格，第一个参数是起始列，第二个参数是起始行，第三个参数是终止列，第四个参数是终止行
	        WritableFont bold = new WritableFont(WritableFont.ARIAL,10,WritableFont.BOLD);//设置字体种类和黑体显示,字体为Arial,字号大小为10,采用黑体显示
	        WritableCellFormat titleFormate = new WritableCellFormat(bold);//生成一个单元格样式控制对象
	        titleFormate.setAlignment(jxl.format.Alignment.CENTRE);//单元格中的内容水平方向居中
	        titleFormate.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);//单元格的内容垂直方向居中
	        Label title = new Label(0,0,"家长注册用户明细",titleFormate);
	        sheet.setRowView(0, 600, false);//设置第一行的高度
	        sheet.addCell(title);
	        
	        //创建要显示的具体内容
	        WritableFont color = new WritableFont(WritableFont.ARIAL);//选择字体
	        color.setColour(Colour.GOLD);//设置字体颜色为金黄色
	        WritableCellFormat colorFormat = new WritableCellFormat(color);

	       //设置副标题栏，单独写了个
	        String[] negativeTitle = { "ID", "role", "phonenumber", "activetime"};
	        for (int i = 0; i < negativeTitle.length; i++) {  
	            Label lable = new Label(i, 1, negativeTitle[i],colorFormat);  
	            sheet.addCell(lable);  
	        }  
	        //把数据写入
	        for (int i = 0; i < list.size(); i++) {  

	        	Number id = new Number(0,i+2,list.get(i).getId());
	        	sheet.addCell(id); 
	        	
	        	Number role = new Number(1,i+2,list.get(i).getRole());
	        	sheet.addCell(role);
	        	
	        	Label getPhonenumber = new Label(2, i+2, list.get(i).getPhonenumber());  
	        		sheet.addCell(getPhonenumber);
	        		
	        	 Label Activetime = new Label(3, i+2, list.get(i).getActivetime());	
	        	 sheet.addCell(Activetime);
	        }  

	        //把创建的内容写入到输出流中，并关闭输出流
	        workbook.write();
	        workbook.close();
	        os.close();
	        
	    }

		
	
}
