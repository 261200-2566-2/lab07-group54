import java.util.HashMap;


public class Set<E> {
    private HashMap<E,E> map;

    public Set() {
        map = new HashMap<E,E>();
    }

    public Boolean add(E e) {
        if(!map.containsKey(e)) {
            map.put(e, e);
            return true;
        }
        return false;
    }

    public Boolean remove(E e) {
        if(map.containsKey(e)) {
            map.remove(e);
            return true;
        }
        else return false;
    }

    public void printSet() {
        System.out.println(this.map.values());
    }

    public void clear() {
        map.clear();
    }

    public Boolean contains(E e){
        return map.containsKey(e);
    }

    public boolean containsAll(Set<? extends E> s) {
        return map.keySet().containsAll(s.map.keySet());
    }

    public Boolean addAll(Set<? extends E> s) {
        if(!containsAll(s)) {
            map.putAll(s.map);
            return true;
        }
        return false;
    }

    public Boolean removeAll(Set<? extends E> s) {
        boolean modified = false;

        for (E element : s.map.keySet()) {
            if (map.containsKey(element)) {
                map.remove(element);
                modified = true;
            }
        }

        return modified;
    }





    public static void main(String[] args) {
        Set<Integer> myset = new Set<>();
        Set<Integer> otset = new Set<>();
        otset.add(1);
        otset.add(2);
        otset.add(3);
        myset.addAll(otset);
        myset.add(4);
        myset.add(5);
        myset.add(6);
        myset.printSet();
        myset.remove(1);
        myset.printSet();
        myset.removeAll(otset);
        myset.printSet();


    }
}
