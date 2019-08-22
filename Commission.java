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
public class Commission extends Employee
{
    public void Commission()
    {
        Commission c = new Commission();
        c.menu();     
    }
    public void menu()
    {
        int tempex1;
        int tempex2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Please enter the number of sales: ");
        tempex1 = Integer.parseInt(sc.next());
        System.out.println("");
        System.out.println("Please enter the price of each unit: ");
        tempex2 = Integer.parseInt(sc.next());
        
    }
    
}
