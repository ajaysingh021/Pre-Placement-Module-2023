class MyLinkedList {
	static class ListNode  {
		public int data;
		public ListNode next;

		public ListNode( int data ) {
			this.data = data;
		}

		public ListNode( int data, ListNode next ) {
			this.data = data;
			this.next = next;
		}
	}

	public ListNode head;
	public ListNode tail;
	public int size;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		return this.head == null;
	}

	public ListNode findNodeByIndex( int index ) {
		if( index < 0 || index > this.size || this.isEmpty() ) {
			return null;
		}

		ListNode currentNode = this.head;
		for( int i = 0; i < index && currentNode != null; i++ ) {
			currentNode = currentNode.next;
		}

		return currentNode;
	}

	public int get( int index ) {
		if( this.isEmpty() ) {
			return -1;
		}

		ListNode searchedNode = this.findNodeByIndex( index );
		return ( searchedNode != null ? searchedNode.data : -1 );
	}

	public void addAtHead( int data ) {
		this.head = new ListNode( data, this.head );

		if( this.tail == null ) {
			this.tail = this.head;
		}
		this.size++;
	}

	public void addAtTail( int data ) {
		ListNode newNode = new ListNode( data );
		if( this.isEmpty() ) {
			this.head = this.tail = newNode;
		} else {
			this.tail.next = newNode;
			this.tail = this.tail.next;
		}
		this.size++;
	}

	public void addAtIndex( int index, int data ) {
		if( index < 0 || index > this.size ) {
			return;
		}

		if( index == 0 ) {
			this.addAtHead( data );
			return;
		}

		if( index == this.size ) {
			this.addAtTail( data );
			return;
		}

		ListNode searchedNode = this.findNodeByIndex( index - 1 );
		ListNode newNode = new ListNode( data, searchedNode.next );
		searchedNode.next = newNode;
		this.size++;
	}

	public void deleteAtIndex( int index ) {
		if( index < 0 || index > this.size - 1 || this.isEmpty() ) {
			return;
		}

		if( index == 0 ) {
			this.head = this.head.next;
		} else {
			ListNode searchedNode = this.findNodeByIndex( index - 1 );
			if( searchedNode.next == this.tail ) {
				this.tail = searchedNode;
				this.tail.next = null;
			} else {
				searchedNode.next = searchedNode.next.next;
			}
		}

		this.size--;
	}
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */