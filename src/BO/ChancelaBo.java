package BO;

import java.util.List;

import DAO.ChancelasDao;
import Entity.Chancelas;

public class ChancelaBo {
	public String salvar(Chancelas chancela) throws Exception {

		ChancelasDao dao = new ChancelasDao();
		try {
			return dao.salvar(chancela);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public String alterar(Chancelas chancela) throws Exception {

		ChancelasDao dao = new ChancelasDao();
		try {
			return dao.alterar(chancela);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public String deletar(Chancelas chancela) throws Exception {

		ChancelasDao dao = new ChancelasDao();
		try {
			return dao.deletar(chancela);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public List<Chancelas> consultar() throws Exception {

		ChancelasDao dao = new ChancelasDao();
		try {
			return dao.consultar();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public List<Chancelas> consultarpornome(Chancelas chancela) throws Exception {

		ChancelasDao dao = new ChancelasDao();
		try {
			return dao.consultarGuido(chancela);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
