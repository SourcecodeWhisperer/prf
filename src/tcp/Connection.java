package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface Connection {

    /**
     * get Outputstream from an TCP connection
     * @return an Outputstream
     * @throws IOException
     */
    OutputStream getOutputStream() throws IOException;

    /**
     * get Inputstream from an TCP connection
     * @return an Inputstream
     * @throws IOException
     */
    InputStream getInputStream() throws IOException;
}
