/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package three1;

/**
 *
 * @author PC
 */
public class CocaCola extends Beverage{

    public CocaCola(String name) {
        super("Coca Cola");
    }

    @Override
    public double cost() {
        return 2.99;
    }
    
    
}
