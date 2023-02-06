// Generated from java-escape by ANTLR 4.11.1

    import java.io.*;
    import java.util.Vector;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LANSGrammarParser}.
 */
public interface LANSGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#inici}.
	 * @param ctx the parse tree
	 */
	void enterInici(LANSGrammarParser.IniciContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#inici}.
	 * @param ctx the parse tree
	 */
	void exitInici(LANSGrammarParser.IniciContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LANSGrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LANSGrammarParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#dec_constants}.
	 * @param ctx the parse tree
	 */
	void enterDec_constants(LANSGrammarParser.Dec_constantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#dec_constants}.
	 * @param ctx the parse tree
	 */
	void exitDec_constants(LANSGrammarParser.Dec_constantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#assign_constant}.
	 * @param ctx the parse tree
	 */
	void enterAssign_constant(LANSGrammarParser.Assign_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#assign_constant}.
	 * @param ctx the parse tree
	 */
	void exitAssign_constant(LANSGrammarParser.Assign_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#dec_tipus}.
	 * @param ctx the parse tree
	 */
	void enterDec_tipus(LANSGrammarParser.Dec_tipusContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#dec_tipus}.
	 * @param ctx the parse tree
	 */
	void exitDec_tipus(LANSGrammarParser.Dec_tipusContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(LANSGrammarParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(LANSGrammarParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#tupla}.
	 * @param ctx the parse tree
	 */
	void enterTupla(LANSGrammarParser.TuplaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#tupla}.
	 * @param ctx the parse tree
	 */
	void exitTupla(LANSGrammarParser.TuplaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#declaracio_tipus_nou}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracio_tipus_nou(LANSGrammarParser.Declaracio_tipus_nouContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#declaracio_tipus_nou}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracio_tipus_nou(LANSGrammarParser.Declaracio_tipus_nouContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#params_formals_ent}.
	 * @param ctx the parse tree
	 */
	void enterParams_formals_ent(LANSGrammarParser.Params_formals_entContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#params_formals_ent}.
	 * @param ctx the parse tree
	 */
	void exitParams_formals_ent(LANSGrammarParser.Params_formals_entContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#params_formals_ent_entsor}.
	 * @param ctx the parse tree
	 */
	void enterParams_formals_ent_entsor(LANSGrammarParser.Params_formals_ent_entsorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#params_formals_ent_entsor}.
	 * @param ctx the parse tree
	 */
	void exitParams_formals_ent_entsor(LANSGrammarParser.Params_formals_ent_entsorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#dec_accio}.
	 * @param ctx the parse tree
	 */
	void enterDec_accio(LANSGrammarParser.Dec_accioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#dec_accio}.
	 * @param ctx the parse tree
	 */
	void exitDec_accio(LANSGrammarParser.Dec_accioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#dec_funcio}.
	 * @param ctx the parse tree
	 */
	void enterDec_funcio(LANSGrammarParser.Dec_funcioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#dec_funcio}.
	 * @param ctx the parse tree
	 */
	void exitDec_funcio(LANSGrammarParser.Dec_funcioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#dec_acc_func}.
	 * @param ctx the parse tree
	 */
	void enterDec_acc_func(LANSGrammarParser.Dec_acc_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#dec_acc_func}.
	 * @param ctx the parse tree
	 */
	void exitDec_acc_func(LANSGrammarParser.Dec_acc_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#imp_accio}.
	 * @param ctx the parse tree
	 */
	void enterImp_accio(LANSGrammarParser.Imp_accioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#imp_accio}.
	 * @param ctx the parse tree
	 */
	void exitImp_accio(LANSGrammarParser.Imp_accioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#imp_funcio}.
	 * @param ctx the parse tree
	 */
	void enterImp_funcio(LANSGrammarParser.Imp_funcioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#imp_funcio}.
	 * @param ctx the parse tree
	 */
	void exitImp_funcio(LANSGrammarParser.Imp_funcioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#imp_acc_func}.
	 * @param ctx the parse tree
	 */
	void enterImp_acc_func(LANSGrammarParser.Imp_acc_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#imp_acc_func}.
	 * @param ctx the parse tree
	 */
	void exitImp_acc_func(LANSGrammarParser.Imp_acc_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#dec_variables}.
	 * @param ctx the parse tree
	 */
	void enterDec_variables(LANSGrammarParser.Dec_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#dec_variables}.
	 * @param ctx the parse tree
	 */
	void exitDec_variables(LANSGrammarParser.Dec_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#dec_var}.
	 * @param ctx the parse tree
	 */
	void enterDec_var(LANSGrammarParser.Dec_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#dec_var}.
	 * @param ctx the parse tree
	 */
	void exitDec_var(LANSGrammarParser.Dec_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(LANSGrammarParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(LANSGrammarParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#i}.
	 * @param ctx the parse tree
	 */
	void enterI(LANSGrammarParser.IContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#i}.
	 * @param ctx the parse tree
	 */
	void exitI(LANSGrammarParser.IContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(LANSGrammarParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(LANSGrammarParser.CContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#l}.
	 * @param ctx the parse tree
	 */
	void enterL(LANSGrammarParser.LContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#l}.
	 * @param ctx the parse tree
	 */
	void exitL(LANSGrammarParser.LContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(LANSGrammarParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(LANSGrammarParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(LANSGrammarParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(LANSGrammarParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(LANSGrammarParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(LANSGrammarParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(LANSGrammarParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(LANSGrammarParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#expressio}.
	 * @param ctx the parse tree
	 */
	void enterExpressio(LANSGrammarParser.ExpressioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#expressio}.
	 * @param ctx the parse tree
	 */
	void exitExpressio(LANSGrammarParser.ExpressioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#acces_tupla}.
	 * @param ctx the parse tree
	 */
	void enterAcces_tupla(LANSGrammarParser.Acces_tuplaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#acces_tupla}.
	 * @param ctx the parse tree
	 */
	void exitAcces_tupla(LANSGrammarParser.Acces_tuplaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#acces_vector}.
	 * @param ctx the parse tree
	 */
	void enterAcces_vector(LANSGrammarParser.Acces_vectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#acces_vector}.
	 * @param ctx the parse tree
	 */
	void exitAcces_vector(LANSGrammarParser.Acces_vectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#crida_funcio}.
	 * @param ctx the parse tree
	 */
	void enterCrida_funcio(LANSGrammarParser.Crida_funcioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#crida_funcio}.
	 * @param ctx the parse tree
	 */
	void exitCrida_funcio(LANSGrammarParser.Crida_funcioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(LANSGrammarParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(LANSGrammarParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#llegir}.
	 * @param ctx the parse tree
	 */
	void enterLlegir(LANSGrammarParser.LlegirContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#llegir}.
	 * @param ctx the parse tree
	 */
	void exitLlegir(LANSGrammarParser.LlegirContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#escriure}.
	 * @param ctx the parse tree
	 */
	void enterEscriure(LANSGrammarParser.EscriureContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#escriure}.
	 * @param ctx the parse tree
	 */
	void exitEscriure(LANSGrammarParser.EscriureContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#escriure_ln}.
	 * @param ctx the parse tree
	 */
	void enterEscriure_ln(LANSGrammarParser.Escriure_lnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#escriure_ln}.
	 * @param ctx the parse tree
	 */
	void exitEscriure_ln(LANSGrammarParser.Escriure_lnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#assign_variable}.
	 * @param ctx the parse tree
	 */
	void enterAssign_variable(LANSGrammarParser.Assign_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#assign_variable}.
	 * @param ctx the parse tree
	 */
	void exitAssign_variable(LANSGrammarParser.Assign_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(LANSGrammarParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(LANSGrammarParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#mentre}.
	 * @param ctx the parse tree
	 */
	void enterMentre(LANSGrammarParser.MentreContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#mentre}.
	 * @param ctx the parse tree
	 */
	void exitMentre(LANSGrammarParser.MentreContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#per}.
	 * @param ctx the parse tree
	 */
	void enterPer(LANSGrammarParser.PerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#per}.
	 * @param ctx the parse tree
	 */
	void exitPer(LANSGrammarParser.PerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#repetir}.
	 * @param ctx the parse tree
	 */
	void enterRepetir(LANSGrammarParser.RepetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#repetir}.
	 * @param ctx the parse tree
	 */
	void exitRepetir(LANSGrammarParser.RepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#crida_accio}.
	 * @param ctx the parse tree
	 */
	void enterCrida_accio(LANSGrammarParser.Crida_accioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#crida_accio}.
	 * @param ctx the parse tree
	 */
	void exitCrida_accio(LANSGrammarParser.Crida_accioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LANSGrammarParser#valor_constant}.
	 * @param ctx the parse tree
	 */
	void enterValor_constant(LANSGrammarParser.Valor_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link LANSGrammarParser#valor_constant}.
	 * @param ctx the parse tree
	 */
	void exitValor_constant(LANSGrammarParser.Valor_constantContext ctx);
}