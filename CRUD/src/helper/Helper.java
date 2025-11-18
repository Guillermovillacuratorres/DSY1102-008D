/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import javax.swing.JOptionPane;

/**
 *
 * @author Cetecom
 */
public class Helper {

    public Helper() {
    }
    
    
    
    public void showError(String msg){
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void showWarning(String msg){
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.WARNING_MESSAGE);
    }
        
    public void showInformation(String msg){
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    
}
