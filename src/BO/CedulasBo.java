package BO;

import java.util.List;

import DAO.CedulasDao;
import Entity.Cedulas;

public class CedulasBo {
	public String salvar(Cedulas cedulas) throws Exception {

		CedulasDao dao = new CedulasDao();
		try {
			return dao.salvar(cedulas);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public String alterar(Cedulas cedulas) throws Exception {

		CedulasDao dao = new CedulasDao();
		try {
			return dao.alterar(cedulas);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public String deletar(Cedulas cedulas) throws Exception {

		CedulasDao dao = new CedulasDao();
		try {
			return dao.deletar(cedulas);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public List<Cedulas> consultar() throws Exception {

		CedulasDao dao = new CedulasDao();
		try {
			return dao.consultar();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public List<Cedulas> consultarnome() throws Exception {

		CedulasDao dao = new CedulasDao();
		try {
			return dao.consultarnome();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	public List<Cedulas> consultarserie() throws Exception {

		CedulasDao dao = new CedulasDao();
		try {
			return dao.consultarCedula();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
