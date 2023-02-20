import java.util.Vector;

public class Scope {
    Scope pare;
    String nom;
    String tipus;
    Long adreca;
    //"enter", "string", "char", "real", "data", "boolea", "accio"
    Vector<String> v_parametres;
    boolean implementat;

    boolean esScopePrograma;

    Long maxStack;
    Long contVar;

    public Scope() {
        this.v_parametres = new Vector<String>(0, 5);
    }

    public Scope(Scope pare, String nom) {
        this.pare = pare;
        this.nom = nom;
        this.implementat = true;
        this.v_parametres = new Vector<String>(0, 5);
        this.maxStack = 15L;
        this.esScopePrograma = false;
        this.contVar = 0L;
    }

    public Scope(Scope pare, String nom, String tipus) {
        this.v_parametres = new Vector<String>(0, 5);
        this.pare = pare;
        this.nom = nom;
        this.tipus = tipus;
        this.implementat = false;
        this.maxStack = 15L;
        this.esScopePrograma = false;
        this.contVar = 0L;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean hasPare() {
        return pare != null;
    }

    public Scope getPare() {
        return pare;
    }

    public String getTipus() {
        return tipus;
    }

    public void putTipus(String t){
        tipus = t;
    }

    public boolean isImplementat() {
        return implementat;
    }

    public void putImplementat(boolean b){
        implementat = b;
    }

    public void inserirParametre(String s) {
        v_parametres.add(s);

        if (v_parametres.size() >= maxStack) {
            maxStack = v_parametres.size() + 5L;
        }
    }

    public int getNumeroParametres() {
        return v_parametres.size();
    }

    public Vector<String> getParametres() {
        return v_parametres;
    }

    public String getParametre(int i) {
        if (i < v_parametres.size()) {
            return v_parametres.get(i);
        } else {
            return "";
        }
    }

    public boolean existParametre(String par){
        return v_parametres.contains(par);
    }

    public Long getAdreca() {
        return adreca;
    }

    public void setAdreca(Long adreca) {
        this.adreca = adreca;
    }

    public Long getMaxStack() {
        return maxStack;
    }

    public void setEsScopePrograma(boolean esScopePrograma) {
        this.esScopePrograma = esScopePrograma;
    }

    public void comprovaMaxStack(Long maxStack) {
        if (this.maxStack <= maxStack) {
            this.maxStack = maxStack + 5;

            if (this.esScopePrograma) {
                this.pare.comprovaMaxStack(maxStack);
            }
        }
    }

    public Long getContVar() {
        return contVar;
    }

    public Long getNextContVar() {

        if (esScopePrograma) {
            this.pare.getNextContVar();
        }

        return contVar++;
    }
}