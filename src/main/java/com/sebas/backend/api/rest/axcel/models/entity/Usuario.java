package com.sebas.backend.api.rest.axcel.models.entity;
// comentario
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	@Column(name="fecha_nac")
	@Temporal(TemporalType.DATE)
	private Date fechaNac;
	@Column(name="cuenta_banco")
	private String cuentaBanco;
	@Column(name="tipo_cuenta")
	private String tipoCuenta;
	private String eps;
	private String arl;
	@Column(name="fondo_pensiones")
	private String fondoPensiones;
	private String contrato;
	@Column(name="tipo_contrato")
	private String tipoContrato;
	@Column(name="fecha_ingreso")
	@Temporal(TemporalType.DATE)
	private Date fechaIngreso;
	private String ciudad;
	private String telefono;
	private String direccion;
	private String proyecto;
	private String cargo;
	private String salario;
	@Column(name="pago_credito")
	private Integer pagoCredito;	
	private Integer credito;
	private short cuotas;
	@Column(name="fecha_inicio")
	@Temporal(TemporalType.DATE)
	private Date fechaInicio;
	@Column(name="fecha_termino")
	@Temporal(TemporalType.DATE)
	private Date fechaTermino;
	@Column(name="valor_total")
	private Integer valorTotal;
	@Column(name="valor_cuota_mensual")
	private Integer valorCuotaMensual;
	private String mobiliario;
	
	
	
	public Integer getPagoCredito() {
		return pagoCredito;
	}
	public void setPagoCredito(Integer pagoCredito) {
		this.pagoCredito = pagoCredito;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getCuentaBanco() {
		return cuentaBanco;
	}
	public void setCuentaBanco(String cuentaBanco) {
		this.cuentaBanco = cuentaBanco;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public String getEps() {
		return eps;
	}
	public void setEps(String eps) {
		this.eps = eps;
	}
	public String getArl() {
		return arl;
	}
	public void setArl(String arl) {
		this.arl = arl;
	}
	public String getFondoPensiones() {
		return fondoPensiones;
	}
	public void setFondoPensiones(String fondoPensiones) {
		this.fondoPensiones = fondoPensiones;
	}
	public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public Integer getCredito() {
		return credito;
	}
	public void setCredito(Integer credito) {
		this.credito = credito;
	}
	public short getCuotas() {
		return cuotas;
	}
	public void setCuotas(short cuotas) {
		this.cuotas = cuotas;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaTermino() {
		return fechaTermino;
	}
	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}
	public Integer getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Integer valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Integer getValorCuotaMensual() {
		return valorCuotaMensual;
	}
	public void setValorCuotaMensual(Integer valorCuotaMensual) {
		this.valorCuotaMensual = valorCuotaMensual;
	}
	public String getMobiliario() {
		return mobiliario;
	}
	public void setMobiliario(String mobiliario) {
		this.mobiliario = mobiliario;
	}
	
	
	private static final long serialVersionUID = 1L;
}
