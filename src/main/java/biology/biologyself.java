package biology;

import com.sun.applet2.AppletParameters;
import universe.land;
import universe.rule;
import universe.unit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class biologyself {
    public double category;
    public double[] DNA;

    public HashMap<Integer,Double> recipes;

    public double steps;
    public double far;

    public double lifetime;
    public int age;

    public double cost;
    public double full;

    public double max_genaretion;
    public int had_genaretion;

    public double genadesire;
    public double huntdesire;

    public int[] location;

    public double canenaretion;


    public biologyself(int size,int[] location,rule r){
        DNA=new double[size];
        for(int i=0;i<size;i++){
            DNA[i]=Math.random();
        }
        this.location=location;
        init(r);
    }

    public biologyself(){

    }


    private void init(rule r){
        age=0;
        had_genaretion=0;
        category= F(r.getCategorybase(),DNA,10);
        steps= F(r.getSpeedbase(),DNA,10);
        lifetime= F(r.getLifetimebase(),DNA,100);
        double ap=0.2;
        cost=category*steps*ap;
        max_genaretion= F(r.getMax_genaretionbase(),DNA,10);
        genadesire= F(r.getGenadesirebase(),DNA,1);
        huntdesire= F(r.getHuntdesirebase(),DNA,1);
        canenaretion= F(r.getCanenaretion(),DNA,lifetime);
    }

    private double F(double[] a, double[] b, double max){
        double out=0;
        for(int i=0;i<a.length;i++){
            out+=a[i]*b[i];
        }
        return max/(1+Math.pow(Math.E,-out));
    }

    public List<unit> gogogo(land L){
        double full=cost;
        double far=steps;
        List<unit> changeunit=new ArrayList<unit>();
        while(full>0&&far>0){
            int[] destination=perfectlocation(L);
            hunting(L.getunit(perfectlocation(L)));

        }

    }

    private unit hunting(unit u){
        for(Integer e:recipes.keySet()){
            if(full>u.getsinglecontext(e)) {
                u.setsinglecontext(e, 0);
                full-=u.getsinglecontext(e);
            }else{
                u.setsinglecontext(e,u.getsinglecontext(e)-full);
                full=0;
            }
        }
        return u;
    }


    private int[] perfectlocation(land L){
        double max_weight=0;
        int[] out=new int[2];
        for(int i=(int)(location[0]-steps>=0?0:location[0]-steps);i<(int)(location[0]+steps<L.getSize()?location[0]+steps:L.getSize());i++){
            for(int j=(int)(location[1]-steps>=0?0:location[1]-steps);j<(int)(location[1]+steps<L.getSize()?location[1]+steps:L.getSize());j++){
                double weight=0;
                for(Integer e:recipes.keySet()){
                    weight+=L.getunit(new int[]{i,j}).getsinglecontext(e)*recipes.get(e);
                    }
                weight=weight/Math.pow(dis(new int[]{i,j},location),2);
                if(weight>max_weight){
                    max_weight=weight;
                    out=new int[]{i,j};
                }
            }
        }
        far-=dis(out,location);
        return out;
    }

    private double dis(int[] a,int[] b){
        return Math.pow(Math.pow(a[0]-b[0],2)+Math.pow(a[1]-b[1],2),0.5);
    }



}
