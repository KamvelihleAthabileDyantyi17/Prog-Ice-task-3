import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOperations {

    public static void main(String[] args) {
        // 1. Create an array list and add colors
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print the colors
        System.out.println("Colors: " + colors);

        // 2. Iterate through all elements
        System.out.println("\nIterating through elements:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 3. Insert an element at the first position
        colors.add(0, "Purple");
        System.out.println("\nColors after inserting Purple: " + colors);

        // 4. Retrieve an element at a specified index
        String colorAtIndex2 = colors.get(2);
        System.out.println("\nColor at index 2: " + colorAtIndex2);

        // 5. Update an array element
        colors.set(1, "Orange");
        System.out.println("\nColors after updating index 1: " + colors);

        // 6. Remove the third element
        colors.remove(2);
        System.out.println("\nColors after removing element at index 2: " + colors);

        // 7. Search for an element
        boolean containsRed = colors.contains("Red");
        System.out.println("\nDoes the list contain 'Red'? " + containsRed);

        // 8. Sort the list
        Collections.sort(colors);
        System.out.println("\nSorted colors: " + colors);

        // 9. Copy one array list into another
        List<String> copiedColors = new ArrayList<>(colors);
        System.out.println("\nCopied colors: " + copiedColors);

        // 10. Shuffle elements
        Collections.shuffle(colors);
        System.out.println("\nShuffled colors: " + colors);

        // 11. Reverse elements
        Collections.reverse(colors);
        System.out.println("\nReversed colors: " + colors);

        // 12. Extract a portion of the list
        List<String> subList = colors.subList(1, 3);
        System.out.println("\nSublist: " + subList);

        // 13. Compare two array lists
        boolean areEqual = colors.equals(copiedColors);
        System.out.println("\nAre the original and copied lists equal? " + areEqual);

        // 14. Swap two elements
        Collections.swap(colors, 0, 2);
        System.out.println("\nColors after swapping elements: " + colors);

        // 15. Join two array lists
        colors.addAll(copiedColors);
        System.out.println("\nColors after joining lists: " + colors);

        // 16. Clone an array list
        List<String> clonedColors = new ArrayList<>(colors);
        System.out.println("\nCloned colors: " + clonedColors);

        // 17. Empty an array list
        colors.clear();
        System.out.println("\nColors after clearing: " + colors);

        // 18. Test if the list is empty
        boolean isEmpty = colors.isEmpty();
        System.out.println("\nIs the list empty? " + isEmpty);

        // 19. Trim the capacity
        copiedColors.trimToSize();

        // 20. Increase the size
        copiedColors.ensureCapacity(10);

        // 21. Replace the second element
        copiedColors.set(1, "Black");
        System.out.println("\nCopied colors after replacing the second element: " + copiedColors);

        // 22. Print all elements using the elements' position
        System.out.println("\nPrinting elements and their positions:");
        for (int i = 0; i < copiedColors.size(); i++) {
            System.out.println("Position " + i + ": " + copiedColors.get(i));
        }
    }
}
