package Model;

import java.util.ArrayList;

public class beanSearchTag {
	private String tag;
	Boolean valid;
	ArrayList<String> bookmark=new ArrayList<String>();
	public void setTag(String a)
	{
		tag=','+a+',';
	}
	public String getTag()
	{
		return tag;
	}
	public void setValid(Boolean a)
	{
		valid=a;
	}
	public Boolean getValid()
	{
		return valid;
	}
	public void setBookmark(ArrayList<String> a)
	{
		bookmark=a;
	}
	public ArrayList<String> getBookmark()
	{
		return bookmark;
	}

}
