package phase1.basics.arrays.demo;

import phase1.basics.arrays.streamtypes.IntStreamLab;

public class StreamDemo {
    public static void main(String[] args) {
        // Test array with variety: positives, negatives, duplicates, evens/odds
        int[] numbers = {10, -5, 20, 15, 20, 0, 7, 14};

        System.out.println("🧪 IntStreamLab — Comprehensive Stream Operations Demo");
        System.out.println("=".repeat(60));
        System.out.println("Test Array: " + java.util.Arrays.toString(numbers));
        System.out.println();

        IntStreamLab streamIntLab = new IntStreamLab();

        // 🔢 Core Aggregations
        System.out.println("📊 Core Aggregations:");
        streamIntLab.aggregate(numbers);
        streamIntLab.avg(numbers);
        streamIntLab.countVal(numbers);
        streamIntLab.minimum(numbers);
        streamIntLab.maximum(numbers);
        streamIntLab.stats(numbers);
        System.out.println();

        // 🖨️ Display
        System.out.println("🖨️  Raw Elements:");
        streamIntLab.list(numbers);
        System.out.println();

        // 🔄 Transform & Filter
        System.out.println("🔄 Transformations & Filtering:");
        streamIntLab.demonstrateMap(numbers);
        streamIntLab.demonstrateFilter(numbers);
        streamIntLab.demonstrateDistinctAndSorted(numbers);
        streamIntLab.demonstrateLimitAndSkip(numbers);
        System.out.println();

        // ✅ Matching
        System.out.println("✅ Matching Operations:");
        streamIntLab.demonstrateMatching(numbers);
        System.out.println();

        // 📦 Collection & Reduction
        System.out.println("📦 Collection & Reduction:");
        streamIntLab.demonstrateCollect(numbers);
        streamIntLab.demonstrateReduce(numbers);
        System.out.println();

        System.out.println("✅ IntStreamLab demo completed successfully!");
    }
}