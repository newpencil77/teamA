package com.mypt.action.payment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mypt.controller.Action;

public class UserCheckForPaymentAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		
		HttpSession session= request.getSession();
		session.getAttribute("id");
		
		return "callback";
	}

}
