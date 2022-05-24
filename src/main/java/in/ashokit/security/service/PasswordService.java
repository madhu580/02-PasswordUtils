package in.ashokit.security.service;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {

	public String encrypt(String text) {
		Encoder encoder = Base64.getEncoder();
		String encodedString = encoder.encodeToString(text.getBytes());
		return encodedString;
	}

	public String decrypt(String encryptedText) {

		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encryptedText);
		return new String(decode);
	}
}
