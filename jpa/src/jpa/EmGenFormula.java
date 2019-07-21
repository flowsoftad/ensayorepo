package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the em_gen_formula database table.
 * 
 */
@Entity
@Table(name="em_gen_formula")
@NamedQuery(name="EmGenFormula.findAll", query="SELECT e FROM EmGenFormula e")
public class EmGenFormula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_formula")
	private int idFormula;

	@Column(name="cantidad_producto_estimado")
	private float cantidadProductoEstimado;

	@Column(name="costo_formula")
	private float costoFormula;

	@Column(name="descripcion1_formula")
	private String descripcion1Formula;

	@Column(name="descripcion2_dormula")
	private String descripcion2Dormula;

	@Column(name="estado_formula")
	private byte estadoFormula;

	@Column(name="nombre_formua")
	private String nombreFormua;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	//bi-directional many-to-one association to EmGenProducto
	@ManyToOne
	@JoinColumn(name="id_producto")
	private EmGenProducto emGenProducto;

	//bi-directional many-to-one association to EmGenIngrediente
	@OneToMany(mappedBy="emGenFormula")
	private List<EmGenIngrediente> emGenIngredientes;

	//bi-directional many-to-one association to EmGenMoje
	@OneToMany(mappedBy="emGenFormula")
	private List<EmGenMoje> emGenMojes;

	public EmGenFormula() {
	}

	public int getIdFormula() {
		return this.idFormula;
	}

	public void setIdFormula(int idFormula) {
		this.idFormula = idFormula;
	}

	public float getCantidadProductoEstimado() {
		return this.cantidadProductoEstimado;
	}

	public void setCantidadProductoEstimado(float cantidadProductoEstimado) {
		this.cantidadProductoEstimado = cantidadProductoEstimado;
	}

	public float getCostoFormula() {
		return this.costoFormula;
	}

	public void setCostoFormula(float costoFormula) {
		this.costoFormula = costoFormula;
	}

	public String getDescripcion1Formula() {
		return this.descripcion1Formula;
	}

	public void setDescripcion1Formula(String descripcion1Formula) {
		this.descripcion1Formula = descripcion1Formula;
	}

	public String getDescripcion2Dormula() {
		return this.descripcion2Dormula;
	}

	public void setDescripcion2Dormula(String descripcion2Dormula) {
		this.descripcion2Dormula = descripcion2Dormula;
	}

	public byte getEstadoFormula() {
		return this.estadoFormula;
	}

	public void setEstadoFormula(byte estadoFormula) {
		this.estadoFormula = estadoFormula;
	}

	public String getNombreFormua() {
		return this.nombreFormua;
	}

	public void setNombreFormua(String nombreFormua) {
		this.nombreFormua = nombreFormua;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

	public EmGenProducto getEmGenProducto() {
		return this.emGenProducto;
	}

	public void setEmGenProducto(EmGenProducto emGenProducto) {
		this.emGenProducto = emGenProducto;
	}

	public List<EmGenIngrediente> getEmGenIngredientes() {
		return this.emGenIngredientes;
	}

	public void setEmGenIngredientes(List<EmGenIngrediente> emGenIngredientes) {
		this.emGenIngredientes = emGenIngredientes;
	}

	public EmGenIngrediente addEmGenIngrediente(EmGenIngrediente emGenIngrediente) {
		getEmGenIngredientes().add(emGenIngrediente);
		emGenIngrediente.setEmGenFormula(this);

		return emGenIngrediente;
	}

	public EmGenIngrediente removeEmGenIngrediente(EmGenIngrediente emGenIngrediente) {
		getEmGenIngredientes().remove(emGenIngrediente);
		emGenIngrediente.setEmGenFormula(null);

		return emGenIngrediente;
	}

	public List<EmGenMoje> getEmGenMojes() {
		return this.emGenMojes;
	}

	public void setEmGenMojes(List<EmGenMoje> emGenMojes) {
		this.emGenMojes = emGenMojes;
	}

	public EmGenMoje addEmGenMoje(EmGenMoje emGenMoje) {
		getEmGenMojes().add(emGenMoje);
		emGenMoje.setEmGenFormula(this);

		return emGenMoje;
	}

	public EmGenMoje removeEmGenMoje(EmGenMoje emGenMoje) {
		getEmGenMojes().remove(emGenMoje);
		emGenMoje.setEmGenFormula(null);

		return emGenMoje;
	}

}