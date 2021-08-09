package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chancelas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String assinaturaChancela;

	public Integer getId() {
		return id;
	}

	public void setId(Integer idChancela) {
		this.id = idChancela;
	}

	public String getAssinaturaChancela() {
		return assinaturaChancela;
	}

	public void setAssinaturaChancela(String assinaturaChancela) {
		this.assinaturaChancela = assinaturaChancela;
	}
	
	public Chancelas() {
	}

	public Chancelas(Integer idChancela, String assinaturaChancela) {
		this.id = idChancela;
		this.assinaturaChancela = assinaturaChancela;
	}

	@Override
	public String toString() {
		return "Chancela [idChancela=" + id + ", assinaturaChancela=" + assinaturaChancela + "]";
	}
	
	
}
