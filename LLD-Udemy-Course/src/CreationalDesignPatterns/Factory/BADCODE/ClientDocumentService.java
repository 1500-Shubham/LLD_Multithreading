package CreationalDesignPatterns.Factory.BADCODE;

public class ClientDocumentService {

    public static void main(String[] args) {
        Document pdf = new PDF();
        Document word = new Word();
        pdf.read();
        word.read();

//        Single responsibility violate -> CLient creating object
//        Open close violate as client code modifies
    }
}
