
package mortalkombat;


public class Kitana extends Personagem {
    
    String jogarleque(){
        return "baixo, frente, " + this.socoforte;
    }
    
    String chuteaereo(){
        return "baixo, trás, " + this.chutefraco;
    }
    
    String cravarlequesnascostas(){
        return "frente, cima, frente, " + this.socoforte;
    }
    
    String combo1kitana (){
        return this.chuteaereo() + this.cravarlequesnascostas() + this.jogarleque();
    }
    
    String comboa2kitana(){
        return this.chutefraco + this.chuteforte + this.cravarlequesnascostas();
    }
    
    String fatality(){
        return this.chuteforte + this.socofraco + this.agarra;
    }
    
    String fatality2(){
        return this.socofraco + this.socofraco + this.socoforte;
    }
    
}
