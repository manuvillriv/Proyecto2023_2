package test;

import java.util.List;

import dao.CrudProductoImp;
import model.TblProductocl2;

public class TestProducto {

	public static void main(String[] args) {
		TblProductocl2 tblpro = new TblProductocl2();
		CrudProductoImp crud = new CrudProductoImp();
		
		//Registrar
		
		tblpro.setNombrecl2("Arroz");
		tblpro.setPrecioventacl2(5.00);
		tblpro.setPreciocompcl2(7.50);
		tblpro.setEstadocl2("Vigente");
		tblpro.setDescripcl2("Coste�o");
		
		crud.RegistrarProducto(tblpro);
		
		//Listar
//		List<TblProductocl2> listar = crud.ListadoProducto();
//		  for(TblProductocl2 lista:listar) {
//			  System.out.print("\n" + 
//                      "Codigo : " + lista.getIdproductocl2() + "\n" + 
//					   "Nombre : " + lista.getNombrecl2() + "\n" + 
//                       "Precio Venta : " + lista.getPrecioventacl2() + "\n" +
//					   "Precio Compra : " + lista.getPreciocompcl2() + "\n" +
//                       "Estado : " + lista.getEstadocl2() + "\n" +
//					   "Descripcion : " + lista.getDescripcl2() + "\n" + "\n");
//		  };

	}

}
