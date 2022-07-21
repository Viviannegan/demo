/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;
import org.primefaces.util.EscapeUtils;

/**
 * @author v_v_v
 */
@Named
@RequestScoped
public class FileUploadView {
  private UploadedFile file;
  // private UploadedFiles files;
  private String dropZoneText = "Drop zone p:inputTextarea demo.";

  public void upload() {
    if (file != null) {
      FacesMessage message = new FacesMessage("Successful", file.getFileName() + " is uploaded.");
      FacesContext.getCurrentInstance().addMessage(null, message);
    }
  }
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
  /*
      public void handleFilesUpload(FilesUploadEvent event) {
          for (UploadedFile f : event.getFiles().getFiles()) {
              FacesMessage message = new FacesMessage("Successful", f.getFileName() + " is uploaded.");
              FacesContext.getCurrentInstance().addMessage(null, message);
          }
      }
  */

  public UploadedFile getFile() {
    return file;
  }

  public void setFile(UploadedFile file) {
    this.file = file;
  }
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
