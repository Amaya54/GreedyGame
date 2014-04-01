package Model;

public class beanSetData {
	private String tag=null,bookmark=null;
	Boolean valid;
	public void setTag(String a)
	{
		tag=a+',';
	}
	public void setBookmark(String a)
	{
		bookmark=a;
	}
	public String getTag()
	{
		return tag;
	}
	public String getBookmark()
	{
		return bookmark;
	}
	
	public void setValid(Boolean a)
	{
		valid=a;
	}
	public Boolean getValid()
	{
		return valid;
	}

}
