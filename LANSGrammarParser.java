// Generated from java-escape by ANTLR 4.11.1

    import java.io.*;
    import java.util.Vector;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LANSGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_WS=1, TK_LPAREN=2, TK_RPAREN=3, TK_STAR=4, TK_OP_PLUS=5, TK_OP_MINUS=6, 
		TK_OP_DIV=7, TK_OP_INT_DIV=8, TK_OP_MOD=9, TK_OP_MINUS_U=10, TK_OP_EQ=11, 
		TK_OP_NEQ=12, TK_OP_LT=13, TK_OP_GT=14, TK_OP_LEQ=15, TK_OP_GEQ=16, TK_SEMI=17, 
		TK_COMMA=18, TK_DOT=19, TK_COLON=20, TK_LBRACKET=21, TK_RBRACKET=22, TK_EXPONENT=23, 
		TK_ASSIGN_VALUE=24, TK_PC_PROGRAMA=25, TK_PC_FPROGRAMA=26, TK_PC_CONSTANTS=27, 
		TK_PC_FCONSTANTS=28, TK_PC_TIPUS=29, TK_PC_FTIPUS=30, TK_PC_PERIODE=31, 
		TK_PC_PER=32, TK_PC_DE=33, TK_PC_FINS=34, TK_PC_FPER=35, TK_PC_MENTRE=36, 
		TK_PC_FER=37, TK_PC_FMENTRE=38, TK_PC_REPETIR=39, TK_PC_FINSQUE=40, TK_PC_SI=41, 
		TK_PC_LLAVORS=42, TK_PC_ALTRAMENT=43, TK_PC_LLEGIR=44, TK_PC_ESCRIURE=45, 
		TK_PC_ESCRIURELN=46, TK_PC_FSI=47, TK_OP_NOT=48, TK_OP_AND=49, TK_OP_OR=50, 
		TK_OP_QM=51, TK_ENTER=52, TK_NATURAL=53, TK_TIPUS=54, TK_PC_ENTER=55, 
		TK_PC_REAL=56, TK_PC_CAR=57, TK_PC_BOOL=58, TK_PC_DATA=59, TK_BOOLEA=60, 
		TK_PC_CERT=61, TK_PC_FALS=62, TK_PC_VECTOR=63, TK_PC_TUPLA=64, TK_PC_FTUPLA=65, 
		TK_PC_INICI_INDEX=66, TK_PC_MIDA=67, TK_PC_ENT=68, TK_PC_ENTSOR=69, TK_PC_ACCIO=70, 
		TK_PC_FACCIO=71, TK_PC_FUNCIO=72, TK_PC_FFUNCIO=73, TK_PC_VARIABLES=74, 
		TK_PC_FVARIABLES=75, TK_PC_RETURN=76, TK_IDENT=77, TK_REAL=78, TK_ASCII=79, 
		TK_CAR=80, TK_DIA31=81, TK_MESOS31=82, TK_DIA30=83, TK_MESOS30=84, TK_DIA28=85, 
		TK_MES28=86, TK_ANY=87, TK_DATA=88, TK_STRING=89, TK_LINE_COMMENT=90, 
		TK_BLOCK_COMMENT=91;
	public static final int
		RULE_inici = 0, RULE_programa = 1, RULE_dec_constants = 2, RULE_assign_constant = 3, 
		RULE_dec_tipus = 4, RULE_vector = 5, RULE_tupla = 6, RULE_declaracio_tipus_nou = 7, 
		RULE_params_formals_ent = 8, RULE_params_formals_ent_entsor = 9, RULE_dec_accio = 10, 
		RULE_dec_funcio = 11, RULE_dec_acc_func = 12, RULE_imp_accio = 13, RULE_imp_funcio = 14, 
		RULE_imp_acc_func = 15, RULE_dec_variables = 16, RULE_dec_var = 17, RULE_operand = 18, 
		RULE_i = 19, RULE_c = 20, RULE_l = 21, RULE_e = 22, RULE_t = 23, RULE_s = 24, 
		RULE_f = 25, RULE_expressio = 26, RULE_acces_tupla = 27, RULE_acces_vector = 28, 
		RULE_crida_funcio = 29, RULE_sentencia = 30, RULE_llegir = 31, RULE_escriure = 32, 
		RULE_escriure_ln = 33, RULE_assign_variable = 34, RULE_condicional = 35, 
		RULE_mentre = 36, RULE_per = 37, RULE_repetir = 38, RULE_crida_accio = 39, 
		RULE_valor_constant = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"inici", "programa", "dec_constants", "assign_constant", "dec_tipus", 
			"vector", "tupla", "declaracio_tipus_nou", "params_formals_ent", "params_formals_ent_entsor", 
			"dec_accio", "dec_funcio", "dec_acc_func", "imp_accio", "imp_funcio", 
			"imp_acc_func", "dec_variables", "dec_var", "operand", "i", "c", "l", 
			"e", "t", "s", "f", "expressio", "acces_tupla", "acces_vector", "crida_funcio", 
			"sentencia", "llegir", "escriure", "escriure_ln", "assign_variable", 
			"condicional", "mentre", "per", "repetir", "crida_accio", "valor_constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'*'", "'+'", "'-'", "'/'", "'\\'", "'%'", 
			"'~'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "';'", "','", "'.'", 
			"':'", "'['", "']'", "'E'", "':='", "'programa'", "'fprograma'", "'constants'", 
			"'fconstants'", "'tipus'", "'ftipus'", "'periode'", "'per'", "'de'", 
			"'fins'", "'fper'", "'mentre'", "'fer'", "'fmentre'", "'repetir'", "'finsque'", 
			"'si'", "'llavors'", "'altrament'", "'llegir'", "'escriure'", "'escriureln'", 
			"'fsi'", "'no'", "'&'", "'|'", "'?'", null, null, null, "'enter'", "'real'", 
			"'car'", "'boolea'", "'data'", null, "'cert'", "'fals'", "'vector'", 
			"'tupla'", "'ftupla'", "'inici'", "'mida'", "'ent'", "'entsor'", "'accio'", 
			"'faccio'", "'funcio'", "'ffuncio'", "'variables'", "'fvariables'", "'retorna'", 
			null, null, null, null, null, null, null, null, null, "'02'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TK_WS", "TK_LPAREN", "TK_RPAREN", "TK_STAR", "TK_OP_PLUS", "TK_OP_MINUS", 
			"TK_OP_DIV", "TK_OP_INT_DIV", "TK_OP_MOD", "TK_OP_MINUS_U", "TK_OP_EQ", 
			"TK_OP_NEQ", "TK_OP_LT", "TK_OP_GT", "TK_OP_LEQ", "TK_OP_GEQ", "TK_SEMI", 
			"TK_COMMA", "TK_DOT", "TK_COLON", "TK_LBRACKET", "TK_RBRACKET", "TK_EXPONENT", 
			"TK_ASSIGN_VALUE", "TK_PC_PROGRAMA", "TK_PC_FPROGRAMA", "TK_PC_CONSTANTS", 
			"TK_PC_FCONSTANTS", "TK_PC_TIPUS", "TK_PC_FTIPUS", "TK_PC_PERIODE", "TK_PC_PER", 
			"TK_PC_DE", "TK_PC_FINS", "TK_PC_FPER", "TK_PC_MENTRE", "TK_PC_FER", 
			"TK_PC_FMENTRE", "TK_PC_REPETIR", "TK_PC_FINSQUE", "TK_PC_SI", "TK_PC_LLAVORS", 
			"TK_PC_ALTRAMENT", "TK_PC_LLEGIR", "TK_PC_ESCRIURE", "TK_PC_ESCRIURELN", 
			"TK_PC_FSI", "TK_OP_NOT", "TK_OP_AND", "TK_OP_OR", "TK_OP_QM", "TK_ENTER", 
			"TK_NATURAL", "TK_TIPUS", "TK_PC_ENTER", "TK_PC_REAL", "TK_PC_CAR", "TK_PC_BOOL", 
			"TK_PC_DATA", "TK_BOOLEA", "TK_PC_CERT", "TK_PC_FALS", "TK_PC_VECTOR", 
			"TK_PC_TUPLA", "TK_PC_FTUPLA", "TK_PC_INICI_INDEX", "TK_PC_MIDA", "TK_PC_ENT", 
			"TK_PC_ENTSOR", "TK_PC_ACCIO", "TK_PC_FACCIO", "TK_PC_FUNCIO", "TK_PC_FFUNCIO", 
			"TK_PC_VARIABLES", "TK_PC_FVARIABLES", "TK_PC_RETURN", "TK_IDENT", "TK_REAL", 
			"TK_ASCII", "TK_CAR", "TK_DIA31", "TK_MESOS31", "TK_DIA30", "TK_MESOS30", 
			"TK_DIA28", "TK_MES28", "TK_ANY", "TK_DATA", "TK_STRING", "TK_LINE_COMMENT", 
			"TK_BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	     SymTable<Registre> TS = new SymTable<Registre>(1000);
	     Bytecode BC = new Bytecode("ResultatsFitxerCompilat");
	     boolean error = false;
	     Long nVars = 0L;

	     //override method
	     public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e){
	          super.notifyErrorListeners(offendingToken,msg,e);
	          error=true;
	     }

	public LANSGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IniciContext extends ParserRuleContext {
		public ProgramaContext prog;
		public TerminalNode EOF() { return getToken(LANSGrammarParser.EOF, 0); }
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public Dec_constantsContext dec_constants() {
			return getRuleContext(Dec_constantsContext.class,0);
		}
		public Dec_tipusContext dec_tipus() {
			return getRuleContext(Dec_tipusContext.class,0);
		}
		public Dec_acc_funcContext dec_acc_func() {
			return getRuleContext(Dec_acc_funcContext.class,0);
		}
		public Imp_acc_funcContext imp_acc_func() {
			return getRuleContext(Imp_acc_funcContext.class,0);
		}
		public IniciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inici; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterInici(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitInici(this);
		}
	}

	public final IniciContext inici() throws RecognitionException {
		IniciContext _localctx = new IniciContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inici);

		        System.out.println("Inici de compilació");
		        Vector<Long> trad = new Vector<Long>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_CONSTANTS) {
				{
				setState(82);
				dec_constants();
				}
			}

			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_TIPUS) {
				{
				setState(85);
				dec_tipus();
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_ACCIO || _la==TK_PC_FUNCIO) {
				{
				setState(88);
				dec_acc_func();
				}
			}

			setState(91);
			((IniciContext)_localctx).prog = programa();
			trad.addAll(((IniciContext)_localctx).prog.trad);
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(93);
				imp_acc_func();
				}
				break;
			}
			setState(96);
			match(EOF);
			}
			_ctx.stop = _input.LT(-1);

			        trad.add(BC.RETURN);
			        BC.addMainCode(1000L,1000L,trad);
			        BC.write();
			        System.out.println("Fi de compilació");
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public Vector<Long> trad;
		public TerminalNode TK_PC_PROGRAMA() { return getToken(LANSGrammarParser.TK_PC_PROGRAMA, 0); }
		public TerminalNode TK_IDENT() { return getToken(LANSGrammarParser.TK_IDENT, 0); }
		public TerminalNode TK_PC_FPROGRAMA() { return getToken(LANSGrammarParser.TK_PC_FPROGRAMA, 0); }
		public Dec_variablesContext dec_variables() {
			return getRuleContext(Dec_variablesContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);

		        System.out.println("Inici de programa");
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(TK_PC_PROGRAMA);
			setState(99);
			match(TK_IDENT);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(100);
				dec_variables();
				}
			}

			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				sentencia();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 35184372118161L) != 0 );
			setState(108);
			match(TK_PC_FPROGRAMA);
			}
			_ctx.stop = _input.LT(-1);

			        System.out.println("Fi de programa");
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_constantsContext extends ParserRuleContext {
		public TerminalNode TK_PC_CONSTANTS() { return getToken(LANSGrammarParser.TK_PC_CONSTANTS, 0); }
		public TerminalNode TK_PC_FCONSTANTS() { return getToken(LANSGrammarParser.TK_PC_FCONSTANTS, 0); }
		public List<Assign_constantContext> assign_constant() {
			return getRuleContexts(Assign_constantContext.class);
		}
		public Assign_constantContext assign_constant(int i) {
			return getRuleContext(Assign_constantContext.class,i);
		}
		public Dec_constantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_constants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterDec_constants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitDec_constants(this);
		}
	}

	public final Dec_constantsContext dec_constants() throws RecognitionException {
		Dec_constantsContext _localctx = new Dec_constantsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec_constants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(TK_PC_CONSTANTS);
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				assign_constant();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TK_TIPUS );
			setState(116);
			match(TK_PC_FCONSTANTS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_constantContext extends ParserRuleContext {
		public TerminalNode TK_TIPUS() { return getToken(LANSGrammarParser.TK_TIPUS, 0); }
		public TerminalNode TK_IDENT() { return getToken(LANSGrammarParser.TK_IDENT, 0); }
		public TerminalNode TK_ASSIGN_VALUE() { return getToken(LANSGrammarParser.TK_ASSIGN_VALUE, 0); }
		public Valor_constantContext valor_constant() {
			return getRuleContext(Valor_constantContext.class,0);
		}
		public TerminalNode TK_SEMI() { return getToken(LANSGrammarParser.TK_SEMI, 0); }
		public Assign_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterAssign_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitAssign_constant(this);
		}
	}

	public final Assign_constantContext assign_constant() throws RecognitionException {
		Assign_constantContext _localctx = new Assign_constantContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(TK_TIPUS);
			setState(119);
			match(TK_IDENT);
			setState(120);
			match(TK_ASSIGN_VALUE);
			setState(121);
			valor_constant();
			setState(122);
			match(TK_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_tipusContext extends ParserRuleContext {
		public TerminalNode TK_PC_TIPUS() { return getToken(LANSGrammarParser.TK_PC_TIPUS, 0); }
		public TerminalNode TK_PC_FTIPUS() { return getToken(LANSGrammarParser.TK_PC_FTIPUS, 0); }
		public List<Declaracio_tipus_nouContext> declaracio_tipus_nou() {
			return getRuleContexts(Declaracio_tipus_nouContext.class);
		}
		public Declaracio_tipus_nouContext declaracio_tipus_nou(int i) {
			return getRuleContext(Declaracio_tipus_nouContext.class,i);
		}
		public Dec_tipusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_tipus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterDec_tipus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitDec_tipus(this);
		}
	}

	public final Dec_tipusContext dec_tipus() throws RecognitionException {
		Dec_tipusContext _localctx = new Dec_tipusContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dec_tipus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(TK_PC_TIPUS);
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				declaracio_tipus_nou();
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TK_IDENT );
			setState(130);
			match(TK_PC_FTIPUS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VectorContext extends ParserRuleContext {
		public TerminalNode TK_PC_VECTOR() { return getToken(LANSGrammarParser.TK_PC_VECTOR, 0); }
		public TerminalNode TK_TIPUS() { return getToken(LANSGrammarParser.TK_TIPUS, 0); }
		public TerminalNode TK_PC_MIDA() { return getToken(LANSGrammarParser.TK_PC_MIDA, 0); }
		public List<TerminalNode> TK_ENTER() { return getTokens(LANSGrammarParser.TK_ENTER); }
		public TerminalNode TK_ENTER(int i) {
			return getToken(LANSGrammarParser.TK_ENTER, i);
		}
		public TerminalNode TK_PC_INICI_INDEX() { return getToken(LANSGrammarParser.TK_PC_INICI_INDEX, 0); }
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitVector(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(TK_PC_VECTOR);
			setState(133);
			match(TK_TIPUS);
			setState(134);
			match(TK_PC_MIDA);
			setState(135);
			match(TK_ENTER);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_INICI_INDEX) {
				{
				setState(136);
				match(TK_PC_INICI_INDEX);
				setState(137);
				match(TK_ENTER);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TuplaContext extends ParserRuleContext {
		public TerminalNode TK_PC_TUPLA() { return getToken(LANSGrammarParser.TK_PC_TUPLA, 0); }
		public TerminalNode TK_PC_FTUPLA() { return getToken(LANSGrammarParser.TK_PC_FTUPLA, 0); }
		public List<TerminalNode> TK_IDENT() { return getTokens(LANSGrammarParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(LANSGrammarParser.TK_IDENT, i);
		}
		public List<TerminalNode> TK_COLON() { return getTokens(LANSGrammarParser.TK_COLON); }
		public TerminalNode TK_COLON(int i) {
			return getToken(LANSGrammarParser.TK_COLON, i);
		}
		public List<TerminalNode> TK_TIPUS() { return getTokens(LANSGrammarParser.TK_TIPUS); }
		public TerminalNode TK_TIPUS(int i) {
			return getToken(LANSGrammarParser.TK_TIPUS, i);
		}
		public List<TerminalNode> TK_SEMI() { return getTokens(LANSGrammarParser.TK_SEMI); }
		public TerminalNode TK_SEMI(int i) {
			return getToken(LANSGrammarParser.TK_SEMI, i);
		}
		public TuplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterTupla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitTupla(this);
		}
	}

	public final TuplaContext tupla() throws RecognitionException {
		TuplaContext _localctx = new TuplaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tupla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(TK_PC_TUPLA);
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				match(TK_IDENT);
				setState(142);
				match(TK_COLON);
				setState(143);
				match(TK_TIPUS);
				setState(144);
				match(TK_SEMI);
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TK_IDENT );
			setState(149);
			match(TK_PC_FTUPLA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracio_tipus_nouContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(LANSGrammarParser.TK_IDENT, 0); }
		public TerminalNode TK_COLON() { return getToken(LANSGrammarParser.TK_COLON, 0); }
		public TerminalNode TK_SEMI() { return getToken(LANSGrammarParser.TK_SEMI, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public TuplaContext tupla() {
			return getRuleContext(TuplaContext.class,0);
		}
		public Declaracio_tipus_nouContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracio_tipus_nou; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterDeclaracio_tipus_nou(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitDeclaracio_tipus_nou(this);
		}
	}

	public final Declaracio_tipus_nouContext declaracio_tipus_nou() throws RecognitionException {
		Declaracio_tipus_nouContext _localctx = new Declaracio_tipus_nouContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracio_tipus_nou);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(TK_IDENT);
			setState(152);
			match(TK_COLON);
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PC_VECTOR:
				{
				setState(153);
				vector();
				}
				break;
			case TK_PC_TUPLA:
				{
				setState(154);
				tupla();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(157);
			match(TK_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Params_formals_entContext extends ParserRuleContext {
		public List<TerminalNode> TK_IDENT() { return getTokens(LANSGrammarParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(LANSGrammarParser.TK_IDENT, i);
		}
		public List<TerminalNode> TK_COLON() { return getTokens(LANSGrammarParser.TK_COLON); }
		public TerminalNode TK_COLON(int i) {
			return getToken(LANSGrammarParser.TK_COLON, i);
		}
		public List<TerminalNode> TK_TIPUS() { return getTokens(LANSGrammarParser.TK_TIPUS); }
		public TerminalNode TK_TIPUS(int i) {
			return getToken(LANSGrammarParser.TK_TIPUS, i);
		}
		public List<TerminalNode> TK_PC_ENT() { return getTokens(LANSGrammarParser.TK_PC_ENT); }
		public TerminalNode TK_PC_ENT(int i) {
			return getToken(LANSGrammarParser.TK_PC_ENT, i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(LANSGrammarParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(LANSGrammarParser.TK_COMMA, i);
		}
		public Params_formals_entContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_formals_ent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterParams_formals_ent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitParams_formals_ent(this);
		}
	}

	public final Params_formals_entContext params_formals_ent() throws RecognitionException {
		Params_formals_entContext _localctx = new Params_formals_entContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_params_formals_ent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PC_ENT) {
					{
					setState(159);
					match(TK_PC_ENT);
					}
				}

				setState(162);
				match(TK_IDENT);
				setState(163);
				match(TK_COLON);
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==TK_TIPUS || _la==TK_IDENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(165);
					match(TK_COMMA);
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TK_PC_ENT) {
						{
						setState(166);
						match(TK_PC_ENT);
						}
					}

					setState(169);
					match(TK_IDENT);
					setState(170);
					match(TK_COLON);
					setState(171);
					_la = _input.LA(1);
					if ( !(_la==TK_TIPUS || _la==TK_IDENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TK_PC_ENT || _la==TK_IDENT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Params_formals_ent_entsorContext extends ParserRuleContext {
		public List<TerminalNode> TK_IDENT() { return getTokens(LANSGrammarParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(LANSGrammarParser.TK_IDENT, i);
		}
		public List<TerminalNode> TK_COLON() { return getTokens(LANSGrammarParser.TK_COLON); }
		public TerminalNode TK_COLON(int i) {
			return getToken(LANSGrammarParser.TK_COLON, i);
		}
		public List<TerminalNode> TK_TIPUS() { return getTokens(LANSGrammarParser.TK_TIPUS); }
		public TerminalNode TK_TIPUS(int i) {
			return getToken(LANSGrammarParser.TK_TIPUS, i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(LANSGrammarParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(LANSGrammarParser.TK_COMMA, i);
		}
		public List<TerminalNode> TK_PC_ENT() { return getTokens(LANSGrammarParser.TK_PC_ENT); }
		public TerminalNode TK_PC_ENT(int i) {
			return getToken(LANSGrammarParser.TK_PC_ENT, i);
		}
		public List<TerminalNode> TK_PC_ENTSOR() { return getTokens(LANSGrammarParser.TK_PC_ENTSOR); }
		public TerminalNode TK_PC_ENTSOR(int i) {
			return getToken(LANSGrammarParser.TK_PC_ENTSOR, i);
		}
		public Params_formals_ent_entsorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_formals_ent_entsor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterParams_formals_ent_entsor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitParams_formals_ent_entsor(this);
		}
	}

	public final Params_formals_ent_entsorContext params_formals_ent_entsor() throws RecognitionException {
		Params_formals_ent_entsorContext _localctx = new Params_formals_ent_entsorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_params_formals_ent_entsor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PC_ENT || _la==TK_PC_ENTSOR) {
					{
					setState(181);
					_la = _input.LA(1);
					if ( !(_la==TK_PC_ENT || _la==TK_PC_ENTSOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(184);
				match(TK_IDENT);
				setState(185);
				match(TK_COLON);
				setState(186);
				_la = _input.LA(1);
				if ( !(_la==TK_TIPUS || _la==TK_IDENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(187);
					match(TK_COMMA);
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TK_PC_ENT || _la==TK_PC_ENTSOR) {
						{
						setState(188);
						_la = _input.LA(1);
						if ( !(_la==TK_PC_ENT || _la==TK_PC_ENTSOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(191);
					match(TK_IDENT);
					setState(192);
					match(TK_COLON);
					setState(193);
					_la = _input.LA(1);
					if ( !(_la==TK_TIPUS || _la==TK_IDENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 515L) != 0 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_accioContext extends ParserRuleContext {
		public TerminalNode TK_PC_ACCIO() { return getToken(LANSGrammarParser.TK_PC_ACCIO, 0); }
		public TerminalNode TK_IDENT() { return getToken(LANSGrammarParser.TK_IDENT, 0); }
		public TerminalNode TK_LPAREN() { return getToken(LANSGrammarParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(LANSGrammarParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(LANSGrammarParser.TK_SEMI, 0); }
		public Params_formals_ent_entsorContext params_formals_ent_entsor() {
			return getRuleContext(Params_formals_ent_entsorContext.class,0);
		}
		public Dec_accioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_accio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterDec_accio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitDec_accio(this);
		}
	}

	public final Dec_accioContext dec_accio() throws RecognitionException {
		Dec_accioContext _localctx = new Dec_accioContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dec_accio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(TK_PC_ACCIO);
			setState(204);
			match(TK_IDENT);
			setState(205);
			match(TK_LPAREN);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 515L) != 0) {
				{
				setState(206);
				params_formals_ent_entsor();
				}
			}

			setState(209);
			match(TK_RPAREN);
			setState(210);
			match(TK_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_funcioContext extends ParserRuleContext {
		public TerminalNode TK_PC_FUNCIO() { return getToken(LANSGrammarParser.TK_PC_FUNCIO, 0); }
		public TerminalNode TK_IDENT() { return getToken(LANSGrammarParser.TK_IDENT, 0); }
		public TerminalNode TK_LPAREN() { return getToken(LANSGrammarParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(LANSGrammarParser.TK_RPAREN, 0); }
		public TerminalNode TK_PC_RETURN() { return getToken(LANSGrammarParser.TK_PC_RETURN, 0); }
		public TerminalNode TK_TIPUS() { return getToken(LANSGrammarParser.TK_TIPUS, 0); }
		public TerminalNode TK_SEMI() { return getToken(LANSGrammarParser.TK_SEMI, 0); }
		public Params_formals_entContext params_formals_ent() {
			return getRuleContext(Params_formals_entContext.class,0);
		}
		public Dec_funcioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_funcio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterDec_funcio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitDec_funcio(this);
		}
	}

	public final Dec_funcioContext dec_funcio() throws RecognitionException {
		Dec_funcioContext _localctx = new Dec_funcioContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dec_funcio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(TK_PC_FUNCIO);
			setState(213);
			match(TK_IDENT);
			setState(214);
			match(TK_LPAREN);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_ENT || _la==TK_IDENT) {
				{
				setState(215);
				params_formals_ent();
				}
			}

			setState(218);
			match(TK_RPAREN);
			setState(219);
			match(TK_PC_RETURN);
			setState(220);
			match(TK_TIPUS);
			setState(221);
			match(TK_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_acc_funcContext extends ParserRuleContext {
		public List<Dec_accioContext> dec_accio() {
			return getRuleContexts(Dec_accioContext.class);
		}
		public Dec_accioContext dec_accio(int i) {
			return getRuleContext(Dec_accioContext.class,i);
		}
		public List<Dec_funcioContext> dec_funcio() {
			return getRuleContexts(Dec_funcioContext.class);
		}
		public Dec_funcioContext dec_funcio(int i) {
			return getRuleContext(Dec_funcioContext.class,i);
		}
		public Dec_acc_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_acc_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterDec_acc_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitDec_acc_func(this);
		}
	}

	public final Dec_acc_funcContext dec_acc_func() throws RecognitionException {
		Dec_acc_funcContext _localctx = new Dec_acc_funcContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dec_acc_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(225);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_ACCIO:
					{
					setState(223);
					dec_accio();
					}
					break;
				case TK_PC_FUNCIO:
					{
					setState(224);
					dec_funcio();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TK_PC_ACCIO || _la==TK_PC_FUNCIO );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Imp_accioContext extends ParserRuleContext {
		public TerminalNode TK_PC_ACCIO() { return getToken(LANSGrammarParser.TK_PC_ACCIO, 0); }
		public TerminalNode TK_IDENT() { return getToken(LANSGrammarParser.TK_IDENT, 0); }
		public TerminalNode TK_LPAREN() { return getToken(LANSGrammarParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(LANSGrammarParser.TK_RPAREN, 0); }
		public TerminalNode TK_PC_FACCIO() { return getToken(LANSGrammarParser.TK_PC_FACCIO, 0); }
		public Params_formals_ent_entsorContext params_formals_ent_entsor() {
			return getRuleContext(Params_formals_ent_entsorContext.class,0);
		}
		public List<Dec_varContext> dec_var() {
			return getRuleContexts(Dec_varContext.class);
		}
		public Dec_varContext dec_var(int i) {
			return getRuleContext(Dec_varContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Imp_accioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp_accio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterImp_accio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitImp_accio(this);
		}
	}

	public final Imp_accioContext imp_accio() throws RecognitionException {
		Imp_accioContext _localctx = new Imp_accioContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_imp_accio);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(TK_PC_ACCIO);
			setState(230);
			match(TK_IDENT);
			setState(231);
			match(TK_LPAREN);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 515L) != 0) {
				{
				setState(232);
				params_formals_ent_entsor();
				}
			}

			setState(235);
			match(TK_RPAREN);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					dec_var();
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 35184372118161L) != 0) {
				{
				{
				setState(242);
				sentencia();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(TK_PC_FACCIO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Imp_funcioContext extends ParserRuleContext {
		public TerminalNode TK_PC_FUNCIO() { return getToken(LANSGrammarParser.TK_PC_FUNCIO, 0); }
		public TerminalNode TK_IDENT() { return getToken(LANSGrammarParser.TK_IDENT, 0); }
		public TerminalNode TK_LPAREN() { return getToken(LANSGrammarParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(LANSGrammarParser.TK_RPAREN, 0); }
		public List<TerminalNode> TK_PC_RETURN() { return getTokens(LANSGrammarParser.TK_PC_RETURN); }
		public TerminalNode TK_PC_RETURN(int i) {
			return getToken(LANSGrammarParser.TK_PC_RETURN, i);
		}
		public TerminalNode TK_TIPUS() { return getToken(LANSGrammarParser.TK_TIPUS, 0); }
		public ExpressioContext expressio() {
			return getRuleContext(ExpressioContext.class,0);
		}
		public TerminalNode TK_SEMI() { return getToken(LANSGrammarParser.TK_SEMI, 0); }
		public TerminalNode TK_PC_FFUNCIO() { return getToken(LANSGrammarParser.TK_PC_FFUNCIO, 0); }
		public Params_formals_entContext params_formals_ent() {
			return getRuleContext(Params_formals_entContext.class,0);
		}
		public List<Dec_varContext> dec_var() {
			return getRuleContexts(Dec_varContext.class);
		}
		public Dec_varContext dec_var(int i) {
			return getRuleContext(Dec_varContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Imp_funcioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp_funcio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterImp_funcio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitImp_funcio(this);
		}
	}

	public final Imp_funcioContext imp_funcio() throws RecognitionException {
		Imp_funcioContext _localctx = new Imp_funcioContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_imp_funcio);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(TK_PC_FUNCIO);
			setState(251);
			match(TK_IDENT);
			setState(252);
			match(TK_LPAREN);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_ENT || _la==TK_IDENT) {
				{
				setState(253);
				params_formals_ent();
				}
			}

			setState(256);
			match(TK_RPAREN);
			setState(257);
			match(TK_PC_RETURN);
			setState(258);
			match(TK_TIPUS);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(259);
					dec_var();
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 35184372118161L) != 0) {
				{
				{
				setState(265);
				sentencia();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(TK_PC_RETURN);
			setState(272);
			expressio();
			setState(273);
			match(TK_SEMI);
			setState(274);
			match(TK_PC_FFUNCIO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Imp_acc_funcContext extends ParserRuleContext {
		public List<Imp_accioContext> imp_accio() {
			return getRuleContexts(Imp_accioContext.class);
		}
		public Imp_accioContext imp_accio(int i) {
			return getRuleContext(Imp_accioContext.class,i);
		}
		public List<Imp_funcioContext> imp_funcio() {
			return getRuleContexts(Imp_funcioContext.class);
		}
		public Imp_funcioContext imp_funcio(int i) {
			return getRuleContext(Imp_funcioContext.class,i);
		}
		public Imp_acc_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp_acc_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterImp_acc_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitImp_acc_func(this);
		}
	}

	public final Imp_acc_funcContext imp_acc_func() throws RecognitionException {
		Imp_acc_funcContext _localctx = new Imp_acc_funcContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_imp_acc_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PC_ACCIO || _la==TK_PC_FUNCIO) {
				{
				setState(278);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_ACCIO:
					{
					setState(276);
					imp_accio();
					}
					break;
				case TK_PC_FUNCIO:
					{
					setState(277);
					imp_funcio();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_variablesContext extends ParserRuleContext {
		public TerminalNode TK_PC_VARIABLES() { return getToken(LANSGrammarParser.TK_PC_VARIABLES, 0); }
		public TerminalNode TK_PC_FVARIABLES() { return getToken(LANSGrammarParser.TK_PC_FVARIABLES, 0); }
		public List<Dec_varContext> dec_var() {
			return getRuleContexts(Dec_varContext.class);
		}
		public Dec_varContext dec_var(int i) {
			return getRuleContext(Dec_varContext.class,i);
		}
		public Dec_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterDec_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitDec_variables(this);
		}
	}

	public final Dec_variablesContext dec_variables() throws RecognitionException {
		Dec_variablesContext _localctx = new Dec_variablesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dec_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(TK_PC_VARIABLES);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_IDENT) {
				{
				{
				setState(284);
				dec_var();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(TK_PC_FVARIABLES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_varContext extends ParserRuleContext {
		public List<TerminalNode> TK_IDENT() { return getTokens(LANSGrammarParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(LANSGrammarParser.TK_IDENT, i);
		}
		public TerminalNode TK_COLON() { return getToken(LANSGrammarParser.TK_COLON, 0); }
		public TerminalNode TK_SEMI() { return getToken(LANSGrammarParser.TK_SEMI, 0); }
		public TerminalNode TK_TIPUS() { return getToken(LANSGrammarParser.TK_TIPUS, 0); }
		public List<TerminalNode> TK_COMMA() { return getTokens(LANSGrammarParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(LANSGrammarParser.TK_COMMA, i);
		}
		public Dec_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterDec_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitDec_var(this);
		}
	}

	public final Dec_varContext dec_var() throws RecognitionException {
		Dec_varContext _localctx = new Dec_varContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dec_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(TK_IDENT);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(293);
				match(TK_COMMA);
				setState(294);
				match(TK_IDENT);
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			match(TK_COLON);
			setState(301);
			_la = _input.LA(1);
			if ( !(_la==TK_TIPUS || _la==TK_IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(302);
			match(TK_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperandContext extends ParserRuleContext {
		public TerminalNode TK_ENTER() { return getToken(LANSGrammarParser.TK_ENTER, 0); }
		public TerminalNode TK_NATURAL() { return getToken(LANSGrammarParser.TK_NATURAL, 0); }
		public TerminalNode TK_REAL() { return getToken(LANSGrammarParser.TK_REAL, 0); }
		public TerminalNode TK_DATA() { return getToken(LANSGrammarParser.TK_DATA, 0); }
		public TerminalNode TK_BOOLEA() { return getToken(LANSGrammarParser.TK_BOOLEA, 0); }
		public TerminalNode TK_IDENT() { return getToken(LANSGrammarParser.TK_IDENT, 0); }
		public Acces_tuplaContext acces_tupla() {
			return getRuleContext(Acces_tuplaContext.class,0);
		}
		public Acces_vectorContext acces_vector() {
			return getRuleContext(Acces_vectorContext.class,0);
		}
		public Crida_funcioContext crida_funcio() {
			return getRuleContext(Crida_funcioContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operand);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ENTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(TK_ENTER);
				}
				break;
			case TK_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(TK_NATURAL);
				}
				break;
			case TK_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(TK_REAL);
				}
				break;
			case TK_DATA:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				match(TK_DATA);
				}
				break;
			case TK_BOOLEA:
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				match(TK_BOOLEA);
				}
				break;
			case TK_IDENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				match(TK_IDENT);
				setState(313);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_DOT:
					{
					setState(310);
					acces_tupla();
					}
					break;
				case TK_LBRACKET:
					{
					setState(311);
					acces_vector();
					}
					break;
				case TK_LPAREN:
					{
					setState(312);
					crida_funcio();
					}
					break;
				case TK_RPAREN:
				case TK_STAR:
				case TK_OP_PLUS:
				case TK_OP_MINUS:
				case TK_OP_DIV:
				case TK_OP_INT_DIV:
				case TK_OP_MOD:
				case TK_OP_EQ:
				case TK_OP_NEQ:
				case TK_OP_LT:
				case TK_OP_GT:
				case TK_OP_LEQ:
				case TK_OP_GEQ:
				case TK_SEMI:
				case TK_COMMA:
				case TK_COLON:
				case TK_RBRACKET:
				case TK_PC_FINS:
				case TK_PC_FER:
				case TK_PC_LLAVORS:
				case TK_OP_AND:
				case TK_OP_OR:
				case TK_OP_QM:
					break;
				default:
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class IContext extends ParserRuleContext {
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
		}
		public TerminalNode TK_OP_QM() { return getToken(LANSGrammarParser.TK_OP_QM, 0); }
		public TerminalNode TK_COLON() { return getToken(LANSGrammarParser.TK_COLON, 0); }
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitI(this);
		}
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_i);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			c();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_OP_QM) {
				{
				setState(318);
				match(TK_OP_QM);
				setState(319);
				c();
				setState(320);
				match(TK_COLON);
				setState(321);
				c();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CContext extends ParserRuleContext {
		public List<LContext> l() {
			return getRuleContexts(LContext.class);
		}
		public LContext l(int i) {
			return getRuleContext(LContext.class,i);
		}
		public List<TerminalNode> TK_OP_LT() { return getTokens(LANSGrammarParser.TK_OP_LT); }
		public TerminalNode TK_OP_LT(int i) {
			return getToken(LANSGrammarParser.TK_OP_LT, i);
		}
		public List<TerminalNode> TK_OP_LEQ() { return getTokens(LANSGrammarParser.TK_OP_LEQ); }
		public TerminalNode TK_OP_LEQ(int i) {
			return getToken(LANSGrammarParser.TK_OP_LEQ, i);
		}
		public List<TerminalNode> TK_OP_EQ() { return getTokens(LANSGrammarParser.TK_OP_EQ); }
		public TerminalNode TK_OP_EQ(int i) {
			return getToken(LANSGrammarParser.TK_OP_EQ, i);
		}
		public List<TerminalNode> TK_OP_GEQ() { return getTokens(LANSGrammarParser.TK_OP_GEQ); }
		public TerminalNode TK_OP_GEQ(int i) {
			return getToken(LANSGrammarParser.TK_OP_GEQ, i);
		}
		public List<TerminalNode> TK_OP_GT() { return getTokens(LANSGrammarParser.TK_OP_GT); }
		public TerminalNode TK_OP_GT(int i) {
			return getToken(LANSGrammarParser.TK_OP_GT, i);
		}
		public List<TerminalNode> TK_OP_NEQ() { return getTokens(LANSGrammarParser.TK_OP_NEQ); }
		public TerminalNode TK_OP_NEQ(int i) {
			return getToken(LANSGrammarParser.TK_OP_NEQ, i);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitC(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_c);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			l();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0) {
				{
				{
				setState(326);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(327);
				l();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LContext extends ParserRuleContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public List<TerminalNode> TK_OP_OR() { return getTokens(LANSGrammarParser.TK_OP_OR); }
		public TerminalNode TK_OP_OR(int i) {
			return getToken(LANSGrammarParser.TK_OP_OR, i);
		}
		public List<TerminalNode> TK_OP_AND() { return getTokens(LANSGrammarParser.TK_OP_AND); }
		public TerminalNode TK_OP_AND(int i) {
			return getToken(LANSGrammarParser.TK_OP_AND, i);
		}
		public LContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitL(this);
		}
	}

	public final LContext l() throws RecognitionException {
		LContext _localctx = new LContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_l);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			e();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_OP_AND || _la==TK_OP_OR) {
				{
				{
				setState(334);
				_la = _input.LA(1);
				if ( !(_la==TK_OP_AND || _la==TK_OP_OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(335);
				e();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EContext extends ParserRuleContext {
		public List<TContext> t() {
			return getRuleContexts(TContext.class);
		}
		public TContext t(int i) {
			return getRuleContext(TContext.class,i);
		}
		public List<TerminalNode> TK_OP_PLUS() { return getTokens(LANSGrammarParser.TK_OP_PLUS); }
		public TerminalNode TK_OP_PLUS(int i) {
			return getToken(LANSGrammarParser.TK_OP_PLUS, i);
		}
		public List<TerminalNode> TK_OP_MINUS() { return getTokens(LANSGrammarParser.TK_OP_MINUS); }
		public TerminalNode TK_OP_MINUS(int i) {
			return getToken(LANSGrammarParser.TK_OP_MINUS, i);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			t();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_OP_PLUS || _la==TK_OP_MINUS) {
				{
				{
				setState(342);
				_la = _input.LA(1);
				if ( !(_la==TK_OP_PLUS || _la==TK_OP_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(343);
				t();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TContext extends ParserRuleContext {
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public List<TerminalNode> TK_STAR() { return getTokens(LANSGrammarParser.TK_STAR); }
		public TerminalNode TK_STAR(int i) {
			return getToken(LANSGrammarParser.TK_STAR, i);
		}
		public List<TerminalNode> TK_OP_DIV() { return getTokens(LANSGrammarParser.TK_OP_DIV); }
		public TerminalNode TK_OP_DIV(int i) {
			return getToken(LANSGrammarParser.TK_OP_DIV, i);
		}
		public List<TerminalNode> TK_OP_INT_DIV() { return getTokens(LANSGrammarParser.TK_OP_INT_DIV); }
		public TerminalNode TK_OP_INT_DIV(int i) {
			return getToken(LANSGrammarParser.TK_OP_INT_DIV, i);
		}
		public List<TerminalNode> TK_OP_MOD() { return getTokens(LANSGrammarParser.TK_OP_MOD); }
		public TerminalNode TK_OP_MOD(int i) {
			return getToken(LANSGrammarParser.TK_OP_MOD, i);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			s();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 912L) != 0) {
				{
				{
				setState(350);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 912L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(351);
				s();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode TK_OP_MINUS_U() { return getToken(LANSGrammarParser.TK_OP_MINUS_U, 0); }
		public TerminalNode TK_OP_NOT() { return getToken(LANSGrammarParser.TK_OP_NOT, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_s);
		int _la;
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_OP_MINUS_U:
			case TK_OP_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				_la = _input.LA(1);
				if ( !(_la==TK_OP_MINUS_U || _la==TK_OP_NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(358);
				f();
				}
				break;
			case TK_LPAREN:
			case TK_ENTER:
			case TK_NATURAL:
			case TK_BOOLEA:
			case TK_IDENT:
			case TK_REAL:
			case TK_DATA:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				f();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode TK_LPAREN() { return getToken(LANSGrammarParser.TK_LPAREN, 0); }
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(LANSGrammarParser.TK_RPAREN, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitF(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_f);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ENTER:
			case TK_NATURAL:
			case TK_BOOLEA:
			case TK_IDENT:
			case TK_REAL:
			case TK_DATA:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				operand();
				}
				break;
			case TK_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(TK_LPAREN);
				setState(364);
				i();
				setState(365);
				match(TK_RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressioContext extends ParserRuleContext {
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public Valor_constantContext valor_constant() {
			return getRuleContext(Valor_constantContext.class,0);
		}
		public TerminalNode TK_LPAREN() { return getToken(LANSGrammarParser.TK_LPAREN, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(LANSGrammarParser.TK_RPAREN, 0); }
		public ExpressioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterExpressio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitExpressio(this);
		}
	}

	public final ExpressioContext expressio() throws RecognitionException {
		ExpressioContext _localctx = new ExpressioContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressio);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				i();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				valor_constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				match(TK_LPAREN);
				setState(372);
				f();
				setState(373);
				match(TK_RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Acces_tuplaContext extends ParserRuleContext {
		public TerminalNode TK_DOT() { return getToken(LANSGrammarParser.TK_DOT, 0); }
		public TerminalNode TK_IDENT() { return getToken(LANSGrammarParser.TK_IDENT, 0); }
		public Acces_tuplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acces_tupla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterAcces_tupla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitAcces_tupla(this);
		}
	}

	public final Acces_tuplaContext acces_tupla() throws RecognitionException {
		Acces_tuplaContext _localctx = new Acces_tuplaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_acces_tupla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(TK_DOT);
			setState(378);
			match(TK_IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Acces_vectorContext extends ParserRuleContext {
		public TerminalNode TK_LBRACKET() { return getToken(LANSGrammarParser.TK_LBRACKET, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode TK_RBRACKET() { return getToken(LANSGrammarParser.TK_RBRACKET, 0); }
		public Acces_vectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acces_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterAcces_vector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitAcces_vector(this);
		}
	}

	public final Acces_vectorContext acces_vector() throws RecognitionException {
		Acces_vectorContext _localctx = new Acces_vectorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_acces_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(TK_LBRACKET);
			setState(381);
			f();
			setState(382);
			match(TK_RBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Crida_funcioContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(LANSGrammarParser.TK_LPAREN, 0); }
		public List<ExpressioContext> expressio() {
			return getRuleContexts(ExpressioContext.class);
		}
		public ExpressioContext expressio(int i) {
			return getRuleContext(ExpressioContext.class,i);
		}
		public TerminalNode TK_RPAREN() { return getToken(LANSGrammarParser.TK_RPAREN, 0); }
		public List<TerminalNode> TK_COMMA() { return getTokens(LANSGrammarParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(LANSGrammarParser.TK_COMMA, i);
		}
		public Crida_funcioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crida_funcio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterCrida_funcio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitCrida_funcio(this);
		}
	}

	public final Crida_funcioContext crida_funcio() throws RecognitionException {
		Crida_funcioContext _localctx = new Crida_funcioContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_crida_funcio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(TK_LPAREN);
			setState(385);
			expressio();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(386);
				match(TK_COMMA);
				setState(387);
				expressio();
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
			match(TK_RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(LANSGrammarParser.TK_IDENT, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public MentreContext mentre() {
			return getRuleContext(MentreContext.class,0);
		}
		public PerContext per() {
			return getRuleContext(PerContext.class,0);
		}
		public RepetirContext repetir() {
			return getRuleContext(RepetirContext.class,0);
		}
		public LlegirContext llegir() {
			return getRuleContext(LlegirContext.class,0);
		}
		public EscriureContext escriure() {
			return getRuleContext(EscriureContext.class,0);
		}
		public Escriure_lnContext escriure_ln() {
			return getRuleContext(Escriure_lnContext.class,0);
		}
		public Assign_variableContext assign_variable() {
			return getRuleContext(Assign_variableContext.class,0);
		}
		public Crida_accioContext crida_accio() {
			return getRuleContext(Crida_accioContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENT:
				{
				setState(395);
				match(TK_IDENT);
				setState(398);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_DOT:
				case TK_LBRACKET:
				case TK_ASSIGN_VALUE:
					{
					setState(396);
					assign_variable();
					}
					break;
				case TK_LPAREN:
					{
					setState(397);
					crida_accio();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case TK_PC_SI:
				{
				setState(400);
				condicional();
				}
				break;
			case TK_PC_MENTRE:
				{
				setState(401);
				mentre();
				}
				break;
			case TK_PC_PER:
				{
				setState(402);
				per();
				}
				break;
			case TK_PC_REPETIR:
				{
				setState(403);
				repetir();
				}
				break;
			case TK_PC_LLEGIR:
				{
				setState(404);
				llegir();
				}
				break;
			case TK_PC_ESCRIURE:
				{
				setState(405);
				escriure();
				}
				break;
			case TK_PC_ESCRIURELN:
				{
				setState(406);
				escriure_ln();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LlegirContext extends ParserRuleContext {
		public TerminalNode TK_PC_LLEGIR() { return getToken(LANSGrammarParser.TK_PC_LLEGIR, 0); }
		public TerminalNode TK_LPAREN() { return getToken(LANSGrammarParser.TK_LPAREN, 0); }
		public TerminalNode TK_IDENT() { return getToken(LANSGrammarParser.TK_IDENT, 0); }
		public TerminalNode TK_RPAREN() { return getToken(LANSGrammarParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(LANSGrammarParser.TK_SEMI, 0); }
		public LlegirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llegir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterLlegir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitLlegir(this);
		}
	}

	public final LlegirContext llegir() throws RecognitionException {
		LlegirContext _localctx = new LlegirContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_llegir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(TK_PC_LLEGIR);
			setState(410);
			match(TK_LPAREN);
			setState(411);
			match(TK_IDENT);
			setState(412);
			match(TK_RPAREN);
			setState(413);
			match(TK_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EscriureContext extends ParserRuleContext {
		public TerminalNode TK_PC_ESCRIURE() { return getToken(LANSGrammarParser.TK_PC_ESCRIURE, 0); }
		public TerminalNode TK_LPAREN() { return getToken(LANSGrammarParser.TK_LPAREN, 0); }
		public List<ExpressioContext> expressio() {
			return getRuleContexts(ExpressioContext.class);
		}
		public ExpressioContext expressio(int i) {
			return getRuleContext(ExpressioContext.class,i);
		}
		public TerminalNode TK_RPAREN() { return getToken(LANSGrammarParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(LANSGrammarParser.TK_SEMI, 0); }
		public List<TerminalNode> TK_COMMA() { return getTokens(LANSGrammarParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(LANSGrammarParser.TK_COMMA, i);
		}
		public EscriureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escriure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterEscriure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitEscriure(this);
		}
	}

	public final EscriureContext escriure() throws RecognitionException {
		EscriureContext _localctx = new EscriureContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_escriure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(TK_PC_ESCRIURE);
			setState(416);
			match(TK_LPAREN);
			setState(417);
			expressio();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(418);
				match(TK_COMMA);
				setState(419);
				expressio();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
			match(TK_RPAREN);
			setState(426);
			match(TK_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Escriure_lnContext extends ParserRuleContext {
		public TerminalNode TK_PC_ESCRIURELN() { return getToken(LANSGrammarParser.TK_PC_ESCRIURELN, 0); }
		public TerminalNode TK_LPAREN() { return getToken(LANSGrammarParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(LANSGrammarParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(LANSGrammarParser.TK_SEMI, 0); }
		public List<ExpressioContext> expressio() {
			return getRuleContexts(ExpressioContext.class);
		}
		public ExpressioContext expressio(int i) {
			return getRuleContext(ExpressioContext.class,i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(LANSGrammarParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(LANSGrammarParser.TK_COMMA, i);
		}
		public Escriure_lnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escriure_ln; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterEscriure_ln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitEscriure_ln(this);
		}
	}

	public final Escriure_lnContext escriure_ln() throws RecognitionException {
		Escriure_lnContext _localctx = new Escriure_lnContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_escriure_ln);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(TK_PC_ESCRIURELN);
			setState(429);
			match(TK_LPAREN);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1166713778465670212L) != 0 || (((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 6155L) != 0) {
				{
				setState(430);
				expressio();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(431);
					match(TK_COMMA);
					setState(432);
					expressio();
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(440);
			match(TK_RPAREN);
			setState(441);
			match(TK_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_variableContext extends ParserRuleContext {
		public TerminalNode TK_ASSIGN_VALUE() { return getToken(LANSGrammarParser.TK_ASSIGN_VALUE, 0); }
		public ExpressioContext expressio() {
			return getRuleContext(ExpressioContext.class,0);
		}
		public TerminalNode TK_SEMI() { return getToken(LANSGrammarParser.TK_SEMI, 0); }
		public Acces_vectorContext acces_vector() {
			return getRuleContext(Acces_vectorContext.class,0);
		}
		public Acces_tuplaContext acces_tupla() {
			return getRuleContext(Acces_tuplaContext.class,0);
		}
		public Assign_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterAssign_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitAssign_variable(this);
		}
	}

	public final Assign_variableContext assign_variable() throws RecognitionException {
		Assign_variableContext _localctx = new Assign_variableContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assign_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LBRACKET:
				{
				setState(443);
				acces_vector();
				}
				break;
			case TK_DOT:
				{
				setState(444);
				acces_tupla();
				}
				break;
			case TK_ASSIGN_VALUE:
				break;
			default:
				break;
			}
			setState(447);
			match(TK_ASSIGN_VALUE);
			setState(448);
			expressio();
			setState(449);
			match(TK_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode TK_PC_SI() { return getToken(LANSGrammarParser.TK_PC_SI, 0); }
		public ExpressioContext expressio() {
			return getRuleContext(ExpressioContext.class,0);
		}
		public TerminalNode TK_PC_LLAVORS() { return getToken(LANSGrammarParser.TK_PC_LLAVORS, 0); }
		public TerminalNode TK_PC_FSI() { return getToken(LANSGrammarParser.TK_PC_FSI, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode TK_PC_ALTRAMENT() { return getToken(LANSGrammarParser.TK_PC_ALTRAMENT, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(TK_PC_SI);
			setState(452);
			expressio();
			setState(453);
			match(TK_PC_LLAVORS);
			setState(455); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(454);
				sentencia();
				}
				}
				setState(457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 35184372118161L) != 0 );
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_ALTRAMENT) {
				{
				setState(459);
				match(TK_PC_ALTRAMENT);
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 35184372118161L) != 0) {
					{
					{
					setState(460);
					sentencia();
					}
					}
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(468);
			match(TK_PC_FSI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MentreContext extends ParserRuleContext {
		public TerminalNode TK_PC_MENTRE() { return getToken(LANSGrammarParser.TK_PC_MENTRE, 0); }
		public ExpressioContext expressio() {
			return getRuleContext(ExpressioContext.class,0);
		}
		public TerminalNode TK_PC_FER() { return getToken(LANSGrammarParser.TK_PC_FER, 0); }
		public TerminalNode TK_PC_FMENTRE() { return getToken(LANSGrammarParser.TK_PC_FMENTRE, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public MentreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mentre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterMentre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitMentre(this);
		}
	}

	public final MentreContext mentre() throws RecognitionException {
		MentreContext _localctx = new MentreContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mentre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(TK_PC_MENTRE);
			setState(471);
			expressio();
			setState(472);
			match(TK_PC_FER);
			setState(474); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(473);
				sentencia();
				}
				}
				setState(476); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 35184372118161L) != 0 );
			setState(478);
			match(TK_PC_FMENTRE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PerContext extends ParserRuleContext {
		public TerminalNode TK_PC_PER() { return getToken(LANSGrammarParser.TK_PC_PER, 0); }
		public TerminalNode TK_IDENT() { return getToken(LANSGrammarParser.TK_IDENT, 0); }
		public TerminalNode TK_PC_DE() { return getToken(LANSGrammarParser.TK_PC_DE, 0); }
		public List<ExpressioContext> expressio() {
			return getRuleContexts(ExpressioContext.class);
		}
		public ExpressioContext expressio(int i) {
			return getRuleContext(ExpressioContext.class,i);
		}
		public TerminalNode TK_PC_FINS() { return getToken(LANSGrammarParser.TK_PC_FINS, 0); }
		public TerminalNode TK_PC_FER() { return getToken(LANSGrammarParser.TK_PC_FER, 0); }
		public TerminalNode TK_PC_FPER() { return getToken(LANSGrammarParser.TK_PC_FPER, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public PerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_per; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterPer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitPer(this);
		}
	}

	public final PerContext per() throws RecognitionException {
		PerContext _localctx = new PerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_per);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(TK_PC_PER);
			setState(481);
			match(TK_IDENT);
			setState(482);
			match(TK_PC_DE);
			setState(483);
			expressio();
			setState(484);
			match(TK_PC_FINS);
			setState(485);
			expressio();
			setState(486);
			match(TK_PC_FER);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 35184372118161L) != 0) {
				{
				{
				setState(487);
				sentencia();
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
			match(TK_PC_FPER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepetirContext extends ParserRuleContext {
		public TerminalNode TK_PC_REPETIR() { return getToken(LANSGrammarParser.TK_PC_REPETIR, 0); }
		public TerminalNode TK_PC_FINSQUE() { return getToken(LANSGrammarParser.TK_PC_FINSQUE, 0); }
		public ExpressioContext expressio() {
			return getRuleContext(ExpressioContext.class,0);
		}
		public TerminalNode TK_SEMI() { return getToken(LANSGrammarParser.TK_SEMI, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public RepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitRepetir(this);
		}
	}

	public final RepetirContext repetir() throws RecognitionException {
		RepetirContext _localctx = new RepetirContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(TK_PC_REPETIR);
			setState(497); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(496);
				sentencia();
				}
				}
				setState(499); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 35184372118161L) != 0 );
			setState(501);
			match(TK_PC_FINSQUE);
			setState(502);
			expressio();
			setState(503);
			match(TK_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Crida_accioContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(LANSGrammarParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(LANSGrammarParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(LANSGrammarParser.TK_SEMI, 0); }
		public List<ExpressioContext> expressio() {
			return getRuleContexts(ExpressioContext.class);
		}
		public ExpressioContext expressio(int i) {
			return getRuleContext(ExpressioContext.class,i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(LANSGrammarParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(LANSGrammarParser.TK_COMMA, i);
		}
		public Crida_accioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crida_accio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterCrida_accio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitCrida_accio(this);
		}
	}

	public final Crida_accioContext crida_accio() throws RecognitionException {
		Crida_accioContext _localctx = new Crida_accioContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_crida_accio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(TK_LPAREN);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1166713778465670212L) != 0 || (((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 6155L) != 0) {
				{
				setState(506);
				expressio();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(507);
					match(TK_COMMA);
					setState(508);
					expressio();
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(516);
			match(TK_RPAREN);
			setState(517);
			match(TK_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Valor_constantContext extends ParserRuleContext {
		public String type;
		public String value;
		public Token val;
		public TerminalNode TK_ENTER() { return getToken(LANSGrammarParser.TK_ENTER, 0); }
		public TerminalNode TK_REAL() { return getToken(LANSGrammarParser.TK_REAL, 0); }
		public TerminalNode TK_CAR() { return getToken(LANSGrammarParser.TK_CAR, 0); }
		public TerminalNode TK_BOOLEA() { return getToken(LANSGrammarParser.TK_BOOLEA, 0); }
		public TerminalNode TK_DATA() { return getToken(LANSGrammarParser.TK_DATA, 0); }
		public TerminalNode TK_STRING() { return getToken(LANSGrammarParser.TK_STRING, 0); }
		public TerminalNode TK_OP_MINUS() { return getToken(LANSGrammarParser.TK_OP_MINUS, 0); }
		public Valor_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).enterValor_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LANSGrammarListener ) ((LANSGrammarListener)listener).exitValor_constant(this);
		}
	}

	public final Valor_constantContext valor_constant() throws RecognitionException {
		Valor_constantContext _localctx = new Valor_constantContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_valor_constant);
		try {
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				((Valor_constantContext)_localctx).val = match(TK_ENTER);
				 ((Valor_constantContext)_localctx).type =  "enter"; ((Valor_constantContext)_localctx).value =  (((Valor_constantContext)_localctx).val!=null?((Valor_constantContext)_localctx).val.getText():null); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				((Valor_constantContext)_localctx).val = match(TK_REAL);
				 ((Valor_constantContext)_localctx).type =  "real"; ((Valor_constantContext)_localctx).value =  (((Valor_constantContext)_localctx).val!=null?((Valor_constantContext)_localctx).val.getText():null); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
				((Valor_constantContext)_localctx).val = match(TK_CAR);
				 ((Valor_constantContext)_localctx).type =  "car"; ((Valor_constantContext)_localctx).value =  (((Valor_constantContext)_localctx).val!=null?((Valor_constantContext)_localctx).val.getText():null); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(525);
				((Valor_constantContext)_localctx).val = match(TK_BOOLEA);
				 ((Valor_constantContext)_localctx).type =  "bool"; ((Valor_constantContext)_localctx).value =  (((Valor_constantContext)_localctx).val!=null?((Valor_constantContext)_localctx).val.getText():null); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(527);
				((Valor_constantContext)_localctx).val = match(TK_DATA);
				 ((Valor_constantContext)_localctx).type =  "data"; ((Valor_constantContext)_localctx).value =  (((Valor_constantContext)_localctx).val!=null?((Valor_constantContext)_localctx).val.getText():null); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(529);
				((Valor_constantContext)_localctx).val = match(TK_STRING);
				 ((Valor_constantContext)_localctx).type =  "string"; ((Valor_constantContext)_localctx).value =  (((Valor_constantContext)_localctx).val!=null?((Valor_constantContext)_localctx).val.getText():null); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(531);
				((Valor_constantContext)_localctx).val = match(TK_OP_MINUS);
				setState(532);
				match(TK_ENTER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(533);
				((Valor_constantContext)_localctx).val = match(TK_OP_MINUS);
				setState(534);
				match(TK_REAL);
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

	public static final String _serializedATN =
		"\u0004\u0001[\u021a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0001\u0000\u0003\u0000T\b\u0000\u0001\u0000\u0003\u0000W\b\u0000"+
		"\u0001\u0000\u0003\u0000Z\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000_\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001f\b\u0001\u0001\u0001\u0004\u0001i\b\u0001\u000b"+
		"\u0001\f\u0001j\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004"+
		"\u0002q\b\u0002\u000b\u0002\f\u0002r\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0004\u0004\u007f\b\u0004\u000b\u0004\f\u0004\u0080\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u008b\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u0092\b\u0006\u000b\u0006\f"+
		"\u0006\u0093\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u009c\b\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0003\b\u00a1\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a8"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0005\b\u00ad\b\b\n\b\f\b\u00b0\t\b\u0004"+
		"\b\u00b2\b\b\u000b\b\f\b\u00b3\u0001\t\u0003\t\u00b7\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00be\b\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00c3\b\t\n\t\f\t\u00c6\t\t\u0004\t\u00c8\b\t\u000b\t\f\t\u00c9\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d0\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d9\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0004\f\u00e2\b\f\u000b\f\f\f\u00e3\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00ea\b\r\u0001\r\u0001\r\u0005\r\u00ee\b\r\n\r\f\r\u00f1\t\r\u0001"+
		"\r\u0005\r\u00f4\b\r\n\r\f\r\u00f7\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ff\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0105\b\u000e\n\u000e\f\u000e"+
		"\u0108\t\u000e\u0001\u000e\u0005\u000e\u010b\b\u000e\n\u000e\f\u000e\u010e"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0117\b\u000f\n\u000f\f\u000f\u011a\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u011e\b\u0010\n\u0010\f\u0010\u0121"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u0128\b\u0011\n\u0011\f\u0011\u012b\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u013a\b\u0012\u0003\u0012\u013c\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0144\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0149\b\u0014\n\u0014\f\u0014"+
		"\u014c\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0151\b"+
		"\u0015\n\u0015\f\u0015\u0154\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u0159\b\u0016\n\u0016\f\u0016\u015c\t\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u0161\b\u0017\n\u0017\f\u0017\u0164\t\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0169\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0170\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0178\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u0185\b\u001d\n\u001d\f\u001d\u0188\t\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u018f"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0198\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0005 \u01a5\b \n \f \u01a8\t \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0005!\u01b2\b!\n!\f!\u01b5\t!\u0003!\u01b7\b!"+
		"\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0003\"\u01be\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0004#\u01c8\b#\u000b#"+
		"\f#\u01c9\u0001#\u0001#\u0005#\u01ce\b#\n#\f#\u01d1\t#\u0003#\u01d3\b"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0004$\u01db\b$\u000b$\f$"+
		"\u01dc\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%"+
		"\u0001%\u0005%\u01e9\b%\n%\f%\u01ec\t%\u0001%\u0001%\u0001&\u0001&\u0004"+
		"&\u01f2\b&\u000b&\f&\u01f3\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0005\'\u01fe\b\'\n\'\f\'\u0201\t\'\u0003\'\u0203\b\'"+
		"\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u0218\b(\u0001(\u0000\u0000)\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNP\u0000"+
		"\u0007\u0002\u000066MM\u0001\u0000DE\u0001\u0000\u000b\u0010\u0001\u0000"+
		"12\u0001\u0000\u0005\u0006\u0002\u0000\u0004\u0004\u0007\t\u0002\u0000"+
		"\n\n00\u023f\u0000S\u0001\u0000\u0000\u0000\u0002b\u0001\u0000\u0000\u0000"+
		"\u0004n\u0001\u0000\u0000\u0000\u0006v\u0001\u0000\u0000\u0000\b|\u0001"+
		"\u0000\u0000\u0000\n\u0084\u0001\u0000\u0000\u0000\f\u008c\u0001\u0000"+
		"\u0000\u0000\u000e\u0097\u0001\u0000\u0000\u0000\u0010\u00b1\u0001\u0000"+
		"\u0000\u0000\u0012\u00c7\u0001\u0000\u0000\u0000\u0014\u00cb\u0001\u0000"+
		"\u0000\u0000\u0016\u00d4\u0001\u0000\u0000\u0000\u0018\u00e1\u0001\u0000"+
		"\u0000\u0000\u001a\u00e5\u0001\u0000\u0000\u0000\u001c\u00fa\u0001\u0000"+
		"\u0000\u0000\u001e\u0118\u0001\u0000\u0000\u0000 \u011b\u0001\u0000\u0000"+
		"\u0000\"\u0124\u0001\u0000\u0000\u0000$\u013b\u0001\u0000\u0000\u0000"+
		"&\u013d\u0001\u0000\u0000\u0000(\u0145\u0001\u0000\u0000\u0000*\u014d"+
		"\u0001\u0000\u0000\u0000,\u0155\u0001\u0000\u0000\u0000.\u015d\u0001\u0000"+
		"\u0000\u00000\u0168\u0001\u0000\u0000\u00002\u016f\u0001\u0000\u0000\u0000"+
		"4\u0177\u0001\u0000\u0000\u00006\u0179\u0001\u0000\u0000\u00008\u017c"+
		"\u0001\u0000\u0000\u0000:\u0180\u0001\u0000\u0000\u0000<\u0197\u0001\u0000"+
		"\u0000\u0000>\u0199\u0001\u0000\u0000\u0000@\u019f\u0001\u0000\u0000\u0000"+
		"B\u01ac\u0001\u0000\u0000\u0000D\u01bd\u0001\u0000\u0000\u0000F\u01c3"+
		"\u0001\u0000\u0000\u0000H\u01d6\u0001\u0000\u0000\u0000J\u01e0\u0001\u0000"+
		"\u0000\u0000L\u01ef\u0001\u0000\u0000\u0000N\u01f9\u0001\u0000\u0000\u0000"+
		"P\u0217\u0001\u0000\u0000\u0000RT\u0003\u0004\u0002\u0000SR\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000UW\u0003"+
		"\b\u0004\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001"+
		"\u0000\u0000\u0000XZ\u0003\u0018\f\u0000YX\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0003\u0002\u0001\u0000"+
		"\\^\u0006\u0000\uffff\uffff\u0000]_\u0003\u001e\u000f\u0000^]\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0005"+
		"\u0000\u0000\u0001a\u0001\u0001\u0000\u0000\u0000bc\u0005\u0019\u0000"+
		"\u0000ce\u0005M\u0000\u0000df\u0003 \u0010\u0000ed\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000gi\u0003<\u001e\u0000"+
		"hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0005\u001a"+
		"\u0000\u0000m\u0003\u0001\u0000\u0000\u0000np\u0005\u001b\u0000\u0000"+
		"oq\u0003\u0006\u0003\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tu\u0005\u001c\u0000\u0000u\u0005\u0001\u0000\u0000\u0000"+
		"vw\u00056\u0000\u0000wx\u0005M\u0000\u0000xy\u0005\u0018\u0000\u0000y"+
		"z\u0003P(\u0000z{\u0005\u0011\u0000\u0000{\u0007\u0001\u0000\u0000\u0000"+
		"|~\u0005\u001d\u0000\u0000}\u007f\u0003\u000e\u0007\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005\u001e\u0000\u0000\u0083\t\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005?\u0000\u0000\u0085\u0086\u00056\u0000\u0000\u0086\u0087"+
		"\u0005C\u0000\u0000\u0087\u008a\u00054\u0000\u0000\u0088\u0089\u0005B"+
		"\u0000\u0000\u0089\u008b\u00054\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u000b\u0001\u0000\u0000"+
		"\u0000\u008c\u0091\u0005@\u0000\u0000\u008d\u008e\u0005M\u0000\u0000\u008e"+
		"\u008f\u0005\u0014\u0000\u0000\u008f\u0090\u00056\u0000\u0000\u0090\u0092"+
		"\u0005\u0011\u0000\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0005A\u0000\u0000\u0096\r\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"M\u0000\u0000\u0098\u009b\u0005\u0014\u0000\u0000\u0099\u009c\u0003\n"+
		"\u0005\u0000\u009a\u009c\u0003\f\u0006\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\u0011\u0000\u0000\u009e\u000f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a1\u0005D\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005M\u0000\u0000\u00a3\u00a4\u0005\u0014\u0000\u0000\u00a4"+
		"\u00ae\u0007\u0000\u0000\u0000\u00a5\u00a7\u0005\u0012\u0000\u0000\u00a6"+
		"\u00a8\u0005D\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005M\u0000\u0000\u00aa\u00ab\u0005\u0014\u0000\u0000\u00ab\u00ad\u0007"+
		"\u0000\u0000\u0000\u00ac\u00a5\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b1\u00a0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u0011\u0001\u0000\u0000\u0000\u00b5\u00b7\u0007"+
		"\u0001\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005"+
		"M\u0000\u0000\u00b9\u00ba\u0005\u0014\u0000\u0000\u00ba\u00c4\u0007\u0000"+
		"\u0000\u0000\u00bb\u00bd\u0005\u0012\u0000\u0000\u00bc\u00be\u0007\u0001"+
		"\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005M\u0000"+
		"\u0000\u00c0\u00c1\u0005\u0014\u0000\u0000\u00c1\u00c3\u0007\u0000\u0000"+
		"\u0000\u00c2\u00bb\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c7\u00b6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000"+
		"\u0000\u00ca\u0013\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005F\u0000\u0000"+
		"\u00cc\u00cd\u0005M\u0000\u0000\u00cd\u00cf\u0005\u0002\u0000\u0000\u00ce"+
		"\u00d0\u0003\u0012\t\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0005\u0003\u0000\u0000\u00d2\u00d3\u0005\u0011\u0000\u0000\u00d3\u0015"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005H\u0000\u0000\u00d5\u00d6\u0005"+
		"M\u0000\u0000\u00d6\u00d8\u0005\u0002\u0000\u0000\u00d7\u00d9\u0003\u0010"+
		"\b\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0003\u0000"+
		"\u0000\u00db\u00dc\u0005L\u0000\u0000\u00dc\u00dd\u00056\u0000\u0000\u00dd"+
		"\u00de\u0005\u0011\u0000\u0000\u00de\u0017\u0001\u0000\u0000\u0000\u00df"+
		"\u00e2\u0003\u0014\n\u0000\u00e0\u00e2\u0003\u0016\u000b\u0000\u00e1\u00df"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e4\u0019\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0005F\u0000\u0000\u00e6\u00e7\u0005M\u0000\u0000\u00e7\u00e9\u0005\u0002"+
		"\u0000\u0000\u00e8\u00ea\u0003\u0012\t\u0000\u00e9\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ef\u0005\u0003\u0000\u0000\u00ec\u00ee\u0003\"\u0011\u0000"+
		"\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f5\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f4\u0003<\u001e\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005G\u0000\u0000\u00f9\u001b"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005H\u0000\u0000\u00fb\u00fc\u0005"+
		"M\u0000\u0000\u00fc\u00fe\u0005\u0002\u0000\u0000\u00fd\u00ff\u0003\u0010"+
		"\b\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0003\u0000"+
		"\u0000\u0101\u0102\u0005L\u0000\u0000\u0102\u0106\u00056\u0000\u0000\u0103"+
		"\u0105\u0003\"\u0011\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u0108"+
		"\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0001\u0000\u0000\u0000\u0107\u010c\u0001\u0000\u0000\u0000\u0108\u0106"+
		"\u0001\u0000\u0000\u0000\u0109\u010b\u0003<\u001e\u0000\u010a\u0109\u0001"+
		"\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010f\u0001"+
		"\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0110\u0005"+
		"L\u0000\u0000\u0110\u0111\u00034\u001a\u0000\u0111\u0112\u0005\u0011\u0000"+
		"\u0000\u0112\u0113\u0005I\u0000\u0000\u0113\u001d\u0001\u0000\u0000\u0000"+
		"\u0114\u0117\u0003\u001a\r\u0000\u0115\u0117\u0003\u001c\u000e\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117"+
		"\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0001\u0000\u0000\u0000\u0119\u001f\u0001\u0000\u0000\u0000\u011a"+
		"\u0118\u0001\u0000\u0000\u0000\u011b\u011f\u0005J\u0000\u0000\u011c\u011e"+
		"\u0003\"\u0011\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u0121\u0001"+
		"\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001"+
		"\u0000\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011f\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0005K\u0000\u0000\u0123!\u0001\u0000\u0000"+
		"\u0000\u0124\u0129\u0005M\u0000\u0000\u0125\u0126\u0005\u0012\u0000\u0000"+
		"\u0126\u0128\u0005M\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128"+
		"\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b"+
		"\u0129\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u0014\u0000\u0000\u012d"+
		"\u012e\u0007\u0000\u0000\u0000\u012e\u012f\u0005\u0011\u0000\u0000\u012f"+
		"#\u0001\u0000\u0000\u0000\u0130\u013c\u00054\u0000\u0000\u0131\u013c\u0005"+
		"5\u0000\u0000\u0132\u013c\u0005N\u0000\u0000\u0133\u013c\u0005X\u0000"+
		"\u0000\u0134\u013c\u0005<\u0000\u0000\u0135\u0139\u0005M\u0000\u0000\u0136"+
		"\u013a\u00036\u001b\u0000\u0137\u013a\u00038\u001c\u0000\u0138\u013a\u0003"+
		":\u001d\u0000\u0139\u0136\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000"+
		"\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000"+
		"\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u0130\u0001\u0000"+
		"\u0000\u0000\u013b\u0131\u0001\u0000\u0000\u0000\u013b\u0132\u0001\u0000"+
		"\u0000\u0000\u013b\u0133\u0001\u0000\u0000\u0000\u013b\u0134\u0001\u0000"+
		"\u0000\u0000\u013b\u0135\u0001\u0000\u0000\u0000\u013c%\u0001\u0000\u0000"+
		"\u0000\u013d\u0143\u0003(\u0014\u0000\u013e\u013f\u00053\u0000\u0000\u013f"+
		"\u0140\u0003(\u0014\u0000\u0140\u0141\u0005\u0014\u0000\u0000\u0141\u0142"+
		"\u0003(\u0014\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u013e\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\'\u0001\u0000"+
		"\u0000\u0000\u0145\u014a\u0003*\u0015\u0000\u0146\u0147\u0007\u0002\u0000"+
		"\u0000\u0147\u0149\u0003*\u0015\u0000\u0148\u0146\u0001\u0000\u0000\u0000"+
		"\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0001\u0000\u0000\u0000\u014b)\u0001\u0000\u0000\u0000\u014c"+
		"\u014a\u0001\u0000\u0000\u0000\u014d\u0152\u0003,\u0016\u0000\u014e\u014f"+
		"\u0007\u0003\u0000\u0000\u014f\u0151\u0003,\u0016\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153+\u0001\u0000"+
		"\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u015a\u0003.\u0017"+
		"\u0000\u0156\u0157\u0007\u0004\u0000\u0000\u0157\u0159\u0003.\u0017\u0000"+
		"\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000"+
		"\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000"+
		"\u015b-\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d"+
		"\u0162\u00030\u0018\u0000\u015e\u015f\u0007\u0005\u0000\u0000\u015f\u0161"+
		"\u00030\u0018\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0164\u0001"+
		"\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001"+
		"\u0000\u0000\u0000\u0163/\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u0007\u0006\u0000\u0000\u0166\u0169\u00032\u0019"+
		"\u0000\u0167\u0169\u00032\u0019\u0000\u0168\u0165\u0001\u0000\u0000\u0000"+
		"\u0168\u0167\u0001\u0000\u0000\u0000\u01691\u0001\u0000\u0000\u0000\u016a"+
		"\u0170\u0003$\u0012\u0000\u016b\u016c\u0005\u0002\u0000\u0000\u016c\u016d"+
		"\u0003&\u0013\u0000\u016d\u016e\u0005\u0003\u0000\u0000\u016e\u0170\u0001"+
		"\u0000\u0000\u0000\u016f\u016a\u0001\u0000\u0000\u0000\u016f\u016b\u0001"+
		"\u0000\u0000\u0000\u01703\u0001\u0000\u0000\u0000\u0171\u0178\u0003&\u0013"+
		"\u0000\u0172\u0178\u0003P(\u0000\u0173\u0174\u0005\u0002\u0000\u0000\u0174"+
		"\u0175\u00032\u0019\u0000\u0175\u0176\u0005\u0003\u0000\u0000\u0176\u0178"+
		"\u0001\u0000\u0000\u0000\u0177\u0171\u0001\u0000\u0000\u0000\u0177\u0172"+
		"\u0001\u0000\u0000\u0000\u0177\u0173\u0001\u0000\u0000\u0000\u01785\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0005\u0013\u0000\u0000\u017a\u017b\u0005"+
		"M\u0000\u0000\u017b7\u0001\u0000\u0000\u0000\u017c\u017d\u0005\u0015\u0000"+
		"\u0000\u017d\u017e\u00032\u0019\u0000\u017e\u017f\u0005\u0016\u0000\u0000"+
		"\u017f9\u0001\u0000\u0000\u0000\u0180\u0181\u0005\u0002\u0000\u0000\u0181"+
		"\u0186\u00034\u001a\u0000\u0182\u0183\u0005\u0012\u0000\u0000\u0183\u0185"+
		"\u00034\u001a\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0188\u0001"+
		"\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001"+
		"\u0000\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0186\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0005\u0003\u0000\u0000\u018a;\u0001\u0000"+
		"\u0000\u0000\u018b\u018e\u0005M\u0000\u0000\u018c\u018f\u0003D\"\u0000"+
		"\u018d\u018f\u0003N\'\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e"+
		"\u018d\u0001\u0000\u0000\u0000\u018f\u0198\u0001\u0000\u0000\u0000\u0190"+
		"\u0198\u0003F#\u0000\u0191\u0198\u0003H$\u0000\u0192\u0198\u0003J%\u0000"+
		"\u0193\u0198\u0003L&\u0000\u0194\u0198\u0003>\u001f\u0000\u0195\u0198"+
		"\u0003@ \u0000\u0196\u0198\u0003B!\u0000\u0197\u018b\u0001\u0000\u0000"+
		"\u0000\u0197\u0190\u0001\u0000\u0000\u0000\u0197\u0191\u0001\u0000\u0000"+
		"\u0000\u0197\u0192\u0001\u0000\u0000\u0000\u0197\u0193\u0001\u0000\u0000"+
		"\u0000\u0197\u0194\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000"+
		"\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198=\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0005,\u0000\u0000\u019a\u019b\u0005\u0002\u0000\u0000\u019b"+
		"\u019c\u0005M\u0000\u0000\u019c\u019d\u0005\u0003\u0000\u0000\u019d\u019e"+
		"\u0005\u0011\u0000\u0000\u019e?\u0001\u0000\u0000\u0000\u019f\u01a0\u0005"+
		"-\u0000\u0000\u01a0\u01a1\u0005\u0002\u0000\u0000\u01a1\u01a6\u00034\u001a"+
		"\u0000\u01a2\u01a3\u0005\u0012\u0000\u0000\u01a3\u01a5\u00034\u001a\u0000"+
		"\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a9\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a9\u01aa\u0005\u0003\u0000\u0000\u01aa\u01ab\u0005\u0011\u0000\u0000"+
		"\u01abA\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005.\u0000\u0000\u01ad\u01b6"+
		"\u0005\u0002\u0000\u0000\u01ae\u01b3\u00034\u001a\u0000\u01af\u01b0\u0005"+
		"\u0012\u0000\u0000\u01b0\u01b2\u00034\u001a\u0000\u01b1\u01af\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b5\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01ae\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0005\u0003\u0000\u0000\u01b9\u01ba\u0005\u0011"+
		"\u0000\u0000\u01baC\u0001\u0000\u0000\u0000\u01bb\u01be\u00038\u001c\u0000"+
		"\u01bc\u01be\u00036\u001b\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005\u0018\u0000\u0000\u01c0"+
		"\u01c1\u00034\u001a\u0000\u01c1\u01c2\u0005\u0011\u0000\u0000\u01c2E\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c4\u0005)\u0000\u0000\u01c4\u01c5\u00034\u001a"+
		"\u0000\u01c5\u01c7\u0005*\u0000\u0000\u01c6\u01c8\u0003<\u001e\u0000\u01c7"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9"+
		"\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca"+
		"\u01d2\u0001\u0000\u0000\u0000\u01cb\u01cf\u0005+\u0000\u0000\u01cc\u01ce"+
		"\u0003<\u001e\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001"+
		"\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d3\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001"+
		"\u0000\u0000\u0000\u01d2\u01cb\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005"+
		"/\u0000\u0000\u01d5G\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005$\u0000"+
		"\u0000\u01d7\u01d8\u00034\u001a\u0000\u01d8\u01da\u0005%\u0000\u0000\u01d9"+
		"\u01db\u0003<\u001e\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc"+
		"\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd"+
		"\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u0005&\u0000\u0000\u01dfI\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005 "+
		"\u0000\u0000\u01e1\u01e2\u0005M\u0000\u0000\u01e2\u01e3\u0005!\u0000\u0000"+
		"\u01e3\u01e4\u00034\u001a\u0000\u01e4\u01e5\u0005\"\u0000\u0000\u01e5"+
		"\u01e6\u00034\u001a\u0000\u01e6\u01ea\u0005%\u0000\u0000\u01e7\u01e9\u0003"+
		"<\u001e\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ee\u0005#\u0000\u0000\u01eeK\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f1\u0005\'\u0000\u0000\u01f0\u01f2\u0003<\u001e\u0000\u01f1"+
		"\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005(\u0000\u0000\u01f6\u01f7"+
		"\u00034\u001a\u0000\u01f7\u01f8\u0005\u0011\u0000\u0000\u01f8M\u0001\u0000"+
		"\u0000\u0000\u01f9\u0202\u0005\u0002\u0000\u0000\u01fa\u01ff\u00034\u001a"+
		"\u0000\u01fb\u01fc\u0005\u0012\u0000\u0000\u01fc\u01fe\u00034\u001a\u0000"+
		"\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u0201\u0001\u0000\u0000\u0000"+
		"\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000"+
		"\u0200\u0203\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000"+
		"\u0202\u01fa\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000"+
		"\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0205\u0005\u0003\u0000\u0000"+
		"\u0205\u0206\u0005\u0011\u0000\u0000\u0206O\u0001\u0000\u0000\u0000\u0207"+
		"\u0208\u00054\u0000\u0000\u0208\u0218\u0006(\uffff\uffff\u0000\u0209\u020a"+
		"\u0005N\u0000\u0000\u020a\u0218\u0006(\uffff\uffff\u0000\u020b\u020c\u0005"+
		"P\u0000\u0000\u020c\u0218\u0006(\uffff\uffff\u0000\u020d\u020e\u0005<"+
		"\u0000\u0000\u020e\u0218\u0006(\uffff\uffff\u0000\u020f\u0210\u0005X\u0000"+
		"\u0000\u0210\u0218\u0006(\uffff\uffff\u0000\u0211\u0212\u0005Y\u0000\u0000"+
		"\u0212\u0218\u0006(\uffff\uffff\u0000\u0213\u0214\u0005\u0006\u0000\u0000"+
		"\u0214\u0218\u00054\u0000\u0000\u0215\u0216\u0005\u0006\u0000\u0000\u0216"+
		"\u0218\u0005N\u0000\u0000\u0217\u0207\u0001\u0000\u0000\u0000\u0217\u0209"+
		"\u0001\u0000\u0000\u0000\u0217\u020b\u0001\u0000\u0000\u0000\u0217\u020d"+
		"\u0001\u0000\u0000\u0000\u0217\u020f\u0001\u0000\u0000\u0000\u0217\u0211"+
		"\u0001\u0000\u0000\u0000\u0217\u0213\u0001\u0000\u0000\u0000\u0217\u0215"+
		"\u0001\u0000\u0000\u0000\u0218Q\u0001\u0000\u0000\u0000;SVY^ejr\u0080"+
		"\u008a\u0093\u009b\u00a0\u00a7\u00ae\u00b3\u00b6\u00bd\u00c4\u00c9\u00cf"+
		"\u00d8\u00e1\u00e3\u00e9\u00ef\u00f5\u00fe\u0106\u010c\u0116\u0118\u011f"+
		"\u0129\u0139\u013b\u0143\u014a\u0152\u015a\u0162\u0168\u016f\u0177\u0186"+
		"\u018e\u0197\u01a6\u01b3\u01b6\u01bd\u01c9\u01cf\u01d2\u01dc\u01ea\u01f3"+
		"\u01ff\u0202\u0217";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}