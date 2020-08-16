// LC 641
class MyCircularDeque(var size: Int,
                      k: Int,
                      head: DoubleListNode,
                      tail: DoubleListNode
                     ) {

  def this(k: Int) = {
    this(0, k, new DoubleListNode(-1), new DoubleListNode(-1))
    head.prev = tail
    tail.next = head
  }

  def insertFront(value: Int): Boolean = {
    if (size == k) {
      return false
    }

    val node = new DoubleListNode(value)

    node.next = head
    node.prev = head.prev
    head.prev.next = node
    head.prev = node
    size += 1

    true
  }

  def insertLast(value: Int): Boolean = {
    if (size == k) {
      return false
    }

    val node = new DoubleListNode(value)

    node.next = tail.next
    tail.next.prev = node
    tail.next = node
    node.prev = tail
    size += 1

    true
  }

  def deleteFront(): Boolean = {
    if (size == 0) {
      return false
    }

    head.prev.prev.next = head
    head.prev = head.prev.prev
    size -= 1

    true
  }

  def deleteLast(): Boolean = {
    if (size == 0) {
      return false
    }

    tail.next.next.prev = tail
    tail.next = tail.next.next
    size -= 1

    true
  }

  def getFront: Int = head.prev.value

  def getRear: Int = tail.next.value

  def isEmpty: Boolean = size == k
}

case class DoubleListNode(var value: Int, var prev: DoubleListNode, var next: DoubleListNode) {
  def this(value: Int) = this(value, null, null)
}
