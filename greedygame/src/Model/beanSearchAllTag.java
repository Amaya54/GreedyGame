package Model;

import java.util.ArrayList;

public class beanSearchAllTag {
	ArrayList<String> tags=new ArrayList<String>();
	ArrayList<String> url=new ArrayList<String>();
	public void setTags(ArrayList<String> a)
	{
		tags=a;
	}
	public ArrayList<String> getTags()
	{
		return tags;
	}
	public void setUrl(ArrayList<String> a)
	{
		url=a;
	}
	public ArrayList<String> getUrl()
	{
		return url;
	}

}
