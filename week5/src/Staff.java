public class Staff extends Person {
    private String school;
    private double pay;

    /** Constructor with staff's attributes. */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /** Get school. */
    public String getSchool() {
        return school;
    }

    /** Set school. */
    public void setSchool(String school) {
        this.school = school;
    }

    /** Get pay. */
    public double getPay() {
        return pay;
    }

    /** Set pay. */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /** toString() method. */
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}
