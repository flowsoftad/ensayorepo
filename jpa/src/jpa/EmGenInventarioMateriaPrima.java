package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the em_gen_inventario_materia_prima database table.
 * 
 */
@Entity
@Table(name="em_gen_inventario_materia_prima")
@NamedQuery(name="EmGenInventarioMateriaPrima.findAll", query="SELECT e FROM EmGenInventarioMateriaPrima e")
public class EmGenInventarioMateriaPrima implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_materia_prima")
	private int idMateriaPrima;

	@Column(name="cantidad_materia_prima")
	private float cantidadMateriaPrima;

	@Column(name="estado_materia_prima")
	private byte estadoMateriaPrima;

	@Column(name="maneja_inventario")
	private byte manejaInventario;

	@Column(name="nombre_materia_prima")
	private String nombreMateriaPrima;

	@Column(name="valor_unidad_materia_prima")
	private float valorUnidadMateriaPrima;

	//bi-directional many-to-one association to EmGenCompraDetalle
	@OneToMany(mappedBy="emGenInventarioMateriaPrima")
	private List<EmGenCompraDetalle> emGenCompraDetalles;

	//bi-directional many-to-one association to EmGenIngrediente
	@OneToMany(mappedBy="emGenInventarioMateriaPrima")
	private List<EmGenIngrediente> emGenIngredientes;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	//bi-directional many-to-one association to EmGenUnidadMedida
	@ManyToOne
	@JoinColumn(name="id_unidad")
	private EmGenUnidadMedida emGenUnidadMedida;

	public EmGenInventarioMateriaPrima() {
	}

	public int getIdMateriaPrima() {
		return this.idMateriaPrima;
	}

	public void setIdMateriaPrima(int idMateriaPrima) {
		this.idMateriaPrima = idMateriaPrima;
	}

	public float getCantidadMateriaPrima() {
		return this.cantidadMateriaPrima;
	}

	public void setCantidadMateriaPrima(float cantidadMateriaPrima) {
		this.cantidadMateriaPrima = cantidadMateriaPrima;
	}

	public byte getEstadoMateriaPrima() {
		return this.estadoMateriaPrima;
	}

	public void setEstadoMateriaPrima(byte estadoMateriaPrima) {
		this.estadoMateriaPrima = estadoMateriaPrima;
	}

	public byte getManejaInventario() {
		return this.manejaInventario;
	}

	public void setManejaInventario(byte manejaInventario) {
		this.manejaInventario = manejaInventario;
	}

	public String getNombreMateriaPrima() {
		return this.nombreMateriaPrima;
	}

	public void setNombreMateriaPrima(String nombreMateriaPrima) {
		this.nombreMateriaPrima = nombreMateriaPrima;
	}

	public float getValorUnidadMateriaPrima() {
		return this.valorUnidadMateriaPrima;
	}

	public void setValorUnidadMateriaPrima(float valorUnidadMateriaPrima) {
		this.valorUnidadMateriaPrima = valorUnidadMateriaPrima;
	}

	public List<EmGenCompraDetalle> getEmGenCompraDetalles() {
		return this.emGenCompraDetalles;
	}

	public void setEmGenCompraDetalles(List<EmGenCompraDetalle> emGenCompraDetalles) {
		this.emGenCompraDetalles = emGenCompraDetalles;
	}

	public EmGenCompraDetalle addEmGenCompraDetalle(EmGenCompraDetalle emGenCompraDetalle) {
		getEmGenCompraDetalles().add(emGenCompraDetalle);
		emGenCompraDetalle.setEmGenInventarioMateriaPrima(this);

		return emGenCompraDetalle;
	}

	public EmGenCompraDetalle removeEmGenCompraDetalle(EmGenCompraDetalle emGenCompraDetalle) {
		getEmGenCompraDetalles().remove(emGenCompraDetalle);
		emGenCompraDetalle.setEmGenInventarioMateriaPrima(null);

		return emGenCompraDetalle;
	}

	public List<EmGenIngrediente> getEmGenIngredientes() {
		return this.emGenIngredientes;
	}

	public void setEmGenIngredientes(List<EmGenIngrediente> emGenIngredientes) {
		this.emGenIngredientes = emGenIngredientes;
	}

	public EmGenIngrediente addEmGenIngrediente(EmGenIngrediente emGenIngrediente) {
		getEmGenIngredientes().add(emGenIngrediente);
		emGenIngrediente.setEmGenInventarioMateriaPrima(this);

		return emGenIngrediente;
	}

	public EmGenIngrediente removeEmGenIngrediente(EmGenIngrediente emGenIngrediente) {
		getEmGenIngredientes().remove(emGenIngrediente);
		emGenIngrediente.setEmGenInventarioMateriaPrima(null);

		return emGenIngrediente;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

	public EmGenUnidadMedida getEmGenUnidadMedida() {
		return this.emGenUnidadMedida;
	}

	public void setEmGenUnidadMedida(EmGenUnidadMedida emGenUnidadMedida) {
		this.emGenUnidadMedida = emGenUnidadMedida;
	}

}