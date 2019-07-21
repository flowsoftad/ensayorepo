package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the em_gen_moje database table.
 * 
 */
@Entity
@Table(name="em_gen_moje")
@NamedQuery(name="EmGenMoje.findAll", query="SELECT e FROM EmGenMoje e")
public class EmGenMoje implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_moje")
	private int idMoje;

	@Column(name="estado_moje")
	private byte estadoMoje;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	@Column(name="observacion_moje")
	private String observacionMoje;

	@Column(name="peso_moje")
	private float pesoMoje;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	//bi-directional many-to-one association to EmGenFormula
	@ManyToOne
	@JoinColumn(name="id_formula")
	private EmGenFormula emGenFormula;

	//bi-directional many-to-one association to EmGenProductoFinal
	@OneToMany(mappedBy="emGenMoje")
	private List<EmGenProductoFinal> emGenProductoFinals;

	public EmGenMoje() {
	}

	public int getIdMoje() {
		return this.idMoje;
	}

	public void setIdMoje(int idMoje) {
		this.idMoje = idMoje;
	}

	public byte getEstadoMoje() {
		return this.estadoMoje;
	}

	public void setEstadoMoje(byte estadoMoje) {
		this.estadoMoje = estadoMoje;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getObservacionMoje() {
		return this.observacionMoje;
	}

	public void setObservacionMoje(String observacionMoje) {
		this.observacionMoje = observacionMoje;
	}

	public float getPesoMoje() {
		return this.pesoMoje;
	}

	public void setPesoMoje(float pesoMoje) {
		this.pesoMoje = pesoMoje;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

	public EmGenFormula getEmGenFormula() {
		return this.emGenFormula;
	}

	public void setEmGenFormula(EmGenFormula emGenFormula) {
		this.emGenFormula = emGenFormula;
	}

	public List<EmGenProductoFinal> getEmGenProductoFinals() {
		return this.emGenProductoFinals;
	}

	public void setEmGenProductoFinals(List<EmGenProductoFinal> emGenProductoFinals) {
		this.emGenProductoFinals = emGenProductoFinals;
	}

	public EmGenProductoFinal addEmGenProductoFinal(EmGenProductoFinal emGenProductoFinal) {
		getEmGenProductoFinals().add(emGenProductoFinal);
		emGenProductoFinal.setEmGenMoje(this);

		return emGenProductoFinal;
	}

	public EmGenProductoFinal removeEmGenProductoFinal(EmGenProductoFinal emGenProductoFinal) {
		getEmGenProductoFinals().remove(emGenProductoFinal);
		emGenProductoFinal.setEmGenMoje(null);

		return emGenProductoFinal;
	}

}