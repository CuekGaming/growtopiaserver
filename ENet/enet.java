/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ENet;

public class enet implements enetConstants {
  public static void enet_list_clear(ENetList arg0) {
    enetJNI.enet_list_clear(ENetList.getCPtr(arg0), arg0);
  }

  public static ENetListNode enet_list_insert(ENetListNode arg0, SWIGTYPE_p_void arg1) {
    long cPtr = enetJNI.enet_list_insert(ENetListNode.getCPtr(arg0), arg0, SWIGTYPE_p_void.getCPtr(arg1));
    return (cPtr == 0) ? null : new ENetListNode(cPtr, false);
  }

  public static SWIGTYPE_p_void enet_list_remove(ENetListNode arg0) {
    long cPtr = enetJNI.enet_list_remove(ENetListNode.getCPtr(arg0), arg0);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static ENetListNode enet_list_move(ENetListNode arg0, SWIGTYPE_p_void arg1, SWIGTYPE_p_void arg2) {
    long cPtr = enetJNI.enet_list_move(ENetListNode.getCPtr(arg0), arg0, SWIGTYPE_p_void.getCPtr(arg1), SWIGTYPE_p_void.getCPtr(arg2));
    return (cPtr == 0) ? null : new ENetListNode(cPtr, false);
  }

  public static long enet_list_size(ENetList arg0) {
    return enetJNI.enet_list_size(ENetList.getCPtr(arg0), arg0);
  }

  public static SWIGTYPE_p_void enet_malloc(long arg0) {
    long cPtr = enetJNI.enet_malloc(arg0);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static void enet_free(SWIGTYPE_p_void arg0) {
    enetJNI.enet_free(SWIGTYPE_p_void.getCPtr(arg0));
  }

  public static int enet_initialize() {
    return enetJNI.enet_initialize();
  }

  public static int enet_initialize_with_callbacks(long version, ENetCallbacks inits) {
    return enetJNI.enet_initialize_with_callbacks(version, ENetCallbacks.getCPtr(inits), inits);
  }

  public static void enet_deinitialize() {
    enetJNI.enet_deinitialize();
  }

  public static void set_crc32(ENetHost host) {
    enetJNI.set_crc32(ENetHost.getCPtr(host), host);
  }

  public static long enet_linked_version() {
    return enetJNI.enet_linked_version();
  }

  public static long enet_time_get() {
    return enetJNI.enet_time_get();
  }

  public static void enet_time_set(long arg0) {
    enetJNI.enet_time_set(arg0);
  }

  public static int enet_socket_create(ENetSocketType arg0) {
    return enetJNI.enet_socket_create(arg0.swigValue());
  }

  public static int enet_socket_bind(int arg0, ENetAddress arg1) {
    return enetJNI.enet_socket_bind(arg0, ENetAddress.getCPtr(arg1), arg1);
  }

  public static int enet_socket_get_address(int arg0, ENetAddress arg1) {
    return enetJNI.enet_socket_get_address(arg0, ENetAddress.getCPtr(arg1), arg1);
  }

  public static int enet_socket_listen(int arg0, int arg1) {
    return enetJNI.enet_socket_listen(arg0, arg1);
  }

  public static int enet_socket_accept(int arg0, ENetAddress arg1) {
    return enetJNI.enet_socket_accept(arg0, ENetAddress.getCPtr(arg1), arg1);
  }

  public static int enet_socket_connect(int arg0, ENetAddress arg1) {
    return enetJNI.enet_socket_connect(arg0, ENetAddress.getCPtr(arg1), arg1);
  }

  public static int enet_socket_send(int arg0, ENetAddress arg1, ENetBuffer arg2, long arg3) {
    return enetJNI.enet_socket_send(arg0, ENetAddress.getCPtr(arg1), arg1, ENetBuffer.getCPtr(arg2), arg2, arg3);
  }

  public static int enet_socket_receive(int arg0, ENetAddress arg1, ENetBuffer arg2, long arg3) {
    return enetJNI.enet_socket_receive(arg0, ENetAddress.getCPtr(arg1), arg1, ENetBuffer.getCPtr(arg2), arg2, arg3);
  }

  public static int enet_socket_wait(int arg0, SWIGTYPE_p_unsigned_int arg1, long arg2) {
    return enetJNI.enet_socket_wait(arg0, SWIGTYPE_p_unsigned_int.getCPtr(arg1), arg2);
  }

  public static int enet_socket_set_option(int arg0, ENetSocketOption arg1, int arg2) {
    return enetJNI.enet_socket_set_option(arg0, arg1.swigValue(), arg2);
  }

  public static int enet_socket_get_option(int arg0, ENetSocketOption arg1, SWIGTYPE_p_int arg2) {
    return enetJNI.enet_socket_get_option(arg0, arg1.swigValue(), SWIGTYPE_p_int.getCPtr(arg2));
  }

  public static int enet_socket_shutdown(int arg0, ENetSocketShutdown arg1) {
    return enetJNI.enet_socket_shutdown(arg0, arg1.swigValue());
  }

  public static void enet_socket_destroy(int arg0) {
    enetJNI.enet_socket_destroy(arg0);
  }

  public static int enet_socketset_select(int arg0, SWIGTYPE_p_fd_set arg1, SWIGTYPE_p_fd_set arg2, long arg3) {
    return enetJNI.enet_socketset_select(arg0, SWIGTYPE_p_fd_set.getCPtr(arg1), SWIGTYPE_p_fd_set.getCPtr(arg2), arg3);
  }

  public static int enet_address_set_host_ip(ENetAddress address, String hostName) {
    return enetJNI.enet_address_set_host_ip(ENetAddress.getCPtr(address), address, hostName);
  }

  public static int enet_address_set_host(ENetAddress address, String hostName) {
    return enetJNI.enet_address_set_host(ENetAddress.getCPtr(address), address, hostName);
  }

  public static int enet_address_get_host_ip(ENetAddress address, String hostName, long nameLength) {
    return enetJNI.enet_address_get_host_ip(ENetAddress.getCPtr(address), address, hostName, nameLength);
  }

  public static int enet_address_get_host(ENetAddress address, String hostName, long nameLength) {
    return enetJNI.enet_address_get_host(ENetAddress.getCPtr(address), address, hostName, nameLength);
  }

  public static ENetPacket enet_packet_create(byte[] arg0, ENetPacketFlag arg1) {
    long cPtr = enetJNI.enet_packet_create(arg0, arg1);
    return (cPtr == 0) ? null : new ENetPacket(cPtr, false);
  }

  public static void enet_packet_destroy(ENetPacket arg0) {
    enetJNI.enet_packet_destroy(ENetPacket.getCPtr(arg0), arg0);
  }

  public static int enet_packet_resize(ENetPacket arg0, long arg1) {
    return enetJNI.enet_packet_resize(ENetPacket.getCPtr(arg0), arg0, arg1);
  }

  public static long enet_crc32(ENetBuffer arg0, long arg1) {
    return enetJNI.enet_crc32(ENetBuffer.getCPtr(arg0), arg0, arg1);
  }

  public static ENetHost enet_host_create(ENetAddress arg0, long arg1, long arg2, long arg3, long arg4) {
    long cPtr = enetJNI.enet_host_create(ENetAddress.getCPtr(arg0), arg0, arg1, arg2, arg3, arg4);
    return (cPtr == 0) ? null : new ENetHost(cPtr, false);
  }

  public static void enet_host_destroy(ENetHost arg0) {
    enetJNI.enet_host_destroy(ENetHost.getCPtr(arg0), arg0);
  }

  public static ENetPeer enet_host_connect(ENetHost arg0, ENetAddress arg1, long arg2, long arg3) {
    long cPtr = enetJNI.enet_host_connect(ENetHost.getCPtr(arg0), arg0, ENetAddress.getCPtr(arg1), arg1, arg2, arg3);
    return (cPtr == 0) ? null : new ENetPeer(cPtr, false);
  }

  public static int enet_host_check_events(ENetHost arg0, ENetEvent arg1) {
    return enetJNI.enet_host_check_events(ENetHost.getCPtr(arg0), arg0, ENetEvent.getCPtr(arg1), arg1);
  }

  public static int enet_host_service(ENetHost arg0, ENetEvent arg1, long arg2) {
    return enetJNI.enet_host_service(ENetHost.getCPtr(arg0), arg0, ENetEvent.getCPtr(arg1), arg1, arg2);
  }

  public static void enet_host_flush(ENetHost arg0) {
    enetJNI.enet_host_flush(ENetHost.getCPtr(arg0), arg0);
  }

  public static void enet_host_broadcast(ENetHost arg0, short arg1, ENetPacket arg2) {
    enetJNI.enet_host_broadcast(ENetHost.getCPtr(arg0), arg0, arg1, ENetPacket.getCPtr(arg2), arg2);
  }

  public static void enet_host_compress(ENetHost arg0, ENetCompressor arg1) {
    enetJNI.enet_host_compress(ENetHost.getCPtr(arg0), arg0, ENetCompressor.getCPtr(arg1), arg1);
  }

  public static int enet_host_compress_with_range_coder(ENetHost host) {
    return enetJNI.enet_host_compress_with_range_coder(ENetHost.getCPtr(host), host);
  }

  public static void enet_host_channel_limit(ENetHost arg0, long arg1) {
    enetJNI.enet_host_channel_limit(ENetHost.getCPtr(arg0), arg0, arg1);
  }

  public static void enet_host_bandwidth_limit(ENetHost arg0, long arg1, long arg2) {
    enetJNI.enet_host_bandwidth_limit(ENetHost.getCPtr(arg0), arg0, arg1, arg2);
  }

  public static void enet_host_bandwidth_throttle(ENetHost arg0) {
    enetJNI.enet_host_bandwidth_throttle(ENetHost.getCPtr(arg0), arg0);
  }

  public static long enet_host_random_seed() {
    return enetJNI.enet_host_random_seed();
  }

  public static int enet_peer_send(ENetPeer arg0, short arg1, ENetPacket arg2) {
    return enetJNI.enet_peer_send(ENetPeer.getCPtr(arg0), arg0, arg1, ENetPacket.getCPtr(arg2), arg2);
  }

  public static ENetPacket enet_peer_receive(ENetPeer arg0, SWIGTYPE_p_unsigned_char channelID) {
    long cPtr = enetJNI.enet_peer_receive(ENetPeer.getCPtr(arg0), arg0, SWIGTYPE_p_unsigned_char.getCPtr(channelID));
    return (cPtr == 0) ? null : new ENetPacket(cPtr, false);
  }

  public static void enet_peer_ping(ENetPeer arg0) {
    enetJNI.enet_peer_ping(ENetPeer.getCPtr(arg0), arg0);
  }

  public static void enet_peer_ping_interval(ENetPeer arg0, long arg1) {
    enetJNI.enet_peer_ping_interval(ENetPeer.getCPtr(arg0), arg0, arg1);
  }

  public static void enet_peer_timeout(ENetPeer arg0, long arg1, long arg2, long arg3) {
    enetJNI.enet_peer_timeout(ENetPeer.getCPtr(arg0), arg0, arg1, arg2, arg3);
  }

  public static void enet_peer_reset(ENetPeer arg0) {
    enetJNI.enet_peer_reset(ENetPeer.getCPtr(arg0), arg0);
  }

  public static void enet_peer_disconnect(ENetPeer arg0, long arg1) {
    enetJNI.enet_peer_disconnect(ENetPeer.getCPtr(arg0), arg0, arg1);
  }

  public static void enet_peer_disconnect_now(ENetPeer arg0, long arg1) {
    enetJNI.enet_peer_disconnect_now(ENetPeer.getCPtr(arg0), arg0, arg1);
  }

  public static void enet_peer_disconnect_later(ENetPeer arg0, long arg1) {
    enetJNI.enet_peer_disconnect_later(ENetPeer.getCPtr(arg0), arg0, arg1);
  }

  public static void enet_peer_throttle_configure(ENetPeer arg0, long arg1, long arg2, long arg3) {
    enetJNI.enet_peer_throttle_configure(ENetPeer.getCPtr(arg0), arg0, arg1, arg2, arg3);
  }

  public static int enet_peer_throttle(ENetPeer arg0, long arg1) {
    return enetJNI.enet_peer_throttle(ENetPeer.getCPtr(arg0), arg0, arg1);
  }

  public static void enet_peer_reset_queues(ENetPeer arg0) {
    enetJNI.enet_peer_reset_queues(ENetPeer.getCPtr(arg0), arg0);
  }

  public static void enet_peer_setup_outgoing_command(ENetPeer arg0, ENetOutgoingCommand arg1) {
    enetJNI.enet_peer_setup_outgoing_command(ENetPeer.getCPtr(arg0), arg0, ENetOutgoingCommand.getCPtr(arg1), arg1);
  }

  public static ENetOutgoingCommand enet_peer_queue_outgoing_command(ENetPeer arg0, ENetProtocol arg1, ENetPacket arg2, long arg3, int arg4) {
    long cPtr = enetJNI.enet_peer_queue_outgoing_command(ENetPeer.getCPtr(arg0), arg0, ENetProtocol.getCPtr(arg1), arg1, ENetPacket.getCPtr(arg2), arg2, arg3, arg4);
    return (cPtr == 0) ? null : new ENetOutgoingCommand(cPtr, false);
  }

  public static ENetIncomingCommand enet_peer_queue_incoming_command(ENetPeer arg0, ENetProtocol arg1, byte[] arg2, long arg3, long arg4) {
    long cPtr = enetJNI.enet_peer_queue_incoming_command(ENetPeer.getCPtr(arg0), arg0, ENetProtocol.getCPtr(arg1), arg1, arg2, arg3, arg4);
    return (cPtr == 0) ? null : new ENetIncomingCommand(cPtr, false);
  }

  public static ENetAcknowledgement enet_peer_queue_acknowledgement(ENetPeer arg0, ENetProtocol arg1, int arg2) {
    long cPtr = enetJNI.enet_peer_queue_acknowledgement(ENetPeer.getCPtr(arg0), arg0, ENetProtocol.getCPtr(arg1), arg1, arg2);
    return (cPtr == 0) ? null : new ENetAcknowledgement(cPtr, false);
  }

  public static void enet_peer_dispatch_incoming_unreliable_commands(ENetPeer arg0, ENetChannel arg1) {
    enetJNI.enet_peer_dispatch_incoming_unreliable_commands(ENetPeer.getCPtr(arg0), arg0, ENetChannel.getCPtr(arg1), arg1);
  }

  public static void enet_peer_dispatch_incoming_reliable_commands(ENetPeer arg0, ENetChannel arg1) {
    enetJNI.enet_peer_dispatch_incoming_reliable_commands(ENetPeer.getCPtr(arg0), arg0, ENetChannel.getCPtr(arg1), arg1);
  }

  public static void enet_peer_on_connect(ENetPeer arg0) {
    enetJNI.enet_peer_on_connect(ENetPeer.getCPtr(arg0), arg0);
  }

  public static void enet_peer_on_disconnect(ENetPeer arg0) {
    enetJNI.enet_peer_on_disconnect(ENetPeer.getCPtr(arg0), arg0);
  }

  public static SWIGTYPE_p_void enet_range_coder_create() {
    long cPtr = enetJNI.enet_range_coder_create();
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static void enet_range_coder_destroy(SWIGTYPE_p_void arg0) {
    enetJNI.enet_range_coder_destroy(SWIGTYPE_p_void.getCPtr(arg0));
  }

  public static long enet_range_coder_compress(SWIGTYPE_p_void arg0, ENetBuffer arg1, long arg2, long arg3, SWIGTYPE_p_unsigned_char arg4, long arg5) {
    return enetJNI.enet_range_coder_compress(SWIGTYPE_p_void.getCPtr(arg0), ENetBuffer.getCPtr(arg1), arg1, arg2, arg3, SWIGTYPE_p_unsigned_char.getCPtr(arg4), arg5);
  }

  public static long enet_range_coder_decompress(SWIGTYPE_p_void arg0, SWIGTYPE_p_unsigned_char arg1, long arg2, SWIGTYPE_p_unsigned_char arg3, long arg4) {
    return enetJNI.enet_range_coder_decompress(SWIGTYPE_p_void.getCPtr(arg0), SWIGTYPE_p_unsigned_char.getCPtr(arg1), arg2, SWIGTYPE_p_unsigned_char.getCPtr(arg3), arg4);
  }

  public static long enet_protocol_command_size(short arg0) {
    return enetJNI.enet_protocol_command_size(arg0);
  }

}