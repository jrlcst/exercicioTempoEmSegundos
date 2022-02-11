package br.com.nava.tempoemsec;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TempoEmSegundos {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a duração em segundos: ");
	    long segundos = sc.nextLong();
	    
	    String horaminsec = String.format("%02d:%02d:%02d", 
	    TimeUnit.SECONDS.toHours(segundos),
	    TimeUnit.SECONDS.toMinutes(segundos) - 
	    TimeUnit.HOURS.toMinutes(TimeUnit.SECONDS.toHours(segundos)),
	    TimeUnit.SECONDS.toSeconds(segundos) - 
	    TimeUnit.MINUTES.toSeconds(TimeUnit.SECONDS.toMinutes(segundos)));

	    System.out.println("Resultado em hh:mm:ss: " + horaminsec);
	}
}
