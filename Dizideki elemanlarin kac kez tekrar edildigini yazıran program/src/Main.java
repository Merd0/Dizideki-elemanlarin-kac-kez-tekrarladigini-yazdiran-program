import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if ( i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = { 12,15,12,13,24,15,16,75,24,68,765,32,5,67,24,512,52,1,24,5 };
        int[] duplicate = new int[list.length];
        int indexndex=0;
        int count = 0;

        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("===================");
        System.out.println("Tekrar Sayıları ");

        for (int i = 0; i < list.length; i++) {
            count = 0;
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    count++;
                }
            }
            if(!isFind(duplicate, list[i]))
                System.out.println(list[i]+ " sayısı " +(count+1)+" kere tekrar edildi.");
            duplicate[indexndex++]= list[i];
        }
    }
}