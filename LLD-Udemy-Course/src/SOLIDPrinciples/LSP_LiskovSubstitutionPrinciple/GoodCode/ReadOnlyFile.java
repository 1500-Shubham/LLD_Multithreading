package SOLIDPrinciples.LSP_LiskovSubstitutionPrinciple.GoodCode;

public class ReadOnlyFile implements Readable{
    @Override
    public void read() {
        System.out.println("Reading File");
    }
}
