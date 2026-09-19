public class WarehouseInventoryBalancer {
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0;
        int highest = sectionA[0], item = 0;
        String section = "A";
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];
            if (sectionA[i] > highest) { highest = sectionA[i]; item = i; section = "A"; }
            if (sectionB[i] > highest) { highest = sectionB[i]; item = i; section = "B"; }
        }
        String status = totalA == totalB ? "Balanced" : "Not Balanced";
        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB + " | Status: " + status);
        System.out.println("Highest Quantity: " + highest + " (Section " + section + ", Item " + (item + 1) + ")");
    }

    public static void main(String[] args) {
        analyzeInventory(new int[] {20, 15, 30}, new int[] {25, 10, 30});
    }
}
