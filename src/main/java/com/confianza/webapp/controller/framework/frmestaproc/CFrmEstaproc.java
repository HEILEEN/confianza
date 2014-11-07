package com.confianza.webapp.controller.framework.frmestaproc;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
 
import com.confianza.webapp.service.framework.frmestaproc.FrmEstaprocService;
import com.confianza.webapp.repository.framework.frmestaproc.FrmEstaproc;

@Controller
@RequestMapping("/FrmEstaproc")
public class CFrmEstaproc {

	private FrmEstaprocService frmestaprocService;
	
	@Autowired
	public CFrmEstaproc(FrmEstaprocService frmestaprocService) {
		this.frmestaprocService = frmestaprocService;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public FrmEstaproc list(Long id){
		
		return this.frmestaprocService.list(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<FrmEstaproc> listAll(){
	
		return this.frmestaprocService.listAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public FrmEstaproc update(Long id){
		return this.frmestaprocService.update(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public void delete(Long id){
		this.frmestaprocService.delete(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public FrmEstaproc insert(@RequestBody FrmEstaproc frmestaproc){
		return this.frmestaprocService.insert(frmestaproc);
	}
}
