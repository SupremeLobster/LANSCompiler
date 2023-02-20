// Josep Suy abril 2007



public class Registre  {

	String lexema;
	String tipus;
	String tipusRegistre;
	Long adreca;


public Registre() {
	lexema="";
	tipus="I";
	tipusRegistre = "VARIABLE";
	adreca=0L;
	}


public Registre(String l) {
	lexema=l;
	tipus="I";
	tipusRegistre = "VARIABLE";
	adreca=0L;
	}
public Registre(String l, String t) {
	lexema=l;
	tipus=t;
	tipusRegistre = "VARIABLE";
	adreca=0L;
	}
public Registre(String l, String t, Long a) {
	lexema=l;
	tipus=t;
	tipusRegistre = "VARIABLE";
	adreca=a;
	}
public Registre(String l, String t, Long a,  String tr) {
	lexema=l;
	tipus=t;
	tipusRegistre = tr;
	adreca=a;
}


public String getLexema() {
	return (lexema);
	}
public String getTipus() {
	return (tipus);
	}
public String getTipusRegistre() { return tipusRegistre; }
public Long getAdreca() {
	return (adreca);
	}

public void putLexema(String l) {
	lexema=l;
	}
public void putTipus(String t) {
	tipus=t;
	}
public void putTipusRegistre(String tr) { tipusRegistre = tr; }
public void putAdreca(Long a) {
	adreca=a;
	}

}
