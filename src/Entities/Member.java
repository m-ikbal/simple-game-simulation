package Entities;

import java.util.Date;

public class Member extends Customer {

    private String nationalityId;
    private Date dateOfBirth;

    public Member() {

    }

    public Member(Date dateOfBirth, String nationalityId) {
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
