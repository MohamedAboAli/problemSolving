package problemSolving.CF.A;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class ExtractDataFromPDF {

	public static void main(String[] args) throws IOException, SAXException, TikaException {
		BodyContentHandler contenthandler = new BodyContentHandler();

		// Create a file in local directory
		File f = new File("C:/Users/aboalim2/Downloads/A-5257.pdf");
		// Create a file input stream
		// on specified path with the created file
		FileInputStream fstream = new FileInputStream(f);

		// Create an object of type Metadata to use
		Metadata data = new Metadata();

		// Create a context parser for the pdf document
		ParseContext context = new ParseContext();

		// PDF document can be parsed using the PDFparser
		// class
		PDFParser pdfparser = new PDFParser();

		// Method parse invoked on PDFParser class
		pdfparser.parse(fstream, contenthandler, data, context);

		// Printing the contents of the pdf document
		// using toString() method in java
		System.out.println("Extracting contents :" + contenthandler.toString());
	}

}
