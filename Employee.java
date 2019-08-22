/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author tjy12
 */
public class Employee implements Serializable
{
    private String name;
    public static int counter;
    private int hours;
    private int rate;
    private double overtime,Grosspay,Tax,Netpay,Netpercent;
    
    public Employee()
    {
        name = "James";
        counter++;  
    }
    
    public Employee(String name, int hours, int rate)
    {
        this.name = name;
        this.hours = hours;
        this.rate = rate;
        counter++;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String n)
    {
        name = new String(n);
    }
    
    public void displayEmployee()
    {
        System.out.println("");
        System.out.println("Employee: " + name);
        System.out.println("Hours: " + getHours());
        System.out.println("Rate: " + getRate());
        System.out.println("Overtime at time and a half: " + overtime);
    }
    protected void calcOvertime(double hours,double rate, double overtime)
        {
            if(hours >= 40)
            {
            overtime = (hours - 40) * rate;
            }
            else if(hours < 40)
            {
                overtime = 0;
            }       
        }
        
        public int getHours()
        {
            return hours;
        }
        
        public void setHours(int hours)
        {
            this.hours = hours;
        }
        
        public int getRate()
        {
            return rate;
        }
        
        public void setRate(int rate)
        {
            this.rate = rate;
        }
        
        public void menu()
        {
            Scanner sc = new Scanner(System.in);
            int input;
            do
            {
                System.out.println("");
                System.out.println("1) Calculate Gross Pay ");
                System.out.println("2) Calculate Tax (20%)");
                System.out.println("3) Calculate Net Pay ");
                System.out.println("4) Calculate Net Percent ");
                System.out.println("5) Display Employees ");
                System.out.println("6) Exit ");
                input = Integer.parseInt(sc.next());
                if(input == 1)
                {
                    Grosspay = hours * rate;
                    System.out.println("");
                    System.out.println("Gross Pay: " + Grosspay);
                }
                else if(input == 2)
                {
                    Tax = Grosspay * 0.2;
                    System.out.println("");
                    System.out.println("Tax (20%): " + Tax);
                }
                else if(input == 3)
                {
                    Netpay = Grosspay - Tax;
                    System.out.println("");
                    System.out.println("Net Pay: " + Netpay);
                }
                else if(input == 4)
                {
                    Netpercent = Netpay / Grosspay;
                    System.out.println("");
                    System.out.println("Net Percent: " + Netpercent);
                }
                else if(input == 5)
                {
                    DispayEmployees();
                }
            } while(input != 6);
    
        }
        public void DispayEmployees()
        { 
            System.out.println("");
               System.out.println("Gross Pay: " + Grosspay);
               System.out.println("Tax (20%): " + Tax);
               System.out.println("Net Pay: " + Netpay);
               System.out.println("Net Percent: " + Netpercent);
        }
        
}
   

