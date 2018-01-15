package championsProject.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import championsProject.services.XTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXTextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Fifa'", "'{'", "','", "'}'", "'type'", "'trophy'", "'team'", "'('", "')'", "'stadium'", "'president'", "':'", "'coach'", "'player'", "'capacity'", "'President'", "'age'", "'Coach'", "'contrat'", "'agent'", "'Player'", "'position'", "'status'", "'-'", "'Agent'", "'championship'", "'cup'", "'worldCup'", "'town'", "'national'", "'centralMidfielder'", "'centralBack'", "'goalKeeper'", "'leftMidfielder'", "'rightMidfielder'", "'rightBack'", "'leftBack'", "'striker'", "'starter'", "'substitute'", "'injured'", "'suspended'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalXTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXTextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXText.g"; }



     	private XTextGrammarAccess grammarAccess;

        public InternalXTextParser(TokenStream input, XTextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Fifa";
       	}

       	@Override
       	protected XTextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFifa"
    // InternalXText.g:65:1: entryRuleFifa returns [EObject current=null] : iv_ruleFifa= ruleFifa EOF ;
    public final EObject entryRuleFifa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFifa = null;


        try {
            // InternalXText.g:65:45: (iv_ruleFifa= ruleFifa EOF )
            // InternalXText.g:66:2: iv_ruleFifa= ruleFifa EOF
            {
             newCompositeNode(grammarAccess.getFifaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFifa=ruleFifa();

            state._fsp--;

             current =iv_ruleFifa; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFifa"


    // $ANTLR start "ruleFifa"
    // InternalXText.g:72:1: ruleFifa returns [EObject current=null] : (otherlv_0= 'Fifa' otherlv_1= '{' ( (lv_country_2_0= ruleCountry ) ) (otherlv_3= ',' ( (lv_country_4_0= ruleCountry ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleFifa() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_country_2_0 = null;

        EObject lv_country_4_0 = null;



        	enterRule();

        try {
            // InternalXText.g:78:2: ( (otherlv_0= 'Fifa' otherlv_1= '{' ( (lv_country_2_0= ruleCountry ) ) (otherlv_3= ',' ( (lv_country_4_0= ruleCountry ) ) )* otherlv_5= '}' ) )
            // InternalXText.g:79:2: (otherlv_0= 'Fifa' otherlv_1= '{' ( (lv_country_2_0= ruleCountry ) ) (otherlv_3= ',' ( (lv_country_4_0= ruleCountry ) ) )* otherlv_5= '}' )
            {
            // InternalXText.g:79:2: (otherlv_0= 'Fifa' otherlv_1= '{' ( (lv_country_2_0= ruleCountry ) ) (otherlv_3= ',' ( (lv_country_4_0= ruleCountry ) ) )* otherlv_5= '}' )
            // InternalXText.g:80:3: otherlv_0= 'Fifa' otherlv_1= '{' ( (lv_country_2_0= ruleCountry ) ) (otherlv_3= ',' ( (lv_country_4_0= ruleCountry ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFifaAccess().getFifaKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFifaAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXText.g:88:3: ( (lv_country_2_0= ruleCountry ) )
            // InternalXText.g:89:4: (lv_country_2_0= ruleCountry )
            {
            // InternalXText.g:89:4: (lv_country_2_0= ruleCountry )
            // InternalXText.g:90:5: lv_country_2_0= ruleCountry
            {

            					newCompositeNode(grammarAccess.getFifaAccess().getCountryCountryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_country_2_0=ruleCountry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFifaRule());
            					}
            					add(
            						current,
            						"country",
            						lv_country_2_0,
            						"championsProject.XText.Country");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXText.g:107:3: (otherlv_3= ',' ( (lv_country_4_0= ruleCountry ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXText.g:108:4: otherlv_3= ',' ( (lv_country_4_0= ruleCountry ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFifaAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalXText.g:112:4: ( (lv_country_4_0= ruleCountry ) )
            	    // InternalXText.g:113:5: (lv_country_4_0= ruleCountry )
            	    {
            	    // InternalXText.g:113:5: (lv_country_4_0= ruleCountry )
            	    // InternalXText.g:114:6: lv_country_4_0= ruleCountry
            	    {

            	    						newCompositeNode(grammarAccess.getFifaAccess().getCountryCountryParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_country_4_0=ruleCountry();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFifaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"country",
            	    							lv_country_4_0,
            	    							"championsProject.XText.Country");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFifaAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFifa"


    // $ANTLR start "entryRuleCountry"
    // InternalXText.g:140:1: entryRuleCountry returns [EObject current=null] : iv_ruleCountry= ruleCountry EOF ;
    public final EObject entryRuleCountry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountry = null;


        try {
            // InternalXText.g:140:48: (iv_ruleCountry= ruleCountry EOF )
            // InternalXText.g:141:2: iv_ruleCountry= ruleCountry EOF
            {
             newCompositeNode(grammarAccess.getCountryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountry=ruleCountry();

            state._fsp--;

             current =iv_ruleCountry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCountry"


    // $ANTLR start "ruleCountry"
    // InternalXText.g:147:1: ruleCountry returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_competition_3_0= ruleCompetition ) ) (otherlv_4= ',' ( (lv_competition_5_0= ruleCompetition ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleCountry() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_competition_3_0 = null;

        EObject lv_competition_5_0 = null;



        	enterRule();

        try {
            // InternalXText.g:153:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_competition_3_0= ruleCompetition ) ) (otherlv_4= ',' ( (lv_competition_5_0= ruleCompetition ) ) )* otherlv_6= '}' ) )
            // InternalXText.g:154:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_competition_3_0= ruleCompetition ) ) (otherlv_4= ',' ( (lv_competition_5_0= ruleCompetition ) ) )* otherlv_6= '}' )
            {
            // InternalXText.g:154:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_competition_3_0= ruleCompetition ) ) (otherlv_4= ',' ( (lv_competition_5_0= ruleCompetition ) ) )* otherlv_6= '}' )
            // InternalXText.g:155:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_competition_3_0= ruleCompetition ) ) (otherlv_4= ',' ( (lv_competition_5_0= ruleCompetition ) ) )* otherlv_6= '}'
            {
            // InternalXText.g:155:3: ()
            // InternalXText.g:156:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCountryAccess().getCountryAction_0(),
            					current);
            			

            }

            // InternalXText.g:162:3: ( (lv_name_1_0= ruleEString ) )
            // InternalXText.g:163:4: (lv_name_1_0= ruleEString )
            {
            // InternalXText.g:163:4: (lv_name_1_0= ruleEString )
            // InternalXText.g:164:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCountryAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"championsProject.XText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCountryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXText.g:185:3: ( (lv_competition_3_0= ruleCompetition ) )
            // InternalXText.g:186:4: (lv_competition_3_0= ruleCompetition )
            {
            // InternalXText.g:186:4: (lv_competition_3_0= ruleCompetition )
            // InternalXText.g:187:5: lv_competition_3_0= ruleCompetition
            {

            					newCompositeNode(grammarAccess.getCountryAccess().getCompetitionCompetitionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_competition_3_0=ruleCompetition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountryRule());
            					}
            					add(
            						current,
            						"competition",
            						lv_competition_3_0,
            						"championsProject.XText.Competition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXText.g:204:3: (otherlv_4= ',' ( (lv_competition_5_0= ruleCompetition ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXText.g:205:4: otherlv_4= ',' ( (lv_competition_5_0= ruleCompetition ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCountryAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalXText.g:209:4: ( (lv_competition_5_0= ruleCompetition ) )
            	    // InternalXText.g:210:5: (lv_competition_5_0= ruleCompetition )
            	    {
            	    // InternalXText.g:210:5: (lv_competition_5_0= ruleCompetition )
            	    // InternalXText.g:211:6: lv_competition_5_0= ruleCompetition
            	    {

            	    						newCompositeNode(grammarAccess.getCountryAccess().getCompetitionCompetitionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_competition_5_0=ruleCompetition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCountryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"competition",
            	    							lv_competition_5_0,
            	    							"championsProject.XText.Competition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCountryAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCountry"


    // $ANTLR start "entryRuleEString"
    // InternalXText.g:237:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalXText.g:237:47: (iv_ruleEString= ruleEString EOF )
            // InternalXText.g:238:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalXText.g:244:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalXText.g:250:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalXText.g:251:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalXText.g:251:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXText.g:252:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXText.g:260:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCompetition"
    // InternalXText.g:271:1: entryRuleCompetition returns [EObject current=null] : iv_ruleCompetition= ruleCompetition EOF ;
    public final EObject entryRuleCompetition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompetition = null;


        try {
            // InternalXText.g:271:52: (iv_ruleCompetition= ruleCompetition EOF )
            // InternalXText.g:272:2: iv_ruleCompetition= ruleCompetition EOF
            {
             newCompositeNode(grammarAccess.getCompetitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompetition=ruleCompetition();

            state._fsp--;

             current =iv_ruleCompetition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompetition"


    // $ANTLR start "ruleCompetition"
    // InternalXText.g:278:1: ruleCompetition returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'type' ( (lv_type_3_0= ruleCompetitionType ) ) )? otherlv_4= 'trophy' ( (lv_trophy_5_0= ruleTrophy ) ) otherlv_6= 'team' otherlv_7= '{' ( (lv_team_8_0= ruleTeam ) ) (otherlv_9= ',' ( (lv_team_10_0= ruleTeam ) ) )* otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleCompetition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_type_3_0 = null;

        EObject lv_trophy_5_0 = null;

        EObject lv_team_8_0 = null;

        EObject lv_team_10_0 = null;



        	enterRule();

        try {
            // InternalXText.g:284:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'type' ( (lv_type_3_0= ruleCompetitionType ) ) )? otherlv_4= 'trophy' ( (lv_trophy_5_0= ruleTrophy ) ) otherlv_6= 'team' otherlv_7= '{' ( (lv_team_8_0= ruleTeam ) ) (otherlv_9= ',' ( (lv_team_10_0= ruleTeam ) ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // InternalXText.g:285:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'type' ( (lv_type_3_0= ruleCompetitionType ) ) )? otherlv_4= 'trophy' ( (lv_trophy_5_0= ruleTrophy ) ) otherlv_6= 'team' otherlv_7= '{' ( (lv_team_8_0= ruleTeam ) ) (otherlv_9= ',' ( (lv_team_10_0= ruleTeam ) ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // InternalXText.g:285:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'type' ( (lv_type_3_0= ruleCompetitionType ) ) )? otherlv_4= 'trophy' ( (lv_trophy_5_0= ruleTrophy ) ) otherlv_6= 'team' otherlv_7= '{' ( (lv_team_8_0= ruleTeam ) ) (otherlv_9= ',' ( (lv_team_10_0= ruleTeam ) ) )* otherlv_11= '}' otherlv_12= '}' )
            // InternalXText.g:286:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'type' ( (lv_type_3_0= ruleCompetitionType ) ) )? otherlv_4= 'trophy' ( (lv_trophy_5_0= ruleTrophy ) ) otherlv_6= 'team' otherlv_7= '{' ( (lv_team_8_0= ruleTeam ) ) (otherlv_9= ',' ( (lv_team_10_0= ruleTeam ) ) )* otherlv_11= '}' otherlv_12= '}'
            {
            // InternalXText.g:286:3: ( (lv_name_0_0= ruleEString ) )
            // InternalXText.g:287:4: (lv_name_0_0= ruleEString )
            {
            // InternalXText.g:287:4: (lv_name_0_0= ruleEString )
            // InternalXText.g:288:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompetitionAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompetitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"championsProject.XText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCompetitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXText.g:309:3: (otherlv_2= 'type' ( (lv_type_3_0= ruleCompetitionType ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXText.g:310:4: otherlv_2= 'type' ( (lv_type_3_0= ruleCompetitionType ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompetitionAccess().getTypeKeyword_2_0());
                    			
                    // InternalXText.g:314:4: ( (lv_type_3_0= ruleCompetitionType ) )
                    // InternalXText.g:315:5: (lv_type_3_0= ruleCompetitionType )
                    {
                    // InternalXText.g:315:5: (lv_type_3_0= ruleCompetitionType )
                    // InternalXText.g:316:6: lv_type_3_0= ruleCompetitionType
                    {

                    						newCompositeNode(grammarAccess.getCompetitionAccess().getTypeCompetitionTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_type_3_0=ruleCompetitionType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompetitionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"championsProject.XText.CompetitionType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getCompetitionAccess().getTrophyKeyword_3());
            		
            // InternalXText.g:338:3: ( (lv_trophy_5_0= ruleTrophy ) )
            // InternalXText.g:339:4: (lv_trophy_5_0= ruleTrophy )
            {
            // InternalXText.g:339:4: (lv_trophy_5_0= ruleTrophy )
            // InternalXText.g:340:5: lv_trophy_5_0= ruleTrophy
            {

            					newCompositeNode(grammarAccess.getCompetitionAccess().getTrophyTrophyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_trophy_5_0=ruleTrophy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompetitionRule());
            					}
            					set(
            						current,
            						"trophy",
            						lv_trophy_5_0,
            						"championsProject.XText.Trophy");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getCompetitionAccess().getTeamKeyword_5());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getCompetitionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalXText.g:365:3: ( (lv_team_8_0= ruleTeam ) )
            // InternalXText.g:366:4: (lv_team_8_0= ruleTeam )
            {
            // InternalXText.g:366:4: (lv_team_8_0= ruleTeam )
            // InternalXText.g:367:5: lv_team_8_0= ruleTeam
            {

            					newCompositeNode(grammarAccess.getCompetitionAccess().getTeamTeamParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_5);
            lv_team_8_0=ruleTeam();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompetitionRule());
            					}
            					add(
            						current,
            						"team",
            						lv_team_8_0,
            						"championsProject.XText.Team");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXText.g:384:3: (otherlv_9= ',' ( (lv_team_10_0= ruleTeam ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXText.g:385:4: otherlv_9= ',' ( (lv_team_10_0= ruleTeam ) )
            	    {
            	    otherlv_9=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_9, grammarAccess.getCompetitionAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalXText.g:389:4: ( (lv_team_10_0= ruleTeam ) )
            	    // InternalXText.g:390:5: (lv_team_10_0= ruleTeam )
            	    {
            	    // InternalXText.g:390:5: (lv_team_10_0= ruleTeam )
            	    // InternalXText.g:391:6: lv_team_10_0= ruleTeam
            	    {

            	    						newCompositeNode(grammarAccess.getCompetitionAccess().getTeamTeamParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_team_10_0=ruleTeam();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompetitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"team",
            	    							lv_team_10_0,
            	    							"championsProject.XText.Team");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getCompetitionAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCompetitionAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompetition"


    // $ANTLR start "entryRuleTrophy"
    // InternalXText.g:421:1: entryRuleTrophy returns [EObject current=null] : iv_ruleTrophy= ruleTrophy EOF ;
    public final EObject entryRuleTrophy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrophy = null;


        try {
            // InternalXText.g:421:47: (iv_ruleTrophy= ruleTrophy EOF )
            // InternalXText.g:422:2: iv_ruleTrophy= ruleTrophy EOF
            {
             newCompositeNode(grammarAccess.getTrophyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrophy=ruleTrophy();

            state._fsp--;

             current =iv_ruleTrophy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrophy"


    // $ANTLR start "ruleTrophy"
    // InternalXText.g:428:1: ruleTrophy returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'team' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= '}' ) ;
    public final EObject ruleTrophy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalXText.g:434:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'team' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= '}' ) )
            // InternalXText.g:435:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'team' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= '}' )
            {
            // InternalXText.g:435:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'team' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= '}' )
            // InternalXText.g:436:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'team' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= '}'
            {
            // InternalXText.g:436:3: ( (lv_name_0_0= ruleEString ) )
            // InternalXText.g:437:4: (lv_name_0_0= ruleEString )
            {
            // InternalXText.g:437:4: (lv_name_0_0= ruleEString )
            // InternalXText.g:438:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTrophyAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrophyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"championsProject.XText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getTrophyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXText.g:459:3: (otherlv_2= 'team' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXText.g:460:4: otherlv_2= 'team' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getTrophyAccess().getTeamKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTrophyAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalXText.g:468:4: ( ( ruleEString ) )
                    // InternalXText.g:469:5: ( ruleEString )
                    {
                    // InternalXText.g:469:5: ( ruleEString )
                    // InternalXText.g:470:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTrophyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTrophyAccess().getTeamTeamCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXText.g:484:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==13) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalXText.g:485:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getTrophyAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalXText.g:489:5: ( ( ruleEString ) )
                    	    // InternalXText.g:490:6: ( ruleEString )
                    	    {
                    	    // InternalXText.g:490:6: ( ruleEString )
                    	    // InternalXText.g:491:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTrophyRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTrophyAccess().getTeamTeamCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getTrophyAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTrophyAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrophy"


    // $ANTLR start "entryRuleTeam"
    // InternalXText.g:519:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // InternalXText.g:519:45: (iv_ruleTeam= ruleTeam EOF )
            // InternalXText.g:520:2: iv_ruleTeam= ruleTeam EOF
            {
             newCompositeNode(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeam=ruleTeam();

            state._fsp--;

             current =iv_ruleTeam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // InternalXText.g:526:1: ruleTeam returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'type' ( (lv_type_3_0= ruleTeamType ) ) )? otherlv_4= 'stadium' ( (lv_stadium_5_0= ruleStadium ) ) (otherlv_6= 'trophy' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= 'president' otherlv_13= ':' ( (lv_president_14_0= rulePresident ) ) otherlv_15= 'coach' otherlv_16= ':' ( (lv_coach_17_0= ruleCoach ) ) otherlv_18= 'player' otherlv_19= ':' ( (lv_player_20_0= rulePlayer ) ) (otherlv_21= ',' ( (lv_player_22_0= rulePlayer ) ) )* otherlv_23= '}' ) ;
    public final EObject ruleTeam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_type_3_0 = null;

        EObject lv_stadium_5_0 = null;

        EObject lv_president_14_0 = null;

        EObject lv_coach_17_0 = null;

        EObject lv_player_20_0 = null;

        EObject lv_player_22_0 = null;



        	enterRule();

        try {
            // InternalXText.g:532:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'type' ( (lv_type_3_0= ruleTeamType ) ) )? otherlv_4= 'stadium' ( (lv_stadium_5_0= ruleStadium ) ) (otherlv_6= 'trophy' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= 'president' otherlv_13= ':' ( (lv_president_14_0= rulePresident ) ) otherlv_15= 'coach' otherlv_16= ':' ( (lv_coach_17_0= ruleCoach ) ) otherlv_18= 'player' otherlv_19= ':' ( (lv_player_20_0= rulePlayer ) ) (otherlv_21= ',' ( (lv_player_22_0= rulePlayer ) ) )* otherlv_23= '}' ) )
            // InternalXText.g:533:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'type' ( (lv_type_3_0= ruleTeamType ) ) )? otherlv_4= 'stadium' ( (lv_stadium_5_0= ruleStadium ) ) (otherlv_6= 'trophy' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= 'president' otherlv_13= ':' ( (lv_president_14_0= rulePresident ) ) otherlv_15= 'coach' otherlv_16= ':' ( (lv_coach_17_0= ruleCoach ) ) otherlv_18= 'player' otherlv_19= ':' ( (lv_player_20_0= rulePlayer ) ) (otherlv_21= ',' ( (lv_player_22_0= rulePlayer ) ) )* otherlv_23= '}' )
            {
            // InternalXText.g:533:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'type' ( (lv_type_3_0= ruleTeamType ) ) )? otherlv_4= 'stadium' ( (lv_stadium_5_0= ruleStadium ) ) (otherlv_6= 'trophy' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= 'president' otherlv_13= ':' ( (lv_president_14_0= rulePresident ) ) otherlv_15= 'coach' otherlv_16= ':' ( (lv_coach_17_0= ruleCoach ) ) otherlv_18= 'player' otherlv_19= ':' ( (lv_player_20_0= rulePlayer ) ) (otherlv_21= ',' ( (lv_player_22_0= rulePlayer ) ) )* otherlv_23= '}' )
            // InternalXText.g:534:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'type' ( (lv_type_3_0= ruleTeamType ) ) )? otherlv_4= 'stadium' ( (lv_stadium_5_0= ruleStadium ) ) (otherlv_6= 'trophy' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= 'president' otherlv_13= ':' ( (lv_president_14_0= rulePresident ) ) otherlv_15= 'coach' otherlv_16= ':' ( (lv_coach_17_0= ruleCoach ) ) otherlv_18= 'player' otherlv_19= ':' ( (lv_player_20_0= rulePlayer ) ) (otherlv_21= ',' ( (lv_player_22_0= rulePlayer ) ) )* otherlv_23= '}'
            {
            // InternalXText.g:534:3: ( (lv_name_0_0= ruleEString ) )
            // InternalXText.g:535:4: (lv_name_0_0= ruleEString )
            {
            // InternalXText.g:535:4: (lv_name_0_0= ruleEString )
            // InternalXText.g:536:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTeamAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"championsProject.XText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXText.g:557:3: (otherlv_2= 'type' ( (lv_type_3_0= ruleTeamType ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXText.g:558:4: otherlv_2= 'type' ( (lv_type_3_0= ruleTeamType ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getTeamAccess().getTypeKeyword_2_0());
                    			
                    // InternalXText.g:562:4: ( (lv_type_3_0= ruleTeamType ) )
                    // InternalXText.g:563:5: (lv_type_3_0= ruleTeamType )
                    {
                    // InternalXText.g:563:5: (lv_type_3_0= ruleTeamType )
                    // InternalXText.g:564:6: lv_type_3_0= ruleTeamType
                    {

                    						newCompositeNode(grammarAccess.getTeamAccess().getTypeTeamTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_type_3_0=ruleTeamType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTeamRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"championsProject.XText.TeamType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getTeamAccess().getStadiumKeyword_3());
            		
            // InternalXText.g:586:3: ( (lv_stadium_5_0= ruleStadium ) )
            // InternalXText.g:587:4: (lv_stadium_5_0= ruleStadium )
            {
            // InternalXText.g:587:4: (lv_stadium_5_0= ruleStadium )
            // InternalXText.g:588:5: lv_stadium_5_0= ruleStadium
            {

            					newCompositeNode(grammarAccess.getTeamAccess().getStadiumStadiumParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_stadium_5_0=ruleStadium();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamRule());
            					}
            					set(
            						current,
            						"stadium",
            						lv_stadium_5_0,
            						"championsProject.XText.Stadium");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXText.g:605:3: (otherlv_6= 'trophy' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXText.g:606:4: otherlv_6= 'trophy' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getTeamAccess().getTrophyKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getTeamAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalXText.g:614:4: ( ( ruleEString ) )
                    // InternalXText.g:615:5: ( ruleEString )
                    {
                    // InternalXText.g:615:5: ( ruleEString )
                    // InternalXText.g:616:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTeamRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTeamAccess().getTrophyTrophyCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXText.g:630:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==13) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalXText.g:631:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getTeamAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalXText.g:635:5: ( ( ruleEString ) )
                    	    // InternalXText.g:636:6: ( ruleEString )
                    	    {
                    	    // InternalXText.g:636:6: ( ruleEString )
                    	    // InternalXText.g:637:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTeamRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTeamAccess().getTrophyTrophyCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getTeamAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_12, grammarAccess.getTeamAccess().getPresidentKeyword_6());
            		
            otherlv_13=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_13, grammarAccess.getTeamAccess().getColonKeyword_7());
            		
            // InternalXText.g:665:3: ( (lv_president_14_0= rulePresident ) )
            // InternalXText.g:666:4: (lv_president_14_0= rulePresident )
            {
            // InternalXText.g:666:4: (lv_president_14_0= rulePresident )
            // InternalXText.g:667:5: lv_president_14_0= rulePresident
            {

            					newCompositeNode(grammarAccess.getTeamAccess().getPresidentPresidentParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_21);
            lv_president_14_0=rulePresident();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamRule());
            					}
            					set(
            						current,
            						"president",
            						lv_president_14_0,
            						"championsProject.XText.President");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_15, grammarAccess.getTeamAccess().getCoachKeyword_9());
            		
            otherlv_16=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_16, grammarAccess.getTeamAccess().getColonKeyword_10());
            		
            // InternalXText.g:692:3: ( (lv_coach_17_0= ruleCoach ) )
            // InternalXText.g:693:4: (lv_coach_17_0= ruleCoach )
            {
            // InternalXText.g:693:4: (lv_coach_17_0= ruleCoach )
            // InternalXText.g:694:5: lv_coach_17_0= ruleCoach
            {

            					newCompositeNode(grammarAccess.getTeamAccess().getCoachCoachParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_23);
            lv_coach_17_0=ruleCoach();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamRule());
            					}
            					set(
            						current,
            						"coach",
            						lv_coach_17_0,
            						"championsProject.XText.Coach");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_18, grammarAccess.getTeamAccess().getPlayerKeyword_12());
            		
            otherlv_19=(Token)match(input,22,FOLLOW_24); 

            			newLeafNode(otherlv_19, grammarAccess.getTeamAccess().getColonKeyword_13());
            		
            // InternalXText.g:719:3: ( (lv_player_20_0= rulePlayer ) )
            // InternalXText.g:720:4: (lv_player_20_0= rulePlayer )
            {
            // InternalXText.g:720:4: (lv_player_20_0= rulePlayer )
            // InternalXText.g:721:5: lv_player_20_0= rulePlayer
            {

            					newCompositeNode(grammarAccess.getTeamAccess().getPlayerPlayerParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_5);
            lv_player_20_0=rulePlayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamRule());
            					}
            					add(
            						current,
            						"player",
            						lv_player_20_0,
            						"championsProject.XText.Player");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXText.g:738:3: (otherlv_21= ',' ( (lv_player_22_0= rulePlayer ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXText.g:739:4: otherlv_21= ',' ( (lv_player_22_0= rulePlayer ) )
            	    {
            	    otherlv_21=(Token)match(input,13,FOLLOW_24); 

            	    				newLeafNode(otherlv_21, grammarAccess.getTeamAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalXText.g:743:4: ( (lv_player_22_0= rulePlayer ) )
            	    // InternalXText.g:744:5: (lv_player_22_0= rulePlayer )
            	    {
            	    // InternalXText.g:744:5: (lv_player_22_0= rulePlayer )
            	    // InternalXText.g:745:6: lv_player_22_0= rulePlayer
            	    {

            	    						newCompositeNode(grammarAccess.getTeamAccess().getPlayerPlayerParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_player_22_0=rulePlayer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTeamRule());
            	    						}
            	    						add(
            	    							current,
            	    							"player",
            	    							lv_player_22_0,
            	    							"championsProject.XText.Player");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_23=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRuleStadium"
    // InternalXText.g:771:1: entryRuleStadium returns [EObject current=null] : iv_ruleStadium= ruleStadium EOF ;
    public final EObject entryRuleStadium() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStadium = null;


        try {
            // InternalXText.g:771:48: (iv_ruleStadium= ruleStadium EOF )
            // InternalXText.g:772:2: iv_ruleStadium= ruleStadium EOF
            {
             newCompositeNode(grammarAccess.getStadiumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStadium=ruleStadium();

            state._fsp--;

             current =iv_ruleStadium; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStadium"


    // $ANTLR start "ruleStadium"
    // InternalXText.g:778:1: ruleStadium returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEInt ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleStadium() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_capacity_4_0 = null;



        	enterRule();

        try {
            // InternalXText.g:784:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEInt ) ) )? otherlv_5= '}' ) )
            // InternalXText.g:785:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            {
            // InternalXText.g:785:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            // InternalXText.g:786:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEInt ) ) )? otherlv_5= '}'
            {
            // InternalXText.g:786:3: ()
            // InternalXText.g:787:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStadiumAccess().getStadiumAction_0(),
            					current);
            			

            }

            // InternalXText.g:793:3: ( (lv_name_1_0= ruleEString ) )
            // InternalXText.g:794:4: (lv_name_1_0= ruleEString )
            {
            // InternalXText.g:794:4: (lv_name_1_0= ruleEString )
            // InternalXText.g:795:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStadiumAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStadiumRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"championsProject.XText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getStadiumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXText.g:816:3: (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEInt ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXText.g:817:4: otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getStadiumAccess().getCapacityKeyword_3_0());
                    			
                    // InternalXText.g:821:4: ( (lv_capacity_4_0= ruleEInt ) )
                    // InternalXText.g:822:5: (lv_capacity_4_0= ruleEInt )
                    {
                    // InternalXText.g:822:5: (lv_capacity_4_0= ruleEInt )
                    // InternalXText.g:823:6: lv_capacity_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getStadiumAccess().getCapacityEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_capacity_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStadiumRule());
                    						}
                    						set(
                    							current,
                    							"capacity",
                    							lv_capacity_4_0,
                    							"championsProject.XText.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStadiumAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStadium"


    // $ANTLR start "entryRulePresident"
    // InternalXText.g:849:1: entryRulePresident returns [EObject current=null] : iv_rulePresident= rulePresident EOF ;
    public final EObject entryRulePresident() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresident = null;


        try {
            // InternalXText.g:849:50: (iv_rulePresident= rulePresident EOF )
            // InternalXText.g:850:2: iv_rulePresident= rulePresident EOF
            {
             newCompositeNode(grammarAccess.getPresidentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePresident=rulePresident();

            state._fsp--;

             current =iv_rulePresident; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePresident"


    // $ANTLR start "rulePresident"
    // InternalXText.g:856:1: rulePresident returns [EObject current=null] : ( () otherlv_1= 'President' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
    public final EObject rulePresident() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_age_5_0 = null;



        	enterRule();

        try {
            // InternalXText.g:862:2: ( ( () otherlv_1= 'President' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // InternalXText.g:863:2: ( () otherlv_1= 'President' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // InternalXText.g:863:2: ( () otherlv_1= 'President' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // InternalXText.g:864:3: () otherlv_1= 'President' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // InternalXText.g:864:3: ()
            // InternalXText.g:865:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPresidentAccess().getPresidentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPresidentAccess().getPresidentKeyword_1());
            		
            // InternalXText.g:875:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXText.g:876:4: (lv_name_2_0= ruleEString )
            {
            // InternalXText.g:876:4: (lv_name_2_0= ruleEString )
            // InternalXText.g:877:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPresidentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPresidentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"championsProject.XText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getPresidentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXText.g:898:3: (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXText.g:899:4: otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getPresidentAccess().getAgeKeyword_4_0());
                    			
                    // InternalXText.g:903:4: ( (lv_age_5_0= ruleEInt ) )
                    // InternalXText.g:904:5: (lv_age_5_0= ruleEInt )
                    {
                    // InternalXText.g:904:5: (lv_age_5_0= ruleEInt )
                    // InternalXText.g:905:6: lv_age_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPresidentAccess().getAgeEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_age_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPresidentRule());
                    						}
                    						set(
                    							current,
                    							"age",
                    							lv_age_5_0,
                    							"championsProject.XText.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPresidentAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePresident"


    // $ANTLR start "entryRuleCoach"
    // InternalXText.g:931:1: entryRuleCoach returns [EObject current=null] : iv_ruleCoach= ruleCoach EOF ;
    public final EObject entryRuleCoach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoach = null;


        try {
            // InternalXText.g:931:46: (iv_ruleCoach= ruleCoach EOF )
            // InternalXText.g:932:2: iv_ruleCoach= ruleCoach EOF
            {
             newCompositeNode(grammarAccess.getCoachRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoach=ruleCoach();

            state._fsp--;

             current =iv_ruleCoach; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoach"


    // $ANTLR start "ruleCoach"
    // InternalXText.g:938:1: ruleCoach returns [EObject current=null] : ( () otherlv_1= 'Coach' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? (otherlv_6= 'contrat' ( (lv_contrat_7_0= ruleEInt ) ) )? (otherlv_8= 'agent' ( ( ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleCoach() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_age_5_0 = null;

        AntlrDatatypeRuleToken lv_contrat_7_0 = null;



        	enterRule();

        try {
            // InternalXText.g:944:2: ( ( () otherlv_1= 'Coach' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? (otherlv_6= 'contrat' ( (lv_contrat_7_0= ruleEInt ) ) )? (otherlv_8= 'agent' ( ( ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalXText.g:945:2: ( () otherlv_1= 'Coach' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? (otherlv_6= 'contrat' ( (lv_contrat_7_0= ruleEInt ) ) )? (otherlv_8= 'agent' ( ( ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalXText.g:945:2: ( () otherlv_1= 'Coach' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? (otherlv_6= 'contrat' ( (lv_contrat_7_0= ruleEInt ) ) )? (otherlv_8= 'agent' ( ( ruleEString ) ) )? otherlv_10= '}' )
            // InternalXText.g:946:3: () otherlv_1= 'Coach' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? (otherlv_6= 'contrat' ( (lv_contrat_7_0= ruleEInt ) ) )? (otherlv_8= 'agent' ( ( ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalXText.g:946:3: ()
            // InternalXText.g:947:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCoachAccess().getCoachAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCoachAccess().getCoachKeyword_1());
            		
            // InternalXText.g:957:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXText.g:958:4: (lv_name_2_0= ruleEString )
            {
            // InternalXText.g:958:4: (lv_name_2_0= ruleEString )
            // InternalXText.g:959:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCoachAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoachRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"championsProject.XText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getCoachAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXText.g:980:3: (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXText.g:981:4: otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getCoachAccess().getAgeKeyword_4_0());
                    			
                    // InternalXText.g:985:4: ( (lv_age_5_0= ruleEInt ) )
                    // InternalXText.g:986:5: (lv_age_5_0= ruleEInt )
                    {
                    // InternalXText.g:986:5: (lv_age_5_0= ruleEInt )
                    // InternalXText.g:987:6: lv_age_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCoachAccess().getAgeEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_age_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCoachRule());
                    						}
                    						set(
                    							current,
                    							"age",
                    							lv_age_5_0,
                    							"championsProject.XText.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXText.g:1005:3: (otherlv_6= 'contrat' ( (lv_contrat_7_0= ruleEInt ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXText.g:1006:4: otherlv_6= 'contrat' ( (lv_contrat_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getCoachAccess().getContratKeyword_5_0());
                    			
                    // InternalXText.g:1010:4: ( (lv_contrat_7_0= ruleEInt ) )
                    // InternalXText.g:1011:5: (lv_contrat_7_0= ruleEInt )
                    {
                    // InternalXText.g:1011:5: (lv_contrat_7_0= ruleEInt )
                    // InternalXText.g:1012:6: lv_contrat_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCoachAccess().getContratEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_contrat_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCoachRule());
                    						}
                    						set(
                    							current,
                    							"contrat",
                    							lv_contrat_7_0,
                    							"championsProject.XText.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXText.g:1030:3: (otherlv_8= 'agent' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXText.g:1031:4: otherlv_8= 'agent' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getCoachAccess().getAgentKeyword_6_0());
                    			
                    // InternalXText.g:1035:4: ( ( ruleEString ) )
                    // InternalXText.g:1036:5: ( ruleEString )
                    {
                    // InternalXText.g:1036:5: ( ruleEString )
                    // InternalXText.g:1037:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCoachRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCoachAccess().getAgentAgentCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCoachAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoach"


    // $ANTLR start "entryRulePlayer"
    // InternalXText.g:1060:1: entryRulePlayer returns [EObject current=null] : iv_rulePlayer= rulePlayer EOF ;
    public final EObject entryRulePlayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayer = null;


        try {
            // InternalXText.g:1060:47: (iv_rulePlayer= rulePlayer EOF )
            // InternalXText.g:1061:2: iv_rulePlayer= rulePlayer EOF
            {
             newCompositeNode(grammarAccess.getPlayerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlayer=rulePlayer();

            state._fsp--;

             current =iv_rulePlayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // InternalXText.g:1067:1: rulePlayer returns [EObject current=null] : ( () otherlv_1= 'Player' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= rulePlayerPosition ) ) )? (otherlv_8= 'status' ( (lv_status_9_0= rulePlayerStatus ) ) )? (otherlv_10= 'contrat' ( (lv_contrat_11_0= ruleEInt ) ) )? (otherlv_12= 'agent' ( ( ruleEString ) ) )? otherlv_14= '}' ) ;
    public final EObject rulePlayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_age_5_0 = null;

        Enumerator lv_position_7_0 = null;

        Enumerator lv_status_9_0 = null;

        AntlrDatatypeRuleToken lv_contrat_11_0 = null;



        	enterRule();

        try {
            // InternalXText.g:1073:2: ( ( () otherlv_1= 'Player' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= rulePlayerPosition ) ) )? (otherlv_8= 'status' ( (lv_status_9_0= rulePlayerStatus ) ) )? (otherlv_10= 'contrat' ( (lv_contrat_11_0= ruleEInt ) ) )? (otherlv_12= 'agent' ( ( ruleEString ) ) )? otherlv_14= '}' ) )
            // InternalXText.g:1074:2: ( () otherlv_1= 'Player' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= rulePlayerPosition ) ) )? (otherlv_8= 'status' ( (lv_status_9_0= rulePlayerStatus ) ) )? (otherlv_10= 'contrat' ( (lv_contrat_11_0= ruleEInt ) ) )? (otherlv_12= 'agent' ( ( ruleEString ) ) )? otherlv_14= '}' )
            {
            // InternalXText.g:1074:2: ( () otherlv_1= 'Player' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= rulePlayerPosition ) ) )? (otherlv_8= 'status' ( (lv_status_9_0= rulePlayerStatus ) ) )? (otherlv_10= 'contrat' ( (lv_contrat_11_0= ruleEInt ) ) )? (otherlv_12= 'agent' ( ( ruleEString ) ) )? otherlv_14= '}' )
            // InternalXText.g:1075:3: () otherlv_1= 'Player' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? (otherlv_6= 'position' ( (lv_position_7_0= rulePlayerPosition ) ) )? (otherlv_8= 'status' ( (lv_status_9_0= rulePlayerStatus ) ) )? (otherlv_10= 'contrat' ( (lv_contrat_11_0= ruleEInt ) ) )? (otherlv_12= 'agent' ( ( ruleEString ) ) )? otherlv_14= '}'
            {
            // InternalXText.g:1075:3: ()
            // InternalXText.g:1076:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlayerAccess().getPlayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPlayerAccess().getPlayerKeyword_1());
            		
            // InternalXText.g:1086:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXText.g:1087:4: (lv_name_2_0= ruleEString )
            {
            // InternalXText.g:1087:4: (lv_name_2_0= ruleEString )
            // InternalXText.g:1088:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlayerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"championsProject.XText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXText.g:1109:3: (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXText.g:1110:4: otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getPlayerAccess().getAgeKeyword_4_0());
                    			
                    // InternalXText.g:1114:4: ( (lv_age_5_0= ruleEInt ) )
                    // InternalXText.g:1115:5: (lv_age_5_0= ruleEInt )
                    {
                    // InternalXText.g:1115:5: (lv_age_5_0= ruleEInt )
                    // InternalXText.g:1116:6: lv_age_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPlayerAccess().getAgeEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_age_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlayerRule());
                    						}
                    						set(
                    							current,
                    							"age",
                    							lv_age_5_0,
                    							"championsProject.XText.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXText.g:1134:3: (otherlv_6= 'position' ( (lv_position_7_0= rulePlayerPosition ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXText.g:1135:4: otherlv_6= 'position' ( (lv_position_7_0= rulePlayerPosition ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_33); 

                    				newLeafNode(otherlv_6, grammarAccess.getPlayerAccess().getPositionKeyword_5_0());
                    			
                    // InternalXText.g:1139:4: ( (lv_position_7_0= rulePlayerPosition ) )
                    // InternalXText.g:1140:5: (lv_position_7_0= rulePlayerPosition )
                    {
                    // InternalXText.g:1140:5: (lv_position_7_0= rulePlayerPosition )
                    // InternalXText.g:1141:6: lv_position_7_0= rulePlayerPosition
                    {

                    						newCompositeNode(grammarAccess.getPlayerAccess().getPositionPlayerPositionEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_position_7_0=rulePlayerPosition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlayerRule());
                    						}
                    						set(
                    							current,
                    							"position",
                    							lv_position_7_0,
                    							"championsProject.XText.PlayerPosition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXText.g:1159:3: (otherlv_8= 'status' ( (lv_status_9_0= rulePlayerStatus ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXText.g:1160:4: otherlv_8= 'status' ( (lv_status_9_0= rulePlayerStatus ) )
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_35); 

                    				newLeafNode(otherlv_8, grammarAccess.getPlayerAccess().getStatusKeyword_6_0());
                    			
                    // InternalXText.g:1164:4: ( (lv_status_9_0= rulePlayerStatus ) )
                    // InternalXText.g:1165:5: (lv_status_9_0= rulePlayerStatus )
                    {
                    // InternalXText.g:1165:5: (lv_status_9_0= rulePlayerStatus )
                    // InternalXText.g:1166:6: lv_status_9_0= rulePlayerStatus
                    {

                    						newCompositeNode(grammarAccess.getPlayerAccess().getStatusPlayerStatusEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_status_9_0=rulePlayerStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlayerRule());
                    						}
                    						set(
                    							current,
                    							"status",
                    							lv_status_9_0,
                    							"championsProject.XText.PlayerStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXText.g:1184:3: (otherlv_10= 'contrat' ( (lv_contrat_11_0= ruleEInt ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXText.g:1185:4: otherlv_10= 'contrat' ( (lv_contrat_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getPlayerAccess().getContratKeyword_7_0());
                    			
                    // InternalXText.g:1189:4: ( (lv_contrat_11_0= ruleEInt ) )
                    // InternalXText.g:1190:5: (lv_contrat_11_0= ruleEInt )
                    {
                    // InternalXText.g:1190:5: (lv_contrat_11_0= ruleEInt )
                    // InternalXText.g:1191:6: lv_contrat_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPlayerAccess().getContratEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_contrat_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlayerRule());
                    						}
                    						set(
                    							current,
                    							"contrat",
                    							lv_contrat_11_0,
                    							"championsProject.XText.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXText.g:1209:3: (otherlv_12= 'agent' ( ( ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXText.g:1210:4: otherlv_12= 'agent' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getPlayerAccess().getAgentKeyword_8_0());
                    			
                    // InternalXText.g:1214:4: ( ( ruleEString ) )
                    // InternalXText.g:1215:5: ( ruleEString )
                    {
                    // InternalXText.g:1215:5: ( ruleEString )
                    // InternalXText.g:1216:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlayerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlayerAccess().getAgentAgentCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleEInt"
    // InternalXText.g:1239:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalXText.g:1239:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalXText.g:1240:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalXText.g:1246:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalXText.g:1252:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalXText.g:1253:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalXText.g:1253:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalXText.g:1254:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalXText.g:1254:3: (kw= '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXText.g:1255:4: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_36); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleAgent"
    // InternalXText.g:1272:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalXText.g:1272:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalXText.g:1273:2: iv_ruleAgent= ruleAgent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgent=ruleAgent();

            state._fsp--;

             current =iv_ruleAgent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalXText.g:1279:1: ruleAgent returns [EObject current=null] : ( () otherlv_1= 'Agent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? (otherlv_6= 'player' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'coach' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_age_5_0 = null;



        	enterRule();

        try {
            // InternalXText.g:1285:2: ( ( () otherlv_1= 'Agent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? (otherlv_6= 'player' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'coach' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalXText.g:1286:2: ( () otherlv_1= 'Agent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? (otherlv_6= 'player' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'coach' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalXText.g:1286:2: ( () otherlv_1= 'Agent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? (otherlv_6= 'player' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'coach' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalXText.g:1287:3: () otherlv_1= 'Agent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )? (otherlv_6= 'player' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'coach' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalXText.g:1287:3: ()
            // InternalXText.g:1288:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAgentAccess().getAgentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAgentAccess().getAgentKeyword_1());
            		
            // InternalXText.g:1298:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXText.g:1299:4: (lv_name_2_0= ruleEString )
            {
            // InternalXText.g:1299:4: (lv_name_2_0= ruleEString )
            // InternalXText.g:1300:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAgentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAgentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"championsProject.XText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXText.g:1321:3: (otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXText.g:1322:4: otherlv_4= 'age' ( (lv_age_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getAgentAccess().getAgeKeyword_4_0());
                    			
                    // InternalXText.g:1326:4: ( (lv_age_5_0= ruleEInt ) )
                    // InternalXText.g:1327:5: (lv_age_5_0= ruleEInt )
                    {
                    // InternalXText.g:1327:5: (lv_age_5_0= ruleEInt )
                    // InternalXText.g:1328:6: lv_age_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAgentAccess().getAgeEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_age_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAgentRule());
                    						}
                    						set(
                    							current,
                    							"age",
                    							lv_age_5_0,
                    							"championsProject.XText.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXText.g:1346:3: (otherlv_6= 'player' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXText.g:1347:4: otherlv_6= 'player' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getAgentAccess().getPlayerKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getAgentAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalXText.g:1355:4: ( ( ruleEString ) )
                    // InternalXText.g:1356:5: ( ruleEString )
                    {
                    // InternalXText.g:1356:5: ( ruleEString )
                    // InternalXText.g:1357:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAgentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAgentAccess().getPlayerPlayerCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXText.g:1371:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==13) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalXText.g:1372:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAgentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalXText.g:1376:5: ( ( ruleEString ) )
                    	    // InternalXText.g:1377:6: ( ruleEString )
                    	    {
                    	    // InternalXText.g:1377:6: ( ruleEString )
                    	    // InternalXText.g:1378:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAgentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAgentAccess().getPlayerPlayerCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_39); 

                    				newLeafNode(otherlv_11, grammarAccess.getAgentAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalXText.g:1398:3: (otherlv_12= 'coach' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXText.g:1399:4: otherlv_12= 'coach' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getAgentAccess().getCoachKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getAgentAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalXText.g:1407:4: ( ( ruleEString ) )
                    // InternalXText.g:1408:5: ( ruleEString )
                    {
                    // InternalXText.g:1408:5: ( ruleEString )
                    // InternalXText.g:1409:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAgentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAgentAccess().getCoachCoachCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXText.g:1423:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==13) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalXText.g:1424:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getAgentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalXText.g:1428:5: ( ( ruleEString ) )
                    	    // InternalXText.g:1429:6: ( ruleEString )
                    	    {
                    	    // InternalXText.g:1429:6: ( ruleEString )
                    	    // InternalXText.g:1430:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAgentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAgentAccess().getCoachCoachCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_17, grammarAccess.getAgentAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "ruleCompetitionType"
    // InternalXText.g:1458:1: ruleCompetitionType returns [Enumerator current=null] : ( (enumLiteral_0= 'championship' ) | (enumLiteral_1= 'cup' ) | (enumLiteral_2= 'worldCup' ) ) ;
    public final Enumerator ruleCompetitionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXText.g:1464:2: ( ( (enumLiteral_0= 'championship' ) | (enumLiteral_1= 'cup' ) | (enumLiteral_2= 'worldCup' ) ) )
            // InternalXText.g:1465:2: ( (enumLiteral_0= 'championship' ) | (enumLiteral_1= 'cup' ) | (enumLiteral_2= 'worldCup' ) )
            {
            // InternalXText.g:1465:2: ( (enumLiteral_0= 'championship' ) | (enumLiteral_1= 'cup' ) | (enumLiteral_2= 'worldCup' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt28=1;
                }
                break;
            case 37:
                {
                alt28=2;
                }
                break;
            case 38:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalXText.g:1466:3: (enumLiteral_0= 'championship' )
                    {
                    // InternalXText.g:1466:3: (enumLiteral_0= 'championship' )
                    // InternalXText.g:1467:4: enumLiteral_0= 'championship'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getCompetitionTypeAccess().getChampionshipEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompetitionTypeAccess().getChampionshipEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXText.g:1474:3: (enumLiteral_1= 'cup' )
                    {
                    // InternalXText.g:1474:3: (enumLiteral_1= 'cup' )
                    // InternalXText.g:1475:4: enumLiteral_1= 'cup'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getCompetitionTypeAccess().getCupEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompetitionTypeAccess().getCupEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXText.g:1482:3: (enumLiteral_2= 'worldCup' )
                    {
                    // InternalXText.g:1482:3: (enumLiteral_2= 'worldCup' )
                    // InternalXText.g:1483:4: enumLiteral_2= 'worldCup'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getCompetitionTypeAccess().getWorldCupEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompetitionTypeAccess().getWorldCupEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompetitionType"


    // $ANTLR start "ruleTeamType"
    // InternalXText.g:1493:1: ruleTeamType returns [Enumerator current=null] : ( (enumLiteral_0= 'town' ) | (enumLiteral_1= 'national' ) ) ;
    public final Enumerator ruleTeamType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXText.g:1499:2: ( ( (enumLiteral_0= 'town' ) | (enumLiteral_1= 'national' ) ) )
            // InternalXText.g:1500:2: ( (enumLiteral_0= 'town' ) | (enumLiteral_1= 'national' ) )
            {
            // InternalXText.g:1500:2: ( (enumLiteral_0= 'town' ) | (enumLiteral_1= 'national' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            else if ( (LA29_0==40) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalXText.g:1501:3: (enumLiteral_0= 'town' )
                    {
                    // InternalXText.g:1501:3: (enumLiteral_0= 'town' )
                    // InternalXText.g:1502:4: enumLiteral_0= 'town'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTeamTypeAccess().getTownEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTeamTypeAccess().getTownEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXText.g:1509:3: (enumLiteral_1= 'national' )
                    {
                    // InternalXText.g:1509:3: (enumLiteral_1= 'national' )
                    // InternalXText.g:1510:4: enumLiteral_1= 'national'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getTeamTypeAccess().getNationalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTeamTypeAccess().getNationalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeamType"


    // $ANTLR start "rulePlayerPosition"
    // InternalXText.g:1520:1: rulePlayerPosition returns [Enumerator current=null] : ( (enumLiteral_0= 'centralMidfielder' ) | (enumLiteral_1= 'centralBack' ) | (enumLiteral_2= 'goalKeeper' ) | (enumLiteral_3= 'leftMidfielder' ) | (enumLiteral_4= 'rightMidfielder' ) | (enumLiteral_5= 'rightBack' ) | (enumLiteral_6= 'leftBack' ) | (enumLiteral_7= 'striker' ) ) ;
    public final Enumerator rulePlayerPosition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalXText.g:1526:2: ( ( (enumLiteral_0= 'centralMidfielder' ) | (enumLiteral_1= 'centralBack' ) | (enumLiteral_2= 'goalKeeper' ) | (enumLiteral_3= 'leftMidfielder' ) | (enumLiteral_4= 'rightMidfielder' ) | (enumLiteral_5= 'rightBack' ) | (enumLiteral_6= 'leftBack' ) | (enumLiteral_7= 'striker' ) ) )
            // InternalXText.g:1527:2: ( (enumLiteral_0= 'centralMidfielder' ) | (enumLiteral_1= 'centralBack' ) | (enumLiteral_2= 'goalKeeper' ) | (enumLiteral_3= 'leftMidfielder' ) | (enumLiteral_4= 'rightMidfielder' ) | (enumLiteral_5= 'rightBack' ) | (enumLiteral_6= 'leftBack' ) | (enumLiteral_7= 'striker' ) )
            {
            // InternalXText.g:1527:2: ( (enumLiteral_0= 'centralMidfielder' ) | (enumLiteral_1= 'centralBack' ) | (enumLiteral_2= 'goalKeeper' ) | (enumLiteral_3= 'leftMidfielder' ) | (enumLiteral_4= 'rightMidfielder' ) | (enumLiteral_5= 'rightBack' ) | (enumLiteral_6= 'leftBack' ) | (enumLiteral_7= 'striker' ) )
            int alt30=8;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt30=1;
                }
                break;
            case 42:
                {
                alt30=2;
                }
                break;
            case 43:
                {
                alt30=3;
                }
                break;
            case 44:
                {
                alt30=4;
                }
                break;
            case 45:
                {
                alt30=5;
                }
                break;
            case 46:
                {
                alt30=6;
                }
                break;
            case 47:
                {
                alt30=7;
                }
                break;
            case 48:
                {
                alt30=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalXText.g:1528:3: (enumLiteral_0= 'centralMidfielder' )
                    {
                    // InternalXText.g:1528:3: (enumLiteral_0= 'centralMidfielder' )
                    // InternalXText.g:1529:4: enumLiteral_0= 'centralMidfielder'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPlayerPositionAccess().getCentralMidfielderEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPlayerPositionAccess().getCentralMidfielderEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXText.g:1536:3: (enumLiteral_1= 'centralBack' )
                    {
                    // InternalXText.g:1536:3: (enumLiteral_1= 'centralBack' )
                    // InternalXText.g:1537:4: enumLiteral_1= 'centralBack'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPlayerPositionAccess().getCentralBackEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPlayerPositionAccess().getCentralBackEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXText.g:1544:3: (enumLiteral_2= 'goalKeeper' )
                    {
                    // InternalXText.g:1544:3: (enumLiteral_2= 'goalKeeper' )
                    // InternalXText.g:1545:4: enumLiteral_2= 'goalKeeper'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getPlayerPositionAccess().getGoalKeeperEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPlayerPositionAccess().getGoalKeeperEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalXText.g:1552:3: (enumLiteral_3= 'leftMidfielder' )
                    {
                    // InternalXText.g:1552:3: (enumLiteral_3= 'leftMidfielder' )
                    // InternalXText.g:1553:4: enumLiteral_3= 'leftMidfielder'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPlayerPositionAccess().getLeftMidfielderEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPlayerPositionAccess().getLeftMidfielderEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalXText.g:1560:3: (enumLiteral_4= 'rightMidfielder' )
                    {
                    // InternalXText.g:1560:3: (enumLiteral_4= 'rightMidfielder' )
                    // InternalXText.g:1561:4: enumLiteral_4= 'rightMidfielder'
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPlayerPositionAccess().getRightMidfielderEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPlayerPositionAccess().getRightMidfielderEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalXText.g:1568:3: (enumLiteral_5= 'rightBack' )
                    {
                    // InternalXText.g:1568:3: (enumLiteral_5= 'rightBack' )
                    // InternalXText.g:1569:4: enumLiteral_5= 'rightBack'
                    {
                    enumLiteral_5=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPlayerPositionAccess().getRightBackEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPlayerPositionAccess().getRightBackEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalXText.g:1576:3: (enumLiteral_6= 'leftBack' )
                    {
                    // InternalXText.g:1576:3: (enumLiteral_6= 'leftBack' )
                    // InternalXText.g:1577:4: enumLiteral_6= 'leftBack'
                    {
                    enumLiteral_6=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getPlayerPositionAccess().getLeftBackEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPlayerPositionAccess().getLeftBackEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalXText.g:1584:3: (enumLiteral_7= 'striker' )
                    {
                    // InternalXText.g:1584:3: (enumLiteral_7= 'striker' )
                    // InternalXText.g:1585:4: enumLiteral_7= 'striker'
                    {
                    enumLiteral_7=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPlayerPositionAccess().getStrikerEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPlayerPositionAccess().getStrikerEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlayerPosition"


    // $ANTLR start "rulePlayerStatus"
    // InternalXText.g:1595:1: rulePlayerStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'starter' ) | (enumLiteral_1= 'substitute' ) | (enumLiteral_2= 'injured' ) | (enumLiteral_3= 'suspended' ) ) ;
    public final Enumerator rulePlayerStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalXText.g:1601:2: ( ( (enumLiteral_0= 'starter' ) | (enumLiteral_1= 'substitute' ) | (enumLiteral_2= 'injured' ) | (enumLiteral_3= 'suspended' ) ) )
            // InternalXText.g:1602:2: ( (enumLiteral_0= 'starter' ) | (enumLiteral_1= 'substitute' ) | (enumLiteral_2= 'injured' ) | (enumLiteral_3= 'suspended' ) )
            {
            // InternalXText.g:1602:2: ( (enumLiteral_0= 'starter' ) | (enumLiteral_1= 'substitute' ) | (enumLiteral_2= 'injured' ) | (enumLiteral_3= 'suspended' ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt31=1;
                }
                break;
            case 50:
                {
                alt31=2;
                }
                break;
            case 51:
                {
                alt31=3;
                }
                break;
            case 52:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalXText.g:1603:3: (enumLiteral_0= 'starter' )
                    {
                    // InternalXText.g:1603:3: (enumLiteral_0= 'starter' )
                    // InternalXText.g:1604:4: enumLiteral_0= 'starter'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getPlayerStatusAccess().getStarterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPlayerStatusAccess().getStarterEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXText.g:1611:3: (enumLiteral_1= 'substitute' )
                    {
                    // InternalXText.g:1611:3: (enumLiteral_1= 'substitute' )
                    // InternalXText.g:1612:4: enumLiteral_1= 'substitute'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getPlayerStatusAccess().getSubstituteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPlayerStatusAccess().getSubstituteEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXText.g:1619:3: (enumLiteral_2= 'injured' )
                    {
                    // InternalXText.g:1619:3: (enumLiteral_2= 'injured' )
                    // InternalXText.g:1620:4: enumLiteral_2= 'injured'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getPlayerStatusAccess().getInjuredEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPlayerStatusAccess().getInjuredEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalXText.g:1627:3: (enumLiteral_3= 'suspended' )
                    {
                    // InternalXText.g:1627:3: (enumLiteral_3= 'suspended' )
                    // InternalXText.g:1628:4: enumLiteral_3= 'suspended'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getPlayerStatusAccess().getSuspendedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPlayerStatusAccess().getSuspendedEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlayerStatus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000068004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000060004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000368004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000360004000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001FE0000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000260004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000009804000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000001804000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000804000L});

}