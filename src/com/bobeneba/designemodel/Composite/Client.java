package com.bobeneba.designemodel.Composite;

import java.util.Iterator;
import java.util.Vector;

public class Client {
	private static final String INDENT_CHAR = "\t";
	
	public static void main(String[] args){
		new Client().test();
	}
	
	public void test(){
		
		Folder root = new Folder("树根");
		
		Folder b1_1= new Folder("1_枝——1");
		
		Folder b1_2 = new Folder("1_枝——2");
		Folder b1_3 = new Folder("1_枝——3");
		
		File l1_1 = new File("1_页1");
		File l1_2 = new File("1_页2");
		File l1_3 = new File("1_页3");
		// b1_2 下文件及文件名字
		Folder b2_1 = new  Folder("2_枝——1");
		Folder b2_2 = new  Folder("2_枝——2");
		File l2_1 = new File("1_页3");
		
		root.add(b1_1);
		root.add(b1_2);
		root.add(l1_1);
		root.add(l1_2);
		
		b1_2.add(b2_1);
		b1_2.add(b2_2);
		b1_2.add(l2_1);
        
		outTree(root);
	}
	public void outTree(Folder folder){
		System.out.println(folder.getName());
		iterateTree(folder);
	}
	public void iterateTree(Folder folder){
		Vector<IFile> clist = folder.getAllComponent();
		for(Iterator<IFile> it = clist.iterator();it.hasNext();){
			IFile em = it.next();
			if(em instanceof Folder){
				Folder cm = (Folder) em;
				System.out.println(cm.getName());
				iterateTree(cm);
			}else{
				System.out.println(((File)em).getName());
			}
			
		}
	}
	
}
