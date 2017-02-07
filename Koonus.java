public class Koonus{
    double r, h ,m;
    public Koonus(double raadius, double k6rgus, double moodustaja){
        if(raadius<=0){throw new RuntimeException("Sobimatu raadius");}
        if(k6rgus<=0){throw new RuntimeException("Sobimatu kõrgus");}
        if(moodustaja<=0){throw new RuntimeException("Sobimatu kõrgus");}
        r=raadius;
        h=k6rgus;
        m=moodustaja;
    }
    public double rpindala(){
        return 3.14*(r*r);
    }
    public double ruumala(){
        return 1.0/3*3.14*r*r*h;
    }
    public double pindala(){
        return 3.14* r *(r+m);
    }
}
