public class Week4 {
    /** Tim gia tri lon nhat cua hai so nguyen. */
    public static int max2Int(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /** Tim gia tri nho nhat cua 1 mang so nguyen. */
    public static int minArray(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    /** Tinh BMI. */
    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        bmi = Math.round(bmi * 10.0) / 10.0; 

        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi <= 22.9) {
            return "Bình thường";
        } else if (bmi <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}