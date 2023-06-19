package problemSolving.CF.A;
//package problemSolving;
//
//import java.io.ByteArrayInputStream;
//import java.io.InputStream;
//import java.math.BigDecimal;
//import java.net.URL;
//import java.security.KeyFactory;
//import java.security.PublicKey;
//import java.security.cert.Certificate;
//import java.security.cert.CertificateFactory;
//import java.security.interfaces.RSAPublicKey;
//import java.security.spec.X509EncodedKeySpec;
//import java.util.Base64;
//import java.util.Map;
//
//import com.auth0.jwk.Jwk;
//import com.auth0.jwk.JwkProvider;
//import com.auth0.jwk.UrlJwkProvider;
//import com.auth0.jwt.JWT;
//import com.auth0.jwt.JWTVerifier;
//import com.auth0.jwt.algorithms.Algorithm;
//import com.auth0.jwt.interfaces.Claim;
//import com.auth0.jwt.interfaces.DecodedJWT;
//import com.fasterxml.jackson.databind.util.JSONPObject;
//
//public class JWTVerify {
//
//	 public static boolean verifyToken(String token){
//			try {
//			 //  DecodedJWT jwt = JWT.decode(token);
//			
//			    Map<String, Claim> posClaims; 
//			   String publics="MIICnzCCAYcCBgF1jusYFDANBgkqhkiG9w0BAQsFADATMREwDwYDVQQDDAh2Zi1yZWFsbTAeFw0yMDExMDMxNjIxMTNaFw0zMDExMDMxNjIyNTNaMBMxETAPBgNVBAMMCHZmLXJlYWxtMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhWbkoo3ZPperTVODqsQuduS7K40szAKB2P+P0/HK3dKwBqXKKCM/KfBoO844L6ZL6nhevyJW7+jXhTf9AJVqOQECmysX2lxDRxmUGr2yFz8sMNcxDNnC9H2Zb/v2hvHpRVDnvU5tj6mPHciJdSBTTeV96efI7vRR9uBCitWJFvbEh+qDfG7qteMMV3BxVAycfyN8CeunlB0G4n47ABr/xLUYoHCSSHl42sgko6Ogr0mjjsn+TT4KtU2zuLXOBudnaCJgrYjSmmN7PpadqQsijJM+qoJLaM8YEwhkUdW2co1l3mAIcm6q0s6jz52mc2EqRf7RfVRKBCMz6tY8siApbwIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQB1EemBLAhtQEHaQqxt07S0HA3HEgYHIIQnwRz8/O1r9LdfYrwhBYPUKlx4cDI3WYPqNaMWjsJekRMrNhk+GLDdOqTDcsywU96awBcEogtHynVqhM1olbEB3vW+8TqKeHoSZI/mn8s4Qd7yPRwMvOMBJGNaBOCodOcMp8Y/fXZraYkhZkgvsy+o3hsoQ2+Ibhujs6B9VAzOgvVNRUJ/09JVrmn9Rx/pHxdKLIVurMX307QmT8ujvOwhsJQ1lgcKKuOvOJ14Gry4OHhHhv5GctDCCs902vS+LlgxfEbGwbvFbDFQLaY7Exd6L3ApRI2BU66T8DB5WfZPsEkq0fI3oFZB";
//				PublicKey key=getPublicKey(publics);
//			   Algorithm algorithm = Algorithm.RSA256((RSAPublicKey) key, null);
//			  // algorithm.verify(jwt);
//		
//			   JWTVerifier verifier = JWT.require(algorithm).build();
//			   DecodedJWT jwtt = verifier.verify(token);
//			   posClaims=jwtt.getClaims();
//			   posClaims.get("userInfo").toString();
//
//			   return true;
//			   }catch (Exception e) {
//				// TODO: handle exception
//				   e.printStackTrace();
//			}
//			return false;
//			}
//	 
//
//	 
//	 public static PublicKey getPublicKey(String publicKey)
//		{
//			try {
//		        byte[] encodedPublicKey = Base64.getDecoder().decode(publicKey);
//		        InputStream certstream = new ByteArrayInputStream (encodedPublicKey);
//		        Certificate cert = CertificateFactory.getInstance("X.509").generateCertificate(certstream);
//	
//		        PublicKey publicKeyValue = cert.getPublicKey();
//				return publicKeyValue;
//			} catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
//			return null;
//		}
//
//	 
//	 public static void main(String[] args) {
//		// String publics="MIICnzCCAYcCBgF0T40RkjANBgkqhkiG9w0BAQsFADATMREwDwYDVQQDDAh2Zi1yZWFsbTAeFw0yMDA5MDIxNTU5MzlaFw0zMDA5MDIxNjAxMTlaMBMxETAPBgNVBAMMCHZmLXJlYWxtMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgfjzpLeYImWSQ15KAxJUxW0AEkDRc0HoldbHAeGyZzzU+wAg1RuUeGusOZ+dipMRmvkpOY1g3rRnJasKvHoMYvlynwmKzkYWEU9uL/kuo93cta/3gvcSFDjlGbGP5ohSe0/bH6dytljgNMhif4tUM+GzsDaNCpKyQNkN/oDD7SV9VPBiSzapNywttqAnXJaL8O50dIpdOcqz2DaPhYgC7tI7w1e2bH0Y3e+ZIcbV3T6Op2j0EHrTE93E17ldjEChjwKGoTpa1CpQGCpnGSvd8LPoQidMcvDvtrtESKU0aChyurWOIgiGnYqnzrXLHjZCyU9Cr2TjOHhFuLaF/6zo6wIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQBpxRECfpvuzHHywnD0B9Z+ezBejRX5EoJCK5LYD1n+c1X5bv4GzYgf8UAxDD1Hf2yQVXiDVHrFLc7DEcJOx0Ai4TVmThc2xUxrJLpIO5Blvl3mWg4SHZe5Bx96oFC0Sas870QWZ4L+m5Y/5Fu/mLxRht/3CcUEH32UyxkwNitp1aTJjp4hXvADgq3V3pGfMTn5OQGSMg2qjO/V45m+4T1HSG3yK9GsUoI6kTnztG3T9HPauaqsgAU5Xtopmwc0wd04XvaKh1cbdixfk5+OPYA1fvxyo75qjz2iM+JS4nY4oyhdJTlGUtCh+2U1FhuWRrTRfN7JEjg54xcUxoQCiXwB";
//		//getPublicKey(publics);
//		String token="eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJ3MExBelJCbmVmVEswX21CWkxQd0NkMFFJRXZvX3BIT0tUUGM4OWlyTkdZIn0.eyJleHAiOjE2MjM2MjkyMDYsImlhdCI6MTYyMzYyNzU2OCwiYXV0aF90aW1lIjoxNjIzNjI3NDA2LCJqdGkiOiJiOGQ5OGE0MS0yMDM2LTQ5ZTUtOGI0Yi01NzAzNWM2MDY0N2YiLCJpc3MiOiJodHRwOi8vcWExLnZvZGFmb25lLmNvbS5lZy9hdXRoL3JlYWxtcy92Zi1yZWFsbSIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJmOmVkOWExOThkLWNmNjktNDk4Ni05ZDhkLWJkZjE0M2NlMjE5NToxMDY4ODg0OTgxIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZXNob3AiLCJub25jZSI6ImQ0YTU5MWEzLTdiNTktNDBkOS1iNzRkLTNmMWNhMjM1OTZlNyIsInNlc3Npb25fc3RhdGUiOiIyNzNjMDk1OC0xMTk0LTQzZTUtYWE4Yy00ZjU5YmMzZWRiMzYiLCJhY3IiOiIwIiwiYWxsb3dlZC1vcmlnaW5zIjpbImh0dHA6Ly9xYTEudm9kYWZvbmUuY29tLmVnIiwiaHR0cHM6Ly9xYTEudm9kYWZvbmUuY29tLmVnIiwiaHR0cDovLzEwLjIzMC44NS40NiIsIioiLCJodHRwczovLzEwLjIzMC44NS40NiJdLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOlsib2ZmbGluZV9hY2Nlc3MiLCJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoib3BlbmlkIHByb2ZpbGUgZW1haWwiLCJ1c2VySW5mbyI6eyJtc2lzZG4iOiIwMTA2ODg4NDk4MSIsImZpcnN0TmFtZSI6ItmBIiwibGFzdE5hbWUiOiLYpyIsImN1c3RvbWVySUQiOiI2MjI5OTkxMiIsImN1c3RvbWVyVHlwZSI6IlBSRVBBSUQiLCJjb250cmFjdFN1YlR5cGUiOiJGTEVYIiwiY29udHJhY3RJZCI6IjY1Mzc1MDUyIiwiaXNQYXltZW50UmVzcG9uc2libGVGbGFnIjoxLCJjb250cmFjdFR5cGUiOiJwcmVwYWlkIiwiYWNjb3VudE51bWJlciI6IjEuNzIxNDM3ODIiLCJjb250cmFjdFJvbGUiOiJPV05FUiIsInJhdGVQbGFuQ29kZSI6Njg5LCJlbmNyeXB0ZWRNc2lzZG4iOiI5SUlSRVVDUHdZOXFia1dsTlJSZ2N3PT0iLCJiaWxsQ3ljbGVEYXRlIjoiMTk5OC0xMC0yNFQwMDowMDowMCswMjowMCIsInNlcnZpY2VDbGFzc05hbWUiOiJDb250cm9sIEZsZXggNDAiLCJzZXJ2aWNlQ2xhc3NDb2RlIjo0MTksInRhcmlmZk1vZGVsTmFtZSI6IjE0UFRTIiwibGluZVR5cGUiOiJWb2ljZSIsImJpbGxDeWNsZUNvZGUiOiIwMyIsInByaWNlR3JvdXBUeXBlIjoiQ29uc3VtZXIiLCJjb250cmFjdFN0YXR1cyI6IkFDVElWRSIsInNlZ21lbnRWYWx1ZSI6Ik1lZC1IaWdoIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9PV05FUiIsIlJPTEVfVk9JQ0UiLCJST0xFX0NPTlNVTUVSIiwiUk9MRV9QUkVQQUlEIiwiUk9MRV9BTEwiLCJST0xFX0ZMRVgiXSwic3ViQWNjb3VudHMiOnt9LCJrZXkiOiJXK014ZlhCdjdiUnhRRTJsejVWWCtwOW1mNlRxcU9mbVh5WkdaSkJLaDYzTW1oRzdyRjVWYytsdVNHWktXRnJnekdZQXl2WUZ4YXluNkVRZFM3Y3lLUT09In0sImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwicHJlZmVycmVkX3VzZXJuYW1lIjoiMTA2ODg4NDk4MSIsImxvY2FsZSI6ImVuIiwiZW1haWwiOiJIYWxhQHZvZGEuY29tIn0.gMX2USyQ5CgXQWMTo0xeiwMeZNSeQ5cOHNcKFphP7-Q16SGUzODUwlaPYogJQpHQeQwHxOCAcAm6KQzktpnBn3GCtxX1WE64VzXj55FBUJjQkFFujN_NHkJhFpYhKFlJN0_DHI-ObW_yl0k4XgzPl3juijT7Nq5yanysxaB2IN5QQuPOpo9jbnbo3LtBFVWG7RMKxFcSRF6es8lIULRSv0VNPTGSTHY6A21-e14emjI87Elowz3Hh93F4bPIlJyO79jgsGOUBaRs3HcoJnqB9y537r9AygsTI2kzhQpDOUcu5842cRiiuMLFOvyRgTDnvIB2dCtauJ5hg1YMH5K9dQ";
//		verifyToken(token);
//		//System.out.println(Double.valueOf(1.2E1).intValue());
//	}
//}
