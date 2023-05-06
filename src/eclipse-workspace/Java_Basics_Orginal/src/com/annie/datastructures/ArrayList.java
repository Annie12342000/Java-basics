package com.annie.datastructures;

public class ArrayList {
	
	private Object [] a = new Object [5];
	private int pos=0;
	public void add(Object e) {
		if(pos>=a.length)
			increase();
		a[pos++]=e;
		
	}
	
	void increase()
	{
		Object [] temp = new Object [a.length +3];
				for(int i = 0;i<a.length;i++)
				{
					temp[i] = a[i];
					
				}
		a = temp;
		
	}
    
	public int size() {
		return pos;
	}
	
	public  Object get(int index) {
	if(index<=-1||index>=size())
	
	throw new IndexOutOfBoundsException();
	
	return a[index];
    }
	
	public void add(int index,Object e) {     //if we need to add new element in between
		if(index<=-1||index>=size())
		{
			throw new IndexOutOfBoundsException();
			
		}
		
		if(pos>=a.length)
			increase();
		for(int i= size()-1;i>=index;i--)
		{
			a[i+1] = a[i];
		}
			a[index] = e;
			pos++;
		}
	
      public void remove(int index) {          //if we need to remove element in between
    	  if(index<=-1||index>=size())
    	  
    	  throw new IndexOutOfBoundsException();
    	  
	 
    	  for(int i=index+1;i<size();i++)
    	  {
    		  a[i-1]=a[i];
    		  
    	  }
    	  
    	  pos--;
    	  a[pos]=null;
	}
      public void clear()
      {
    	  a = new Object[5];
    	  pos = 0;
    	  
      }
      
    public String toString() {
    	  if(size()==0)return "[]";
    	  String s = "[" +a[0];
    	  for(int i=1;i<size();i++)
    	  {
    		  s += "," +a[i];
    		  
    	  }
    	  
    	  s += "]";
    	  
      
    return s;
}

     
}
     
     


