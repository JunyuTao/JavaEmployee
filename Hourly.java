/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl;


/**
 *
 * @author tjy12
 */
public class Hourly extends Employee
{
    @Override
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
}
    
