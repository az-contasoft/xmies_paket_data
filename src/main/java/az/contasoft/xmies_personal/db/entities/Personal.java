package az.contasoft.xmies_personal.db.entities;

import java.io.Serializable;
import java.util.Date;

public class Personal implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idPersonal;
    private String personalName;
    private String personalSurName;
    private String personalMotherName;
    private String personalFatherName;
    private Date personalBirthDate;
    private int personalGenderProperty;
    private int personalCitizenshipProperty; // milliyetibloo
    private int bloodType;
    private int personalMaritalStatusPro; // ishci ailə vəziyyəti
    private int personalEducationPro;  // ishci tehsili
    private  long personalJobsProperty;
    private long personalDepartmentPro;  // ishchinin hekim ,professor olmagi
    private int personalMilitaryStatusPro;
    private int personalTitleProperty;
    private Date startedDatePersonal;  //ishchinin ishe bashlama tarixi
    private Date finishedDatePersonal;
    private String phone;
    private String mail;
    private long idAddress;
    private int isDeleted;

    public Personal() {
    }

    @Override
    public String toString() {
        return "Personal{" +
                "idPersonal=" + idPersonal +
                ", personalName='" + personalName + '\'' +
                ", personalSurName='" + personalSurName + '\'' +
                ", personalMotherName='" + personalMotherName + '\'' +
                ", personalFatherName='" + personalFatherName + '\'' +
                ", personalBirthDate=" + personalBirthDate +
                ", personalGenderProperty=" + personalGenderProperty +
                ", personalCitizenshipProperty=" + personalCitizenshipProperty +
                ", bloodType=" + bloodType +
                ", personalMaritalStatusPro=" + personalMaritalStatusPro +
                ", personalEducationPro=" + personalEducationPro +
                ", personalJobsProperty=" + personalJobsProperty +
                ", personalMilitaryStatusPro=" + personalMilitaryStatusPro +
                ", personalTitleProperty=" + personalTitleProperty +
                ", personalDepartmentPro=" + personalDepartmentPro +
                ", startedDatePersonal=" + startedDatePersonal +
                ", finishedDatePersonal=" + finishedDatePersonal +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", idAddress=" + idAddress +
                ", isDeleted=" + isDeleted +
                '}';
    }

    public long getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Long idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public String getPersonalSurName() {
        return personalSurName;
    }

    public void setPersonalSurName(String personalSurName) {
        this.personalSurName = personalSurName;
    }

    public String getPersonalMotherName() {
        return personalMotherName;
    }

    public void setPersonalMotherName(String personalMotherName) {
        this.personalMotherName = personalMotherName;
    }

    public String getPersonalFatherName() {
        return personalFatherName;
    }

    public void setPersonalFatherName(String personalFatherName) {
        this.personalFatherName = personalFatherName;
    }

    public Date getPersonalBirthDate() {
        return personalBirthDate;
    }

    public void setPersonalBirthDate(Date personalBirthDate) {
        this.personalBirthDate = personalBirthDate;
    }

    public int getPersonalGenderProperty() {
        return personalGenderProperty;
    }

    public void setPersonalGenderProperty(int personalGenderProperty) {
        this.personalGenderProperty = personalGenderProperty;
    }

    public int getPersonalCitizenshipProperty() {
        return personalCitizenshipProperty;
    }

    public void setPersonalCitizenshipProperty(int personalCitizenshipProperty) {
        this.personalCitizenshipProperty = personalCitizenshipProperty;
    }

    public int getBloodType() {
        return bloodType;
    }

    public void setBloodType(int bloodType) {
        this.bloodType = bloodType;
    }

    public int getPersonalMaritalStatusPro() {
        return personalMaritalStatusPro;
    }

    public void setPersonalMaritalStatusPro(int personalMaritalStatusPro) {
        this.personalMaritalStatusPro = personalMaritalStatusPro;
    }

    public int getPersonalEducationPro() {
        return personalEducationPro;
    }

    public void setPersonalEducationPro(int personalEducationPro) {
        this.personalEducationPro = personalEducationPro;
    }

    public long getPersonalJobsProperty() {
        return personalJobsProperty;
    }

    public void setPersonalJobsProperty(Long personalJobsProperty) {
        this.personalJobsProperty = personalJobsProperty;
    }

    public int getPersonalMilitaryStatusPro() {
        return personalMilitaryStatusPro;
    }

    public void setPersonalMilitaryStatusPro(int personalMilitaryStatusPro) {
        this.personalMilitaryStatusPro = personalMilitaryStatusPro;
    }

    public int getPersonalTitleProperty() {
        return personalTitleProperty;
    }

    public void setPersonalTitleProperty(int personalTitleProperty) {
        this.personalTitleProperty = personalTitleProperty;
    }

    public long getPersonalDepartmentPro() {
        return personalDepartmentPro;
    }

    public void setPersonalDepartmentPro(Long personalDepartmentPro) {
        this.personalDepartmentPro = personalDepartmentPro;
    }

    public Date getStartedDatePersonal() {
        return startedDatePersonal;
    }

    public void setStartedDatePersonal(Date startedDatePersonal) {
        this.startedDatePersonal = startedDatePersonal;
    }

    public Date getFinishedDatePersonal() {
        return finishedDatePersonal;
    }

    public void setFinishedDatePersonal(Date finishedDatePersonal) {
        this.finishedDatePersonal = finishedDatePersonal;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(long idAddress) {
        this.idAddress = idAddress;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Personal(String personalName, String personalSurName, String personalMotherName, String personalFatherName, Date personalBirthDate, int personalGenderProperty, int personalCitizenshipProperty, int bloodType, int personalMaritalStatusPro, int personalEducationPro, Long personalJobsProperty, int personalMilitaryStatusPro, int personalTitleProperty, Long personalDepartmentPro, Date startedDatePersonal, Date finishedDatePersonal, String phone, String mail, long idAddress, int isDeleted) {
        this.personalName = personalName;
        this.personalSurName = personalSurName;
        this.personalMotherName = personalMotherName;
        this.personalFatherName = personalFatherName;
        this.personalBirthDate = personalBirthDate;
        this.personalGenderProperty = personalGenderProperty;
        this.personalCitizenshipProperty = personalCitizenshipProperty;
        this.bloodType = bloodType;
        this.personalMaritalStatusPro = personalMaritalStatusPro;
        this.personalEducationPro = personalEducationPro;
        this.personalJobsProperty = personalJobsProperty;
        this.personalMilitaryStatusPro = personalMilitaryStatusPro;
        this.personalTitleProperty = personalTitleProperty;
        this.personalDepartmentPro = personalDepartmentPro;
        this.startedDatePersonal = startedDatePersonal;
        this.finishedDatePersonal = finishedDatePersonal;
        this.phone = phone;
        this.mail = mail;
        this.idAddress = idAddress;
        this.isDeleted = isDeleted;
    }


}