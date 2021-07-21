package br.com.enio.trijava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProgramaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate hoje = LocalDate.now();
		LocalDate niver = LocalDate.parse("2021-07-22", DateTimeFormatter.ISO_LOCAL_DATE);
		
		Integer dias=0;
		if(niver.isBefore(hoje)){
			while(niver.isBefore(hoje)){
				niver=niver.plusDays(1);
				dias++;
			}
			if(dias==1){
				System.out.println("Voce viveu "+dias+" Dia");
			}
			else {
				System.out.println("Voce viveu "+dias+" Dias");
			}
		}
		if(hoje.isBefore(niver)){
			while(hoje.isBefore(niver)){
				hoje=hoje.plusDays(1);
				dias--;
			}
			if(dias==-1){
				System.out.println("Voce viveu "+dias+" Dia");
			}	
			else {
				System.out.println("Voce viveu "+dias+" Dias");
			}
		}
	}
		
}
