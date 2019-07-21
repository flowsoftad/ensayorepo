package jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the em_gen_ingredientes database table.
 * 
 */
@Entity
@Table(name="em_gen_ingredientes")
@NamedQuery(name="EmGenIngrediente.findAll", query="SELECT e FROM EmGenIngrediente e")
public class EmGenIngrediente implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EmGenIngredientePK id;

	@Column(name="candtidad_ingrediente")
	private float candtidadIngrediente;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	//bi-directional many-to-one association to EmGenFormula
	@ManyToOne
	@JoinColumn(name="id_formula")
	private EmGenFormula emGenFormula;

	//bi-directional many-to-one association to EmGenInventarioMateriaPrima
	@ManyToOne
	@JoinColumn(name="id_materia_prima")
	private EmGenInventarioMateriaPrima emGenInventarioMateriaPrima;

	public EmGenIngrediente() {
	}

	public EmGenIngredientePK getId() {
		return this.id;
	}

	public void setId(EmGenIngredientePK id) {
		this.id = id;
	}

	public float getCandtidadIngrediente() {
		return this.candtidadIngrediente;
	}

	public void setCandtidadIngrediente(float candtidadIngrediente) {
		this.candtidadIngrediente = candtidadIngrediente;
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

	public EmGenInventarioMateriaPrima getEmGenInventarioMateriaPrima() {
		return this.emGenInventarioMateriaPrima;
	}

	public void setEmGenInventarioMateriaPrima(EmGenInventarioMateriaPrima emGenInventarioMateriaPrima) {
		this.emGenInventarioMateriaPrima = emGenInventarioMateriaPrima;
	}

}