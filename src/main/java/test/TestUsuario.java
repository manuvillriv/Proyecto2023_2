package test;

import dao.CrudUsuarioImp;
import model.TblUsuariocl2;

public class TestUsuario {

	public static void main(String[] args) {		
		TblUsuariocl2 tblusu = new TblUsuariocl2();
		CrudUsuarioImp crud = new CrudUsuarioImp();
		//
		tblusu.setUsuariocl2("admin");
		tblusu.setPasswordcl2("123456");
		//
		//crud.ValidarUsuario(tblusu);
	}

}
