package HashMap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMap<k,v> {
   Obj list[]=new Obj[11];
    public void put(k key,v value){

        int i=key.hashCode();
        int in=i%10;
        Obj ob1=list[in];
        if(ob1==null){

            list[in]=new Obj<k, v>(key,value);;
        }
        else if(ob1!=null){
            while (ob1.getNext()!=null){
                ob1=ob1.getNext();
            }
            ob1.setNext(new Obj(key,value,null));

        }
    }
    public List get(){
        ArrayList list1=new ArrayList();
        for(int i=0;i<10;i++)
        list1.add(list[i]);
        return list1;
    }
    public void update(k key,v value){


    }
}
