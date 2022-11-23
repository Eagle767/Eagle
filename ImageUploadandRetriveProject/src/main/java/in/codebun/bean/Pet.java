package in.codebun.bean;
import java.sql.Blob;
public class Pet {
 private int id;
 private String petName;
 private String petOwner;
 private String petBreed;
 private Blob petPhoto;
 public int getId() {
  return id;
 }
 public void setId(int id) {
  this.id = id;
 }
 public String getPetName() {
  return petName;
 }
 public void setPetName(String petName) {
  this.petName = petName;
 }
 public String getPetOwner() {
  return petOwner;
 }
 public void setPetOwner(String petOwner) {
  this.petOwner = petOwner;
 }
 public String getPetBreed() {
  return petBreed;
 }
 public void setPetBreed(String petBreed) {
  this.petBreed = petBreed;
 }
 public Blob getPetPhoto() {
  return petPhoto;
 }
 public void setPetPhoto(Blob petPhoto) {
  this.petPhoto = petPhoto;
 } }