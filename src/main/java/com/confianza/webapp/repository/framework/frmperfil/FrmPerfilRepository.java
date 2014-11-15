package com.confianza.webapp.repository.framework.frmperfil;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		framework  
  */                          

import java.util.List;

public interface FrmPerfilRepository {
	
	public FrmPerfil list(Long id);
	
	public FrmPerfil update(Long id);
	
	public void delete(Long id);
	
	public FrmPerfil insert(FrmPerfil frmperfil);

	List<FrmPerfil> listAll(int init, int limit);

	int getCount();
}
