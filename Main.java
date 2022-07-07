class Main {
  public static void main(String[] args) {
    Fila lf = new Fila();
    Pilha lp = new Pilha();
    Contato c1 = new Contato("Gabriel", "19987");
    Contato c2 = new Contato("Joao", "1998");
    Contato c3 = new Contato("Fabio", "19999");
    Contato c4 = new Contato("Pamela", "43564");
    Contato c5 = new Contato("Carlos", "145478");
    Contato c6 = new Contato("Paulo", "1999911321");
    lf.removeFila();
    lf.insereFila(c4);
    lf.insereFila(c2);
    lf.insereFila(c3);
    lf.insereFila(c1);
    lf.imprimeFila();
    lf.removeFila();
    lf.imprimeFila();



    lp.inserePilha(c4);
    lp.inserePilha(c2);
    lp.inserePilha(c3);
    lp.inserePilha(c1);
    lp.imprimePilha();
    lp.removePilha();
    lp.imprimePilha();
    
  }
}
