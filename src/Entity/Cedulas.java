package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cedulas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeCedula;
	
	private String anversoCedula;
	
	private String reversoCedula;
	
	private String seriesCedula;
	
	@ManyToOne
	private Chancelas chancela;
	@ManyToOne
	private Chancelas chancela2;

	public Integer getId() {
		return id;
	}

	public void setId(Integer idCedula) {
		this.id = idCedula;
	}

	public String getNomeCedula() {
		return nomeCedula;
	}

	public void setNomeCedula(String nomeCedula) {
		this.nomeCedula = nomeCedula;
	}

	public String getAnversoCedula() {
		return anversoCedula;
	}

	public void setAnversoCedula(String anversoCedula) {
		this.anversoCedula = anversoCedula;
	}

	public String getReversoCedula() {
		return reversoCedula;
	}

	public void setReversoCedula(String reversoCedula) {
		this.reversoCedula = reversoCedula;
	}

	public String getSeriesCedula() {
		return seriesCedula;
	}

	public void setSeriesCedula(String seriesCedula) {
		this.seriesCedula = seriesCedula;
	}

	public Chancelas getChancela() {
		return chancela;
	}

	public void setChancela(Chancelas chancela) {
		this.chancela = chancela;
	}
	public Chancelas getChancela2() {
		return chancela2;
	}

	public void setChancela2(Chancelas chancela2) {
		this.chancela2 = chancela2;
	}
	public Cedulas(Integer id, String nomeCedula, String anversoCedula, String reversoCedula, String seriesCedula,
			Chancelas chancela, Chancelas chancela2) {
		this.id = id;
		this.nomeCedula = nomeCedula;
		this.anversoCedula = anversoCedula;
		this.reversoCedula = reversoCedula;
		this.seriesCedula = seriesCedula;
		this.chancela = chancela;
		this.chancela2 = chancela2;
	}
	
	
	public Cedulas() {
	}

	@Override
	public String toString() {
		return "Cedulas [id=" + id + ", nomeCedula=" + nomeCedula + "\nanversoCedula=" + anversoCedula
				+ "\nreversoCedula=" + reversoCedula + "\nseriesCedula=" + seriesCedula + "\nchancela=" + chancela
				+ "\nchancela2=" + chancela2 + "]";
	}

	
}
