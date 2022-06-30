package br.edu.univas.bd2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="QuartoDetalhes")
public class QuartoDetalhes {
	
	@Id
	@Column(name="codigo")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "regSeqGen3")
	@SequenceGenerator(name = "regSeqGen3", sequenceName = "SEQ_QuartoDetalhes", allocationSize = 1)
	private Integer codigo;
	
	@Column(name="valorDiaria")
	private String valorDiaria;

	@Column(name="qtd_camas")
	private int qtd_camas;
	
	@Column(name="numeroQuarto")
	private int numeroQuarto;
	
	@OneToOne(mappedBy = "detalhes")
	private Quarto quarto;
	
	public QuartoDetalhes() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Quarto getquarto() {
		return quarto;
	}

	public void setquarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public String getvalorDiaria() {
		return valorDiaria;
	}

	public void setvalorDiaria(String valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public int getqtd_camas() {
		return qtd_camas;
	}

	public void setqtd_camas(int qtd_camas) {
		this.qtd_camas = qtd_camas;
	}

	public int getnumeroQuarto() {
		return numeroQuarto;
	}

	public void setnumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	
	@Override
	public String toString() {
		return "Detalhes: [codigo=" + codigo + ", valorDiaria=" + valorDiaria + ", qtd_camas=" + qtd_camas + ", numeroQuarto=" + numeroQuarto + "]";
	}
	
}
