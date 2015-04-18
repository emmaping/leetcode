public class LRUCache {
    private final int capacity;
    private final Map<Integer, Integer> cache;
    private final List<Integer> queue; 

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<Integer, Integer>();
        this.queue = new ArrayList<Integer>();
    }
    
    private void updatequeue(int key){
    	queue.remove(queue.indexOf(key));
    	queue.add(key);
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
       updatequeue(key);
       return cache.get(key);
    }

    public void set(int key, int value) {
        int val = get(key); 
        cache.put(key, value); 
        if (val == -1) {
            queue.add(key); 

            if (cache.size() > capacity) { 
                cache.remove(queue.get(0));
                queue.remove(0);
            }
        }
    }
}