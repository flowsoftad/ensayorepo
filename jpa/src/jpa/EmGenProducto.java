package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the em_gen_producto database table.
 * 
 */
@Entity
@Table(name="em_gen_producto")
@NamedQuery(name="EmGenProducto.findAll", query="SELECT e FROM EmGenProducto e")
public class EmGenProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_producto")
	private int idProducto;

	@Column(name="descripcion_producto")
	private String descripcionProducto;

	@Column(name="estado_producto")
	private byte estadoProducto;

	@Column(name="nombre_producto")
	private String nombreProducto;

	//bi-directional many-to-one association to EmGenFormula
	@OneToMany(mappedBy="emGenProducto")
	private List<EmGenFormula> emGenFormulas;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	public EmGenProducto() {
	}

	public int getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcionProducto() {
		return this.descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public byte getEstadoProducto() {
		return this.estadoProducto;
	}

	public void setEstadoProducto(byte estadoProducto) {
		this.estadoProducto = estadoProducto;
	}

	public String getNombreProducto() {
		return this.nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public List<EmGenFormula> getEmGenFormulas() {
		return this.emGenFormulas;
	}

	public void setEmGenFormulas(List<EmGenFormula> emGenFormulas) {
		this.emGenFormulas = emGenFormulas;
	}

	public EmGenFormula addEmGenFormula(EmGenFormula emGenFormula) {
		getEmGenFormulas().add(emGenFormula);
		emGenFormula.setEmGenProducto(this);

		return emGenFormula;
	}

	public EmGenFormula removeEmGenFormula(EmGenFormula emGenFormula) {
		getEmGenFormulas().remove(emGenFormula);
		emGenFormula.setEmGenProducto(null);

		return emGenFormula;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

}