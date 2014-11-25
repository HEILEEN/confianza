package com.confianza.webapp.service.framework.frmtransaccion;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		framework  
  */                          

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.confianza.webapp.repository.framework.frmperfil.FrmPerfil;
import com.confianza.webapp.repository.framework.frmsesion.FrmSesion;
import com.confianza.webapp.repository.framework.frmtransaccion.FrmTransaccion;
import com.confianza.webapp.repository.framework.frmtransaccion.FrmTransaccionRepository;

@Service
@Aspect
public class FrmTransaccionServiceImpl implements FrmTransaccionService{
	
	@Autowired
	private FrmTransaccionRepository frmTransaccionRepository;
		
	/**
	 * @return the frmtransaccionRepository
	 */
	public FrmTransaccionRepository getFrmTransaccionRepository() {
		return frmTransaccionRepository;
	}

	/**
	 * @param frmtransaccionRepository the frmtransaccionRepository to set
	 */
	public void setFrmTransaccionRepository(FrmTransaccionRepository frmtransaccionRepository) {
		this.frmTransaccionRepository = frmtransaccionRepository;
	}
	
	@Override
	public FrmTransaccion list(Long id){
		return frmTransaccionRepository.list(id);
	}
	
	@Override
	public List<FrmTransaccion> listAll(){
		return frmTransaccionRepository.listAll();
	}	
	
	@Override
	public FrmTransaccion update(Long id){
		return frmTransaccionRepository.update(id);
	}
	
	@Override
	public void delete(Long id){
		frmTransaccionRepository.delete(id);
	}
	
	@Override
	public FrmTransaccion insert(FrmTransaccion frmtransaccion){
		return frmTransaccionRepository.insert(frmtransaccion);
	}
	
}
