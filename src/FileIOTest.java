package com.ssc.java;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class FileIOTest {
	
	public static void main(String[] args) throws IOException {
		RandomAccessFile out = new RandomAccessFile("D:/Ran.test","rw");
		out.writeBytes("Hello");
	System.out.println("IO Operation Completed");	

	}

}
