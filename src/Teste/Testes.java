package Teste;

import java.util.List;

import BO.CedulasBo;
import BO.ChancelaBo;
import Entity.Cedulas;
import Entity.Chancelas;

public class Testes {

	public static void main(String[] args) {

		Chancelas cha = new Chancelas();
		cha.setAssinaturaChancela("Guido Manga");
		
		try {
			//   Inser��o da chancela �Guido Manga�,
			ChancelaBo bocha = new ChancelaBo();
			bocha.salvar(cha);
			List<Chancelas> list = bocha.consultar();
			for (Chancelas l : list) {
				System.out.println(l);
			}
			System.out.println("--------------------");
			// Altera��o da chancela para Guido Mantega
			cha.setAssinaturaChancela("Guido Mantega (Segunda Chancela)");
			bocha.alterar(cha);
			List<Chancelas> list2 = bocha.consultar();
			for (Chancelas l : list2) {
				System.out.println(l);
			}
			System.out.println("--------------------");
			//Inser��o da chancela �Alexandre Ant�nio Tombini�
			Chancelas cha2 = new Chancelas();
			cha2.setAssinaturaChancela("Alexandre Ant�nio Tombini");
			bocha.salvar(cha2);
			List<Chancelas> list3 = bocha.consultar();
			for (Chancelas l : list3) {
				System.out.println(l);
			}
			System.out.println("--------------------");
			//Inser��o da c�dula exemplo acima
			Cedulas ced = new Cedulas();
			ced.setNomeCedula("c�dula de cem reais");
			ced.setAnversoCedula("Ef�gie simb�lica da Rep�blica, interpretada sob a forma de escultura");
			ced.setReversoCedula("Gravura de uma garoupa[4] verdadeira (Epinephelus marginatus), peixe marinho da fam�lia  dos serran�deos e um dos mais conhecidos dentre os encontrados nas costas brasileiras");
			ced.setChancela(cha);
			ced.setChancela2(cha2);
			ced.setSeriesCedula("AA000000001 a AA074400000");
			CedulasBo boced = new CedulasBo();
			boced.salvar(ced);
			List<Cedulas> list4 = boced.consultar();
			for (Cedulas l : list4) {
				System.out.println(l);
			}
			System.out.println("--------------------");
			//Inser��o da c�dula de 50 reais

			Cedulas ced2 = new Cedulas();
			ced2.setNomeCedula("c�dula de cinquenta reais");
			ced2.setAnversoCedula("Ef�gie Simb�lica da Rep�blica, interpretada sob a forma de escultura");
			ced2.setReversoCedula("Figura de uma On�a Pintada (Panthera onca), um belo fel�deo de grande porte, amea�ado de extin��o, mas ainda encontrado principalmente na Amaz�nia e no Pantanal Matogrossense. A on�a pintada vem perdendo cada vez habitat, dificultando sua sobreviv�ncia");			
			Chancelas c = new Chancelas();
			c.setAssinaturaChancela("Guido Mantega (Segunda Chancela)");
			bocha.salvar(c);
			ced2.setChancela(c);
			Chancelas c2 = new Chancelas();
			c2.setAssinaturaChancela("Alexandre Ant�nio Tombini");
			ced2.setChancela2(c2);
			bocha.salvar(c2);
			ced2.setSeriesCedula("BB029844001 a BB087840000");
			boced.salvar(ced2);
			List<Cedulas> list5 = boced.consultar();
			for (Cedulas l : list5) {
				System.out.println(l + "\n\n");
			}
			System.out.println("--------------------");
			//Sele��o de todas as c�dulas ordenando por nome
			List<Cedulas> list6 = boced.consultarnome();
			for (Cedulas l : list6) {
				System.out.println(l+ "\n\n");
			}
			System.out.println("--------------------");
			//  Sele��o das c�dulas com chancela �Guido Mantega�
			List<Chancelas> list7 = bocha.consultarpornome(cha);
			for (Chancelas l : list7) {
				System.out.println(l);
			}	
			System.out.println("--------------------");
			//  Sele��o das c�dulas que estejam sejam da s�rie AA000000001 
			List<Cedulas> list8 = boced.consultarserie();
			for (Cedulas l : list8) {
				System.out.println(l);
			}	
			
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
