/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import javax.swing.JOptionPane;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
/**
 *
 * @author Jorge
 */
public class OrdenarPalabras {
    private final String[] palabras = new String[10];
    
    public void cargarArray(){
        for(int i=0;i<palabras.length;i++){
            palabras[i]=JOptionPane.showInputDialog("Palabra " + (i+1) + ":");
        }
    }
    
    public void ordenarPalabras(){
        Arrays.sort(palabras);
    }
    
    public void guardarFichero(){
        ordenarPalabras();
        PrintWriter escritor=null;
        try{
            escritor = new PrintWriter(new File("src/boletin21/palabras.txt"));
            for(int i=0;i<palabras.length;i++){
                escritor.println(i+1 + " " + palabras[i]);
            }
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Archivo no encontrado");
        }finally{
            escritor.close();
        }
    }
}
