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
      if (month < 1 || month >= 12)
         throw new IllegalArgumentException("Month must be 1-12");

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
   public void displayDate(String prefix){
	   JOptionPane.showMessageDialog( null, prefix.concat(Integer.toString(month).concat("/".concat(Integer.toString(day).concat("/".concat(Integer.toString(year)))))));
   }
   public void displayDate(){
	   JOptionPane.showMessageDialog( null, "The Date is ".concat(Integer.toString(month).concat("/".concat(Integer.toString(day).concat("/".concat(Integer.toString(year)))))));
   }
} 