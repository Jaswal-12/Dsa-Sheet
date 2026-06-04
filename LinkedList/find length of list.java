int count=0;

Node temp=head;
while(temp!=null){
count++;
  temp=temp.next;
}

return count;
