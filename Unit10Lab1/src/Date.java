/**
 * Date Class for creating Date Objects
 * @author Alexander Loeffler
 * @version 1.0
 */
import javax.swing.*;

public class Date
{
   private int day;
   private int month;
   private int year;
   public Date()
   {
      this(0, 0, 0); 
   } 


   public Date(int day) 
   { 
      this(day, 0, 0);
   } 


   public Date(int day, int month) 
   { 
      this(day, month, 0);
   } 


   public Date(int day, int month, int year) 
   { 
     

      this.day=day;
      this.month=month;
      this.year=year;
   } 

   public Date(Date date)
   {
      this(date.getDay(), date.getMonth(), date.getYear());
   } 
   public int getDay(){
	   return this.day;
   }
   public int getMonth(){
	   return this.month;
   }
   public int getYear(){
	   return this.year;
   }
   public void setDay(int day){
	   this.day=day;
   }
   public void setMonth(int month){
	   this.month=month;
   }
   public void setYear(int year){
	   this.year=year;
   }
   public String returnDate(){
	   return "".concat(Integer.toString(month).concat("/".concat(Integer.toString(day).concat("/".concat(Integer.toString(year))))));
   }
} 