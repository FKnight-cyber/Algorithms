package Exercise3;

public class Student {
    public String name;
    public int nota1;
    public int nota2;
    public int nota3;

    public int notaFinal(){
        return this.nota1 + this.nota2 + this.nota3;
    }

    public boolean approved(){
        if(this.notaFinal() < 60) {
            return false;
        }
        return true;
    }
}
