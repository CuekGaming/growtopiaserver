import ENet.enet;
import ENet.ENetHost;
import ENet.ENetEvent;
import ENet.ENetAddress;
import ENet.ENetEventType;
import ENet.ENetPacket;
import ENet.ENetPacketFlag;
import ENet.ENetBuffer;
import java.nio.file.Paths;

public class Server { 

	public static void main(String[] args) {
		try {
    		System.load(Paths.get("").toAbsolutePath().toString() + "/libenet.so");
    		enet en = new enet();
    		ENetEvent event = new ENetEvent();
    		ENetAddress address = new ENetAddress();
    		en.enet_address_set_host_ip(address, "0.0.0.0");
    		address.setPort(10003);
    		ENetHost host = en.enet_host_create(address, 3200, 2, 0, 0);
    		en.set_crc32(host);
    		en.enet_host_compress_with_range_coder(host);
    		while(true) {
				if(en.enet_host_service(host, event, 100) > 0) {
					ENetEventType type = event.getType();
					if(type == ENetEventType.ENET_EVENT_TYPE_CONNECT) {
						System.out.println(event.getPeer());
						byte[] connectByte = new byte[] {0x01, 0x00, 0x00, 0x00, 0x00};
						ENetPacket packet = en.enet_packet_create(connectByte, ENetPacketFlag.ENET_PACKET_FLAG_RELIABLE);
						en.enet_peer_send(event.getPeer(), (short)0, packet);
					}
					if(type == ENetEventType.ENET_EVENT_TYPE_RECEIVE) {

					}
					if(type == ENetEventType.ENET_EVENT_TYPE_DISCONNECT) {
						
					}
				}
    		}
	    } catch (UnsatisfiedLinkError e) {
			System.err.println("Native code library failed to load.\n" + e);
			System.exit(1);
	    }
	}

}