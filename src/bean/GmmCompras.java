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
public class GmmCompras {
    private int gmmIdCompras;
    private String gmmUsuario;
    private String gmmFornecedor;
    private String gmmNumeroNotaFiscal;
    private Date gmmDataCompra;
    private String gmmValorTotal;
    private Date gmmPrevisaoEntrega;

    /**
     * @return the gmmIdCompras
     */
    public int getGmmIdCompras() {
        return gmmIdCompras;
    }

    /**
     * @param gmmIdCompras the gmmIdCompras to set
     */
    public void setGmmIdCompras(int gmmIdCompras) {
        this.gmmIdCompras = gmmIdCompras;
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
     * @return the gmmFornecedor
     */
    public String getGmmFornecedor() {
        return gmmFornecedor;
    }

    /**
     * @param gmmFornecedor the gmmFornecedor to set
     */
    public void setGmmFornecedor(String gmmFornecedor) {
        this.gmmFornecedor = gmmFornecedor;
    }

    /**
     * @return the gmmNumeroNotaFiscal
     */
    public String getGmmNumeroNotaFiscal() {
        return gmmNumeroNotaFiscal;
    }

    /**
     * @param gmmNumeroNotaFiscal the gmmNumeroNotaFiscal to set
     */
    public void setGmmNumeroNotaFiscal(String gmmNumeroNotaFiscal) {
        this.gmmNumeroNotaFiscal = gmmNumeroNotaFiscal;
    }

    /**
     * @return the gmmDataCompra
     */
    public Date getGmmDataCompra() {
        return gmmDataCompra;
    }

    /**
     * @param gmmDataCompra the gmmDataCompra to set
     */
    public void setGmmDataCompra(Date gmmDataCompra) {
        this.gmmDataCompra = gmmDataCompra;
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
     * @return the gmmPrevisaoEntrega
     */
    public Date getGmmPrevisaoEntrega() {
        return gmmPrevisaoEntrega;
    }

    /**
     * @param gmmPrevisaoEntrega the gmmPrevisaoEntrega to set
     */
    public void setGmmPrevisaoEntrega(Date gmmPrevisaoEntrega) {
        this.gmmPrevisaoEntrega = gmmPrevisaoEntrega;
    }
}
