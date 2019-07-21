package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the em_gen_compra database table.
 * 
 */
@Entity
@Table(name="em_gen_compra")
@NamedQuery(name="EmGenCompra.findAll", query="SELECT e FROM EmGenCompra e")
public class EmGenCompra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_compra")
	private int idCompra;

	@Column(name="estado_compra")
	private byte estadoCompra;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_compra")
	private Date fechaCompra;

	@Column(name="imagen_factura_compra")
	private String imagenFacturaCompra;

	@Column(name="numero_factura_compra")
	private String numeroFacturaCompra;

	@Column(name="precio_total_compra")
	private float precioTotalCompra;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	//bi-directional many-to-one association to EmGenProveedor
	@ManyToOne
	@JoinColumn(name="id_proveedor")
	private EmGenProveedor emGenProveedor;

	//bi-directional many-to-one association to EmGenCompraDetalle
	@OneToMany(mappedBy="emGenCompra")
	private List<EmGenCompraDetalle> emGenCompraDetalles;

	public EmGenCompra() {
	}

	public int getIdCompra() {
		return this.idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public byte getEstadoCompra() {
		return this.estadoCompra;
	}

	public void setEstadoCompra(byte estadoCompra) {
		this.estadoCompra = estadoCompra;
	}

	public Date getFechaCompra() {
		return this.fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getImagenFacturaCompra() {
		return this.imagenFacturaCompra;
	}

	public void setImagenFacturaCompra(String imagenFacturaCompra) {
		this.imagenFacturaCompra = imagenFacturaCompra;
	}

	public String getNumeroFacturaCompra() {
		return this.numeroFacturaCompra;
	}

	public void setNumeroFacturaCompra(String numeroFacturaCompra) {
		this.numeroFacturaCompra = numeroFacturaCompra;
	}

	public float getPrecioTotalCompra() {
		return this.precioTotalCompra;
	}

	public void setPrecioTotalCompra(float precioTotalCompra) {
		this.precioTotalCompra = precioTotalCompra;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

	public EmGenProveedor getEmGenProveedor() {
		return this.emGenProveedor;
	}

	public void setEmGenProveedor(EmGenProveedor emGenProveedor) {
		this.emGenProveedor = emGenProveedor;
	}

	public List<EmGenCompraDetalle> getEmGenCompraDetalles() {
		return this.emGenCompraDetalles;
	}

	public void setEmGenCompraDetalles(List<EmGenCompraDetalle> emGenCompraDetalles) {
		this.emGenCompraDetalles = emGenCompraDetalles;
	}

	public EmGenCompraDetalle addEmGenCompraDetalle(EmGenCompraDetalle emGenCompraDetalle) {
		getEmGenCompraDetalles().add(emGenCompraDetalle);
		emGenCompraDetalle.setEmGenCompra(this);

		return emGenCompraDetalle;
	}

	public EmGenCompraDetalle removeEmGenCompraDetalle(EmGenCompraDetalle emGenCompraDetalle) {
		getEmGenCompraDetalles().remove(emGenCompraDetalle);
		emGenCompraDetalle.setEmGenCompra(null);

		return emGenCompraDetalle;
	}

}