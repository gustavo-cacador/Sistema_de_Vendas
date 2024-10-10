package com.projeto.sistema.modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Venda implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String obs;
    private Double valorTotal = 0.00;
    private Double quantidadeTotal = 0.00;
    private Date dataVenda = new Date();

    @OneToMany(mappedBy = "venda", cascade = CascadeType.REMOVE)
    private List<ItemVenda> itens;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Funcionario funcionario;
    
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getObs() {
        return obs;
    }
    public void setObs(String obs) {
        this.obs = obs;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Double getQuantidadeTotal() {
        return quantidadeTotal;
    }
    public void setQuantidadeTotal(Double quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }
    public Date getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
    
    

    
    

}
