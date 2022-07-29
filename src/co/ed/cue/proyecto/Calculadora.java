package co.ed.cue.proyecto;

public class Calculadora {

    private int operando1;
    private int operando2;

    public void sumar(){
        int suma=operando1+operando2;
        System.out.println("La suma es: "+suma);
    }
    public int resta (int operando1,int operando2){
        return operando1-operando2;
    }

    public Calculadora(int operando1,int operando2){
        if(operando1>operando2) {
            this.operando1 = operando1;
            this.operando2 = operando2;
            System.out.println("dos parametos");
        }else {
            this.operando1 = operando2;
            this.operando2 = operando1;
        }

    }
    public Calculadora(){

    }
}
