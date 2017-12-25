grammar nlp;

options {
    language=Java;
}

WS:             ' ';
CITY_NAME:      'Hồ Chí Minh' | 'Huế';
CITY_N:         'city';
P_TIME:         'at';
FLIGHT_N:       'flight';
A_FLIGHT_V:     'come' | 'comes' | 'arrive' | 'arrives';
D_FLIGHT_V:     'fly' | 'flies' | 'depart' | 'departs' | 'leave' | 'leaves';
DET:            'the';
WH_QUERY:       'what time does' | 'when does' | 'which';

TIME_MOD:      [0-2]?[0-9] ':' [0-9][0-9] 'HR';

city_np:        CITY_NAME WS 'city' | DET WS 'city';
flight_dest:    ('to' | 'for') WS city_np;
flight_time:    TIME_MOD | P_TIME WS TIME_MOD;
flight_v:       A_FLIGHT_V | D_FLIGHT_V;
flight_vp:      flight_v | flight_v WS flight_time;
flight_cnp:     FLIGHT_N | flight_cnp WS flight_dest;
flight_np:      DET WS flight_cnp | flight_cnp;
s:              WH_QUERY WS flight_np WS flight_vp;

