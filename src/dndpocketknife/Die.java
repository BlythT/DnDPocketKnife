/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dndpocketknife;

/**
 *
 * @author nox
 */
public interface Die {
    public void roll();
    public void setValue(int value);
    public int getValue();
}
