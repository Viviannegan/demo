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
@ManagedBean(name = "tutelle")
public class Tutelle {

  private Map<String, String> tutImpu = new HashMap<>();
  private String labeled;
  // fin tutelle imputation

  // tutelle imputation
  @PostConstruct
  public void init() {
    // tutImpu
    tutImpu = new HashMap<>();
    tutImpu.put("INP", "INP");
    tutImpu.put("UPS", "UPS");
    tutImpu.put("CNRS", "CNRS");
  }

  public Map<String, String> getTutImpu() {
    return tutImpu;
  }

  public void setTutImpu(Map<String, String> tutImpu) {
    this.tutImpu = tutImpu;
  }

  public String getLabeled() {
    return labeled;
  }

  public void setLabeled(String labeled) {
    this.labeled = labeled;
  }

  /*public String getTutImpu() {
      return tutImpu;
  }

  public void setTutImpu(String tutImpu) {
      this.tutImpu = tutImpu;
  }*/

}
