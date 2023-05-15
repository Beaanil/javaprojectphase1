package com;

import java.io.File;
import java.util.*;

//import com.fileoperationpack.ArrayList;
//import com.fileoperationpack.FileWriter;
//import com.fileoperationpack.IOException;
//import com.fileoperationpack.List;
//import com.fileoperationpack.String;

public class fileoperation {

String path = "/home/anil/Documents/assignment/";
	
	public void viewAllFiles() {
		int j = 1;
		File fp = new File(path);
		System.out.println("<--Files present in the directory in ascending directory-->");
		
		System.out.println("---------------------");
		File a[] = fp.listFiles();
		List<String> fileNames = new ArrayList<String>();
		
		for(int i = 0;i < a.length;i++) {
			fileNames.add(a[i].getName());
		}
		Collections.sort(fileNames);
		for(String s:fileNames) {
			System.out.println(j+")"+s);
			j++;
		}
		System.out.println("---------------------");
		System.out.println();
	}
	
	public void addNewFile(String fileName, String content) throws java.io.IOException {
		File fp = new File(path+fileName);
		
		if(fp.exists()) {
			System.out.println("File Already exists!");
		}else if(fp.createNewFile()) {
			System.out.println("File Created Successfully!");
		}else {
			System.out.println("File Not Created!");
			return;
		}
		java.io.FileWriter out = new java.io.FileWriter(fp,true);
		out.write(content);
		out.close();
		System.out.println("Content is Written to the file successfully!");
		System.out.println("-----------------------------------------\n");
	}
	
	public void deleteFile(String fileName) {
		File fp = new File(path+fileName);
		
		if(fp.exists()) {
			if(fp.delete()) {
				System.out.println("File Deleted successfully!");
			}else {
				System.out.println("File Not Deleted!");
			}
		}else {
			System.out.println("File does not exist to delete!");
		}
		System.out.println("-----------------------------------------\n");
	}
	
	public void searchFile(String fileName) {
		File fp = new File(path+fileName);
		if(fp.exists()) {
			System.out.println(fileName+" Exists at "+fp.getPath());
		}else {
			System.out.println(fileName+" Does not exists!");
		}
		System.out.println("-----------------------------------------\n");
	}
}
		
		
	
	

	
