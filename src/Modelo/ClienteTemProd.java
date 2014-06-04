package Modelo;

import java.util.Date;

public class ClienteTemProd
{
	private int idMovimento;
	private double valor;
	private int quantidade;
	private Date dataEntrega;
	private Date dataEncomenda;
	private Date dataPagamento;
	private String formaPagamento; //ver como vai ficar o ENUM
	
	public int getIdMovimento() {
		return this.idMovimento;
	}
	
	public void setIdMovimento(int id) {
		this.idMovimento = id;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valorProd) {
		this.valor = valorProd;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Date getDataEncomenda() {
		return dataEncomenda;
	}

	public void setDataEncomenda(Date dataEncomenda) {
		this.dataEncomenda = dataEncomenda;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
}
