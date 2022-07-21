/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.*;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;
import org.primefaces.util.EscapeUtils;

/**
 * @author v_v_v
 */
@RequestScoped
@ManagedBean(name = "bonLiv")
public class BonLiv {
  private UploadedFile bonLiv;
  // private UploadedFiles files;//pour deposer plusieures fichiers
  private String dropZoneText = "Drop zone p:inputTextarea demo.";

  // pour deposer un fichier, ici c'est deposer le fichier Bon de Livraison
  public void upload() {
    if (bonLiv != null) {
      FacesMessage message = new FacesMessage("Successful", bonLiv.getFileName() + " is uploaded.");
      FacesContext.getCurrentInstance().addMessage(null, message);
    }
  }

  // pour deposer plusieures fichiers
  /*
      public void uploadMultiple() {
          if (files != null) {
              for (UploadedFile f : files.getFiles()) {
                  FacesMessage message = new FacesMessage("Successful", f.getFileName() + " is uploaded.");
                  FacesContext.getCurrentInstance().addMessage(null, message);
              }
          }
      }
  */

  public void handleFileUpload(FileUploadEvent event) {
    FacesMessage message =
        new FacesMessage("Successful", event.getFile().getFileName() + " is uploaded.");
    FacesContext.getCurrentInstance().addMessage(null, message);
  }

  public void handleFileUploadTextarea(FileUploadEvent event) {
    String jsVal = "PF('textarea').jq.val";
    String fileName = EscapeUtils.forJavaScript(event.getFile().getFileName());
    PrimeFaces.current()
        .executeScript(jsVal + "(" + jsVal + "() + '\\n\\n" + fileName + " uploaded.')");
  }

  // pour deposer plusieures fichiers
  /*
      public void handleFilesUpload(FilesUploadEvent event) {
          for (UploadedFile f : event.getFiles().getFiles()) {
              FacesMessage message = new FacesMessage("Successful", f.getFileName() + " is uploaded.");
              FacesContext.getCurrentInstance().addMessage(null, message);
          }
      }
  */

  public UploadedFile getBonLiv() {
    return bonLiv;
  }

  public void setBonLiv(UploadedFile bonLiv) {
    this.bonLiv = bonLiv;
  }

  // pour deposer plusieures fichiers
  /*
      public UploadedFiles getFiles() {
          return files;
      }

      public void setFiles(UploadedFiles files) {
          this.files = files;
      }
  */

  public String getDropZoneText() {
    return dropZoneText;
  }

  public void setDropZoneText(String dropZoneText) {
    this.dropZoneText = dropZoneText;
  }
}
