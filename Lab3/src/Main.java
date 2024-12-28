

public class Main {
    public static void main(String[] args) {

        // Initialize an array of MinecraftBlock objects
        MinecraftBlock[] blocks = {
                new MinecraftBlock(1, "Wood Block", 2.5, 1.5, 0),
                new MinecraftBlock(2, "Pine Block", 2.5, 2, 0),
                new MinecraftBlock(32, "Lightstone", 6.0, 3.0, 200),
                new MinecraftBlock(4, "Iron Block", 7.0, 4.5, 0),
                new MinecraftBlock(54, "Jack O Lantern", 5.0, 4.0, 150),
        };

        // Sort the array of blocks by name and by hardness
        for (int i = 0; i < blocks.length - 1; i++) {
            for (int j = i + 1; j < blocks.length; j++) {

                if (blocks[i].getName().compareTo(blocks[j].getName()) > 0) {
                    MinecraftBlock temp = blocks[i];
                    blocks[i] = blocks[j];
                    blocks[j] = temp;
                } else if (blocks[i].getName().equals(blocks[j].getName()) &&
                        blocks[i].getHardness() < blocks[j].getHardness()) {

                    MinecraftBlock temp = blocks[i];
                    blocks[i] = blocks[j];
                    blocks[j] = temp;
                }
            }
        }

        // Display the sorted array of blocks
        System.out.println("Sorted blocks:");
        for (MinecraftBlock block : blocks) {
            System.out.println(block);
        }

        // Search for an identical block by iterating through the array
        MinecraftBlock searchedBlock = new MinecraftBlock(32, "Lightstone", 6.0, 3.0, 200);
        boolean isFound = false;

        for (MinecraftBlock block : blocks) {
            if (block.equals(searchedBlock)) {
                System.out.println("Found same block: " + block);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Identical block wasn't found.");
        }
    }
}