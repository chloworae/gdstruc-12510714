// Notes:
// Hash tables - indices in arrays, keys = index
// each data consists of key value pairs, doesn't have to match
// like a dcitonary where words = keys | meanings = values
// Write and run Java online using this editor.
// put = add | get = access specific
// collisions happen when two o same value have conflict
// open addressing finds next open to place element there
// linear probing - to determine if thre are collisions


class Main {
    public static void main(String[] args) {

        Player asuna = new Player(1, "Asuna", 100);
        Player tenz = new Player(2, "Tenz", 240);
        Player zekken = new Player(3, "Zekken", 42);
        Player f0rsakeN = new Player(4, "f0rsakeN", 156);
        Player oxy = new Player(5, "Oxy", 64);

        SimpleHashTable hashtable = new SimpleHashTable();
        hashtable.put(asuna.getUsername(), asuna);
        hashtable.put(tenz.getUsername(), tenz);
        hashtable.put(zekken.getUsername(), zekken);
        hashtable.put(f0rsakeN.getUsername(), f0rsakeN);
        hashtable.put(oxy.getUsername(), oxy);

        System.out.println("Initial table: ");
        hashtable.printHashtable();

        System.out.println("\nValue to remove: ");
        System.out.println(hashtable.get("Oxy"));

        hashtable.remove("Oxy");

        System.out.println("\nNew table: ");
        hashtable.printHashtable();
//        System.out.println(hashtable.get("Zekken"));

    }
}