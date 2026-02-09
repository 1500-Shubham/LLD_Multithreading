package CreationalDesignPatterns.Factory.GOODCODE;

import CreationalDesignPatterns.Factory.BADCODE.Document;
import CreationalDesignPatterns.Factory.BADCODE.PDF;
import CreationalDesignPatterns.Factory.BADCODE.Word;

public class DocumentFactory {

    public  static Document getDocument(String type){
        switch (type){
            case "PDF":
                return  new PDF();
            case "WORD":
                return new Word();
            default:
                throw new RuntimeException("Unknwn Type");
        }
//        Single reponsibilty -> Factory class creating objects only


    }
}
