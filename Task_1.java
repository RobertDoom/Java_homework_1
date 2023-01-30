// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы.

class Task_1
{
    private static int getMax(int[] A)
    {
        int max = Integer.MIN_VALUE;
        for (int i: A) {
            max = Math.max(max, i);
        }
 
        return max;
    }
 
    private static int getMin(int[] A)
    {
        int min = Integer.MAX_VALUE;
        for (int i: A) {
            min = Math.min(min, i);
        }
 
        return min;
    }
 
    public static void main(String[] args)
    {
        int[] A = { 7, 8, 4, 5, 3, 6 };
 
        System.out.println("Максимальный элемент массива = " + getMin(A));
        System.out.println("Минимальный элемент массива = " + getMax(A));
    }
}