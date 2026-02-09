package SOLIDPrinciples.LSP_LiskovSubstitutionPrinciple.BADCode;

public class ReadFile implements File{
    @Override
    public void read() {
        System.out.println("Reading File successfully");
    }

    @Override
    public void write() {
        throw new RuntimeException("Write not allowed for Read File");
    }
}
