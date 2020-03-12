/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package on1;

/**
 *
 * @author PC
 */
public class BoxUser {
    public static void main(String[] args) {
        Box<String> fadilBox = new Box<>();
        fadilBox.<Short>inspect((short)32);
        fadilBox.setObject("Fadil  is on the phone");
        fadilBox.inspect(23);
    }
}
