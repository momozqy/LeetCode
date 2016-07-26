package com.xiaoyu.swapnodes;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x){val = x;};
}
public class Swap_Nodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = null;
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four  = new ListNode(4);
		head.next = two;
		two.next = three;
		three.next =  four;
		four.next = null;
		head = new Swap_Nodes().swapPairs(head);
	}
	 public ListNode swapPairs(ListNode head) {
		 ListNode newhead;
		 ListNode next = head.next;
		 if(next==null||head==null)
			 return head;
		 ListNode tmp  = next.next;
		 head.next = tmp;
		 next.next = head;
		 newhead = next;
		 while(head.next!=null){
			 ListNode top = head;
			 head = head.next;
			 next = head.next;
			 if(next!=null){
				 tmp = next.next;
				 head.next = tmp;
				 next.next = head;
				 top.next = next;
				 }
			 }
		 return newhead;
	 }
}
