package Grammar.astgen;

import Grammar.parser.nlpBaseVisitor;
import Grammar.parser.nlpParser;

public class SyntaxStructureGeneration extends nlpBaseVisitor {

    public Object visitCity_np(nlpParser.City_npContext ctx) {
        if (ctx.CITY_NAME() != null) {
            return "CITY-NP(CITY-NAME(" + ctx.CITY_NAME().getText() + ") CITY-N(city)" + ")";
        }
        return "FLIGHT-NP(" + ctx.DET().getText() + " CITY-N(city))";
    }

    public Object visitFlight_dest(nlpParser.Flight_destContext ctx) {
        return "FLIGHT-DEST(" + ctx.getChild(0).getText() + " " + ctx.city_np().accept(this) + ")";
    }

    public Object visitFlight_time(nlpParser.Flight_timeContext ctx) {
        return "FLIGHT-TIME(" + (ctx.P_TIME() != null ? "P-TIME(" + ctx.P_TIME().getText() + ") " : "") + "TIME-MOD(" + ctx.TIME_MOD().getText() + "))";
    }

    public Object visitFlight_vp(nlpParser.Flight_vpContext ctx) {
        return "FLIGHT-VP(FLIGHT-V(" + ctx.flight_v().getText() + ")"
                + (ctx.flight_time() != null ? " " + ctx.flight_time().accept(this) : "") + ")";
    }

    public Object visitFlight_cnp(nlpParser.Flight_cnpContext ctx) {
        if (ctx.FLIGHT_N() != null) {
            return "FLIGHT-CNP(FLIGHT-N(" + ctx.FLIGHT_N().getText() + "))";
        }
        return "FLIGHT-CNP(" + ctx.flight_cnp().accept(this) + " " + ctx.flight_dest().accept(this) + ")";
    }

    public Object visitFlight_np(nlpParser.Flight_npContext ctx) {

        return "FLIGHT-NP(" + (ctx.DET() != null ? ctx.DET().getText() + " " : "") + ctx.flight_cnp().accept(this) + ")";
    }

    public Object visitS(nlpParser.SContext ctx) {
        String whQuery = "WH-QUERY(" + ctx.WH_QUERY().getText() + ")";
        String flightNp = (String) ctx.flight_np().accept(this);
        String flightVp = (String) ctx.flight_vp().accept(this);
        return "S(" + whQuery + " " + flightNp + " " + flightVp +")";
    }
}
