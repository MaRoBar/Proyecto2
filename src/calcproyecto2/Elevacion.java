package calcproyecto2;

public class Elevacion {
    float valor1, valor2, total;
    
    public Elevacion(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    //CONSTRUCTOR VACIO
    public Elevacion() {
    }
  
    //FUNCION
    public float Elevar(){
    total = (float) Math.pow(valor1, 2);
    return total;
    }
}
