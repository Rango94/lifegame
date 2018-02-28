package universe;

import biology.biologyself;

import java.util.HashMap;
import java.util.List;

public class unit {
    private List<biologyself> biologyselves;
    private HashMap<Integer,Double> contexts;
    private int[] location;

    public HashMap<Integer,Double> getContexts() {
        return contexts;
    }

    public int[] getLocation() {
        return location;
    }

    public void setContexts(HashMap<Integer,Double> contexts) {
        this.contexts = contexts;
    }

    public unit(int[] loa){
        HashMap<biologyself,Integer> contexts=new HashMap<biologyself, Integer>();
        supply(loa);
    }

    public void supply(int[] loa){
        biologyselves.add(new biologyself());
        if(contexts.containsKey(0)) {
            contexts.put(0,contexts.get(0)+100.0);
        }else{
            contexts.put(0,100.0);
        }
    }

    public void unit_addtion(List<biologyself> addtion){
        for(biologyself e:addtion){
            if(!contexts.containsKey(e)){
                contexts.put(e,1);
            }else{
                contexts.put(e,1+contexts.get(e));
            }
        }
    }

    public double getsinglecontext(int id){

        return contexts.get(id);
    }

    public void setsinglecontext(biologyself item,int remain){
        contexts.put(item,remain);
    }

}
