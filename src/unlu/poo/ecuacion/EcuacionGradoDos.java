package unlu.poo.ecuacion;

import java.util.ArrayList;

public class EcuacionGradoDos {

    private int a;
    private int b;
    private int c;

    public EcuacionGradoDos(int a,int b,int c){
            setA(a);
            setB(b);
            setC(c);
    }

    public void setA(int a){
        this.a=1;
        if (a>0){
            this.a=a;
        }
    }
    public void setB(int b){
        this.b=b;
    }
    public void setC(int c){
        this.c=c;
    }
    public ArrayList<Double> calcularRaiz(){
        ArrayList<Double> raices= new ArrayList<Double>();
        double determinante= Math.pow(b,2)- (4*a*c);
        if (determinante==0){
            raices.add((double) (-b/(2*a)));
        }
        if (determinante>0){
            determinante=Math.sqrt(determinante);
            raices.add(((-b)+determinante)/(2*a));
            raices.add(((-b)-determinante)/(2*a));
        }
        return  raices;
    }
    public double resolverEcuacion(double x){
        return  (a*Math.pow(x,2)+(b*x)+c);
    }

    @Override
    public String toString() {
        String val= "Y= "+a+"x^2";
        if (b>=0){
            val+="+";
        }
        val+=b+"x ";
        if (c>=0){
            val+="+";
        }
        val+=c;
        return val;
    }
}
