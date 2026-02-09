package CreationalDesignPatterns.Factory.GOODCODE;

import CreationalDesignPatterns.Factory.BADCODE.Document;
import CreationalDesignPatterns.Factory.BADCODE.PDF;
import CreationalDesignPatterns.Factory.BADCODE.Word;

public class ClientDocumentService {

    public static void main(String[] args) {

        Document docs = DocumentFactory.getDocument("PDF");
        docs.read();
//        Open close violation -> no more code added
    }
}
