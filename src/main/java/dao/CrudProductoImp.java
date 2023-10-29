package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.Iproducto;
import model.TblProductocl2;

public class CrudProductoImp implements Iproducto{

	@Override
	public void RegistrarProducto(TblProductocl2 tblpro) {
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("EXAMENCL2");		
		EntityManager emanager = conex.createEntityManager();		
		emanager.getTransaction().begin();
				
		System.out.println("Producto registrado en BD");
		emanager.persist(tblpro);		
		emanager.getTransaction().commit();		
		emanager.close();		
	}

	@Override
	public List<TblProductocl2> ListadoProducto() {
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("EXAMENCL2");		
		EntityManager emanager = conex.createEntityManager();		
		emanager.getTransaction().begin();		
		
		List<TblProductocl2> listado = emanager.createQuery("select e from TblEmpleado e", TblProductocl2.class).getResultList();
		
		//CONFIRMAMOS
		emanager.getTransaction().commit();
		//CERRAMOS...
		emanager.close();
				
		return listado;		
	}
}
