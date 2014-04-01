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

public class controllerSetAndFindData extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		JSONObject obj = new JSONObject();
		JSONArray obj1 = new JSONArray();
		String data=request.getParameter("data");
		int index=0;
		if(data.contains(","))
		{
			index=data.indexOf(',');
			String bookmark=data.substring(0,index);
			String tag=data.substring(index);
			Model.beanSetData bean=new Model.beanSetData();
			bean.setTag(tag);
			bean.setBookmark(bookmark);
			Model.daoSetData dao=new Model.daoSetData();
			bean=dao.insert(bean);
			if(bean.getValid())
				obj.put("response", "success");
			else
				obj.put("response", "error");
		}
		else
		{
			Model.beanSearchTag bean1=new Model.beanSearchTag();
			bean1.setTag(data);
			Model.daoSearchTag dao=new Model.daoSearchTag();
			bean1=dao.search(bean1);
			if(bean1.getValid())
			{
			ArrayList<String> bookmark = new ArrayList<String>();
			bookmark=bean1.getBookmark();
			System.out.println("Data retrieved");
			obj.put("response", "success");
			for(int i=0;i<bookmark.size();i++)
				obj1.add(bookmark.get(i));
			obj.put("bookmark",obj1);
			}
			else
				obj.put("response", "error");
			
		}
	out.print(obj);
	}
	
}
