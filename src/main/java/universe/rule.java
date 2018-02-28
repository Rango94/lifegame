package universe;

public class rule {
    double[] categorybase;
    double[] recipesbase;
    double[] speedbase;
    double[] lifetimebase;
    double[] agebase;
    double[] costbase;
    double[] max_genaretionbase;
    double[] genadesirebase;
    double[] huntdesirebase;
    double[] canenaretion;


    int Size;
    public rule(int size){
        Size=size;
        categorybase=new double[size];
        for(int i=0;i<size;i++){
            categorybase[i]=Math.random();
        }
        recipesbase=new double[size];
        for(int i=0;i<size;i++){
            recipesbase[i]=Math.random();
        }
        speedbase=new double[size];
        for(int i=0;i<size;i++){
            speedbase[i]=Math.random();
        }
        lifetimebase=new double[size];
        for(int i=0;i<size;i++){
            lifetimebase[i]=Math.random();
        }
        agebase=new double[size];
        for(int i=0;i<size;i++){
            agebase[i]=Math.random();
        }
        costbase=new double[size];
        for(int i=0;i<size;i++){
            costbase[i]=Math.random();
        }
        max_genaretionbase=new double[size];
        for(int i=0;i<size;i++){
            max_genaretionbase[i]=Math.random();
        }
        genadesirebase=new double[size];
        for(int i=0;i<size;i++){
            genadesirebase[i]=Math.random();
        }
        huntdesirebase=new double[size];
        for(int i=0;i<size;i++){
            huntdesirebase[i]=Math.random();
        }
        canenaretion=new double[size];
        for(int i=0;i<size;i++){
            canenaretion[i]=Math.random();
        }
    }

    public double[] getCategorybase() {
        return categorybase;
    }

    public double[] getRecipesbase() {
        return recipesbase;
    }

    public double[] getSpeedbase() {
        return speedbase;
    }

    public double[] getLifetimebase() {
        return lifetimebase;
    }


    public double[] getCostbase() {
        return costbase;
    }

    public double[] getMax_genaretionbase() {
        return max_genaretionbase;
    }

    public double[] getGenadesirebase() {
        return genadesirebase;
    }

    public double[] getHuntdesirebase() {
        return huntdesirebase;
    }

    public double[] getCanenaretion() {
        return canenaretion;
    }
}
