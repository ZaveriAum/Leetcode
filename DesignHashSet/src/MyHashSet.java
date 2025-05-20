class MyHashSet {

    private final int SIZE = 13501; // Use a prime number
    private final int[] mySet;
    private final int DELETED = Integer.MIN_VALUE;

    public MyHashSet() {
        mySet = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            mySet[i] = -1;
        }
    }

    public void add(int key) {
        int index = key % SIZE;
        int start = index;
        int collision = 1;
        while (mySet[index] != -1 && mySet[index] != DELETED && mySet[index] != key) {
            index = (start + collision) % SIZE;
            collision++;
        }
        mySet[index] = key;
    }

    public void remove(int key) {
        int index = key % SIZE;
        int start = index;
        int collision = 1;
        while (mySet[index] != key && mySet[index] != -1) {
            index = (start + collision) % SIZE;
            collision++;
        }
        if (mySet[index] == key) {
            mySet[index] = DELETED;
        }
    }

    public boolean contains(int key) {
        int index = key % SIZE;
        int start = index;
        int collision = 1;
        while (true) {
            if (mySet[index] == key) return true;
            else if (mySet[index] == -1) return false;
            index = (start + collision) % SIZE;
            collision++;
        }
    }

}
