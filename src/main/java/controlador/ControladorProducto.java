package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CrudProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//INSTANCIAR LA ENTIDAD...
		TblProductocl2 tblpro = new TblProductocl2();
		CrudProductoImp crud = new CrudProductoImp(); 
				
				
				
		//**************** REGISTRAR *****************
				
		/*
				
		// AGREGAMOS DATOS NUEVOS PARA EL EMPLEADO
		tblemp.setNombre("Ronaldo Dashell");
		tblemp.setApellido("Quispe Mamani");
		tblemp.setSexo("M");
		tblemp.setEmail("rolando@hotmail.com");
		//CONVERTIMOS A FECHA SQL...
		Date fecha = new Date();
		Date fechasql = new Date(fecha.getTime());
				
		tblemp.setFechanac(fechasql);
		tblemp.setTel("3814950");
		tblemp.setDni("92672902");			
		
		//INVOCAMOS AL METODO REGISTRAR...
		crud.RegistrarEmpleado(tblemp);
				
		*/		
	}

}
