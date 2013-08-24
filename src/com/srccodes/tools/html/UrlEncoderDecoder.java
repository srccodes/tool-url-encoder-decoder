package com.srccodes.tools.html;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
* @author Abhijit Ghosh
* @version 1.0
*/
public class UrlEncoderDecoder {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "Test Encode Decode example";
        String ecodedStr = URLEncoder.encode(str, "UTF-8");
        System.out.println(str + " ==> " + ecodedStr);
        
        String decodedStr = URLDecoder.decode(ecodedStr, "UTF-8");
        System.out.println(ecodedStr + " ==> " + decodedStr);
	}
}
