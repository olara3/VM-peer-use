package com.doti2c.vmperuser.projetofinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//entidade com o nome de tabela (tbl_software)
@Entity
@Table(name="tbl_software")
public class Software {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="nome_software", length=100)
	private String nomeSoftware;
	
	@Column(name="fornecedor", length=100)
	private String fornecedor;
	@Column(name="preco")
	private float valor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeSoftware() {
		return nomeSoftware;
	}
	public void setNomeSoftware(String nomeSoftware) {
		this.nomeSoftware = nomeSoftware;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
}
