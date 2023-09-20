package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dateofbirth;
    private String radiot;
    private String checkboxlike;
    private String checkboxsend;
    private String contactmethod;
    
    
    public User() {
        firstName = "";
        lastName = "";
        email = "";
        dateofbirth="";
        radiot="";
        checkboxlike="";
        checkboxsend="";
        contactmethod="";
    }
    
    public User(String firstName, String lastName, String email, String dateofbirth,String radiot,String
            checkboxlike,String checkboxsend,String contactmethod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateofbirth=dateofbirth;
        this.radiot=radiot;
        this.checkboxlike=checkboxlike;
        this.checkboxsend=checkboxsend;
        this.contactmethod=contactmethod;
    }
        public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getcontactmethod() {
        return contactmethod;
    }

    public void setcontactmethod(String contactmethod) {
        this.contactmethod = contactmethod;
    }
    public String getcheckboxsend() {
        return checkboxsend;
    }

    public void setcheckboxsend(String checkboxsend) {
        this.checkboxsend = checkboxsend;
    }
      public String getcheckboxlike() {
        return checkboxlike;
    }

    public void setcheckboxlike(String checkboxlike) {
        this.checkboxlike = checkboxlike;
    }
    

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getdateofbirth() {
        return dateofbirth;
    }

    public void setdateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
    public String getradiot() {
        return radiot;
    }

    public void setridot(String radiot) {
        this.radiot = radiot;
    }
}

