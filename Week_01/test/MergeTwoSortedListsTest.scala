import org.scalatest.funsuite.AnyFunSuite

class MergeTwoSortedListsTest extends AnyFunSuite {

  test("testExample1") {
    val l1 = ListNode(1, ListNode(2, ListNode(4, null)))
    val l2 = ListNode(1, ListNode(3, ListNode(4, null)))

    assert(MergeTwoSortedLists.mergeTwoLists(l1, l2) ==
      ListNode(1, ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(4, null)))))))
  }
}
