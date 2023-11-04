/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.util.ArrayList;

/**
 * A class that represents a basic pizza
 * @author Deepinder
 */
public class Pizza 
{
    private int bakeTemp;//temp to bake at
    private ArrayList<String> ingredients = new ArrayList();
    public void bake(int temp)
    {
        setBakeTemp(temp);
        //do some baking here, code not implemented yet
        //not necessary for the review
    }
    /**
     *  A method to add toppings to the ingredients
     * list
     * @param topping 
     */
    public void addTopping(String topping)
    {
        getIngredients().add(topping);
    }
    
    public int getBakeTemp()
    {
         return bakeTemp;
    }
    
    public void setBakeTemp(int bakeTemp)
    {
      this.bakeTemp = bakeTemp;
    }
    
    public ArrayList<String> getIngredients()
    {
        return ingredients;
  
    }
    
    public void setIngredients(ArrayList<String>ingredients)
    {
    this.ingredients=ingredients;
    
    }
}

