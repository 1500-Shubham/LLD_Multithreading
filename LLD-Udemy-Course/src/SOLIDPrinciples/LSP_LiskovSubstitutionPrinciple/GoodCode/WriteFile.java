package SOLIDPrinciples.LSP_LiskovSubstitutionPrinciple.GoodCode;

public class WriteFile extends ReadOnlyFile implements Writable{

   // it has both read and write

    @Override
    public void write() {
        System.out.println("Writing to file....");
    }
}
