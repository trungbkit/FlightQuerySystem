package Grammar.astgen;

import Grammar.parser.nlpBaseVisitor;
import Grammar.parser.nlpParser;
import Grammar.utils.FlightNP;
import Grammar.utils.FlightVP;
import Grammar.utils.S;

public class ASTGeneration extends nlpBaseVisitor {
    @Override
    public Object visitCity_np(nlpParser.City_npContext ctx) {
        return ctx.CITY_NAME().getText();
    }

    @Override
    public Object visitFlight_dest(nlpParser.Flight_destContext ctx) {
        return ctx.city_np().accept(this);
    }

    @Override
    public Object visitFlight_time(nlpParser.Flight_timeContext ctx) {
        return ctx.TIME_MOD().getText();
    }

    @Override
    public Object visitFlight_v(nlpParser.Flight_vContext ctx) {
        FlightVP flightVP = new FlightVP();
        flightVP.isArrive = ctx.A_FLIGHT_V() != null;
        return flightVP;
    }

    @Override
    public Object visitFlight_vp(nlpParser.Flight_vpContext ctx) {
        FlightVP flightVP = (FlightVP) ctx.flight_v().accept(this);
        if (ctx.flight_time() != null) {
            flightVP.time = (String) ctx.flight_time().accept(this);
        }
        return flightVP;
    }

    @Override
    public Object visitFlight_cnp(nlpParser.Flight_cnpContext ctx) {
        if (ctx.flight_dest() != null) {
            String dest = (String) ctx.flight_dest().accept(this);
            FlightNP flightNP = new FlightNP(dest);
            flightNP.isDest = true;
            return flightNP;
        }
        return null;
    }

    @Override
    public Object visitFlight_np(nlpParser.Flight_npContext ctx) {
        return ctx.flight_cnp().accept(this);
    }

    @Override
    public Object visitS(nlpParser.SContext ctx) {
        String wh = ctx.WH_QUERY().getText();
        FlightNP flightNP = (FlightNP) ctx.flight_np().accept(this);
        FlightVP flightVP = (FlightVP) ctx.flight_vp().accept(this);

        S s = new S();
        if (!wh.equals("which") && flightVP != null) {
            s.wh = flightVP.isArrive ? "at" : "dt";
        }
        if (flightNP != null) {
            if (flightNP.isDest) {
                s.dest = flightNP.loc;
            }
            else {
                s.source = flightNP.loc;
            }
        }
        if (flightVP != null) {
            if (flightVP.isArrive) {
                s.at = flightVP.time;
            }
            else {
                s.dt = flightVP.time;
            }
        }
        return s;
    }
}
