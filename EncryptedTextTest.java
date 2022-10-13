package com.test.bll;

public class EncryptedTextTest {

	public static void main(String[] args) {
		//created object that represents a text encrypted 
				EncryptedText e = new EncryptedText("123@driven78", 10);
				
				System.out.println("\nENCODE : "+e.getEncryptedText());//encrypted data
				System.out.println("\nDECODE :"+e.getDecryptedText(10));//decrypted data
				

	}

}
