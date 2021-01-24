package tcp;

import java.io.IOException;

public interface Client {
    /**
     * a TCP connection with a Server
     * @param hostname destiation hostname
     * @param port desitation port
     * @return  return a Connection to a server
     * @throws IOException throws when failed to build a connection to server
     */
    Connection connect(String hostname,int port) throws IOException;
}
