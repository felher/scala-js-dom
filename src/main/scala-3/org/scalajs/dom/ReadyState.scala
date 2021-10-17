package org.scalajs.dom

opaque type ReadyState <: String = String

object ReadyState {
  val closed: ReadyState = "closed"
  val ended: ReadyState = "ended"
  val open: ReadyState = "open"
}
