package Grammar.utils;

public class S {
    public String wh;
    public String source;
    public String dest;
    public String at;
    public String dt;

    public S() {
        this.wh = "f1";
        this.source = null;
        this.dest = null;
        this.at = null;
        this.dt = null;
    }

    public String toLogicalForm() {
        return "(WH " + wh + ": (& (FLIGHT f1)"
                + (dest != null ? "(DEST f1(NAME h1 \"" + dest + "\"))" : "")
                + (source != null ? "(DEST f1(NAME h1 \"" + source + "\"))" : "")
                + ")"
                + (at != null ? "(ARRIVE a1(NAME t1 \"" + at + "\"))" : "")
                + (dt != null ? "(LEAVE l1(NAME t1 \"" + dt + "\"))" : "")
                + ")" ;
    }
    public String toSematic() {
        return "(PRINT-ALL ?" + (wh.equals("f1") ? "f" : wh) +
                " (FLIGHT ?f) (ATIME ?f " +
                (dest != null ? dest : "?d") + " " +
                (at != null ? at : "?at") +
                ") (DTIME ?f " +
                (source != null ? source : "?s") + " " +
                (dt != null ? dt : "?dt") +
                "))";
    }
}
