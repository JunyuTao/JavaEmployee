/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tjy12
 */
public class Payroll 
{
            Employee[] myemployees = new Employee[3];
        
    public static void main(String[] args) throws IOException
    {
        Payroll p = new Payroll();
                p.topmenu();
    }
    
    public void topmenu()
    {
        Scanner sc = new Scanner(System.in);
        int input;
        do
        {
            System.out.println("");
            System.out.println("1) Populate Employee ");
            System.out.println("2) Select Employee ");
            System.out.println("3) Save Employees ");
            System.out.println("4) Load Empolyee ");
            System.out.println("5) Exit");
            input = Integer.parseInt(sc.next());
            if(input == 1)
            {
                PopulateEmployee();
            }
            else if(input == 2)
            {
                
            }
            else if(input == 3)
            {
                
            }
            else if(input == 4)
            {
                
            }
        }while(input != 5);
    }
    public void PopulateEmployee()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("0) Hourly");
        System.out.println("1) Salary");
        System.out.println("2) Commission");
        int input = sc.nextInt();
        
        if(input == 0)
        {
            myemployees[0] = new Hourly();
        }
        else if(input == 1)
        {
            myemployees[1] = new Salary();
        }
        else if(input == 2)
        {
            myemployees[2] = new Commission();
        }

        
    }
}
