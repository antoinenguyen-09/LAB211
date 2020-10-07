public class Fresher extends Candidate{
    private int graduate_date;
    private int graduate_rank;
    private String uni_edu;

    public Fresher(int id, String phone, String firstname, String lastname, String address, int birthDate, int typeCandidate, String email, int graduate_date, int graduate_rank, String uni_edu) {
        super(id, phone, firstname, lastname, address, birthDate, typeCandidate, email);
        this.graduate_date = graduate_date;
        this.graduate_rank = graduate_rank;
        this.uni_edu = uni_edu;
    }

    public int getGraduate_date() {
        return graduate_date;
    }

    public int getGraduate_rank() {
        return graduate_rank;
    }

    public String getUni_edu() {
        return uni_edu;
    }

    public void setGraduate_date(int graduate_date) {
        this.graduate_date = graduate_date;
    }

    public void setGraduate_rank(int graduate_rank) {
        this.graduate_rank = graduate_rank;
    }

    public void setUni_edu(String uni_edu) {
        this.uni_edu = uni_edu;
    }
}
