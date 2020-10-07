public class Experience extends Candidate{
    private int yearExp;
    private String proskill;
    
    public Experience(int id, String phone, String firstname, String lastname, String address, int birthDate, int typeCandidate, String email, int yearExp, String proskill){
        super(id, phone, firstname, lastname, address, birthDate, typeCandidate, email);
        this.yearExp = yearExp;
        this.proskill = proskill;
    }

    public int getYearExp() {
        return yearExp;
    }

    public String getProskill() {
        return proskill;
    }

    public void setYearExp(int yearExp) {
        this.yearExp = yearExp;
    }

    public void setProskill(String proskill) {
        this.proskill = proskill;
    }
}
