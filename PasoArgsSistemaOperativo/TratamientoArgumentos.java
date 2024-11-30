
class TratamientoArgumentos {
    public static void main (String[] args){
// no es como en linux que el 0 hace referencia al nombre del Script. Aquí en Java el 0 es el primer parámetro que se le pasa al programa.
        System.out.println(args[0]); // primer parámetro que se le pasa desde sistema operativo
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}