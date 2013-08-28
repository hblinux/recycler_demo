package com.taobao.recycle.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.taobao.recycle.Verification;
import com.taobao.recycle.domain.RecycleOptions;
import com.taobao.recycle.domain.RecyclePrice;

/**
 * @author �Ͻ�
 */
public class TaobaoRecycleServlet extends HttpServlet{

	private String token = "����ģʽ����ʱ����д��token";
	
	private static final long serialVersionUID = -784730556451422870L;

	private boolean isTaobaoRequest(HttpServletRequest request){
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String recycle_num = request.getParameter("recycle_num");
		return Verification.verify(signature, token,timestamp,recycle_num);
	}
	
	private RecyclePrice calculatePrice(RecycleOptions recycleOptions){
		//�˴�ʡ��һ����
		//........
		return new RecyclePrice();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if(isTaobaoRequest(request)){
			String recycle_str = request.getParameter("recycle_str");
			PrintWriter out = response.getWriter();
			out.print(recycle_str);
			out.close();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if(isTaobaoRequest(request)){
			RecycleOptions recycleOptions = JSON.parseObject(request.getReader().toString(), RecycleOptions.class);
			
			RecyclePrice recyclePrice =  calculatePrice(recycleOptions);
			
			String rs = JSON.toJSONString(recyclePrice);
			
			PrintWriter out = response.getWriter();
			out.print(rs);
			out.close();
		}
	}

}
