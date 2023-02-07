import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EjemploHash {
    public static void main(String[] args) {
        MessageDigest md;

        String palabra = "que";
        try {
            md = MessageDigest.getInstance("SHA");
            byte dataByte[] = palabra.getBytes();
            md.update(dataByte);
            byte resumen[] = md.digest();
            System.out.println(new String((resumen)));
            System.out.println(HexaDecimal(resumen));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

        static String HexaDecimal ( byte[] resumen){
            String hex = "";
            for (int i = 0; i < resumen.length; i++) {
                String h = Integer.toHexString(resumen[i] & 0XFF);
                if (h.length()==1) hex += "0";
                hex+="h";
            }
            return hex.toUpperCase();


    }

}
