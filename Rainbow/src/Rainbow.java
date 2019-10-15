public class Rainbow {
    public static void main(String[] args) {
        String rainbow[] = {"red", "orange", "yellow", "green", "cyan", "blue", "violet"};

        for (int i = 0; i < rainbow.length ; i++){
            System.out.println("[" + i + "]: " + rainbow[i]);
        }

        System.out.println("\nConversely:");
        String item;

        for (int i = 0; i < rainbow.length/2; i++){
            item = rainbow[i];
            rainbow[i] = rainbow[rainbow.length-(i+1)];
            rainbow[rainbow.length-(i+1)] = item;
        }

        for (int i = 0; i < rainbow.length ; i++){
            System.out.println("[" + i + "]: " + rainbow[i]);
        }
    }
}
