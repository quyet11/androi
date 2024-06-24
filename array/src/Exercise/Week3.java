package Exercise;

import java.util.Arrays;

public class Week3  {
    public static void Average(String[] args) {
        String codeName = "BH0011,4,2";
        String[] arrCode = codeName.split(",");
        float sum = 0;
        for(int i = 1; i < arrCode.length; i++){
            sum += Float.parseFloat(arrCode[i]);
        }
        float avg = sum / (arrCode.length-1);
        System.out.println(Arrays.toString(arrCode));
        System.out.println("sinhvien: "+arrCode[0]+" Diem trung binh "+avg);


    }
}
