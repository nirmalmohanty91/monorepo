package MyPreparation.zExperimentPackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.stream.Stream;

public class ByteArrayToObject {
    public static void main(String[] args) throws IOException {
        String s = "Nirmal";
        byte[] b = s.getBytes();
        System.out.println(b);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        System.out.println(new String(b));
        Object o = b;
        System.out.println(new String((byte[]) o));

        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
