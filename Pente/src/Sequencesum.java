public class Sequencesum{

  public static String showSequence(int value){
	  
       int sum = 0;
	    String theAnswer = "0";
      
	    if (value >=1){
      for (int i = 1; i <= value; i++) {
      theAnswer += "+" + i;
      sum += i;
      }
       return theAnswer += " = " + sum;
    }

if (value == 0){
		 return value + "=0";
     }
	
if(value < 0){
      return value + "<0";
      }
return null;
      
      }
}


