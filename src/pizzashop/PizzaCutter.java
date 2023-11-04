/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

/**
 * A class that models a pizza cutter.
 * We only ever want one pizza cutter to 
 * cut the pizzas to ensure consistency.
 * Users can choose how many slices to
 * divide the pizza into.

 * @author deepinder
 */
public class PizzaCutter 
{
    private static PizzaCutter numslices = null;
   // how many pieces to cut the pizza into
    private PizzaCutter()
    {
       
    }
    public static PizzaCutter getInstance()
    {
    if(numslices == null)
    {
    
    numslices = new PizzaCutter();
    }
    return numslices;
    } 
}
