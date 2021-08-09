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
			//   Inserção da chancela ‘Guido Manga’,
			ChancelaBo bocha = new ChancelaBo();
			bocha.salvar(cha);
			List<Chancelas> list = bocha.consultar();
			for (Chancelas l : list) {
				System.out.println(l);
			}
			System.out.println("--------------------");
			// Alteração da chancela para Guido Mantega
			cha.setAssinaturaChancela("Guido Mantega (Segunda Chancela)");
			bocha.alterar(cha);
			List<Chancelas> list2 = bocha.consultar();
			for (Chancelas l : list2) {
				System.out.println(l);
			}
			System.out.println("--------------------");
			//Inserção da chancela ‘Alexandre Antônio Tombini’
			Chancelas cha2 = new Chancelas();
			cha2.setAssinaturaChancela("Alexandre Antônio Tombini");
			bocha.salvar(cha2);
			List<Chancelas> list3 = bocha.consultar();
			for (Chancelas l : list3) {
				System.out.println(l);
			}
			System.out.println("--------------------");
			//Inserção da cédula exemplo acima
			Cedulas ced = new Cedulas();
			ced.setNomeCedula("cédula de cem reais");
			ced.setAnversoCedula("Efígie simbólica da República, interpretada sob a forma de escultura");
			ced.setReversoCedula("Gravura de uma garoupa[4] verdadeira (Epinephelus marginatus), peixe marinho da família  dos serranídeos e um dos mais conhecidos dentre os encontrados nas costas brasileiras");
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
			//Inserção da cédula de 50 reais

			Cedulas ced2 = new Cedulas();
			ced2.setNomeCedula("cédula de cinquenta reais");
			ced2.setAnversoCedula("Efígie Simbólica da República, interpretada sob a forma de escultura");
			ced2.setReversoCedula("Figura de uma Onça Pintada (Panthera onca), um belo felídeo de grande porte, ameaçado de extinção, mas ainda encontrado principalmente na Amazônia e no Pantanal Matogrossense. A onça pintada vem perdendo cada vez habitat, dificultando sua sobrevivência");			
			Chancelas c = new Chancelas();
			c.setAssinaturaChancela("Guido Mantega (Segunda Chancela)");
			bocha.salvar(c);
			ced2.setChancela(c);
			Chancelas c2 = new Chancelas();
			c2.setAssinaturaChancela("Alexandre Antônio Tombini");
			ced2.setChancela2(c2);
			bocha.salvar(c2);
			ced2.setSeriesCedula("BB029844001 a BB087840000");
			boced.salvar(ced2);
			List<Cedulas> list5 = boced.consultar();
			for (Cedulas l : list5) {
				System.out.println(l + "\n\n");
			}
			System.out.println("--------------------");
			//Seleção de todas as cédulas ordenando por nome
			List<Cedulas> list6 = boced.consultarnome();
			for (Cedulas l : list6) {
				System.out.println(l+ "\n\n");
			}
			System.out.println("--------------------");
			//  Seleção das cédulas com chancela ‘Guido Mantega’
			List<Chancelas> list7 = bocha.consultarpornome(cha);
			for (Chancelas l : list7) {
				System.out.println(l);
			}	
			System.out.println("--------------------");
			//  Seleção das cédulas que estejam sejam da série AA000000001 
			List<Cedulas> list8 = boced.consultarserie();
			for (Cedulas l : list8) {
				System.out.println(l);
			}	
			
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
