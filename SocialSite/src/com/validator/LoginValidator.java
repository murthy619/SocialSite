package com.validator;



public class LoginValidator
 {
     public static boolean checkUser(String email,String pass)
     {
      boolean st =false;
      try{
    	  if(email.equalsIgnoreCase("shankar") && pass.equals("1234")){
    		  st = true;
    	  }

      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;
  }
}