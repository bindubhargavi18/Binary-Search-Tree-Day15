package com.binary;
public class BinaryTree 
{
	public static void main(String[] args) 
	{
		BinarySearch<Integer> bst=new BinarySearch<>();
		bst.add(56);
		bst.add(30);
		bst.add(22);
		bst.add(40);
		bst.add(60);
		bst.add(95);
		bst.add(11);
		bst.add(65);
		bst.add(3);
		bst.add(16);
		bst.add(63);
		System.out.println("Size of tree: "+bst.size() );
	}
}
