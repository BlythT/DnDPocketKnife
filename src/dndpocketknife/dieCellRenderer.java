/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dndpocketknife;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author timbl
 */
public class dieCellRenderer extends DefaultListCellRenderer {
    public dieCellRenderer(){
        setOpaque(true); //Set opaque to improve text visibility and allow for changes when selected
    }
    
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        //Use the default colours of the list to determine colours when selected/unselected
        if (value instanceof Die) {
            Die die = (Die)value;
            setText(die.getName());
        }
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } 
        else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        return this;
    }
}
