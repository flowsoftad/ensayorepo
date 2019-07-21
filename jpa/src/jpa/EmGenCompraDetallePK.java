package jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the em_gen_compra_detalle database table.
 * 
 */
@Embeddable
public class EmGenCompraDetallePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_compra_detalle")
	private int idCompraDetalle;

	@Column(name="id_materia_prima", insertable=false, updatable=false)
	private int idMateriaPrima;

	@Column(name="id_compra", insertable=false, updatable=false)
	private int idCompra;

	public EmGenCompraDetallePK() {
	}
	public int getIdCompraDetalle() {
		return this.idCompraDetalle;
	}
	public void setIdCompraDetalle(int idCompraDetalle) {
		this.idCompraDetalle = idCompraDetalle;
	}
	public int getIdMateriaPrima() {
		return this.idMateriaPrima;
	}
	public void setIdMateriaPrima(int idMateriaPrima) {
		this.idMateriaPrima = idMateriaPrima;
	}
	public int getIdCompra() {
		return this.idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EmGenCompraDetallePK)) {
			return false;
		}
		EmGenCompraDetallePK castOther = (EmGenCompraDetallePK)other;
		return 
			(this.idCompraDetalle == castOther.idCompraDetalle)
			&& (this.idMateriaPrima == castOther.idMateriaPrima)
			&& (this.idCompra == castOther.idCompra);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCompraDetalle;
		hash = hash * prime + this.idMateriaPrima;
		hash = hash * prime + this.idCompra;
		
		return hash;
	}
}