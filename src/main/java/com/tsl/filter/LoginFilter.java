package com.tsl.filter;

import com.tsl.model.Manager;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class LoginFilter implements Filter {
    //不需要过滤的文件类型
    String excludeUrl = ".*\\.css$,.*\\.js$,.*\\.png$,.*\\.jpg$,.*\\.gif$";
    //不需要过滤的路径
    private static String allExcludeUrl;
    //不需要进行过滤的模式集合
    private List<Pattern> excludeList ;
    public void destroy() { }
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        //System.out.println("===========");
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        String url = req.getRequestURI();
        //首先判断是否需要过滤
        if (isUrlExclude(url)){
            chain.doFilter(request, response);
        }else {
            Manager m = (Manager) req.getSession().getAttribute("manager");
            if (m == null){
                res.sendRedirect(req.getServletContext().getContextPath()+"/login.html");
            }else {
                //允许请求通过
                chain.doFilter(request, response);
            }
        }
    }
    public void init(FilterConfig config) throws ServletException {
        //配置文件参数获取
        String s = config.getInitParameter("excludeUrlFromXml");
        allExcludeUrl = excludeUrl;
        if (s!=null && !s.equals("")){
            allExcludeUrl += "," + s;
        }
        excludeList = new ArrayList<Pattern>();
        String[] token = allExcludeUrl.split(",");
        for (String str:token){
            excludeList.add(Pattern.compile(str));
        }
    }
    //判断请求是否过滤,不需要为true，否则false
    private boolean isUrlExclude(String url){
        boolean flag = false;
        //HttpServletRequest req = (HttpServletRequest) request;
        //String url = req.getRequestURI();
        for (Pattern pattern:excludeList){
            //判断url字符串和pattern模式是否匹配，匹配返回true
            flag = pattern.matcher(url).matches();
            if (flag){
               return flag;
           }
        }
        return flag;
    }
}
