// Generated from E:\Tsmart Projects\ParseBIP\resource\Expr.g4 by ANTLR 4.1
package ast;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, CT_INT=14, CT_CHAR=15, CT_FLOAT=16, 
		CT_DOUBLE=17, TRUE=18, FALSE=19, EXTERN=20, EXPORT=21, DEFINE=22, PACKAGE=23, 
		END=24, DOT=25, USE=26, AS=27, SEMICOL=28, ATOM=29, COMPOUND=30, COMPONENT=31, 
		ON=32, INTERNAL=33, DO=34, PROVIDED=35, INITIAL=36, PLACE=37, FROM=38, 
		TO=39, PRIORITY=40, CONNECTOR=41, UP_ACTION=42, DOWN_ACTION=43, PORT=44, 
		TYPE=45, LPAREN=46, RPAREN=47, COMMA=48, QUOTE=49, IF=50, THEN=51, ELSE=52, 
		FI=53, ID=54, INT=55, FLOAT=56, COMMENT=57, WS=58, STRING=59, LT_OP=60, 
		GT_OP=61, LE_OP=62, GE_OP=63, EQ_OP=64, NE_OP=65, AND_OP=66, OR_OP=67;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'%'", "'&'", "'^'", "'+'", "'-'", "'*'", "'='", "'{'", "'/'", "'~'", 
		"'}'", "'|'", "'!'", "'int'", "'char'", "'float'", "'double'", "'true'", 
		"'false'", "'extern'", "'export'", "'define'", "'package'", "'end'", "'.'", 
		"'use'", "'as'", "';'", "'atom'", "'compound'", "'component'", "'on'", 
		"'internal'", "'do'", "'provided'", "'initial'", "'place'", "'from'", 
		"'to'", "'priority'", "'connector'", "'up'", "'down'", "'port'", "'type'", 
		"'('", "')'", "','", "'''", "'if'", "'then'", "'else'", "'fi'", "ID", 
		"INT", "FLOAT", "COMMENT", "WS", "STRING", "'<'", "'>'", "'<='", "'>='", 
		"'=='", "'!='", "'&&'", "'||'"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "CT_INT", "CT_CHAR", "CT_FLOAT", "CT_DOUBLE", 
		"TRUE", "FALSE", "EXTERN", "EXPORT", "DEFINE", "PACKAGE", "END", "DOT", 
		"USE", "AS", "SEMICOL", "ATOM", "COMPOUND", "COMPONENT", "ON", "INTERNAL", 
		"DO", "PROVIDED", "INITIAL", "PLACE", "FROM", "TO", "PRIORITY", "CONNECTOR", 
		"UP_ACTION", "DOWN_ACTION", "PORT", "TYPE", "LPAREN", "RPAREN", "COMMA", 
		"QUOTE", "IF", "THEN", "ELSE", "FI", "ID", "INT", "FLOAT", "COMMENT", 
		"WS", "STRING", "EXPONENT", "HEX_DIGIT", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC", 
		"LT_OP", "GT_OP", "LE_OP", "GE_OP", "EQ_OP", "NE_OP", "AND_OP", "OR_OP"
	};


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 56: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 57: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2E\u0208\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-"+
		"\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\67\3\67\7\67\u0180\n\67\f\67\16\67\u0183\13\67\38\68\u0186\n8\r8\16"+
		"8\u0187\39\69\u018b\n9\r9\169\u018c\39\39\79\u0191\n9\f9\169\u0194\13"+
		"9\39\59\u0197\n9\39\39\69\u019b\n9\r9\169\u019c\39\59\u01a0\n9\39\69\u01a3"+
		"\n9\r9\169\u01a4\39\59\u01a8\n9\3:\3:\3:\3:\7:\u01ae\n:\f:\16:\u01b1\13"+
		":\3:\3:\3:\3:\3:\3:\7:\u01b9\n:\f:\16:\u01bc\13:\5:\u01be\n:\3:\3:\3;"+
		"\3;\3;\3;\3<\3<\3<\7<\u01c9\n<\f<\16<\u01cc\13<\3<\3<\3=\3=\5=\u01d2\n"+
		"=\3=\6=\u01d5\n=\r=\16=\u01d6\3>\3>\3?\3?\3?\3?\5?\u01df\n?\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\5@\u01ea\n@\3A\3A\3A\3A\3A\3A\3A\3B\3B\3C\3C\3D\3D\3"+
		"D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3\u01afJ\3\3\1\5\4\1\7"+
		"\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33"+
		"\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1"+
		"\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1"+
		"I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64"+
		"\1g\65\1i\66\1k\67\1m8\1o9\1q:\1s;\2u<\3w=\1y\2\1{\2\1}\2\1\177\2\1\u0081"+
		"\2\1\u0083>\1\u0085?\1\u0087@\1\u0089A\1\u008bB\1\u008dC\1\u008fD\1\u0091"+
		"E\1\3\2\13\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\""+
		"\4\2$$^^\4\2GGgg\4\2--//\5\2\62;CHch\n\2$$))^^ddhhppttvv\u0217\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u0093\3\2\2\2\5\u0095\3\2\2\2\7\u0097"+
		"\3\2\2\2\t\u0099\3\2\2\2\13\u009b\3\2\2\2\r\u009d\3\2\2\2\17\u009f\3\2"+
		"\2\2\21\u00a1\3\2\2\2\23\u00a3\3\2\2\2\25\u00a5\3\2\2\2\27\u00a7\3\2\2"+
		"\2\31\u00a9\3\2\2\2\33\u00ab\3\2\2\2\35\u00ad\3\2\2\2\37\u00b1\3\2\2\2"+
		"!\u00b6\3\2\2\2#\u00bc\3\2\2\2%\u00c3\3\2\2\2\'\u00c8\3\2\2\2)\u00ce\3"+
		"\2\2\2+\u00d5\3\2\2\2-\u00dc\3\2\2\2/\u00e3\3\2\2\2\61\u00eb\3\2\2\2\63"+
		"\u00ef\3\2\2\2\65\u00f1\3\2\2\2\67\u00f5\3\2\2\29\u00f8\3\2\2\2;\u00fa"+
		"\3\2\2\2=\u00ff\3\2\2\2?\u0108\3\2\2\2A\u0112\3\2\2\2C\u0115\3\2\2\2E"+
		"\u011e\3\2\2\2G\u0121\3\2\2\2I\u012a\3\2\2\2K\u0132\3\2\2\2M\u0138\3\2"+
		"\2\2O\u013d\3\2\2\2Q\u0140\3\2\2\2S\u0149\3\2\2\2U\u0153\3\2\2\2W\u0156"+
		"\3\2\2\2Y\u015b\3\2\2\2[\u0160\3\2\2\2]\u0165\3\2\2\2_\u0167\3\2\2\2a"+
		"\u0169\3\2\2\2c\u016b\3\2\2\2e\u016d\3\2\2\2g\u0170\3\2\2\2i\u0175\3\2"+
		"\2\2k\u017a\3\2\2\2m\u017d\3\2\2\2o\u0185\3\2\2\2q\u01a7\3\2\2\2s\u01bd"+
		"\3\2\2\2u\u01c1\3\2\2\2w\u01c5\3\2\2\2y\u01cf\3\2\2\2{\u01d8\3\2\2\2}"+
		"\u01de\3\2\2\2\177\u01e9\3\2\2\2\u0081\u01eb\3\2\2\2\u0083\u01f2\3\2\2"+
		"\2\u0085\u01f4\3\2\2\2\u0087\u01f6\3\2\2\2\u0089\u01f9\3\2\2\2\u008b\u01fc"+
		"\3\2\2\2\u008d\u01ff\3\2\2\2\u008f\u0202\3\2\2\2\u0091\u0205\3\2\2\2\u0093"+
		"\u0094\7\'\2\2\u0094\4\3\2\2\2\u0095\u0096\7(\2\2\u0096\6\3\2\2\2\u0097"+
		"\u0098\7`\2\2\u0098\b\3\2\2\2\u0099\u009a\7-\2\2\u009a\n\3\2\2\2\u009b"+
		"\u009c\7/\2\2\u009c\f\3\2\2\2\u009d\u009e\7,\2\2\u009e\16\3\2\2\2\u009f"+
		"\u00a0\7?\2\2\u00a0\20\3\2\2\2\u00a1\u00a2\7}\2\2\u00a2\22\3\2\2\2\u00a3"+
		"\u00a4\7\61\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7\u0080\2\2\u00a6\26\3\2"+
		"\2\2\u00a7\u00a8\7\177\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7~\2\2\u00aa\32"+
		"\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae"+
		"\u00af\7p\2\2\u00af\u00b0\7v\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7e\2\2\u00b2"+
		"\u00b3\7j\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7t\2\2\u00b5 \3\2\2\2\u00b6"+
		"\u00b7\7h\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7c\2\2"+
		"\u00ba\u00bb\7v\2\2\u00bb\"\3\2\2\2\u00bc\u00bd\7f\2\2\u00bd\u00be\7q"+
		"\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7d\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2$\3\2\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6"+
		"\7w\2\2\u00c6\u00c7\7g\2\2\u00c7&\3\2\2\2\u00c8\u00c9\7h\2\2\u00c9\u00ca"+
		"\7c\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"(\3\2\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7z\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		"\u00d2\7g\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7p\2\2\u00d4*\3\2\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6\u00d7\7z\2\2\u00d7\u00d8\7r\2\2\u00d8\u00d9\7q\2\2"+
		"\u00d9\u00da\7t\2\2\u00da\u00db\7v\2\2\u00db,\3\2\2\2\u00dc\u00dd\7f\2"+
		"\2\u00dd\u00de\7g\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1"+
		"\7p\2\2\u00e1\u00e2\7g\2\2\u00e2.\3\2\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5"+
		"\7c\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7\7m\2\2\u00e7\u00e8\7c\2\2\u00e8"+
		"\u00e9\7i\2\2\u00e9\u00ea\7g\2\2\u00ea\60\3\2\2\2\u00eb\u00ec\7g\2\2\u00ec"+
		"\u00ed\7p\2\2\u00ed\u00ee\7f\2\2\u00ee\62\3\2\2\2\u00ef\u00f0\7\60\2\2"+
		"\u00f0\64\3\2\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7"+
		"g\2\2\u00f4\66\3\2\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7u\2\2\u00f78\3"+
		"\2\2\2\u00f8\u00f9\7=\2\2\u00f9:\3\2\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc"+
		"\7v\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7o\2\2\u00fe<\3\2\2\2\u00ff\u0100"+
		"\7e\2\2\u0100\u0101\7q\2\2\u0101\u0102\7o\2\2\u0102\u0103\7r\2\2\u0103"+
		"\u0104\7q\2\2\u0104\u0105\7w\2\2\u0105\u0106\7p\2\2\u0106\u0107\7f\2\2"+
		"\u0107>\3\2\2\2\u0108\u0109\7e\2\2\u0109\u010a\7q\2\2\u010a\u010b\7o\2"+
		"\2\u010b\u010c\7r\2\2\u010c\u010d\7q\2\2\u010d\u010e\7p\2\2\u010e\u010f"+
		"\7g\2\2\u010f\u0110\7p\2\2\u0110\u0111\7v\2\2\u0111@\3\2\2\2\u0112\u0113"+
		"\7q\2\2\u0113\u0114\7p\2\2\u0114B\3\2\2\2\u0115\u0116\7k\2\2\u0116\u0117"+
		"\7p\2\2\u0117\u0118\7v\2\2\u0118\u0119\7g\2\2\u0119\u011a\7t\2\2\u011a"+
		"\u011b\7p\2\2\u011b\u011c\7c\2\2\u011c\u011d\7n\2\2\u011dD\3\2\2\2\u011e"+
		"\u011f\7f\2\2\u011f\u0120\7q\2\2\u0120F\3\2\2\2\u0121\u0122\7r\2\2\u0122"+
		"\u0123\7t\2\2\u0123\u0124\7q\2\2\u0124\u0125\7x\2\2\u0125\u0126\7k\2\2"+
		"\u0126\u0127\7f\2\2\u0127\u0128\7g\2\2\u0128\u0129\7f\2\2\u0129H\3\2\2"+
		"\2\u012a\u012b\7k\2\2\u012b\u012c\7p\2\2\u012c\u012d\7k\2\2\u012d\u012e"+
		"\7v\2\2\u012e\u012f\7k\2\2\u012f\u0130\7c\2\2\u0130\u0131\7n\2\2\u0131"+
		"J\3\2\2\2\u0132\u0133\7r\2\2\u0133\u0134\7n\2\2\u0134\u0135\7c\2\2\u0135"+
		"\u0136\7e\2\2\u0136\u0137\7g\2\2\u0137L\3\2\2\2\u0138\u0139\7h\2\2\u0139"+
		"\u013a\7t\2\2\u013a\u013b\7q\2\2\u013b\u013c\7o\2\2\u013cN\3\2\2\2\u013d"+
		"\u013e\7v\2\2\u013e\u013f\7q\2\2\u013fP\3\2\2\2\u0140\u0141\7r\2\2\u0141"+
		"\u0142\7t\2\2\u0142\u0143\7k\2\2\u0143\u0144\7q\2\2\u0144\u0145\7t\2\2"+
		"\u0145\u0146\7k\2\2\u0146\u0147\7v\2\2\u0147\u0148\7{\2\2\u0148R\3\2\2"+
		"\2\u0149\u014a\7e\2\2\u014a\u014b\7q\2\2\u014b\u014c\7p\2\2\u014c\u014d"+
		"\7p\2\2\u014d\u014e\7g\2\2\u014e\u014f\7e\2\2\u014f\u0150\7v\2\2\u0150"+
		"\u0151\7q\2\2\u0151\u0152\7t\2\2\u0152T\3\2\2\2\u0153\u0154\7w\2\2\u0154"+
		"\u0155\7r\2\2\u0155V\3\2\2\2\u0156\u0157\7f\2\2\u0157\u0158\7q\2\2\u0158"+
		"\u0159\7y\2\2\u0159\u015a\7p\2\2\u015aX\3\2\2\2\u015b\u015c\7r\2\2\u015c"+
		"\u015d\7q\2\2\u015d\u015e\7t\2\2\u015e\u015f\7v\2\2\u015fZ\3\2\2\2\u0160"+
		"\u0161\7v\2\2\u0161\u0162\7{\2\2\u0162\u0163\7r\2\2\u0163\u0164\7g\2\2"+
		"\u0164\\\3\2\2\2\u0165\u0166\7*\2\2\u0166^\3\2\2\2\u0167\u0168\7+\2\2"+
		"\u0168`\3\2\2\2\u0169\u016a\7.\2\2\u016ab\3\2\2\2\u016b\u016c\7)\2\2\u016c"+
		"d\3\2\2\2\u016d\u016e\7k\2\2\u016e\u016f\7h\2\2\u016ff\3\2\2\2\u0170\u0171"+
		"\7v\2\2\u0171\u0172\7j\2\2\u0172\u0173\7g\2\2\u0173\u0174\7p\2\2\u0174"+
		"h\3\2\2\2\u0175\u0176\7g\2\2\u0176\u0177\7n\2\2\u0177\u0178\7u\2\2\u0178"+
		"\u0179\7g\2\2\u0179j\3\2\2\2\u017a\u017b\7h\2\2\u017b\u017c\7k\2\2\u017c"+
		"l\3\2\2\2\u017d\u0181\t\2\2\2\u017e\u0180\t\3\2\2\u017f\u017e\3\2\2\2"+
		"\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182n\3"+
		"\2\2\2\u0183\u0181\3\2\2\2\u0184\u0186\4\62;\2\u0185\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188p\3\2\2\2"+
		"\u0189\u018b\4\62;\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0192\7\60\2\2"+
		"\u018f\u0191\4\62;\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190"+
		"\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0195"+
		"\u0197\5y=\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u01a8\3\2\2"+
		"\2\u0198\u019a\7\60\2\2\u0199\u019b\4\62;\2\u019a\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2"+
		"\2\2\u019e\u01a0\5y=\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a8"+
		"\3\2\2\2\u01a1\u01a3\4\62;\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\5y"+
		"=\2\u01a7\u018a\3\2\2\2\u01a7\u0198\3\2\2\2\u01a7\u01a2\3\2\2\2\u01a8"+
		"r\3\2\2\2\u01a9\u01aa\7\61\2\2\u01aa\u01ab\7,\2\2\u01ab\u01af\3\2\2\2"+
		"\u01ac\u01ae\13\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2"+
		"\u01b3\7,\2\2\u01b3\u01be\7\61\2\2\u01b4\u01b5\7\61\2\2\u01b5\u01b6\7"+
		"\61\2\2\u01b6\u01ba\3\2\2\2\u01b7\u01b9\n\4\2\2\u01b8\u01b7\3\2\2\2\u01b9"+
		"\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01be\3\2"+
		"\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01a9\3\2\2\2\u01bd\u01b4\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c0\b:\2\2\u01c0t\3\2\2\2\u01c1\u01c2\t\5\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c4\b;\3\2\u01c4v\3\2\2\2\u01c5\u01ca\7$\2\2\u01c6"+
		"\u01c9\5}?\2\u01c7\u01c9\n\6\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2"+
		"\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd"+
		"\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01ce\7$\2\2\u01cex\3\2\2\2\u01cf\u01d1"+
		"\t\7\2\2\u01d0\u01d2\t\b\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d4\3\2\2\2\u01d3\u01d5\4\62;\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7z\3\2\2\2\u01d8\u01d9"+
		"\t\t\2\2\u01d9|\3\2\2\2\u01da\u01db\7^\2\2\u01db\u01df\t\n\2\2\u01dc\u01df"+
		"\5\u0081A\2\u01dd\u01df\5\177@\2\u01de\u01da\3\2\2\2\u01de\u01dc\3\2\2"+
		"\2\u01de\u01dd\3\2\2\2\u01df~\3\2\2\2\u01e0\u01e1\7^\2\2\u01e1\u01e2\4"+
		"\62\65\2\u01e2\u01e3\4\629\2\u01e3\u01ea\4\629\2\u01e4\u01e5\7^\2\2\u01e5"+
		"\u01e6\4\629\2\u01e6\u01ea\4\629\2\u01e7\u01e8\7^\2\2\u01e8\u01ea\4\62"+
		"9\2\u01e9\u01e0\3\2\2\2\u01e9\u01e4\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea"+
		"\u0080\3\2\2\2\u01eb\u01ec\7^\2\2\u01ec\u01ed\7w\2\2\u01ed\u01ee\5{>\2"+
		"\u01ee\u01ef\5{>\2\u01ef\u01f0\5{>\2\u01f0\u01f1\5{>\2\u01f1\u0082\3\2"+
		"\2\2\u01f2\u01f3\7>\2\2\u01f3\u0084\3\2\2\2\u01f4\u01f5\7@\2\2\u01f5\u0086"+
		"\3\2\2\2\u01f6\u01f7\7>\2\2\u01f7\u01f8\7?\2\2\u01f8\u0088\3\2\2\2\u01f9"+
		"\u01fa\7@\2\2\u01fa\u01fb\7?\2\2\u01fb\u008a\3\2\2\2\u01fc\u01fd\7?\2"+
		"\2\u01fd\u01fe\7?\2\2\u01fe\u008c\3\2\2\2\u01ff\u0200\7#\2\2\u0200\u0201"+
		"\7?\2\2\u0201\u008e\3\2\2\2\u0202\u0203\7(\2\2\u0203\u0204\7(\2\2\u0204"+
		"\u0090\3\2\2\2\u0205\u0206\7~\2\2\u0206\u0207\7~\2\2\u0207\u0092\3\2\2"+
		"\2\25\2\u0181\u0187\u018c\u0192\u0196\u019c\u019f\u01a4\u01a7\u01af\u01ba"+
		"\u01bd\u01c8\u01ca\u01d1\u01d6\u01de\u01e9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}