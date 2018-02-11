package com.ssmm.controller;


import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssmm.model.lxcUser;
import com.ssmm.service.HandleDateService;
import com.ssmm.util.MutiStyleExcelWrite;



@Controller
public class HandleDateController {

	
	@Autowired
	private HandleDateService  handleDateService;
	
	@RequestMapping(value="/allnumber"  )
	@ResponseBody
	public String getAllNumber(@RequestParam String time,HttpServletResponse Response){
		Response.setHeader("Access-Control-Allow-Origin", "*");

                 String date =time+ " 23:59:59";
                 System.out.println(date);
			
		return handleDateService.selectALLNumber(date).toString();
			
	}
	
	
	
	@RequestMapping(value="/addnumber"  )
	@ResponseBody
	public String getAddNumber(@RequestParam String Uptime,@RequestParam String Dntime,HttpServletResponse Response){
		Response.setHeader("Access-Control-Allow-Origin", "*");
		String Update = Uptime+" 00:00:00";
		String Dndate=Dntime+" 23:59:59";
		return handleDateService.selectAddNumber(Update, Dndate).toString();
			
	}
	

	@RequestMapping(value="/detail"  )
	@ResponseBody
	public String getAddNumber(@RequestParam String time,HttpServletResponse response){
		response.setHeader("Access-Control-Allow-Origin", "*");
		String date = time+" 23:59:59";
		try {
				
			@SuppressWarnings("unchecked")
			List<lxcUser> selectDetail = handleDateService.selectDetail(date);
			
			
			 System.out.println(">>>>>>>>>>>"+selectDetail.get(0).getPhonenumber());
			if(selectDetail!=null&&selectDetail.size()>0){
				// 设置response参数，可以打开下载页面
				response.reset();
				response.setContentType("APPLICATION/msexcel;charset=utf-8");
				response.setHeader("Content-Disposition",
						"attachment;filename=" + new String("家长注册用户明细".getBytes(),"iso-8859-1"));
				ServletOutputStream out = response.getOutputStream();	
				new MutiStyleExcelWrite().createExcel(out,selectDetail);
				
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "1";
			
	}
	
	
}
