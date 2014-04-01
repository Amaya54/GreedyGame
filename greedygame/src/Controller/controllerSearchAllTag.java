package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class controllerSearchAllTag extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		JSONObject obj = new JSONObject();
		String tags1="";	
		
		Model.daoCreateTable ct=new Model.daoCreateTable();
		ct.create();
		Model.beanSearchAllTag bean=new Model.beanSearchAllTag();	
		Model.daoSearchAllTag dao=new Model.daoSearchAllTag();
		bean=dao.search(bean);
		ArrayList<String> tags = new ArrayList<String>();
		tags=bean.getTags();
		ArrayList<String> url = new ArrayList<String>();
		url=bean.getUrl();	
		System.out.println("Data retrieved");
		obj.put("response", "success");
		for(int i=0;i<tags.size();i++)
			tags1=tags1+tags.get(i).substring(1);
	
	
		obj.put("tags",tags1);
		obj.put("url",url);
		out.print(obj);
    }

}
