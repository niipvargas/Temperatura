package temperatura;

import java.util.Scanner;


public class Temperatura {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
	double Celsius, Fahrenheit, kelvin;  
		
	System.out.print("Digite a temperatura em Celsius: ");
	Celsius = entrada.nextDouble();
		
            Fahrenheit =  Celsius * 1.8 + 32;

        double Kelvin = Celsius + 273.15;

	System.out.print("\n A medida convertida em é Fahrenheit " + Fahrenheit + "ºF\n");
	System.out.print("\n A medida convertida em Kelvin " + Kelvin + "ºK\n");
	}

}
    

