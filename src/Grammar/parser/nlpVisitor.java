// Generated from /media/trungbkit/DATA/document/OneDrive/4thYear/Xu ly ngon ngu tu nhien/NLP/src/Grammar/nlp.g4 by ANTLR 4.7
package Grammar.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link nlpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface nlpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link nlpParser#city_np}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCity_np(nlpParser.City_npContext ctx);
	/**
	 * Visit a parse tree produced by {@link nlpParser#flight_dest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlight_dest(nlpParser.Flight_destContext ctx);
	/**
	 * Visit a parse tree produced by {@link nlpParser#flight_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlight_time(nlpParser.Flight_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link nlpParser#flight_v}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlight_v(nlpParser.Flight_vContext ctx);
	/**
	 * Visit a parse tree produced by {@link nlpParser#flight_vp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlight_vp(nlpParser.Flight_vpContext ctx);
	/**
	 * Visit a parse tree produced by {@link nlpParser#flight_cnp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlight_cnp(nlpParser.Flight_cnpContext ctx);
	/**
	 * Visit a parse tree produced by {@link nlpParser#flight_np}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlight_np(nlpParser.Flight_npContext ctx);
	/**
	 * Visit a parse tree produced by {@link nlpParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(nlpParser.SContext ctx);
}