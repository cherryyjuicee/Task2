package com.company;

public class LinkList {
    private ListElements head;
    private ListElements tail;
    private int size;

    public LinkList(){
        head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void add(String data){
        ListElements temp = new ListElements(data);
        temp.next = head;
        head = temp;
        size++;
    }
    public void print(){
        ListElements temp = head;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void removeDup() {
        ListElements curr = head;
        ListElements temp;
        ListElements d;
        while (curr != null) {
            temp = curr;
            while (temp.next != null) {
                if (curr.data.equals(temp.next.data)) {
                    d = temp.next;
                    temp.next = d.next;
                    size--;
                } else
                    temp = temp.next;
            }
            curr = curr.next;
        }
    }
}

