package jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the em_gen_producto_final database table.
 * 
 */
@Entity
@Table(name="em_gen_producto_final")
@NamedQuery(name="EmGenProductoFinal.findAll", query="SELECT e FROM EmGenProductoFinal e")
public class EmGenProductoFinal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_producto_final")
	private int idProductoFinal;

	@Column(name="cantidad_real")
	private float cantidadReal;

	@Column(name="observacion_producto_final")
	private String observacionProductoFinal;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	//bi-directional many-to-one association to EmGenMoje
	@ManyToOne
	@JoinColumn(name="id_moje")
	private EmGenMoje emGenMoje;

	public EmGenProductoFinal() {
	}

	public int getIdProductoFinal() {
		return this.idProductoFinal;
	}

	public void setIdProductoFinal(int idProductoFinal) {
		this.idProductoFinal = idProductoFinal;
	}

	public float getCantidadReal() {
		return this.cantidadReal;
	}

	public void setCantidadReal(float cantidadReal) {
		this.cantidadReal = cantidadReal;
	}

	public String getObservacionProductoFinal() {
		return this.observacionProductoFinal;
	}

	public void setObservacionProductoFinal(String observacionProductoFinal) {
		this.observacionProductoFinal = observacionProductoFinal;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

	public EmGenMoje getEmGenMoje() {
		return this.emGenMoje;
	}

	public void setEmGenMoje(EmGenMoje emGenMoje) {
		this.emGenMoje = emGenMoje;
	}

}