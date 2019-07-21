package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the em_gen_proveedor database table.
 * 
 */
@Entity
@Table(name="em_gen_proveedor")
@NamedQuery(name="EmGenProveedor.findAll", query="SELECT e FROM EmGenProveedor e")
public class EmGenProveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_proveedor")
	private int idProveedor;

	@Column(name="correo_proveedor")
	private String correoProveedor;

	@Column(name="descripcion_producto_proveedor")
	private String descripcionProductoProveedor;

	@Column(name="direccion_proveedor")
	private String direccionProveedor;

	@Column(name="estado_proveedor")
	private byte estadoProveedor;

	//bi-directional many-to-one association to EmGenCompra
	@OneToMany(mappedBy="emGenProveedor")
	private List<EmGenCompra> emGenCompras;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	//bi-directional many-to-one association to EmGenProveedorTelefono
	@OneToMany(mappedBy="emGenProveedor")
	private List<EmGenProveedorTelefono> emGenProveedorTelefonos;

	public EmGenProveedor() {
	}

	public int getIdProveedor() {
		return this.idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getCorreoProveedor() {
		return this.correoProveedor;
	}

	public void setCorreoProveedor(String correoProveedor) {
		this.correoProveedor = correoProveedor;
	}

	public String getDescripcionProductoProveedor() {
		return this.descripcionProductoProveedor;
	}

	public void setDescripcionProductoProveedor(String descripcionProductoProveedor) {
		this.descripcionProductoProveedor = descripcionProductoProveedor;
	}

	public String getDireccionProveedor() {
		return this.direccionProveedor;
	}

	public void setDireccionProveedor(String direccionProveedor) {
		this.direccionProveedor = direccionProveedor;
	}

	public byte getEstadoProveedor() {
		return this.estadoProveedor;
	}

	public void setEstadoProveedor(byte estadoProveedor) {
		this.estadoProveedor = estadoProveedor;
	}

	public List<EmGenCompra> getEmGenCompras() {
		return this.emGenCompras;
	}

	public void setEmGenCompras(List<EmGenCompra> emGenCompras) {
		this.emGenCompras = emGenCompras;
	}

	public EmGenCompra addEmGenCompra(EmGenCompra emGenCompra) {
		getEmGenCompras().add(emGenCompra);
		emGenCompra.setEmGenProveedor(this);

		return emGenCompra;
	}

	public EmGenCompra removeEmGenCompra(EmGenCompra emGenCompra) {
		getEmGenCompras().remove(emGenCompra);
		emGenCompra.setEmGenProveedor(null);

		return emGenCompra;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

	public List<EmGenProveedorTelefono> getEmGenProveedorTelefonos() {
		return this.emGenProveedorTelefonos;
	}

	public void setEmGenProveedorTelefonos(List<EmGenProveedorTelefono> emGenProveedorTelefonos) {
		this.emGenProveedorTelefonos = emGenProveedorTelefonos;
	}

	public EmGenProveedorTelefono addEmGenProveedorTelefono(EmGenProveedorTelefono emGenProveedorTelefono) {
		getEmGenProveedorTelefonos().add(emGenProveedorTelefono);
		emGenProveedorTelefono.setEmGenProveedor(this);

		return emGenProveedorTelefono;
	}

	public EmGenProveedorTelefono removeEmGenProveedorTelefono(EmGenProveedorTelefono emGenProveedorTelefono) {
		getEmGenProveedorTelefonos().remove(emGenProveedorTelefono);
		emGenProveedorTelefono.setEmGenProveedor(null);

		return emGenProveedorTelefono;
	}

}