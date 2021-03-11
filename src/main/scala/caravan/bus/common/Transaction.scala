package caravan.bus.common
import chisel3._

/**
 * This abstract class provides a template for other protocols to implement the transaction wires.
 * This is used as a template for e.g when the core wants to communicate with the memory or with the peripheral registers.
 * It will set these signals up in order to talk to the Host adapter of the relevant bus protocol
 */
abstract class FromIp extends Bundle {
//  val validRequest: Bool
  val addrRequest: UInt
  val dataRequest: UInt
  val activeByteLane: UInt
  val isWrite: Bool
//  val validResponse: Bool
//  val dataResponse: UInt
}

abstract class FromBus extends Bundle {
  val dataResponse: UInt
  val ackWrite: Bool
}
