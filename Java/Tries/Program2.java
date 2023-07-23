// Word break Problem ---------> Google Interview Question

class Trie {
	static class Node {
		Node[] children;
		boolean eow;
	
		Node() {
			children = new Node[26];//a-z
			for(int i=0;i<26;i++) {
				children[i] = null;
			}
			eow = false;
		}
	}
	static Node root = new Node();

	public static boolean Search(String key) {
		Node curr = root;	
		for(int i = 0;i<key.length();i++) {	//TC = O(L) where L = key length
			int idx = key.charAt(i) - 'a';
			Node node = curr.children[idx];
			if(node == null) {
				return false;
			}
			if(i == key.length() - 1) {
				if(!node.eow == true) {
					return false;
				}
			}
			curr = curr.children[idx];
		}return true;
	}	
	public static void insert(String word) {
		Node curr = root;		
		for(int i=0;i<word.length();i++) {
			int idx = word.charAt(i) - 'a';
			if(curr.children[idx] == null) {
				//add new node
				curr.children[idx] = new Node();
			}
			if(i==word.length()-1) {
				curr.children[idx].eow = true;
			}
			curr = curr.children[idx];
		}
	}

	public static boolean WordBreak(String key) {

		if(key.length() == 0) {
			return true;
		}
		for(int i=1; i<= key.length(); i++) {
			
			String firstPart = key.substring(0,i);
			String secondPart = key.substring(i);
			if(Search(firstPart) && WordBreak(secondPart)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String words[] = {"i", "like" , "sam" , "samsung" , "mobile" , "ice"};
		for(int i = 0; i < words.length; i++) {
			insert(words[i]);
		}
		String word = "ilikesamsung";
		System.out.println(WordBreak(word));//true
		System.out.println(WordBreak("sung"));//false
		System.out.println(WordBreak("ilikesam"));//true
	}
}

