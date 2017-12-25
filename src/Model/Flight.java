package Model;

public class Flight {
    public String name;
    public String atime;
    public String aloc;
    public String dtime;
    public String dloc;

    public Flight(String name, String atime, String aloc, String dtime, String dloc) {
        this.name = name;
        this.atime = atime;
        this.aloc = aloc;
        this.dtime = dtime;
        this.dloc = dloc;
    }

    public String toString() {
        return "(FLIGHT " + name + ") (ATIME " + name + " " + aloc + " " + atime + ") " +
                "(DTIME " + name + " " + dloc + " " + dtime + ")\n";
    }
}
