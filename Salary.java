/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl;

import java.util.Scanner;

/**
 *
 * @author tjy12
 */
public class Salary extends Employee
{
    public void salary(double salary)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter if you are a Staff or Executive [S or E]");
            String input = sc.next();
            if(input.equalsIgnoreCase("S"))
            {
                salary = 50000;
            }
            else if(input.equalsIgnoreCase("E"))
            {
                salary = 100000;
            }
            System.out.println("Salary will be" + salary);
                                   
    }
    
}
