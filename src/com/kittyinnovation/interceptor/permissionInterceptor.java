package com.kittyinnovation.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class permissionInterceptor implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("permissionInterceptor destory...");
	}

	@Override
	public void init() {
		System.out.println("permissionInterceptor init....");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("开始拦截...");
		Object user=ActionContext.getContext().getSession().get("ses");
		System.out.println(user);
		if(user!=null) return invocation.invoke();
		ActionContext.getContext().put("message", "你没有访问权限");
		return "message";
	}

}
