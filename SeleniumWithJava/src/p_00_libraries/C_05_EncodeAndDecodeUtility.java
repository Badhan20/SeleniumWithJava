package p_00_libraries;

import java.util.Base64;

public class C_05_EncodeAndDecodeUtility{

	public static String encodePassword(String password) {


		byte[] encodedBytes = Base64.getEncoder().encode(password.getBytes());

		String encodedString = new String(encodedBytes);

		return(encodedString);
	}


	public static String decodePassword(String password) {


		byte[] decodeBytes = Base64.getDecoder().decode(password.getBytes());

		String decodedString = new String(decodeBytes);

		return(decodedString);
	}

}
