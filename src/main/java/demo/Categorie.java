/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.*;
import javax.inject.Named;

/**
 * @author v_v_v
 */
@Named
@RequestScoped
@ManagedBean(name = "categorie")
public class Categorie {
  private Map<String, String> categorie = new HashMap<>();
  private String labeled;

  @PostConstruct
  public void init() {

    categorie = new HashMap<>();
    categorie.put("Matériel Hygiene et sécurité", "Matériel Hygiene et sécurité");
    categorie.put("Ordinateurs et périphériques", "Ordinateurs et périphériques");
    categorie.put("Logiciels - licences spécifiques", "Logiciels - licences spécifiques");
    categorie.put("Mobilier technique/bureau", "Mobilier technique/bureau");
    categorie.put(
        "Appareils et accessoires de mesure/génération - grandeurs électriques",
        "Appareils et accessoires de mesure/génération - grandeurs électriques");
    categorie.put(
        "Appareils et accessoires de mesure/génération - grandeurs optiques",
        "Appareils et accessoires de mesure/génération - grandeurs optiques");
    categorie.put(
        "Appareils et accessoires de mesure/génération - autres grandeurs",
        "Appareils et accessoires de mesure/génération - autres grandeurs");
    categorie.put(
        "Appareils et accessoires d'analyse physico-chimique",
        "Appareils et accessoires d'analyse physico-chimique");
    categorie.put(
        "Appareils et accessoires d'inspection/mesure (microscopes, …)",
        "Appareils et accessoires d'inspection/mesure (microscopes, …)");
    categorie.put(
        "Appareilage d'usinage/transformation/etc", "Appareilage d'usinage/transformation/etc");
    categorie.put("Appareillage assemblage", "Appareillage assemblage");
    categorie.put("Appareillage pour le vide", "Appareillage pour le vide");
    categorie.put(
        "Fours et Enceintes thermiques/climatiques", "Fours et Enceintes thermiques/climatiques");
  }

  public Map<String, String> getCategorie() {
    return categorie;
  }

  public void setCategorie(Map<String, String> categorie) {
    this.categorie = categorie;
  }

  public String getLabeled() {
    return labeled;
  }

  public void setLabeled(String labeled) {
    this.labeled = labeled;
  }
}
