/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dndpocketknife;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author nox
 * 
 * TODO
 * flash on 20 roll
 */
public class DnDPocketKnife extends JPanel implements ActionListener, ListSelectionListener {

    /**
     * @param args the command line arguments
     */
    private JTextField minField;
    private JTextField maxField;
    private JTextField multiplierField;
    private JComboBox diceSelector;
    private JButton addButton;
    private JButton removeButton;
    private JButton rollButton;
    private DefaultListModel listModel;
    private JList diceBag;
    public DnDPocketKnife(){
        super();
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(640,480));
        //Create diceSelector
        String[] diceTypes = {"d4", "d6", "d8", "d10", "d12", "d20", "custom"};
        diceSelector = new JComboBox(diceTypes);
        diceSelector.setLocation(170, 10);
        diceSelector.setSize(100, 25);
        diceSelector.setSelectedIndex(5);
        diceSelector.addActionListener(this);
        add(diceSelector);
        //Create addButton
        addButton = new JButton("Add");
        addButton.setLocation(170, 40);
        addButton.setSize(100,25);
        addButton.addActionListener(this);
        add(addButton);
        //Create removeButton
        removeButton = new JButton("Remove");
        removeButton.setLocation(170, 75);
        removeButton.setSize(100,25);
        removeButton.addActionListener(this);
        add(removeButton);
        //Create minField
        minField = new JTextField();
        minField.setLocation(170, 110);
        minField.setSize(100,25);
        add(minField);
        //Create maxField
        maxField = new JTextField();
        maxField.setLocation(170, 145);
        maxField.setSize(100,25);
        add(maxField);
        //Create multiplierField
        multiplierField = new JTextField();
        multiplierField.setLocation(170, 170);
        multiplierField.setSize(100,25);
        add(multiplierField);
        //create diceBag
        String[] data = {"one", "two", "three", "four"};
        listModel = new DefaultListModel();
        
        diceBag = new JList(data);
        diceBag.setLocation(100,100);
        diceBag.setSize(50,150);
        diceBag.setLayoutOrientation(JList.VERTICAL);
        diceBag.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        diceBag.addListSelectionListener(this);
        
        add(diceBag);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
            if(source == addButton){
                String diceName = (String)diceSelector.getSelectedItem();
                if(diceName.equals("d20")){
                    
                }
            }
            
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
     public void valueChanged(ListSelectionEvent e) {
        
    }
    public static void main(String[] args) {
        DnDPocketKnife myPanel = new DnDPocketKnife();
        JFrame frame = new JFrame("DnD Pocket Knife"); //create frame to hold our JPanel subclass	
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(myPanel);  //add instance of MyGUI to the frame
        frame.pack(); //resize frame to fit our Jpanel
        //Position frame on center of screen 
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int screenHeight = d.height;
        int screenWidth = d.width;
        frame.setLocation(new Point((screenWidth / 2) - (frame.getWidth() / 2), (screenHeight / 2) - (frame.getHeight() / 2)));
	//show the frame	
        frame.setVisible(true);
    }
}
