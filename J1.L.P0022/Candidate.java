public class Candidate {
    private int id;
    private String firstname, lastname, address, phone, email;
    private int birthDate;
    private int typeCandidate;

    public Candidate(int id, String phone, String firstname, String lastname, String address, int birthDate, int typeCandidate, String email) {
        this.id = id;
        this.phone = phone;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.birthDate = birthDate;
        this.typeCandidate = typeCandidate;
        this.email = email;
    }
    
    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
    
    public int getTypeCandidate() {
        return typeCandidate;
    }

    public void setTypeCandidate(int typeCandidate) {
        this.typeCandidate = typeCandidate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void print() {
        System.out.println(id+" | "+firstname+" "+lastname+" | "+birthDate+" | "+address+" | "+phone+" | "+email+" | "+typeCandidate);
    } 
}
