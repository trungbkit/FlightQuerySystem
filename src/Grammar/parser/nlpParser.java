// Generated from /media/trungbkit/DATA/document/OneDrive/4thYear/Xu ly ngon ngu tu nhien/NLP/src/Grammar/nlp.g4 by ANTLR 4.7
package Grammar.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class nlpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, CITY_NAME=4, CITY_N=5, P_TIME=6, FLIGHT_N=7, A_FLIGHT_V=8, 
		D_FLIGHT_V=9, DET=10, WH_QUERY=11, TIME_MOD=12;
	public static final int
		RULE_city_np = 0, RULE_flight_dest = 1, RULE_flight_time = 2, RULE_flight_v = 3, 
		RULE_flight_vp = 4, RULE_flight_cnp = 5, RULE_flight_np = 6, RULE_s = 7;
	public static final String[] ruleNames = {
		"city_np", "flight_dest", "flight_time", "flight_v", "flight_vp", "flight_cnp", 
		"flight_np", "s"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'to'", "'for'", "' '", null, "'city'", "'at'", "'flight'", null, 
		null, "'the'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "WS", "CITY_NAME", "CITY_N", "P_TIME", "FLIGHT_N", "A_FLIGHT_V", 
		"D_FLIGHT_V", "DET", "WH_QUERY", "TIME_MOD"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "nlp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public nlpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class City_npContext extends ParserRuleContext {
		public TerminalNode CITY_NAME() { return getToken(nlpParser.CITY_NAME, 0); }
		public TerminalNode WS() { return getToken(nlpParser.WS, 0); }
		public TerminalNode DET() { return getToken(nlpParser.DET, 0); }
		public City_npContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_city_np; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nlpVisitor ) return ((nlpVisitor<? extends T>)visitor).visitCity_np(this);
			else return visitor.visitChildren(this);
		}
	}

	public final City_npContext city_np() throws RecognitionException {
		City_npContext _localctx = new City_npContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_city_np);
		try {
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CITY_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(CITY_NAME);
				setState(17);
				match(WS);
				setState(18);
				match(CITY_N);
				}
				break;
			case DET:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(DET);
				setState(20);
				match(WS);
				setState(21);
				match(CITY_N);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Flight_destContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(nlpParser.WS, 0); }
		public City_npContext city_np() {
			return getRuleContext(City_npContext.class,0);
		}
		public Flight_destContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flight_dest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nlpVisitor ) return ((nlpVisitor<? extends T>)visitor).visitFlight_dest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flight_destContext flight_dest() throws RecognitionException {
		Flight_destContext _localctx = new Flight_destContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_flight_dest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(25);
			match(WS);
			setState(26);
			city_np();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Flight_timeContext extends ParserRuleContext {
		public TerminalNode TIME_MOD() { return getToken(nlpParser.TIME_MOD, 0); }
		public TerminalNode P_TIME() { return getToken(nlpParser.P_TIME, 0); }
		public TerminalNode WS() { return getToken(nlpParser.WS, 0); }
		public Flight_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flight_time; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nlpVisitor ) return ((nlpVisitor<? extends T>)visitor).visitFlight_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flight_timeContext flight_time() throws RecognitionException {
		Flight_timeContext _localctx = new Flight_timeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_flight_time);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIME_MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(TIME_MOD);
				}
				break;
			case P_TIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(P_TIME);
				setState(30);
				match(WS);
				setState(31);
				match(TIME_MOD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Flight_vContext extends ParserRuleContext {
		public TerminalNode A_FLIGHT_V() { return getToken(nlpParser.A_FLIGHT_V, 0); }
		public TerminalNode D_FLIGHT_V() { return getToken(nlpParser.D_FLIGHT_V, 0); }
		public Flight_vContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flight_v; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nlpVisitor ) return ((nlpVisitor<? extends T>)visitor).visitFlight_v(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flight_vContext flight_v() throws RecognitionException {
		Flight_vContext _localctx = new Flight_vContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_flight_v);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==A_FLIGHT_V || _la==D_FLIGHT_V) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Flight_vpContext extends ParserRuleContext {
		public Flight_vContext flight_v() {
			return getRuleContext(Flight_vContext.class,0);
		}
		public TerminalNode WS() { return getToken(nlpParser.WS, 0); }
		public Flight_timeContext flight_time() {
			return getRuleContext(Flight_timeContext.class,0);
		}
		public Flight_vpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flight_vp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nlpVisitor ) return ((nlpVisitor<? extends T>)visitor).visitFlight_vp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flight_vpContext flight_vp() throws RecognitionException {
		Flight_vpContext _localctx = new Flight_vpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_flight_vp);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				flight_v();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				flight_v();
				setState(38);
				match(WS);
				setState(39);
				flight_time();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Flight_cnpContext extends ParserRuleContext {
		public TerminalNode FLIGHT_N() { return getToken(nlpParser.FLIGHT_N, 0); }
		public Flight_cnpContext flight_cnp() {
			return getRuleContext(Flight_cnpContext.class,0);
		}
		public TerminalNode WS() { return getToken(nlpParser.WS, 0); }
		public Flight_destContext flight_dest() {
			return getRuleContext(Flight_destContext.class,0);
		}
		public Flight_cnpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flight_cnp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nlpVisitor ) return ((nlpVisitor<? extends T>)visitor).visitFlight_cnp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flight_cnpContext flight_cnp() throws RecognitionException {
		return flight_cnp(0);
	}

	private Flight_cnpContext flight_cnp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Flight_cnpContext _localctx = new Flight_cnpContext(_ctx, _parentState);
		Flight_cnpContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_flight_cnp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(44);
			match(FLIGHT_N);
			}
			_ctx.stop = _input.LT(-1);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Flight_cnpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_flight_cnp);
					setState(46);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(47);
					match(WS);
					setState(48);
					flight_dest();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Flight_npContext extends ParserRuleContext {
		public TerminalNode DET() { return getToken(nlpParser.DET, 0); }
		public TerminalNode WS() { return getToken(nlpParser.WS, 0); }
		public Flight_cnpContext flight_cnp() {
			return getRuleContext(Flight_cnpContext.class,0);
		}
		public Flight_npContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flight_np; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nlpVisitor ) return ((nlpVisitor<? extends T>)visitor).visitFlight_np(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flight_npContext flight_np() throws RecognitionException {
		Flight_npContext _localctx = new Flight_npContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_flight_np);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DET:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(DET);
				setState(55);
				match(WS);
				setState(56);
				flight_cnp(0);
				}
				break;
			case FLIGHT_N:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				flight_cnp(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SContext extends ParserRuleContext {
		public TerminalNode WH_QUERY() { return getToken(nlpParser.WH_QUERY, 0); }
		public List<TerminalNode> WS() { return getTokens(nlpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(nlpParser.WS, i);
		}
		public Flight_npContext flight_np() {
			return getRuleContext(Flight_npContext.class,0);
		}
		public Flight_vpContext flight_vp() {
			return getRuleContext(Flight_vpContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nlpVisitor ) return ((nlpVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(WH_QUERY);
			setState(61);
			match(WS);
			setState(62);
			flight_np();
			setState(63);
			match(WS);
			setState(64);
			flight_vp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return flight_cnp_sempred((Flight_cnpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean flight_cnp_sempred(Flight_cnpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16E\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2\31\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4#\n\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\5\6,\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\64\n\7\f\7\16\7\67"+
		"\13\7\3\b\3\b\3\b\3\b\5\b=\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\2\3\f\n\2\4"+
		"\6\b\n\f\16\20\2\4\3\2\3\4\3\2\n\13\2A\2\30\3\2\2\2\4\32\3\2\2\2\6\"\3"+
		"\2\2\2\b$\3\2\2\2\n+\3\2\2\2\f-\3\2\2\2\16<\3\2\2\2\20>\3\2\2\2\22\23"+
		"\7\6\2\2\23\24\7\5\2\2\24\31\7\7\2\2\25\26\7\f\2\2\26\27\7\5\2\2\27\31"+
		"\7\7\2\2\30\22\3\2\2\2\30\25\3\2\2\2\31\3\3\2\2\2\32\33\t\2\2\2\33\34"+
		"\7\5\2\2\34\35\5\2\2\2\35\5\3\2\2\2\36#\7\16\2\2\37 \7\b\2\2 !\7\5\2\2"+
		"!#\7\16\2\2\"\36\3\2\2\2\"\37\3\2\2\2#\7\3\2\2\2$%\t\3\2\2%\t\3\2\2\2"+
		"&,\5\b\5\2\'(\5\b\5\2()\7\5\2\2)*\5\6\4\2*,\3\2\2\2+&\3\2\2\2+\'\3\2\2"+
		"\2,\13\3\2\2\2-.\b\7\1\2./\7\t\2\2/\65\3\2\2\2\60\61\f\3\2\2\61\62\7\5"+
		"\2\2\62\64\5\4\3\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2"+
		"\2\2\66\r\3\2\2\2\67\65\3\2\2\289\7\f\2\29:\7\5\2\2:=\5\f\7\2;=\5\f\7"+
		"\2<8\3\2\2\2<;\3\2\2\2=\17\3\2\2\2>?\7\r\2\2?@\7\5\2\2@A\5\16\b\2AB\7"+
		"\5\2\2BC\5\n\6\2C\21\3\2\2\2\7\30\"+\65<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}