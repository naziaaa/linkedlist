public class Main {
Node head;
static class Node{
int data;
Node next;
Node(int d){
this.data=d;
next=null;
}
}
public void show_all()
{
Node n=head;
while(n!=null)
{
System.out.println(n.data+" ");
n=n.next;
}
}
public static void main(String args[]){
Main llist = new Main();
llist.head=new Node(1); 
Node second=new Node(2);
Node third=new Node(3);
Node fourth=new Node(4);
Node fifth=new Node(5);
Node sixth=new Node(6);
Node seventh=new Node(7); 
Node eighth=new Node(8);
Node ninth=new Node(9);
Node tenth=new Node(10);
llist.head.next=second;
second.next=third;
third.next=fourth;
fourth.next=fifth;
fifth.next=sixth;
sixth.next=seventh;
seventh.next=eighth;
eighth.next=ninth;
ninth.next=tenth;
llist.show_all(); 


}

}

