package utils;

public class RandomArray {

    public static int[] getGeneratedArray(int length, int minGeneratedRange, int maxGeneratedRange) {
        int[] randomArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = RandomGenerator.getRandomInt(minGeneratedRange, maxGeneratedRange);
        }
        return randomArray;
    }
    
    public static void getMultipleElement (int[] array, int multipleElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % multipleElement == 0) {
                System.out.println(array[i]);
            }
        }
    }    
}
