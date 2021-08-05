package com.taza.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
@Entity
public class r_taza {
@Id
private Integer id;
@Column
private String color;
@Column
private String capacidad;
@Column
private String modelo;
@Column
private String material;
@Column
private String calidad;
@Column
private Integer precio;
@Column
private Integer cantidad;
@Column
private String fecha;
@Column
private String liquidacion;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getCapacidad() {
	return capacidad;
}
public void setCapacidad(String capacidad) {
	this.capacidad = capacidad;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public String getCalidad() {
	return calidad;
}
public void setCalidad(String calidad) {
	this.calidad = calidad;
}
public Integer getPrecio() {
	return precio;
}
public void setPrecio(Integer precio) {
	this.precio = precio;
}
public Integer getCantidad() {
	return cantidad;
}
public void setCantidad(Integer cantidad) {
	this.cantidad = cantidad;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public String getLiquidacion() {
	return liquidacion;
}
public void setLiquidacion(String liquidacion) {
	this.liquidacion = liquidacion;
}


}
