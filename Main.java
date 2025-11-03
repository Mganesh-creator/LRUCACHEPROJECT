public class Main {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);

        System.out.println("=== LRU Cache Demo ===");
        cache.put(1, 10);
        cache.put(2, 20);
        cache.put(3, 30);
        cache.printCache();

        System.out.println("Accessing key 2: " + cache.get(2));
        cache.printCache();

        System.out.println("Inserting key 4 (cache is full)...");
        cache.put(4, 40);
        cache.printCache();

        System.out.println("Accessing key 1: " + cache.get(1)); // -1
        System.out.println("Accessing key 3: " + cache.get(3)); // 30
        cache.printCache();

        System.out.println("Demo completed!");
    }
}
