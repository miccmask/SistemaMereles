/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;

/**
 *
 * @author USER
 */
public class GmmVendas {
    private int gmmIdVendas;
    private String gmmUsuario;
    private String gmmValorTotal;
    private String gmmFormaPagamento;
    private Date gmmDataVenda;
    private String gmmStatusVenda;
    private String gmmDesconto;

    /**
     * @return the gmmIdVendas
     */
    public int getGmmIdVendas() {
        return gmmIdVendas;
    }

    /**
     * @param gmmIdVendas the gmmIdVendas to set
     */
    public void setGmmIdVendas(int gmmIdVendas) {
        this.gmmIdVendas = gmmIdVendas;
    }

    /**
     * @return the gmmUsuario
     */
    public String getGmmUsuario() {
        return gmmUsuario;
    }

    /**
     * @param gmmUsuario the gmmUsuario to set
     */
    public void setGmmUsuario(String gmmUsuario) {
        this.gmmUsuario = gmmUsuario;
    }

    /**
     * @return the gmmValorTotal
     */
    public String getGmmValorTotal() {
        return gmmValorTotal;
    }

    /**
     * @param gmmValorTotal the gmmValorTotal to set
     */
    public void setGmmValorTotal(String gmmValorTotal) {
        this.gmmValorTotal = gmmValorTotal;
    }

    /**
     * @return the gmmFormaPagamento
     */
    public String getGmmFormaPagamento() {
        return gmmFormaPagamento;
    }

    /**
     * @param gmmFormaPagamento the gmmFormaPagamento to set
     */
    public void setGmmFormaPagamento(String gmmFormaPagamento) {
        this.gmmFormaPagamento = gmmFormaPagamento;
    }

    /**
     * @return the gmmDataVenda
     */
    public Date getGmmDataVenda() {
        return gmmDataVenda;
    }

    /**
     * @param gmmDataVenda the gmmDataVenda to set
     */
    public void setGmmDataVenda(Date gmmDataVenda) {
        this.gmmDataVenda = gmmDataVenda;
    }

    /**
     * @return the gmmStatusVenda
     */
    public String getGmmStatusVenda() {
        return gmmStatusVenda;
    }

    /**
     * @param gmmStatusVenda the gmmStatusVenda to set
     */
    public void setGmmStatusVenda(String gmmStatusVenda) {
        this.gmmStatusVenda = gmmStatusVenda;
    }

    /**
     * @return the gmmDesconto
     */
    public String getGmmDesconto() {
        return gmmDesconto;
    }

    /**
     * @param gmmDesconto the gmmDesconto to set
     */
    public void setGmmDesconto(String gmmDesconto) {
        this.gmmDesconto = gmmDesconto;
    }
}
