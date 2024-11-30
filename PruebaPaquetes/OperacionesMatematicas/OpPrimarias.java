package OperacionesMatematicas;

class OpSecundarias {

    protected int num; //protected también es visible a nivel de paquete.

    public OpSecundarias (int a) {

        this.num = a;
    }

}

public class OpPrimarias {

    OpSecundarias operaciones = new OpSecundarias(5);

    public void presentaNumero (){

        System.out.println(operaciones.num);
    }
}