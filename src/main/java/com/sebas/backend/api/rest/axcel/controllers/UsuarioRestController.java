package com.sebas.backend.api.rest.axcel.controllers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.groupdocs.assembly.JsonDataSource;
import com.sebas.backend.api.rest.axcel.models.entity.Usuario;
import com.sebas.backend.api.rest.axcel.models.services.IUsuarioServices;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRStringUtil;
import net.sf.jasperreports.engine.util.JRValueStringUtils;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {
	
	@Autowired
	private IUsuarioServices iUsuarioServices;
	
	@GetMapping("/usuarios")
	public List<Usuario> index(){		
		return iUsuarioServices.findAll();
	}
//	@GetMapping("/usuarios/{id}")
//	@ResponseStatus(HttpStatus.OK)
//	public Usuario showId(@PathVariable Long id) {
//		return iUsuarioServices.findById(id);
//	}
//	
	@GetMapping("/usuarios/{nombre}")
	@ResponseStatus(HttpStatus.OK)
	public Usuario show(@PathVariable String nombre) {
		return iUsuarioServices.findByNombre(nombre);
	}
	
	@GetMapping("/usuarios/{nombre}/pdf")
	@ResponseStatus(HttpStatus.OK)
	public String showPdf(@PathVariable String nombre) throws Exception, JRException {
		//iUsuarioServices.findByNombre(nombre);
		
		JRBeanCollectionDataSource Jrbean = new JRBeanCollectionDataSource(iUsuarioServices.findByName(nombre));
		JasperReport jas = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/Certificado.jrxml"));
		HashMap<String, Object> map = new  HashMap<>();
		JasperPrint report =JasperFillManager.fillReport(jas, map,Jrbean);
		JasperExportManager.exportReportToPdfFile(report, "certificado.pdf");
		return "generated";
	}
	
	@PostMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario) {
		usuario.setFechaInicio(new Date());		
		return iUsuarioServices.save(usuario);
	}
	
//	@PutMapping("/usuarios/{id}")
//	@ResponseStatus(HttpStatus.CREATED)
//	public Usuario updateId(@RequestBody Usuario usuario, @PathVariable Long id) {
//		Usuario usuarioActual = iUsuarioServices.findById(id);
//		
//		usuarioActual.setArl(usuario.getArl());
//		usuarioActual.setCargo(usuario.getCargo());
//		usuarioActual.setCiudad(usuario.getCiudad());
//		usuarioActual.setContrato(usuario.getContrato());
//		usuarioActual.setCuentaBanco(usuario.getCuentaBanco());
//		usuarioActual.setDireccion(usuario.getDireccion());
//		usuarioActual.setEps(usuario.getEps());
//		usuarioActual.setFechaIngreso(usuario.getFechaIngreso());
//		usuarioActual.setFechaInicio(usuario.getFechaInicio());
//		usuarioActual.setFechaNac(usuario.getFechaNac());
//		usuarioActual.setFechaTermino(usuario.getFechaTermino());
//		usuarioActual.setFondoPensiones(usuario.getFondoPensiones());
//		usuarioActual.setMobiliario(usuario.getMobiliario());
//		usuarioActual.setNombre(usuario.getNombre());
//		usuarioActual.setPagoCredito(usuario.getPagoCredito());
//		usuarioActual.setProyecto(usuario.getProyecto());
//		usuarioActual.setSalario(usuario.getSalario());
//		usuarioActual.setTelefono(usuario.getTelefono());
//		usuarioActual.setTipoContrato(usuario.getTipoContrato());
//		usuarioActual.setTipoCuenta(usuario.getTipoContrato());
//		usuarioActual.setValorCuotaMensual(usuario.getValorCuotaMensual());
//		usuarioActual.setValorTotal(usuario.getValorTotal());
//		
//		return iUsuarioServices.save(usuarioActual);
//	}
	
	@PutMapping("/usuarios/{nombre}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usuario, @PathVariable String nombre) {
		Usuario usuarioActual = iUsuarioServices.findByNombre(nombre);
		
		usuarioActual.setArl(usuario.getArl());
		usuarioActual.setCargo(usuario.getCargo());
		usuarioActual.setCiudad(usuario.getCiudad());
		usuarioActual.setContrato(usuario.getContrato());
		usuarioActual.setCuentaBanco(usuario.getCuentaBanco());
		usuarioActual.setDireccion(usuario.getDireccion());
		usuarioActual.setEps(usuario.getEps());
		usuarioActual.setFechaIngreso(usuario.getFechaIngreso());
		usuarioActual.setFechaInicio(usuario.getFechaInicio());
		usuarioActual.setFechaNac(usuario.getFechaNac());
		usuarioActual.setFechaTermino(usuario.getFechaTermino());
		usuarioActual.setFondoPensiones(usuario.getFondoPensiones());
		usuarioActual.setMobiliario(usuario.getMobiliario());
		usuarioActual.setNombre(usuario.getNombre());
		usuarioActual.setPagoCredito(usuario.getPagoCredito());
		usuarioActual.setProyecto(usuario.getProyecto());
		usuarioActual.setSalario(usuario.getSalario());
		usuarioActual.setTelefono(usuario.getTelefono());
		usuarioActual.setTipoContrato(usuario.getTipoContrato());
		usuarioActual.setTipoCuenta(usuario.getTipoContrato());
		usuarioActual.setValorCuotaMensual(usuario.getValorCuotaMensual());
		usuarioActual.setValorTotal(usuario.getValorTotal());		
		
		return iUsuarioServices.save(usuarioActual);
	}
	
	
	
	
	
	@DeleteMapping("/usuarios/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		iUsuarioServices.delete(id);
		
	}
	
	String jsonFilePath = "dataPath/ManagerData.json";
	String templateFilePath = "templatePath/template.txt";
	String reportFilePath = "reportsPath/reportFromJSON.pdf";	
	
		
	
	

}
