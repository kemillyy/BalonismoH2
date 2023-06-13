public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nomePessoa = "Eduarda";
        p1.cpfPessoa = "59845692525";
        p1.endereco = "Rua assunção 588";
        p1.rg = "5879624-x";
        p1.telefoneFamiliar = "(11)9658243609";

        p2.nomePessoa = "Stefan";
        p2.cpfPessoa = "54621252580";
        p2.endereco = "Rua atibaia 88";
        p2.rg = "2589310-x";
        p2.telefoneFamiliar = "(11)965663709";

        p1.assinarTermo();
        p2.assinarTermo();

        Piloto piloto = new Piloto();

        piloto.nomePiloto = "Cleiton";
        piloto.cpfPiloto = "45584699731";
        piloto.registroANAC = " 5583GD";

        piloto.pilotarBalao();

        Balao balao = new Balao();

        balao.identificacao = "3246KJ";
        balao.registroRegularidade = "223465Ok";

        balao.voar();

        p1.voouPasseio();
        p2.voouPasseio();
    }
}