public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE","JONAS","JULIA","MARCOS","JOCK'S"};

        /* for (int x=0;x < alunos.length;x++ ) {
            System.out.println("O aluno no indice X = "+x+" é "+ alunos[x]);
        } */
        for (String aluno : alunos) {
            System.out.println("O aluno no indice é "+ aluno); 
        }
    }
    
}
