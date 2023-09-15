/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melipona.model;

/**
 *
 * @author uilto
 */
public class FormaPG {
    private int idFormaPG;
    private String forma;
    private boolean parcelar;
    private int maxParc;
    private double juros;
    private boolean jurosAtv;

    public FormaPG() {
    }

    public FormaPG(int idFormaPG, String forma, boolean parcelar, int maxParc, double juros, boolean jurosAtv) {
        this.idFormaPG = idFormaPG;
        this.forma = forma;
        this.parcelar = parcelar;
        this.maxParc = maxParc;
        this.juros = juros;
        this.jurosAtv = jurosAtv;
    }

    public int getIdFormaPG() {
        return idFormaPG;
    }

    public void setIdFormaPG(int idFormaPG) {
        this.idFormaPG = idFormaPG;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public boolean isParcelar() {
        return parcelar;
    }

    public void setParcelar(boolean parcelar) {
        this.parcelar = parcelar;
    }

    public int getMaxParc() {
        return maxParc;
    }

    public void setMaxParc(int maxParc) {
        this.maxParc = maxParc;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public boolean isJurosAtv() {
        return jurosAtv;
    }

    public void setJurosAtv(boolean jurosAtv) {
        this.jurosAtv = jurosAtv;
    }
    
    
    
}
