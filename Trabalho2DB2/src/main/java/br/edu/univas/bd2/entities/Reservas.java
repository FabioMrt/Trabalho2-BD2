package br.edu.univas.bd2.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Reservas")
public class Reservas {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "regSeqGen1")
	@SequenceGenerator(name = "regSeqGen1", sequenceName = "SEQ_Reservas", allocationSize = 1)
	private Integer id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="cpf")
	private String cpf;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataReserva;
	
	@ManyToOne
	@JoinColumn(name="quarto_fk")
	private Quarto quarto;
	
	public Reservas() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Quarto getQuarto() {
		return quarto;
	}
	
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getcpf() {
		return cpf;
	}
	
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Date getdataReserva() {
		return dataReserva;
	}
	
	public void setdataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}
	
	@Override
	public String toString() {
		return "Locatario: [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", Data da reserva =" + dataReserva + "]";
	}

}
