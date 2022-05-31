package HashMap;

import java.util.Map;

public class Obj<k,v>  {
    private k key;
    private  v value;
    private Obj next;
    int hash;

   public Obj(){

    }
    public Obj(k key,v value){
       this.key=key;
       this.value=value;
    }
    public Obj(k key,v value,Obj next){
       this.key=key;
       this.value=value;
       this.next=next;
    }

    public k getKey() {
        return key;
    }

    public void setKey(k key) {
        this.key = key;
    }

    public v getValue() {
        return value;
    }

    public void setValue(v value) {
        this.value = value;
    }

    public  Obj getNext() {
        return next;
    }

    public void setNext(Obj next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
