import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by Yefa on 12/31/16.
 */
public class Internet {
    private static final String FLOWER ="http://services.hanselandpetal.com/feeds/flowers.xml";

    public static void main(String[] args) throws IOException {
        InputStream stream= null;
        StringBuilder sb=null;
        BufferedInputStream buf =null;

        try {
            URL url = new URL(FLOWER);


            stream = url.openStream();

            buf = new BufferedInputStream(stream);

            sb = new StringBuilder();

            while (true){
                int data = buf.read();
                if(data == -1){
                    break;
                }else{
                    sb.append((char)data);
                }
            }

            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            stream.close();
            buf.close();


        }


    }
}
