package com.doti2c.vmperuser.projetofinal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="racf", length=7)
	private String racf;
	
	@Column(name="senha", length=20)
	private String senha;
	
	@Column(name="nome", length=100)
	private String nome;
	
	@Column(name="email", length=80)
	private String email;
	
	@Column(name="telefone", length=20)
	private String telefone;
	
	@Column(name="setor", length=50)
	private String setor;
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Column(name="linkfoto", length=200)
	private String linkFoto;
	
	// preciso anotar a lista de pedido indicando que há uma relação Um-Para -Muitos entre Usuaio e Solicitação 
	// Um usuario realiza muitas solicitações
	// Além disso, preiso obrigatoriamente dizer qual o atributo dentro do objeto Solicitacao
	// refencia o usuario (atraves do maapedBy)
	// O Cascade indica que , se eu fize uma determinada operação no usuário isso tb vi
	// se refletir nas solicitações (ex: inseri um usuario faço a inserção de uma nova solicitação
	
	@OneToMany(mappedBy="solicitante", cascade = CascadeType.ALL) // a	qui eu defino que essa relaco em termos de "Tabelas"
	@JsonIgnoreProperties("solicitante")
	private List<Solicitacao> pedidos; //aqui eu digo que 1 usuario possui n solicitacoes
	
	public List<Solicitacao> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Solicitacao> pedidos) {
		this.pedidos = pedidos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRacf() {
		return racf;
	}
	public void setRacf(String racf) {
		this.racf = racf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getLinkFoto() {
		return linkFoto;
	}
	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}
	
	
	
}
