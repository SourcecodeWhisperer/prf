package tcp;

import java.io.IOException;

public interface Server {
    /**
     * accept connection from clients
     * @param port destination port
     * @return an connection to a client
     * @throws IOException
     */
    Connection acceptConnection(int port) throws IOException;
}
