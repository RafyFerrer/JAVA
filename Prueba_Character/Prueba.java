class Prueba_c {
    Character hola='A'; //char seria el tipo primitivo
    String adios="hola";
    boolean c = true;

// la comilla doble es para String y la comilla simple para los char.

    public Prueba_c() {
        this.hola = 'A';
        this.c = (this.hola == 'A');

    }
}

class Prueba{
    public static void main(String[] args) {

        Prueba_c p1=new Prueba_c();
        if (p1.c==true) {
            System.out.println(p1.hola);
            System.out.println(p1.adios);
        }
    }
}