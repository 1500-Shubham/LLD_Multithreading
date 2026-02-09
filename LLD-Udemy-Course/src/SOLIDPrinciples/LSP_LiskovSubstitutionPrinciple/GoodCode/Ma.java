package SOLIDPrinciples.LSP_LiskovSubstitutionPrinciple.GoodCode;

public class Ma {
    public static void main(String[] args) {
        Readable readfile=  new ReadOnlyFile();
        readfile.read();

        WriteFile writefile = new WriteFile();
        writefile.write();
        writefile.read();
    }
}
