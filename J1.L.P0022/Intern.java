public class Intern extends Candidate{
    private String majors, uni_name;
    private int semester;

    public Intern(int id, String phone, String firstname, String lastname, String address, int birthDate, int typeCandidate, String email, String majors, int semester, String uni_name) {
        super(id, phone, firstname, lastname, address, birthDate, typeCandidate, email);
        this.majors = majors;
        this.uni_name = uni_name;
        this.semester = semester;
    }

    public String getMajors() {
        return majors;
    }

    public String getUni_name() {
        return uni_name;
    }

    public int getSemester() {
        return semester;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public void setUni_name(String uni_name) {
        this.uni_name = uni_name;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
