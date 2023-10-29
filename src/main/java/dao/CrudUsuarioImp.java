package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import interfaces.Iusuario;
import model.TblUsuariocl2;

public class CrudUsuarioImp implements Iusuario{

	@Override
	public String ValidarUsuario(TblUsuariocl2 tblusu) {		
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("EXAMENCL2");
		EntityManager emanager = conex.createEntityManager();		
		emanager.getTransaction().begin();
				
		// APLICAMOS EL JPQL RELACIONADO CON ENTIDADES...
		Query consulta=emanager.createQuery("SELECT u FROM TblUsuario u where u.usuario=:x and u.password=:y",TblUsuariocl2.class);
		//
		consulta.setParameter("x", tblusu.getUsuariocl2());
		consulta.setParameter("y", tblusu.getPasswordcl2());
		String mensaje="";
		TblUsuariocl2 u;
		try{
			u=(TblUsuariocl2) consulta.getSingleResult();
			mensaje = "existe";
		}	catch(Exception ex){
			u=null;
			mensaje="no existe";
		}
					
		return mensaje;
	}

}
