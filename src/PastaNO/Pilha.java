package PastaNO;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha; // Na hora que do push guardo minha referencia de topo
        refNoEntradaPilha = novoNo;         // Pego referencia de topo vou setala como novo no
        refNoEntradaPilha.setRefNo(refAuxiliar);// Minha referencia de no é minha antiga referencia de topo
    }

    public No pop() {
        if (!this.isEmpty()) {  // Se a minha pilha não estiver fazia eu guardo no
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return refNoEntradaPilha;
    }

    // retorna referencia pilha no topo
    public No top(){
        return refNoEntradaPilha;
    }
   // verifica se referencia entrada da pilha está nula ou não
    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){

        String stringRetorno = "---------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "---------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += " [NO{dado=" + noAuxiliar.getDado() + "}]\n ";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno +="===============\n";
        return stringRetorno;
    }




}
