/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.*;
import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;
import org.primefaces.util.EscapeUtils;

/**
 * @author v_v_v
 */
public class Demo {
  private String nomApp;
  private String demandeur;
  private String groupe;
  private Date dateAchat;
  private String fournisseur;
  private String refApp;
  private String bonCom;
  private String numImmoTut;
  private String montantHT;
  private String montantTTC;
  private Date dateMisServ;
  private String dureeAmort;
  private Date dateFinAmort;

  public String getNomApp() {
    return nomApp;
  }

  public void setNomApp(String nomApp) {
    this.nomApp = nomApp;
  }

  public String getDemandeur() {
    return demandeur;
  }

  public void setDemandeur(String demandeur) {
    this.demandeur = demandeur;
  }

  public String getGroupe() {
    return groupe;
  }

  public void setGroupe(String groupe) {
    this.groupe = groupe;
  }

  public Date getDateAchat() {
    return dateAchat;
  }

  public void setDateAchat(Date dateAchat) {
    this.dateAchat = dateAchat;
  }

  public String getFournisseur() {
    return fournisseur;
  }

  public void setFournisseur(String fournisseur) {
    this.fournisseur = fournisseur;
  }

  public String getRefApp() {
    return refApp;
  }

  public void setRefApp(String refApp) {
    this.refApp = refApp;
  }

  public String getBonCom() {
    return bonCom;
  }

  public void setBonCom(String bonCom) {
    this.bonCom = bonCom;
  }

  public String getNumImmoTut() {
    return numImmoTut;
  }

  public void setNumImmoTut(String numImmoTut) {
    this.numImmoTut = numImmoTut;
  }

  public String getMontantHT() {
    return montantHT;
  }

  public void setMontantHT(String montantHT) {
    this.montantHT = montantHT;
  }

  public String getMontantTTC() {
    return montantTTC;
  }

  public void setMontantTTC(String montantTTC) {
    this.montantTTC = montantTTC;
  }

  public Date getDateMisServ() {
    return dateMisServ;
  }

  public void setDateMisServ(Date dateMisServ) {
    this.dateMisServ = dateMisServ;
  }

  public String getDureeAmort() {
    return dureeAmort;
  }

  public void setDureeAmort(String dureeAmort) {
    this.dureeAmort = dureeAmort;
  }

  public Date getDateFinAmort() {
    return dateFinAmort;
  }

  public void setDateFinAmort(Date dateFinAmort) {
    this.dateFinAmort = dateFinAmort;
  }
}
