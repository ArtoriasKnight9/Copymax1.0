/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filtros;
import javax.swing.*;
import javax.swing.text.*;

/**
 *
 * @author Artorias<maxstell5549@hotmail.com>
 */
public class Numeroseditor extends DefaultCellEditor {
    public Numeroseditor() {
        super(new JTextField());
        JTextField textField = (JTextField) getComponent();
        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new Filtronumeros());
    }
    
    
}
