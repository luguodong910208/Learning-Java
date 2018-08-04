package easy;

public class Link {

	class Node{
		private String data;
		private Node next;
		private Node(String data) {
			this.data = data;
		}
		
		public void add(Node newNode) {
			//�ж��¸��ڵ��Ƿ�Ϊ�գ����Ϊ�գ���ô�½ڵ�������nextλ���ϣ������Ϊ�գ�������һ��λ�ô����ӽڵ�
			if(this.next == null) {
				this.next = newNode;
			}else {
				this.next.add(newNode);
			}
		}
		
		public void print() {
			System.out.print(this.data+"\t");
			if(this.next != null) {
				this.next.print();//�����һ���ڵ�
			}
		}
		public boolean search(String data) {
			//�жϵ�ǰ�ڵ�������Ƿ�Ͳ��ҵ�һ�£����һ�£�����true����������ж���һ���ڵ㣬ֱ���ҵ�������Ҳ���������false
			if(data.equals(this.data)) {
				return true;
			}else {
				if(this.next != null) {
					return this.next.search(data);
				}else {
					return false;
				}
			}
		}
		
		public void delete(Node previous, String data) {
			//ɾ���ڵ㣬����ҵ���ƥ��ڵ㣬��ô�ճ���ǰ�ڵ㣬�������������
			if(data.equals(this.data)) {
				previous.next = this.next;
			}else {
				if(this.next != null) {
					this.next.delete(this, data);
				}
			}
		}
	}
	
	private Node root;//��ʾ���ڵ�
	public void addNode(String data) {
		//�����µĽڵ㣬���û�и��ڵ㣬����һ���ڵ�����Ϊ���ڵ㣬��������ں���λ��
		Node newNode = new Node(data);
		if(this.root == null) {
			this.root = newNode;
		}else {
			this.root.add(newNode);
		}
	}
	
	public void printNode() {
		if(this.root != null) {
			this.root.print();
		}
	}
	
	public boolean contains(String name) {
		//�ж��Ƿ����ĳԪ��   
		return this.root.search(name);
	}
	
	public void deleteNode(String data) {
		if(this.contains(data)) {
			if(this.root.data.equals(data)) {
				this.root = this.root.next;
			}else {
				this.root.next.delete(root, data);
			}
		}
	}
}
