package jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the em_gen_ingredientes database table.
 * 
 */
@Embeddable
public class EmGenIngredientePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_formula", insertable=false, updatable=false)
	private int idFormula;

	@Column(name="id_materia_prima", insertable=false, updatable=false)
	private int idMateriaPrima;

	public EmGenIngredientePK() {
	}
	public int getIdFormula() {
		return this.idFormula;
	}
	public void setIdFormula(int idFormula) {
		this.idFormula = idFormula;
	}
	public int getIdMateriaPrima() {
		return this.idMateriaPrima;
	}
	public void setIdMateriaPrima(int idMateriaPrima) {
		this.idMateriaPrima = idMateriaPrima;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EmGenIngredientePK)) {
			return false;
		}
		EmGenIngredientePK castOther = (EmGenIngredientePK)other;
		return 
			(this.idFormula == castOther.idFormula)
			&& (this.idMateriaPrima == castOther.idMateriaPrima);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idFormula;
		hash = hash * prime + this.idMateriaPrima;
		
		return hash;
	}
}