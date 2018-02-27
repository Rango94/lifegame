package biology;

public class biologyself {
    public int category;
    public double[] DNA;

    public int[] recipes;

    public double speend;

    public int lifetime;
    public int age;

    public double cost;

    public double max_genaretion;
    public int had_genaretion;

    public double desire;

    public int[] location;

    public biologyself(int size){
        DNA=new double[size];
        for(int i=0;i<size;i++){
            DNA[i]=Math.random();
        }


    }



}
