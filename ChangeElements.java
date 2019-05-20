import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeElements {
    public static void main(String[] args) {

        Object[] objArr = new Object[]{1, 2, 3};
        Object[] temp = new Object[1];
        temp[0] = objArr[2];
        objArr[2] = objArr[0];
        objArr[0] = temp[0];
        String intArrString = Arrays.toString(objArr);
        Object printtemp = Arrays.toString(temp);
        System.out.println(intArrString);
//        System.out.println(printtemp);

    }


}
