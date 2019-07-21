package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the em_gen_unidad_medida database table.
 * 
 */
@Entity
@Table(name="em_gen_unidad_medida")
@NamedQuery(name="EmGenUnidadMedida.findAll", query="SELECT e FROM EmGenUnidadMedida e")
public class EmGenUnidadMedida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_unidad")
	private int idUnidad;

	@Column(name="descripcion_unidad")
	private String descripcionUnidad;

	@Column(name="estado_unidad")
	private byte estadoUnidad;

	//bi-directional many-to-one association to EmGenInventarioMateriaPrima
	@OneToMany(mappedBy="emGenUnidadMedida")
	private List<EmGenInventarioMateriaPrima> emGenInventarioMateriaPrimas;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	public EmGenUnidadMedida() {
	}

	public int getIdUnidad() {
		return this.idUnidad;
	}

	public void setIdUnidad(int idUnidad) {
		this.idUnidad = idUnidad;
	}

	public String getDescripcionUnidad() {
		return this.descripcionUnidad;
	}

	public void setDescripcionUnidad(String descripcionUnidad) {
		this.descripcionUnidad = descripcionUnidad;
	}

	public byte getEstadoUnidad() {
		return this.estadoUnidad;
	}

	public void setEstadoUnidad(byte estadoUnidad) {
		this.estadoUnidad = estadoUnidad;
	}

	public List<EmGenInventarioMateriaPrima> getEmGenInventarioMateriaPrimas() {
		return this.emGenInventarioMateriaPrimas;
	}

	public void setEmGenInventarioMateriaPrimas(List<EmGenInventarioMateriaPrima> emGenInventarioMateriaPrimas) {
		this.emGenInventarioMateriaPrimas = emGenInventarioMateriaPrimas;
	}

	public EmGenInventarioMateriaPrima addEmGenInventarioMateriaPrima(EmGenInventarioMateriaPrima emGenInventarioMateriaPrima) {
		getEmGenInventarioMateriaPrimas().add(emGenInventarioMateriaPrima);
		emGenInventarioMateriaPrima.setEmGenUnidadMedida(this);

		return emGenInventarioMateriaPrima;
	}

	public EmGenInventarioMateriaPrima removeEmGenInventarioMateriaPrima(EmGenInventarioMateriaPrima emGenInventarioMateriaPrima) {
		getEmGenInventarioMateriaPrimas().remove(emGenInventarioMateriaPrima);
		emGenInventarioMateriaPrima.setEmGenUnidadMedida(null);

		return emGenInventarioMateriaPrima;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

}