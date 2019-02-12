package com.algorithms.linkedlist;


public class RunnerTechnique {

/*
    Rearrange a1->a2->a3->a4->a5->b1->b2->b3->b4->b5
    to        a1->b1->a2->b2->a3->b3->a4->b4->a5->b5

*/
    public void rearrange(LinkedList<String> list){

        Node<String> slow = list.head;
        Node<String> fast = list.head;


        /*
		 * After this loop slow pointer will be in the middle and fast pointer will point to the head
		 *
		 *
		 */
        while(slow != null && fast != null && fast.next != null){

            if(fast.next.next == null){ // because this type of list size is even always
                fast = list.head;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }


        while(slow != null && fast != null && slow.next != null && fast.next != null){

            Node<String> temp = slow.next;
            slow.next = slow.next.next;

            temp.next = fast.next;
            fast.next = temp;

            fast = fast.next.next;

        }


    }


}
