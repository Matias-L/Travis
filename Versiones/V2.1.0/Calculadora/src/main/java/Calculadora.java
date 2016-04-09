package main.java;

/* ------------------------------------------------------------------------------
 * Calculadora.java*
 *
 * Autores: Armando Gaspar, 
 * 			Ceballos Matias, 
 * 			Zimmel Ezequiel
 * ------------------------------------------------------------------------------
*/

import javax.swing.JOptionPane;

public class Calculadora {
	
//---------------------------------------MENU--------------------------------------------------------
public static void Menu()
{
	int opcion=0;
	do
	{
	opcion = JOptionPane.showOptionDialog(null,"SELECCIONE OPERACION","MENU",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Suma y Resta","Multiplicación","División","Porcentaje","Salir"},"Salir");
	switch(opcion){
				case 0: SumaResta.sumarrestar();
				break;
				case 1: Multiplicacion.multiplicar();
				break;
				case 2: Division.dividir();
				break;
				case 3: Porcentaje.porcentaje();
				break;
				case 4: JOptionPane.showMessageDialog(null,"Gracias por probar Calculadora");
				break;
				  }
	}while(opcion!=4);
}

public static void main( String args[] )
{ 
   Menu();
   System.exit(0);
} 

}


