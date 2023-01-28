package com.annie.encapsulatepack;
class S
{
	private int SId;
	private String SName;
	private int SAge;
	private String SGender;
	
	public int getSId()
	{
		return SId;
		
	}
	 
	public void setSId(int SId)
	{
		this.SId = SId;
		
	}

     public String getSName()
     {
    	 return SName;
    	 
     }
     public void setSName(String SName)
     {
    	 this.SName = SName;
    	 
     }
     
     
     public int getSAge()
     {
    	 return SAge;
    	 
     }
     public void setSAge(int SAge)
     {
    	 this.SAge = SAge;
    	 
     }
     
     public String getSGender()
     {
    	 return SGender;
    	 
     }
     public void setSGender(String SGender)
     {
    	 this.SGender = SGender;
    	 
     }
     }
     
public class StudentData {
	public static void main(String[] args) {
		S s = new S();
		s.setSId(18151016);
		System.out.println(s.getSId());
		s.setSName("Ananya padhy");
		System.out.println(s.getSName());
		s.setSAge(22);
		System.out.println(s.getSAge());
		s.setSGender("female");
		System.out.println(s.getSGender());
		
	}

}
