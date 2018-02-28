package universe;

import java.util.ArrayList;
import java.util.List;

public class land {
    List<unit> Land=new ArrayList<unit>();
    int Size=0;

    public land(int size){
        Size=size;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                Land.add(new unit(new int[]{i,j}));
            }
        }
    }

    public unit getunit(int[] loa){
        return Land.get(loa[Size*loa[0]+loa[1]]);
    }

    public void setunit(unit in){
        Land.set(in.getLocation()[0]*Size+in.getLocation()[1],in);
    }

    public int getSize() {
        return Size;
    }
}
