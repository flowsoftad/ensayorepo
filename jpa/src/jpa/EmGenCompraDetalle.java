package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;



/**
 * The persistent class for the em_gen_compra_detalle database table.
 * 
 */
@Entity
@Table(name="em_gen_compra_detalle")
@NamedQuery(name="EmGenCompraDetalle.findAll", query="SELECT e FROM EmGenCompraDetalle e")
public class EmGenCompraDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EmGenCompraDetallePK id;

	@Column(name="cantidad_compra_detalle")
	private float cantidadCompraDetalle;

	@Column(name="estado_compra_detalle")
	private byte estadoCompraDetalle;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vencimiento_compra")
	private Date fechaVencimientoCompra;

	@Column(name="observacion_compra_detalle")
	private String observacionCompraDetalle;

	@Column(name="precio_compra_detalle")
	private float precioCompraDetalle;

	//bi-directional many-to-one association to EmGenCompra
	@ManyToOne
	@JoinColumn(name="id_compra")
	private EmGenCompra emGenCompra;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	//bi-directional many-to-one association to EmGenInventarioMateriaPrima
	@ManyToOne
	@JoinColumn(name="id_materia_prima")
	private EmGenInventarioMateriaPrima emGenInventarioMateriaPrima;

	public EmGenCompraDetalle() {
	}

	public EmGenCompraDetallePK getId() {
		return this.id;
	}

	public void setId(EmGenCompraDetallePK id) {
		this.id = id;
	}

	public float getCantidadCompraDetalle() {
		return this.cantidadCompraDetalle;
	}

	public void setCantidadCompraDetalle(float cantidadCompraDetalle) {
		this.cantidadCompraDetalle = cantidadCompraDetalle;
	}

	public byte getEstadoCompraDetalle() {
		return this.estadoCompraDetalle;
	}

	public void setEstadoCompraDetalle(byte estadoCompraDetalle) {
		this.estadoCompraDetalle = estadoCompraDetalle;
	}

	public Date getFechaVencimientoCompra() {
		return this.fechaVencimientoCompra;
	}

	public void setFechaVencimientoCompra(Date fechaVencimientoCompra) {
		this.fechaVencimientoCompra = fechaVencimientoCompra;
	}

	public String getObservacionCompraDetalle() {
		return this.observacionCompraDetalle;
	}

	public void setObservacionCompraDetalle(String observacionCompraDetalle) {
		this.observacionCompraDetalle = observacionCompraDetalle;
	}

	public float getPrecioCompraDetalle() {
		return this.precioCompraDetalle;
	}

	public void setPrecioCompraDetalle(float precioCompraDetalle) {
		this.precioCompraDetalle = precioCompraDetalle;
	}

	public EmGenCompra getEmGenCompra() {
		return this.emGenCompra;
	}

	public void setEmGenCompra(EmGenCompra emGenCompra) {
		this.emGenCompra = emGenCompra;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

	public EmGenInventarioMateriaPrima getEmGenInventarioMateriaPrima() {
		return this.emGenInventarioMateriaPrima;
	}

	public void setEmGenInventarioMateriaPrima(EmGenInventarioMateriaPrima emGenInventarioMateriaPrima) {
		this.emGenInventarioMateriaPrima = emGenInventarioMateriaPrima;
	}

}