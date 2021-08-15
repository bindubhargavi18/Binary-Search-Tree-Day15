package com.binary;

public class BinarySearch <T extends Comparable<T>>
{
	TreeNode<T> root;
	int size=0;
	BinarySearch()
	{
		this.root=null;
	}
	
	public void add(T data)
	{
		root=addElement(root,data);
		size++;
	}
	
	// Using recursion to add element into tree
	private TreeNode<T> addElement(TreeNode<T> root,T data)
	{
		if(root==null)
		{
			root=new TreeNode<T>(data);
			return root;
		}
		else if(data.compareTo(root.data)>0)
		{
			root.right=addElement(root.right,data);
		}
		else
		{
			root.left=addElement(root.left,data);
		}
		return root;
	}
	public int size()
	{
		return size;
	}

}
