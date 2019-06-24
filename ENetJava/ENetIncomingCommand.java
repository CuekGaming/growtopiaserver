/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ENetJava;

public class ENetIncomingCommand {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ENetIncomingCommand(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ENetIncomingCommand obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        enetJNI.delete_ENetIncomingCommand(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIncomingCommandList(ENetListNode value) {
    enetJNI.ENetIncomingCommand_incomingCommandList_set(swigCPtr, this, ENetListNode.getCPtr(value), value);
  }

  public ENetListNode getIncomingCommandList() {
    long cPtr = enetJNI.ENetIncomingCommand_incomingCommandList_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ENetListNode(cPtr, false);
  }

  public void setReliableSequenceNumber(int value) {
    enetJNI.ENetIncomingCommand_reliableSequenceNumber_set(swigCPtr, this, value);
  }

  public int getReliableSequenceNumber() {
    return enetJNI.ENetIncomingCommand_reliableSequenceNumber_get(swigCPtr, this);
  }

  public void setUnreliableSequenceNumber(int value) {
    enetJNI.ENetIncomingCommand_unreliableSequenceNumber_set(swigCPtr, this, value);
  }

  public int getUnreliableSequenceNumber() {
    return enetJNI.ENetIncomingCommand_unreliableSequenceNumber_get(swigCPtr, this);
  }

  public void setCommand(ENetProtocol value) {
    enetJNI.ENetIncomingCommand_command_set(swigCPtr, this, ENetProtocol.getCPtr(value), value);
  }

  public ENetProtocol getCommand() {
    long cPtr = enetJNI.ENetIncomingCommand_command_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ENetProtocol(cPtr, false);
  }

  public void setFragmentCount(long value) {
    enetJNI.ENetIncomingCommand_fragmentCount_set(swigCPtr, this, value);
  }

  public long getFragmentCount() {
    return enetJNI.ENetIncomingCommand_fragmentCount_get(swigCPtr, this);
  }

  public void setFragmentsRemaining(long value) {
    enetJNI.ENetIncomingCommand_fragmentsRemaining_set(swigCPtr, this, value);
  }

  public long getFragmentsRemaining() {
    return enetJNI.ENetIncomingCommand_fragmentsRemaining_get(swigCPtr, this);
  }

  public void setFragments(SWIGTYPE_p_unsigned_int value) {
    enetJNI.ENetIncomingCommand_fragments_set(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_int getFragments() {
    long cPtr = enetJNI.ENetIncomingCommand_fragments_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_int(cPtr, false);
  }

  public void setPacket(ENetPacket value) {
    enetJNI.ENetIncomingCommand_packet_set(swigCPtr, this, ENetPacket.getCPtr(value), value);
  }

  public ENetPacket getPacket() {
    long cPtr = enetJNI.ENetIncomingCommand_packet_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ENetPacket(cPtr, false);
  }

  public ENetIncomingCommand() {
    this(enetJNI.new_ENetIncomingCommand(), true);
  }

}