package es.studium.PosicionMaximo;

import java.util.Scanner;

public class PosicionMaximo {

	public static void main(String[] args)
	{
		Scanner teclado= new Scanner(System.in);
	int maximo;
	
	
	int[]tabla = new int[10];
    
	for(int i=0;i<=9;i++)
	{
		System.out.println("Indique el valor de la tabla en la posicion "+i);
		tabla[i]=teclado.nextInt();
	}
	maximo=tabla[0];
	
	for(int i=0;i<=9;i++)
	{

			 if(tabla[i]>=maximo)
			 {
				  maximo=tabla[i];
					
		     }
	}
	
	System.out.println("El valor del maximo es "+maximo);
	for(int i=0;i<=9;i++)
	{
		if(tabla[i]==maximo)
		{System.out.println(i);
	}
	teclado.close();	
	}
	}
}