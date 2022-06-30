package br.edu.univas.bd2.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Quarto")
public class Quarto {
	
	@Id
	@Column(name="codigo")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "regSeqGen2")
	@SequenceGenerator(name = "regSeqGen2", sequenceName = "SEQ_QUARTO", allocationSize = 1)
	private Integer codigo;
	
	@OneToMany(mappedBy="quarto")
	private Set<Reservas> reservas;
	
	@OneToOne
	@JoinColumn(name = "detalhes_fk")
	private QuartoDetalhes detalhes;
	
	@Column(name="Hotel")
	private String hotel;
	
	public Quarto() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Set<Reservas> getreservas() {
		return reservas;
	}

	public void setreservas(Set<Reservas> reservas) {
		this.reservas = reservas;
	}

	public QuartoDetalhes getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(QuartoDetalhes detalhes) {
		this.detalhes = detalhes;
	}

	public String gethotel() {
		return hotel;
	}

	public void sethotel(String hotel) {
		this.hotel = hotel;
	}
	
	@Override
	public String toString() {
		return "Quarto: [codigo=" + codigo + ", hotel=" + hotel + "]";
	}

}
