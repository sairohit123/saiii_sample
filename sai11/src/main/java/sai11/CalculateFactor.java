package sai11;

public class CalculateFactor {
	
	public static CalculateSalary getCa(String Type, double salary)
	{
		if(Type.equalsIgnoreCase("PARTTIME")) {  
            return new PartTime();  
          }   
      else if(Type.equalsIgnoreCase("FullTime")){  
           return new FullTime();  
       }   
		
		return null;
	}

}
