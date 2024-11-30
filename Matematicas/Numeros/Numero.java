package Numeros;

public class Numero {
    private float num;
    private float factorial;
    private boolean primo;

    public Numero (float n){
        float facto = 1;
        this.num = n;
        this.primo = false;
        for (int i = 2; i<=n; i++)
            facto *= i;
        this.factorial=facto;
        if (this.num == 1 || this.num == 2 || this.num == 3 || this.num == 5 || this.num == 7 || this.num == 11 )
            this.primo = true;
        else
            if (this.num % 2 !=0)
                if (this.num % 3 !=0)
                    if (this.num % 5 !=0)
                        if (this.num % 7 !=0)
                            if (this.num % 11 !=0)
                                this.primo = true;

    }

    public float getFactorial(){
        return this.factorial;
    }

    public boolean getEsprimo(){
        return this.primo;
    }
}
