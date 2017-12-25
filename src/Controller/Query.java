package Controller;

import Grammar.utils.S;
import Model.Flight;

import java.util.ArrayList;
import java.util.HashMap;

public class Query {
    private HashMap<String, Flight> flightData;

    public Query() {
        flightData = new HashMap<>();
        flightData.put("F1", new Flight("F1", "17:00HR", "HUE", "15:00HR", "HCMC"));
        flightData.put("F2", new Flight("F2", "16:00HR", "HCMC", "14:30HR", "HUE"));
        flightData.put("F3", new Flight("F3", "20:00HR", "HUE", "18:30HR", "HCMC"));
        flightData.put("F4", new Flight("F4", "10:00HR", "HCMC", "8:30HR", "HUE"));
//        flightData.put("F5", new Flight("F5", "13:00HR", "HCMC", "15:00HR", "HUE"));
//        flightData.put("F6", new Flight("F6", "13:00HR", "HCMC", "17:00HR", "HUE"));

    }

    public String printAll(S s) {
        String dest = null;
        switch (s.dest) {
            case "Huế":
                dest = "HUE";
                break;
            case "Hồ Chí Minh":
                dest = "HCMC";
        }
        switch (s.wh) {
            case "f1":
                return getFlights(dest, s.at);
            case "at":
                return getATime(dest);
            case "dt":
                return getDTime(dest);
        }
        return "Not found";
    }

    private String getFlights(String dest, String atime) {
        ArrayList<String> result = new ArrayList<>();
        flightData.forEach((s, flight) -> {
            if (flight.aloc.equals(dest) && flight.atime.equals(atime))
                result.add(s);
        });
        if (result.isEmpty())
            return "Not found";
        return String.join(", ", result);
    }

    private String getATime(String dest) {
        ArrayList<String> result = new ArrayList<>();
        flightData.forEach((s, flight) -> {
            if (flight.aloc.equals(dest))
                result.add(flight.atime);
        });
        if (result.isEmpty())
            return "Not found";
        return String.join(", ", result);
    }

    private String getDTime(String dest) {
        ArrayList<String> result = new ArrayList<>();
        flightData.forEach((s, flight) -> {
            if (flight.aloc.equals(dest))
                result.add(flight.dtime);
        });
        if (result.isEmpty())
            return "Not found";
        return String.join(", ", result);
    }
}
