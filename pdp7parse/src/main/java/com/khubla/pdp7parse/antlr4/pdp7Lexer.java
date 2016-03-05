// Generated from com/khubla/pdp7parse/antlr4/pdp7.g4 by ANTLR 4.5
package com.khubla.pdp7parse.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pdp7Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		LOC=95, RELOC=96, PLUS=97, MINUS=98, TIMES=99, DIV=100, LABEL=101, IDENTIFIER=102, 
		NUMERIC_LITERAL=103, DECIMAL=104, OCTAL=105, DECIMAL_MINUS=106, STRING=107, 
		CHAR=108, COMMENT=109, EOL=110, WS=111;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
		"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
		"T__65", "T__66", "T__67", "T__68", "T__69", "T__70", "T__71", "T__72", 
		"T__73", "T__74", "T__75", "T__76", "T__77", "T__78", "T__79", "T__80", 
		"T__81", "T__82", "T__83", "T__84", "T__85", "T__86", "T__87", "T__88", 
		"T__89", "T__90", "T__91", "T__92", "T__93", "LOC", "RELOC", "PLUS", "MINUS", 
		"TIMES", "DIV", "LABEL", "IDENTIFIER", "NUMERIC_LITERAL", "DECIMAL", "OCTAL", 
		"DECIMAL_MINUS", "STRING", "CHAR", "COMMENT", "EOL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'>'", "'dac'", "'jms'", "'dzm'", "'lac'", "'xor'", 
		"'add'", "'tad'", "'xct'", "'isz'", "'and'", "'sad'", "'jmp'", "'nop'", 
		"'law'", "'cma'", "'las'", "'ral'", "'rar'", "'hlt'", "'sma'", "'sza'", 
		"'snl'", "'skp'", "'sna'", "'szl'", "'rtl'", "'rtr'", "'cil'", "'rcl'", 
		"'rcr'", "'cia'", "'lrs'", "'lrss'", "'lls'", "'llss'", "'als'", "'alss'", 
		"'mul'", "'idiv'", "'lacq'", "'clq'", "'omq'", "'cmq'", "'lmq'", "'dscs'", 
		"'dslw'", "'dslm'", "'dsld'", "'dsls'", "'dssf'", "'dsrs'", "'iof'", "'ion'", 
		"'caf'", "'clon'", "'clsf'", "'clof'", "'ksf'", "'krb'", "'tsf'", "'tcf'", 
		"'tls'", "'sck'", "'cck'", "'lck'", "'rsf'", "'rsa'", "'rrb'", "'psf'", 
		"'pcf'", "'psa'", "'cdf'", "'rlpd'", "'lda'", "'wcga'", "'raef'", "'beg'", 
		"'spb'", "'cpb'", "'lpb'", "'wbl'", "'dprs'", "'dpsf'", "'dpcf'", "'dprc'", 
		"'crsf'", "'crrb'", "'sys'", "'czm'", "'irss'", "'dsm'", "'.'", "'..'", 
		"'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "LOC", 
		"RELOC", "PLUS", "MINUS", "TIMES", "DIV", "LABEL", "IDENTIFIER", "NUMERIC_LITERAL", 
		"DECIMAL", "OCTAL", "DECIMAL_MINUS", "STRING", "CHAR", "COMMENT", "EOL", 
		"WS"
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


	public pdp7Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pdp7.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2q\u02bc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$"+
		"\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3"+
		"8\38\38\38\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3"+
		"=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3"+
		"B\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3"+
		"H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3M\3M\3M\3M\3M\3"+
		"N\3N\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\3"+
		"S\3S\3S\3T\3T\3T\3T\3U\3U\3U\3U\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3X\3X\3"+
		"X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3"+
		"]\3]\3]\3]\3^\3^\3^\3^\3^\3_\3_\3_\3_\3`\3`\3a\3a\3a\3b\3b\3c\3c\3d\3"+
		"d\3e\3e\3f\6f\u027b\nf\rf\16f\u027c\3f\3f\3g\3g\7g\u0283\ng\fg\16g\u0286"+
		"\13g\3h\3h\7h\u028a\nh\fh\16h\u028d\13h\3i\3i\6i\u0291\ni\ri\16i\u0292"+
		"\3j\3j\6j\u0297\nj\rj\16j\u0298\3k\3k\3k\3k\6k\u029f\nk\rk\16k\u02a0\3"+
		"l\3l\7l\u02a5\nl\fl\16l\u02a8\13l\3m\3m\3m\3n\3n\7n\u02af\nn\fn\16n\u02b2"+
		"\13n\3o\6o\u02b5\no\ro\16o\u02b6\3p\3p\3p\3p\2\2q\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9"+
		"V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd"+
		"`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1"+
		"j\u00d3k\u00d5l\u00d7m\u00d9n\u00dbo\u00ddp\u00dfq\3\2\13\6\2\60\60\62"+
		";C\\c|\4\2C\\c|\3\2\62;\4\2\62;ch\3\2\629\t\2&\',,..\61<AAC\\c|\7\2\60"+
		"\60\62;@@C\\c|\4\2\f\f\17\17\4\2\13\13\"\"\u02c4\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd"+
		"\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2"+
		"\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf"+
		"\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2"+
		"\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\3\u00e1"+
		"\3\2\2\2\5\u00e3\3\2\2\2\7\u00e5\3\2\2\2\t\u00e7\3\2\2\2\13\u00eb\3\2"+
		"\2\2\r\u00ef\3\2\2\2\17\u00f3\3\2\2\2\21\u00f7\3\2\2\2\23\u00fb\3\2\2"+
		"\2\25\u00ff\3\2\2\2\27\u0103\3\2\2\2\31\u0107\3\2\2\2\33\u010b\3\2\2\2"+
		"\35\u010f\3\2\2\2\37\u0113\3\2\2\2!\u0117\3\2\2\2#\u011b\3\2\2\2%\u011f"+
		"\3\2\2\2\'\u0123\3\2\2\2)\u0127\3\2\2\2+\u012b\3\2\2\2-\u012f\3\2\2\2"+
		"/\u0133\3\2\2\2\61\u0137\3\2\2\2\63\u013b\3\2\2\2\65\u013f\3\2\2\2\67"+
		"\u0143\3\2\2\29\u0147\3\2\2\2;\u014b\3\2\2\2=\u014f\3\2\2\2?\u0153\3\2"+
		"\2\2A\u0157\3\2\2\2C\u015b\3\2\2\2E\u015f\3\2\2\2G\u0163\3\2\2\2I\u0167"+
		"\3\2\2\2K\u016c\3\2\2\2M\u0170\3\2\2\2O\u0175\3\2\2\2Q\u0179\3\2\2\2S"+
		"\u017e\3\2\2\2U\u0182\3\2\2\2W\u0187\3\2\2\2Y\u018c\3\2\2\2[\u0190\3\2"+
		"\2\2]\u0194\3\2\2\2_\u0198\3\2\2\2a\u019c\3\2\2\2c\u01a1\3\2\2\2e\u01a6"+
		"\3\2\2\2g\u01ab\3\2\2\2i\u01b0\3\2\2\2k\u01b5\3\2\2\2m\u01ba\3\2\2\2o"+
		"\u01bf\3\2\2\2q\u01c3\3\2\2\2s\u01c7\3\2\2\2u\u01cb\3\2\2\2w\u01d0\3\2"+
		"\2\2y\u01d5\3\2\2\2{\u01da\3\2\2\2}\u01de\3\2\2\2\177\u01e2\3\2\2\2\u0081"+
		"\u01e6\3\2\2\2\u0083\u01ea\3\2\2\2\u0085\u01ee\3\2\2\2\u0087\u01f2\3\2"+
		"\2\2\u0089\u01f6\3\2\2\2\u008b\u01fa\3\2\2\2\u008d\u01fe\3\2\2\2\u008f"+
		"\u0202\3\2\2\2\u0091\u0206\3\2\2\2\u0093\u020a\3\2\2\2\u0095\u020e\3\2"+
		"\2\2\u0097\u0212\3\2\2\2\u0099\u0216\3\2\2\2\u009b\u021b\3\2\2\2\u009d"+
		"\u021f\3\2\2\2\u009f\u0224\3\2\2\2\u00a1\u0229\3\2\2\2\u00a3\u022d\3\2"+
		"\2\2\u00a5\u0231\3\2\2\2\u00a7\u0235\3\2\2\2\u00a9\u0239\3\2\2\2\u00ab"+
		"\u023d\3\2\2\2\u00ad\u0242\3\2\2\2\u00af\u0247\3\2\2\2\u00b1\u024c\3\2"+
		"\2\2\u00b3\u0251\3\2\2\2\u00b5\u0256\3\2\2\2\u00b7\u025b\3\2\2\2\u00b9"+
		"\u025f\3\2\2\2\u00bb\u0263\3\2\2\2\u00bd\u0268\3\2\2\2\u00bf\u026c\3\2"+
		"\2\2\u00c1\u026e\3\2\2\2\u00c3\u0271\3\2\2\2\u00c5\u0273\3\2\2\2\u00c7"+
		"\u0275\3\2\2\2\u00c9\u0277\3\2\2\2\u00cb\u027a\3\2\2\2\u00cd\u0280\3\2"+
		"\2\2\u00cf\u0287\3\2\2\2\u00d1\u028e\3\2\2\2\u00d3\u0294\3\2\2\2\u00d5"+
		"\u029a\3\2\2\2\u00d7\u02a2\3\2\2\2\u00d9\u02a9\3\2\2\2\u00db\u02ac\3\2"+
		"\2\2\u00dd\u02b4\3\2\2\2\u00df\u02b8\3\2\2\2\u00e1\u00e2\7=\2\2\u00e2"+
		"\4\3\2\2\2\u00e3\u00e4\7?\2\2\u00e4\6\3\2\2\2\u00e5\u00e6\7@\2\2\u00e6"+
		"\b\3\2\2\2\u00e7\u00e8\7f\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7e\2\2\u00ea"+
		"\n\3\2\2\2\u00eb\u00ec\7l\2\2\u00ec\u00ed\7o\2\2\u00ed\u00ee\7u\2\2\u00ee"+
		"\f\3\2\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7|\2\2\u00f1\u00f2\7o\2\2\u00f2"+
		"\16\3\2\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7e\2\2\u00f6"+
		"\20\3\2\2\2\u00f7\u00f8\7z\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7t\2\2\u00fa"+
		"\22\3\2\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7f\2\2\u00fd\u00fe\7f\2\2\u00fe"+
		"\24\3\2\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7c\2\2\u0101\u0102\7f\2\2\u0102"+
		"\26\3\2\2\2\u0103\u0104\7z\2\2\u0104\u0105\7e\2\2\u0105\u0106\7v\2\2\u0106"+
		"\30\3\2\2\2\u0107\u0108\7k\2\2\u0108\u0109\7u\2\2\u0109\u010a\7|\2\2\u010a"+
		"\32\3\2\2\2\u010b\u010c\7c\2\2\u010c\u010d\7p\2\2\u010d\u010e\7f\2\2\u010e"+
		"\34\3\2\2\2\u010f\u0110\7u\2\2\u0110\u0111\7c\2\2\u0111\u0112\7f\2\2\u0112"+
		"\36\3\2\2\2\u0113\u0114\7l\2\2\u0114\u0115\7o\2\2\u0115\u0116\7r\2\2\u0116"+
		" \3\2\2\2\u0117\u0118\7p\2\2\u0118\u0119\7q\2\2\u0119\u011a\7r\2\2\u011a"+
		"\"\3\2\2\2\u011b\u011c\7n\2\2\u011c\u011d\7c\2\2\u011d\u011e\7y\2\2\u011e"+
		"$\3\2\2\2\u011f\u0120\7e\2\2\u0120\u0121\7o\2\2\u0121\u0122\7c\2\2\u0122"+
		"&\3\2\2\2\u0123\u0124\7n\2\2\u0124\u0125\7c\2\2\u0125\u0126\7u\2\2\u0126"+
		"(\3\2\2\2\u0127\u0128\7t\2\2\u0128\u0129\7c\2\2\u0129\u012a\7n\2\2\u012a"+
		"*\3\2\2\2\u012b\u012c\7t\2\2\u012c\u012d\7c\2\2\u012d\u012e\7t\2\2\u012e"+
		",\3\2\2\2\u012f\u0130\7j\2\2\u0130\u0131\7n\2\2\u0131\u0132\7v\2\2\u0132"+
		".\3\2\2\2\u0133\u0134\7u\2\2\u0134\u0135\7o\2\2\u0135\u0136\7c\2\2\u0136"+
		"\60\3\2\2\2\u0137\u0138\7u\2\2\u0138\u0139\7|\2\2\u0139\u013a\7c\2\2\u013a"+
		"\62\3\2\2\2\u013b\u013c\7u\2\2\u013c\u013d\7p\2\2\u013d\u013e\7n\2\2\u013e"+
		"\64\3\2\2\2\u013f\u0140\7u\2\2\u0140\u0141\7m\2\2\u0141\u0142\7r\2\2\u0142"+
		"\66\3\2\2\2\u0143\u0144\7u\2\2\u0144\u0145\7p\2\2\u0145\u0146\7c\2\2\u0146"+
		"8\3\2\2\2\u0147\u0148\7u\2\2\u0148\u0149\7|\2\2\u0149\u014a\7n\2\2\u014a"+
		":\3\2\2\2\u014b\u014c\7t\2\2\u014c\u014d\7v\2\2\u014d\u014e\7n\2\2\u014e"+
		"<\3\2\2\2\u014f\u0150\7t\2\2\u0150\u0151\7v\2\2\u0151\u0152\7t\2\2\u0152"+
		">\3\2\2\2\u0153\u0154\7e\2\2\u0154\u0155\7k\2\2\u0155\u0156\7n\2\2\u0156"+
		"@\3\2\2\2\u0157\u0158\7t\2\2\u0158\u0159\7e\2\2\u0159\u015a\7n\2\2\u015a"+
		"B\3\2\2\2\u015b\u015c\7t\2\2\u015c\u015d\7e\2\2\u015d\u015e\7t\2\2\u015e"+
		"D\3\2\2\2\u015f\u0160\7e\2\2\u0160\u0161\7k\2\2\u0161\u0162\7c\2\2\u0162"+
		"F\3\2\2\2\u0163\u0164\7n\2\2\u0164\u0165\7t\2\2\u0165\u0166\7u\2\2\u0166"+
		"H\3\2\2\2\u0167\u0168\7n\2\2\u0168\u0169\7t\2\2\u0169\u016a\7u\2\2\u016a"+
		"\u016b\7u\2\2\u016bJ\3\2\2\2\u016c\u016d\7n\2\2\u016d\u016e\7n\2\2\u016e"+
		"\u016f\7u\2\2\u016fL\3\2\2\2\u0170\u0171\7n\2\2\u0171\u0172\7n\2\2\u0172"+
		"\u0173\7u\2\2\u0173\u0174\7u\2\2\u0174N\3\2\2\2\u0175\u0176\7c\2\2\u0176"+
		"\u0177\7n\2\2\u0177\u0178\7u\2\2\u0178P\3\2\2\2\u0179\u017a\7c\2\2\u017a"+
		"\u017b\7n\2\2\u017b\u017c\7u\2\2\u017c\u017d\7u\2\2\u017dR\3\2\2\2\u017e"+
		"\u017f\7o\2\2\u017f\u0180\7w\2\2\u0180\u0181\7n\2\2\u0181T\3\2\2\2\u0182"+
		"\u0183\7k\2\2\u0183\u0184\7f\2\2\u0184\u0185\7k\2\2\u0185\u0186\7x\2\2"+
		"\u0186V\3\2\2\2\u0187\u0188\7n\2\2\u0188\u0189\7c\2\2\u0189\u018a\7e\2"+
		"\2\u018a\u018b\7s\2\2\u018bX\3\2\2\2\u018c\u018d\7e\2\2\u018d\u018e\7"+
		"n\2\2\u018e\u018f\7s\2\2\u018fZ\3\2\2\2\u0190\u0191\7q\2\2\u0191\u0192"+
		"\7o\2\2\u0192\u0193\7s\2\2\u0193\\\3\2\2\2\u0194\u0195\7e\2\2\u0195\u0196"+
		"\7o\2\2\u0196\u0197\7s\2\2\u0197^\3\2\2\2\u0198\u0199\7n\2\2\u0199\u019a"+
		"\7o\2\2\u019a\u019b\7s\2\2\u019b`\3\2\2\2\u019c\u019d\7f\2\2\u019d\u019e"+
		"\7u\2\2\u019e\u019f\7e\2\2\u019f\u01a0\7u\2\2\u01a0b\3\2\2\2\u01a1\u01a2"+
		"\7f\2\2\u01a2\u01a3\7u\2\2\u01a3\u01a4\7n\2\2\u01a4\u01a5\7y\2\2\u01a5"+
		"d\3\2\2\2\u01a6\u01a7\7f\2\2\u01a7\u01a8\7u\2\2\u01a8\u01a9\7n\2\2\u01a9"+
		"\u01aa\7o\2\2\u01aaf\3\2\2\2\u01ab\u01ac\7f\2\2\u01ac\u01ad\7u\2\2\u01ad"+
		"\u01ae\7n\2\2\u01ae\u01af\7f\2\2\u01afh\3\2\2\2\u01b0\u01b1\7f\2\2\u01b1"+
		"\u01b2\7u\2\2\u01b2\u01b3\7n\2\2\u01b3\u01b4\7u\2\2\u01b4j\3\2\2\2\u01b5"+
		"\u01b6\7f\2\2\u01b6\u01b7\7u\2\2\u01b7\u01b8\7u\2\2\u01b8\u01b9\7h\2\2"+
		"\u01b9l\3\2\2\2\u01ba\u01bb\7f\2\2\u01bb\u01bc\7u\2\2\u01bc\u01bd\7t\2"+
		"\2\u01bd\u01be\7u\2\2\u01ben\3\2\2\2\u01bf\u01c0\7k\2\2\u01c0\u01c1\7"+
		"q\2\2\u01c1\u01c2\7h\2\2\u01c2p\3\2\2\2\u01c3\u01c4\7k\2\2\u01c4\u01c5"+
		"\7q\2\2\u01c5\u01c6\7p\2\2\u01c6r\3\2\2\2\u01c7\u01c8\7e\2\2\u01c8\u01c9"+
		"\7c\2\2\u01c9\u01ca\7h\2\2\u01cat\3\2\2\2\u01cb\u01cc\7e\2\2\u01cc\u01cd"+
		"\7n\2\2\u01cd\u01ce\7q\2\2\u01ce\u01cf\7p\2\2\u01cfv\3\2\2\2\u01d0\u01d1"+
		"\7e\2\2\u01d1\u01d2\7n\2\2\u01d2\u01d3\7u\2\2\u01d3\u01d4\7h\2\2\u01d4"+
		"x\3\2\2\2\u01d5\u01d6\7e\2\2\u01d6\u01d7\7n\2\2\u01d7\u01d8\7q\2\2\u01d8"+
		"\u01d9\7h\2\2\u01d9z\3\2\2\2\u01da\u01db\7m\2\2\u01db\u01dc\7u\2\2\u01dc"+
		"\u01dd\7h\2\2\u01dd|\3\2\2\2\u01de\u01df\7m\2\2\u01df\u01e0\7t\2\2\u01e0"+
		"\u01e1\7d\2\2\u01e1~\3\2\2\2\u01e2\u01e3\7v\2\2\u01e3\u01e4\7u\2\2\u01e4"+
		"\u01e5\7h\2\2\u01e5\u0080\3\2\2\2\u01e6\u01e7\7v\2\2\u01e7\u01e8\7e\2"+
		"\2\u01e8\u01e9\7h\2\2\u01e9\u0082\3\2\2\2\u01ea\u01eb\7v\2\2\u01eb\u01ec"+
		"\7n\2\2\u01ec\u01ed\7u\2\2\u01ed\u0084\3\2\2\2\u01ee\u01ef\7u\2\2\u01ef"+
		"\u01f0\7e\2\2\u01f0\u01f1\7m\2\2\u01f1\u0086\3\2\2\2\u01f2\u01f3\7e\2"+
		"\2\u01f3\u01f4\7e\2\2\u01f4\u01f5\7m\2\2\u01f5\u0088\3\2\2\2\u01f6\u01f7"+
		"\7n\2\2\u01f7\u01f8\7e\2\2\u01f8\u01f9\7m\2\2\u01f9\u008a\3\2\2\2\u01fa"+
		"\u01fb\7t\2\2\u01fb\u01fc\7u\2\2\u01fc\u01fd\7h\2\2\u01fd\u008c\3\2\2"+
		"\2\u01fe\u01ff\7t\2\2\u01ff\u0200\7u\2\2\u0200\u0201\7c\2\2\u0201\u008e"+
		"\3\2\2\2\u0202\u0203\7t\2\2\u0203\u0204\7t\2\2\u0204\u0205\7d\2\2\u0205"+
		"\u0090\3\2\2\2\u0206\u0207\7r\2\2\u0207\u0208\7u\2\2\u0208\u0209\7h\2"+
		"\2\u0209\u0092\3\2\2\2\u020a\u020b\7r\2\2\u020b\u020c\7e\2\2\u020c\u020d"+
		"\7h\2\2\u020d\u0094\3\2\2\2\u020e\u020f\7r\2\2\u020f\u0210\7u\2\2\u0210"+
		"\u0211\7c\2\2\u0211\u0096\3\2\2\2\u0212\u0213\7e\2\2\u0213\u0214\7f\2"+
		"\2\u0214\u0215\7h\2\2\u0215\u0098\3\2\2\2\u0216\u0217\7t\2\2\u0217\u0218"+
		"\7n\2\2\u0218\u0219\7r\2\2\u0219\u021a\7f\2\2\u021a\u009a\3\2\2\2\u021b"+
		"\u021c\7n\2\2\u021c\u021d\7f\2\2\u021d\u021e\7c\2\2\u021e\u009c\3\2\2"+
		"\2\u021f\u0220\7y\2\2\u0220\u0221\7e\2\2\u0221\u0222\7i\2\2\u0222\u0223"+
		"\7c\2\2\u0223\u009e\3\2\2\2\u0224\u0225\7t\2\2\u0225\u0226\7c\2\2\u0226"+
		"\u0227\7g\2\2\u0227\u0228\7h\2\2\u0228\u00a0\3\2\2\2\u0229\u022a\7d\2"+
		"\2\u022a\u022b\7g\2\2\u022b\u022c\7i\2\2\u022c\u00a2\3\2\2\2\u022d\u022e"+
		"\7u\2\2\u022e\u022f\7r\2\2\u022f\u0230\7d\2\2\u0230\u00a4\3\2\2\2\u0231"+
		"\u0232\7e\2\2\u0232\u0233\7r\2\2\u0233\u0234\7d\2\2\u0234\u00a6\3\2\2"+
		"\2\u0235\u0236\7n\2\2\u0236\u0237\7r\2\2\u0237\u0238\7d\2\2\u0238\u00a8"+
		"\3\2\2\2\u0239\u023a\7y\2\2\u023a\u023b\7d\2\2\u023b\u023c\7n\2\2\u023c"+
		"\u00aa\3\2\2\2\u023d\u023e\7f\2\2\u023e\u023f\7r\2\2\u023f\u0240\7t\2"+
		"\2\u0240\u0241\7u\2\2\u0241\u00ac\3\2\2\2\u0242\u0243\7f\2\2\u0243\u0244"+
		"\7r\2\2\u0244\u0245\7u\2\2\u0245\u0246\7h\2\2\u0246\u00ae\3\2\2\2\u0247"+
		"\u0248\7f\2\2\u0248\u0249\7r\2\2\u0249\u024a\7e\2\2\u024a\u024b\7h\2\2"+
		"\u024b\u00b0\3\2\2\2\u024c\u024d\7f\2\2\u024d\u024e\7r\2\2\u024e\u024f"+
		"\7t\2\2\u024f\u0250\7e\2\2\u0250\u00b2\3\2\2\2\u0251\u0252\7e\2\2\u0252"+
		"\u0253\7t\2\2\u0253\u0254\7u\2\2\u0254\u0255\7h\2\2\u0255\u00b4\3\2\2"+
		"\2\u0256\u0257\7e\2\2\u0257\u0258\7t\2\2\u0258\u0259\7t\2\2\u0259\u025a"+
		"\7d\2\2\u025a\u00b6\3\2\2\2\u025b\u025c\7u\2\2\u025c\u025d\7{\2\2\u025d"+
		"\u025e\7u\2\2\u025e\u00b8\3\2\2\2\u025f\u0260\7e\2\2\u0260\u0261\7|\2"+
		"\2\u0261\u0262\7o\2\2\u0262\u00ba\3\2\2\2\u0263\u0264\7k\2\2\u0264\u0265"+
		"\7t\2\2\u0265\u0266\7u\2\2\u0266\u0267\7u\2\2\u0267\u00bc\3\2\2\2\u0268"+
		"\u0269\7f\2\2\u0269\u026a\7u\2\2\u026a\u026b\7o\2\2\u026b\u00be\3\2\2"+
		"\2\u026c\u026d\7\60\2\2\u026d\u00c0\3\2\2\2\u026e\u026f\7\60\2\2\u026f"+
		"\u0270\7\60\2\2\u0270\u00c2\3\2\2\2\u0271\u0272\7-\2\2\u0272\u00c4\3\2"+
		"\2\2\u0273\u0274\7/\2\2\u0274\u00c6\3\2\2\2\u0275\u0276\7,\2\2\u0276\u00c8"+
		"\3\2\2\2\u0277\u0278\7\61\2\2\u0278\u00ca\3\2\2\2\u0279\u027b\t\2\2\2"+
		"\u027a\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d"+
		"\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\7<\2\2\u027f\u00cc\3\2\2\2\u0280"+
		"\u0284\t\3\2\2\u0281\u0283\t\2\2\2\u0282\u0281\3\2\2\2\u0283\u0286\3\2"+
		"\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u00ce\3\2\2\2\u0286"+
		"\u0284\3\2\2\2\u0287\u028b\t\4\2\2\u0288\u028a\t\5\2\2\u0289\u0288\3\2"+
		"\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u00d0\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u0290\7f\2\2\u028f\u0291\t\4"+
		"\2\2\u0290\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0290\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u00d2\3\2\2\2\u0294\u0296\7q\2\2\u0295\u0297\t\6"+
		"\2\2\u0296\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0296\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u00d4\3\2\2\2\u029a\u029b\7f\2\2\u029b\u029c\7o\2"+
		"\2\u029c\u029e\3\2\2\2\u029d\u029f\t\4\2\2\u029e\u029d\3\2\2\2\u029f\u02a0"+
		"\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u00d6\3\2\2\2\u02a2"+
		"\u02a6\7>\2\2\u02a3\u02a5\t\7\2\2\u02a4\u02a3\3\2\2\2\u02a5\u02a8\3\2"+
		"\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u00d8\3\2\2\2\u02a8"+
		"\u02a6\3\2\2\2\u02a9\u02aa\t\b\2\2\u02aa\u02ab\7@\2\2\u02ab\u00da\3\2"+
		"\2\2\u02ac\u02b0\7$\2\2\u02ad\u02af\n\t\2\2\u02ae\u02ad\3\2\2\2\u02af"+
		"\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u00dc\3\2"+
		"\2\2\u02b2\u02b0\3\2\2\2\u02b3\u02b5\t\t\2\2\u02b4\u02b3\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u00de\3\2"+
		"\2\2\u02b8\u02b9\t\n\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\bp\2\2\u02bb"+
		"\u00e0\3\2\2\2\f\2\u027c\u0284\u028b\u0292\u0298\u02a0\u02a6\u02b0\u02b6"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}