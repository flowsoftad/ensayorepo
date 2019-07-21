package jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the em_gen_proveedor_telefono database table.
 * 
 */
@Entity
@Table(name="em_gen_proveedor_telefono")
@NamedQuery(name="EmGenProveedorTelefono.findAll", query="SELECT e FROM EmGenProveedorTelefono e")
public class EmGenProveedorTelefono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_proveedor_telefono")
	private int idProveedorTelefono;

	@Column(name="estado_proveedor_telefono")
	private byte estadoProveedorTelefono;

	@Column(name="numero_proveedor_telefono")
	private String numeroProveedorTelefono;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	//bi-directional many-to-one association to EmGenProveedor
	@ManyToOne
	@JoinColumn(name="id_proveedor")
	private EmGenProveedor emGenProveedor;

	public EmGenProveedorTelefono() {
	}

	public int getIdProveedorTelefono() {
		return this.idProveedorTelefono;
	}

	public void setIdProveedorTelefono(int idProveedorTelefono) {
		this.idProveedorTelefono = idProveedorTelefono;
	}

	public byte getEstadoProveedorTelefono() {
		return this.estadoProveedorTelefono;
	}

	public void setEstadoProveedorTelefono(byte estadoProveedorTelefono) {
		this.estadoProveedorTelefono = estadoProveedorTelefono;
	}

	public String getNumeroProveedorTelefono() {
		return this.numeroProveedorTelefono;
	}

	public void setNumeroProveedorTelefono(String numeroProveedorTelefono) {
		this.numeroProveedorTelefono = numeroProveedorTelefono;
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

}