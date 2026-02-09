package SOLIDPrinciples.LSP_LiskovSubstitutionPrinciple.BADCode;

public class Main {
    public static void main(String[] args) {
        File readfile = new ReadFile();
        readfile.read(); // Sout
        readfile.write(); //throws errors
    }

//   Violates LSP since ReadFile cant be subsitute with File superclass
// forced to use write method because of superclass
}
