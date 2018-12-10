package javaportfoliocit360.MVC.Model;

public class Student {
   
    public String firstName;
    public String lastName;
    public long idNo;

    public Student() {
    }

    public String getFirstName() {
       return firstName;
    }

    public void setFirstName(String firstName) {
       this.firstName = firstName;
    }

    public String getLastName() {
       return lastName;
    }

    public void setLastName(String lastName) {
       this.lastName = lastName;
    }

    public long getIdNo() {
       return idNo;
    }

    public void setIdNo(long idNo) {
       this.idNo = idNo;
    }

    @Override
    public String toString() {

         return new StringBuffer(" First Name: ").append(this.firstName)
                         .append(", Last Name : ").append(this.lastName)
                         .append(", Id Number : ").append(this.idNo).toString();
     }
}