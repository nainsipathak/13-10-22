package com.test.bll;

public class EncryptedText {
	//representation of the objects of the class 
		private int key;
		private String text;
		
		
		//creation of a new object that represents a text encrypted with a given encryption key 
		
		public EncryptedText(String text) {
			
			key=0;
			this.text =text;
		}
		
		//creation of new object that represents a text that is not encrypted(yet)
		public EncryptedText(String text, int key) {
			
			this.key = key;
			this.text = encode(text,key);
		}
		
		
		public String getEncryptedText() {
			return text;
		}
		
		
		public String getDecryptedText(int key) {
			
			if(key == this.key)
				
				return decode(this.text,key);
			else
				return null;
		}
		
		//Check the candidate key
		public boolean isKey(int candidateKey) {
			return candidateKey == key;
		}
		
		//modification of the encryption key
		public void setKey(int key , int newKey) {
			if(key == this.key) {
				this.key = newKey;
				text = encode(decode(text,key) , newKey);
			}
		}
		
		
		//encode method
		private static String encode(String text, int key) {
			
			String resText = "";
			char c;
			int ci;
			for(int i=0;i<text.length();i++) {
				c  = text.charAt(i);
				ci = (int)c;
				ci = ci +key;
				c = (char)ci;
				resText =resText + String.valueOf(c);
			}
			return resText;
		}
		
		//decode method
		private static String decode(String text, int key) {
			String resText = "";
			char c;
			int ci;
			for(int i=0;i<text.length();i++) {
				c  = text.charAt(i);
				ci = (int)c;
				ci = ci - key;
				c = (char)ci;
				resText =resText + String.valueOf(c);
			}
			return resText;

		}
}