import java.util.HashMap;

public class mySet<E> {
    private HashMap<E,E> map;
    private Iterator<E> iterator;

    public mySet() {
        map = new HashMap<E,E>();
    }

    public Boolean add(E e) {
        if(!contains(e)) {
            map.put(e, e);
            return true;
        }
        return false;
    }

    public Boolean remove(E e) {
        if(contains(e)) {
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

    public boolean containsAll(mySet<? extends E> s) {
        return map.keySet().containsAll(s.map.keySet());
    }

    public Boolean addAll(mySet<? extends E> s) {
        if(!containsAll(s)) {
            map.putAll(s.map);
            return true;
        }
        return false;
    }

    public Boolean removeAll(mySet<? extends E> s) {
        boolean modified = false;

        for (E element : s.map.keySet()) {
            if (map.containsKey(element)) {
                map.remove(element);
                modified = true;
            }
        }

        return modified;
    }

    public Boolean retainAll(mySet<? extends E> s) { //intersection
        boolean modified = false;

        for (E element : s.map.keySet()) {
            if (!map.containsKey(element)) {
                map.remove(element);
                modified = true;
            }
        }
        return modified;
    }

    public int size() {
        return map.size();
    }

    public Boolean isEmpty() {
        return map.isEmpty();
    }

    public Iterator<E> iterator() {
        return iterator;
    }

}
